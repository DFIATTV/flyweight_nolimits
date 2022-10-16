package patron.objetos.intrinseco;

public abstract class DataCiudadano {

	public String pais;
	public String ciudad;
    public String canton;
	public String genero;

	public DataCiudadano(String pais, String ciudad, String canton, String genero) {
		this.pais = pais;
		this.ciudad = ciudad;
		this.canton = canton;
		this.genero = genero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String mostrarData(String pDatosExtra) {
		return "DataCiudadano{" +
				"pais='" + getPais() + '\'' +
				", ciudad='" + getCiudad() + '\'' +
				", canton='" + getCanton() + '\'' +
				", genero='" + getGenero() + '\'' +
				pDatosExtra + " \n"+
				'}';
	}
}
