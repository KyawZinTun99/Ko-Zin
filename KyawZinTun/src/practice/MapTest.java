package practice;
import java.util.HashMap;
import java.util.Map;
public class MapTest{

public static void main(String args[]){
Map<Integer,String> map=new HashMap();
map.put(100,"Sue");
map.put(101,"Mary");
map.put(102,"Jones");

//Elements can traverse in any order


for(Map.Entry m:map.entrySet()){

System.out.println(m.getKey()+" "+m.getValue());

// exists or not

Integer keyToCheck=100;
if (map.containsKey(keyToCheck)) {
	System.out.println("Key"+keyToCheck+ "exists");}
	else {
		System.out.println("Key"+keyToCheck+"does not exist.");}

String valueToCheckString ="Kyaw";
if (map.containsValue(valueToCheckString)) {
System.out.println("Value" +valueToCheckString +"exists");}
else {
	System.out.println("Value"+valueToCheckString+"does not exist.");}

}
}
}

