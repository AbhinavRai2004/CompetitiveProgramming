package Recursion;

import java.util.*;

public class MaximumDistanceInArrays {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        arr.add(new ArrayList<>(Arrays.asList(-8,-7,-7,-5,1,1,3,4)));
        arr.add(new ArrayList<>(Arrays.asList(-2)));
        arr.add(new ArrayList<>(Arrays.asList(-10,-10,-7,0,1,3)));
        arr.add(new ArrayList<>(Arrays.asList(2)));

        int dis = Integer.MIN_VALUE;
        int max = arr.get(0).get(arr.get(0).size() - 1);
        int min = arr.get(1).get(0);

        for(int i = 0; i < arr.size()-1; i++)
        {
            int p1 = Math.abs(arr.get(i).get(arr.get(i).size() - 1) - arr.get(i+1).get(0));
            int p2 = Math.abs(arr.get(i+1).get(arr.get(i+1).size() - 1) - arr.get(i).get(0));
            dis = Math.max(dis,Math.max(p1,p2));

            max = Math.max(max,Math.max(arr.get(i).get(arr.get(i).size() - 1),arr.get(i+1).get(arr.get(i+1).size() - 1)));
            min = Math.min(min,Math.min(arr.get(i+1).get(0),arr.get(i).get(0)));
        }
        dis = Math.max(dis,Math.abs(max-min));

        System.out.println(dis);
    }
}
