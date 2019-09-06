package com.example.welcome.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "message", url = "${app.feign.url}")
public interface MessageClient {
    @RequestMapping(method = RequestMethod.GET, value = "/message")
    String getMessage();
}
