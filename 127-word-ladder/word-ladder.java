class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet(wordList);
        if(!set.contains(endWord))
        {
            return 0;
        }
        Queue<String> q=new LinkedList<>();
        q.offer(beginWord);
        if(set.contains(beginWord))
        set.remove(beginWord);

        int count=0;
        while(!q.isEmpty())
        {
            int n=q.size();
            
            for(int i=0;i<n;i++)
            {
                String node=q.poll();
                if(node.equals(endWord))
                return count+1;

                List<String> neighbourValues=neighbours(node,set);
                for(String neighbour:neighbourValues)
                {
                   
                     q.offer(neighbour);
                      set.remove(neighbour);
                }
            }
            count++;
        }
        return 0;
    }
    static List<String> neighbours(String name,Set<String> set)
    {
        List<String> nodeValues=new ArrayList<>();
        char[] arr=name.toCharArray();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            char ch=arr[i];
            for(char j='a';j<='z';j++)
            {
                arr[i]=j;
                String str=new String(arr);
                if(set.contains(str))
                {
                    nodeValues.add(str);
                    System.out.println(str);
                }
            }
            arr[i]=ch;
        }
        return nodeValues;
    }
}