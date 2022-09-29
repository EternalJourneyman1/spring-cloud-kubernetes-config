package dev.robinsond.config.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class ClientApplication {
	@Value("\${user.phone}")
	lateinit var phone: String

	@Value("\${user.role}")
	lateinit var role: String

	@GetMapping(
		value = ["/profile/{firstName}"],
		produces = [MediaType.TEXT_PLAIN_VALUE]
	)
	fun getUserRole(@PathVariable firstName: String = "John Doe"): String {
		return "Welcome $firstName You are currently assigned as a $role, so we will give you a $phone"
	}
}

fun main(args: Array<String>) {
	runApplication<ClientApplication>(*args)
}
