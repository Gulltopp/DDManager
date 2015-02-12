package fr.DDManager.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.DDManager.model.Charakter;

@Repository
public class CharacterDAOImpl implements CharacterDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addCharacter(Charakter character) {
		sessionFactory.getCurrentSession().save(character);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Charakter> listCharacters() {
		return sessionFactory.getCurrentSession()
				.createCriteria(Charakter.class).list();
	}

	@Override
	public void removeCharacter(Integer id) {
		Charakter character = (Charakter) sessionFactory.getCurrentSession()
				.load(Charakter.class, id);
		if (null != character) {
			sessionFactory.getCurrentSession().delete(character);
		}

	}

	public Charakter getcharacter(Integer id) {
		Charakter character = (Charakter) sessionFactory.getCurrentSession()
				.get(Charakter.class, id);
		return character;
	}

	@Override
	public void saveCharacter(Charakter character) {
		sessionFactory.getCurrentSession().update(character);

	}

}
