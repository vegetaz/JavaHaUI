//Ví dụ tiếp theo về lan truyền lỗi
//Xuất Exception tại khai báo method
package lantruyenloi;

/**
 *
 * @author veget
 */
public class LanTruyenLoi {

    public static void A() throws Exception {
        B();
    }

    public static void B() throws Exception {
        C();
    }

    public static void C() throws Exception {
        float a = 2 / 0;
    }

    public static void main(String[] args) {
        System.out.println("Gọi phương thức A()");
        try {
            A();
            System.out.println("Chương trình kết thúc bình thường!");
        } catch (Exception e) {
            System.out.print("Chương trình lỗi! ");
            System.out.println(e.getMessage());
        }
    }

}
