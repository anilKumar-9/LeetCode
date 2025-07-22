class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        int odd=0,even=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int ind=i;
            
            while(ind<n&&i%2==0&&arr[ind]%2!=0)
            {
                ind++;
            }
            if(ind<n&&i!=ind)
            {
            int temp=arr[ind];
            arr[ind]=arr[i];
            arr[i]=temp;
            continue;
            }
            while(ind<n&&i%2==1&&arr[ind]%2!=1)
            {
                ind++;
            }
            if(ind<n&&i!=ind)
            {
            int temp=arr[ind];
            arr[ind]=arr[i];
            arr[i]=temp; 
            }

        }
        return arr;
    }
}