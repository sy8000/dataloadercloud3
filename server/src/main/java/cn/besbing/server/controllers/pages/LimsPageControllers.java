package cn.besbing.server.controllers.pages;

import cn.besbing.model.entities.primary.DlSampleType;
import cn.besbing.server.service.primary.PrimaryCustomServiceImpl;
import cn.besbing.server.service.primary.PrimaryDlSampleTypeServiceImpl;
import cn.besbing.server.service.primary.PrimaryListEntryServiceImpl;
import cn.besbing.server.service.primary.PrimaryOrgOrgsServiceImpl;
import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("lims")
@Controller
public class LimsPageControllers {

    @Autowired
    PrimaryListEntryServiceImpl listEntryService;

    @Autowired
    PrimaryOrgOrgsServiceImpl orgOrgsService;

    @Autowired
    PrimaryDlSampleTypeServiceImpl sampleTypeService;


    @Autowired
    PrimaryCustomServiceImpl customService;

    @GetMapping("projectmodify")
    public String projectmodify(){
        return "pages/lims/serviceforself/projectmodify";
    }

    @GetMapping("confirmcharge")
    public String confirmcharge(){
        return "pages/lims/serviceforself/confirmcharge";
    }

    @GetMapping("analysismanage")
    public String analysismanage(){
        return "pages/lims/manage/analysismanage";
    }


    /**
     * 跳转时直接带入委托单初始值
     * @return
     */
    @GetMapping("newproject")
    public String newproject(Model model){
        /**
         * 开始获取所有预设的参照值
         */
        model.addAttribute("projType",listEntryService.getListValueByListName("C_APPLY_TYPE"));
        model.addAttribute("reportType",listEntryService.getListValueByListName("C_COA_FORMAT"));
        model.addAttribute("reportLang",listEntryService.getListValueByListName("C_COA_LANGUAGE"));
        model.addAttribute("sampleAfterTestProcess",listEntryService.getListValueByListName("C_RATAIN_HANDLE"));
        model.addAttribute("productProperty",listEntryService.getListValueByListName("产品属性"));
        model.addAttribute("requiredType",listEntryService.getListValueByListName("客户要求-需求类型"));
        model.addAttribute("testType",listEntryService.getListValueByListName("客户要求-测试类型"));
        model.addAttribute("testNatrueType",listEntryService.getListValueByListName("检验性质类型"));
        model.addAttribute("productIdentificationType",listEntryService.getListValueByListName("产品鉴定类型"));
        model.addAttribute("safetyCertificationType",listEntryService.getListValueByListName("安全认证类型"));
        model.addAttribute("orgs",orgOrgsService.getAllorg());
        model.addAttribute("myorg",orgOrgsService.getOrgByUsercode(SecurityUtils.getSubject().getSession().getAttribute("usercode").toString()));
        return "pages/lims/limsweb/createproject";
    }

    @GetMapping("samplereceive")
    public String samplereceive(){
        return "pages/lims/limsweb/samplereceive";
    }

    @GetMapping("clearLocationStorage")
    public String clearLocationStorage(){
        return "pages/lims/limsweb/sample/clearlocationstorage";
    }


    /**
     * 样品出入库设置
     * @param model
     * @return
     */
    @GetMapping("sampleType")
    public String sampleType(Model model){
        List<DlSampleType> list = sampleTypeService.getAllSampleType();
        model.addAttribute("sampleType",list);
        return "pages/lims/limsweb/manage/samplewarehousing";
    }


    /**
     * nc模板传输预加载数据
     * @param model
     * @return
     */
    @GetMapping("ncpreview")
    public String ncPreviewLoad(Model model){
        List<String> listProduct = customService.selectAsList("select pu.description || ':' || pu.version des " +
                "from product pu where  pu.active = 'T' order by pu.description ");
        model.addAttribute("productList",listProduct);
        return "pages/lims/serviceforself/ncpreview";
    }


}
