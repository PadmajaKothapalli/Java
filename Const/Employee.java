public class Employee{
	int eid;
	String ename;
	
	public Employee(int id, String name){
		this.eid=id;
		this.ename=name;
		System.out.println("Const execute automatically");
	}
	public static void main(String[] args){
		Employee e1=new Employee(101,"Raja");
		Employee e2=new Employee(102,"Rani");
		System.out.println("Employee Name:"+e1.ename);
		System.out.println("Employee Name:"+e2.ename);
	}
}