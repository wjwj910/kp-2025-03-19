package com.back.domain.home.home.controller

import com.back.domain.home.home.service.HomeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(
    private val homeService: HomeService
) {
    @GetMapping("/")
    fun main(): String {
        return homeService.getGreetings()
    }
}