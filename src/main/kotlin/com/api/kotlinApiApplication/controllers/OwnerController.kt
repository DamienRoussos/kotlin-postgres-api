package com.api.kotlinApiApplication.controllers

import com.api.kotlinApiApplication.models.OwnerModel
import com.api.kotlinApiApplication.services.OwnerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.util.*

@RestController
@RequestMapping("/owners")
class OwnerController(private val ownerService: OwnerService) {

//    Create new owner
    @PostMapping("/create")
    fun createOwner(@RequestBody owner: OwnerModel): OwnerModel = ownerService.createOwner(owner)

//    Retrieve all owners
    @GetMapping
    fun retrieveAll(): MutableIterable<OwnerModel> = ownerService.getAll()

//    Retrieve a single owner by id if exists
    @GetMapping("/{id}")
    fun retrieveById(@PathVariable id: UUID): OwnerModel? {
        return if(ownerService.getById(id) == null) throw ResponseStatusException(HttpStatus.NOT_FOUND)
            else ownerService.getById(id)
    }

//    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: UUID) = ownerService.deleteById(id)

}