package Jwd;

// simple enum form


enum Season { WINTER, SPRING, SUMMER, FALL }

public class Enum2{
public static void main(String[] args) {
	
Season s=Season.WINTER;
System.out.println(s);

for (Season ss : Season.values())
System.out.println(ss);

}

}