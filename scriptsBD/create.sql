CREATE SCHEMA `firstroadv2` DEFAULT CHARACTER SET utf8mb4 ;

use firstroadv2;
CREATE TABLE tb_tipos_usuario(
	id BINARY(16) NOT NULL,
	titulo_tipo_usuario VARCHAR(50) NOT NULL ,

    PRIMARY KEY(id)
);

CREATE TABLE tb_unidades(
	id BINARY(16) NOT NULL,
	razao_social VARCHAR(50) NOT NULL,
    cnpj VARCHAR(14) NOT NULL UNIQUE,
    logradouro VARCHAR(200) NOT NULL,
    numero INT NOT NULL,
    complemento VARCHAR(100),
    bairro VARCHAR (200) NOT NULL,
    cep VARCHAR(9) NOT NULL,
    
    PRIMARY KEY(id)
);

CREATE TABLE tb_cargo(
	id BINARY(16) NOT NULL,
	nome_cargo VARCHAR(50) NOT NULL,
    
    PRIMARY KEY(id)
);

CREATE TABLE tb_conteudo(
	id BINARY(16) NOT NULL,
	titulo_conteudo VARCHAR(50) NOT NULL,
    descricao_conteudo VARCHAR(255) NOT NULL,
    link VARCHAR(255) NOT NULL,
    tempo_conteudo time NOT NULL,
    
    PRIMARY KEY(id)
);

CREATE TABLE tb_usuarios(
	id BINARY(16) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR (100) NOT NULL UNIQUE,
    senha VARCHAR (60) NOT NULL,
    nif INT NOT NULL UNIQUE,
    data_nascimento DATE NOT NULL,
    
    id_tipo_usuario BINARY(16)NOT NULL,
	id_unidade BINARY(16)NOT NULL,
	id_cargo BINARY(16) NOT NULL,
	url_imagem VARCHAR (255),
    
	PRIMARY KEY(id),
    FOREIGN KEY(id_tipo_usuario) REFERENCES tb_tipos_usuario(id),
    FOREIGN KEY(id_unidade) REFERENCES tb_unidades(id),
    FOREIGN KEY(id_cargo) REFERENCES tb_cargo(id)
);

CREATE TABLE tb_unidades_organizacionais(
	id BINARY(16) NOT NULL,
    nome_departamento VARCHAR (200) NOT NULL,
    
    id_usuario BINARY(16) NOT NULL,
	id_unidade BINARY(16) NOT NULL,
    
	PRIMARY KEY(id),
    FOREIGN KEY(id_usuario) REFERENCES tb_usuarios(id),
    FOREIGN KEY(id_unidade) REFERENCES tb_unidades(id)
);

CREATE TABLE tb_trilha(
	id BINARY(16) NOT NULL,
    titulo_trilha VARCHAR (100) NOT NULL,
    descricao_trilha VARCHAR (255) NOT NULL,
    tempo_trilha TIME NOT NULL,
    situacao VARCHAR (150) NOT NULL,
    
    id_cargo BINARY(16) NOT NULL,
	id_uo BINARY(16) NOT NULL,
    id_conteudo BINARY(16) NOT NULL,
    
	PRIMARY KEY(id),
    FOREIGN KEY(id_cargo) REFERENCES tb_cargo(id),
    FOREIGN KEY(id_uo) REFERENCES tb_unidades_organizacionais(id),
    FOREIGN KEY(Id_conteudo) REFERENCES tb_Conteudo(id)
);