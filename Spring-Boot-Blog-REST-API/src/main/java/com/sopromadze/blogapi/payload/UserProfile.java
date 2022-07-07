package com.sopromadze.blogapi.payload;

import com.sopromadze.blogapi.model.user.Address;
import com.sopromadze.blogapi.model.user.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {
	private Long id;
	private String username;
	private String firstName;
	private String lastName;
	private Instant joinedAt;
	private String email;
	private Address address;
	private String phone;
	private String website;
	private Company company;
	private Long postCount;

	public UserProfile(Long id, String username, String firstName, String lastName, Instant joinedAt, String email,
			Address address, String phone, String website, Company company, Long postCount) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.joinedAt = joinedAt;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.company = company;
		this.postCount = postCount;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Instant getJoinedAt() {
		return joinedAt;
	}

	public String getEmail() {
		return email;
	}

	public Address getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getWebsite() {
		return website;
	}

	public Company getCompany() {
		return company;
	}

	public Long getPostCount() {
		return postCount;
	}

}
