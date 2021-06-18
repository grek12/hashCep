import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    String s = "";
    int x = 0;
    String name;
    HashMap hm = new HashMap();
    public void mainMenu() {

        while (!"4".equals(s)) {
            System.out.println("1. Добавить элемент");
            System.out.println("2. Найти элемент");
            System.out.println("3. Напечатать таблицу на экран");
            System.out.println("4. Выход");
            s = scan.next();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
            switch (x) {
                case 1:
             hm.put(1,22);
            }
        }}}