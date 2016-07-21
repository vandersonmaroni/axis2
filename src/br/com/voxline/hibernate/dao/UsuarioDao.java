package br.com.voxline.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.voxline.hibernate.model.Usuario;
import br.com.voxline.hibernate.util.factory.CriadorDeSession;

public class UsuarioDao implements Serializable {
	private static final long serialVersionUID = -4154507926271216900L;

	private Session session = CriadorDeSession.getSession();

	public void save(Usuario usuario) {
		Transaction tx = session.beginTransaction();
		session.save(usuario);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> getAll() {
		return session.createCriteria(Usuario.class).list();
	}

	public void delete(Usuario usuario) {
		Transaction tx = session.beginTransaction();
		session.delete(usuario);
		tx.commit();
		session.close();
	}

	public void alter(Usuario usuario) {
		Transaction tx = session.beginTransaction();
		session.merge(usuario);
		tx.commit();
		session.close();
	}

	public Usuario getUsuariWithId(int id) {
		String jpql = "SELECT u FROM Usuario u WHERE u.id = :id";
		Query query = session.createQuery(jpql).setParameter("id", id);
		return (Usuario) query.uniqueResult();
	}
}
