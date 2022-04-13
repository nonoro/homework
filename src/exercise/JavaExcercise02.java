package exercise;

public class JavaExcercise02 {
    public static void main(String[] args) {
        int[] arr = new int[11];
        int sum = 0;
        int total = 0;

        for(int i = 0; i < arr.length; i++)  {
            sum += i;
            total += sum;
                System.out.println("sum=" +total);
            }
        }
    }

