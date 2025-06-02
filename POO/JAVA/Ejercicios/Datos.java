import java.util.Scanner;

public class Datos {
public static Scanner scanner = new Scanner (System.in);

   public static Ejercicio_1 e1 = new Ejercicio_1();
    public static Ejercicio_2 e2 = new Ejercicio_2();
    public static Ejercicio_3 e3 = new Ejercicio_3();
    public static Ejercicio_4 e4 = new Ejercicio_4();
    public static Ejercicio_5 e5 = new Ejercicio_5();
    public static Ejercicio_6 e6 = new Ejercicio_6();
    public static Ejercicio_7 e7 = new Ejercicio_7();
    public static Ejercicio_8 e8 = new Ejercicio_8();
    public static Ejercicio_9 e9 = new Ejercicio_9();
    public static Ejercicio_10 e10 = new Ejercicio_10();
    public static Ejercicio_11 e11 = new Ejercicio_11();
    public static Ejercicio_12 e12 = new Ejercicio_12();
    public static Ejercicio_13 e13 = new Ejercicio_13();
    public static Ejercicio_14 e14 = new Ejercicio_14();
    public static Ejercicio_15 e15 = new Ejercicio_15();
    public static Ejercicio_16 e16 = new Ejercicio_16();
    public static Ejercicio_17 e17 = new Ejercicio_17();
    public static Ejercicio_18 e18 = new Ejercicio_18();
    public static Ejercicio_19 e19 = new Ejercicio_19();
    public static Ejercicio_20 e20 = new Ejercicio_20();
    public static Ejercicio_21 e21 = new Ejercicio_21();
    public static Ejercicio_22 e22 = new Ejercicio_22();
    public static Ejercicio_23 e23 = new Ejercicio_23();
    public static Ejercicio_24 e24 = new Ejercicio_24();
    public static Ejercicio_25 e25 = new Ejercicio_25();
    public static Ejercicio_26 e26 = new Ejercicio_26();
    public static Ejercicio_27 e27 = new Ejercicio_27();
    public static Ejercicio_28 e28 = new Ejercicio_28();
    public static Ejercicio_29 e29 = new Ejercicio_29();
    public static Ejercicio_30 e30 = new Ejercicio_30();

