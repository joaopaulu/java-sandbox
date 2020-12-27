CREATE TABLE servico(
    id INT PRIMARY KEY AUTO_INCREMENT,
    descricao varchar(150) NOT NULL,
    valor decimal(19,2),
    id_cliente int,
    FOREIGN KEY (id_cliente) references cliente(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;