package com.api.kotlinApiApplication.services

import com.api.kotlinApiApplication.models.OwnerModel
import com.api.kotlinApiApplication.repositories.OwnerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class OwnerService(@Autowired private val ownerRepository: OwnerRepository) {

//    Create an owner
    fun createOwner(ownerEntity: OwnerModel): OwnerModel = ownerRepository.save(ownerEntity)

//    Retrieve all owners
    fun getAll() : List<OwnerModel> = ownerRepository.findAll()

//    Retrieve a single owner by id if exists
    fun getById(id: String): OwnerModel? = ownerRepository.findByIdOrNull(id)

//    Delete an owner by id
    fun deleteById(id: String) = ownerRepository.deleteById(id)

}