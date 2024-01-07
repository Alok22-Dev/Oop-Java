import java.util.ArrayList;
public class Util {
    public static void main(String args[]){
        ArrayList<String> arrL = new ArrayList<String>();
        arrL.add("First");
        arrL.add("Second");
        arrL.add("Third");
        arrL.add("Random");

        System.out.println(arrL);
        arrL.clear();

        System.out.println(arrL);
    }    
}
