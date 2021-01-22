package com.jin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jin.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = HelloService.class,protocol = "dubbo") //发布服务必须使用Dubbo提供的Service注解
@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "8081 hello " + name;
    }
}
