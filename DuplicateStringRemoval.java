package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateStringRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "colaninfotech";
		char [] c = input.toCharArray();
		LinkedHashMap <Character,Integer> h = new LinkedHashMap<Character,Integer>();
        for(int i=0;i<c.length;i++)
        {
        	if(h.containsKey(c[i])==false)
        		h.put(c[i],1);
        	else
        	{
        		int value = h.get(c[i]);
        	    h.put(c[i], value+1);
      	    }
        		}
        System.out.println(h);
                  
	}

}
