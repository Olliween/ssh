package dao;

import entity.Custom;

import java.util.List;

public interface CustomDAO {
    void save(Custom custom);

    List<Custom> getCustom(String name);

    void delete(int id);

    void update(Custom custom);

    Custom findById(int id);

    List<Custom> findAll();
}
