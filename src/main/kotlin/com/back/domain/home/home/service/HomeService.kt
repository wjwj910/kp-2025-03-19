package com.back.domain.home.home.service

import org.springframework.stereotype.Service
import java.lang.Thread.sleep

@Service
class HomeService {
    init {
        sleep(10000)
    }

    fun getGreetings(): String {
        return "Hello, World!"
    }
}