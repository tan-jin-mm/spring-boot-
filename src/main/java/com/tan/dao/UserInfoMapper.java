package com.tan.dao;

import com.tan.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_users
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_users
     *
     * @mbg.generated
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_users
     *
     * @mbg.generated
     */
    UserInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_users
     *
     * @mbg.generated
     */
    List<UserInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tj_users
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserInfo record);

    /**
     * 判断用户名密码是否存在
     */
    int checkUsername(String username);

    /**
     * 根据用户名和密码查询用户信息
     */
    UserInfo selectUserInfoByUsernameAndPassword(@Param("username") String username,
                                                 @Param("password") String password);
    /**
     * 校验邮箱
     */
    int checkEmail(String email);
    /**
     * 查找密保问题
     */
    String selectQuestionByUsername(String username);
    /**
     * 校验答案
     */
    int selectByUsernameAndQuestionAndAnswer(@Param("username") String username,
                                             @Param("question") String question,
                                             @Param("answer") String answer);
    /**
     * 忘记密码后修改密码
     */
    int updateUserPassword(@Param("username") String username,
                           @Param("passwordNew") String passwordNew);


    /**
     * 更新用户信息的方法
     */
    int updateUserBySelectActive(UserInfo userInfo);



}