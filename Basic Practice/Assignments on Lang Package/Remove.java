class RemoveChar{
	public static void main(String[] args){
		String str="Remove a given Character from string";
		System.out.println(charRemoveAt(str, 10)); // 'i' should be disappear
	}
	public static String charRemoveAt(String str, int p){
		return str.substring(0,p)+ str.substring(p+1);
	}
}