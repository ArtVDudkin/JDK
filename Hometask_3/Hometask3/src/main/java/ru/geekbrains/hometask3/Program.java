package ru.geekbrains.hometask3;

public class Program {

    /**
     * Задание:
     * Создайте интерфейс, который определяет набор методов для работы с базой данных (например, сохранение, удаление,
     * получение данных). Реализуйте этот интерфейс в конкретном классе.
     */
    public static void main(String[] args) {

        Repository workers = new Repository();
        workers.create(new Worker("Andrey", 30, 1000));
        workers.create(new Worker("Sergey", 31, 2000));
        workers.create(new Worker("Ivan", 33, 3000));
        System.out.println(workers.getAll());

        workers.update(1, new Worker("Maksim", 35, 5000));
        System.out.println(workers.getAll());

        System.out.println("Worker #1 " + workers.getById(1) + " will be removed");
        workers.delete(1);
        System.out.println(workers.getAll());
    }

}
