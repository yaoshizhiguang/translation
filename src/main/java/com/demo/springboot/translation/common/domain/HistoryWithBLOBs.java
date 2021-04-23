package com.demo.springboot.translation.common.domain;

public class HistoryWithBLOBs extends History {
    private String origintext;

    private String resulttext;

    public String getOrigintext() {
        return origintext;
    }

    public void setOrigintext(String origintext) {
        this.origintext = origintext == null ? null : origintext.trim();
    }

    public String getResulttext() {
        return resulttext;
    }

    public void setResulttext(String resulttext) {
        this.resulttext = resulttext == null ? null : resulttext.trim();
    }
}