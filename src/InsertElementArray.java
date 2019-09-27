import java.util.Scanner;

public class InsertElementArray {
    public static void main(String[] args) {
//        InsertlementArray arr = new InsertlementArray();
//        arr.show();
//        arr.insert(8,1);
//        System.out.println();
//        arr.show();
//        if (2>1) return;

        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        size = sc.nextInt();
        while (size <= 0) {
            System.out.print("Input size of Array");
            size++;
        }
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Enter Element" + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        System.out.println("Input element that need remove: ");
        int location = sc.nextInt();
        for (int j = array.length - 1; j > location; j--) {
            array[j] = array[j];
        }
        System.out.println("Value import index arr: ");
        int value = sc.nextInt();
        array[location] = value;
        for (i = 0 ; i < array.length ; i++){
            System.out.println(" " +array[i]);
        }
    }
//    int []a = {5,6,7,0,0,0,0};
//    void insert(int value, int location){
//        for (int i=a.length-1; i> location; i--){
//            a[i] = a[i-1];
//        }
//        a[location] = value;
//    }
//    void show(){
//        for (int i=0; i<a.length; i++){
//            System.out.print(" "+a[i]);
//        }
//    }
}
