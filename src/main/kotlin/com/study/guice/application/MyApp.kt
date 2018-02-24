package com.study.guice.application

import com.google.inject.Inject
import com.google.inject.Singleton
import com.study.guice.service.LogService
import com.study.guice.service.UserService

@Singleton
class MyApp : Application {

    @Inject
    private lateinit var userService: UserService
    @Inject
    private lateinit var logService: LogService

    override fun work() {
        userService.process()
        logService.log("程序正常运行")
    }
}