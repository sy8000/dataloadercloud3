package cn.besbing.model.entities.primary;

public class ListEntry extends ListEntryKey {
    private String value;

    private Long orderNumber;

    private String cEnValue;

    private Long cContValue;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getcEnValue() {
        return cEnValue;
    }

    public void setcEnValue(String cEnValue) {
        this.cEnValue = cEnValue;
    }

    public Long getcContValue() {
        return cContValue;
    }

    public void setcContValue(Long cContValue) {
        this.cContValue = cContValue;
    }
}