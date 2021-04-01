package p1;

public class Employee {
	
	private int empId;
	private String empName;
	private int salary;
	private String projectName;
	
//==========for employee name =========================	
	public void doNameChange(String newName)
	{
		empName = newName;
	}
	
	public String fetchEmpName()
	{
		return empName;
	}
	
	//==========for employee id =========================	
	public void doIdChange(int newId)
	{
		empId = newId;
	}
	
	public int fetchEmpId()
	{
		return empId;
	}
	//==========for Project =========================	
	public void doProjectNameChange(String newProjectName)
	{
		projectName = newProjectName;
	}
	
	public String fetchProjectName()
	{
		return projectName;
	}
	//==========for Salary =========================
	public void doSalaryChange(int newSalary)
	{
		salary = newSalary;
	}
	
	public int fetchSalary()
	{
		return salary;
	}
	
	
	
	
	
	
	public void workingOnProject()
	{
		// 1000 lines of code ...
		System.out.println
		(empName+" working on "
				+ ""+projectName);
		
		
		
	}
	
	

}//end class
