package com.demo.springboot.translation.common.domain;

public class CollectionWithBLOBs extends Collection {
    private String originText;

    private String resultText;

    private String cname;

    public String getOriginText() {
        return originText;
    }

    public void setOriginText(String originText) {
        this.originText = originText == null ? null : originText.trim();
    }

    public String getResultText() {
        return resultText;
    }

    public void setResultText(String resultText) {
        this.resultText = resultText == null ? null : resultText.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}