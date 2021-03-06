package com.m2m.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class CmsUser4LoginRequest implements Serializable {
    @NotNull
    private String name;
    @NotNull
    private String password;
}