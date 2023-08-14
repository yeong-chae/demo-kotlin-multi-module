package com.example.demo.inbound.web

import com.example.demo.domain.board.usecase.GetBoardsDto
import com.example.demo.domain.board.usecase.GetBoardsUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(
    private val getBoardsUseCase: GetBoardsUseCase,
) {

    @GetMapping
    fun getBoards(): List<GetBoardsDto> {
        return getBoardsUseCase.execute()
    }
}