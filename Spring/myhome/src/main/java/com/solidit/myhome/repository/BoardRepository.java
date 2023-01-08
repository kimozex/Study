package com.solidit.myhome.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.solidit.myhome.model.Board;

public interface BoardRepository extends JpaRepository<Board,Long> {

	List<Board> findByTitle(String title);

}