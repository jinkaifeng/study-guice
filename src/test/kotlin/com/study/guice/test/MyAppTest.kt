package com.study.guice.test

import com.google.inject.Guice
import com.google.inject.Injector
import com.study.guice.application.Application
import com.study.guice.module.MyAppModule
import org.junit.Test


class MyAppTest {
    private var injector: Injector? = null

//    @BeforeClass
//    fun init2() {
//    }

    @Test
    fun testMyApp() {
        injector = Guice.createInjector(MyAppModule())
        val myApp = injector!!.getInstance(Application::class.java)
        myApp.work()
    }
}