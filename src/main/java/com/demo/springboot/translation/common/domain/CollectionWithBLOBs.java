package com.demo.springboot.translation.common.domain;

public class CollectionWithBLOBs extends Collection {
    private String origintext;

    private String resulttext;

    private String cname;

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

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}