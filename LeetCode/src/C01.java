import java.util.HashMap;
import java.util.Map;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
public class C01 {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution();
        int [] result = solution.twoSum(nums,target);
        int [] result1 = solution.towSum1(nums,target);
        int [] result2 = solution.toSum2(nums,target);

        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 暴力法
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]==target-nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] towSum1(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                return new int[] {i,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] toSum2(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");


    }

}