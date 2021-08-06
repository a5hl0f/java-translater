package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileLoader {
    public static ArrayList<String> getline(String filename) {
        ArrayList<String> lines=new ArrayList<>();
        try{
            Scanner scanner=new Scanner(new File(filename));
             String line;
             while (scanner.hasNextLine()){
                 line=scanner.nextLine();
                 lines.add(line);


             }
        }catch (IOException e){
            System.out.println(e);

        }
        return lines;
    }
}
