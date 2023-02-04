import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        while (true) {

            System.out.println("Select the option number or type 'end': " + "\n1. Add item" +
                    "\n2. Delete item" + "\n3. Show shopping list" + "\n3. Show shopping list");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                int operation = Integer.parseInt(input);
                if (operation == 1) {

                    System.out.println("Type the item to add to the list");
                    Scanner scanner1 = new Scanner(System.in);
                    String item = scanner1.nextLine();
                    list.add(item);
                    System.out.println(item + " added. " + list.size() + " items on the list");
                } else if (operation == 2) {
                    System.out.println("Shopping list:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    System.out.println("Type the item or number to delete from the list");
                    Scanner scanner2 = new Scanner(System.in);
                    String item = scanner2.nextLine();
                    try {
                        int itemNumber = Integer.parseInt(item) - 1;
                        String item1 = list.get(itemNumber);
                        list.remove(itemNumber);
                        System.out.println(item1 + " deleted. " + list.size() + " items on the list");

                    } catch (NumberFormatException e) {
                        list.remove(item);
                        System.out.println(item + " deleted. " + list.size() + " items on the list");
                    }

                } else if (operation == 3) {
                    System.out.println("Sopping list:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                }
            }

        }

    }

}