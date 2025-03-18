package practice;
import java.util.ArrayList;
import java.util.List;
class Animal5{
public String toString() {
return "Animal";
}
}
class Dog5 extends Animal5{
public String toString() {
return "Dog";
}
}
class Cat5 extends Animal5{
public String toString() {
return "Cat";
}
}

public class GenericsTest3 {
public static void main(String [] args) {
	
List<Animal5> list1=new ArrayList();
list1.add(new Animal5());
list1.add(new Dog5());
list1.add(new Cat5());
print(list1);
display(list1);

List<Dog5> list2=new ArrayList();
list2.add(new Dog5());
print(list2);
display(list2);

List<Cat5> list3=new ArrayList();
list3.add(new Cat5());
print(list3);
//display(list3); Error
}
public static void print(List<? extends Animal5>list){
List list1=list;
for(Object o:list1)
System.out.println(o);
}
public static void display(List<? super Dog5>list){
List list1=list;
for(Object o:list1)
System.out.println(o);
}
}