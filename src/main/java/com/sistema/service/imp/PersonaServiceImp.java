package com.sistema.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sistema.dao.IPersonaDao;
import com.sistema.service.IPersonaService;

@Service
public class PersonaServiceImp implements IPersonaService {

	@Autowired
	@Qualifier("persona1")
	private IPersonaDao personaDao;
	
	@Override
	public String getName() {
		return personaDao.getName();
	}

}
