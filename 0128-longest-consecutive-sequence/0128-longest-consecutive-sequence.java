class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
             
         Set <Integer> set = new HashSet<>();
         for(int num : nums){
         set.add(num);
         }

         int longestStreak = 0;
         for(int num : set){
            if(!set.contains(num-1)){
                int curNum = num;
                 int curStreak = 1;

                 while(set.contains(curNum+1)){
                    curNum += 1;
                    curStreak += 1;
                 }
                 longestStreak = Math.max(longestStreak, curStreak);
            }
            
         }
         return longestStreak;


    }
}