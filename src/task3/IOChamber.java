package task3;

import task2.EchoChamber;

import java.io.*;
import java.util.ArrayList;

public class IOChamber {

    private static ArrayList<String> ls = new ArrayList<>();
    public static void main(String[] args) {

        if (args.length != 0) {
            IOChamber.readFile(args[0]);
        }
        if (ls.size()==0) {
            System.out.println("Файл не распознан. Введите ваши сообщения.");
            ls = EchoChamber.readBuffer();
        }
        printOddLines();
    }

    public static void readFile (String path) {
        String str;
        try(FileReader fr = new FileReader(path); BufferedReader reader = new BufferedReader(fr)) {
            while ((str = reader.readLine()) != null) {
                ls.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не распознан. Введите ваши сообщения.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printOddLines () {
        for (int i = 0; i < ls.size(); i++) {
            if(i%2 == 0) System.out.println(ls.get(i));
        }
    }
}
