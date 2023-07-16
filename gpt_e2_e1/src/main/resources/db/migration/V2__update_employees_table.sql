ALTER TABLE employees
    ADD COLUMN internal_id CHAR(36) NOT NULL,
ADD UNIQUE (internal_id);