package com.common.pojo;

import java.io.Serializable;

public class Provider implements Serializable{
    private String pno;

    private String pname;

    private String padddr;

    private String ptel;

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno == null ? null : pno.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPadddr() {
        return padddr;
    }

    public void setPadddr(String padddr) {
        this.padddr = padddr == null ? null : padddr.trim();
    }

    public String getPtel() {
        return ptel;
    }

    public void setPtel(String ptel) {
        this.ptel = ptel == null ? null : ptel.trim();
    }
}