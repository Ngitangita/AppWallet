package com.app.wellet.service;

import java.util.List;


public interface ServiceCrudOperations<S, C, L>{
    List<S> findAll();

    List<S> saveAll(List<C> toSave);

    List<S> updateAll(List<S> toUpdate);

    S saveByEntity(C toSave);

    S deleteByEntity(S toDelete);

    S findById(L id);

    S delete(L id);
}