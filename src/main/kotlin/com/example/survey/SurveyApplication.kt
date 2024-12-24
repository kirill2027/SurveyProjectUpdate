package com.example.survey

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories
@SpringBootApplication
class SurveyApplication

fun main(args: Array<String>) {
    runApplication<SurveyApplication>(*args)
}
