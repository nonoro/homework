package exercise;

public class JavaExcercise06 {
    public static void main(String[] args) {
        for (int i = 0; 0 <= i && i <= 10; i++) {
            for (int j = 0; 0 <= j && j <= 10; j++) {
                if ((2 * i + 4 * j) == 10) {
                    System.out.println("x=" + i + " " + "y=" + j);
                }
            }
        }
    }
}