class Solution {
    class Pair{

        int index;
        int value;
        Pair(int index,int value)
        {
            this.index=index;
            this.value=value;
        }

        public int getIndex()
        {
            return index;
        }

        public int getValue()
        {
            return value;
        }
    }
    
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        if(n==0)
        {
            return ans;
        }
        int []res=new int[n];
        Pair []values=new Pair[n];

        for(int i=0;i<nums.length;i++)
        {
            values[i]=new Pair(i,nums[i]);
        } 
        mergeSort(0,n-1,res,values,nums);
        for(int i=0;i<n;i++)
        {
            ans.add(res[i]);
        }
        return ans;
    }

    static void mergeSort(int low,int high,int []res,Pair[] values,int []nums)
    {
        if(low<high)
        {
            int mid=low+(high-low)/2;
            mergeSort(low,mid,res,values,nums);
            mergeSort(mid+1,high,res,values,nums);
            merge(low,high,mid,res,values,nums);
        }
    }


    static void merge(int low,int high,int mid,int []res,Pair[] values,int []nums)
    {
        int i=low,j=mid+1;
        ArrayList<Pair> temp=new ArrayList<>();
        while(i<=mid&&j<=high)
        {
            if(values[i].value>values[j].value)
            {
               temp.add(values[i]);
               res[values[i].getIndex()]+=high-j+1; 
               i++;
            }
            else
            {
                temp.add(values[j]);
                j++;
            }
        }
        while(i<=mid)
        {
            temp.add(values[i]);
            i++;
        }
         while(j<=high)
        {
             temp.add(values[j]);
            j++;
        }
        for(i=low;i<=high;i++)
        {
            values[i]=temp.get(i-low);
        }
    }
}