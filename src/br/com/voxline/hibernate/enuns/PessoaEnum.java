package br.com.voxline.hibernate.enuns;

public enum PessoaEnum {
	JOAO(1,"João","É Gay"), PEDRO(2,"Pedro","É Gay"), PAULO(3,"Paulo","É Gay");
	
	public int id;
	public String nome;
	public String sexo;
	PessoaEnum(int id,String nome, String sexo){
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public static String verificandoSexoDaPessoaPeloId(int id){
		for (PessoaEnum pessoa : PessoaEnum.values()) {
			if(pessoa.id == id){
				return pessoa.nome+" "+pessoa.sexo;
			}
		}
		return "Id não encontrado";
	}
}
