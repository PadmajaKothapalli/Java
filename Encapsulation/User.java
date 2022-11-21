public class User{
	private String userName;
	private String emailId;
	
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getEmailId(){
		return emailId;
	}
	public void setEmailId(String emailId){
		this.emailId=emailId;
	}
	public static void main(String[] args){
		User a1=new User();
		a1.setUserName("Parth");
		a1.setUserName("Parth123@gmail.com");
		System.out.println(a1.getUserName());
		System.out.println(a1.getEmailId());
	}
}