//Non-Static Method Example (Parameter ပါတဲ့ ဥပမာ)
package method;

public class MethodExample3 {
    // Non-static method
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        // Object တစ်ခုဖန်တီးရန်
         MethodExample3 greeting= new MethodExample3();
        
        // Non-static method ကို Object မှတဆင့်ခေါ်သုံးခြင်း
        greeting.sayHello("Aung Aung");
        greeting.sayHello("Thandar");
    }
}
