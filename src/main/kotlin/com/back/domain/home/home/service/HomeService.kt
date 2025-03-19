package com.back.domain.home.home.service

import org.springframework.stereotype.Service
import java.lang.Thread.sleep
import java.net.InetAddress

@Service
class HomeService {
    init {
        sleep(10000)
    }

    fun getGreetings(): String {
        // 로컬 머신의 InetAddress 객체를 가져옴
        val inetAddress = InetAddress.getLocalHost()

        return "Hello, World!, $inetAddress"
    }
}