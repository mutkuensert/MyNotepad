package com.mutkuensert

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyNotepadApplication()

fun main(args: Array<String>) {
    runApplication<MyNotepadApplication>(*args)
}