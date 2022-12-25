import java.util.*;
public class hillAndValleys {
    public static void main(String[] args) {
        int nums[];
        nums = new int[]{2, 4, 1, 1, 6, 5};
        List<Integer> hillsList = new ArrayList<Integer>();
        List<Integer> valleysList = new ArrayList<Integer>();
        for (int i = 1; i < nums.length - 1; i++) {
            if(nums[i] == nums[i-1]){
                if(hillsList.contains(nums[i])){
                    if(nums[i] == nums[i-1]){
                        continue;
                    }

                }
                if(valleysList.contains(nums[i])){
                    if(nums[i] == nums[i-1]){
                        continue;
                    }
                }
            }

            int rightI = 0, leftI = 0;

            for(int j = 1; i - j >= 0; j++){
                if (nums[i] != nums[i - j]) {
                    leftI = i - j;
                    break;
                }

            }
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[i] != nums[i + j]) {
                    rightI = i + j;
                    break;
                }
                else if(i + j == nums.length - 1 ){
                    rightI = i;
                }
            }
            if(nums[i] > nums[leftI] && nums[i] > nums[rightI]){

                hillsList.add(nums[i]);
            }
            else if(nums[i] < nums[leftI] && nums[i] < nums[rightI]){

                valleysList.add(nums[i]);

            }
        }
        int total = hillsList.size() + valleysList.size();
        System.out.println(total);
    }
}