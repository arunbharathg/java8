package com.arun;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileOperations {


    public static void main(String args[]) {
        try {
            FileReader fileReader = new FileReader(System.getProperty("user.dir").concat("/pom.xml"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
