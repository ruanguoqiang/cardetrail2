package com.common.pojo;

import java.util.Date;

public class StockOut extends StockOutKey {
    private String storagesno;

    private Date stockouttime;

    private Integer stockoutnumber;

    private String stockoutprice;

    public String getStoragesno() {
        return storagesno;
    }

    public void setStoragesno(String storagesno) {
        this.storagesno = storagesno == null ? null : storagesno.trim();
    }

    public Date getStockouttime() {
        return stockouttime;
    }

    public void setStockouttime(Date stockouttime) {
        this.stockouttime = stockouttime;
    }

    public Integer getStockoutnumber() {
        return stockoutnumber;
    }

    public void setStockoutnumber(Integer stockoutnumber) {
        this.stockoutnumber = stockoutnumber;
    }

    public String getStockoutprice() {
        return stockoutprice;
    }

    public void setStockoutprice(String stockoutprice) {
        this.stockoutprice = stockoutprice == null ? null : stockoutprice.trim();
    }
}