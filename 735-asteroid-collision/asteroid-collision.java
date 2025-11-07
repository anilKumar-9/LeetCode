class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        int n=asteroids.length;

        for(int i=0;i<n;i++)
        {
            if(asteroids[i]>0)
            {
                st.push(asteroids[i]);
            }
            else
            {
                while(!st.isEmpty()&&st.peek()>0&&st.peek()<-asteroids[i])
                {
                    st.pop();
                }
                if(st.isEmpty()||st.peek()<0)
                {
                    st.push(asteroids[i]);
                }
                if(-asteroids[i]==st.peek())
                {
                    st.pop();
                }
            }
        }
        int size=st.size();
        int []res=new int[size];
        int i=size-1;
        while(!st.isEmpty())
        {
            res[i--]=st.pop();
        }
        return res;
    }
}