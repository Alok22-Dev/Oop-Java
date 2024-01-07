public class Average {
   public static void main(String args[]) {
      double arr[] = new double[3];
      arr[0] = 10.1;
      arr[1] = 11.2;
      arr[2] = 12.3;
      double sum = 0;
      for (int i = 0; i < arr.length; i++) {
         sum = sum + arr[i];
      }
      System.out.println("Sum is:" + sum / arr.length);
   }
}
