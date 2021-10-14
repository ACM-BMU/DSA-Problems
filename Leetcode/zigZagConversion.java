// Problem: https://leetcode.com/problems/zigzag-conversion/

public String convert(String s, int n){
  
    if (n <= 1)
        return s;
  
    List<StringBuilder> list = new ArrayList<>();
  
    for (int i = 0; i < n; i++){
        list.add(new StringBuilder());
    }
  
    int x = 0;
    int step = 1;
  
    for (int i = 0; i < s.length(); i++){
        StringBuilder sb = list.get(x);
        sb.append(s.charAt(i));
        x= x+step;
      
        if (x == n - 1 || x == 0)
            step= step* -1;
    }
  
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < list.size(); i++)
        ans.append(list.get(i));
  
    return ans.toString();
}
