package org.lessons.java.christmas;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> wishList = new ArrayList<>();
        ChristmasLetter letter = new ChristmasLetter("","",wishList);
        boolean check = false;

        System.out.print("Inserisci il tuo nome: ");
        letter.setName(scan.next());
        System.out.print("Inserisci il tuo indirizzo: ");
        letter.setAddres(scan.next());

        while (!check){
            System.out.println("Inserisci un desiderio nella lista: ");
            String wish = scan.next();
            wishList.add(wish);
            System.out.println("Sono già stati espressi " + wishList.size() + " desideri.");
            System.out.println("Vuoi inserire un altro desiderio? \n- si\n- no");
            check = scan.next().equalsIgnoreCase("no");
        }
        try {
            letter.send();
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        scan.close();
    }
}
