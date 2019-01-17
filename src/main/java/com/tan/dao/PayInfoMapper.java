package com.tan.dao;

import com.tan.pojo.PayInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PayInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_payinfo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_payinfo
     *
     * @mbg.generated
     */
    int insert(PayInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_payinfo
     *
     * @mbg.generated
     */
    PayInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_payinfo
     *
     * @mbg.generated
     */
    List<PayInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_payinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PayInfo record);
}