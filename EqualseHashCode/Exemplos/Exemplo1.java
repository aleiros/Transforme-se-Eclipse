package EqualseHashCode.Exemplos;

import java.util.Objects;

public class Exemplo1 {
	
	private String id;
	private String descricao;
	
	
	public Exemplo1(String string, String string2) {
		
	}

	public void Exemplo4(String id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public int hashCode() {
		return Objects.hash(descricao, id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exemplo1 other = (Exemplo1) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id);
	}

}
