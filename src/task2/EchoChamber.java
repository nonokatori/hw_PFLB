package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class EchoChamber {

    public static void main(String[] args) {
        print(readBuffer());

    }

    public static ArrayList<String> readBuffer() {
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> ls = new ArrayList<>();
        while (true) {
            s = scanner.nextLine();
            if (s.equals("")) break;
            ls.add(s);
        }
        scanner.close();
        return ls;
    }

    public static void print(ArrayList<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
