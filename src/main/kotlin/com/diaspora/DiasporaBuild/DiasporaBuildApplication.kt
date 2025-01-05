package com.diaspora.DiasporaBuild

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DiasporaBuildApplication

fun main(args: Array<String>) {
	runApplication<DiasporaBuildApplication>(*args)
}
