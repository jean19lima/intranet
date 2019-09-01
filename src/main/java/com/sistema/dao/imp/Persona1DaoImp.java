package com.sistema.dao.imp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.sistema.dao.IPersonaDao;

@Repository
@Qualifier("persona1")
public class Persona1DaoImp implements IPersonaDao {

	@Override
	public String getName() {
		return "Yo soy Jean";
	}

}
