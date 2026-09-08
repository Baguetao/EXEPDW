-- TRABALHO 1 =========================================================================================================

-- CLIENTES
INSERT INTO cliente1 (nome, email, telefone) VALUES ('João Silva', 'joao@email.com', '999991111');
INSERT INTO cliente1 (nome, email, telefone) VALUES ('Ana Costa', 'ana@email.com', '999992222');
INSERT INTO cliente1 (nome, email, telefone) VALUES ('Pedro Santos', 'pedro@email.com', '999993333');
INSERT INTO cliente1 (nome, email, telefone) VALUES ('Juliana Souza', 'juliana@email.com', '999994444');
INSERT INTO cliente1 (nome, email, telefone) VALUES ('Marcos Oliveira', 'marcos@email.com', '999995555');

-- PEDIDOS
INSERT INTO pedido1 (data, status, valor_total, cliente1_id) VALUES ('2026-09-01 10:00:00', 'CONFIRMADO', 3580.00, 1);
INSERT INTO pedido1 (data, status, valor_total, cliente1_id) VALUES ('2026-09-02 11:30:00', 'PENDENTE', 250.00, 2);
INSERT INTO pedido1 (data, status, valor_total, cliente1_id) VALUES ('2026-09-03 14:00:00', 'CONFIRMADO', 120.00, 3);
INSERT INTO pedido1 (data, status, valor_total, cliente1_id) VALUES ('2026-09-04 15:45:00', 'ENVIADO', 180.00, 4);
INSERT INTO pedido1 (data, status, valor_total, cliente1_id) VALUES ('2026-09-05 16:20:00', 'CONFIRMADO', 330.00, 5);

-- ITENS PEDIDO
INSERT INTO itempedido1 (quantidade, valor_unitario, pedido1_id) VALUES (1, 3500.00, 1);
INSERT INTO itempedido1 (quantidade, valor_unitario, pedido1_id) VALUES (1, 80.00, 1);
INSERT INTO itempedido1 (quantidade, valor_unitario, pedido1_id) VALUES (1, 250.00, 2);
INSERT INTO itempedido1 (quantidade, valor_unitario, pedido1_id) VALUES (1, 120.00, 3);
INSERT INTO itempedido1 (quantidade, valor_unitario, pedido1_id) VALUES (1, 180.00, 4);

-- PAGAMENTOS
INSERT INTO pagamento1(valor, data, status, tipo, pedido1_id)VALUES (3580.00, '2026-09-01 10:05:00', 'APROVADO', 'PIX', 1);
INSERT INTO pagamento1(valor, data, status, tipo, pedido1_id)VALUES (250.00, '2026-09-02 11:35:00', 'PENDENTE', 'CARTAO', 2);
INSERT INTO pagamento1(valor, data, status, tipo, pedido1_id)VALUES (120.00, '2026-09-03 14:05:00', 'APROVADO', 'PIX', 3);
INSERT INTO pagamento1(valor, data, status, tipo, pedido1_id)VALUES (180.00, '2026-09-04 15:50:00', 'APROVADO', 'CARTAO', 4);
INSERT INTO pagamento1(valor, data, status, tipo, pedido1_id)VALUES (330.00, '2026-09-05 16:25:00', 'APROVADO', 'PIX', 5);

--TRABALHO 2 ===========================================================================================================

-- CATEGORIAS
INSERT INTO categoria2 (nome, descricao) VALUES ('Tecnologia', 'Tem Tecnologia');
INSERT INTO categoria2 (nome, descricao) VALUES ('Cultura', 'Tem Cultura');
INSERT INTO categoria2 (nome, descricao) VALUES ('Arte', 'Tem Arte');
INSERT INTO categoria2 (nome, descricao) VALUES ('Livros', 'Tem Livros');
INSERT INTO categoria2 (nome, descricao) VALUES ('História', 'Tem História');

-- LOCAIS
INSERT INTO local2 (nome, endereco, capacidade) VALUES ('Auditório Central', 'Rua das Flores, 100', 500);
INSERT INTO local2 (nome, endereco, capacidade) VALUES ('Centro de Convenções', 'Avenida Brasil, 250', 1000);
INSERT INTO local2 (nome, endereco, capacidade) VALUES ('Sala Inovação', 'Rua da Tecnologia, 50', 100);
INSERT INTO local2 (nome, endereco, capacidade) VALUES ('Teatro Municipal', 'Avenida Principal, 800', 750);
INSERT INTO local2 (nome, endereco, capacidade) VALUES ('Espaço Cultural', 'Rua da Cultura, 200', 300);

