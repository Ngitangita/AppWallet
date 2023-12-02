package com.app.wellet.Utils.Mapper;

public interface Mapper <D, E> {
    D toEntity(E entity);
    E fromEntity(D domain);
}
