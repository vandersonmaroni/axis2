package br.com.voxline.hibernate.exemplo;

import br.com.voxline.hibernate.model.UsuarioTeste;

public class ExemploUsuario {
	private UsuarioTeste usuario = new UsuarioTeste();

	public UsuarioTeste getUsuario(int id) {
		this.usuario.setId(id);
		this.usuario.setNome("Vanderson Maroni");
		this.usuario.setEndereco("Itaquera");
		this.usuario.setIdade(22);
		return usuario;
	}
	
	public int getId(UsuarioTeste usuario){
		return usuario.getId();
	}
}
