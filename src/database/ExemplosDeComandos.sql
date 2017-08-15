#Seleciona todas as colunas da tabela
SELECT * FROM carros;


#Seleciona a coluna nome, fabricante, cor, e quantidade colocando um apelido para
#apresentar ao usuario de uma forma melhor
SELECT id, nome AS 'Modelo:', fabricante AS 'Fabricante:', cor AS 'Cor:',
potencia, data_compra AS 'Data de Compra:' FROM carros;


#Exemplo de INSERT na tabela de carros informando as colunas desejadas
INSERT INTO carros 
(id, nome, cor, fabricante, placa, chassis, quilometragem, potencia, data_compra, esta_funcionando,
permitida_circulacao, quantidade_portas, quantidade_batidas, ano_fabricacao, ano_lancamento, tipo_pneu,
renavam, descricao)
VALUE
(1, "Gol", "Branco", "Wolksvagem", "ABC-2000", "2Ab578ROepaso82371", 291134741, 85, '2017-08-07', 
TRUE, FALSE, 4, 0, 2017, 2016, 175, 847516874, "");


#Inserir na tabela carros um registro com somente alguns campos
INSERT INTO carros 
(nome, cor, fabricante, potencia, data_compra)
VALUES
("Palio", "Preto", "Fiat", 65, '2013-04-29'),
("Fox", "Prata", "VW", 70, '2014-08-15'),
("Celta", "Vermelho", "Chevrolet", 68, '2017-06-11'),
("Captiva", "Prata", "Chevrolet", 90, '2016-05-17');


#Limpar a tabela por completo
TRUNCATE carros;

INSERT INTO carros (fabricante, cor, nome)
VALUES

("VW", "Cinza", "Golf"),
("VW", "Vermelho", "Jetta"),
("VW", "Amarelo", "Saveiro"),
("VW", "Preto", "New Beetle"),
("VW", "Azul Bebe", "Fusca"),
("VW", "Branco", "Novo Fusca"),
("VW", "Cinza", "UP"),
("VW", "Azul Calcinha", "Kombi"),
("VW", "Cobalto", "Bora"),
("VW", "Vermelho", "Passat");


UPDATE carros SET
cor = "Branco"
WHERE cor = "Vermelho";

UPDATE carros SET
ano_fabricacao = 2017, ano_lancamento = 2016
WHERE cor = "Branco";

SELECT nome, cor FROM carros;



SELECT id, nome, quantidade_batidas FROM carros
WHERE id > 4;

SELECT id, nome, quantidade_batidas FROM carros
WHERE id >= 4;

SELECT id, nome, quantidade_batidas FROM carros
WHERE id < 4;

SELECT id, nome, quantidade_batidas FROM carros
WHERE id <= 4;

SELECT id, nome, quantidade_batidas FROM carros
WHERE id <> 4;


SELECT * FROM carros ORDER BY nome;
SELECT * FROM carros ORDER BY fabricante ASC, nome ASC, cor ASC;


SELECT cor, COUNT(cor) FROM carros
GROUP BY cor;


SELECT cor, COUNT(cor) FROM carros
GROUP BY cor
ORDER BY COUNT(cor) DESC


#Retorna a quantidade de registros
SELECT COUNT(*) FROM carros;
