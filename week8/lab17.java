public class lab17 {
    public static void main(String[] args) {
        int[] a={1,2};
        System.out.println("Before invoking swap");
        System.out.println("arry is {"+a[0]+","+a[1]+"}");
        swap(a[0], a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {"+a[0]+","+a[1]+"}");

        System.out.println("Before invoking swapFirstTwoInArry");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        swapFirstTwoInArry(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
    }
    public static void swap(int n1,int n2)
    {
        int temp=n1;
        n1=n2;
        n2=temp;
    }
    public static void swapFirstTwoInArry(int[] arry)
    {
        int temp=arry[0];
        arry[0]=arry[1];
        arry[1]=temp;
    }
}
