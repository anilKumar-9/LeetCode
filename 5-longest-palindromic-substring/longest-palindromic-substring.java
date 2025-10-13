class Solution {
    public String longestPalindrome(String str) {
        
   	    int max=0;
		int n =str.length();
		String ans="";

		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				String sub=str.substring(i,j+1);
					if(isPalindrome(sub))
					{
						if(sub.length()>max)
						{
							max=sub.length();
							ans=sub;
						}
					}

			}
		}
		return ans;

	}
	static boolean isPalindrome(String str)
	{
		int start=0;
		int end=str.length()-1;
		while(start<end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}