package com.example.lab10.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="user class",description = "CS304 lab10 doc study, this is user class, tested by ID+name")


public class User {
    @ApiModelProperty(value = "user's name",example = "lucy",required = true)
    public String userName;
    @ApiModelProperty(value = "user's password",example = "123456",required = true)
    public String password;
}
