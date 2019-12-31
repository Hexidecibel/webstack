package com.tipgiv.web.api

import com.tipgiv.web.annotations.Optional

data class ApiResult<T>(
        @get:Optional
        val result: T? = null,
        @get:Optional
        val error: RootApiError? = null
){
}

enum class ErrorCode {
    UNKNOWN
}

data class ApiError(
        val code: ErrorCode,
        val message: String,
        val stack: String
)

data class RootApiError(
        val code: ErrorCode,
        val message: String,
        @get:Optional
        val stack: String? = null,
        @get:Optional
        val fieldErrors: Map<String, ApiError> = mapOf(),
        @get:Optional
        val globalErrors: List<ApiError> = listOf()
)
