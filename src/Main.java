import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int temp = 4;
        if (temp >= 5) {
            System.out.println("На улице " + temp + " градусов,можно идти без шапки");
        } else {
            System.out.println("На улице  " + temp + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 65;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 25;
        if (age >= 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 6 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int human = 15;
        if (human <= 60) {
            System.out.println("В вагоне есть сидячие " + (60 - human) + " мест и осталось еще 42 стоячих места");
        }
        else if (human > 60 && human <= 102) {
            System.out.println("В вагоне поезда закончились сидячие места,  остались только стоячие " + (102 - human) + " места");
        } else {
            System.out.println("Вагон полностью забит, перепонено на " + -(102 - human) + " человек ");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 345;
        int two = 255;
        int three = 15;
        if (one>=two && one>three) {
            System.out.println("Число "+ one+" большее из чисел");
        } else if (two>=one && two>three){
            System.out.println("число "+ two+" большее из чисел");
            } else if(three>=one && three>two) {
            System.out.println("Число "+ three+" большее из чисел");
        } else {
            System.out.println("Все 3 числа равны "+ one);
        }
    }
}

