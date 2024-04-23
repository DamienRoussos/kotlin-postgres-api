package com.api.kotlinApiApplication.services

import com.api.kotlinApiApplication.models.OwnerModel
import com.api.kotlinApiApplication.repositories.OwnerRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class OwnerService(
    private val repository: OwnerRepository
) {
//    Create an owner
    fun createOwner(owner: OwnerModel): OwnerModel = repository.save(owner)

//    Retrieve all owners
    fun getAll(): MutableIterable<OwnerModel> = repository.findAll()

//    Retrieve a single owner by id if exists
    fun getById(id: UUID): OwnerModel? = repository.findByIdOrNull(id)

//    Delete an owner by id
    fun deleteById(id: UUID) = repository.deleteById(id)

}