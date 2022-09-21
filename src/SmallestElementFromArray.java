import java.util.Scanner;

public class SmallestElementFromArray {
    public static void main(String[] args) {
        System.out.println("enter number of elements you want to enter in array-->");
        Scanner scanner=new Scanner(System.in);
        int count = scanner.nextInt();
        int array[],smallest;//=new int(count);
        array=new int[count];
        System.out.println("Enter "+count+" integer numbers in array-->");
        for(int i=0;i<count;i++)
            array[i]=scanner.nextInt();
        System.out.println("Entered array elements are-->");
        smallest=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<smallest)
                smallest=array[i];
            System.out.println(array[i]);
        }
        System.out.println("The smallest number of an array is --> "+smallest);
    }
}
