class Solution {
    public String longestPalindrome(String str) {
        
   	   if(str.length()<=1)
		{
			return str;
		}
		int max=0;
		int n =str.length();
		String ans="";

		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				
				if(str.charAt(i)!=str.charAt(j))
				{
					continue;
				}
				   String sub=str.substring(i,j+1);
                   int len=sub.length();
					if(isPalindrome(sub)&&len>=max)
					{
						if(sub.length()>max)
						{
							max=len;
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
