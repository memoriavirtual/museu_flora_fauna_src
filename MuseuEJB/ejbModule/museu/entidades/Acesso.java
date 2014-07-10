package museu.entidades;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
public class Acesso implements Serializable{

	private static final long serialVersionUID = -4842990826989664666L;

	@Id
	@SequenceGenerator(name = "ACESSO_ID", sequenceName = "ACESSO_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACESSO_ID")
	private String id;
	
	private String Ip;
	private String CountryCode;
	private String CountryName;
	private String RegionCode;
	private String RegionName;
	private String City;
	private String ZipCode;
	private String Latitude;
	private String Longitude;
	private String MetroCode;
	private String AreaCode;
	private Date AcessDate;
	
	public Acesso(){
		
	}
	
	public String getIp() {
		return Ip;
	}
	public void setIp(String ip) {
		Ip = ip;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getRegionCode() {
		return RegionCode;
	}
	public void setRegionCode(String regionCode) {
		RegionCode = regionCode;
	}
	public String getRegionName() {
		return RegionName;
	}
	public void setRegionName(String regionName) {
		RegionName = regionName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getMetroCode() {
		return MetroCode;
	}
	public void setMetroCode(String metroCode) {
		MetroCode = metroCode;
	}
	public String getAreaCode() {
		return AreaCode;
	}
	public void setAreaCode(String areaCode) {
		AreaCode = areaCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Date getAcessDate() {
		return AcessDate;
	}

	public void setAcessDate(Date acessDate) {
		AcessDate = acessDate;
	}
	
}
