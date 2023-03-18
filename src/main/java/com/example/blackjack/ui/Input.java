package com.example.blackjack.ui;

import java.util.Locale;
import java.util.Scanner;

public class Input {

    private static Scanner SCANNER = new Scanner(System.in);

    public static long batting() {
        System.out.println("배팅 금액을 입력하세요.");
        long money = Long.parseLong(SCANNER.next());

        return money;
    }

    public static boolean isContinued() {
        System.out.println("카드를 더 받으시겠습니까? (Y/N)");
        String isContinued = SCANNER.next().toUpperCase(Locale.ROOT);
        if ("Y".equals(isContinued)) {
            return true;
        }
        return false;
    }

}
