package com.m2m.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class CmsFeature4AddRequest extends CmsCredentialRequest implements Serializable {
    @NotNull
    private Integer featureGroupId;
    @NotNull
    private String name;
}