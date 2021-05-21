package com.demo.springboot.translation.common.domain;

import java.util.Date;

public class History {
    private Integer hid;

    private String huid;

    private Date time;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHuid() {
        return huid;
    }

    public void setHuid(String huid) {
        this.huid = huid == null ? null : huid.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}