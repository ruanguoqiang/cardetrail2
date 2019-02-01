package com.common.pojo;

import java.util.Date;

public class StockIn extends StockInKey {
    private String storagesno;

    private Date stockintime;

    private Integer stockinnumber;

    private String stockinprice;

    public String getStoragesno() {
        return storagesno;
    }

    public void setStoragesno(String storagesno) {
        this.storagesno = storagesno == null ? null : storagesno.trim();
    }

    public Date getStockintime() {
        return stockintime;
    }

    public void setStockintime(Date stockintime) {
        this.stockintime = stockintime;
    }

    public Integer getStockinnumber() {
        return stockinnumber;
    }

    public void setStockinnumber(Integer stockinnumber) {
        this.stockinnumber = stockinnumber;
    }

    public String getStockinprice() {
        return stockinprice;
    }

    public void setStockinprice(String stockinprice) {
        this.stockinprice = stockinprice == null ? null : stockinprice.trim();
    }
}