    public static void E1(){
    
        System.out.println ("EJERCICIO 1: Distancia:");
                System.out.print("ingresa una Velocidad:");
                e1.valorOne=scanner.nextInt();

                System.out.print("ingresa un Tiempo:");
                e1.valorTwo=scanner.nextInt();

                e1.product= e1.valorTwo*e1.valorOne;

                System.out.println("la distancia es: "+e1.product+" m");
    
    }
    public static void E2(){
 
        System.out.print("Ingresa la Nota A: ");
                 e2.valorOne=scanner.nextInt(); 

                System.out.print("Ingresa la Nota B: ");
                 e2.valorTwo=scanner.nextInt(); 

                System.out.print("Ingresa la Nota C: ");
                 e2.valorThree=scanner.nextInt();

                 e2.product=(e2.valorOne+e2.valorTwo+e2.valorThree)/3;
                System.out.println("el promedio de las 3 notas es: "+e2.product); 
       
    }
    public static void E3(){
       
        System.out.print("Ingresa el numero de Respuestas Correctas: ");
                  e3.valorOne=scanner.nextInt();

                System.out.print("Ingresa el numero de Respuestas Incorrectas: ");
                 e3.valorTwo=scanner.nextInt();

                System.out.print("Ingresa el numero de Respuestas en Blanco: ");
                e3.valorThree=scanner.nextInt();
                 e3.valorFour=e3.valorOne*4;
                 e3.valorFive=e3.valorTwo*(-1);
                 e3.valorSix=e3.valorThree*0;

                  e3.product=e3.valorFour+e3.valorFive+e3.valorSix;

                if(e3.product<0){
                    System.out.println("El Puntaje Final es: 0 ");
                    }
                else{
                    System.out.println("El Puntaje Final es: "+e3.product);
                }
    
    }
    public static void E4(){
    System.out.print("Ingresa el numero de Partidos Ganados: ");
    e4.valorOne = scanner.nextInt();

    System.out.print("Ingresa el numero de Partidos Perdidos: ");
    e4.valorTwo = scanner.nextInt();

    System.out.print("Ingresa el numero de Partidos Empatados: ");
    e4.valorThree = scanner.nextInt();

    e4.valorFour = e4.valorOne * 3;
    e4.valorFive = e4.valorTwo * 1;
    e4.valorSix = e4.valorThree * 0;

    e4.product = e4.valorFour + e4.valorFive + e4.valorSix;

    if (e4.product < 0) {
        System.out.println("El Puntaje Final es: 0 ");
    } else {
        System.out.println("El Puntaje Final es: " + e4.product);
    }
}

public static void E5(){
    System.out.print("Ingresa las Horas Trabajadas: ");
    e5.valorOne = scanner.nextInt();

    System.out.print("Ingrese la Tarifa por Hora: $");
    e5.valorTwo = scanner.nextInt();

    e5.product = e5.valorOne * e5.valorTwo;

    System.out.println("La planilla del empleado es: $" + e5.product);
}

public static void E6(){
    System.out.println("AREA DE UN TRIANGULO");
    System.out.println("--------------------------------------");
    System.out.print("Para que tres segmentos formen un triángulo");
    System.out.println(" la suma de dos de sus lados debe ser mayor que el tercer lado");
    System.out.println("--------------------------------------");

    System.out.print("Ingresa el Perimetro del Lado A: ");
    e6.valorOne = scanner.nextInt();

    System.out.print("Ingresa el Perimetro del Lado B: ");
    e6.valorTwo = scanner.nextInt();

    System.out.print("Ingresa el Perimetro del Lado C: ");
    e6.valorThree = scanner.nextInt();

    if (e6.valorOne + e6.valorTwo > e6.valorThree && 
        e6.valorOne + e6.valorThree > e6.valorTwo && 
        e6.valorTwo + e6.valorThree > e6.valorOne) {

        e6.product = (e6.valorOne + e6.valorTwo + e6.valorThree) / 2;

        e6.calculate = Math.sqrt(e6.product *
                (e6.product - e6.valorOne) *
                (e6.product - e6.valorTwo) *
                (e6.product - e6.valorThree)
        );

        System.out.println("Area del Triangulo: " + e6.calculate);

    } else {
        System.out.println("los lados ingresados NO FORMAN UN TRIANGULO");
    }
}

public static void E7(){
    System.out.print("Ingresa el numero de almacenamiento Gigabyte del Disco: ");
    e7.valorOne = scanner.nextInt();

    e7.valorTwo = e7.valorOne * 1024;
    e7.product = ((e7.valorTwo / 700) + 1);

    System.out.println("El numero de CDs: " + e7.product);
}

public static void E8(){
    System.out.print("Ingrese Abcisa A: ");
    e8.valorOne = scanner.nextInt();

    System.out.print("Ingrese Abcisa B: ");
    e8.valorTwo = scanner.nextInt();

    System.out.print("Ingrese Coordenada A: ");
    e8.valorThree = scanner.nextInt();

    System.out.print("Ingrese Coordenada B: ");
    e8.valorFour = scanner.nextInt();

    e8.calculate = Math.sqrt(
        ((e8.valorTwo - e8.valorOne) * (e8.valorTwo - e8.valorOne)) + 
        ((e8.valorFour - e8.valorThree) * (e8.valorFour - e8.valorThree))
    );

    System.out.println("La distancia entre los dos puntos A y B: " + e8.calculate);
}

public static void E9(){
    System.out.println("CUIL= Codigo Unico de Identificacion Laboral ");
    System.out.println("------------------------------------------");

    System.out.print("Ingresa tu Año de Nacimiento: ");
    e9.valorOne = scanner.nextInt();

    System.out.print("Ingresa el Año Actual: ");
    e9.valorTwo = scanner.nextInt();

    e9.product = e9.valorTwo - e9.valorOne;

    if (e9.product >= 18) {
        System.out.println("debe solicitar su CUIL");
    } else {
        System.out.println("NO debes solicitar tu CUIL aun");
    }
}

public static void E10(){
    System.out.print("Ingresa la edad del Primer Hermano: ");
    e10.valorOne = scanner.nextInt();

    System.out.print("Ingresa la edad del Segundo Hermano: ");
    e10.valorTwo = scanner.nextInt();

    e10.operation = e10.valorOne - e10.valorTwo;
    e10.calculate = Math.abs(e10.operation);

    if (e10.valorOne == e10.valorTwo) {
        System.out.println("Las dos edades son iguales");
    } else if (e10.valorOne > e10.valorTwo) {
        System.out.println("La edad del primer Hermano es Mayor");
        System.out.println("la diferencia entre las dos edades es de: " + e10.calculate);
    } else {
        System.out.println("La edad del Segundo Hermano es Mayor");
        System.out.println("la diferencia entre las dos edades es de: " + e10.calculate);
    }
}
    public static void E11() {
    System.out.print("ingresa la produccion del dia Lunes:");
    e11.valorOne = scanner.nextInt();

    System.out.print("ingresa la produccion del dia Martes:");
    e11.valorTwo = scanner.nextInt();

    System.out.print("ingresa la produccion del dia Miercoles:");
    e11.valorThree = scanner.nextInt();

    System.out.print("ingresa la produccion del dia Jueves:");
    e11.valorFour = scanner.nextInt();

    System.out.print("ingresa la produccion del dia Viernes:");
    e11.valorFive = scanner.nextInt();

    System.out.print("ingresa la produccion del dia Sabado:");
    e11.valorSix = scanner.nextInt();

    e11.product = (e11.valorOne + e11.valorTwo + e11.valorThree + e11.valorThree + e11.valorFour + e11.valorFive);
    e11.operation = e11.product / 6;

    if (e11.operation >= 100) {
        System.out.println("RECIBIRA INCENTIVOS");
    } else {
        System.out.println("NO RECIBIRA INCENTIVOS");
    }
}

public static void E12() {
    System.out.print("ingresa un Numero A:");
    e12.valorOne = scanner.nextInt();

    System.out.print("ingresa un Numero B:");
    e12.valorTwo = scanner.nextInt();

    System.out.print("ingresa un Numero C:");
    e12.valorThree = scanner.nextInt();

    if (e12.valorOne == e12.valorTwo && e12.valorOne == e12.valorThree) {
        System.out.println("Los numeros ingresados son todos iguales");
    } else if (e12.valorOne > e12.valorTwo && e12.valorOne > e12.valorThree) {
        System.out.println("El Numero A es el mayor");
    } else if (e12.valorTwo > e12.valorOne && e12.valorTwo > e12.valorThree) {
        System.out.println("El Numero B es el mayor");
    } else {
        System.out.println("El Numero C es el mayor");
    }
}

public static void E13() {
    System.out.print("ingresa un Lado A:");
    e13.valorOne = scanner.nextInt();

    System.out.print("ingresa un Lado B:");
    e13.valorTwo = scanner.nextInt();

    System.out.print("ingresa un Lado C:");
    e13.valorThree = scanner.nextInt();

    if (e13.valorOne != e13.valorTwo && e13.valorOne != e13.valorThree) {
        System.out.println("Triangulo Escaleno");
    } else if (e13.valorOne == e13.valorTwo && e13.valorTwo == e13.valorThree) {
        System.out.println("Triangulo Equilatero");
    } else {
        System.out.println("Triangulo Isosceles");
    }
}
    public static void E14(){
   
    System.out.print("Ingrese el primer número: ");
    e14.valorOne = scanner.nextInt();

    System.out.print("Ingrese el segundo número: ");
    e14.valorTwo = scanner.nextInt();

    System.out.print("Ingrese el operador (+, -, *, ^): ");
    char operador = scanner.next().charAt(0);

    switch (operador) {
        case '+':
            e14.product = e14.valorOne + e14.valorTwo;
            System.out.println("Resultado: " + e14.product);
            break;
        case '-':
            if (e14.valorOne > e14.valorTwo) {
                e14.product = e14.valorOne - e14.valorTwo;
            } else {
                e14.product = e14.valorTwo - e14.valorOne;
            }
            System.out.println("Resultado: " + e14.product);
            break;
        case '*':
            e14.product = e14.valorOne * e14.valorTwo;
            System.out.println("Resultado: " + e14.product);
            break;
        case '^':
            e14.product = 1;
            for (int i = 0; i < e14.valorTwo; i++) {
                e14.product *= e14.valorOne;
            }
            System.out.println("Resultado: " + e14.product);
            break;
        default:
            System.out.println("Operador no válido");
    }
}

public static void E15(){
   
    e15.vocales = 0;
     e15.consonantes = 0;
    for (e15.i = 0; e15.i < 10; e15.i++) {
        System.out.print("Ingrese una letra: ");
        e15.letra = scanner.next().toLowerCase().charAt(0);
        if (e15.letra == 'a' || e15.letra == 'e' || e15.letra == 'i' || e15.letra == 'o' || e15.letra == 'u') {
            e15.vocales++;
        } else {
            e15.consonantes++;
        }
    }
    System.out.println("Vocales: " + e15.vocales);
    System.out.println("Consonantes: " + e15.consonantes);
}
    public static void E16(){
        System.out.print("Ingresa un numero entero del 1-5: ");
        e16.valorOne = scanner.nextInt();
        switch(e16.valorOne){
            case 1:
                System.out.println("La vocal correspondiente es: A");
                break;
            case 2:
                System.out.println("La vocal correspondiente es: E");
                break;
            case 3:
                System.out.println("La vocal correspondiente es: I");
                break;
            case 4:
                System.out.println("La vocal correspondiente es: O");
                break;
            case 5:
                System.out.println("La vocal correspondiente es: U");
                break;
            default:
                System.out.println("valor INVALIDO asegurate de ingresarlo dentro del rango");
                break;
        }
    }
    
