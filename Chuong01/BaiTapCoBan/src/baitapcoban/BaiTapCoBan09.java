/* List
 * List<type> name = new ArrayList<type>();
 * java.util.List;
 * add()        Thêm phần tử vào List
 * remove()     Xoá phần tử khỏi List
 * set()        Chèn phần tử vào List
                Có thể chỉ định vị trí thêm vào
                Có 2 tham số (index, value)
 * clear()      Xoá các phần tử khỏi List
 * contains()   Tìm giá trị trong List, trả về true hoặc false
 */
package baitapcoban;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan09 {
    public static void main(String[] args) {
        List lKhoaHoc = new ArrayList();
        //
        lKhoaHoc.add("Java");
        lKhoaHoc.add(25101989);
        lKhoaHoc.add(new Date());
        lKhoaHoc.add("PHP");
        //
        lKhoaHoc.remove("PHP");
        //
        lKhoaHoc.set(1, "Learnning");
        //
        System.out.println("======Danh Sách List:");
        for (Object object : lKhoaHoc) {
            System.out.println(object);
        }
    }
}
