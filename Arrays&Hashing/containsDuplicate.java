
import java.util.HashSet;

// Brute force solution
class Solution {
    public boolean containsDuplicate(int[] nums){
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

// Using HashSet
class Solution2 {
    public  boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for (int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}