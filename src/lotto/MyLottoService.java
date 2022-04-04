package lotto;

import java.util.Scanner;

public class MyLottoService {
    public static void main(String[] args) {
        final int LOTTO_NUMBERS_SIZE = 7;
        final int LOTTO_QTY_MIN = 1;
        final int LOTTO_QTY_MAX = 10;

        final String INPUT_LOTTO_QTY="구매할 Lotto 개수 입력: ";
        final String NUMBER_RANGE_ERR=String.format("%d이상 %d이하의 정수를 입력해주세요.", LOTTO_QTY_MIN, LOTTO_QTY_MAX);
        final String LOTTO_LIST="\n구매한 Lotto 리스트";

        int lottoQty;
        boolean isValidNumber;
        String inputString;
        Scanner scanner = new Scanner(System.in);

        // 로또 수량 입력
        while (true) {
            System.out.print(INPUT_LOTTO_QTY);
            isValidNumber = true;
            inputString = scanner.next();

            // 입력받은 문자가 숫자인지 검증
            int strLength = inputString.length();
            char[] inputChars = new char[strLength];

            for (int i = 0; i < strLength; i++) {
                inputChars[i] = inputString.charAt(i);

                if (!((inputChars[i] >= '0') && (inputChars[i] <= '9'))) {
                    System.out.println(NUMBER_RANGE_ERR);
                    isValidNumber = false;
                    break;
                }
            }

            if (isValidNumber) {
                lottoQty = Integer.parseInt(inputString);

                // 숫자 범위 체크
                if (lottoQty < LOTTO_QTY_MIN || lottoQty > LOTTO_QTY_MAX) {
                    System.out.println(NUMBER_RANGE_ERR);
                    continue;
                }
                break;
            }
        }

        System.out.println(LOTTO_LIST);
        for (int i = 0; i < lottoQty; i++) {
            System.out.printf("[%d] ", i + 1);

            for (int j = 0; j < LOTTO_NUMBERS_SIZE; j++) {
                int lottoNumber = (int) (Math.random() * 45) + 1;
                System.out.print(lottoNumber + " ");
            }
            System.out.println();
        }
    }
}
