import java.util.Calendar;
import java.util.Scanner;

public class lab4Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter full year: ");
        int year = scanner.nextInt();
        
        System.out.print("Enter month between 1 and 12: ");
        int month = scanner.nextInt();
        
        // 检查月份是否在1到12之间
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a month between 1 and 12.");
            scanner.close();
            return;
        }
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); 
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.printf("%d年 %d月\n", year, month);
        System.out.println("日 一 二 三 四 五 六");
        
        // 打印前面的空白
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("  ");
        }
        
        // 打印日期
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            // 检查是否是星期六，如果是则换行
            if ((day + firstDayOfWeek - 2) % 7 == 0) { // 注意这里的计算方式
                System.out.println();
            }
        }
        System.out.println(); // 确保在日历结束后换行
        
        scanner.close();
    }
}