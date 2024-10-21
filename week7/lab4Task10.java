public class lab4Task10 {
    public static void main(String[] args) {
        System.out.println(gotRAndomLowerCaseLAtter());
        System.out.println(getRandUpperCaseLetter());
    }
    public static char getRandCharacter(char ch1,char ch2)
    {
        return (char)(ch1+Math.random()*(ch2-ch1+1));
    }
    public static char gotRAndomLowerCaseLAtter(){
        return getRandCharacter('a', 'z');
    }
    public static char getRandUpperCaseLetter()
    {
        return getRandCharacter('A', 'Z');
    }
}
