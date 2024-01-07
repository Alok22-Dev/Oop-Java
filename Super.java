public class Super {
    int i,j;
}
class Sub extends Super{
    int k;
    void sum(){
        System.out.println("Sum is:"+(i+j+k));
    }
}
class Main{
    public static void main(String[]args){
        Sub obj1 = new Sub();
        obj1.i=10;
        obj1.j=10;
        obj1.k=10;
        obj1.sum();
    }
}