package com.demo.springboot.translation.common.domain;

public class Etr {
    private Integer etrid;

    private String eword;

    private String rword;

    public Integer getEtrid() {
        return etrid;
    }

    public void setEtrid(Integer etrid) {
        this.etrid = etrid;
    }

    public String getEword() {
        return eword;
    }

    public void setEword(String eword) {
        this.eword = eword == null ? null : eword.trim();
    }

    public String getRword() {
        return rword;
    }

    public void setRword(String rword) {
        this.rword = rword == null ? null : rword.trim();
    }
}