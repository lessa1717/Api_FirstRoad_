/* TIPOS USUARIOS */
INSERT INTO tb_tipos_usuario VALUES(UUID_TO_BIN('b31c2c82-85c3-458d-9bae-7822b783cc22'),'Colaborador 1 - editado');
INSERT INTO tb_tipos_usuario VALUES(UUID_TO_BIN('b65fbafc-e07a-4944-a402-406e5b8dec38'),'Colaborador');
INSERT INTO tb_tipos_usuario VALUES(UUID_TO_BIN('d59d822f-945b-11ee-bcc9-54bf6410fda2'),'AdmMaster');
INSERT INTO tb_tipos_usuario VALUES(UUID_TO_BIN('d59e9db4-945b-11ee-bcc9-54bf6410fda2'),'Gestor');
INSERT INTO tb_tipos_usuario VALUES(UUID_TO_BIN('d996f43c-c6e6-4882-bdc3-227f680c15ff'),'Colaborador');

/* UNIDADES */
INSERT INTO tb_unidades VALUES(	UUID_TO_BIN('0046c381-941c-11ee-bcc9-54bf6410fda9'),    'VolksWagem Brasil',  '12345678912345',    'Rua Niteroi',    12,    'Planta São Caetano',    'Centro',    '98765-123'    );
INSERT INTO tb_unidades VALUES(	UUID_TO_BIN('0046c382-942c-11ee-bcc9-54bf6410fda8'),    'FORD BRASIL',    	'23456789123456',    'Rua da Ford',    234,    'Planta São Bernardo do Campo',    'Centro',    '87654-321'    );
INSERT INTO tb_unidades VALUES(	UUID_TO_BIN('0046c383-943c-11ee-bcc9-54bf6410fda7'),    'SCANIA DO BRASIL',   '34567891234567',    'Rua da Scania',    435,    'Planta Diadema',    'Centro',    '76543-210'    );
INSERT INTO tb_unidades VALUES(	UUID_TO_BIN('0046c384-944c-11ee-bcc9-54bf6410fda6'),    'AUDI Brasil',    	'45678912345678',    'Rua das Audis',    654,    'Planta São Paulo',    'Centro',    '12345-789'    );
INSERT INTO tb_unidades VALUES(	UUID_TO_BIN('0046c385-945c-11ee-bcc9-54bf6410fda5'),    'FERRARI OF BRAZIL',  '56789123456789',    'Rua dos Boys',    1238,    'Planta Anhembi',    'Centro',    '23456-789'    );
    
/* CARGOS */
INSERT INTO tb_cargo VALUES(UUID_TO_BIN('05c4ed5f-80b6-4208-bb15-0903f11d171c'),'Analista de Sistemas');
INSERT INTO tb_cargo VALUES(UUID_TO_BIN('0851ec79-30d8-4351-b380-f48c277722df'),'TESTES');
INSERT INTO tb_cargo VALUES(UUID_TO_BIN('0f3ff8ee-945c-11ee-bcc9-54bf6410fda2'),'Diretor');
INSERT INTO tb_cargo VALUES(UUID_TO_BIN('0f40c36b-945c-11ee-bcc9-54bf6410fda2'),'Gerente');
INSERT INTO tb_cargo VALUES(UUID_TO_BIN('0f422778-945c-11ee-bcc9-54bf6410fda2'),'Desenvolvedor');
INSERT INTO tb_cargo VALUES(UUID_TO_BIN('7bc21fd6-f955-4380-8882-2194be06e525'),'Recepcionista');
INSERT INTO tb_cargo VALUES(UUID_TO_BIN('8d1cd726-01cc-4834-9c36-b564b79fefb8'),'Telefonista');
INSERT INTO tb_cargo VALUES(UUID_TO_BIN('9c40bc8a-7152-4c38-9072-6a4962747242'),'Analista de Sistemas');
   
