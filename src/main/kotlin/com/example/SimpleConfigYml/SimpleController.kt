package com.example.SimpleConfigYml

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {
    @Value("\${server.port}")
    val port: String? = null

    @Value("\${app.name}")
    val name: String? = null

    @Value("\${app.user.name}")
    val userName: String? = null

    @RequestMapping("")
    fun info():String{
        return "Aplikacja $name została uruchomiona na porcie: $port"
    }

    @RequestMapping("user")
    fun userInfo():String{
        return "Imię: $userName"
    }
}
