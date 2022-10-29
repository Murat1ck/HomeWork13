import java.time.LocalDate;

public class Main {
    public static void printIsLeapYear ( int year){
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }
    private static boolean isLeap ( int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void printIsLeapYearResult (int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void recommendAppVersion(int clientOS, int clientDeviceYear) {
        boolean deviseIsOld = isDeviseOld(clientDeviceYear);
        System.out.print("Установите ");
        if (deviseIsOld) {
            System.out.print("облегчённую ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.println("IOS");
        } else {
            System.out.println("Android");
        }
    }
    private static boolean isDeviseOld ( int deviseYear) {
            int currentYear = LocalDate.now().getYear();
            return deviseYear <= currentYear;
        }
    public static void calculationDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней :" + deliveryDays);
    }

    public static void main(String[] args) {
        int year = 2020;
        printIsLeapYear(year);
        isLeap(year);
        task2();
        task3();
    }

    public static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2019;
        recommendAppVersion(clientOS, clientDeviceYear);
        //isDeviseOld (deviseYear);

        //if (clientOS == 0 && clientDeviceYear >= 2015) {
            //System.out.println("Установите версию приложения для iOS по ссылке");
       // } else if (clientOS == 1 && clientDeviceYear >= 2015) {
           // System.out.println("Установите версию приложения для Android по ссылке");
       //}
       //if (clientOS == 0 && clientDeviceYear < 2015) {
            //System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        //} else if (clientOS == 1 && clientDeviceYear < 2015) {
            //System.out.println("Установите облегченную версию приложения для Android по ссылке");}
    }
    public static void task3() {
        int deliveryDistance = 95;
        int deliveryDays = 1;
        calculationDeliveryDays(deliveryDistance);
        //if (deliveryDistance > 20) {
            //deliveryDays++;
        //}
        //if (deliveryDistance > 60) {
           // deliveryDays++;
        //}
        //System.out.println("Потребуется дней :" + deliveryDays);
    }


}



