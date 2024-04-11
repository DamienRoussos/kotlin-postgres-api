package com.api.kotlinApiApplication.dtos

import java.time.LocalDateTime
import java.util.UUID

data class OwnerDto(
    val id: UUID?,
    val firstName: String,
    val lastName: String,
    val taxNumber: String,
    val phoneNumber: String,
    val email: String,
    val createdOn: LocalDateTime?,
    val updatedOn: LocalDateTime?
)
