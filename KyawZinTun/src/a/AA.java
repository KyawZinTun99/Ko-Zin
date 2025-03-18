package a;

import b.BA;

public class AA {

public static void main(String []args) {

AB ab=new AB();

ab.defaultMethod();
ab.protectedMethod();
ab.publicMethod();
/*ab.privateMethod();*/
BA ba=new BA();
ba.publicMethod();

}

}