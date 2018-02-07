package br.com.api.dto;

/**
 * 
 * @author rodolfo.ruffer
 *
 */
public class EmpresaDto {

	private Long id;
	private String razaoSocial​;
	private String cnpj;
	
	public EmpresaDto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the razaoSocial​
	 */
	public String getRazaoSocial​() {
		return razaoSocial​;
	}

	/**
	 * @param razaoSocial​ the razaoSocial​ to set
	 */
	public void setRazaoSocial​(String razaoSocial​) {
		this.razaoSocial​ = razaoSocial​;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return "EmpresaDto[id=" + this.id +
				" razão social=" + this.razaoSocial​ + 
				" CNPJ="         + this.cnpj + "]";
	}
	
}
