package com.demo.springboot.translation.common.domain;

public class Etc {
    private Integer etcid;

    private String eword;

    private String cword;

    public Integer getEtcid() {
        return etcid;
    }

    public void setEtcid(Integer etcid) {
        this.etcid = etcid;
    }

    public String getEword() {
        return eword;
    }

    public void setEword(String eword) {
        this.eword = eword == null ? null : eword.trim();
    }

    public String getCword() {
        return cword;
    }

    public void setCword(String cword) {
        this.cword = cword == null ? null : cword.trim();
    }
}