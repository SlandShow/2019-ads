package ru.mail.polis.ads.slandshow.task1;

import java.util.Scanner;

/**
 * Problem https://www.e-olymp.com/ru/problems/1
 * Submission https://www.e-olymp.com/ru/submissions/6092463
 */
public final class Main {

    private static final Scanner input = new Scanner(System.in);

    public static void main(final String[] arg) {
        String numbers = input.nextLine();
        System.out.print(numbers.substring(0, numbers.length() / 2)
                + " " + (numbers.substring(numbers.length() / 2)));
    }
}
