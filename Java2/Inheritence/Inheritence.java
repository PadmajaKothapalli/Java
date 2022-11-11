class Parent{
	public void m1(){
		System.out.println("Test case1");
	}
	public void m2(){
		System.out.println("Test case2");
	}
}
class child extends Parent{
	public void m3(){
		System.out.println("Test case3");
	}
		public static void main(String[] args){
			child obj1=new child();
			obj1.m1();
			obj1.m2();
			obj1.m3();
			Parent obj2=new child();
			obj2.m1();
			obj2.m2();
			//obj2.m3();      doesn't exist
		}
	
}