package com.tan.dao;

import com.tan.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_order
     *
     * @mbg.generated
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_order
     *
     * @mbg.generated
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_order
     *
     * @mbg.generated
     */
    List<Order> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Order record);
    /*
    * 根据userId和orderNo查询订单
    * */
    Order findOrderByUserIdAndOrderNo(@Param("userId") Integer userId,
                                      @Param("orderNo") Long orderNo);

    /*
    * 按照用户ID查询订单
    * */
    List<Order> findOrderByUserId(Integer userId);
    /*
    * 根据订单号查询
    * */
    Order findOrderByOrderNo(Long orderNo);
}