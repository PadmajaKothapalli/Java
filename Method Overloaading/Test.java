class Test{
	public void m1(String s1){
		System.out.println("Sring class m1 method");
	}
	public void m1(StringBuffer s2){
		System.out.println("StringBuffer class m2 method");
	}
	public static void main(String[] args){
		Test t= new Test();
		t.m1("Parth");
		t.m1(new StringBuffer("Partha"));
		//t.m1(null);
	}
}