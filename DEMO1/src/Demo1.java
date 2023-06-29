
public class Demo1 {
	static void show() {
		display();
		System.out.println("A");
		process();
		
	System.out.println("Z");

}
static void display () {
	System.out.println("B");
	System.out.println("C");
}
static void process () {
System.out.println("D");
}
public static void main (String[] args) {
	System.out.println("E");
	show();
	System.out.println("F");

}}