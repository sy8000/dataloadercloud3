package cn.besbing.server.controllers.pages;

import cn.besbing.model.entities.primary.CProjLoginSample;
import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.server.service.primary.PrimaryCProjLoginSampleServiceImpl;
import cn.besbing.server.utils.AbstractLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Xiamen HLYY Network Technology Co., Ltd.
 * DataLoader Cloud
 *
 * @Author sheny
 * @Date 2020/10/16  14:24
 * @Version 1.0
 * @Site https://besbing.cn
 * @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
 */


@RequestMapping("dlclims")
@Controller
public class DataloaderCloudLimsControllers extends AbstractLog {

    @Autowired
    private PrimaryCProjLoginSampleServiceImpl primaryCProjLoginSampleService;

    @GetMapping("editproject")
    public String editproject(Model model, String seqnum) {
        try{
            CProjLoginSample cProjLoginSample = primaryCProjLoginSampleService.selectProjectInfobyPrimary(seqnum);
            model.addAttribute("projectInfo",cProjLoginSample);
        }catch (Exception e){
            logger.error(this.getClass() + "error:" + e.getStackTrace());
        }
        return "pages/lims/serviceforself/projectmodify/editproject";
    }

}
