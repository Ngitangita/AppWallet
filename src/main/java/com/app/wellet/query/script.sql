

CREATE TABLE IF NOT EXISTS "account" (
     id SERIAL PRIMARY KEY,
     sold FLOAT,
     account_type VARCHAR(150),
    open_date TIMESTAMP,
    account_number INT
    );

CREATE TABLE IF NOT EXISTS "devise" (
    id SERIAL PRIMARY KEY,
    rate_change FLOAT,
    devise_symbol VARCHAR(255),
    account_id INT,
    FOREIGN KEY (account_id) REFERENCES "account"(id) ON DELETE CASCADE
    );

CREATE TABLE IF NOT EXISTS "transaction" (
     id SERIAL PRIMARY KEY,
     amount FLOAT,
     type VARCHAR(255),
    transaction_date TIMESTAMP,
    account_id INT,
    FOREIGN KEY (account_id) REFERENCES "account"(id) ON DELETE CASCADE
    );