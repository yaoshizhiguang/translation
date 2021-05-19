package com.demo.springboot.translation.mapper;

import com.demo.springboot.translation.common.domain.Etc;
import com.demo.springboot.translation.common.domain.EtcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtcMapper {
    long countByExample(EtcExample example);

    int deleteByExample(EtcExample example);

    int deleteByPrimaryKey(Integer etcid);

    int insert(Etc record);

    int insertSelective(Etc record);

    List<Etc> selectByExampleWithBLOBs(EtcExample example);

    List<Etc> selectByExample(EtcExample example);

    Etc selectByPrimaryKey(Integer etcid);

    int updateByExampleSelective(@Param("record") Etc record, @Param("example") EtcExample example);

    int updateByExampleWithBLOBs(@Param("record") Etc record, @Param("example") EtcExample example);

    int updateByExample(@Param("record") Etc record, @Param("example") EtcExample example);

    int updateByPrimaryKeySelective(Etc record);

    int updateByPrimaryKeyWithBLOBs(Etc record);
}