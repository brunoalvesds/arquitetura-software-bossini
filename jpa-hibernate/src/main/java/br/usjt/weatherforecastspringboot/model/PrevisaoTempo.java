package br.usjt.weatherforecastspringboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PrevisaoTempo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne(mappedBy = "id_dia", optional = false)
	private Dia dia;
	private Integer tempMinima;
	private Integer tempMaxima;
	private Integer umidadeRelativaAr;
	private String descricao;
	private String dataHora;
	private String latitude;
	private String longitude;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public Integer getTempMinima() {
		return tempMinima;
	}

	public void setTempMinima(Integer tempMinima) {
		this.tempMinima = tempMinima;
	}

	public Integer getTempMaxima() {
		return tempMaxima;
	}

	public void setTempMaxima(Integer tempMaxima) {
		this.tempMaxima = tempMaxima;
	}

	public Integer getUmidadeRelativaAr() {
		return umidadeRelativaAr;
	}

	public void setUmidadeRelativaAr(Integer umidadeRelativaAr) {
		this.umidadeRelativaAr = umidadeRelativaAr;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrevisaoTempo other = (PrevisaoTempo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}