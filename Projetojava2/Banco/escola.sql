-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13-Jun-2022 às 14:28
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
  `senha` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `admin`
--

INSERT INTO `admin` (`ID`, `Nome`, `senha`) VALUES
(1, 'Joao', 'joao123');

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
  `DataNascimento` varchar(15) NOT NULL,
  `DataCadastro` varchar(15) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Telefone` varchar(20) NOT NULL,
  `CPF` varchar(15) NOT NULL,
  `Cidade` varchar(100) NOT NULL,
  `Endereco` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`ID`, `Nome`, `DataNascimento`, `DataCadastro`, `Email`, `Telefone`, `CPF`, `Cidade`, `Endereco`) VALUES
(1, 'uytre', '22/11/2002', '12/03/2002', 'email.com', '(  ) -        ', '9876543', 'sao paulo', 'poiu'),
(2, 'joaoadds', '  /  /    ', '20/06/2016', 'jododo@jkj', '(12)9-99790652', '234567466', 'cuetrto', 'flhgohittujyky'),
(3, 'joao', '08/03/2002', '25/11/1980', 'htrhtrhrh', '(12)9-35414351', '454874', 'hhhtrhr', 'waestdgrhg'),
(4, 'Joao Bosco', '  23/04/2022', '23/05/2001', 'jooso@gmail.com', '(12)8-37347647', '236.363.726.32', 'Guara/sp', 'Rua dos ipes');

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
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
