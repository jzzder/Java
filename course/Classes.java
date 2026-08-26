package course;

// class Computer{
//     public void playMusic(){
//         System.out.println("Music Playing..");
//     }

//     public String getMeAPen(int cost){
//         if(cost >= 10)
//             return "Pen";
//         else
//             return "Nothing";
//     }
// }

class Calculator{
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2){
        return n1 + n2;
    }

    public double add(double n1, int n2){
        return n1 + n2;
    }
}

public class Classes {
    public static void main(String[] args) {
        // Computer obj = new Computer();
        // obj.playMusic();

        // String str = obj.getMeAPen(1);
        // System.out.println(str);

        Calculator obj = new Calculator();
        int r1 = obj.add(10, 20, 20);
        System.out.println(r1);
    }
}
