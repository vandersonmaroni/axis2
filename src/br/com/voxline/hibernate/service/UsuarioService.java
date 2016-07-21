package br.com.voxline.hibernate.service;

import java.io.Serializable;

import org.jboss.logging.Logger;

import br.com.voxline.hibernate.dao.UsuarioDao;
import br.com.voxline.hibernate.model.Usuario;

public class UsuarioService implements Serializable {
	private static final long serialVersionUID = 5136706470859050210L;
	private static final Logger log = Logger.getLogger(Usuario.class);
	
	public UsuarioDao dao = new UsuarioDao();

	public Usuario getUsuarioWithId(int id) {
		return dao.getUsuariWithId(id);
	}

	public void save(Usuario usuario) {
		try {
			log.info("Salvando usuario "+usuario.getNome());
			dao.save(usuario);
		}catch (NumberFormatException e) {
			log.warn("Parametros NULL");
		}
		log.info("Usuário "+usuario.getNome()+" adicionado com sucesso!");
	}
}
