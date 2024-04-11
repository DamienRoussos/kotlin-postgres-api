package com.api.kotlinApiApplication.services

import com.api.kotlinApiApplication.dtos.OwnerDto
import com.api.kotlinApiApplication.models.OwnerModel
import com.api.kotlinApiApplication.repositories.OwnerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
interface OwnerService {

//    Create an owner
    fun createOwner(ownerDto: OwnerDto): OwnerDto

//    Retrieve all owners
    fun getAll(): List<OwnerDto>

//    Retrieve a single owner by id if exists
//    fun getById(id: String): OwnerModel? = ownerRepository.findByIdOrNull(id)

//    Delete an owner by id
//    fun deleteById(id: String) {
//        val deleted = ownerRepository.deleteById(id)
//        return deleted
//    }

}