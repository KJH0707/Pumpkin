import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i=0;i<players.length;i++) map.put(players[i],i);

        for(String a : callings) {
            int b = map.get(a);

            map.put(a,b-1);
            map.put(players[b-1],b);
            players[b]=players[b-1];
            players[b-1]=a;
        }
        
        return players;
    }
}