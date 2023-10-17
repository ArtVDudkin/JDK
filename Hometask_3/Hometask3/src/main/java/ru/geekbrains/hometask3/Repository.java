package ru.geekbrains.hometask3;

import java.util.ArrayList;
import java.util.List;

public class Repository implements IWorkerRepository {

    private List<Worker> repo;

    public Repository() {
        this.repo = new ArrayList<>();
    }

    @Override
    public int create(Worker item) {
        this.repo.add(item);
        return 0;
    }

    @Override
    public int update(Integer index, Worker item) {
        repo.get(index).setName(item.getName());
        repo.get(index).setAge(item.getAge());
        repo.get(index).setSalary(item.getSalary());
        return 0;
    }

    @Override
    public int delete(Integer index) {
        repo.remove(repo.get(index));
        return 0;
    }

    @Override
    public Worker getById(Integer index) {
        if(index >= 0 && index < repo.size()) {
            return repo.get(index);
        }
        return null;
    }

    @Override
    public List<Worker> getAll() {
        return repo;
    }
}
