package myfile;
class Test 
{
	
}
public class Dem extends Test
{

	public static void main(String[] args) {
		Test t = new Test();
		Boolean res = t instanceof Test;
		System.out.println(res);
       
		Dem d = new Dem();
        Boolean res1=d instanceof Dem;
        System.out.println(res1);
		
      Test td = new Dem ();
      Boolean res2=td instanceof Test;
      Boolean res3=d instanceof Dem;
      System.out.println(res2);
      System.out.println(res3);
        
	}

}
