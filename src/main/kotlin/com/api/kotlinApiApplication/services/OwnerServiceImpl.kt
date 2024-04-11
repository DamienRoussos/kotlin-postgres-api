package com.api.kotlinApiApplication.services

import com.api.kotlinApiApplication.dtos.OwnerDto
import com.api.kotlinApiApplication.models.OwnerModel
import com.api.kotlinApiApplication.repositories.OwnerRepository
import com.api.kotlinApiApplication.utils.mapper.OwnerMapper
import org.springframework.stereotype.Service

@Service
class OwnerServiceImpl(
    private val repository: OwnerRepository,
    private val ownerMapper: OwnerMapper
): OwnerService {
    override fun createOwner(ownerDto: OwnerDto): OwnerDto {
        val newOwner = ownerMapper.fromDTOToModel(ownerDto)
        repository.save(newOwner)
        return ownerMapper.fromModelToDTO(newOwner)
    }

    override fun getAll(): List<OwnerDto> {
        val ownerIterable = repository.findAll()
        val owners = mutableListOf<OwnerDto>()
        ownerIterable.forEach { owners.add(ownerMapper.fromModelToDTO(it)) }
        return owners
//        : List<OwnerModel> = ownerRepository.findAll()
    }
}