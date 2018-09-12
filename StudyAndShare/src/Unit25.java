
public class Unit25 {
	public static void main (String[] args) {
	Boss b1 = new Boss();
	System.out.println(b1.age);
	System.out.println(b1.name);
	System.out.println(b1.address);
	//System.out.println(b1.numberOfwives); //Error when using the private attribute
	//Thuộc tính của class là private
	
	b1.showWives();
	b1.showName();
	b1.showAddress();
	//b1.showAge(); //Phương thức truy cập là private
	
	}
}

class Boss {
	public int age; //Everywhere
	protected String name; //Same package, subclass
	String address; //Same package
	private int numberOfwives; //Only for it
	
	private void showAge() {
		System.out.println(age);
	}
	void showName() {
		System.out.println(name);
	}
	protected void showAddress() {
		System.out.println(address);
	}
	public void showWives() {
		System.out.println(numberOfwives);
	}
}

