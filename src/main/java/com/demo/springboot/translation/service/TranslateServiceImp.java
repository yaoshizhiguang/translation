package com.demo.springboot.translation.service;

import com.demo.springboot.translation.common.domain.*;
import com.demo.springboot.translation.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import sun.security.krb5.internal.EncTicketPart;

import java.util.List;

public class TranslateServiceImp implements TranslateService{
    @Autowired
    private CteMapper cteMapper;
    @Autowired
    private PteMapper pteMapper;
    @Autowired
    private RteMapper rteMapper;
    @Autowired
    private EtcMapper etcMapper;
    @Autowired
    private EtpMapper etpMapper;
    @Autowired
    private EtrMapper etrMapper;
    @Override
    public String findInDic(String input, String type) {
        if(type.equals("cte")){
            CteExample cteExample = new CteExample();
            cteExample.createCriteria().andCteWordEqualTo(input);
            List<Cte> cteList = cteMapper.selectByExample(cteExample);
            String result = cteList.get(0).getEword();
            return cteList.size() == 0 ?null:result;
        }else if(type.equals("pte")){
            PteExample pteExample = new PteExample();
            pteExample.createCriteria().andPteWordEqualTo(input);
            List<Pte> pteList = pteMapper.selectByExample(pteExample);
            String result = pteList.get(0).getEword();
            return pteList.size() == 0 ?null:result;
        }else if(type.equals("rte")){
            RteExample rteExample = new RteExample();
            rteExample.createCriteria().andRteWordEqualTo(input);
            List<Rte> rteList = rteMapper.selectByExample(rteExample);
            String result = rteList.get(0).getEword();
            return rteList.size() == 0 ?null:result;
        }else if(type.equals("etp")){
            EtpExample etpExample = new EtpExample();
            etpExample.createCriteria().andEtpWordEqualTo(input);
            List<Etp> etpList = etpMapper.selectByExample(etpExample);
            String result = etpList.get(0).getPword();
            return etpList.size() == 0 ?null:result;
        }else if(type.equals("etc")){
            EtcExample etcExample = new EtcExample();
            etcExample.createCriteria().andEtcWordEqualTo(input);
            List<Etc> etcList = etcMapper.selectByExample(etcExample);
            String result = etcList.get(0).getCword();
            return etcList.size() == 0 ?null:result;
        }else if(type.equals("etr")){
            EtrExample etrExample = new EtrExample();
            etrExample.createCriteria().andEtrWordEqualTo(input);
            List<Etr> etrList = etrMapper.selectByExample(etrExample);
            String result = etrList.get(0).getRword();
            return etrList.size() == 0 ?null:result;
        }
        return "no type!";
    }

}
