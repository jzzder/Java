package course;


class Calculator{
    int num;

    public int add(int n1, int n2){
        return n1 + n2;
    }
}

public class Classes1 {
    public static void main(String[] args) {
        int data = 10;

        Calculator obj = new Calculator();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}
