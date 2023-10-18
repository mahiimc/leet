import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> output = recursiveGenerate(numRows);
        for(List<Integer> arr : output) {
            for(int num : arr) {
                System.out.print(" "+num+" ");
            }
            System.out.println();
        }
    }



    public static List<List<Integer>> recursiveGenerate(int numRows) {
            
            List<List<Integer>> result = new ArrayList<>(numRows);

            if(numRows == 1) {
                List<Integer> inner = new ArrayList<>(1);
                result.add(inner);
                return result;
            }

            List<List<Integer>> prev = recursiveGenerate(numRows-1);
            List<Integer> row = new ArrayList<>();
            for(int i=0;i<numRows;i++) {
                row.add(1);
            }
            for(int i=1;i<numRows-1;i++) {
                row.set(i,prev.get(i-2).get(i-1)+prev.get(i-2).get(i));
            }
            prev.add(row);
            return prev;

    }





    public static List<List<Integer>>  generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        for(int i=1;i<numRows;i++) {
            List<Integer> current = new ArrayList<>();
            current.add(0, 1);
            List<Integer> prev = result.get(i-1);
            
            for(int j=0;j<i-1;j++) {
                List<Integer> subList = prev.subList(j, j+2);
                int sum = subList.stream().reduce(0,(a,b) -> a+b);
                current.add(sum);
            }
            current.add(current.size(), 1);

            result.add(current);
        }
        return result;
        
    }
}