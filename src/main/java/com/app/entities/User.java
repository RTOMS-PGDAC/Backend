package com.app.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.app.enums.Role;

import lombok.*;

@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User extends BaseEntity {
	
	
	@Column(unique=true,name="email")
	private String email;
	
	
	@Column(length = 20,name="first_name")
	private String firstName;
	
	
	@Column(length = 20, name="last_name" )
	private String lastName;
	
	
	@Column(name="password")
	private String password;
	
    
    @Column(name="role")
    @Enumerated(EnumType.STRING) 
    private Role role;
    
    @Column(name="profile_pic")
    @Lob
    private byte[] profilePic;

}
