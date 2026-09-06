-- CATEGORIAS

INSERT INTO categoria (nome, descricao) VALUES ('Tecnologia', 'Tem Tecnologia');
INSERT INTO categoria (nome, descricao) VALUES ('Cultura', 'Tem Cultura');
INSERT INTO categoria (nome, descricao) VALUES ('Arte', 'Tem Arte');
INSERT INTO categoria (nome, descricao) VALUES ('Livros', 'Tem Livros');
INSERT INTO categoria (nome, descricao) VALUES ('História', 'Tem História');


-- LOCAIS

INSERT INTO `local` (nome, endereco, capacidade) VALUES ('Auditório Central', 'Rua das Flores, 100', 500);
INSERT INTO `local` (nome, endereco, capacidade) VALUES ('Centro de Convenções', 'Avenida Brasil, 250', 1000);
INSERT INTO `local` (nome, endereco, capacidade) VALUES ('Sala Inovação', 'Rua da Tecnologia, 50', 100);
INSERT INTO `local` (nome, endereco, capacidade) VALUES ('Teatro Municipal', 'Avenida Principal, 800', 750);
INSERT INTO `local` (nome, endereco, capacidade) VALUES ('Espaço Cultural', 'Rua da Cultura, 200', 300);


-- PALESTRANTES

INSERT INTO palestrante (nome, mini_bio, email) VALUES ('Carlos Almeida', 'Especialista em tecnologia e desenvolvimento de software', 'carlos@email.com');
INSERT INTO palestrante (nome, mini_bio, email) VALUES ('Mariana Souza', 'Professora e pesquisadora na área de educação', 'mariana@email.com');
INSERT INTO palestrante (nome, mini_bio, email) VALUES ('Rafael Oliveira', 'Consultor especializado em negócios e empreendedorismo', 'rafael@email.com');
INSERT INTO palestrante (nome, mini_bio, email) VALUES ('Fernanda Lima', 'Pesquisadora na área de ciência e inovação', 'fernanda@email.com');
INSERT INTO palestrante (nome, mini_bio, email) VALUES ('Lucas Martins', 'Artista e pesquisador de cultura contemporânea', 'lucas@email.com');


-- PARTICIPANTES

INSERT INTO participante (nome, telefone, email) VALUES ('João Silva', '999991111', 'joao@email.com');
INSERT INTO participante (nome, telefone, email) VALUES ('Ana Costa', '999992222', 'ana@email.com');
INSERT INTO participante (nome, telefone, email) VALUES ('Pedro Santos', '999993333', 'pedro@email.com');
INSERT INTO participante (nome, telefone, email) VALUES ('Juliana Souza', '999994444', 'juliana@email.com');
INSERT INTO participante (nome, telefone, email) VALUES ('Marcos Oliveira', '999995555', 'marcos@email.com');


-- EVENTOS

INSERT INTO evento (nome, descricao, data_inicio, data_fim, capacidade, status, categoria_id, local_id, palestrante_id) VALUES ('Tech Summit 2026', 'Conferência sobre tecnologia e inovação', '2026-10-10', '2026-10-11', 500, 'ABERTO', 1, 1, 1);
INSERT INTO evento (nome, descricao, data_inicio, data_fim, capacidade, status, categoria_id, local_id, palestrante_id) VALUES ('Fórum de Educação', 'Debates sobre novas práticas educacionais', '2026-10-20', '2026-10-20', 300, 'ABERTO', 2, 2, 2);
INSERT INTO evento (nome, descricao, data_inicio, data_fim, capacidade, status, categoria_id, local_id, palestrante_id) VALUES ('Encontro de Empreendedores', 'Evento para discussão sobre negócios e empreendedorismo', '2026-11-05', '2026-11-05', 200, 'ABERTO', 3, 3, 3);
INSERT INTO evento (nome, descricao, data_inicio, data_fim, capacidade, status, categoria_id, local_id, palestrante_id) VALUES ('Semana da Ciência', 'Palestras e apresentações sobre ciência e pesquisa', '2026-11-15', '2026-11-17', 400, 'ABERTO', 4, 4, 4);
INSERT INTO evento (nome, descricao, data_inicio, data_fim, capacidade, status, categoria_id, local_id, palestrante_id) VALUES ('Festival Cultural', 'Festival dedicado à cultura e às artes', '2026-12-01', '2026-12-03', 600, 'ABERTO', 5, 5, 5);


-- INSCRIÇÕES

INSERT INTO inscricao (data_inscricao, status, evento_id, participante_id) VALUES ('2026-09-01', 'CONFIRMADA', 1, 1);
INSERT INTO inscricao (data_inscricao, status, evento_id, participante_id) VALUES ('2026-09-02', 'CONFIRMADA', 2, 2);
INSERT INTO inscricao (data_inscricao, status, evento_id, participante_id) VALUES ('2026-09-03', 'PENDENTE', 3, 3);
INSERT INTO inscricao (data_inscricao, status, evento_id, participante_id) VALUES ('2026-09-04', 'CONFIRMADA', 4, 4);
INSERT INTO inscricao (data_inscricao, status, evento_id, participante_id) VALUES ('2026-09-05', 'PENDENTE', 5, 5);