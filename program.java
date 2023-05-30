import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий фильтрации
 * и выведет ноутбуки, отвечающие фильтру.
 * 
 */
public class program {

    public static void main(String[] args) {

        NoteBook noteBook1 = new NoteBook("HP Pavilion", 8, 500, "Windows 10", "Black");
        NoteBook noteBook2 = new NoteBook("Macbook pro 14", 16, 250, "MacOS", "White");
        NoteBook noteBook3 = new NoteBook("Asus Olol", 32, 1000, "Windows 11", "Red");
        NoteBook noteBook4 = new NoteBook("Lenovo", 16, 1000, "Windows 10", "White");

        HashSet<NoteBook> mySet = new HashSet<NoteBook>(Arrays.asList(noteBook1, noteBook2, noteBook3, noteBook4));

        Scanner myInput = new Scanner(System.in);
        int myChoise = 0;
        while (myChoise != 5) {

            System.out.println(
                    "Введите цифру, соответствующую необходимому критерию:\n1. ОЗУ\n2. Объем ЖД\n3. Операционная система\n4. Цвет");
            System.out.println("5. Выход");
            myChoise = myInput.nextInt();
            if (myChoise == 1) {
                System.out.println("Выберите минимальный объем ОЗУ: ");
                System.out.println("1. 8 GB\n2. 16 GB\n3. 32 GB");
                int mChoise = myInput.nextInt();
                switch (mChoise) {
                    case 1:
                        for (NoteBook noteBook : mySet) {
                            if (noteBook.getRam() >= 8) {
                                System.out.println(noteBook.toString());
                            }
                        }
                        System.out.println();
                        break;
                    case 2:
                        for (NoteBook noteBook : mySet) {
                            if (noteBook.getRam() >= 16) {
                                System.out.println(noteBook.toString());
                            }
                        }
                        System.out.println();
                        break;
                    case 3:
                        for (NoteBook noteBook : mySet) {
                            if (noteBook.getRam() >= 32) {
                                System.out.println(noteBook.toString());
                            }
                        }
                        System.out.println();
                        break;
                    default:
                        System.out.println("Выберите корректное значение.");
                        break;
                }
            }
            if (myChoise == 2) {
                System.out.println("Введите минимальный объем ЖД: ");
                System.out.println("1. 250 GB\n2. 500 GB\n3. 1 TB");
                int mChoise = myInput.nextInt();
                switch (mChoise) {
                    case 1:
                        for (NoteBook noteBook : mySet) {
                            if (noteBook.hdd >= 250) {
                                System.out.println(noteBook.toString());
                            }
                        }
                        System.out.println();
                        break;
                    case 2:
                        for (NoteBook noteBook : mySet) {
                            if (noteBook.hdd >= 500) {
                                System.out.println(noteBook.toString());
                            }
                        }
                        System.out.println();
                        break;
                    case 3:
                        for (NoteBook noteBook : mySet) {
                            if (noteBook.hdd >= 1000) {
                                System.out.println(noteBook.toString());
                            }
                        }
                        System.out.println();
                        break;
                    default:
                        System.out.println("Выберите корректное значение.");
                        break;
                }
            }
            if (myChoise == 3) {
                System.out.println("Выберите операционную систему: ");
                System.out.println("1. Windows 10\n2. Windows 11\n3. MacOS");
                int mChoise = myInput.nextInt();
                switch (mChoise) {
                    case 1:
                        for (NoteBook noteBook : mySet) {
                            if (noteBook.os.equals("Windows 10")) {
                                System.out.println(noteBook.toString());
                            }
                        }
                        System.out.println();
                        break;
                    case 2:
                        for (NoteBook noteBook : mySet) {
                            if (noteBook.os.equals("Windows 11")) {
                                System.out.println(noteBook.toString());
                            }
                        }
                        System.out.println();
                        break;
                    case 3:
                        for (NoteBook noteBook : mySet) {
                            if (noteBook.os.equals("MacOS")) {
                                System.out.println(noteBook.toString());
                            }
                        }
                        System.out.println();
                        break;
                    default:
                        System.out.println("Выберите корректное значение.");
                        break;
                }
            }
            if (myChoise == 4) {
                System.out.println("Выберите цвет:");
                System.out.println("1. Красный\n2. Черный\n3. Белый");
                int mChoise = myInput.nextInt();
                switch (mChoise) {
                    case 1:
                        for (NoteBook noteBook : mySet) {
                            if (noteBook.color.equals("Red")) {
                                System.out.println(noteBook.toString());
                            }
                        }
                        System.out.println();
                        break;
                    case 2:
                        for (NoteBook noteBook : mySet) {
                            if (noteBook.color.equals("Black")) {
                                System.out.println(noteBook.toString());
                            }
                        }
                        System.out.println();
                        break;
                    case 3:
                        for (NoteBook noteBook : mySet) {
                            if (noteBook.color.equals("White")) {
                                System.out.println(noteBook.toString());
                            }
                        }
                        System.out.println();
                        break;

                    default:
                        System.out.println("Выберите корректное значение.");
                        break;
                }
            }
        }
        myInput.close();
    }
}


