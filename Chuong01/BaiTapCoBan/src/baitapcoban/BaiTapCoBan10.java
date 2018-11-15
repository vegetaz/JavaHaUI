/* String
 *
 * Phương thức                              Mục đích
 *
 * compareTo                                So sánh với một chuỗi khác
 * concat                                   Thêm thông tin vào chuỗi đã có
 * replace(char oldChar, char newChar)      Thay thế ký tự trong chuỗi
 * substring(int beginIndex, int endIndex)  Trả về một chuỗi con trong chuỗi lớn
 * toLowerCase()                            Chuyển chuỗi về dạng chữ thường
 *
 * toUpperCase()                            Chuyển chuỗi về dạng chữ in hoa
 * trim                                     Loại bỏ ký tự trắng khỏi chuỗi
 * indexOf                                  Trả về vị trí đầu tiên của một ký tự hoặc chuỗi cần tìm
 * lastIndexOf                              Trả về vị trí cuối của một ký tự hoặc chuỗi cần tìm
 * contains                                 Kiểm tra xem chuỗi có chứa ký tự
 *                                          String strCorp = "";
 *                                          boolean b = strCorp.contains("S");
 *
 * isEmpty                                  Kiểm tra chuỗi ký tự có rỗng không
 * length                                   Lấy độ lớn của một chuỗi
 * toString                                 Chuyển về một chuỗi
 * equals                                   So sánh bằng với một chuỗi
 * split                                    Trả về một mảng từ chuỗi được chia
 *
 * toCharArray                              Chuyển chuỗi về một mảng ký tự
 * startWith                                Kiểm tra xem chuỗi có bắt đầu bằng ký tự hoặc chuỗi so sánh không
 * endWith                                  Kiểm tra xem chuỗi có kế thúc bằng ký tự hoặc chuỗi so sánh không
 * 
 * StringBuilder                            Giúp thao tác nhanh với các chuỗi, ít tổn hao bộ nhớ hơn so với String
 */
package baitapcoban;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan10 {

    public static void main(String[] args) {
        String s1 = "Nguyễn";
        String s2 = "Văn Vận";
        //
        int x = s1.compareTo(s2);
        //
        System.out.println("Giá trị so sánh: " + x);
        //Nếu s1 > s2 thì trả về giá trị dương
        //Nếu s1 < s2 thì trả về giá trị âm
        //Nếu s1 = s2 thì trả về trị bằng 0
        //
        //String concat = s2.concat(" - Vận Già");
        s2 = s2.concat(" - Vận Già");
        System.out.println(s2);
        //Thay thế
        s2 = s2.replace('-', '+');
        System.out.println(s2);
        //
        int idx = s2.indexOf('V');
        System.out.println("Vị trí của V đầu tiên: " + idx);
        int ldx = s1.lastIndexOf('n');
        System.out.println("Vị trí của n cuối cùng: " + ldx);
        //
        //Chia chuỗi
        s2 = "25;10;19;89";
        String[] a = s2.split(";");
        System.out.println("Danh sách các phần tử");
        for (String string : a) {
            System.out.println(string);
        }
    }
}
