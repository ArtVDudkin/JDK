package ru.geekbrains.hometask2.task3;

public class FullStackProgrammer implements BackEndProgramming, FrontEndProgramming {
    //JavaFX vs Swing
    @Override
    public void writeFrontEndCode() {
        System.out.println("Здесь работает фронтенд");
    }

    @Override
    public void writeBackEndCode() {
        System.out.println("Здесь работает бэкенд");
    }

}
