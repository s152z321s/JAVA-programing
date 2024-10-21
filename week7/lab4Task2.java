public class lab4Task2{
    public static void main(String[] args) {  
        int i=5;
        int j=7;
        int k=max(i,j);
       System.out.println(k);
    }
    public static int max(int a , int b) {
        if(a>b)
        {
            return a;
        }
        else
      
        {
            return b;
        }
    }
}