package fr.yo.youtube.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.DAO;

/**
 * Classe servant � faire les functions de Reviews pour l'ihm
 **/

@Service
public class ReviewsManager {

	@Autowired
	DAO dao;
}
