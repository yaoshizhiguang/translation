package com.demo.springboot.translation.common.domain;

public class EtpExampleExtend extends EtpExample.Criteria {
    public EtpExample.Criteria andEtpWordEqualTo(String value) {
        addCriterion("eWord =", value, "eWord");
        return (EtpExample.Criteria) this;
    }
}
