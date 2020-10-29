package cn.besbing.server.controllers.pages;

import cn.besbing.model.entities.primary.CProjLoginSample;
import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.ListObject;
import cn.besbing.model.entities.primary.ResultView;
import cn.besbing.server.service.primary.PrimaryCProjLoginSampleServiceImpl;
import cn.besbing.server.service.primary.PrimaryCProjTaskCoreServiceImpl;
import cn.besbing.server.service.primary.PrimaryResultViewServiceImple;
import cn.besbing.server.utils.AbstractLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    @Autowired
    private PrimaryResultViewServiceImple resultViewServiceImple;

    @Autowired
    private PrimaryCProjTaskCoreServiceImpl taskCoreService;

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

    @GetMapping("viewcharge")
    public String viewcharge(Model model, String taskId) {
        try{
            //开始整理在查看结果页面待显示的表单
            List<String> resultnames = resultViewServiceImple.getDistinctResultNameByTaskid(taskId);
            List<String> resultsamples = resultViewServiceImple.getDistinctResultSampleByTaskid(taskId);
            List<ResultView> resultViews = resultViewServiceImple.getResultViewByTaskid(taskId);


            /**
             * 组装测试条件
             */
            List<ListObject> conditions = new ArrayList<>();
            try {
                conditions = taskCoreService.getTestConditionsByTaskid(taskId);
                Collections.sort(conditions);
            }catch (Exception e){
                e.getStackTrace();
            }




            String tableData[][] = new String[resultsamples.size()+1][resultnames.size()+1];
            tableData[0][0] = "试验详细数据";
            /*列生成*/
            for (int i = 1;i < tableData[0].length;i++){
                tableData[0][i] = resultnames.get(i-1);
            }
            /*样品行生成*/
            for (int i = 1;i < tableData.length; i++){
                tableData[i][0] = resultsamples.get(i-1);
            }
            /*测试数据插入*/
            for (ResultView resultView : resultViews){
                for (int i = 1;i < resultsamples.size()+1;i++){
                    for (int j = 1;j < resultnames.size()+1; j++){
                        if (resultView.getName().equals(tableData[0][j]) && resultView.getSampleNumber().toString().equals(tableData[i][0])){
                            tableData[i][j] = resultView.getFormatvalue();
                        }
                    }
                }
            }

            /**
             * 组装返回的表格数据
             */
            String htmlTable = "<table class='layui-table'><tbody>";

            for (int i = 0;i < tableData.length; i++){
                htmlTable += "<tr>";
                for (int j = 0; j< tableData[0].length; j++){
                    htmlTable += "<td>" + tableData[i][j] + "</td>";
                }
                htmlTable += "</tr>";
            }

            htmlTable += "</tbody></table>";



            /**
             * 组装逻辑(important！将来可能用在lims3.0的报告显示)：
             */
            model.addAttribute("tableX",resultnames.size() + 1);
            model.addAttribute("tableY",resultsamples.size());
            model.addAttribute("tabledata", Arrays.asList(tableData));
            model.addAttribute("htmlTable",htmlTable);
            model.addAttribute("conditions",conditions);


        }catch (Exception e){
            logger.error(this.getClass() + "error:" + e.getStackTrace());
        }
        return "pages/lims/serviceforself/viewcharge/viewcharge";
    }

}
