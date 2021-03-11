package com.bcd.feign.client.service;

import com.bcd.feign.client.dto.UserResponse;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com/" , name = "FEIGN-CLIENT")
public interface UserService {

    @GetMapping("/users")
    public List<UserResponse> getUsers();
}
