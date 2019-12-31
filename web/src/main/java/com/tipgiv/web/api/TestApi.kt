package com.tipgiv.web.api

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/test/ping")
@RestController
class TestApi {
    class Pong {
        val pong: String get() = "pong"
    }

    @PostMapping
    fun ping(): ApiResult<Pong> {
        return ApiResult(Pong())
    }
}
