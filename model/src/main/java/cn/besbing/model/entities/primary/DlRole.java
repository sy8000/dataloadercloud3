package cn.besbing.model.entities.primary;

import java.io.Serializable;
import java.math.BigDecimal;

public class DlRole implements Serializable {
    private String roleid;

    private BigDecimal available;

    private Object description;

    private String rolename;

    private Object vdef1;

    private Object vdef2;

    private Object vdef3;

    private Object vdef4;

    private Object vdef5;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public BigDecimal getAvailable() {
        return available;
    }

    public void setAvailable(BigDecimal available) {
        this.available = available;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Object getVdef1() {
        return vdef1;
    }

    public void setVdef1(Object vdef1) {
        this.vdef1 = vdef1;
    }

    public Object getVdef2() {
        return vdef2;
    }

    public void setVdef2(Object vdef2) {
        this.vdef2 = vdef2;
    }

    public Object getVdef3() {
        return vdef3;
    }

    public void setVdef3(Object vdef3) {
        this.vdef3 = vdef3;
    }

    public Object getVdef4() {
        return vdef4;
    }

    public void setVdef4(Object vdef4) {
        this.vdef4 = vdef4;
    }

    public Object getVdef5() {
        return vdef5;
    }

    public void setVdef5(Object vdef5) {
        this.vdef5 = vdef5;
    }
}