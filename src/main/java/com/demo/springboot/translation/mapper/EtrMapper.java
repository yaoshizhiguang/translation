package com.demo.springboot.translation.mapper;

import com.demo.springboot.translation.common.domain.Etr;
import com.demo.springboot.translation.common.domain.EtrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtrMapper {
    long countByExample(EtrExample example);

    int deleteByExample(EtrExample example);

    int deleteByPrimaryKey(Integer etrid);

    int insert(Etr record);

    int insertSelective(Etr record);

    List<Etr> selectByExampleWithBLOBs(EtrExample example);

    List<Etr> selectByExample(EtrExample example);

    Etr selectByPrimaryKey(Integer etrid);

    int updateByExampleSelective(@Param("record") Etr record, @Param("example") EtrExample example);

    int updateByExampleWithBLOBs(@Param("record") Etr record, @Param("example") EtrExample example);

    int updateByExample(@Param("record") Etr record, @Param("example") EtrExample example);

    int updateByPrimaryKeySelective(Etr record);

    int updateByPrimaryKeyWithBLOBs(Etr record);
}