package com.demo.springboot.translation.mapper;

import com.demo.springboot.translation.common.domain.Pte;
import com.demo.springboot.translation.common.domain.PteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PteMapper {
    long countByExample(PteExample example);

    int deleteByExample(PteExample example);

    int deleteByPrimaryKey(Integer pteid);

    int insert(Pte record);

    int insertSelective(Pte record);

    List<Pte> selectByExampleWithBLOBs(PteExample example);

    List<Pte> selectByExample(PteExample example);

    Pte selectByPrimaryKey(Integer pteid);

    int updateByExampleSelective(@Param("record") Pte record, @Param("example") PteExample example);

    int updateByExampleWithBLOBs(@Param("record") Pte record, @Param("example") PteExample example);

    int updateByExample(@Param("record") Pte record, @Param("example") PteExample example);

    int updateByPrimaryKeySelective(Pte record);

    int updateByPrimaryKeyWithBLOBs(Pte record);
}