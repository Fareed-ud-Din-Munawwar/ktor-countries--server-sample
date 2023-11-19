package com.example.plugins

import com.example.routes.getListOfCountries
import com.example.routes.getRandomCountry
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        getListOfCountries()
        getRandomCountry()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
