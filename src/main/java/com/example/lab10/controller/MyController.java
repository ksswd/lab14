package com.example.lab10.controller;
import com.example.lab10.user.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
    @RequestMapping(value = "/hello")
    @ApiOperation(value = "cs304 lab10", notes="just test")
    //@ApiParam(name = "cs304 lab10",value = "just test",defaultValue = "abc",required = true)
    public String hello(){
        return "helloCS304";
    }
    @RequestMapping(value = "/hello02")
    public String hello02(@ApiParam(name = "usernameTest",value = "user test describe",required = true,example = "string") @PathVariable String id){
        return "helloCS304";
    }
    @RequestMapping(value = "/user")
    @ApiOperation(value="It's just a testcase for user class, tested by ID+name")
    public User getUser()
    {
        return new User();
    }
}
