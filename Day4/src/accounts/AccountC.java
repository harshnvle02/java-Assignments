package accounts;

public class AccountC {

	private static int cnt;
	private static float int_rate;
	private static int mini_bal;
	
	static 
	{
		cnt=1;
		int_rate=0.08f;
		mini_bal=10000;
	}
	
	private String id;
	public String acName;
	public String acType;
	public double balance;
	
	public AccountC()
	{
		this.id=null;
		this.acName=null;
		this.acType=null;
		this.balance=0.0;
	}
	public AccountC(String acName, String acType,double balance)
	{
		this.id=generateId(acName);
		this.acName=acName;
		this.acType=acType;
		this.balance=balance;
	}
	private String generateId(String acName) {
		String code="";
		if(acName !=null)
		{
			code=acName.substring(0,3)+cnt;
			
		}
		else
		{
			code="XXX"+cnt;
		}
		cnt++;
		return code;
	}
	
	public static float getInt_rate() {
		return int_rate;
	}
	public static void setInt_rate(float int_rate) {
		AccountC.int_rate = int_rate;
	}
	public static int getMini_bal() {
		return mini_bal;
	}
	public static void setMini_bal(int mini_bal) {
		AccountC.mini_bal = mini_bal;
	}
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountC [id=" + id + ", acName=" + acName + ", acType=" + acType + ", "
				+ "balance=" + balance + "]";
	}
	
	
}
