
package basecalculator;
import java.util.ArrayList;

/*
 * @author Brenden St Juste
 */
public class calc {
    public void convert(int input, int base){
      ArrayList<Integer> codeList = new ArrayList<Integer>();
      while (input != 0){
        int result = input % base;
        codeList.add(result);
        input = input / base;
      }
     for (int i = codeList.size() - 1; i != -1; i--){
         System.out.print(codeList.get(i));
     }
     System.out.println();
    } 
}
