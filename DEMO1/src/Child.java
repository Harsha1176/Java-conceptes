class Father 
{
	int x= 100;
	int xo = 300;
}
 class Child extends Father {
      int x = 200;
      void display()
{ System.out.println(super.x+" "+this.x);
//System.out.println(Father.x+" "+Child.x);
}
	public static void main(String[] args) {
		Child c = new Child();
         c.display();
	}

}
