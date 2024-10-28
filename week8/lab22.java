public class lab22 {
    public static void main(String[] args) {
        double[] arry={1.9,2.5,3.7,2,1.5,6,3,4,5,2};
        double min=min(arry);
        System.out.println(min);
    }
    public static double min(double[] arry)
    {
        double ans=arry[0];
        for (int i = 0; i < arry.length; i++) {
            if(ans>arry[i])
            {
                ans=arry[i];
            }
        }
        return ans;
    }
}
