package com.demo.springboot.translation.common.domain;

public class Cte {
    private Integer cteid;

    private String cword;

    private String eword;

    public Integer getCteid() {
        return cteid;
    }

    public void setCteid(Integer cteid) {
        this.cteid = cteid;
    }

    public String getCword() {
        return cword;
    }

    public void setCword(String cword) {
        this.cword = cword == null ? null : cword.trim();
    }

    public String getEword() {
        return eword;
    }

    public void setEword(String eword) {
        this.eword = eword == null ? null : eword.trim();
    }
}