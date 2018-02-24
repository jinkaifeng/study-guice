package com.study.guice.service.impl

import com.google.inject.Singleton
import com.study.guice.service.LogService

@Singleton
class LogServiceImpl :LogService{
    override fun log(msg:String) {
        println("-------LOG:$msg")
    }
}