package lotto;

import java.util.*;

public class LottoService {
    public static void main(String[] args) {
        final int BUY_LOTTO_INPUT_MIN = 1;
        final int BUY_LOTTO_INPUT_MAX = 10;
        final int LOTTO_NUMBER_SIZE = 7;

        final String BUY_LOTTO_NUMBER = "구매할 Lotto 개수 입력: ";
        final String WRONG_NUMBER = String.format("%d 이상 %d 이하의 정수를 입력해주세요.", BUY_LOTTO_INPUT_MIN, BUY_LOTTO_INPUT_MAX);
        final String BOUGHT_LOTTO_LIST = "\n구매한 Lotto 리스트";

        int num;
        boolean notIncluded;
        String input;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(BUY_LOTTO_NUMBER);
            notIncluded = true;
            input = scanner.next();

            int Strength = input.length();
            char[] inputChars = new char[Strength];

            for (int i = 0; i < Strength; i++) {
                inputChars[i] = input.charAt(i);

                if (!(inputChars[i] >= '0' && inputChars[i] <= '9')) {
                    System.out.println(WRONG_NUMBER);
                    notIncluded = false;
                    break;
                }
            }

            if (notIncluded) {
                num = Integer.parseInt(input);

                if (num < BUY_LOTTO_INPUT_MIN || num > BUY_LOTTO_INPUT_MAX) {
                    System.out.print(WRONG_NUMBER);
                    continue;
                }
                break;
            }
        }

        System.out.println(BOUGHT_LOTTO_LIST);
        for (int i = 0; i < num; i++) {
            System.out.printf("[%d] ", i + 1);

            for (int j = 0; j < LOTTO_NUMBER_SIZE; j++) {
                int LottoNumber = (int) (Math.random() * 45) + 1;
                System.out.print(LottoNumber + " ");
            }
            System.out.println();
        }
    }
}

