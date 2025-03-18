
//Non-Static Method Example (Return Value ပါတဲ့ Example)
package method;
public class MethodExample4 {
    // Non-static method with parameters and return value
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Object တစ်ခုဖန်တီးရန်
    	 MethodExample4  calculator = new  MethodExample4 ();
        
        // Non-static method ကို Object မှတဆင့်ခေါ်သုံးခြင်း
        int result = calculator.add(10, 20);
        System.out.println("Result: " + result);
    }
}
