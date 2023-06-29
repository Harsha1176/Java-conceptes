class Operation{
void sum (int x,int y) {System.out.println(x+y);}
void sum (int x,int y,int z) {System.out.println(x+y+z);}
void sum (int x,int y,int z,int a) {System.out.println(x+y+z+a);}
void sum(int x,int y,int z,int a,int b) {System.out.println(x+y+z+a+b);}
}


class Demo {
public static void main(String[] args)
{
	Operation operation = new Operation();
	operation.sum(10,2);
	operation.sum(10,2,1);
	operation.sum(10,2,1,2);
	operation.sum(10,2,1,4,5);
}
}

//method overloading by same name of method with multiple time uses and no.of parameter should be different and,in same class
