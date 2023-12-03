package com.app.wellet.repository;

import java.util.List;

public interface RepositoryCrudOperations<S, C, L> {
    List<S> findAll();

    List<S> saveAll(List<C> toSave);

    List<S> updateAll(List<S> toUpdate);

    S saveByEntity(C toSave);

    S deleteByEntity(S toDelete);

    S findByEntity(S toFind);

    S findById(L id);

    S delete(L id);
}

