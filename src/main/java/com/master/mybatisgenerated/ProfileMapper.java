package com.master.mybatisgenerated;

import com.master.mybatisgenerated.Profile;
import com.master.mybatisgenerated.ProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profiles
     *
     * @mbggenerated Sat Sep 22 17:16:13 EEST 2012
     */
    int countByExample(ProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profiles
     *
     * @mbggenerated Sat Sep 22 17:16:13 EEST 2012
     */
    int deleteByExample(ProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profiles
     *
     * @mbggenerated Sat Sep 22 17:16:13 EEST 2012
     */
    int deleteByPrimaryKey(Integer idprofile);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profiles
     *
     * @mbggenerated Sat Sep 22 17:16:13 EEST 2012
     */
    int insert(Profile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profiles
     *
     * @mbggenerated Sat Sep 22 17:16:13 EEST 2012
     */
    int insertSelective(Profile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profiles
     *
     * @mbggenerated Sat Sep 22 17:16:13 EEST 2012
     */
    List<Profile> selectByExample(ProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profiles
     *
     * @mbggenerated Sat Sep 22 17:16:13 EEST 2012
     */
    Profile selectByPrimaryKey(Integer idprofile);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profiles
     *
     * @mbggenerated Sat Sep 22 17:16:13 EEST 2012
     */
    int updateByExampleSelective(@Param("record") Profile record, @Param("example") ProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profiles
     *
     * @mbggenerated Sat Sep 22 17:16:13 EEST 2012
     */
    int updateByExample(@Param("record") Profile record, @Param("example") ProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profiles
     *
     * @mbggenerated Sat Sep 22 17:16:13 EEST 2012
     */
    int updateByPrimaryKeySelective(Profile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profiles
     *
     * @mbggenerated Sat Sep 22 17:16:13 EEST 2012
     */
    int updateByPrimaryKey(Profile record);
}