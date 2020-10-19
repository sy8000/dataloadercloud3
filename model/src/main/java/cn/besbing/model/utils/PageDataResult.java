package cn.besbing.model.utils;

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
public class PageDataResult {

    //总记录数量
    private Integer totals;
    //当前页数据列表
    private List<?> list;

    //private Integer code=200;
    private Integer code=0;
    private String msg="";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PageDataResult() {
    }

    public PageDataResult( Integer totals,
                           List<?> list) {
        this.totals = totals;
        this.list = list;
    }

    public Integer getTotals() {
        return totals;
    }

    public void setTotals(Integer totals) {
        this.totals = totals;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override public String toString() {
        return "PageDataResult{" + "totals=" + totals + ", list=" + list
                + ", code=" + code + '}';
    }

}
