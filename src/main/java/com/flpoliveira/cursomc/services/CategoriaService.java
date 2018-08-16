package com.flpoliveira.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flpoliveira.cursomc.domain.Categoria;
import com.flpoliveira.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService 
{
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id)
	{
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
