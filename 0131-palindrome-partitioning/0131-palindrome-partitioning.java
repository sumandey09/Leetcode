class Solution {
    boolean Ispalindeom(String s,int st,int end){
        while(st<=end){
            if(s.charAt(st++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    void fun(int ind,String s,List<String> path,List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(Ispalindeom(s,ind,i)){
                path.add(s.substring(ind,i+1));
                fun(i+1,s,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans =new ArrayList<>();
        List<String> path=new ArrayList<>();
        fun(0,s,path,ans);
        return ans;
    }
}