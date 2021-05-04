package lab_18_MathApparat;

import java.util.Scanner;

public class MathApparat {
    public static void main(String[] args) {
        int sum = 0; // число пар открывающихся и закрывающихся скобок
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите математическое выражение:");
        String stroka = sc.nextLine();
        for (int i = 0; i < stroka.length(); i++) {
            if (stroka.charAt(i) == '(') {
                sum++;
            } else if (stroka.charAt(i) == ')') {
                sum--;
                if (sum < 0) {
                    sum = 1;
                    break;
                }
            }
        }
        if (sum == 0) {
            System.out.println("Введно верно!");
        } else {
            System.out.println("Ошибка! Будьте внимательны при введении математичесеого выражения!");
        }
    }
}
