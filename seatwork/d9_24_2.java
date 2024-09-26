import java.util.Calendar;

public class d9_24_2{
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.SEPTEMBER, 23); // 设置当前日期为 2024 年 9 月 23 日（假设），注意月份从 0 开始，9 代表 10 月。
        calendar.add(Calendar.DAY_OF_YEAR, 100);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        System.out.println("100 天后是：" + days[dayOfWeek]);
    }
}