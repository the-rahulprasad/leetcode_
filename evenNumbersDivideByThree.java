public class evenNumbersDivideByThree {
        public static int averageValue(int[] nums) {
            int sum = 0;
            int count = 0;
            for(int i = 0; i< nums.length; i++){
                if(nums[i]%2 == 0){
                    if(nums[i]%3 == 0){
                        sum += nums[i];
                        count++;
                    }
                }
            }
            int average = 0;
            if(count != 0){
                average = sum/count;
                return average;
            }
            return average;
        }
        public static void main(String[] args){
            int[] nums;
            nums =new int[] {1,3,6,10,12,15};
            System.out.println(averageValue(nums));
        }

}
