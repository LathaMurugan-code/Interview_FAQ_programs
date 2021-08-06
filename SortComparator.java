package practice;

import java.util.Comparator;

public class SortComparator implements Comparator {

		@Override
	/*public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
			int a1 = (Integer)o1;
			int a2 = (Integer)o2;
			if(a1>a2)
				return 1;
			else if(a1<a2)
				return -1;
		else	
		return 0;
	}*/
		public int compare(Object o1, Object o2) {
			SortObjects s1 = (SortObjects)o1;
			SortObjects s2 = (SortObjects)o2;
			if(s1.Salary>s2.Salary)
				return -1;
			else if(s1.Salary<s2.Salary)
				return 1;
			else
				return 0;
			
			}

}
