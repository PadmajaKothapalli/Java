interface LoginDAO{
	int x=10;
	void login();
	void logout();
}
class LoginImpl implements LoginDAO{
	public void login(){
		System.out.println("Login Successfull");
	}
	public void logout(){
		System.out.println("Successfully logout");
	}
	public static void main(String[] args){
		LoginImpl obj= new LoginImpl();
		obj.login();
		obj.logout();
		System.out.println(LoginImpl.x);
	}
}