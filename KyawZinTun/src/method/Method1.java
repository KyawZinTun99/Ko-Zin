package method;
public class Method1{
    public static void main(String [] args) {
        System.out.println(methodA("David"));
        System.out.println(methodA(25));
        System.out.println(methodA(3.14));
        System.out.println(methodA(true));
    }

    public static String methodA(String s) {
        return "Hello " + s;
    }

    public static String methodA(int num) {
        return "Hello " + num;
    }

    public static String methodA(double num) {
        return "Hello " + num;
    }

    public static String methodA(boolean b) {
        return "Hello " + b;
    }
}
