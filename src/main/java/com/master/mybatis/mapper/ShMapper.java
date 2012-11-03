package com.master.mybatis.mapper;

import java.util.UUID;

import com.master.mybatis.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ShMapper {

    /**
     * This method queue db for the user record by userUuid
     *
     * @param uuid user uuid
     * @return user instance
     */
    @Select("SELECT * FROM Users u WHERE u.userUUID = '${uuid}'")
    User selectByUserUuid(@Param("uuid") UUID uuid);

    /**
     * This method queue db for the user record by userEmail
     *
     * @param email user email
     * @return user instance
     */
    @Select("SELECT * FROM Users u WHERE u.userEmail = '${email}'")
    User selectByEmail(@Param("email") String email);
}