
import java.util.Scanner;
import java.util.Arrays;


public class Uusario {

public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    

    int[] arreglo= new int[10];

    for(int x = 0; x<10; x++){
        System.out.println("Digita un numero: ");
        arreglo[x]= scanner.nextInt();
    }
    Arrays.sort(arreglo);
    for(int i = 0; i < 10; i++){
        System.out.print(arreglo[i]);
    }

    scanner.close();
}
  
    
}