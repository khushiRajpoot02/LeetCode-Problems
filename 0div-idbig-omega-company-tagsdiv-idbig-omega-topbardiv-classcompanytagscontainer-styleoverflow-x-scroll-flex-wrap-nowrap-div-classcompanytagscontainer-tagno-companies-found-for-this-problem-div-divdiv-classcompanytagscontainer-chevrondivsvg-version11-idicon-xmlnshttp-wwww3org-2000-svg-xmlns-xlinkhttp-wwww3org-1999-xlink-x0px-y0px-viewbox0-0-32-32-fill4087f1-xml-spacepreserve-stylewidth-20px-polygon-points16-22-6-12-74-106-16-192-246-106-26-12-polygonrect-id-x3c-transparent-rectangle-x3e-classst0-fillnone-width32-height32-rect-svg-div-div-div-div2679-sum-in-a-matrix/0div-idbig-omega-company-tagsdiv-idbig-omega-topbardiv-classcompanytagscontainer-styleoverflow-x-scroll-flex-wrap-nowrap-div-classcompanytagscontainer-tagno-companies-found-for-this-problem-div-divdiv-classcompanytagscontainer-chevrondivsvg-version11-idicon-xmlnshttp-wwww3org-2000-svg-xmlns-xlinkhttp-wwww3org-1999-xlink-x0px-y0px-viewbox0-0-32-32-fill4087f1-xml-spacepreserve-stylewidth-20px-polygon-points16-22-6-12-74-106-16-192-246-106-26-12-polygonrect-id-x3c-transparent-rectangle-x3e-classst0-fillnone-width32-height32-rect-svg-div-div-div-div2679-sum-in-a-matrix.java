class Solution {
    public int matrixSum(int[][] nums) {
     int count=0;
      int ans[]=new int[nums[0].length];
      for(int i=0;i<nums.length;i++)
      {
          PriorityQueue<Integer> q= new PriorityQueue<>();
          for(int j = 0; j < nums[0].length;j++)
          {
              q.add(nums[i][j]);
          }
         
         for(int k=0;k<ans.length;k++)
         {
             int a=q.poll();
             if(ans[k]<a)
             {
                 ans[k]=a;
             }
             System.out.print(ans[k]+ " ");
         }
          System.out.println();

      }
      for(int n:ans) count+=n;  
      return count;
    }
}