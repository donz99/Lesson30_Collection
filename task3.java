package Lesson30_Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class task3 {
    //Задача 3. Дан текст.
    // Разбить текст на слова и записать в коллекцию.
    // Если пользователь ввел “up” то вывести коллекцию
    // в прямом порядке, “down” - в обратном порядке,
    // что-то другое - заставить повторить ввод.
    public static void main(String[] args) {


        String text = " ";
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            text = buf.readLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //words.adAll(Arrays.asList(text.split(" ")));
        String[] wordsAsArray = text.split(" ");
        List<String> wordsAsList = Arrays.asList(wordsAsArray);

        String answer = "";

        do {
            System.out.println("Введите up или down");
            try {
                answer = buf.readLine();
            }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


        } while (!(answer.equals("up") || answer.equals("down")));
        if (answer.equals("down")) Collections.reverse(wordsAsList);
        System.out.println(wordsAsList);


    }
}
