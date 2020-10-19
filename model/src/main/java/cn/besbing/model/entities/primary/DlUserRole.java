package cn.besbing.model.entities.primary;

import java.io.Serializable;

public class DlUserRole implements Serializable {
    private String cuserid;

    private String roleid;

    public String getCuserid() {
        return cuserid;
    }

    public void setCuserid(String cuserid) {
        this.cuserid = cuserid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}