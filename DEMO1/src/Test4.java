class Employee
{
	private Integer empNo;
	private String empName;
	private Float empSal;
	
	//for write use setter method
	public void setEmpNo(Integer empNo)
	{
		this.empNo=empNo;
	}
	
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	
	public void setEmpSal(Float empSal)
	{
		this.empSal=empSal;
	}
	
	//for read use getter method
	public Integer getEmpNo()
	{
		return empNo;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	
	public Float getEmpSal()
	{
		return empSal;
	}
	
}
class Test4 {

	public static void main(String[] args) 
	{
		Employee employee= new Employee();
		System.out.println("No is:"+employee.getEmpNo());
		System.out.println("Name is:"+employee.getEmpName());
		System.out.println("Sal is:"+employee.getEmpSal());
		
		System.out.println("--------------------------------");
		employee.setEmpNo(101);
		employee.setEmpName("Harsha");
		employee.setEmpSal(9999.15F);
		
		System.out.println("No is:"+employee.getEmpNo());
		System.out.println("Name is:"+employee.getEmpName());
		System.out.println("Sal is:"+employee.getEmpSal());
		

	}

}



