package ru.geekbrains.hometask2.task1;

import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        //new ChatWindow(new Server(new ConsoleServerListener()));
        try {
            new ChatWindow(new Server(new LogServerListener("ServerLogfile")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
