import java.util.*;
import java.io.*;

public class activity {
    public static Hashtable<Integer, stu> h = new Hashtable<>();
    private static Set<Integer> keys = h.keySet(); // will be used to iterate over the hastable

    public static void main(String[] args) {


        int oper; // will select the operation
        Scanner get = new Scanner(System.in);
        System.out.println("1 for adding\n2 for removing\n3 for searching\n4 for updating");
        oper = get.nextInt();


        switch (oper) {
            case 1 -> addStudent();
            case 2 -> removeStudent();
            case 3 -> showStudent();
            case 4 -> modifyStudent();
        }
        get.close();

        writeFile();
    }

    private static void writeFile() {
        try {
            FileWriter writer = new FileWriter("C:/Users/Arwani/Desktop/std.txt"); // change file path if needed.
            writer.write("Number    Name    Address\n"); // the head of the text file.
            for (Integer key : keys) {

                writer.write(key + "        " + h.get(key).getName() + "    " + h.get(key).getAddress() + "\n");

            }
            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void addStudent() {
        Scanner get = new Scanner(System.in);
        int k;

        do {
            System.out.println("Enter the key");
            while (!get.hasNextInt()) {
                System.out.println("This is not a number");
                get.next();
            }
            k = get.nextInt();

        } while (k <= 0);
        get.nextLine();
        System.out.println("Enter the name");
        String n = get.nextLine();
        System.out.println("Enter the address");
        String ad = get.nextLine();
        h.put(k, new stu(n, ad));
        System.out.println("Added Sucessfuly");
        get.close();
    }

    public static void removeStudent() {
        Scanner get = new Scanner(System.in);
        int kToRm;
        do {
            System.out.println("Ente the key you want to remove");
            while (!get.hasNextInt()) {
                System.out.println("This is not a number");
                get.next();
            }
            kToRm = get.nextInt();

        } while (kToRm <= 0);
        h.remove(kToRm);
        System.out.println("Done!");
        get.close();
    }

    public static void showStudent() {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the key to show its info");
        int kToRe = get.nextInt();
        try {
            System.out.println(h.get(kToRe).getName() + " " + h.get(kToRe).getAddress());
        } catch (NullPointerException nullPointerException) {
            System.out.println("Record Not Found!");
        }
        get.close();
    }

    public static void modifyStudent() {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the key to modify");
        int km = get.nextInt();
        get.nextLine();
        System.out.println("Enter the name");
        String nam = get.nextLine();
        System.out.println("Enter the address");
        String add = get.nextLine();
        h.put(km, new stu(nam, add));
        System.out.println("Updated! New value is \n");
        System.out.println(h.get(km).getName() + " " + h.get(km).getAddress());
        get.close();
    }


}





