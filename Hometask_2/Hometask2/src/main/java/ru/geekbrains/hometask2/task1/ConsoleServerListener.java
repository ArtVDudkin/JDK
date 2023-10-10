package ru.geekbrains.hometask2.task1;

public class ConsoleServerListener implements ServerListener {

    @Override
    public void generateMessage(String msg) {
        System.out.println(msg);
    }

}
