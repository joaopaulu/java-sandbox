CREATE TABLE live (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	live_name VARCHAR(255) NOT NULL,
	channel_name VARCHAR(255),
	live_date DATETIME,
	live_link VARCHAR(255),
	registration_date DATE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('Deno com Leonardo Leitão // Live #43', 'Rodrigo Branas', '2020-05-24T20:00:00', 'https://www.youtube.com/embed/8VtWS9O-sRo', '2020-05-20');

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('Microservices with JHipster', 'SouJava', '2020-05-23T20:00:00', 'https://www.youtube.com/embed/eCYknbY1jd4', '2020-05-21');

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('Do Java ao Jakarta EE 9, a história', 'SouJava', '2020-05-24T20:00:00', 'https://www.youtube.com/embed/T5DYpK8qoVI', '2020-05-22');

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('O Futuro da Rocketseat', 'Rocketseat', '2020-11-23T20:00:00', 'https://www.youtube.com/embed/cGTJQwHmGWc', '2020-11-24');

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('Universo Go | Rocketseat', 'Rocketseat', '2021-05-23T20:00:00', 'https://www.youtube.com/embed/7vSwoy63cy0', '2021-05-27');

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('Universo Java | Rocketseat', 'Rocketseat', '2021-03-20T20:00:00', 'https://www.youtube.com/embed/BVWdPuNjuiY', '2021-04-21');

INSERT INTO live (live_name, channel_name, live_date, live_link, registration_date) values ('Guia DEFINITIVO de Aprendendo a Aprender', 'Fabio AkitaT20:00:00', '2021-02-15', 'https://www.youtube.com//embed/oUPaJxk6TZ0', '2021-06-23');