public class lab4Task13 {
    public static void main(String[] args) {
        String a = "AB8C";
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if(i==0)
                sum += huansuan(a.charAt(i));
            else
            {
                sum=sum*16+huansuan(a.charAt(i));
            }
        }
        System.out.println("The sum is: " + sum);
    }

    public static int huansuan(char n) {
        if (n >= 'A' && n <= 'F') {
            return n - 'A' + 10;
        } else if (n >= '0' && n <= '9') {
            return n - '0';
        } else {
            throw new IllegalArgumentException("Invalid character: " + n);
        }
    }
}