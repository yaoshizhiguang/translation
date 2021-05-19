package com.demo.springboot.translation.mapper;

import com.demo.springboot.translation.common.domain.Etp;
import com.demo.springboot.translation.common.domain.EtpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtpMapper {
    long countByExample(EtpExample example);

    int deleteByExample(EtpExample example);

    int deleteByPrimaryKey(Integer etpid);

    int insert(Etp record);

    int insertSelective(Etp record);

    List<Etp> selectByExampleWithBLOBs(EtpExample example);

    List<Etp> selectByExample(EtpExample example);

    Etp selectByPrimaryKey(Integer etpid);

    int updateByExampleSelective(@Param("record") Etp record, @Param("example") EtpExample example);

    int updateByExampleWithBLOBs(@Param("record") Etp record, @Param("example") EtpExample example);

    int updateByExample(@Param("record") Etp record, @Param("example") EtpExample example);

    int updateByPrimaryKeySelective(Etp record);

    int updateByPrimaryKeyWithBLOBs(Etp record);
}