package com.master.mybatis.mapper;

import java.util.UUID;

import com.master.mybatis.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    public User getByUuid(UUID uuid);

    public User getByEmail(String email);

    public void createUser(User user);

    public void removeByUuid(UUID uuid);

    public void removeByEmail(String email);

    public void updateByUuid(UUID uuid);

    public void updateByEmail(String email);
}