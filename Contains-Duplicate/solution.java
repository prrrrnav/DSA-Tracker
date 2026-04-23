class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return fasle
            }
            set.put(i);
        }
    }
}
