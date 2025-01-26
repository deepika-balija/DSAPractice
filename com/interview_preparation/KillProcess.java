package com.interview_preparation;

import java.util.*;

public class KillProcess {
    public static void main(String[] args){
        List<Integer> pid = Arrays.asList(1, 2, 3, 0);
        List<Integer> ppid = Arrays.asList(6, 4, 8, 5);
        int kill = 4;

      /*  List<Integer> pid = Arrays.asList(1, 3, 10, 5);
        List<Integer> ppid = Arrays.asList(3, 0, 5, 3);
        int kill = 5;*/
        System.out.println("Killed processes: " + killProcess(pid, ppid, kill));
    }

   public static List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill ){
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for(int i=0; i< ppid.size(); i++){
            Integer parent = ppid.get(i);
            Integer child = pid.get(i);
            mp.putIfAbsent(parent, new ArrayList<>());
            mp.get(parent).add(child);
       }

//       if (!mp.containsKey(kill)) {
//           return Collections.singletonList(kill);
//       }

        List<Integer> resultList= new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(kill);
       while(! queue.isEmpty()){
           int current = queue.poll();
           resultList.add(current);
           if(mp.containsKey(current)){
               queue.addAll(mp.get(current));
           }

        }
        return resultList;
   }
}
