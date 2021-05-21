package com.demo.springboot.translation.common.domain;

public class HistoryWithBLOBs extends History {
    private String originText;

    private String resultText;

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
}