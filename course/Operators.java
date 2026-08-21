package course;

public class Operators {
    public static void main(String[] args) {
        int a = 5;
        int post = a++; // post toma 5, luego 'a' sube a 6
        int pre = ++a;  // 'a' sube a 7, luego pre toma 7
        System.out.println("post: " + post + ", pre: " + pre + ", final a: " + a);
   
    }
}
