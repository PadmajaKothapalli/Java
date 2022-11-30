class A{
	public static void main(String[] args){
		String s1="Lakshmi";
		s1.concat("Prasanna");
		
		StringBuffer s2= new StringBuffer("Lakshmi");
		s2.append("Prasanna");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.length());
	}
}