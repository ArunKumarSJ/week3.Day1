package week3.Day1;

public class Desktop extends Computer {
	public void computerSize1() {
		System.out.println("Intel Core i3,4GB,1TB,Win 10Desktop");
	}
	public void computerSize2() {
		System.out.println("Intel Core i5,8GB,1TB,Win10 Desktop");
	}
	public void computerSize3() {
		System.out.println("MK142HN/A");
	}
	public static void main(String[] args) {
	
		Computer cObj=new Computer();
		cObj.computermodel1();
		cObj.computerModel2();
		cObj.computerModel3();
		
	System.out.println("**********Computer Model Name and Their Size");
	
		Desktop DObj=new Desktop();
		DObj.computermodel1();
		DObj.computerModel2();
		DObj.computerModel3();
		DObj.computerSize1();
		DObj.computerSize2();
		DObj.computerSize3();
	}

}
