package exercise;

public class JavaExcercise08 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\n" );
                if (j == 3)
                System.out.print("\t");
            }
        }
    }
}


