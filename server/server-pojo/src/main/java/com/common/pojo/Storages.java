package com.common.pojo;

public class Storages {
    private String sno;

    private String sname;

    private String sadddr;

    private Integer userid;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSadddr() {
        return sadddr;
    }

    public void setSadddr(String sadddr) {
        this.sadddr = sadddr == null ? null : sadddr.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}