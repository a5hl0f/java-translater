package com.company;

import java.util.Dictionary;
import java.util.Scanner;

public class Controller {
    Scanner scanner;

    public Controller()  {
        scanner=new Scanner(System.in);
    }

    public void start() {
        System.out.println("input the file name");
        String filename=scanner.nextLine();
        Translater translater=new Translater(filename);
        Dictionary dictionary=translater.getDictionary();
        Menu menu=new Menu(dictionary);
        menu.show();
    }
}
