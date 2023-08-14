package com.example.demo.application.board

import com.example.demo.domain.board.port.GetBoardPort
import com.example.demo.domain.board.usecase.GetBoardsDto
import com.example.demo.domain.board.usecase.GetBoardsUseCase
import org.springframework.stereotype.Service

@Service
class GetBoardsService(
    private val getBoardPort: GetBoardPort,
) : GetBoardsUseCase {
    override fun execute(): List<GetBoardsDto> {
        return getBoardPort.getBoards().map { GetBoardsDto.fromDomain(it) }
    }
}