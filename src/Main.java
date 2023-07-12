import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array !!");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements");
        int array[]=new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        System.out.println("Enter the Number");
        int number=scanner.nextInt();

        System.out.println("Given number occurred for : "+FindOccurence(array,size,number)+" times");

    }

    private static int FindOccurence(int[] array, int size, int number) {
        //finding the occurence of the given value
        int count=0;
        for(int iterator=0;iterator<size;iterator++){
            if(array[iterator]==number){
                count++;
            }
        }
        return count;
    }
}