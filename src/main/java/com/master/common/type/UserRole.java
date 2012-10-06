package com.master.common.type;

/**
 * Defines base user roles.
 */
public enum UserRole {

    /**
     * <b>GUEST</b> can only see common pages.
     */
    GUEST (0),

    /**
     * <b>MANAGER</b> can set up rates but couldn't add/delete properties
     */
    MANAGER (1),

    /**
     * <b>OWNER</b> can set up rates and delete own properties
     */
    OWNER (2),

    /**
     * <b>ADMIN</b> it's a god! even if he is dead :)
     */
    ADMIN (3);

    private UserRole(int i) {
    }
}
