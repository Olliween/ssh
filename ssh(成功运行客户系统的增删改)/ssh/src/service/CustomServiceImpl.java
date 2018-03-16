package service;

import dao.CustomDAO;
import entity.Custom;

import java.util.List;

/**
 * @Name: CustomServiceImpl
 * @Description:
 * @author: Olliween
 * @date: 2018/3/16 12:55
 */
public class CustomServiceImpl implements  CustomService {
    private CustomDAO customDAO;

    public CustomDAO getCustomDAO() {
        return customDAO;
    }

    public void setCustomDAO(CustomDAO customDAO) {
        this.customDAO = customDAO;
    }

    @Override
    public void saveCustom(Custom custom) {
        if (customDAO.findById(custom.getId()) == null) {
            customDAO.save(custom);
        }
    }

    @Override
    public List<Custom> findCustomByName(String name) {
        return customDAO.getCustom(name);
    }

    @Override
    public void deleteCustom(int id) {
        if (customDAO.findById(id)!=null) {
            customDAO.delete(id);
        }
    }

    @Override
    public void updateCustom(Custom custom) {
        if (customDAO.findById(custom.getId())!=null) {
            customDAO.update(custom);
        }
    }

    @Override
    public Custom findCustomById(int id) {
        return customDAO.findById(id);
    }

    @Override
    public List<Custom> findAll() {
        return customDAO.findAll();
    }
}
