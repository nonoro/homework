package lotto;

import java.util.Scanner;

public class LottoTest1 {
    public static void main(String[] args) {

        final int A_MAX = 10;
        final int B_MIN = 1;
        final int SIZE = 7;

        final String BUY_LOTTO = "구매할 Lotto개수 입력: ";
        final String BOUGHT_LOTTO = "\n구매한 Lotto 리스트";
        final String ERR = String.format("%d 부터 %d 까지의 숫자를 입력해주세요", B_MIN, A_MAX);

        int num;
        boolean p;
        String input;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(BUY_LOTTO);
            p = true;
            input = scanner.nextLine();

            char[] ic = new char[input.length()];

            for (int i = 0; i < input.length(); i++) {
                ic[i] = input.charAt(i);

                if (!(ic[i] >= '0' && ic[i] <= '9')) {
                    System.out.println(ERR);
                    p = false;
                    break;
                }
            }

            if (p) {
                num = Integer.parseInt(input);

                if (num < B_MIN || num > A_MAX) {
                    System.out.println(ERR);
                    continue;

                }
                break;
            }
        }

        System.out.println(BOUGHT_LOTTO);
        for (int i = 0; i < num; i++) {
            System.out.printf("[%d]", num);

            for (int j = 0; j < SIZE; j++) {
                int numberJ = (int) (Math.random() * 45) + 1;
                System.out.print(numberJ + " ");
            }
            System.out.println();
        }

    }
}