/* CONTEUDOS */
INSERT INTO tb_conteudo VALUES(UUID_TO_BIN('152f6d1c-2eda-4e5c-8c55-04c9a8d68692'),'Novo Titulo editado',	'001 edit - Aprendendo SpringBoot do zero ao avançado!!',			'https://www.udemy.com.br/editado',		'00:22:00' );
INSERT INTO tb_conteudo VALUES(UUID_TO_BIN('1801cb5e-945c-11ee-bcc9-54bf6410fda2'),'SpringBoot Volume1', 	'Aprendendo SpringBoot do zero ao avançado!! Volume 1',				'https://www.udemy.com.br/sbv1',		'00:17:00' );
INSERT INTO tb_conteudo VALUES(UUID_TO_BIN('2f53ed0a-94fe-11ee-9d16-54bf6410fda2'),'SpringBoot Volume 2', 	'Aprendendo SpringBoot do zero ao avançado!! Volume 2',				'https://www.udemy.com.br/sbv2',		'40:30:00' );
INSERT INTO tb_conteudo VALUES(UUID_TO_BIN('301d04fd-94fe-11ee-9d16-54bf6410fda2'),'SpringBoot Volume 3', 	'Aprendendo SpringBoot do zero ao avançado!! Volume 3',				'https://www.udemy.com.br/sbv3',		'80:00:00' );
    
/* USUARIOS */
INSERT INTO tb_usuarios VALUES(UUID_TO_BIN('425689b9-8db7-4782-8d6c-a940f739fd0b'),    'Thiago',    'thiago@vw.com',    'admin',    789434,    '1995-05-19', 		UUID_TO_BIN('b65fbafc-e07a-4944-a402-406e5b8dec38'),	UUID_TO_BIN('0046c381-941c-11ee-bcc9-54bf6410fda9'),	UUID_TO_BIN('0851ec79-30d8-4351-b380-f48c277722df'),'06122023182145.png');
INSERT INTO tb_usuarios VALUES(UUID_TO_BIN('5842a01e-f371-4011-8936-64970b9966c3'),    'Lucas Lessa',    'lessa@vw.com',    'senai',    789457,    '1994-05-19',	UUID_TO_BIN('b31c2c82-85c3-458d-9bae-7822b783cc22'),	UUID_TO_BIN('0046c381-941c-11ee-bcc9-54bf6410fda9'),	UUID_TO_BIN('05c4ed5f-80b6-4208-bb15-0903f11d171c'),'06122023182145.png');
INSERT INTO tb_usuarios VALUES(	UUID_TO_BIN('225689b9-8db7-4782-8d6c-a940f739fd0b'),    'Thiago',    'thsiago@vw.com',    'admin',    7894324,    '1995-05-19',    	UUID_TO_BIN('b65fbafc-e07a-4944-a402-406e5b8dec38'),    UUID_TO_BIN('0046c381-941c-11ee-bcc9-54bf6410fda9'),    UUID_TO_BIN('0851ec79-30d8-4351-b380-f48c277722df'),    '06122023182145.png');
INSERT INTO tb_usuarios VALUES(	UUID_TO_BIN('791b4841-9bd0-4880-a5e0-7c830985da5b'),    'Valdemar de Barros',    'valdemar@vw.com',    'senhaSegura@123',    12345,    '1950-05-28',    UUID_TO_BIN('d59d822f-945b-11ee-bcc9-54bf6410fda2'),    UUID_TO_BIN('0046c381-941c-11ee-bcc9-54bf6410fda9'),    UUID_TO_BIN('0f3ff8ee-945c-11ee-bcc9-54bf6410fda2'),    '06122023182145.png');
INSERT INTO tb_usuarios VALUES(	UUID_TO_BIN('da4da815-945c-11ee-bcc9-54bf6410fda2'),    'Ana Lucia',    'ana@vw.com',    'asd123',    654123,    '1980-03-29',    	UUID_TO_BIN('d59e9db4-945b-11ee-bcc9-54bf6410fda2'),    UUID_TO_BIN('0046c381-941c-11ee-bcc9-54bf6410fda9'),    UUID_TO_BIN('9c40bc8a-7152-4c38-9072-6a4962747242'),    '06122023182145.png');
INSERT INTO tb_usuarios VALUES(	UUID_TO_BIN('da5da805-945c-11ee-bcc9-54bf6560fda3'),    'Mario Andrade',    'mario.andrade@vw.com',    'qwert@9876',    852413,    '1975-06-13',    UUID_TO_BIN('d996f43c-c6e6-4882-bdc3-227f680c15ff'),    UUID_TO_BIN('0046c381-941c-11ee-bcc9-54bf6410fda9'),    UUID_TO_BIN('7bc21fd6-f955-4380-8882-2194be06e525'),    '06122023182145.png');

