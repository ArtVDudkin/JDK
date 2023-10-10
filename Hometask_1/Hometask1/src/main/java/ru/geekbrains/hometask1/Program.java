package ru.geekbrains.hometask1;

import ru.geekbrains.hometask1.desktopclient.ConnectionFrame;
import ru.geekbrains.hometask1.server.LogHandler;

import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {

        new ConnectionFrame(new LogHandler("./log.txt"));

    }

}
