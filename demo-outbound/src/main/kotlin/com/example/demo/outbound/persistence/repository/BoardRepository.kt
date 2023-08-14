package com.example.demo.outbound.persistence.repository

import com.example.demo.outbound.persistence.model.BoardModel
import org.springframework.data.repository.Repository

interface BoardRepository : Repository<BoardModel, Long> {

    fun save(model: BoardModel): BoardModel
    fun findAll(): List<BoardModel>
}