class Test{
	public void m1(Object obj){
		System.out.println("Object version");
	}
	public void m1(String s1){
		System.out.println("String class Version");
	}
	public static void main(String[] args){
		Test t = new Test();
		t.m1(new Object());
		t.m1(new String("Parth"));
		t.m1(null);
	}
}