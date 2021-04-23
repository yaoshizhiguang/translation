package com.demo.springboot.translation.common.domain;

public class Pte {
    private Integer pteid;

    private String ptext;

    private String etext;

    public Integer getPteid() {
        return pteid;
    }

    public void setPteid(Integer pteid) {
        this.pteid = pteid;
    }

    public String getPtext() {
        return ptext;
    }

    public void setPtext(String ptext) {
        this.ptext = ptext == null ? null : ptext.trim();
    }

    public String getEtext() {
        return etext;
    }

    public void setEtext(String etext) {
        this.etext = etext == null ? null : etext.trim();
    }
}