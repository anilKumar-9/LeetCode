class Solution {
    public boolean backspaceCompare(String s, String t) {
        int left=s.length()-1;
        int right=t.length()-1;
        while(left>=0||right>=0)
        {
            left=indexCheck(left,s);
            right=indexCheck(right,t);

            if(left<0&&right<0)
            {
                return true;
            }
            if(left<0||right<0)
            {
                return false;
            }

            if(s.charAt(left)!=t.charAt(right))
            {
                return false;
            }
            left--;
            right--;
        }
        return true;
    }
    static int indexCheck(int index,String str)
    {
        int backCount=0;
        while(index>=0)
        {
            if(str.charAt(index)=='#')
            {
                backCount++;
            }
            else if(backCount>0)
            {
                backCount--;
            }
            else 
            {
                break;
            }
            index--;
        }
        return index;
    }

}