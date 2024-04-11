package com.api.kotlinApiApplication.utils.mapper

interface Mapper<DTO, Model> {

    fun fromModelToDTO(model: Model): DTO

    fun fromDTOToModel(dto: DTO): Model
}