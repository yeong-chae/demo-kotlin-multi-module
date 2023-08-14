package com.example.demo.outbound.persistence.model

import com.example.demo.domain.board.entity.Board
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "board")
class BoardModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column(name = "title")
    val title: String,
    @Column(name = "contents")
    val contents: String,
    @Column(name = "user_id")
    val userId: Long,
    @Column(name = "created_at")
    val createdAt: LocalDateTime,
    @Column(name = "updated_at")
    val updatedAt: LocalDateTime,
) {

    fun toDomain() = Board.create(
        id = id,
        title = title,
        contents = contents,
        userId = userId,
        createdAt = createdAt,
        updatedAt = updatedAt
    )

    companion object {
        fun fromDomain(entity: Board) = BoardModel(
            id = entity.id,
            title = entity.title,
            contents = entity.contents,
            userId = entity.userId,
            createdAt = entity.createdAt,
            updatedAt = entity.updatedAt,
        )
    }
}