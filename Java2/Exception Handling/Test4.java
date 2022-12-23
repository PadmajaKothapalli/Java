class Test4{
	public static void main(String[] args){
		int[] marks={35,45,55,65,75,85};
		System.out.println(marks[0]);
		try{
			System.out.println(marks[10]);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[5]);
		System.out.println(marks[0]);
		System.out.println(marks[1]);

	}
}