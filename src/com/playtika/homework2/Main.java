package com.playtika.homework2;

public class Main {

    public static void main(String[] args) {

    }
    public int countWord (String text){
        String newText = text.trim();
        if (newText.isEmpty()) {
            return 0;
        }
        else {
            String[] str = newText.split("[^A-Za-zА0-9]+");
            return str.length;
        }
    }

}
