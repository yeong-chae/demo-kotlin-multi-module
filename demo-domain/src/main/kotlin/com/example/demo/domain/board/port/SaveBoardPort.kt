package com.example.demo.domain.board.port

import com.example.demo.domain.board.entity.Board

interface SaveBoardPort {
    fun save(entity: Board): Board
}