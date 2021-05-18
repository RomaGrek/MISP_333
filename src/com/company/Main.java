package com.company;

import commands.*;
import general.HistoryPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        HistoryPoint historyPoint = new HistoryPoint();
        Exit exit = new Exit();
        Help help = new Help();
        History history = new History();
        Shot shot = new Shot();
        while (true) {
            System.out.println("Введите вашу команду, используйте \"help\" что бы получить список команд");
            System.out.print(">>>");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String pop = bufferedReader.readLine();
            if (!pop.isEmpty()) {
                CommandPusk.doing(pop, historyPoint);
                System.out.println();
            }
        }
    }
}
