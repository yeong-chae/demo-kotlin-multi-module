package com.example.demo.domain.board.usecase

import com.example.demo.domain.board.entity.Board
import java.time.LocalDateTime

interface SaveBoardUseCase {
    fun execute(
        title: String,
        contents: String,
        userId: Long,
        createdAt: LocalDateTime,
    ): Board
}