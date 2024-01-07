import java.util.ArrayList;
public class Package {
    public static void main(String args[]) {

         int[] arr = new int[2];
        arr[0] = 5;
        arr[1] = 10;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //this is a different part
        
        ArrayList<Integer> arrL = new ArrayList<Integer>(2);
        arrL.add(1);
        arrL.add(2);

        System.out.println(arrL.get(0));
        System.out.println(arrL.get(1));
    }
}
