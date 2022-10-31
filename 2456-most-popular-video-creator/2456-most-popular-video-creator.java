class user{
        String create;
        String ids;
        int views;
        
    }
class Solution {
    
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        
        List<List<String>>  ans =new ArrayList<>();
        List<user> users = new ArrayList<>();      
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,String> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        int upda=-1;
        for(int i=0;i<creators.length;i++){
            int v =  map.getOrDefault(creators[i],0);
            map.put(creators[i],v+views[i]);
        }
        
        HashMap<String,Integer> StringInt = new HashMap<>();
        HashMap<String,String> StringString = new HashMap<>();
        for(int i=0;i<creators.length;i++){
            if(StringInt.containsKey(creators[i])){
                if(views[i]>StringInt.get(creators[i])){
                    StringInt.put(creators[i],views[i]); 
                    StringString.put(creators[i],ids[i]); 
                }else if(views[i]==StringInt.get(creators[i])){
                    if(ids[i].compareTo(StringString.get(creators[i]))<0){
                         StringString.put(creators[i],ids[i]); 
                    }
                }
            }else{
               StringInt.put(creators[i],views[i]); 
               StringString.put(creators[i],ids[i]); 
            }
        }
       
        for (String key : map.keySet()) {
             user usr = new user();
            usr.create= key;
            usr.ids = map1.get(key);
            usr.views= map.get(key);
            users.add(usr);
        }
          users.sort((p1, p2) -> {
        
            return p2.views-p1.views;
        });
        int cnt = users.get(0).views;
        for(int i=0;i<users.size();i++){
            if(cnt == users.get(i).views){
                List<String> li =new ArrayList<>();
                li.add(users.get(i).create);
                li.add(StringString.get(users.get(i).create));
                ans.add(li);
            }
            // System.out.print(users.get(i).create);
            //  System.out.println(users.get(i).ids);
        }
        
        
        return ans; 
    }
}