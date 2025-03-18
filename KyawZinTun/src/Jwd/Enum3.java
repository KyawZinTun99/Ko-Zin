package Jwd;

import Jwd.Day;// ma par lell bar ma phyit bue

enum Day { MON,TUE,WED,THU,FRI, SAT, SUN}
public class Enum3{

public static void main(String[] args) {
Day s=Day.MON;
System.out.println(s);
for (Day mm : Day.values())
System.out.println(mm);

}

}