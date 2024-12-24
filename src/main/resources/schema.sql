CREATE TABLE survey_response (
    id BIGSERIAL PRIMARY KEY,
    user_id TEXT NOT NULL,
    questions JSONB NOT NULL,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);