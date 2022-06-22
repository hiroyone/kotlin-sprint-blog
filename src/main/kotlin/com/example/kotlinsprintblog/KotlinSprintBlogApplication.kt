package com.example.kotlinsprintblog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class KotlinSprintBlogApplication

fun main(args: Array<String>) {
	runApplication<KotlinSprintBlogApplication>(*args)
}
