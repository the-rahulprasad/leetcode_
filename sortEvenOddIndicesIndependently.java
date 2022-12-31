import java.util.*;
public class sortEvenOddIndicesIndependently {
    public static void main(String[] args){
        int[] nums;
        nums = new int[] {4,1,2,3};
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(i%2 != 0){
                odd.add(nums[i]);
            }
            else{
                even.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        int tempO = 1, tempE = 0;
        for(int i = 0; i<even.size(); i++){
            nums[tempE] = even.get(i);
            tempE += 2;
        }
        for(int i = 0; i<odd.size(); i++){
            nums[tempO] = odd.get(i);
            tempO += 2;
        }
        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
