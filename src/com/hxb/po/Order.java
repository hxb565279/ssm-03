package com.hxb.po;

import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2020-10-15 09:23:17
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -82305260163341866L;

    private Integer orderid;

    private String ordusername;

    private String ordphone;

    private String ordadress;

    private Integer ordnumber;


    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrdusername() {
        return ordusername;
    }

    public void setOrdusername(String ordusername) {
        this.ordusername = ordusername;
    }

    public String getOrdphone() {
        return ordphone;
    }

    public void setOrdphone(String ordphone) {
        this.ordphone = ordphone;
    }

    public String getOrdadress() {
        return ordadress;
    }

    public void setOrdadress(String ordadress) {
        this.ordadress = ordadress;
    }

    public Integer getOrdnumber() {
        return ordnumber;
    }

    public void setOrdnumber(Integer ordnumber) {
        this.ordnumber = ordnumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", ordusername='" + ordusername + '\'' +
                ", ordphone='" + ordphone + '\'' +
                ", ordadress='" + ordadress + '\'' +
                ", ordnumber=" + ordnumber +
                '}';
    }
}