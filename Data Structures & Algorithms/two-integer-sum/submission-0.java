class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int complement=target-num;
            if(hash.containsKey(complement)){
                return new int[]{hash.get(complement),i};
            }
            hash.put(num,i);
        }
        return new int[]{};
        
    }
}
