package service.service;

import java.util.List;

public interface EgresadosIDAO {
    <T> List<T> getAll(String nameQuery, Class<T> clazz);
    <T> void insert(T entity);
    <T> T update(T entity);
    <T> void remove(T entity);
}
