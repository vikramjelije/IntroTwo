package OOPS_Access_Modifiers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class test {
    public static void main(String[] args) {
      PriorityQueue<String> queue =
         new PriorityQueue<String>(10, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
            
         });
      queue.add("short");
      queue.add("very long indeed");
      queue.add("medium");
      while (queue.size() != 0)
        System.out.println(queue.remove());

        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(9);
        l.add(8);
        l.add(7);
        l.add(6);
        l.add(5);
        l.add(15);
    
        System.out.println(Collections.max(l));
    }
}
