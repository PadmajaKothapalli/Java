class E{
	public static void main(String[] args){
		int[] size={38,45,55,62,45,69,79};
		char availability='Y';
		String ename="Ram";
		System.out.println(size);     //garbage value  [I@3fee733d
		System.out.println(availability);    //Y
		System.out.println(ename);       //Ram
		System.out.println(size.length);      //7
		System.out.println(ename.length());   //3
	}
}