    public static void E17(){
        System.out.print("Ingrese un Numero entero de 2 o mas Digitos: ");
        e17.valorOne = scanner.nextInt();
        e17.operation = e17.valorOne / 10;
        e17.product = e17.valorOne - (e17.operation * 10);
        e17.valorTwo = e17.operation;
        e17.valorThree = e17.product;
        System.out.println("El numero ingresado tiene un total de: " + e17.valorTwo + " Decenas");
        System.out.println("El numero Ingresado tiene un total de: " + e17.valorThree + " Unidades");
    }
    
   
    public static void E18(){
        System.out.print("Ingrese un Numero entero : ");
        e18.valorOne = scanner.nextInt();
        if(e18.valorOne % 2 == 0){
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }
    

    public static void E19(){
        System.out.print("Ingrese un Numero: ");
        e19.valorOne = scanner.nextInt();
        System.out.println("Numeros Pares del 1-" + e19.valorOne);
        for(e19.contador = 2; e19.contador <= e19.valorOne; e19.contador += 2){
            System.out.println(e19.contador);
        }
    }
   
    public static void E20(){
        System.out.print("Ingrese el número de empleados: ");
        if(scanner.hasNextInt()){
            e20.valorOne = scanner.nextInt();
            if(e20.valorOne <= 0){
                System.out.println("El número de empleados debe ser mayor a 0.");
                return;
            }
            e20.valorTwo = 0;
            System.out.println("Ingrese el sueldo de cada empleado:");
            for(e20.contador = 1; e20.contador <= e20.valorOne; e20.contador++){
                System.out.print("Sueldo del empleado " + e20.contador + ": ");
                if(scanner.hasNextInt()){
                    e20.valorThree = scanner.nextInt();
                    if(e20.valorThree < 0){
                        System.out.println("El sueldo no puede ser negativo. Intente nuevamente.");
                        e20.contador--; 
                        continue;
                    }
                    e20.valorTwo += e20.valorThree;
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese un número.");
                    scanner.next(); // Limpia la entrada incorrecta
                    e20.contador--; 
                    continue;
                }
            }
            e20.operation = e20.valorTwo / e20.valorOne;
            System.out.println("El sueldo promedio del grupo de trabajadores es de: " + e20.operation);
        } else {
            System.out.println("Entrada no válida. Debe ingresar un número entero.");
            scanner.next();
        }
    }
    
 
    public static void E21(){
        System.out.print("Ingrese La Cantidad Total de Personas: ");
        e21.valorOne = scanner.nextInt();
        e21.valorTwo = 0;
        e21.valorThree = 0;
        for(e21.contador = 1; e21.contador <= e21.valorOne; e21.contador++){
            System.out.print("Ingrese la Edad de la Persona " + e21.contador + " :");
            e21.valorOne = scanner.nextInt();
            if(e21.valorOne <= 18){
                e21.valorTwo++;
            } else {
                e21.valorThree++;
            }
        }
        System.out.println("La cantidad de Personas Mayores son: " + e21.valorThree);
        System.out.println("La cantidad de Personas Menores son: " + e21.valorTwo);
    }
    
  
    public static void E22(){
        System.out.print("Ingrese el primer número (PN): ");
        e22.valorOne = scanner.nextInt();
        System.out.print("Ingrese el segundo número (SN): ");
        e22.valorTwo = scanner.nextInt();
        e22.valorThree = 0;
        for(e22.contador = 1; e22.contador <= e22.valorTwo; e22.contador++){
            e22.valorThree += e22.valorOne;
        }
        System.out.println("El producto de " + e22.valorOne + " y " + e22.valorTwo + " es: " + e22.valorThree);
    }
    
    public static void E23(){
        System.out.println("Ingrese 10 números enteros:");
        for(e23.contador = 1; e23.contador <= 10; e23.contador++){
            System.out.print("Ingrese el número " + e23.contador + ": ");
            e23.valorOne = scanner.nextInt();
            e23.operation = e23.valorOne % 2;
            if(e23.operation == 0){
                continue; 
            }
            System.out.println("Número impar ingresado: " + e23.valorOne);
        }
    }
   public static void E24(){
        System.out.print("Ingrese el valor general para crear la serie: ");
        e24.valorOne = scanner.nextInt();
        if(e24.valorOne <= 0){
            System.out.println("Por favor, ingrese un valor entero positivo.");
        } else {
            System.out.println("Numeros de la Serie: ");
            e24.contador = 1;
            while(e24.contador < e24.valorOne){
                System.out.println(e24.contador);
                e24.contador = (e24.contador * e24.contador) + 1;
            }
        }
    }

    public static void E25(){
        e25.text = "V";
        while(e25.text.equals("V")){
            System.out.print("Ingrese una letra: ");
            e25.letra = scanner.next().charAt(0);
            switch(Character.toLowerCase(e25.letra)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    e25.text = "R";
                    System.out.println("Ingresaste una vocal.");
                    break;
                default:
                    e25.text = "V";
                    System.out.println("No es una vocal. Intenta de nuevo.");
                    break;
            }
        }
    }
     public static void E26(){
        e26.valorOne = 0;
        e26.valorTwo = 1;
        e26.valorThree = e26.valorOne + e26.valorTwo;
        System.out.println("SERIE DE FIBONACCI");
        System.out.println(e26.valorOne);
        System.out.println(e26.valorTwo);
        while(e26.valorThree < 100000){
            e26.valorOne = e26.valorTwo;
            e26.valorTwo = e26.valorThree;
            e26.valorThree = e26.valorOne + e26.valorTwo;
            System.out.println(e26.valorThree);
        }
    }
    
    public static void E27(){
        System.out.println("OPERADORES ARITMETICOS");
        System.out.println("Suma (+)");
        System.out.println("Resta (-)");
        System.out.println("Multiplicacion (*)");
        System.out.println("Potencia (^)");    
        System.out.print("Ingresa Un Numero A: ");
        e27.valorOne = scanner.nextInt();
        System.out.print("Ingresa Un Numero B: ");
        e27.valorTwo = scanner.nextInt();
        System.out.print("segun el simbolo, elije un operador: ");
        e27.letra = scanner.next().charAt(0);
        switch(e27.letra){
            case '+':
                e27.operation = e27.valorOne + e27.valorTwo;
                System.out.println("El operationado de la Suma es: " + e27.operation);
                break;
            case '-':
                if(e27.valorOne > e27.valorTwo){
                    e27.operation = e27.valorOne - e27.valorTwo;
                } else {
                    e27.operation = e27.valorTwo - e27.valorOne;
                }
                System.out.println("El operationado de la Resta es: " + e27.operation);
                break;
            case '*':
                e27.operation = e27.valorOne * e27.valorTwo;
                System.out.println("El operationado de la multiplicacion es: " + e27.operation);
                break;
            case '^':
                e27.operation = e27.valorOne ^ e27.valorTwo;
                System.out.println("El Numero A elevado al Numero B es : " + e27.operation);
                break;
            default:
                e27.operation = 0;
                System.out.println("El operador ingresado es invalido");
                break;
        }
    }
    
    public static void E28(){
        e28.valorOne = 0;  // Contador de vocales
        e28.valorTwo = 0;  // Contador de consonantes
        for(e28.contador = 1; e28.contador <= 10; e28.contador++){
            System.out.print("Ingresa una letra o vocal aleatoria: ");
            e28.letra = scanner.next().charAt(0);
            switch(e28.letra){
                case 'A': case 'a': 
                case 'E': case 'e': 
                case 'I': case 'i': 
                case 'O': case 'o': 
                case 'U': case 'u':
                    e28.valorOne++;
                    break;
                default:
                    e28.valorTwo++;
                    break;
            }
        }
        System.out.println("Cantidad de vocales ingresadas: " + e28.valorOne);
        System.out.println("Cantidad de consonantes ingresadas: " + e28.valorTwo);
    }
    
    public static void E29(){
        System.out.print("Ingresa la cantidad de Electores: ");
        e29.valorOne = scanner.nextInt();
        System.out.println("Para elegir al candidato, Ingrese los numeros en parentesis: ");
        System.out.println("Candidato A (1)");
        System.out.println("Candidato B (2): ");
        System.out.println("Candidato C (3)");
        // Reinicialización de los contadores para votos
        e29.valorOne = 0;
        e29.valorTwo = 0;
        e29.valorThree = 0;
        e29.product = 0;
        for(e29.contador = 1; e29.contador <= e29.valorOne; e29.contador++){
            System.out.print("Ingrese el voto del elector " + e29.contador + ":");
            e29.product = scanner.nextInt();
            switch(e29.product){
                case 1:
                    e29.valorOne++;
                    break;
                case 2:
                    e29.valorTwo++;
                    break;
                case 3:
                    e29.valorThree++;
                    break;
                default:
                    e29.product++;
                    break;
            }
        }
        if(e29.valorOne > e29.valorTwo && e29.valorOne > e29.valorThree){
            e29.valorSix = 1;
        } else if(e29.valorTwo > e29.valorOne && e29.valorTwo > e29.valorThree){
            e29.valorSix = 2;
        } else if(e29.valorThree > e29.valorOne && e29.valorThree > e29.valorTwo){
            e29.valorSix = 3;
        } else {
            e29.valorSix = 0;
        }
        System.out.println("resultados finales:");
        System.out.println("Usuario 1: " + e29.valorOne + " votos.");
        System.out.println("Usuario 2: " + e29.valorTwo + " votos.");
        System.out.println("Usuario 3: " + e29.valorThree + " votos.");
        System.out.println("Votos nulos/blancos: " + e29.product);
        System.out.println("Ganador: Usuario " + e29.valorSix);
    }
    
    public static void E30(){
        System.out.print("Ingre el Valor del Numero A: ");
        e30.valorOne = scanner.nextInt();
        System.out.print("Ingrese el Valor del Numero B: ");
        e30.valorTwo = scanner.nextInt();
        e30.operation = e30.valorOne + e30.valorTwo;
        e30.product = e30.operation / 2;
        System.out.println("El Promedio entre los dos numeros es: " + e30.product);
    }
}