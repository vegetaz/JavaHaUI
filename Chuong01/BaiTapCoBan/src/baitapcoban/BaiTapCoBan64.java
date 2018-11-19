/* Ngày - Tháng - Năm
 * Cho biết ngày - tháng - năm hiện tại
 * Là thứ mấy?
 * Là tuần thứ mấy trong năm?
 * Hãy cho biết một tuần sau là ngày - tháng - năm nào?
 */
package baitapcoban;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Vegetaz (Nguyễn Văn Vận)
 */
public class BaiTapCoBan64 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance(); //Lấy lịch ngày hiện tại
        Calendar nextWeek = (Calendar) calendar.clone(); //Tạo bản sao của calendar
        nextWeek.add(Calendar.DAY_OF_WEEK, 7); //Tuần sau
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); //Thứ trong tuần
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR); //Tuần trong năm
        
        System.out.println("Hôm nay là " + calendar.getTime());
        System.out.println("Thứ: " + dayOfWeek);
        System.out.println("Tuần thứ " + weekOfYear + " trong năm");
        System.out.println("Một tuần sau là: " + dateFormat.format(nextWeek.getTime()));
    }
}
