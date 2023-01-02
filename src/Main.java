import java.time.LocalDate;

public class Main {
    public static boolean chekingTheYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printYear(int year) {
        boolean boneYear = chekingTheYear(year);
        printYearresult(year, boneYear);
    }

    public static void printYearresult(int year, boolean boneYaer) {
        if (boneYaer) {
            System.out.println(year + " Весокостный");
        } else {
            System.out.println(year + " не выскоскостный");
        }
    }

    public static void printSeporator() {
        System.out.println("++++++++++");
        System.out.println("--------");
    }

    public static void printIssues(int issueCant) {
        System.out.println(issueCant);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        task();
        task1();
        task2(1, 2024);
        task3(95);
        totalDaysDelivry(96);


    }

    public static void task() {
        int[] issuesByMonths = {4, 6, 7, 9, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeporator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeporator();
            }
        }
        printSeporator();
        int total = sum(issuesByMonths);
        printIssues(total);
    }

    public static void task1() {
        printYear(2018);

    }

    public static void task2(int oS, int yaaer) {
        boolean deviceOld = determiningTheYearOfRealise(yaaer);
        System.out.print("Установите");
        if (deviceOld) {
            System.out.print(" лайт ");
        }
        System.out.print(" версию для ОС ");
        if (oS == 1) {
            System.out.print("МакOS");
        } else {
            System.out.print("МакOS");
        }
    }


    public static boolean determiningTheYearOfRealise(int yearDevice) {
        int currentYear = LocalDate.now().getYear();
        return yearDevice < currentYear;
    }



    }

    public static String totalDaysDelivry(int distance) {
        int dayDelivery = 1;
        if (distance >= 20 && distance < 60) {
            dayDelivery++;
        } if (distance >= 60 && distance < 100) {
            dayDelivery++;
        } else {
            return "Доставки нет";
        }

        return  "Потребуется дней" + dayDelivery;
    }
}