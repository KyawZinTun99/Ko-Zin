package Jwd;
//Enum ကို Status အနေနဲ့ ပြုလုပ်ခြင်း
enum Status {
 SUCCESS(200), NOT_FOUND(404), SERVER_ERROR(500); // Enum Members (Constants)

 private final int code; // Enum Variable (တန်ဖိုး သိမ်းမယ့် variable)

 // Enum Constructor (Enum Member တိုင်းက ဒီ constructor ကို call လုပ်မယ်)
 Status(int code) {
     this.code = code;
 }

 // Getter Method (Enum Variable ကို ပြန်ထုတ်ဖို့   // Getter Method (name ကို ပြန်ထုတ်ပေးမယ်))
 public int getCode() {
     return code;
 }
}

//Main Class 
public class Enum6 {
 public static void main(String[] args) {
     // Enum Member SUCCESS ရဲ့ code ကို Print ထုတ်မယ်
     System.out.println(Status.SUCCESS.getCode()); // Output: 200
 }
}
