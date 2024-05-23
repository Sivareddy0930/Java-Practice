package Collection;

import java.util.TreeSet;

public class TreeSet1 {

        public static void main(String[] args) {
            TreeSet<Integer> tree_set =new TreeSet<>();

            // Adding the elements
            // using add() method
            tree_set.add(1);
            tree_set.add(2);
            tree_set.add(3);
            tree_set.add(4);
            tree_set.add(20);
            tree_set.add(30);
            tree_set.add(40);
            tree_set.add(50);
            tree_set.add(5);
            tree_set.add(10);
            System.out.println(tree_set);

            System.out.println(tree_set.headSet(7));
            System.out.println(tree_set.tailSet(5));
            System.out.println(tree_set.subSet(2,7));


    }

}
