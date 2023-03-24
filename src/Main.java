import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Calendar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("-- 1 task -- ");

        int n = 50;
        if (n >= 50 && n <= 100){
            System.out.println("Успішно!  Число " + n + " входить в проміжок (50 - 100)!");
        } else {
            System.out.println("Помилка!  Число " + n + " не входить в проміжок (50 - 100)!");
        }

        System.out.println("-- 2 task--");

        n = 549;

        int max = 0;

        while (n > 0) {
            int digit = n % 10; // остання цифра числа

            if (digit > max) { // якщо в нас цифра більша за записане max, то перезаписується значення max
                max = digit;
            }
            n /= 10; // відкидаємо останню цифру для переходу до наступної
        }

        System.out.println("Найбільша цифра числа - " + max);

        System.out.println("-- 3 task --");

        int currentFloor = 2;
        String direction = "До гори";

        if(currentFloor < 1 || currentFloor > 9) {
            System.out.println("Невірний поверх!");
        } else {
            if(currentFloor == 1 && direction == "До гори"){
                System.out.println("Ви піднялись на 1 поверх");
            } else if (currentFloor == 2 && direction == "До гори"){
                System.out.println("Ви піднялися на 3 поверх");
            } else if (currentFloor == 3 && direction == "До гори"){
                System.out.println("Ви піднялися на 3 поверх");
            } else if (currentFloor == 4 && direction == "До гори"){
                System.out.println("Ви піднялися на 4 поверх");
            } else if (currentFloor == 5 && direction == "До гори"){
                System.out.println("Ви піднялися на 5 поверх");
            } else if (currentFloor == 6 && direction == "До гори"){
                System.out.println("Ви піднялися на 6 поверх");
            } else if (currentFloor == 7 && direction == "До гори"){
                System.out.println("Ви піднялися на 7 поверх");
            } else if (currentFloor == 8 && direction == "До гори"){
                System.out.println("Ви піднялися на 8 поверх");
            } else if (currentFloor == 9 && direction == "До гори"){
                System.out.println("Ви піднялися на 9 поверх");
            }

            if(currentFloor == 1 && direction == "До низу"){
                System.out.println("Ви спустилися на 1 поверх");
            } else if (currentFloor == 2 && direction == "До низу"){
                System.out.println("Ви спустилися на 1 поверх");
            } else if (currentFloor == 3 && direction == "До низу"){
                System.out.println("Ви спустилися на 3 поверх");
            } else if (currentFloor == 4 && direction == "До низу"){
                System.out.println("Ви спустилися на 4 поверх");
            } else if (currentFloor == 5 && direction == "До низу"){
                System.out.println("Ви спустилися на 5 поверх");
            } else if (currentFloor == 6 && direction == "До низу"){
                System.out.println("Ви спустилися на 6 поверх");
            } else if (currentFloor == 7 && direction == "До низу"){
                System.out.println("Ви спустилися на 7 поверх");
            } else if (currentFloor == 8 && direction == "До низу"){
                System.out.println("Ви спустилися на 8 поверх");
            } else if (currentFloor == 9 && direction == "До низу"){
                System.out.println("Ви спустилися на 9 поверх");
            }
        }
//
//        if(currentFloor < 1 || currentFloor > 9){
//            System.out.println("Невірне введення поверху!");
//            } else {
//                while (currentFloor <= 9 && currentFloor >= 1) {
//                    if (direction == "До низу") {
//                        if (currentFloor == 2) {
//                            currentFloor = 1;
//                            System.out.println("Ліфт доставлений на 1-й поверх, замість 2-го");
//                        } else {
//                            System.out.println("Ви спустились на " + currentFloor + " поверх");
//                            currentFloor--;
//                        }
//                    } else if (direction == "До гори") {
//                        if (currentFloor == 1) {
//                        System.out.println("Ліфт піднявся з 1-го поверха");
//                        currentFloor = 3;
//                        System.out.println("Ліфт доставлений на 3-й поверх, замість 2-го");
//                        } else {
//                        System.out.println("Ви піднялись на " + currentFloor + " поверх");
//                        currentFloor++;
//                    }
//                }
//            }
//        }

        System.out.println("-- 4 task --");

        String choice = "no";

        switch (choice){
            case "Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
            case "ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
            case "no":
                System.out.println("Я відмовляюсь!");
                break;
        }

        System.out.println("-- 5 task --");

        int a = 731, b = 51, c = 122;
        int  num;

        if (a > b) {
            num = a;
            a = b;
            b = num;
        }

        if (b > c) {
            num = b;
            b = c;
            c = num;
        }

        if (a > b) {
            num = a;
            a = b;
            c = num;
        }

        System.out.printf("Числа в порядку зростання %d, %d, %d.\n", a, b, c);

        System.out.println("-- 6 завдання --");

        n = 1241;
        int hoursLeft = (n / 3600);
        if(n <= 3600){
            System.out.println("До кінця робочого дня залишилось менше 1 години.");
        } else {
            System.out.println("Залишилось " + hoursLeft + " годин до кінця робочого дня.");
        }
    }
}