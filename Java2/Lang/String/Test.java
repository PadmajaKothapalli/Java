class Test{
	public static void main(String[] args){
		String s1="Krishna";
		s1.concat("Vasudeva");
		
		StringBuffer s2= new StringBuffer("Krishna");
		s2.append("Vasudeva");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.length());
		}
}