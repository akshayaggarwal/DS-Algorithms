import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i,j,k;
        List<List<Integer>> m1 = new ArrayList<List<Integer>>();
        
        //int data[] = new int[3];
        
        for(i=0;i<(nums.length-2);i++)
        {
            for(j=i+1;j<(nums.length-1);j++)
            {
                for(k=j+1;k<nums.length;k++)
                {
                    if((nums[i]+nums[j]+nums[k]) == 0)
                    {
                              
                        //Set<Integer> set = new TreeSet<Integer>();
                        List<Integer> m2 = new ArrayList<Integer>();

                        //data[0] = nums[i];
                        //data[1] = nums[j];
                        //data[2] = nums[k];
                        
                        m2.add(nums[i]);
                        m2.add(nums[j]);
                        m2.add(nums[k]);
                        
                        Collections.sort(m2);
                        
                        //set.add(nums[i]);
                        //set.add(nums[j]);
                        //set.add(nums[k]);
                        
                       // System.out.println(m2);
                        
                        
                    
                        if(!m1.contains(m2))    
                            m1.add(m2);
                        
                        //m2.removeAll(m2);
                        //m1.removeAll(m1);
                    }
                }
            }
        }
        return m1;
    }
}
