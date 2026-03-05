package com.voyagevista.backend.wallet.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.voyagevista.backend.common.entity.BaseEntity;
import com.voyagevista.backend.user.entity.User;
import com.voyagevista.backend.wallet.enums.TransactionStatus;
import com.voyagevista.backend.wallet.enums.TransactionType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="wallet_transactions")
public class WalletTransaction extends BaseEntity{
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="wallet_id", nullable=false)
	private Wallet wallet;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id", nullable=false)
	private User user;
	
	@Column(nullable=false,precision=12,scale=2)
	private BigDecimal amount;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private TransactionType transactionType;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private TransactionStatus  status;
	
	private String referenceType;
	
	private Long referenceId;
	
	private String description;
	
	private LocalDateTime requestedAt;
	
	private LocalDateTime processedAt;
	
	
	@ManyToOne(fetch=FetchType.LAZY)

	@JoinColumn(name="processed_by")
	private User processedBy;
	
}
