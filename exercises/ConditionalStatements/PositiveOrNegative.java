package exercises.ConditionalStatements;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");

        
        if (sc.hasNextInt()){
            int number = sc.nextInt();
            if (number > 0){
                System.out.println("Positivo");
            } else if (number < 0 ){
                System.out.println("Negativo");
            } else{
                System.out.println("Ingresa un numero");
            }
        }
    }
}
