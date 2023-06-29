class Test1  {
	
}
public class Den extends Test1 {
	
public static void main (String args[]) {
	
Test t = new Test ();
Den d = new Den ();
Boolean res = t.equals(d);
System.out.println(res);
}
}