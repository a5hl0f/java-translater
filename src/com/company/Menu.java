package com.company;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Scanner;

public class Menu {
    private Dictionary dictionary;
    private Scanner scanner;
    private FlatFactory factor;
    private ArrayList<Flat> flats;
    public Menu(Dictionary dictionary) {
       this.factor =new FlatFactory();
        this.dictionary=dictionary;
        this.scanner=new Scanner(System.in);
        flats=new ArrayList<>();
    }

    public void show() {
        boolean stay=true;
        int choice;
        do{
            System.out.println(dictionary.get("menu"));
            System.out.println(dictionary.get("choice"));
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:stay=false;break;
                case 1:addFlat(scanner);break;
                case 2:printFlats();break;
                case 3:deleteFlat(scanner);break;
                case 4:searchByPrice(scanner);break;
            }

        }while (stay);
    }

    private void searchByPrice(Scanner scanner) {
        System.out.println(dictionary.get("budget"));
        int budget=scanner.nextInt();
        scanner.nextLine();

        System.out.println(dictionary.get("availableBudget"));
        for (Flat f:flats
             ) {
            if(f.getCost()<=budget){
                System.out.println(f);
            }

        }
    }

    private void deleteFlat(Scanner scanner) {
        printFlats();
        System.out.println(dictionary.get("delete"));
        int id=scanner.nextInt();
        scanner.nextLine();
        Flat found=getFlatByID(id);
        if(found== null){
            System.out.println(dictionary.get("idError"));
        }else {
            flats.remove(found);
            System.out.println(dictionary.get("deleteSucc"));
        }


    }

    private Flat getFlatByID(int id) {
        for (Flat f:flats
             ) {
            if(f.getId()==id){
                return f;
            }

        }
        return null;
    }

    private void printFlats() {
        System.out.println(dictionary.get("available"));
        for (Flat f:flats
             ) {
            System.out.println(f);


        }
    }

    private void addFlat(Scanner scanner) {
        System.out.print(dictionary.get("address"));
        String address=scanner.nextLine();

        System.out.print(dictionary.get("comfort"));
        int confort=scanner.nextInt();
        scanner.nextLine();

        System.out.print(dictionary.get("area"));
        int  area=scanner.nextInt();
        scanner.nextLine();

        System.out.print(dictionary.get("price"));
        int price=scanner.nextInt();
        scanner.nextLine();

        flats.add(factor.creatednewfLAT(address,confort,area,price));
        System.out.println(dictionary.get("addSucc"));

    }
}
