package com.api.kotlinApiApplication.controllers

import com.api.kotlinApiApplication.models.OwnerModel
import com.api.kotlinApiApplication.services.OwnerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/owners")
class OwnerController(@Autowired val ownerService: OwnerService) {

    @GetMapping
    fun get():String = "Yo"

//    Create new owner
    @PostMapping("/create")
    fun create(@RequestBody owner: OwnerModel) = ownerService.createOwner(owner)
}