package JAVA.Total_Exercises;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numGeneral = 0, i = 0, j = 0, temp = 0, top = 0;
        double dec = 0.0;
        String textoGeneral = "", str = "";
        int[] vectorGeneral = null, stackGeneral = null;

        System.out.println("Seleccione el ejercicio a resolver (1-15): ");
        numGeneral = sc.nextInt();

        switch(numGeneral) {
            case 1:
        System.out.print("Ingrese el valor de f(n): ");
        double f_n = sc.nextDouble();

        System.out.print("Ingrese el valor de g(n): ");
        double g_n = sc.nextDouble();

        System.out.print("Ingrese el valor de h(n): ");
        double h_n = sc.nextDouble();

        if (f_n >= g_n && g_n >= 0) {
            double diferencia = f_n - g_n;
            System.out.println("El resultado de f(n) - g(n) es: " + diferencia);
            if (diferencia / h_n > 0) {
                System.out.println("El orden de f(n) - g(n) es proporcional a h(n).");
            } else {
                System.out.println("El orden de f(n) - g(n) podría ser menor que h(n).");
            }
        } else {
            System.out.println("Los valores ingresados no cumplen con f(n) ≥ g(n) ≥ 0.");
        }
                break;
            case 2:
                System.out.println("\nEjercicio 2: Comparación de logaritmos con bases distintas");
                System.out.print("Ingrese un valor para n: ");
                numGeneral = sc.nextInt();
                System.out.print("Ingrese la base a (>1): ");
                temp = sc.nextInt();
                System.out.print("Ingrese la base b (>1): ");
                i = sc.nextInt();
                double logA = Math.log(numGeneral) / Math.log(temp);
                double logB = Math.log(numGeneral) / Math.log(i);
                System.out.println("log_" + temp + "(n) = " + logA);
                System.out.println("log_" + i + "(n) = " + logB);
                System.out.println("Mediante el cambio de base se demuestra que difieren solo por un factor constante.");
                break;
            case 3:
                System.out.println("\nEjercicio 3: Propiedad logarítmica");
                System.out.print("Ingrese un valor para n: ");
                numGeneral = sc.nextInt();
                long fVal = (long) numGeneral * numGeneral + 5 * numGeneral;
                long hVal = (long) numGeneral * numGeneral;
                double logF = Math.log(fVal);
                double logH = Math.log(hVal);
                System.out.println("f(n) = " + fVal + " y h(n) = " + hVal);
                System.out.println("log(f(n)) = " + logF + " y log(h(n)) = " + logH);
                System.out.println("Esto demuestra que si O(f(n)) = O(h(n)) se cumple que O(log(f(n))) = O(log(h(n))),");
                System.out.println("pero la equivalencia no es reversible.");
                break;
            case 4:
                System.out.println("\nEjercicio 4: Procedimiento G(x)");
                System.out.print("Ingrese un valor para x: ");
                numGeneral = sc.nextInt();
                stackGeneral = new int[1000];
                top = 0;
                stackGeneral[top++] = numGeneral;
                temp = 0;
                while (top > 0) {
                    numGeneral = stackGeneral[--top];
                    temp += numGeneral * (numGeneral + 1) / 2;
                    if (numGeneral > 0) {
                        for (i = 0; i < 4; i++) {
                            stackGeneral[top++] = numGeneral / 2;
                        }
                    }
                }
                System.out.println("Total de líneas generadas: " + temp);
                System.out.println("Teóricamente, T(x) = Θ(x² log(x)).");
                break;
            case 5:
                System.out.println("\nEjercicio 5: Verificar número TRIANGULAR");
                System.out.print("Ingrese un número entero: ");
                numGeneral = sc.nextInt();
                dec = Math.sqrt(1 + 8 * numGeneral);
                if (dec == (int)dec) {
                    temp = (int)((-1 + dec) / 2);
                    if (temp * (temp + 1) / 2 == numGeneral)
                        System.out.println("El número " + numGeneral + " es TRIANGULAR (k = " + temp + ").");
                    else
                        System.out.println("El número " + numGeneral + " NO es triangular.");
                } else {
                    System.out.println("El número " + numGeneral + " NO es triangular.");
                }
                break;
            case 6:
                System.out.println("\nEjercicio 6: Tamaño de entrada con 3 horas de CPU");
                numGeneral = 1000000;
                System.out.println("Para 1 hora: n_max = " + numGeneral);
                System.out.println("(a) Lineal: 3 * n_max = " + (3 * numGeneral));
                System.out.println("(b) Cuadrático: n_max se escala en √3 ≈ " + (int)(numGeneral * Math.sqrt(3)));
                System.out.println("(c) Exponencial: n_max apenas aumenta, aproximadamente " + numGeneral);
                break;
            case 7:
                System.out.println("\nEjercicio 7: Entrada en máquina 100 veces más rápida");
                numGeneral = 1000000;
                System.out.println("Para máquina normal: n_max = " + numGeneral);
                System.out.println("(a) Lineal: 100 * n_max = " + (100 * numGeneral));
                System.out.println("(b) Cuadrático: n_max se escala en √100 = 10, n_max ≈ " + (10 * numGeneral));
                System.out.println("(c) Exponencial: n_max aumenta marginalmente, aproximadamente " + (numGeneral + 2));
                break;
            case 8:
                System.out.println("\nEjercicio 8: Máximo y Mínimo de un vector");
                System.out.print("Ingrese el tamaño del vector: ");
                numGeneral = sc.nextInt();
                vectorGeneral = new int[numGeneral];
                System.out.println("Ingrese los elementos del vector:");
                for (i = 0; i < numGeneral; i++) {
                    vectorGeneral[i] = sc.nextInt();
                }
                if (numGeneral % 2 == 0) {
                    if (vectorGeneral[0] > vectorGeneral[1]) {
                        temp = vectorGeneral[0];
                        j = vectorGeneral[1];
                    } else {
                        temp = vectorGeneral[1];
                        j = vectorGeneral[0];
                    }
                    i = 2;
                } else {
                    temp = j = vectorGeneral[0];
                    i = 1;
                }
                while (i < numGeneral - 1) {
                    if (vectorGeneral[i] > vectorGeneral[i+1]) {
                        if (vectorGeneral[i] > temp)
                            temp = vectorGeneral[i];
                        if (vectorGeneral[i+1] < j)
                            j = vectorGeneral[i+1];
                    } else {
                        if (vectorGeneral[i+1] > temp)
                            temp = vectorGeneral[i+1];
                        if (vectorGeneral[i] < j)
                            j = vectorGeneral[i];
                    }
                    i += 2;
                }
                System.out.println("Máximo del vector: " + temp);
                System.out.println("Mínimo del vector: " + j);
                break;
            case 9:
                System.out.println("\nEjercicio 9: Recurrencia T(n)=2T(n/4)+log(n)");
                System.out.print("Ingrese un entero para n (n > 1): ");
                numGeneral = sc.nextInt();
                stackGeneral = new int[1000];
                top = 0;
                stackGeneral[top++] = numGeneral;
                dec = 0.0;
                while (top > 0) {
                    numGeneral = stackGeneral[--top];
                    if (numGeneral <= 1) {
                        dec += 1.0;
                    } else {
                        dec += Math.log(numGeneral);
                        for (i = 0; i < 2; i++) {
                            stackGeneral[top++] = numGeneral / 4;
                        }
                    }
                }
                System.out.println("Valor estimado de T(n): " + dec);
                System.out.println("Teóricamente se obtiene T(n) = Θ(√n).");
                break;
            case 10:
                System.out.println("\nEjercicio 10, Parte (a): Calcular total(n)");
                System.out.print("Ingrese un valor para n: ");
                numGeneral = sc.nextInt();
                temp = 1;
                for (i = 2; i <= numGeneral; i++) {
                    j = (1 << (i - 1));
                    temp = temp + j;
                }
                System.out.println("total(n) = " + temp + " (Complejidad Θ(n²))");
                System.out.println("\nEjercicio 10, Parte (b): Calcular total(n, m)");
                System.out.print("Ingrese dos números (n y m, separados por espacio): ");
                numGeneral = sc.nextInt();
                temp = sc.nextInt();
                j = ((1 << numGeneral) - 1) * temp;
                System.out.println("total(n, m) = " + j + " (Complejidad Θ(n))");
                break;
            case 11:
                System.out.println("\nEjercicio 11: Búsqueda de patrón en un string");
                System.out.print("Ingrese el texto A: ");
                textoGeneral = sc.next();
                System.out.print("Ingrese el patrón B: ");
                str = sc.next();
                temp = -1;
                for (i = 0; i <= textoGeneral.length() - str.length(); i++) {
                    for (j = 0; j < str.length(); j++) {
                        if (textoGeneral.charAt(i+j) != str.charAt(j))
                            break;
                    }
                    if (j == str.length()) {
                        temp = i;
                        break;
                    }
                }
                System.out.println("El patrón se encontró en la posición: " + temp);
                break;
            case 12:
                System.out.println("\nEjercicio 12: Ordenación (análisis teórico)");
                System.out.print("Ingrese el tamaño del vector a ordenar: ");
                numGeneral = sc.nextInt();
                vectorGeneral = new int[numGeneral];
                System.out.println("Ingrese los elementos del vector:");
                for (i = 0; i < numGeneral; i++) {
                    vectorGeneral[i] = sc.nextInt();
                }
                for (i = 0; i < numGeneral - 1; i += 2) {
                    if (vectorGeneral[i] > vectorGeneral[i+1]) {
                        temp = vectorGeneral[i];
                        vectorGeneral[i] = vectorGeneral[i+1];
                        vectorGeneral[i+1] = temp;
                    }
                }
                dec = numGeneral * (Math.log(numGeneral / 2.0) / Math.log(2));
                System.out.println("Costo teórico del merge: " + dec);
                System.out.println("Complejidad total: O(n log n).");
                break;
            case 13:
                System.out.println("\nEjercicio 13: Verificar palíndromo");
                System.out.print("Ingrese una cadena: ");
                textoGeneral = sc.next();
                boolean esPal = true;
                i = 0;
                j = textoGeneral.length() - 1;
                while (i < j) {
                    if (textoGeneral.charAt(i) != textoGeneral.charAt(j)) {
                        esPal = false;
                        break;
                    }
                    i++;
                    j--;
                }
                System.out.println("La cadena \"" + textoGeneral + "\" " + (esPal ? "ES" : "NO ES") + " palíndromo.");
                break;
            case 14:
                System.out.println("\nEjercicio 14: Estrategia Trivial vs. Divide y Vencerás");
                System.out.print("Ingrese el tamaño de entrada n: ");
                numGeneral = sc.nextInt();
                long tiempoTrivial = (long) numGeneral * numGeneral;
                dec = numGeneral * Math.pow(Math.log(numGeneral) / Math.log(2), 2);
                System.out.println("Tiempo (trivial, Θ(n²)) = " + tiempoTrivial);
                System.out.println("Tiempo (Div. y Venc., Θ(n log² n)) = " + dec);
                if (dec < tiempoTrivial)
                    System.out.println("Divide y Vencerás es más eficiente para n grandes.");
                else
                    System.out.println("Para este valor de n, la diferencia es mínima.");
                break;
            case 15:
                System.out.println("\nEjercicio 15: Comparaciones (MAX_MIN)");
                System.out.print("Ingrese el número de elementos del vector: ");
                numGeneral = sc.nextInt();
                dec = (3.0 * numGeneral / 2.0) - 2;
                System.out.println("Número aproximado de comparaciones: " + dec);
                break;
            default:
                System.out.println("Opción no válida. Seleccione un número entre 1 y 15.");
                break;
        }
        sc.close();
    }
}