/* UNIDADES ORGANIZACIONAIS */
INSERT INTO tb_unidades_organizacionais VALUES(UUID_TO_BIN('1642a622-57e3-4f8e-b46b-480cd6916775'),	'Atendimento',	UUID_TO_BIN('425689b9-8db7-4782-8d6c-a940f739fd0b'),	UUID_TO_BIN('0046c381-941c-11ee-bcc9-54bf6410fda9'));
INSERT INTO tb_unidades_organizacionais VALUES(UUID_TO_BIN('2149319a-87c9-45f5-b978-002ea34c3472'),	'Suporte',		UUID_TO_BIN('425689b9-8db7-4782-8d6c-a940f739fd0b'),	UUID_TO_BIN('0046c381-941c-11ee-bcc9-54bf6410fda9'));
INSERT INTO tb_unidades_organizacionais VALUES(UUID_TO_BIN('31336dfb-8f3b-4052-b8ed-cfe83528055b'),	'TI2',			UUID_TO_BIN('425689b9-8db7-4782-8d6c-a940f739fd0b'),	UUID_TO_BIN('0046c381-941c-11ee-bcc9-54bf6410fda9'));
INSERT INTO tb_unidades_organizacionais VALUES(UUID_TO_BIN('4844f32d-defb-4240-8997-3e02a157e230'),	'Comercial',	UUID_TO_BIN('425689b9-8db7-4782-8d6c-a940f739fd0b'),	UUID_TO_BIN('0046c381-941c-11ee-bcc9-54bf6410fda9'));
INSERT INTO tb_unidades_organizacionais VALUES(UUID_TO_BIN('515588ed-9466-11ee-bcc9-54bf6410fda2'),	'TI',			UUID_TO_BIN('425689b9-8db7-4782-8d6c-a940f739fd0b'),	UUID_TO_BIN('0046c381-941c-11ee-bcc9-54bf6410fda9'));

/* TRILHA */
INSERT INTO tb_trilha VALUES(UUID_TO_BIN('ccd51224-f408-4a89-9b7f-dca5bac08ceb')	,'Trilha Dev iniciante 5',		'Esta trilha contem passos iniciais para um dev iniciante',	'01:30:00', '',		UUID_TO_BIN('0f422778-945c-11ee-bcc9-54bf6410fda2'),	UUID_TO_BIN('1642a622-57e3-4f8e-b46b-480cd6916775'),	UUID_TO_BIN('1801cb5e-945c-11ee-bcc9-54bf6410fda2'));
INSERT INTO tb_trilha VALUES(UUID_TO_BIN('d4ef441c-03ff-492f-9445-f11a05e96823')	,'Nova Trilha Dev Avançado',	'Esta trilha contem passos iniciais para um avançado     ',	'08:30:00',	'',	UUID_TO_BIN('0f422778-945c-11ee-bcc9-54bf6410fda2'),	UUID_TO_BIN('1642a622-57e3-4f8e-b46b-480cd6916775'),	UUID_TO_BIN('1801cb5e-945c-11ee-bcc9-54bf6410fda2'));


