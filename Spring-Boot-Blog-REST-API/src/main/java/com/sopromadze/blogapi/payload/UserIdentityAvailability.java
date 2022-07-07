package com.sopromadze.blogapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserIdentityAvailability {
	private Boolean available;

	public UserIdentityAvailability(Boolean available) {
		super();
		this.available = available;
	}

}
