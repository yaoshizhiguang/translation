package com.demo.springboot.translation.mapper;

import com.demo.springboot.translation.common.domain.Rte;
import com.demo.springboot.translation.common.domain.RteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RteMapper {
    long countByExample(RteExample example);

    int deleteByExample(RteExample example);

    int deleteByPrimaryKey(Integer rteid);

    int insert(Rte record);

    int insertSelective(Rte record);

    List<Rte> selectByExampleWithBLOBs(RteExample example);

    List<Rte> selectByExample(RteExample example);

    Rte selectByPrimaryKey(Integer rteid);

    int updateByExampleSelective(@Param("record") Rte record, @Param("example") RteExample example);

    int updateByExampleWithBLOBs(@Param("record") Rte record, @Param("example") RteExample example);

    int updateByExample(@Param("record") Rte record, @Param("example") RteExample example);

    int updateByPrimaryKeySelective(Rte record);

    int updateByPrimaryKeyWithBLOBs(Rte record);
}