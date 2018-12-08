package com.acmp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> array = new ArrayList<>();

        File input = new File("input.txt");
        Scanner inputFile = new Scanner(input);
        inputFile.nextLong(); //skipping first num (array length in file)
        while(inputFile.hasNextLong()){
            array.add(inputFile.nextInt());
        }

        Collections.sort(array);

        File output = new File("output.txt");
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(output);
            writer.print(array.get(0) + " " + array.get(array.size() - 1) + " " +
                        array.get(1) + " " + array.get(array.size() - 2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            writer.flush();
            writer.close();
        }

    }
}
