package br.com.voxline.hibernate.exemplo;

import br.com.voxline.hibernate.enuns.PessoaEnum;

public class Exemplo2 {
	public String isGay(int id){
		return PessoaEnum.verificandoSexoDaPessoaPeloId(id);
	}
}