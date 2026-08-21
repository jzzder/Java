package course;

public class Loops {
    public static void main(String[] args) {
     // repeat this statement 4 times
     // loop - while , do while, for
     
     // 100  

    //int i = 1;

    // while (i <= 4){
    //    System.out.println("hola" + i);
    //    i++;
    // }

    // System.out.println("Bye" + i );

    // int i = 1;

    //while(i<=4){
      //  System.out.println("Hola" + i);
        // int j = 1;

    //    while(j<=3){
      //      System.out.println("Jazmin");
        //    j++;
       // }
       // i++;
    //} 
    //System.out.println("Bye" + i);

    // int i = 5;

    // do
   // {
     //   System.out.println("Hi" + i);
       // i++;
    // }while(i <= 4);

    // for

    //for( int i = 1; i <= 5; i++){
      //  System.out.println(i);
    // }

    // foor inner loop
    for (int i = 1; i <= 5; i++) {
        System.out.println("DAY " + i);
        for (int j = 1; j <= 9 ; j++) {
            System.out.println(" " + (j+8));
        }
    }

    }
}