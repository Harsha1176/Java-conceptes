class Test
{
	
}
public class Demo extends Test
{

	public static void main(String[] args) {
		Demo d = new Demo();
		Test t = new Test ();
		System.out.println(d.hashCode());
        System.out.println(t.hashCode());
        
        System.out.println(d.toString());
        System.out.println(t.toString());
	}

}
