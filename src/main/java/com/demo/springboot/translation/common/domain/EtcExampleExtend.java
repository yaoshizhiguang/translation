package com.demo.springboot.translation.common.domain;

public class EtcExampleExtend extends EtcExample.Criteria {
    public EtcExample.Criteria andEtcWordEqualTo(String value) {
        addCriterion("eWord =", value, "eWord");
        return (EtcExample.Criteria) this;
    }
}
