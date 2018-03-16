package action;

import entity.Custom;
import service.CustomService;

import java.util.Iterator;
import java.util.List;

/**
 * @Name: LoginAction
 * @Description:
 * @author: Olliween
 * @date: 2018/3/16 13:08
 */
public class LoginAction {
    private String name;
    private String password;
    private CustomService customService;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CustomService getCustomService() {
        return customService;
    }

    public void setCustomService(CustomService customService) {
        this.customService = customService;
    }

    public String execute() {
        List<Custom> list = (List<Custom>) customService.findCustomByName(name);
        Iterator<Custom> iterator = list.iterator();
        while (iterator.hasNext()) {
            Custom custom = iterator.next();
            if (name.trim().equals(custom.getName()) && password.trim().equals(custom.getPassword())) {
                return "success";
            }
        }
        return "failure";
    }
}
