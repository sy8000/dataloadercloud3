package cn.besbing.client.enums;


/**
 * 状态码
 */
public enum StatusCode {

    SUCCESS(200,"操作成功"),
    FAILED(-1,"操作失败"),
    INVALIDPARAMS(201,"非法参数"),
    USERNOTEXIST(-2,"用户不存在"),
    PASSWDERROR(-3,"密码错误"),
    OTHERUNKOWERROR(-4,"其它未知错误"),
    DBINSERTFAILED(-5,"数据库写入失败"),
    DBSELECTFAILED(-6,"数据库查询失败"),
    DBUPDATEFAILED(-7,"数据库更新失败"),
    DBDELETEFAILED(-8,"数据库更新失败"),
    DBSELECTSEARCHFAILED(-9,"获取那个天才的人员信息失败^_^"),
    BAIDUAPISEARCHFAILED(-10,"百度API翻译转换失败")
    ;

    private Integer code;
    private String msg;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
