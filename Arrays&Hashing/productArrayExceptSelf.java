
// Brute force solution
class Solution {
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++){
            int pro = 1;
            for (int j = 0; j < n; j++){
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }
        return ans;
    }
}


// Prefix Suffix
class Solution {
    public int[] productExceptSelf(int[] nums){

        int n = nums.length;
        int[] res = new int[n];

        int pre = 1;

        for(int i = 0; i < n; i++){
            res[i] = pre;
            pre *= nums[i]
        }

        int suf = 1;

        for (int i = n - 1; i >= 0; i--){
            res[i] *= suf;
            suf *= nums[i];
        }
        return res;
    }
}