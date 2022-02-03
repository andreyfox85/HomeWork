import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {"В файл с каким расширением компилируется java-файл?\n" +
                "1. cs\n" + "2. java\n" + "3. rar\n" + "4. class\n" + "5. exe",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?\n" +
                "1. commit\n" + "2. push\n" + "3. clone\n" + "4. copy",
                "Какой применяется цикл, когда не известно количество итераций?\n" +
                "1. while\n" + "2. for\n" + "3. loop"};
        System.out.println(questions[0]);
        int firstQuestion = sc.nextInt();
        int success = 0;
        int failed = 0;
        if (firstQuestion == 4) {
            System.out.println("Правильно");
            success += 1;
        } else {
            System.out.println("Неправильно");
            failed += 1;
        }
        System.out.println(questions[1]);
        int secondQuestion = sc.nextInt();
        if (secondQuestion == 3) {
            System.out.println("Правильно");
            success += 1;
        } else {
            System.out.println("Неправильно");
            failed += 1;
        }
        System.out.println(questions[2]);
        int thirdQuestion = sc.nextInt();
        if (thirdQuestion == 1) {
            System.out.println("Правильно");
            success += 1;
        } else {
            System.out.println("Неправильно");
            failed += 1;
        }
        System.out.println("Результат: " + "правильно " + success + " неправильно " + failed);

    }
}