package com.voyagevista.backend.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voyagevista.backend.wallet.entity.WalletTransaction;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction, Long> {
		
}
