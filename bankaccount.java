class Account
{
	private String name;
	private int account_no;
	private int amount;
	private int balance;
	private int deposit;
	private int withdraw;

	public String getname()
	{
		return name;
	}
	public int  getaccount_no()
	{
		return account_no;
	}
	public int getamount()
	{
		return amount;
	}
	public int getbalance()
	{
		return deposit+balance;
	}
	public int getdeposit()
	{
		return deposit;
	}
	public int getwithdraw()
	{

		return balance-withdraw;
	}

	public void setname(String mem_name)
	{
		name=mem_name;
	}
	public void setaccount_no(int mem_acc_no)
	{
		account_no=mem_acc_no;
	}
	public void setamount(int mem_amount)
	{
		amount=mem_amount;
	}
	public void setbalance(int mem_balance)
	{
		balance=mem_balance;
	}
	public void setdeposit(int mem_deposit)
	{
		deposit=mem_deposit;
	}
	public void setwithdraw(int mem_withdraw)
	{
		withdraw=mem_withdraw;
	}

}

class bankaccount
{
	public static void main(String args[])
	{
		Account a = new Account();
		a.setname("Rohith");
		a.setaccount_no(1234);
		//System.out.println("Available Balance "+a.getbalance());
		a.setdeposit(1000);
		System.out.println("Available Balance "+a.getbalance());
		a.setwithdraw(500);

	}
}