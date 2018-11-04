/*
Test 2 + 3 (90 phút)
- Tạo cơ sở dữ liệu có tên là tên của bạn. Ví dụ bạn tên là Hoàng thì tạo cơ sở
dữ liệu có tên là hoang
- Tạo bảng tbluser có các trường và kiểu dữ liệu như mô tả:
Tên trường  Kiểu dữ liệu        Mô tả
id          int                 Khoá chính, tự động tăng
code        varchar(20)         Mã sinh viên
name        varchar(255)        Tên sinh viên
dob         date                Ngày sinh
gender      varchar(10)         Giới tính (nam, nữ)
pob         varchar(255)        Quê quán
avgmark     float(8,2)          Điểm trung bình học kỳ
- Viết ứng dụng Java hiển thị menu như sau:
1. Nhập sinh viên
2. Hiển thị danh sách sinh viên
3. Xoá sinh viên
4. Cập nhật thông tin sinh viên
5. Hiển thị danh sách sinh viên có học bổng
6. Thoát
    Mời nhập lựa chọn:

    Khi người lựa chọn chọn 1 thì cho phép nhập các thông tin của sinh viên từ
bàn phím rồi chèn thông tin vào bảng tbluser. Chọn 2 thì hiển thị danh sách của
sinh viên đã nhập ra màn hình (sử dụng jdbc và Collection framework). Chọn 3 thì
cho người dùng nhập mã của sinh viên cần xoá rồi xoá sinh viên đó ra khỏi bảng
tblstudent. Chọn 4 cho phép người dùng nhập mã sinh viên cần cập nhật thông tin
và các thông tin cần cập nhật sau đó cập nhật thông tin của sinh viên trong bảng
tblstudent. Chọn 5 thì hiển thị danh sách các sinh viên có học bổng (sinh viên
có học bổng là sinh viên có điểm trung bình học kỳ >= 3.0) và tiền học bổng của
sinh viên biết rằng.
Điểm 3.0 <= tbc học kỳ < 3.5 là 1 200 000 đồng/tháng
Điểm 3.5 <= tbc học kỳ < 3.8 là 2 000 000 đồng/tháng
Điểm 3.8 <= tbc học kỳ là 3 000 000 đồng/tháng
 */
package test0203;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class TEST0203 {

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Danh mục chức năng");
            System.out.println("1. Nhập sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Xoá sinh viên");
            System.out.println("4. Cập nhật thông tin sinh viên");
            System.out.println("5. Hiển thị danh sách sinh viên có học bổng");
            System.out.println("6. Sắp xếp sinh viên theo tên");
            System.out.println("7. Sắp xếp sinh viên theo mã");
            System.out.println("8. Sắp xếp sinh viên theo Id");
            System.out.println("9. Thoát");
            System.out.print("? Chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sm.insertSV();
                    break;
                case 2:
                    sm.view();
                    break;
                case 3:
                    sm.deleteSV();
                    break;
                case 4:
                    sm.updateSV();
                    break;
                case 5:
                    //Tìm kiếm học bổng
                    break;
                case 6:
                    sm.sxN();
                    break;
                case 7:
                    sm.sxC();
                    break;
                case 8:
                    sm.sxI();
                    break;
                case 9:
                    System.out.println("Thoát chương trình!");
                    break;
            }
        } while (choice != 9);
    }
}
