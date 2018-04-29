package com.dev.admin.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.admin.board.entity.Board;

public interface BoardDao extends JpaRepository<Board, Integer>{

}
