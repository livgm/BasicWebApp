package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Liv";
        } else if (query.contains("what is")) { // TODO extend the programm here
            return "" + (Integer.parseInt(query.split(" ")[3]) + Integer.parseInt(query.split(" ")[5]));
        }else if(query.contains("largest")){
            String[] a = query.split(":")[2].split(",");
            int max = 0;
            for (int i = 0; i < a.length(); i++) {
                int b = Integer.parseInt(a[i]);
                if( b >= max) {
                    max = b;
                }
            }
            return "" + max;
        }else{
            return "";
        }
    }
}
