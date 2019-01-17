package com.tan.service;


import com.tan.common.ServerResponse;
import com.tan.pojo.Shipping;

public interface IAddressService {
    /*
    * 添加地址
    * */
    ServerResponse add(Integer userId, Shipping shipping);
    /*
    * 删除地址（防止横向越权，用userId和shippingId组合）
    * */
    ServerResponse del(Integer userId, Integer shippingId);
    /*
    * 更新地址表
    * */
    ServerResponse update(Shipping shipping);
    /*
    * 查看具体地址
    * */
    ServerResponse select(Integer shippingId);
    /*
    * 分页查询地址列表
    * */
    ServerResponse list(Integer pageNum, Integer pageSize);
}
