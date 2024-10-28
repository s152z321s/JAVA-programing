public class lab23 {
    public static void main(String[] args) {
        int[] nums=new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i]=i;
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        for(int i=0;i<nums.length/2;i++)
        {
            int temp=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-1-i]=temp;
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
