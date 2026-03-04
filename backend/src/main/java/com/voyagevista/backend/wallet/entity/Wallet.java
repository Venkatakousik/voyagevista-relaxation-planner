package com.voyagevista.backend.wallet.entity;

import java.math.BigDecimal;

import com.voyagevista.backend.common.entity.BaseEntity;
import com.voyagevista.backend.user.entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name="wallets")
public class Wallet extends BaseEntity{
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id",nullable=false,unique=true)
	private User user;
	
	@Column(nullable=false, precision=12,scale=2)
	private BigDecimal balance =BigDecimal.ZERO;
	
}
