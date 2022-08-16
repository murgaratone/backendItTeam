-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-08-2022 a las 06:53:43
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `offers`
--
CREATE DATABASE IF NOT EXISTS `offers` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `offers`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `offer`
--

CREATE TABLE `offer` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `offer`
--

INSERT INTO `offer` (`id`, `name`, `description`, `price`) VALUES
(4, 'Oferta 4', 'Se aplican descuentos por compras menores de 500000 y mayores de 2400000.', 50000),
(8, 'Oferta 2', 'Se aplican descuentos por compras mayores de 240000 y menores de 480000 ', 30000),
(10, 'Oferta 3', 'Se aplican descuentos por compras mayores de 480000 y menores de 1000000', 70000),
(11, 'Oferta 5', 'Se aplican descuentos por compras menores de 1200000 y mayores de 1000000', 95000),
(12, 'Oferta 6 ', 'Se aplican descuentos por compras menores de 1400000 y mayores de 1200000', 120000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `offer`
--
ALTER TABLE `offer`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `offer`
--
ALTER TABLE `offer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
