import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i,j,k;
        List<List<Integer>> m1 = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(i=0;i<(nums.length-2);i++)
        {
            j=i+1;
            k=nums.length - 1;
            
            while(true)
            {
                if((nums[i]+nums[j]+nums[k]) == 0)
                {
                        if(!m1.contains((Arrays.asList(nums[i], nums[j], nums[k]))))    
                            m1.add((Arrays.asList(nums[i], nums[j], nums[k])));
                        j++;
                        k--;
                }
                
                else if((nums[j]+nums[k]) < (-nums[i]))
                        while((nums[j]==nums[++j]) && (j<k));
                    
                else
                    while((nums[k]==nums[--k]) && (j<k));
                    
                if(j>=k)
                    break;
            }
        }
     return m1;   
    }
}

        
