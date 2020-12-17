CREATE TABLE convidado (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(255) NOT NULL,
	quantidade_acompanhantes int
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into convidado (id, nome, quantidade_acompanhantes) values (1, 'Pedro', 2);
insert into convidado (id, nome, quantidade_acompanhantes) values (2, 'Maria', 3);
insert into convidado (id, nome, quantidade_acompanhantes) values (3, 'Ricardo', 1);