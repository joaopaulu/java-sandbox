CREATE TABLE live (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	live_name VARCHAR(255) NOT NULL,
	channel_name VARCHAR(255),
	live_date DATE,
	live_link VARCHAR(255),
	registration_date DATE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('Deno com Leonardo Leitão // Live #43', 'Rodrigo Branas', '2020-05-24', 'https://www.youtube.com/watch?v=8VtWS9O-sRo', '2020-05-20');

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('Microservices with JHipster', 'SouJava', '2020-05-23', 'https://youtu.be/eCYknbY1jd4', '2020-05-21');

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('Do Java ao Jakarta EE 9, a história', 'SouJava', '2020-05-24', 'https://youtu.be/T5DYpK8qoVI', '2020-05-22');

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('O Futuro da Rocketseat', 'Rocketseat', '2020-11-23', 'https://youtu.be/cGTJQwHmGWc', '2020-11-24');

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('Universo Go | Rocketseat', 'Rocketseat', '2021-05-23', 'https://youtu.be/7vSwoy63cy0', '2021-05-27');

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('Universo Java | Rocketseat', 'Rocketseat', '2021-03-20', 'https://youtu.be/BVWdPuNjuiY', '2021-04-21');

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('Guia DEFINITIVO de Aprendendo a Aprender', 'Fabio Akita', '2021-02-15', 'https://youtu.be/oUPaJxk6TZ0', '2021-06-23');