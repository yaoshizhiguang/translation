package com.demo.springboot.translation.mapper;

import com.demo.springboot.translation.common.domain.Cte;
import com.demo.springboot.translation.common.domain.CteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CteMapper {
    long countByExample(CteExample example);

    int deleteByExample(CteExample example);

    int deleteByPrimaryKey(Integer cteid);

    int insert(Cte record);

    int insertSelective(Cte record);

    List<Cte> selectByExampleWithBLOBs(CteExample example);

    List<Cte> selectByExample(CteExample example);

    Cte selectByPrimaryKey(Integer cteid);

    int updateByExampleSelective(@Param("record") Cte record, @Param("example") CteExample example);

    int updateByExampleWithBLOBs(@Param("record") Cte record, @Param("example") CteExample example);

    int updateByExample(@Param("record") Cte record, @Param("example") CteExample example);

    int updateByPrimaryKeySelective(Cte record);

    int updateByPrimaryKeyWithBLOBs(Cte record);
}