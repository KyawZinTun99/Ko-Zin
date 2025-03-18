package day1;

public class ForEach {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String [] ary= {"A","B","C","D"};
     int num=1;
  
    for(String s:ary) {
if (s.equals ("C"))
     System.out.println(num +"."+s);
    
      num++; }
  }

}