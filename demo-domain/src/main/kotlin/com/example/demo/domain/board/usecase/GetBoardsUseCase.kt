package com.example.demo.domain.board.usecase

import com.example.demo.domain.board.entity.Board
import java.time.LocalDateTime

interface GetBoardsUseCase {
    fun execute(): List<GetBoardsDto>
}

data class GetBoardsDto(
    val id: Long,
    val title: String,
    val contents: String,
    val userId: Long,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
) {
    companion object {
        fun fromDomain(board: Board) = GetBoardsDto(
            board.id!!,
            board.title,
            board.contents,
            board.userId,
            board.createdAt,
            board.updatedAt
        )
    }
}