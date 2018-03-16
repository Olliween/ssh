package action;

import com.opensymphony.xwork2.Action;
import entity.Custom;
import service.CustomService;

/**
 * @Name: UpdateAction
 * @Description:
 * @author: Olliween
 * @date: 2018/3/16 13:58
 */
public class UpdateAction implements Action {
    private CustomService customService;
    private Custom custom;
    private int id;

    public CustomService getCustomService() {
        return customService;
    }

    public void setCustomService(CustomService customService) {
        this.customService = customService;
    }

    public Custom getCustom() {
        return custom;
    }

    public void setCustom(Custom custom) {
        this.custom = custom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        if (customService.findCustomById(custom.getId()) != null) {
            setCustom(custom);
            customService.updateCustom(custom);
            return "SUCCESS";
        }
        return "INPUT";
    }
}
