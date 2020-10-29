package cn.besbing.model.entities.primary;

import lombok.Getter;
import lombok.Setter;

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

public class ListObject implements Comparable<ListObject>{

    private String name;
    private Integer ordernumber;

    public ListObject(String name, Integer ordernumber) {
        this.name = name;
        this.ordernumber = ordernumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    @Override
    public int compareTo(ListObject object) {
        return this.ordernumber - object.getOrdernumber();
    }
}
