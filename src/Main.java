import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    private static void task4() {
        System.out.println("Задание 4");

        Scanner in = new Scanner(System.in);
        System.out.print("Запишите возраст человека: ");
        int age = in.nextInt();

        if (age >= 2 && age <= 6){
            System.out.printf("Если возраст человека равен %d , то ему нужно ходить в детский сад.\n", age );
        } else if (age >= 7 && age <= 18){
            System.out.printf("Если возраст человека равен %d , то ему нужно  ходить в школу.\n", age );
        } else if (age > 18 && age <= 24){
            System.out.printf("Если возраст человека равен %d , то ему нужно  ходить в университет.\n", age );
        } else if (age > 24){
            System.out.printf("Если возраст человека равен %d , то ему нужно  ходить на работу.\n", age );
        }



    }

    private static void task3() {
        System.out.println("Задание 3");

        int totalNumberSeats = 102;
        int seatingPlaces = 60;
        int standingPlaces = totalNumberSeats - seatingPlaces; //42 места


        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста запишите количество пасажиров: ");
        int passengers = in.nextInt();

        int remainedPlaces = totalNumberSeats - passengers; //свободные места = все места - количество пассажиров
        int zero = 0;

        if (passengers >= 102){
            System.out.println("В вагоне больше нет мест !");
        } else { //if (passengers < 102) - заменено на else
            System.out.printf("На данный момент, мест в вагоне осталось %d  \n", remainedPlaces);
            if (remainedPlaces > standingPlaces) {
                System.out.printf("Сидячих мест осталось %d, стоячих %d", (seatingPlaces - passengers), standingPlaces);
                System.out.println(" ");

            } else { //if (remainedPlaces < standingPlaces ) - заменено на else
                System.out.printf("Сидячих мест осталось %d, стоячих %d", zero, remainedPlaces);
                System.out.println(" ");

            }
        }
        }


    private static void task2() {
        System.out.println("Задание 2");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст ребенка: ");
        int age = in.nextInt();

        if (age >= 7 && age < 18) {
            System.out.println("Этому ребенку нужно срочно идти в школу!");
        } else if (age >= 18 && age < 24) { // добавлено else
            System.out.println("Этому ребенку необходимо отправляться в университет!");
        } else if (age >= 24) { // добавлено else
            System.out.println("Этому ребенку пора искать работу!");
        } else { // добавлено else
            System.out.println("Этого ребенка можно оставить дома!");
        }

    }


    private static void task1(){
        System.out.println("Задание 1");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите свой возраст: ");
        int age = in.nextInt();

        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else { // if (age <= 18) заменено на else
            System.out.println("Увы возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
    }
}
