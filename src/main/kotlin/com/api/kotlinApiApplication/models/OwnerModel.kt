package com.api.kotlinApiApplication.models

import jakarta.persistence.*
import jakarta.persistence.Table
import org.hibernate.annotations.*
import java.util.Date

@Entity
@Table(name = "owners")
data class OwnerModel (

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    val id: String?,
    @Column(name = "name", nullable = false)
    val name: String,
    @Column(name = "taxNumber", nullable = false)
    val taxNumber: String,
    @Column(name = "phoneNumber", nullable = false)
    val phoneNumber: String,
    @Column(name = "email", nullable = false)
    val email: String,

)