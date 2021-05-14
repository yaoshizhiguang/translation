package com.demo.springboot.translation.common.domain;

public class Cte {
    private Integer cteId;

    private String cWord;

    private String eWord;

    public Integer getCteId() {
        return cteId;
    }

    public void setCteId(Integer cteId) {
        this.cteId = cteId;
    }

    public String getcWord() {
        return cWord;
    }

    public void setcWord(String cWord) {
        this.cWord = cWord == null ? null : cWord.trim();
    }

    public String geteWord() {
        return eWord;
    }

    public void seteWord(String eWord) {
        this.eWord = eWord == null ? null : eWord.trim();
    }
}