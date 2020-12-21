CREATE TABLE produtos(
    id SERIAL PRIMARY KEY,
    nome varchar(100) NOT NULL,
    quantidade int,
    valor NUMERIC(10,2)
);