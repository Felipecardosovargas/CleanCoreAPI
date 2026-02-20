CREATE TABLE companies (
                           id UUID PRIMARY KEY DEFAULT gen_random_uuid(),

                           legal_name VARCHAR(255) NOT NULL,
                           trade_name VARCHAR(255),
                           tax_id VARCHAR(50) NOT NULL UNIQUE,
                           email VARCHAR(255),
                           phone VARCHAR(50),
                           status VARCHAR(50) NOT NULL,

                           created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                           updated_at TIMESTAMP
);