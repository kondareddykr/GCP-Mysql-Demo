package com.sopromadze.blogapi.payload;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class InfoRequest {

	@NotBlank
	private String street;

	@NotBlank
	private String suite;

	@NotBlank
	private String city;

	@NotBlank
	private String zipcode;

	private String companyName;

	private String catchPhrase;

	private String bs;

	private String website;

	private String phone;

	private String lat;

	private String lng;

	public String getStreet() {
		return street;
	}

	public String getSuite() {
		return suite;
	}

	public String getCity() {
		return city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public String getBs() {
		return bs;
	}

	public String getWebsite() {
		return website;
	}

	public String getPhone() {
		return phone;
	}

	public String getLat() {
		return lat;
	}

	public String getLng() {
		return lng;
	}

}
