package ru.geekbrains.hometask3;

import java.util.List;

public interface IRepository <T, TId> {
    int create(T item);
    int update(TId id, T item);
    int delete(TId id);
    T getById(TId id);
    List<T> getAll();

}
