import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Задача 2.19
        System.out.println("Дано число 1659");
        int a = 1;
        int b = 6;
        int c = 5;
        int d = 9;

        System.out.println( a + b + c + d);
        System.out.println(a * b * c * d);


        //Задача 4.100

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int n1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int n2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int n3 = scanner.nextInt();


        int smallest, secondSmallest;

        if (n1 < n2) {
            if (n1 < n3) {
                smallest = n1;
                secondSmallest = Math.min(n2, n3);
            } else {
                smallest = n3;
                secondSmallest = n1;
            }
        } else {
            if (n2 < n3) {
                smallest = n2;
                secondSmallest = Math.min(n1, n3);
            } else {
                smallest = n3;
                secondSmallest = n2;
            }
        }

        int number = smallest * secondSmallest;

        System.out.println("Произведение двух наименьших чисел: " + number);


        // Сложная задача 3
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Введите число, показывающее, во сколько раз Гулливер больше Лилипутов: ");
        int index = scanner1.nextInt();
        if (index <= 2) {
            System.out.println("Гулливер больше Лилипутов минимум в 2 раза");
        }

            System.out.print("Введите число, показывающее нужное колличество слоев матрацев: ");
            int layer = scanner1.nextInt();
        if (layer >= 100) {
            System.out.println("Гулливеру нужно меньше 100 слоев матраца");
        }

        System.out.println("Нужное колличество матрацев: " + index * layer);






    }
    }




