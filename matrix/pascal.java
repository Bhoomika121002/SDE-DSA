package matrix;

import java.util.ArrayList;
import java.util.List;

class Solutionn {
    public List<List<Integer>> generate(int numRows) {
         
        if(numRows ==0) return new ArrayList();  //empty list
        
        //return list 
        List<List<Integer>> result = new ArrayList();

        for(int i=1; i<=numRows;i++){   //indexvalue-- row value 
            List<Integer> row = new ArrayList();  //single row --create
            for (int j=0;j<i;j++){     // for no. of value in each row (position)
                if(j==0 || j==i-1){  //oth position & 4th position or last postion) 
                    row.add(1);
                }else {
                    row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));
                }// previous row 2nd postion + previous row 1 position  
            }
            result.add(row); //12345
             
        }
        return result;
    }
} 
