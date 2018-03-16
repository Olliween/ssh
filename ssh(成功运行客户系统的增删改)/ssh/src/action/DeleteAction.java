package action;

import com.opensymphony.xwork2.Action;
import service.CustomService;

/**
 * @Name: DeleteAction
 * @Description:
 * @author: Olliween
 * @date: 2018/3/16 13:54
 */
public class DeleteAction implements Action {
    private CustomService customService;
    private  int id;

    public CustomService getCustomService() {
        return customService;
    }

    public void setCustomService(CustomService customService) {
        this.customService = customService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        customService.deleteCustom(id);
        return "success";
    }
}
