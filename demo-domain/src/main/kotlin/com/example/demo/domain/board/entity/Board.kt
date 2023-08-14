package com.example.demo.domain.board.entity

import java.time.LocalDateTime

class Board private constructor(
    val id: Long?,
    val title: String,
    val contents: String,
    val userId: Long,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
) {
    companion object {
        fun new(
            title: String,
            contents: String,
            userId: Long,
            current: LocalDateTime = LocalDateTime.now(),
        ) = Board(
            id = null,
            title = title,
            contents = contents,
            userId = userId,
            createdAt = current,
            updatedAt = current,
        )

        fun create(
            id: Long?,
            title: String,
            contents: String,
            userId: Long,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime,
        ) = Board(
            id = id,
            title = title,
            contents = contents,
            userId = userId,
            createdAt = createdAt,
            updatedAt = updatedAt,
        )
    }
}