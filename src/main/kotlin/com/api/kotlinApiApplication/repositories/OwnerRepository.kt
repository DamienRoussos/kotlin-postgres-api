package com.api.kotlinApiApplication.repositories

import com.api.kotlinApiApplication.models.OwnerModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface OwnerRepository : JpaRepository<OwnerModel, String>