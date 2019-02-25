public class GroupAnagramOptimized{

public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null) return null;
        Map<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            int[] k = new int[26];
            for(int i=0;i<str.length();i++){
                k[str.charAt(i)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append('#');
                sb.append(k[i]);
            }
            String stri = sb.toString();
            if(!map.containsKey(stri)){
                LinkedList<String> temp = new LinkedList<>();
                temp.add(str);
                map.put(stri,temp);
            } else {
                List<String> l = map.get(stri);
                l.add(str);
                map.put(stri,l);
            }
        }
        List<List<String>> result = new LinkedList<>();
        for(List<String> list:map.values()){
            result.add(list);
        }
        return result;
    }

}
