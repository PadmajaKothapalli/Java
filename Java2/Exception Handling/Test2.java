class Test2{
	public static void main(String[] args){
		int[] marks={55,65,45,95,85,75,66};
		System.out.println(marks[5]); //75
		try{
			System.out.println(marks[10]);  //Index 10 out of bounds for length 7
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(marks[2]);//45
		System.out.println(marks[3]);//95
		System.out.println(marks[4]);//85
	}
}