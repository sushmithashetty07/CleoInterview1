import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void Main(String[] args) {
        System.out.println("Hello World!");

    }

    public void itemizeList(String str, ArrayList<Object> items,ArrayList<Integer> count ){
        int curcount = 0;
        for(Object item : items){

            if( item instanceof List){
                count.add(curcount);
                itemizeList(str,item,count);
                curcount = curcount + 1;
            }
            else{
                StringBuilder countvar = new StringBuilder();
                for(int i=0; i < count.size()-1; i++){
                    countvar.append(count[i]);
                    countvar.append(".");

                }
                countvar.append(count[count.size()-1]);

                System.out.println(str + "." + countvar.toString() + ": " + item );
            }

        }

    }

}
