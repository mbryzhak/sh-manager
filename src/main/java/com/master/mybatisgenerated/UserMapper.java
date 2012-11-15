package com.master.mybatisgenerated;

import com.master.mybatisgenerated.User;
import com.master.mybatisgenerated.UserExample;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    int countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    int deleteByPrimaryKey(Integer iduser);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    User selectByPrimaryKey(Integer iduser);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    int updateByPrimaryKey(User record);

    /**
     * This method queue db for the user record by userUuid
     *
     * @param userUUID user uuid
     * @return User instance
     */
    User selectByUuid(UUID userUUID);

    /**
     * This method queue db for the user record by userEmail
     *
     * @param email user email
     * @return User instance
     */
    User selectByEmail(String email);
}