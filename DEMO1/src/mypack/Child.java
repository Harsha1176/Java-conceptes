package mypack;
class Grand{
	Grand(){
//		super();
		System.out.println("Grand");
	}
}
 class Father extends Grand{
	Father(int a) {
		super();
		System.out.println("this is no."+a);
		System.out.println("Father");
	
	}
}
public class Child extends Father {

	public Child() {
		super(34);
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Child child= new Child();
      Father f = new Child();
	}

}
