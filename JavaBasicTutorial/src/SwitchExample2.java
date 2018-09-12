
public class SwitchExample2 {

	public static void main(String[] args) {
		 // Khai báo một biến age (tuổi)
        int age = 300;
 
        // Kiểm tra giá trị của age.
        switch (age) {
        // Trường hợp tuổi bằng 18
        case 18:
            System.out.println("You are 18 year old");
            break;
        // Các trường hợp 20, 30, 40 tuổi.
        case 20:
        case 30:
        case 40:
            System.out.println("You are " + age);
            break;
        // Các trường hợp còn lại
        default:
            System.out.println("Other age");
        }

	}

}
