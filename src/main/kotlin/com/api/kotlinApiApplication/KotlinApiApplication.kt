package com.api.kotlinApiApplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.api.kotlinApiApplication"])
class KotlinApiApplication

fun main(args: Array<String>) {
	runApplication<KotlinApiApplication>(*args)
}
