package com.sistema.dao.imp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.sistema.dao.IPersonaDao;

@Repository
@Qualifier("persona2")
public class Persona2DaoImp implements IPersonaDao {

	@Override
	public String getName() {
		return "Yo soy Sheyla";
	}

}
