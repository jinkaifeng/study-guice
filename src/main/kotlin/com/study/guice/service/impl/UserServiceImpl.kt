package com.study.guice.service.impl

import com.google.inject.Singleton
import com.study.guice.service.UserService

@Singleton
class UserServiceImpl :UserService{
    override fun process() {
        println("业务逻辑")
    }
}