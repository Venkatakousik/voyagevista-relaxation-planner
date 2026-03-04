package com.voyagevista.backend.wallet.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voyagevista.backend.wallet.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet,Long>{

	Optional<Wallet> findByUserId(Long userId);
}
