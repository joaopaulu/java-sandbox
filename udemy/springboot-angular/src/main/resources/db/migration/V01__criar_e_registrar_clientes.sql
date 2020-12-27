CREATE TABLE cliente(
    id INT PRIMARY KEY AUTO_INCREMENT,
    cpf varchar(11) NOT NULL,
    data_cadastro date,
    nome varchar(150) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;