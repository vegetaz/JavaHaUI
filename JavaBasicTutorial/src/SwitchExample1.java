
public class SwitchExample1 {

	public static void main(String[] args) {
		// Khai báo một biến age (tuổi)
        int age = 100;
 
        // Kiểm tra giá trị của age
        switch (age) {
        // Trường hợp tuổi bằng 18
        case 18:
            System.out.println("You are 18 year old");
            break;
        // Trường hợp tuổi bằng 20
        case 20:
            System.out.println("You are 20 year old");
            break;
        // Các trường hợp còn lại
        default:
            System.out.println("You are not 18 or 20 year old");
        }

	}

}
