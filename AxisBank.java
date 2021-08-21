package week3.Day1;

public class AxisBank extends Bankinfo {
	public void deposit() {
		System.out.println("Rs.50,000 is Deposited in Deposite Machine");
	}
public static void main(String[] args) {
	Bankinfo bObj= new Bankinfo();
	bObj.deposit();
	bObj.fixed();
	bObj.saving();
	
	System.out.println("*****AXIS BANK******");
	
	AxisBank AxObj=new AxisBank();
	AxObj.fixed();
	AxObj.saving();
	AxObj.deposit();
}

}