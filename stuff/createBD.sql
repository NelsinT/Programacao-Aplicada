-- Criação da Base de Dados
CREATE DATABASE lei_reparacoes_db;
USE lei_reparacoes_db;

-- 1. Tabela Base: Utilizadores [cite: 26]
CREATE TABLE Utilizador (
    username VARCHAR(50) PRIMARY KEY, -- [cite: 26, 27]
    nome VARCHAR(100) NOT NULL, [cite: 26]
    password VARCHAR(255) NOT NULL, [cite: 26]
    email VARCHAR(100) UNIQUE NOT NULL, -- [cite: 27, 28]
    estado ENUM('activo', 'inactivo') DEFAULT 'inactivo', -- [cite: 26, 44]
    tipo ENUM('gestor', 'cliente', 'funcionario') NOT NULL [cite: 26]
);

-- 2. Especialização: Clientes [cite: 34, 37]
CREATE TABLE Cliente (
    username VARCHAR(50) PRIMARY KEY,
    nif CHAR(9) UNIQUE NOT NULL, -- [cite: 34, 38]
    telefone CHAR(9) NOT NULL, -- [cite: 34, 39]
    morada VARCHAR(255), [cite: 34]
    sector_actividade VARCHAR(100), [cite: 37]
    escalao ENUM('A', 'B', 'C', 'D'), [cite: 37]
    FOREIGN KEY (username) REFERENCES Utilizador(username) ON DELETE CASCADE,
    CONSTRAINT chk_nif_cliente CHECK (nif REGEXP '^[0-9]{9}$'), -- [cite: 38]
    CONSTRAINT chk_tel_cliente CHECK (telefone REGEXP '^[239][0-9]{8}$') -- [cite: 39]
);

-- 3. Especialização: Funcionários [cite: 34, 35]
CREATE TABLE Funcionario (
    username VARCHAR(50) PRIMARY KEY,
    nif CHAR(9) UNIQUE NOT NULL, -- [cite: 34, 38]
    telefone CHAR(9) NOT NULL, -- [cite: 34, 39]
    morada VARCHAR(255), [cite: 34]
    especializacao INT CHECK (especializacao BETWEEN 1 AND 5), -- [cite: 35]
    data_inicio_actividade DATE, [cite: 35]
    FOREIGN KEY (username) REFERENCES Utilizador(username) ON DELETE CASCADE,
    CONSTRAINT chk_nif_func CHECK (nif REGEXP '^[0-9]{9}$'), -- [cite: 38]
    CONSTRAINT chk_tel_func CHECK (telefone REGEXP '^[239][0-9]{8}$') -- [cite: 39]
);

-- 4. Equipamentos [cite: 57, 67]
CREATE TABLE Equipamento (
    sku INT PRIMARY KEY, -- [cite: 67, 69]
    marca VARCHAR(50) NOT NULL, [cite: 67]
    modelo VARCHAR(50) NOT NULL, -- [cite: 67, 70]
    data_fabrico DATE, [cite: 68]
    lote VARCHAR(50), [cite: 68]
    cliente_username VARCHAR(50), [cite: 61]
    FOREIGN KEY (cliente_username) REFERENCES Cliente(username) [cite: 61]
);

-- 5. Reparações [cite: 57, 74, 77]
CREATE TABLE Reparacao (
    numero_reparacao VARCHAR(30) PRIMARY KEY, -- [cite: 74, 75, 76]
    sku_equipamento INT NOT NULL, [cite: 62]
    funcionario_username VARCHAR(50), -- Atribuído pelo gestor [cite: 65, 85]
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP, [cite: 77]
    data_fim DATETIME, [cite: 77]
    tempo_decorrido BIGINT, -- Em milissegundos ou segundos [cite: 77]
    custo DECIMAL(10,2) DEFAULT 0.00, [cite: 77]
    estado ENUM('criado', 'aceite', 'decorrer', 'finalizado', 'arquivado') DEFAULT 'criado', -- [cite: 94-99]
    observacoes TEXT, [cite: 77]
    FOREIGN KEY (sku_equipamento) REFERENCES Equipamento(sku), [cite: 62]
    FOREIGN KEY (funcionario_username) REFERENCES Funcionario(username) [cite: 62]
);

-- 6. Testes de Operacionalidade [cite: 78, 79]
CREATE TABLE Teste_Operacionalidade (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero_reparacao VARCHAR(30) NOT NULL, [cite: 78]
    designacao VARCHAR(100) NOT NULL, [cite: 79]
    descricao TEXT, [cite: 79]
    data_realizacao DATE, [cite: 79]
    FOREIGN KEY (numero_reparacao) REFERENCES Reparacao(numero_reparacao) ON DELETE CASCADE
);

-- 7. Peças de Substituição [cite: 81]
CREATE TABLE Peca (
    codigo_interno VARCHAR(50) PRIMARY KEY, [cite: 81]
    designacao VARCHAR(100) NOT NULL, [cite: 81]
    fabricante VARCHAR(100), [cite: 81]
    quantidade INT DEFAULT 0, [cite: 81]
    CONSTRAINT chk_quantidade CHECK (quantidade >= 0)
);

-- 8. Tabela de Ligação: Peças usadas na Reparação [cite: 80]
CREATE TABLE Reparacao_Peca (
    numero_reparacao VARCHAR(30),
    codigo_peca VARCHAR(50),
    quantidade_usada INT NOT NULL,
    PRIMARY KEY (numero_reparacao, codigo_peca),
    FOREIGN KEY (numero_reparacao) REFERENCES Reparacao(numero_reparacao),
    FOREIGN KEY (codigo_peca) REFERENCES Peca(codigo_interno)
);

-- 9. Log de Sistema [cite: 152, 153]
CREATE TABLE Log_Sistema (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data DATE NOT NULL, [cite: 153]
    hora TIME NOT NULL, [cite: 153]
    username VARCHAR(50), [cite: 153]
    accao TEXT NOT NULL, [cite: 153]
    FOREIGN KEY (username) REFERENCES Utilizador(username)
);