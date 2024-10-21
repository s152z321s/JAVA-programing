import java.util.Random;
public class lab4Task11 {
    public static void main(String[] args) {
        final int number_of_chars = 175;
        final int char_per_line = 25;
        Random random = new Random();

        for (int i = 0; i < number_of_chars; i++) {
            char ch = getRandomLowerCaseLetter(random);
            if ((i + 1) % char_per_line == 0) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
    private static char getRandomLowerCaseLetter(Random random) {
        // 生成随机小写字母
        int letter = random.nextInt(26) + 'a';
        return (char) letter;
    }
}
