package service;

import entity.Custom;

import java.util.List;

/**
 * @Name: CustomService
 * @Description:
 * @author: Olliween
 * @date: 2018/3/16 12:52
 */
public interface CustomService {
    void saveCustom(Custom custom);

    List<Custom> findCustomByName(String name);

    void deleteCustom(int id);

    void updateCustom(Custom custom);

    Custom findCustomById(int id);

    List<Custom> findAll();
}
