package com.api.kotlinApiApplication.repositories

import com.api.kotlinApiApplication.dtos.OwnerDto
import com.api.kotlinApiApplication.models.OwnerModel
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface OwnerRepository : CrudRepository<OwnerModel, UUID>