package cn.besbing.model.entities.primary;

import java.io.Serializable;

public class DlRolePermission implements Serializable {
    private String roleid;

    private String permissionid;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid;
    }
}