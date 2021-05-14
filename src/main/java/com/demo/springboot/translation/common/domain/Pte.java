package com.demo.springboot.translation.common.domain;

public class Pte {
    private Integer pteid;

    private String pword;

    private String eword;

    public Integer getPteid() {
        return pteid;
    }

    public void setPteid(Integer pteid) {
        this.pteid = pteid;
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword == null ? null : pword.trim();
    }

    public String getEword() {
        return eword;
    }

    public void setEword(String eword) {
        this.eword = eword == null ? null : eword.trim();
    }
}