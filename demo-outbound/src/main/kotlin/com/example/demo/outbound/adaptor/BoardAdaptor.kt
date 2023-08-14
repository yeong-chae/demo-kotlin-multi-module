package com.example.demo.outbound.adaptor

import com.example.demo.domain.board.entity.Board
import com.example.demo.domain.board.port.GetBoardPort
import com.example.demo.domain.board.port.SaveBoardPort
import com.example.demo.outbound.persistence.model.BoardModel
import com.example.demo.outbound.persistence.repository.BoardRepository
import org.springframework.stereotype.Component

@Component
class BoardAdaptor(
    private val boardRepository: BoardRepository,
) : GetBoardPort, SaveBoardPort {
    override fun getBoards(): List<Board> {
        return boardRepository.findAll().map(BoardModel::toDomain)
    }

    override fun save(entity: Board): Board {
        return boardRepository.save(BoardModel.fromDomain(entity)).toDomain()
    }
}