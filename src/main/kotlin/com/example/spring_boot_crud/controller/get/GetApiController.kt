package com.example.spring_boot_crud.controller.get

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class GetApiController {
    // @GetMapping("/hello")
    @GetMapping(path=["/hello", "/another"])
    fun hello(): String {
        return "hello"
    }

}