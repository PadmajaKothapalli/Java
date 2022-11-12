class A{
	int i=10;
	void m1(){
		System.out.println("Hello");
	}
}
public class AM{
	public static void main(String[] args){
		A obj= new A();
		obj.i=20;
		System.out.println(obj.i);
		obj.m1();
	}
}