package com.api.kotlinApiApplication.services

import com.api.kotlinApiApplication.models.OwnerModel
import com.api.kotlinApiApplication.repositories.OwnerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class OwnerService(@Autowired val ownerRepository: OwnerRepository) {

    fun createOwner(ownerEntity: OwnerModel): OwnerModel = ownerRepository.save(ownerEntity)


}