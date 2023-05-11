package com.devsuperior.dlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dlist.dto.GameDTO;
import com.devsuperior.dlist.dto.GameMinDTO;
import com.devsuperior.dlist.entities.Game;
import com.devsuperior.dlist.projections.GameMinProjection;
import com.devsuperior.dlist.repositories.GameRepository;



@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);		
		
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();	
		return  result.stream().map(x ->  new GameMinDTO(x)).toList();
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findByGameList(Long listId) {
		List<GameMinProjection> games = gameRepository.searchByList(listId);
		return games.stream().map(GameMinDTO::new).toList();
	}
}
