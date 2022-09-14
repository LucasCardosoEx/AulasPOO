CREATE TABLE cliente (codigo serial PRIMARY KEY, nome varchar(50);
telefone varchar(11),email varchar(40) unique);

INSERT INTO cliente (nome,telefone,email)
VALUES (Pablin da Silveira,21974147612,pablo@gmail.com),
	   (Almeida de Almeida,21921431245,almeida@gmail.com),
	   (Pedro da Lí,21123125412,pedro@gmail.com);