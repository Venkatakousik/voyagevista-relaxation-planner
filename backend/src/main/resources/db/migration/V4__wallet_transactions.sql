CREATE TABLE wallet_transactions (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,

    wallet_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,

    amount DECIMAL(12,2) NOT NULL,

    transaction_type VARCHAR(50) NOT NULL,
    status VARCHAR(20) NOT NULL DEFAULT 'PENDING',

    reference_type VARCHAR(32),
    reference_id BIGINT,

    description VARCHAR(255),

    requested_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    processed_at TIMESTAMP NULL,

    processed_by BIGINT NULL,

    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,

    CONSTRAINT fk_tx_wallet
        FOREIGN KEY (wallet_id) REFERENCES wallets(id),

    CONSTRAINT fk_tx_user
        FOREIGN KEY (user_id) REFERENCES users(id),

    CONSTRAINT fk_tx_processed_by
        FOREIGN KEY (processed_by) REFERENCES users(id)
);