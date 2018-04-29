package com.dev.admin.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.admin.board.entity.Board;
import com.dev.admin.infrastructure.dao.BoardDao;


@RestController
public class BoardController {

	@Autowired
	private BoardDao boardDao; 
	
	@RequestMapping("/add")
	public Board add(Board board) {
		Board boardData = boardDao.save(board);
		
		return boardData;
	}
	
	@RequestMapping("/list")
	public List<Board> list(Model model) {
		List<Board> boardList = boardDao.findAll();
		
		return boardList;
	}
	
	
}
