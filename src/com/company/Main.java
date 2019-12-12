package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File A = new File("C:\\Users\\mi\\Documents\\IntelliJ Projects\\home-task-6.12.2019-N2\\src\\com\\company\\A.txt");

        boolean flag = true;
        if (!A.exists())
            flag = A.createNewFile();

        if (flag) {
            Scanner scan = new Scanner(System.in);
            PrintWriter printWriter = new PrintWriter(A);
            String string = scan.nextLine();
            printWriter.print(string);
            scan.close();
            printWriter.close();

            scan = new Scanner(A);
            int count = 0;
            while (scan.hasNext()) {
                string = scan.next();
                if (string.charAt(string.length() - 1) == 'b')
                    count++;
            }
            System.out.println("Количесво слов, оканчивающихся на 'b': " + count);
            scan.close();
            printWriter.close();
        }
    }
}
