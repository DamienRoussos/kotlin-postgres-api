package com.api.kotlinApiApplication.controllers

import com.api.kotlinApiApplication.dtos.OwnerDto
import com.api.kotlinApiApplication.models.OwnerModel
import com.api.kotlinApiApplication.services.OwnerService
import com.api.kotlinApiApplication.utils.mapper.OwnerMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException


@RestController
@RequestMapping("/owners")
class OwnerController(private val ownerService: OwnerService) {


//    Create new owner
    @PostMapping("/create")
    fun create(@RequestBody dto: OwnerDto): OwnerDto = ownerService.createOwner(dto)

//    Retrieve all owners
    @GetMapping
    fun retrieveAll(): List<OwnerDto> = ownerService.getAll()

//    Retrieve a single owner by id if exists
//    @GetMapping("/{id}")
//    fun retrieveById(@PathVariable id: String): OwnerModel? {
//        return if(ownerService.getById(id) == null) throw ResponseStatusException(HttpStatus.NOT_FOUND)
//            else ownerService.getById(id)
//    }

//    @DeleteMapping("/{id}")
//    fun deleteById(@PathVariable id: String) = ownerService.deleteById(id)

}