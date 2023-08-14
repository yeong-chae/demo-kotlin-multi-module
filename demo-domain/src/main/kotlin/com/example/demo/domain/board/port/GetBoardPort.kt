package com.example.demo.domain.board.port

import com.example.demo.domain.board.entity.Board

interface GetBoardPort {
    fun getBoards(): List<Board>
}