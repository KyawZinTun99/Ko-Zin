package practice;
//Address class
class Address {
 String city, state, country;

 public Address(String city, String state, String country) {
     this.city = city;
     this.state = state;
     this.country = country;
 }
}

//Student class with Aggregation
class Students {
 String name;
 int id;
 Address address; // Aggregation (HAS-A)

 public Students(String name, int id, Address address) {
     this.name = name;
     this.id = id;
     this.address = address;
 }

 public void display() {
     System.out.println("Student: " + name + ", ID: " + id);
     System.out.println("Address: " + address.city + ", " + address.state + ", " + address.country);
 }
}

//Main class
public class Aggregation1 {
 public static void main(String[] args) {
     Address addr = new Address("Yangon", "Yangon Region", "Myanmar");
     Students student = new Students("Aung Aung", 101, addr);

     student.display();
 }
}
