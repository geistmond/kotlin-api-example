package com.example

import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

/*import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import org.junit.Assert.assertEquals
import org.junit.Test*/

fun main() {
    embeddedServer(Netty, 
    port = 8080, 
    host = "0.0.0.0", 
    module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureDatabases()
    configureSockets()
    configureTemplating()
    configureMonitoring()
    configureRouting()
}

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("<h1>Hello World!<h1>")
        }
        /*get("/test1") {
            call.respondText()
        } */
    }
}