package Jwd;
enum Level {
    LOW, MEDIUM, HIGH;
}

public class EnumTest {
    public static void main(String[] args) {
        
    	Level myLevel = Level.HIGH;

        if (myLevel == Level.HIGH) {
            System.out.println("High level selected!");
        }
    }
}
