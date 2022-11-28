class Main{
	public static void main(String[] args){
		String text="How to split string in java";
		String[] result= text.split(" ");
		System.out.println("result= ");
		for(String str : result){
			System.out.print(str + ",");
		}
	}
}