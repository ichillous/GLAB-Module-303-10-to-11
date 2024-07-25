package GLABS.Section11.ArrayLists;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list2 = new ArrayList<>();

        list2.add(new ArrayList<String>());
        list2.getFirst().addFirst("Butler");
        list2.getFirst().add(1,"Billy");
        list2.getFirst().add(2,"Mandy");



        for(ArrayList<String> list : list2){
            System.out.println(list);
        }
        list2.add(new ArrayList<String>());
        list2.get(1).add("Grim");
        list2.get(1).add("Reaper");
        list2.get(1).add("Sandy");

        // Print the updated 2D ArrayList
        System.out.println("\nUpdated 2D ArrayList:");
        for (ArrayList<String> list : list2) {
            System.out.println(list);
        }
    }
}
