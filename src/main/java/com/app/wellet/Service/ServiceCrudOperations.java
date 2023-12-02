package com.app.wellet.Service;

import java.util.List;


public interface ServiceCrudOperations<S,C, L> {
    List<S> findAll();

    List<S> saveAll(List<C> toSave);

    List<S> updateAll(List<C> toUpdate);


    S saveByEntity(C toSave);


    S deleteByEntity(C toDelete);

    S updateByEntity(C toUpdate);
    S findByEntity(C toFind);

    S update(L id);

    S delete(L id);
    S findById(L id);
}
