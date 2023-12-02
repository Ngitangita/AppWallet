package com.app.wellet.repository;

import java.util.List;

public interface RepositoryCrudOperations<S, C, L> {
    List<S> findAll();

    List<S> saveAll(List<C> toSave);

    List<S> updateAll(List<S> toUpdate);

    S saveByEntity(C toSave);

    S deleteByEntity(C toDelete);

    S findByEntity(C toFind);

    S findById(L id);

    S delete(L id);
}

