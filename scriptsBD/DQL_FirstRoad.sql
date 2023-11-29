-- Selecionar todos os tipos de usuário
SELECT * FROM tb_TiposUsuario;

-- Selecionar tipos de usuário com conversão UUID
SELECT BIN_TO_UUID(Id_tipoUsuario) AS Id_tipoUsuario, tituloTipoUsuario FROM tb_TiposUsuario;

-- Selecionar todas as unidades
SELECT BIN_TO_UUID(Id_unidade) AS Id_unidade, razaoSocial, cnpj, logradouro, numero, complemento, bairro, cep FROM tb_Unidades;

-- Selecionar todos os cargos
SELECT BIN_TO_UUID(Id_cargo) AS Id_cargo, nomeCargo FROM tb_Cargo;

-- Selecionar todos os conteúdos
SELECT BIN_TO_UUID(Id_conteudo) AS Id_conteudo, tituloConteudo, descricaoConteudo, link, tempoConteudo FROM tb_Conteudo;

-- Selecionar todos os usuários
SELECT BIN_TO_UUID(Id_usuario) AS Id_usuario, nomeUsuario, email, senha, nif, dataNascimento,
       BIN_TO_UUID(Id_tipoUsuario) AS Id_tipoUsuario,
       BIN_TO_UUID(Id_unidade) AS Id_unidade,
       BIN_TO_UUID(Id_cargo) AS Id_cargo
FROM tb_Usuarios;

-- Selecionar todas as unidades organizacionais
SELECT BIN_TO_UUID(Id_uo) AS Id_uo, nomeDepartamento,
       BIN_TO_UUID(Id_usuario) AS Id_usuario,
       BIN_TO_UUID(Id_unidade) AS Id_unidade
FROM tb_UnidadesOrganizacionais;

-- Selecionar todas as trilhas
SELECT BIN_TO_UUID(Id_trilha) AS Id_trilha, tituloTrilha, descricaoTrilha, tempoTrilha, situacao,
       BIN_TO_UUID(Id_cargo) AS Id_cargo,
       BIN_TO_UUID(Id_uo) AS Id_uo,
       BIN_TO_UUID(Id_conteudo) AS Id_conteudo
FROM tb_Trilha;
