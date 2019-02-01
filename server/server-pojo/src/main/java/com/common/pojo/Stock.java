package com.common.pojo;

public class Stock {
    private String stockno;

    private String stockname;

    private String goodno;

    private String storagesno;

    private Integer remain;

    public String getStockno() {
        return stockno;
    }

    public void setStockno(String stockno) {
        this.stockno = stockno == null ? null : stockno.trim();
    }

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname == null ? null : stockname.trim();
    }

    public String getGoodno() {
        return goodno;
    }

    public void setGoodno(String goodno) {
        this.goodno = goodno == null ? null : goodno.trim();
    }

    public String getStoragesno() {
        return storagesno;
    }

    public void setStoragesno(String storagesno) {
        this.storagesno = storagesno == null ? null : storagesno.trim();
    }

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }
}