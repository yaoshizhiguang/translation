package com.demo.springboot.translation.common.domain;

import java.util.Date;

public class History {
    private Integer hid;

    private Integer uid;

    private Integer huid;

    private Date time;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getHuid() {
        return huid;
    }

    public void setHuid(Integer huid) {
        this.huid = huid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}