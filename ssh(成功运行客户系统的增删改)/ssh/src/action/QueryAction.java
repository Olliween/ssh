package action;

import entity.Custom;
import org.apache.struts2.ServletActionContext;
import service.CustomService;

import java.util.List;

/**
 * @Name: QueryAction
 * @Description:
 * @author: Olliween
 * @date: 2018/3/16 13:29
 */
public class QueryAction {
    private CustomService customService;

    public CustomService getCustomService() {
        return customService;
    }

    public void setCustomService(CustomService customService) {
        this.customService = customService;
    }

    public String execute() {
        List<Custom> list = customService.findAll();
        ServletActionContext.getRequest().setAttribute("customlist", list);
        return "success";
    }
}
