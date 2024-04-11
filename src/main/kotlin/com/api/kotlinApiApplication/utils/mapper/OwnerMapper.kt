package com.api.kotlinApiApplication.utils.mapper

import com.api.kotlinApiApplication.dtos.OwnerDto
import com.api.kotlinApiApplication.models.OwnerModel
import org.springframework.stereotype.Service

@Service
class OwnerMapper: Mapper<OwnerDto, OwnerModel> {
    override fun fromModelToDTO(model: OwnerModel) = OwnerDto(
        model.id,
        model.firstName,
        model.lastName,
        model.taxNumber,
        model.phoneNumber,
        model.email,
        model.createdOn,
        model.updatedOn
    )
    override fun fromDTOToModel(dto: OwnerDto) = OwnerModel(
        dto.id,
        dto.firstName,
        dto.lastName,
        dto.taxNumber,
        dto.phoneNumber,
        dto.email,
        dto.createdOn,
        dto.updatedOn
    )
}