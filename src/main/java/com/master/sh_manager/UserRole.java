package com.master.sh_manager;

public enum UserRole {

    ROLE_GUEST (1), ROLE_DEFAULT (2), ROLE_MANAGER (3), ROLE_OWNER (4), ROLE_ADMIN (5);

    private UserRole(int i) {
    }

    public static UserRole getRoleByName(String roleName){
        for (UserRole role: UserRole.values()){
            if (role.name().equals(roleName)){
                return role;
            }
        }
        return null;
    }
}
