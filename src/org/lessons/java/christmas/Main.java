package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> wishList = new ArrayList<>();

        String wish;
        String inputUser;

        System.out.println("Inserisci un desiderio nella lista!");
        inputUser = scan.nextLine();

        wish = inputUser;
        wishList.add(wish);
        System.out.println("Sono già stati espressi " + wishList.size() + " desideri.");

        System.out.println("\nVuoi inserire un altro desiderio? \n- si\n- no");
        inputUser = scan.nextLine();

        if(inputUser.equals("si")) {
            while(inputUser.equals("si")) {
                System.out.println("Inserisci il tuo desiderio: ");
                wish = scan.nextLine();
                wishList.add(wish);
                System.out.println("Sono già stati espressi " + wishList.size() + " desideri.");

                System.out.println("\nVuoi inserire un altro desiderio? \n- si\n- no");
                inputUser = scan.nextLine();
            }
        }

        System.out.println("Il numero totale dei desideri è: " + wishList.size());
        Collections.sort(wishList);
        for (String inList : wishList) {
            System.out.println("-" + inList);
        }

    }
}
