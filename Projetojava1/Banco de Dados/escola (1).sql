-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 31-Maio-2022 às 12:39
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `escola`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `admin`
--

CREATE TABLE `admin` (
  `ID` int(11) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `RG` int(7) NOT NULL,
  `Acesso` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `admin`
--

INSERT INTO `admin` (`ID`, `Nome`, `RG`, `Acesso`) VALUES
(1, 'Admin', 1234567, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `ID` int(11) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `DataNascimento` int(8) NOT NULL,
  `Naturalidade` varchar(20) NOT NULL,
  `NomeResponsavel` varchar(100) NOT NULL,
  `UF` varchar(20) NOT NULL,
  `RG` varchar(7) NOT NULL,
  `Sexo` varchar(20) NOT NULL,
  `Endereco` varchar(100) NOT NULL,
  `Cep` varchar(100) NOT NULL,
  `NomeMae` varchar(100) NOT NULL,
  `NomePai` varchar(100) NOT NULL,
  `EmailResponsavel` varchar(100) NOT NULL,
  `Deficiencia` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`ID`, `Nome`, `DataNascimento`, `Naturalidade`, `NomeResponsavel`, `UF`, `RG`, `Sexo`, `Endereco`, `Cep`, `NomeMae`, `NomePai`, `EmailResponsavel`, `Deficiencia`) VALUES
(1, 'alguem', 8302002, 'cruzeiro', 'ewoijnfoiewhf', 'Sao paulo', '1234567', '', '', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE `professor` (
  `ID` int(10) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `DataNascimento` varchar(8) NOT NULL,
  `DataCadastro` varchar(8) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Telefone` varchar(20) NOT NULL,
  `CPF` varchar(13) NOT NULL,
  `Cidade` varchar(100) NOT NULL,
  `Acesso` int(1) NOT NULL,
  `Endereco` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ID`);

--
-- Índices para tabela `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`ID`);

--
-- Índices para tabela `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `admin`
--
ALTER TABLE `admin`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `aluno`
--
ALTER TABLE `aluno`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `professor`
--
ALTER TABLE `professor`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
