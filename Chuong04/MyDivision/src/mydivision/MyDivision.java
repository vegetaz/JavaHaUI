//Ví dụ về lan truyền lỗi
package mydivision;

/**
 *
 * @author veget
 */
public class MyDivision {

    /**
     * @param args the command line arguments
     */
    public static void A() {
        B();
    }

    public static void B() {
        C();
    }

    public static void C() {
        float a = 2 / 0;
    }

    public static void main(String[] args) {
        System.out.println("Gọi phương thức A()");
        A();
        System.out.print("Chương trình kết thúc bình thường!");
    }

}