-- PALESTRANTES
INSERT INTO palestrante2 (nome, mini_bio, email) VALUES ('Carlos Almeida', 'Especialista em tecnologia e desenvolvimento de software', 'carlos@email.com');
INSERT INTO palestrante2 (nome, mini_bio, email) VALUES ('Mariana Souza', 'Professora e pesquisadora na área de educação', 'mariana@email.com');
INSERT INTO palestrante2 (nome, mini_bio, email) VALUES ('Rafael Oliveira', 'Consultor especializado em negócios e empreendedorismo', 'rafael@email.com');
INSERT INTO palestrante2 (nome, mini_bio, email) VALUES ('Fernanda Lima', 'Pesquisadora na área de ciência e inovação', 'fernanda@email.com');
INSERT INTO palestrante2 (nome, mini_bio, email) VALUES ('Lucas Martins', 'Artista e pesquisador de cultura contemporânea', 'lucas@email.com');

-- PARTICIPANTES
INSERT INTO participante2 (nome, telefone, email) VALUES ('João Silva', '999991111', 'joao@email.com');
INSERT INTO participante2 (nome, telefone, email) VALUES ('Ana Costa', '999992222', 'ana@email.com');
INSERT INTO participante2 (nome, telefone, email) VALUES ('Pedro Santos', '999993333', 'pedro@email.com');
INSERT INTO participante2 (nome, telefone, email) VALUES ('Juliana Souza', '999994444', 'juliana@email.com');
INSERT INTO participante2 (nome, telefone, email) VALUES ('Marcos Oliveira', '999995555', 'marcos@email.com');

-- EVENTOS
INSERT INTO evento2 (nome, descricao, data_inicio, data_fim, capacidade, status, categoria2_id, local2_id, palestrante2_id) VALUES ('Tech Summit 2026', 'Conferência sobre tecnologia e inovação', '2026-10-10', '2026-10-11', 500, 'ABERTO', 1, 1, 1);
INSERT INTO evento2 (nome, descricao, data_inicio, data_fim, capacidade, status, categoria2_id, local2_id, palestrante2_id) VALUES ('Fórum de Educação', 'Debates sobre novas práticas educacionais', '2026-10-20', '2026-10-20', 300, 'ABERTO', 2, 2, 2);
INSERT INTO evento2 (nome, descricao, data_inicio, data_fim, capacidade, status, categoria2_id, local2_id, palestrante2_id) VALUES ('Encontro de Empreendedores', 'Evento para discussão sobre negócios e empreendedorismo', '2026-11-05', '2026-11-05', 200, 'ABERTO', 3, 3, 3);
INSERT INTO evento2 (nome, descricao, data_inicio, data_fim, capacidade, status, categoria2_id, local2_id, palestrante2_id) VALUES ('Semana da Ciência', 'Palestras e apresentações sobre ciência e pesquisa', '2026-11-15', '2026-11-17', 400, 'ABERTO', 4, 4, 4);
INSERT INTO evento2 (nome, descricao, data_inicio, data_fim, capacidade, status, categoria2_id, local2_id, palestrante2_id) VALUES ('Festival Cultural', 'Festival dedicado à cultura e às artes', '2026-12-01', '2026-12-03', 600, 'ABERTO', 5, 5, 5);

-- INSCRIÇÕES
INSERT INTO inscricao2 (data_inscricao, status, evento2_id, participante2_id) VALUES ('2026-09-01', 'CONFIRMADA', 1, 1);
INSERT INTO inscricao2 (data_inscricao, status, evento2_id, participante2_id) VALUES ('2026-09-02', 'CONFIRMADA', 2, 2);
INSERT INTO inscricao2 (data_inscricao, status, evento2_id, participante2_id) VALUES ('2026-09-03', 'PENDENTE', 3, 3);
INSERT INTO inscricao2 (data_inscricao, status, evento2_id, participante2_id) VALUES ('2026-09-04', 'CONFIRMADA', 4, 4);
INSERT INTO inscricao2 (data_inscricao, status, evento2_id, participante2_id) VALUES ('2026-09-05', 'PENDENTE', 5, 5);