package com.app.wellet.Service;

import java.util.List;

public interface RepositoryCrudOperations<T, L>{
    List<T> findAll();

    List<T> saveAll(List<T> toSave);

    List<T> updateAll(List<T> toUpdate);


    T saveByEntity(T toSave);


    T deleteByEntity(T toDelete);

    T updateByEntity(T toUpdate);
    T findByEntity(L toFind);

    T update(L id);

    T delete(L id);
    T findById(L id);
}
