package ArrayListProgram;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseUsingArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<Integer>();
		 
        // add elements
        List.add(10);
        List.add(9);
        List.add(8);
        List.add(7);
        List.add(6);
 
        // create a listiterator on list
        
        ListIterator<Integer> List_Iterator
            = List.listIterator(List.size());
 
        System.out.println("Reversed : ");
 
        // print ArrayList in reverse direction using
        // listiterator
        
        while (List_Iterator.hasPrevious()) {
            System.out.println(List_Iterator.previous());
	}

	}
}
