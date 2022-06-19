package com.revature.repository;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {

    Object createObject(T t);

    T create(T t);

    List<T> getAll();

    T getById(int id);

    T update(T t);

    boolean deleteById(int id);

}
