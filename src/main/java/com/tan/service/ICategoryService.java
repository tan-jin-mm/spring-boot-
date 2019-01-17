package com.tan.service;


import com.tan.common.ServerResponse;

public interface ICategoryService {
    /**
     * 获取品类子节点（平级）
     */
    ServerResponse get_categoty(Integer categoryId);
    /**
     * 增加节点
     */
    ServerResponse add_categoty(Integer parentId, String categoryName);
    /**
     * 修改品类名称
     */
    ServerResponse set_categoty_name(Integer categoryId, String categoryName);
    /**
     * 获取当前分类ID和所有子节点categoryId
     */
    ServerResponse get_deep_category(Integer categoryId);
}
