package com.demo.springboot.translation.service;

import com.demo.springboot.translation.common.domain.*;
import com.demo.springboot.translation.mapper.CteMapper;
import com.demo.springboot.translation.mapper.PteMapper;
import com.demo.springboot.translation.mapper.RteMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TranslateServiceImp implements TranslateService{
    @Autowired
    private CteMapper cteMapper;
    @Autowired
    private PteMapper pteMapper;
    @Autowired
    private RteMapper rteMapper;
    @Override
    public boolean isInDic(String input,String type) {
        if(type.equals("cte")){
            CteExample cteExample = new CteExample();
            cteExample.createCriteria().andCteWordEqualTo(input);
            List<Cte> cteList = cteMapper.selectByExample(cteExample);
            return cteList.size() == 0 ? false:true;
        }else if(type.equals("pte")){
            PteExample pteExample = new PteExample();
            pteExample.createCriteria().andPteWordEqualTo(input);
            List<Pte> pteList = pteMapper.selectByExample(pteExample);
            return pteList.size() == 0 ? false:true;
        }else {
            RteExample rteExample = new RteExample();
            rteExample.createCriteria().andRteWordEqualTo(input);
            List<Rte> rteList = rteMapper.selectByExample(rteExample);
            return rteList.size() == 0 ? false:true;
        }

    }
}
