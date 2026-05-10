class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j=i;
            while(str.charAt(j)!='#'){
                j+=1;
            }
            int len=Integer.parseInt(str.substring(i,j));
            j+=1;
            String str1=str.substring(j,j+len);
            res.add(str1);
            i=j+len;
        }
        return res;
    }
}
