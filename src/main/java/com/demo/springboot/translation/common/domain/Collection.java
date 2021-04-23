package com.demo.springboot.translation.common.domain;

import java.util.Date;

public class Collection {
    private Integer cid;

    private Integer uid;

    private Integer cuid;

    private Date time;

    private Integer langguage;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCuid() {
        return cuid;
    }

    public void setCuid(Integer cuid) {
        this.cuid = cuid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getLangguage() {
        return langguage;
    }

    public void setLangguage(Integer langguage) {
        this.langguage = langguage;
    }
}