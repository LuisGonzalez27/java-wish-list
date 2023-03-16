package org.lessons.java.christmas;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ChristmasLetter {
    private String name;
    private String address;
    private List<String> christmasLetter;
    private boolean goodOrNot;

    Random rand = new Random();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddres(String address) {
        this.address = address;
    }

    public List<String> getChristmasLetter() {
        return christmasLetter;
    }

    public void setChristmasLetter(List<String> christmasLetter) {
        this.christmasLetter = christmasLetter;
    }

    public void send(){
        if (christmasLetter.size()>5){
            throw new RuntimeException("La lettera può avere massimo di 5 desideri!");
        }
        if (!goodOrNot){
            throw new RuntimeException("Quest'anno sei stato cattivo!");
        }
        System.out.println("Ciao, " + this.name);
        System.out.println("Indirizzo: " + this.address);
        System.out.println("I tuoi desideri sono: ");
        Collections.sort(this.christmasLetter);
        for (String inList : christmasLetter) {
            System.out.println("-" + inList);
        }
    }

    public ChristmasLetter(String name, String address, List<String> christmasLetter) {
        this.name = name;
        this.address = address;
        this.christmasLetter = christmasLetter;
        this.goodOrNot = rand.nextBoolean();
    }

    @Override
    public String toString() {
        return "ChristmasLetter" +
                "name='" + name +
                ", addres='" + address +
                ", christmasLetter=" + christmasLetter;
    }
}
