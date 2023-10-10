package ru.geekbrains.hometask2.task4;

public class FrontEndDeveloper extends Developer {

    @Override
    void drinkCoffee() {
        System.out.println("drink Coffee");
    }

    @Override
    void smoke() {
        System.out.println("smoke");
    }


    public void developGUI() {
        System.out.println("create GUI");
    }

}
