public class Account extends Bank{
	private int acc_id;
	private String acc_Name;
	private double acc_bal;
	
	public int getAcc_id(){
		return acc_id;
	}
	public void setAcc_id(int acc_id){
		this.acc_id=acc_id;
	}
	public String setAcc_Name(String acc_Name){
		System.out.println("Hello");
	}
}