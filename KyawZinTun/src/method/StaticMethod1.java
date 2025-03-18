package method;

public class StaticMethod1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 19;
        int b = 29;

        // Mathadd class ကို object တစ်ခုဖန်တီးပြီး method ကိုခေါ်မယ်
        Mathadd math = new Mathadd();
        math.add(a, b);
    }
}

// Mathadd ကို independent class အနေနဲ့ ထားပြီး static မသုံးတော့ဘူး
class Mathadd {
    void add(int a, int b) {
        System.out.println("Addition Result: " + (a + b));
    }
}
