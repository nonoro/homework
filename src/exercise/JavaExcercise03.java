package exercise;

public class JavaExcercise03 {
    public static void main(String[] args) {
    int sum = 0;
    int num = 0;
    int s = 1;

    for(int i = 1; sum < 100; i++, s = -s) {
        num = i * s;
        sum += num;
        }
        System.out.println("total=" +num);
    }
}

