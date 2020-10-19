package cn.besbing.model.entities.primary;

import lombok.Data;

import java.io.Serializable;

public class Dual implements Serializable {
    private String dummy;

    public String getDummy() {
        return dummy;
    }

    public void setDummy(String dummy) {
        this.dummy = dummy;
    }
}