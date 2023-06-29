class Parent{
	static void m1() 
	{
		System.out.println("I m parent");
	}
}

 class Child extends Parent {
	static void m1()
	{
		System.out.println("I m child");
	}

	public static void main(String[] args) {
		Parent p = new Child();// Up-casting
		p.m1();
		Child c = new Child();
		c.m1();
	}

}
