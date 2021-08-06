package practice;

import java.util.ArrayList;

public class SortArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(40);
		a.add(21);
		a.add(31);
		a.add(70);
		a.add(18);
		SortComparator s = new SortComparator();
        a.sort(s);
        System.out.println(a);
        a.removeAll(a);*/
        ArrayList<SortObjects> a = new ArrayList<SortObjects>();

        SortObjects o = new SortObjects("Latha", 23, 26000);
        SortObjects o2= new SortObjects("Ramya", 20, 11000);
        SortObjects o3= new SortObjects("Kalai", 29, 30000);
        SortObjects o4= new SortObjects("Vidya", 24, 25000);
        a.add(o);
        a.add(o2);
        a.add(o3);
        a.add(o4);
        SortComparator s = new SortComparator();
        a.sort(s);
        System.out.println(a);
        
        

	}

}
