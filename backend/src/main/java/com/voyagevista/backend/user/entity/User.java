package com.voyagevista.backend.user.entity;

import com.voyagevista.backend.common.entity.BaseEntity;
import com.voyagevista.backend.user.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name="users")
public class User extends BaseEntity{
	
		@Column(nullable=false,length=100)
		private String fullName;
		
		@Column(nullable=false,unique=true,length=150)
		private String email;
		
		@Column(nullable=false,length=255)
		private String password;
		
		@Enumerated(EnumType.STRING)
		@Column(nullable=false)
		private Role role;
		
		@Column(length=20)
		private String phoneNumber;
		
		@Column(nullable=false)
		private boolean isActive=true;
		
		
		
}
