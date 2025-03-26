public class Main {
    public static void main(String[] args) {

        // 1
        int age = 12;
        double wallet = 10.50;
        boolean isSchoolBoy = true;
        char grade = 'A';

        // 2
        String name = "Иванов Иван";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));

        // 3
        System.out.println(10 + 15);
        System.out.println(10 - 2);
        System.out.println(2 * 2);
        System.out.println(10 / 5);

        System.out.println(10 / 3);
        System.out.println(10.0 / 3.0);

        System.out.println(10 % 3);

        System.out.println("a" + "b");

        // 4
        System.out.println(1 > 2);
        System.out.println(2 == 2);
        System.out.println(2 >= 2);
        System.out.println(3 != 3);

        // 5
        System.out.println(2 == 2 && 3 != 2); // true && true -> true
        System.out.println(2 == 2 && 3 != 3); // true && false -> false
        System.out.println(!((2 + 2) == 4)); // !(4 == 4) -> !(true) -> false
        System.out.println(!((2 + 2) == 4) || true); // false || true -> true

        // 6
        /**
         * привет
         * привет
         */
        System.out.println("Привет, я " + name + "! Мне " + age + " лет.");
        System.out.printf("Привет, я %s! Мне %s лет.", name, age);

        int oddNumber = 2;
        System.out.println();
        System.out.printf("Число четное? %s", oddNumber % 2 == 0);

        System.out.println();
        System.out.println("    *    ");
        System.out.println("  * * *  ");
        System.out.println("* * * * *");

        System.out.println();

        //1. Напишите функциональность, которая вычисляет площадь круга
        double r = 3;
        double pI = 3.14;
        double s = pI * (r * r);
        System.out.printf("Площадь круга с радиусом %s равна: %s", r, s);
        //System.out.println(s);

        System.out.println();

        //2. Переведите температуру в градусах Цельсия в Фаренгейты
        double C = 15;
        double F = (C * 1.8 + 32);
        System.out.println();
        System.out.println(F);

        System.out.println();

        //3. Проверьте, является ли длина сроки "Hello" равной длине другой строки
        String word1 = "Hello";
        String word2 = "Bye";
        System.out.println(word1.length() == word2.length());

        System.out.println();

        //4. Напишите функциональность, которая определяет, является ли год високосным
        int year = 1992;
        System.out.println("Год " + year + " високосный?");
        System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

        System.out.println();

        //5. Напишите калькулятор ИМТ
        double weight = 50;
        double height = 1.5;
        System.out.println(weight / (height * height));

        System.out.println();

        //6. Выведите в консоль таблицу истинности для операторов && и ||
        System.out.println("Конъюкция         Дизъюкция");
        System.out.println("A  B  A&B        A  B  A||B");
        System.out.println("0  0   0         0  0    0");
        System.out.println("1  0   0         1  0    1");
        System.out.println("0  1   0         0  1    1");
        System.out.println("1  1   1         1  1    1");

        System.out.println();

        //7. Выведите в консоль квадрат
        System.out.println("************");
        System.out.println("************");
        System.out.println("************");
        System.out.println("************");
        System.out.println("************");

        System.out.println();

        //8. Выведите в консоль полый квадрат
        System.out.println("%%%%%%%%%%%%");
        System.out.println("%          %");
        System.out.println("%          %");
        System.out.println("%          %");
        System.out.println("%%%%%%%%%%%%");

        System.out.println();

        //9. Выведите в консоль ромб
        System.out.println("     *     ");
        System.out.println("    *  *   ");
        System.out.println("   *    *  ");
        System.out.println("  *      * ");
        System.out.println("   *    *  ");
        System.out.println("    *  *   ");
        System.out.println("      *    ");

        System.out.println();

        //10. Выведите в консоль смайлик
        System.out.println("         Punk’s Not Dead!!!");
        System.out.println("            ******               ");
        System.out.println("             *****               ");
        System.out.println("              ****               ");
        System.out.println("          *   ***  *  *          ");
        System.out.println("      *        *        *        ");
        System.out.println("    *          |          *      ");
        System.out.println("   *   =======    =======  *     ");
        System.out.println("   *    *$$$*  ||  *$$$*   *     ");
        System.out.println("   * * |     * 00 *     |  *     ");
        System.out.println("    *   *  * |######| *   *      ");
        System.out.println("      *   * * |######| * *       ");
        System.out.println("        *  *    *   *   *        ");
        System.out.println("            *   *   *            ");
        System.out.println("               *  *              ");
    }
}