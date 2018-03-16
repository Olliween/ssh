package action;

import entity.Custom;
import service.CustomService;

/**
 * @Name: AddAction
 * @Description:
 * @author: Olliween
 * @date: 2018/3/16 13:44
 */
public class AddAction {
    private CustomService customService;

    public CustomService getCustomService() {
        return customService;
    }

    public void setCustomService(CustomService customService) {
        this.customService = customService;
    }

    private Custom newCustom;

    public Custom getNewCustom() {
        return newCustom;
    }

    public void setNewCustom(Custom newCustom) {
        this.newCustom = newCustom;
    }

    public String execute() {
        Custom custom = new Custom();
        custom.setName(newCustom.getName());
        custom.setPassword(newCustom.getPassword());
        custom.setMobile(newCustom.getMobile());
        custom.setEmail(newCustom.getEmail());
        customService.saveCustom(custom);
        return "SUCCESS";
    }
}
