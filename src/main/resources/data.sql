INSERT INTO USUARIO(NOME, LOGIN, EMAIL, SENHA, IDADE)
VALUES('Fulano', 'fulaninho','fulano@email.com', '123', 38);

INSERT INTO BIRD(NOME_CIENTIFICO)
VALUES('Pitangus sulphuratus');

INSERT INTO BIRD_WATCH(ID_BIRD, ID_USUARIO, NOME, REGIAO, COMPORTAMENTO, ESTACAO)
VALUES(1,1,'Bem-Te-Vi','Todo Brasil','Canta muito','Outono');

INSERT INTO IMAGE(IMAGEM_PATH)
VALUES('c://bemtevi.png');

INSERT INTO BIRD_WATCH_IMAGE(ID_IMAGE, ID_BIRD_WATCH, LATITUDE, LONGITUDE, DATA_CRIACAO)
VALUES(1,1,1158.25,5884.54,'2023-03-29');