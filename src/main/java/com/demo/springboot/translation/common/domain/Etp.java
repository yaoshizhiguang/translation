package com.demo.springboot.translation.common.domain;

public class Etp {
    private Integer etpid;

    private String eword;

    private String pword;

    public Integer getEtpid() {
        return etpid;
    }

    public void setEtpid(Integer etpid) {
        this.etpid = etpid;
    }

    public String getEword() {
        return eword;
    }

    public void setEword(String eword) {
        this.eword = eword == null ? null : eword.trim();
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword == null ? null : pword.trim();
    }
}