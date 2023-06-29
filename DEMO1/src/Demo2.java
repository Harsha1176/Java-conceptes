
class Operation1
{
	void show (int x ,int y) {
	System.out.println("Hello");
}
void show (int x,String y) {
	System.out.println("Hii");
}
}
public class Demo2 {

	public static void main(String[] args) {
		
		Operation1 operation = new Operation1();
		operation.show(0, 0);
		// method overloading by type of parameter should be different

	}

}
