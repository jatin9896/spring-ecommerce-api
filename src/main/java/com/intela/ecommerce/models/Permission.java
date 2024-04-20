package com.intela.ecommerce.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {
    CUSTOMER_READ("customer:read"),
    CUSTOMER_DELETE("customer:delete"),
    CUSTOMER_UPDATE("customer:update"),
    CUSTOMER_CREATE("customer:create"),

    ADMIN_READ("admin:read"),
    ADMIN_DELETE("admin:delete"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_CREATE("admin:create"),

    VENDOR_READ("vendor:read"),
    VENDOR_DELETE("vendor:delete"),
    VENDOR_UPDATE("vendor:update"),
    VENDOR_CREATE("vendor:create");

    @Getter
    private final String permission;

}
