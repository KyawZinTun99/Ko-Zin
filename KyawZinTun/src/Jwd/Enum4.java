package Jwd;  // Package သတ်မှတ်ခြင်း

// Enum ကို Constructor နှင့်တည်ဆောက်ခြင်း
public class Enum4 {
    enum Season {
        WINTER(5), SPRING(10), SUMMER(15), FALL(20); 

        private int value;  // Enum ထဲမှာ integer တန်ဖိုးသိမ်းမယ့် variable

        // Constructor ကို private သတ်မှတ်ပြီး value ကို assign လုပ်ခြင်း
        private Season(int value) {
            this.value = value;
        }
    }

    // Main Method (Program Execution)
    public static void main(String args[]) {
        // Enum ထဲက တန်ဖိုးအားလုံးကို Loop ဖြင့် Print ထုတ်ခြင်း
        for (Season s : Season.values()) 
            System.out.println(s + " " + s.value);  
    }
}
// ဒီ Code မှာ getCode() Method မရေးထားတာဘာဖြစ်လဲ? (Burmese Explanation)
//ဒီ Code မှာ getCode() method မရှိပဲ s.value ဖြင့် တိုက်ရိုက် access လုပ်ထားတာက Private Access Rule ကို ချိုးဖောက်နေပါတယ်။
//✔ Java မှာ private variable တွေကို class အပြင်ဘက်က တိုက်ရိုက် access လုပ်လို့မရပါဘူး။
//✔ ဒါကြောင့် s.value ဟာ Java မှာ Compilation Error ဖြစ်စေနိုင်ပါတယ်။
//need to write enum 6
