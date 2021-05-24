package exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int arr[]=new int[2];
        try {
            System.out.println("----------------------------------");
            try {
                int a = 10 / 0;
            }
            catch (ArithmeticException ae) {
                System.out.println("Cannot devide by zero.....");
            }
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException aiob)
        {
            System.out.println("Please check the size of array.....");

        }
        System.out.println("----------------------------------");
    }
}
