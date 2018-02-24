package com.study.guice.module

import com.google.inject.AbstractModule
import com.study.guice.application.Application
import com.study.guice.application.MyApp
import com.study.guice.service.LogService
import com.study.guice.service.UserService
import com.study.guice.service.impl.LogServiceImpl
import com.study.guice.service.impl.UserServiceImpl


class MyAppModule : AbstractModule() {
    override fun configure() {
        bind(LogService::class.java).to(LogServiceImpl::class.java)
        bind(UserService::class.java).to(UserServiceImpl::class.java)
        bind(Application::class.java).to(MyApp::class.java)
    }
}