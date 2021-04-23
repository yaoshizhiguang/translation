package com.demo.springboot.translation.common.domain;

public class Rte {
    private Integer rteid;

    private String rword;

    private String eword;

    public Integer getRteid() {
        return rteid;
    }

    public void setRteid(Integer rteid) {
        this.rteid = rteid;
    }

    public String getRword() {
        return rword;
    }

    public void setRword(String rword) {
        this.rword = rword == null ? null : rword.trim();
    }

    public String getEword() {
        return eword;
    }

    public void setEword(String eword) {
        this.eword = eword == null ? null : eword.trim();
    }
}