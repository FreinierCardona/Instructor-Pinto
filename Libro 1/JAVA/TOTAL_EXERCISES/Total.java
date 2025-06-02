package JAVA.TOTAL_EXERCISES;
import java.util.Scanner;
public class Total {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int valorOne, valorTwo, product,valorThree,valorFour,valorFive,valorSix,contador ;
        double calculate;  
        String text;
        char letra;
        int operation;

        System.out.print("Para Acceder a los Ejercicios, Ingresa un Numero entero de 1-30: ");
        valorOne=scanner.nextInt();

        switch (valorOne) {
            case 1:
                System.out.println ("EJERCICIO 1: Distancia:");
                System.out.print("ingresa una Velocidad:");
                valorTwo=scanner.nextInt();

                System.out.print("ingresa un Tiempo:");
                valorThree=scanner.nextInt();

                product= valorTwo*valorThree;

                System.out.println("la distancia es: "+product+" m");
    
    
                break;
            case 2:
                System.out.print("Ingresa la Nota A: ");
                 valorOne=scanner.nextInt(); 

                System.out.print("Ingresa la Nota B: ");
                 valorTwo=scanner.nextInt(); 

                System.out.print("Ingresa la Nota C: ");
                valorThree=scanner.nextInt();

                 product=(valorOne+valorTwo+valorThree)/3;
                System.out.println("el promedio de las 3 notas es: "+product); 
    
    
                break;
            case 3:
                System.out.print("Ingresa el numero de Respuestas Correctas: ");
                 valorOne=scanner.nextInt();

                System.out.print("Ingresa el numero de Respuestas Incorrectas: ");
                 valorTwo=scanner.nextInt();

                System.out.print("Ingresa el numero de Respuestas en Blanco: ");
                 valorThree=scanner.nextInt();

                 valorFour=valorOne*4;
                valorFive=valorTwo*(-1);
                valorSix=valorThree*0;

                 product=valorFour+valorFive+valorSix;

                if(product<0){
                    System.out.println("El Puntaje Final es: 0 ");
                    }
                else{
                    System.out.println("El Puntaje Final es: "+product);
                }
    
    
                break;
            case 4:
                System.out.print("Ingresa el numero de Partidos Ganados: ");
                valorOne=scanner.nextInt();

                System.out.print("Ingresa el numero de Partidos Perdidos: ");
                 valorTwo=scanner.nextInt();

                System.out.print("Ingresa el numero de Partidos Empatados: ");
                valorThree=scanner.nextInt();

                 valorFour=valorOne*3;
                valorFive=valorTwo*1;
                valorSix=valorThree*0;

                product=valorFour+valorFive+valorSix;

                if(product<0){
                    System.out.println("El Puntaje Final es: 0 ");
                    }
                else{
                    System.out.println("El Puntaje Final es: "+product);
                }  
    
    
                break;
            case 5:
                 System.out.print("Ingresa las Horas Trabajadas: ");
                valorOne=scanner.nextInt();
        
                System.out.print("Ingrese la Tarifa por Hora: $");
                valorTwo=scanner.nextInt();

                product=valorOne*valorTwo;

                System.out.println("La planilla del empleado es: $"+product);
    
    
                break;
            case 6:
                 System.out.println("AREA DE UN TRIANGULO");

                System.out.println("--------------------------------------");
                System.out.print("Para que tres segmentos formen un triángulo");
                System.out.println(" la suma de dos de sus lados debe ser mayor que el tercer lado");
                System.out.println("--------------------------------------");
                System.out.print("Ingresa el Perimetro del Lado A: ");
                valorOne=scanner.nextInt();

                System.out.print("Ingresa el Perimetro del Lado B: ");
                valorTwo=scanner.nextInt();

                System.out.print("Ingresa el Perimetro del Lado C: ");
                valorThree=scanner.nextInt();

                if(valorOne+valorTwo > valorThree && valorOne+valorThree>valorTwo && valorTwo+valorThree>valorTwo){
                product=(valorOne+valorTwo+valorThree)/2;

                 calculate=Math.sqrt(product*
                            (product-valorOne)*
                            (product-valorTwo)*
                            (product-valorThree)
                );
                System.out.println("Area del Triangulo: "+calculate);

                }
                else{
                    System.out.println("los lados ingresados NO FORMAN UN TRIANGULO");
                }
    
    
                break;
            case 7:
                System.out.print("Ingresa el numero de almacenamiento Gigabyte del Disco: ");
                valorOne=scanner.nextInt();
                valorTwo=valorOne*1024;
                product=((valorTwo/700)+1);

                System.out.println("El numero de CDs: "+product);
    
    
                break;
            case 8:
                System.out.print("Ingrese Abcisa A: ");
                valorOne=scanner.nextInt();
            

                System.out.print("Ingrese Abcisa B: ");
                valorTwo=scanner.nextInt();

                System.out.print("Ingrese Coordenada A: ");
                valorThree=scanner.nextInt();

                System.out.print("Ingrese Coordenada B: ");
                valorFour=scanner.nextInt();
        
                calculate= (((valorTwo-valorOne)*(valorTwo-valorOne))+((valorFour-valorThree)*(valorFour-valorThree)))*0.5; 

                System.out.println("La distancia entre los dos puntas A y B: "+calculate);
    
    
                break;
            case 9:
                System.out.println("CUIL= Codigo Unico de Identificacion Laboral ");
                System.out.println("------------------------------------------");
                System.out.print("Ingresa tu Año de Nacimiento: ");
                 valorOne=scanner.nextInt();

                System.out.print("Ingresa el Año Actual: ");
                valorTwo=scanner.nextInt();

                product=valorTwo-valorOne;

                if(product>=18){
                    System.out.println("debe solicitar su CUIL");
                }
                else{
                    System.out.println("NO debes solicitar tu CUIL aun");
                }

        
        
                break;
            case 10:
                System.out.print("Ingresa la edad del Primer Hermano: ");
                valorOne=scanner.nextInt();

                System.out.print("Ingresa la edad del Segundo Hermano: ");
                valorTwo=scanner.nextInt();

                operation= valorOne-valorTwo;
                calculate=Math.abs(operation);
    
                if(valorOne==valorTwo){
                    System.out.println("Las dos edades son iguales");
                }
                else if (valorOne>valorTwo)
                {
                System.out.println("La edad del primer Hermano es Mayor");
                System.out.println("la diferencia entre las dos edades es de: "+calculate);
            
                }
                else{
                System.out.println("La edad del Segundo Hermano es Mayor");
                System.out.println("la diferencia entre las dos edades es de: "+calculate);
                    }
    
    
                break;
            case 11:
                    System.out.print("ingresa la produccion del dia Lunes:");
                valorOne=scanner.nextInt();
        
                System.out.print("ingresa la produccion del dia Martes:");
                valorTwo=scanner.nextInt();

                System.out.print("ingresa la produccion del dia Miercoles:");
                valorThree=scanner.nextInt();

                System.out.print("ingresa la produccion del dia Jueves:");
                valorFour=scanner.nextInt();

                System.out.print("ingresa la produccion del dia Viernes:");
                valorFive=scanner.nextInt();

                System.out.print("ingresa la produccion del dia Sabado:");
                valorSix=scanner.nextInt();

                product=(valorOne+valorTwo+valorThree+valorThree+valorFour+valorFive);
                operation=product/6;

                if(operation>=100){
                System.out.println("RECIBIRA INCENTIVOS");
                }
            else{
                System.out.println("NO RECIBIRA INCENTIVOS");
                }  
    
    
                break;
             case 12:
                System.out.print("ingresa un Numero A:");
                valorOne=scanner.nextInt();

                System.out.print("ingresa un Numero B:");
                valorTwo=scanner.nextInt();

                System.out.print("ingresa un Numero C:");
                valorThree=scanner.nextInt();

                if(valorOne==valorTwo&&valorOne==valorThree){
                System.out.println("Los numeros ingresados son todos iguales");
                }
                else if(valorOne>valorTwo&&valorOne>valorThree){
                System.out.println("El Numero A es el mayor");
                }
                else if(valorTwo>valorOne&&valorTwo>valorThree){
                System.out.println("El Numero B es el mayor");
                }
                else{
                System.out.println("El Numero C es el mayor");
                }
    
    
                break;
            case 13:
                System.out.print("ingresa un Lado A:");
                valorOne=scanner.nextInt();


                System.out.print("ingresa un Lado B:");
                valorTwo=scanner.nextInt();

                System.out.print("ingresa un Lado C:");
                valorThree=scanner.nextInt();

                if(valorOne!=valorTwo&&valorOne!=valorThree){
                System.out.println("Triangulo Escaleno");
                }
                else if(valorOne==valorTwo&&valorTwo==valorThree){
                System.out.println("Triangulo Equilatero");
                    }
        
                else{
                System.out.println("Triangulo Isosceles");
                }    
    
    
                break;
            case 14:
                System.out.print("Ingresa un numero entero del 1-10: ");
                valorOne=scanner.nextInt();

        switch(valorOne){
                case 1 -> text = "I";
                case 2 -> text = "II";
                case 3 -> text = "III";
                case 4 -> text = "IV";
                case 5 -> text = "V";
                case 6 -> text = "VI";
                case 7 -> text = "VII";
                case 8 -> text = "VIII";
                case 9 -> text = "IX";
                case 10 -> text = "X";
                default->text="El valor ingresado es invalido, recuerde el rango es de (1-10)";
        }
                System.out.println("el numero "+valorOne+" en Romano es: "+text);
    
    
                break;
            case 15:
                System.out.print("Ingrese el Monto de Venta: ");
                valorOne=scanner.nextInt();
        
                operation=(int)valorOne/1000;
        switch (operation) {
            case 0:
               valorTwo=0;
            
            break;
                case 1:
                case 2:
                case 3:
                case 4:
               valorTwo=3;
           
            break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
               valorTwo=5;
            
            break;
            default:
                 if(valorOne>20000){
                   valorTwo=8;
                    
                 }
                 else{
                   valorTwo=0;
                 }
                 break;
                 
        }
                System.out.println("La bonificación correspondiente es: " +valorTwo + "%");
    
    
                break;       
            case 16:
                System.out.print("Ingresa un numero entero del 1-5: ");
                valorOne=scanner.nextInt();
            

        switch(valorOne){
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
                
    
    
                break;        
                case 17:
                    System.out.print("Ingrese un Numero entero de 2 o mas  Digitos: ");
                valorOne=scanner.nextInt();
                operation= valorOne/10;
                product=valorOne-(operation*10);
                valorTwo=operation;
                valorThree=product;
        

                System.out.println("El numero ingresado tiene un total de :"+valorTwo+" Decenas");
                System.out.println("El numero Ingresado tiene un total de: "+valorThree+" Unidades");
    
    
                break;    
            case 18:
                System.out.print("Ingrese un Numero entero : ");
                valorOne=scanner.nextInt();
                if(valorOne%2==0){
                System.out.println("El numero ingresado es par");
                }
            else{
                System.out.println("El numero ingresado es impar");
                }

    
    
                break;
            case 19:
                System.out.print("Ingrese un Numero: ");
                valorOne=scanner.nextInt();
                System.out.println(" Numeros Pares del 1-"+valorOne);
                for (contador = 2; contador <= valorOne; contador += 2) {
                System.out.println(contador);
                }


    
    
                break;
            case 20:
                System.out.print("Ingrese el número de empleados: ");
                valorOne = scanner.nextInt();

                if (valorOne <= 0) {
                System.out.println("El número de empleados debe ser mayor a 0.");
                scanner.close();
                return;
                }
                valorTwo = 0;
                System.out.println("Ingrese el sueldo de cada empleado:");
                for (contador = 1; contador <= valorOne; contador++) {
                System.out.print("Sueldo del empleado " + contador + ": ");
                valorThree = scanner.nextInt();
                if (valorThree < 0) {
                System.out.println("El sueldo no puede ser negativo. Intente nuevamente.");
                contador--; 
                continue;
                }
                valorTwo += valorThree;
                }
                operation = valorTwo / valorOne;
                System.out.println("El sueldo promedio del grupo de trabajadores es de: " + operation);
    
    
                break;
            case 21:
                System.out.print("Ingrese La Cantidad Total de Personas: ");
                valorOne=scanner.nextInt();
                valorTwo=0;
                valorThree=0;
        
                for (contador=1;contador<=valorOne;contador+=1) {
                System.out.print("Ingrese la Edad de la Persona "+contador+" :");
                valorOne=scanner.nextInt();
                if(valorOne<=18){
                valorTwo+=1;
                }
                else{
                
                    valorThree+=1;
                }
           
            }
                    System.out.println("La cantidad de Personas Mayores son: "+valorThree);
                System.out.println("La cantidad de Personas Menores son: "+valorTwo);
    
    
                break;
            case 22:
                System.out.print("Ingrese el primer número (PN): ");
                valorOne = scanner.nextInt();
        
                System.out.print("Ingrese el segundo número (SN): ");
                valorTwo = scanner.nextInt();
                valorThree= 0;
                for (contador = 1; contador <= valorTwo; contador++) {
               valorThree += valorOne;
                }
                System.out.println("El producto de " + valorOne + " y " + valorTwo + " es: " + valorThree);
    
    
                break;
            case 23:
                 System.out.println("Ingrese 10 números enteros:");

                for ( contador = 1; contador <= 10; contador++) {
                System.out.print("Ingrese el número " + contador + ": ");
                valorOne = scanner.nextInt();

                operation = valorOne % 2;

                if (operation == 0) {
                continue; 
            }

                System.out.println("Número impar ingresado: " + valorOne);
            }
    
    
                break;
                case 24:
                 System.out.print("Ingrese el valor general para crear la serie: ");
                valorOne = scanner.nextInt();

            if (valorOne <= 0) {
                System.out.println("Por favor, ingrese un valor entero positivo.");
        } else {
            System.out.println("Numeros de la Serie: ");
                contador=1;
                while (contador < valorOne) {
                System.out.println(contador); 
                contador= (contador * contador) + 1; 
            }

        }
    
    
                break;
            case 25:
                text = "V"; 
        

        while (text.equals("V")) {
            System.out.print("Ingrese una letra: ");
            letra = scanner.nextLine().charAt(0); 

           
            switch (Character.toLowerCase(letra)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    text = "R"; 
                    System.out.println("Ingresaste una vocal.");
                    break;
                default:
                    text = "V"; 
                    System.out.println("No es una vocal. Intenta de nuevo.");
                    break;
            }
        }
    
    
                break;
            case 26:
                valorOne=0;
                valorTwo=1;
                valorThree=valorOne+valorTwo;
                    System.out.println("SERIE DE FIBONACCI");
                System.out.println(valorOne);
                System.out.println(valorTwo);

            while (valorThree<100000) {
           
                valorOne=valorTwo;
                valorTwo=valorThree;
                valorThree=valorOne+valorTwo;
             System.out.println(valorThree);
        }
            break;
            case 27:
                System.out.println("OPERADORES ARITMETICOS");
                System.out.println("Suma "+"(+)");
                System.out.println("Resta"+"(-)");
                System.out.println("Multiplicacion "+ "(*)");
                System.out.println("Potencia "+" (^)");

                System.out.print("Ingresa Un Numero A: ");
                valorOne=scanner.nextInt();

                System.out.print("Ingresa Un Numero B: ");
                valorTwo=scanner.nextInt();
        
                System.out.print("segun el simbolo, elije un operador: ");
                letra=scanner.next().charAt(0);


            switch (letra) {
            case '+':
                operation=valorOne+valorTwo;
                System.out.println("El operationado de la SUma es: "+operation);
                break;
            case '-':
                if(valorOne>valorTwo){
                    operation=valorOne-valorTwo;
                    System.out.println("El operationado de la Resta es: "+operation);
                }
                else{
                    operation=valorTwo-valorOne;
                    System.out.println("El operationado de la Resta es: "+operation);
                }
                break;
            case '*':
                operation=valorOne*valorTwo;
                System.out.println("El operationado de la multiplicacion es: "+operation);
                break;
            case '^':
                operation=valorOne^valorTwo;
                System.out.println("El Numero A elevado al Numero B es : "+operation);
                break;
            default:
                operation=0;
                System.out.println("El operador ingresado es invalido");
                break;

        }
            break;
            case 28:
                valorOne = 0;       
                valorTwo = 0;  

        for (contador = 1; contador <= 10; contador++) {
                System.out.print("Ingresa una letra o vocal aleatoria: ");
                letra = scanner.next().charAt(0);

            switch (letra) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    valorOne++; 
                    break;

                default:
                    valorTwo++; 
                    break;
            }
        }

                System.out.println("Cantidad de vocales ingresadas: " + valorOne);
                System.out.println("Cantidad de consonantes ingresadas: " + valorTwo);
            break;
            case 29:
                System.out.print("Ingresa la cantidad de Electores: ");
                valorOne=scanner.nextInt();
                System.out.println("Para elegir al candidato, Ingrese los numeros en parentesis: ");
                System.out.println("Candidato A (1)");
                System.out.println("Candidato B (2): ");
                System.out.println("Candidato C (3)");
                valorOne = 0; 
                valorTwo = 0; 
                valorThree = 0; 
                product = 0; 


        for (contador = 1; contador <= valorOne; contador++) {
                System.out.print("Ingrese el voto del elector " +contador + ":");
                product = scanner.nextInt(); 

               
            switch (product) {
                case 1:
                    valorOne++; 
                    break;
                case 2:
                    valorTwo++;
                    break;
                case 3:
                    valorThree++;
                    break;
                default:
                    product++;
                    break;
            }
        }

        if (valorOne > valorTwo && valorOne > valorThree) {
            valorSix= 1; 
        } else if (valorTwo > valorOne && valorTwo > valorThree) {
            valorSix= 2; 
        } else if (valorThree > valorOne && valorThree > valorTwo) {
            valorSix= 3; 
        } else {
            valorSix= 0; 
        }

        
                System.out.println("resultados finales:");
                System.out.println("Usuario 1: " + valorOne + " votos.");
                System.out.println("Usuario 2: " + valorTwo + " votos.");
                System.out.println("Usuario 3: " + valorThree + " votos.");
                System.out.println("Votos nulos/blancos: " + product);
                System.out.println("Ganador: Usuario " + valorSix);

            break;
            case 30:
                System.out.print("Ingre el Valor del Numero A: ");
                valorOne=scanner.nextInt();
                System.out.print("Ingrese el Valor del Numero B: ");
                valorTwo=scanner.nextInt();

                operation = valorOne+valorTwo;
                product= operation/2;

                System.out.println("El Promedio entre los dos numeros es: "+product);
            break;
            default:
                break;
        }
        scanner.close();
    }
}
