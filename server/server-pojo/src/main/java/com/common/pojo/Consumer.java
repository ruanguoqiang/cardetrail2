package com.common.pojo;

public class Consumer {
    private String cno;

    private String cname;

    private String cadddr;

    private String ctel;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCadddr() {
        return cadddr;
    }

    public void setCadddr(String cadddr) {
        this.cadddr = cadddr == null ? null : cadddr.trim();
    }

    public String getCtel() {
        return ctel;
    }

    public void setCtel(String ctel) {
        this.ctel = ctel == null ? null : ctel.trim();
    }
}