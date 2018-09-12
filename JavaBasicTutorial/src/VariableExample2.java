
public class VariableExample2 {

	public static void main(String[] args) {
		// Khai báo 3 số kiểu long (Số nguyên 64 bit).
        long firstNumber, secondNumber, thirdNumber;
 
        // Gán giá trị cho firstNumber
        // Ký tự 'L' ở cuối để nói với java đây là kiểu long, 
        // phân biệt với kiểu int.
        firstNumber = 100L;
 
        // Gán giá trị cho secondNumber
        secondNumber = 200L;
 
        // Gán giá trị cho thirdNumber.
        thirdNumber = firstNumber + secondNumber;
 
        System.out.println("First Number = " + firstNumber);
        System.out.println("Second Number = " + secondNumber);
        System.out.println("Third Number = " + thirdNumber);

	}

}
