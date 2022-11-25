class Palindrome{
	public static void main(String[] args){
		String myString="soo";
		StringBuffer buffer= new StringBuffer(myString);
		buffer.reverse();
		String data=buffer.toString();
		if(myString.equals(data)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}