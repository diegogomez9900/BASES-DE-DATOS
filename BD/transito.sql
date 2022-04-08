-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-07-2019 a las 22:37:48
-- Versión del servidor: 10.1.40-MariaDB
-- Versión de PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `transito`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agente`
--

CREATE TABLE `agente` (
  `Codigo_Agente` int(11) NOT NULL,
  `Nombre_Agente` char(50) NOT NULL,
  `Apellido_Agente` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `agente`
--

INSERT INTO `agente` (`Codigo_Agente`, `Nombre_Agente`, `Apellido_Agente`) VALUES
(1, 'Jairo', 'Ortiz'),
(2, 'Carlos', 'Guapacha'),
(3, 'Nicolas', 'Marin'),
(4, 'sara', 'rios');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casa_automotriz`
--

CREATE TABLE `casa_automotriz` (
  `Codigo_Casa` int(11) NOT NULL,
  `Nombre_Casa` char(50) NOT NULL,
  `Direccion_Casa` char(15) NOT NULL,
  `Codigo_Modelo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `casa_automotriz`
--

INSERT INTO `casa_automotriz` (`Codigo_Casa`, `Nombre_Casa`, `Direccion_Casa`, `Codigo_Modelo`) VALUES
(1, 'CaldasMotor', 'Manizales-Calda', 1),
(2, 'CaldasMotor', 'Manizales-Calda', 2),
(3, 'MazAutos', 'Pereira-Risaral', 3),
(4, 'DisToota', 'Ibague-Tolima', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `infraccion`
--

CREATE TABLE `infraccion` (
  `Codigo_Infraccion` int(11) NOT NULL,
  `Fecha_Infraccion` date NOT NULL,
  `Lugar_Infraccion` char(100) NOT NULL,
  `Articulo_Multa` char(100) NOT NULL,
  `Importe_Infraccion` char(50) NOT NULL,
  `Codigo_Agente` int(11) NOT NULL,
  `Codigo_Infractor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `infraccion`
--

INSERT INTO `infraccion` (`Codigo_Infraccion`, `Fecha_Infraccion`, `Lugar_Infraccion`, `Articulo_Multa`, `Importe_Infraccion`, `Codigo_Agente`, `Codigo_Infractor`) VALUES
(1, '2019-08-15', 'Pereira-Risaralda', 'Articulo 104', '1.500.000 pesos', 1, 2),
(2, '2019-07-13', 'Pereira-Risaralda', 'Articulo 111', '654.000 pesos', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `infractor`
--

CREATE TABLE `infractor` (
  `Codigo_Infractor` int(11) NOT NULL,
  `Nombre_Infractor` char(50) NOT NULL,
  `Apellido_Infractor` char(50) NOT NULL,
  `Nacimiento_Infractor` date NOT NULL,
  `Domicilio_Infractor` char(50) NOT NULL,
  `Placa_Matriculado` char(10) DEFAULT NULL,
  `Codigo_Tipo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `infractor`
--

INSERT INTO `infractor` (`Codigo_Infractor`, `Nombre_Infractor`, `Apellido_Infractor`, `Nacimiento_Infractor`, `Domicilio_Infractor`, `Placa_Matriculado`, `Codigo_Tipo`) VALUES
(1, 'Gabriel', 'Gonzalez', '1986-02-15', 'crr 4 cll 5', NULL, 2),
(2, 'Jose', 'Diaz', '1996-11-11', 'crr 5 cll 11', 'DAM50C', 1),
(3, 'Carlos', 'Guapacha', '1989-07-15', 'crr 9 cll 21', 'WMR88X', 1),
(7, 'Andres', 'Morales', '1985-10-02', 'Angurrias, Macondo', NULL, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca`
--

CREATE TABLE `marca` (
  `Codigo_Marca` int(11) NOT NULL,
  `Nombre_Marca` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `marca`
--

INSERT INTO `marca` (`Codigo_Marca`, `Nombre_Marca`) VALUES
(1, 'Renault'),
(2, 'Mazda'),
(3, 'Toyota'),
(4, 'Chevrolet'),
(10, 'Pagani');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `matricula`
--

CREATE TABLE `matricula` (
  `Placa_Matriculado` char(10) NOT NULL,
  `Fecha_Matricula` date NOT NULL,
  `Codigo_Vehiculo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `matricula`
--

INSERT INTO `matricula` (`Placa_Matriculado`, `Fecha_Matricula`, `Codigo_Vehiculo`) VALUES
('ASD15A', '2019-10-20', 7),
('DAM50C', '2017-10-13', 1),
('FGL54A', '2017-10-13', 2),
('TMT15D', '2019-07-15', 5),
('VLS12V', '2017-11-07', 4),
('WMR88X', '2018-12-30', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modelo`
--

CREATE TABLE `modelo` (
  `Codigo_Modelo` int(11) NOT NULL,
  `Nombre_Modelo` char(50) NOT NULL,
  `Potencia` char(15) NOT NULL,
  `Codigo_Marca` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `modelo`
--

INSERT INTO `modelo` (`Codigo_Modelo`, `Nombre_Modelo`, `Potencia`, `Codigo_Marca`) VALUES
(1, 'Clio', '75 hp', 1),
(2, 'Sandero', '87.5 hp', 1),
(3, 'Mazda 3', '100 hp', 2),
(4, 'Corolla', '60 hp', 3),
(5, 'Logan', '75 hp', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_infractor`
--

CREATE TABLE `tipo_infractor` (
  `Codigo_Tipo` int(11) NOT NULL,
  `Nombre_Tipo` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_infractor`
--

INSERT INTO `tipo_infractor` (`Codigo_Tipo`, `Nombre_Tipo`) VALUES
(1, 'Conductor'),
(2, 'Peaton');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `Codigo_Vehiculo` int(11) NOT NULL,
  `Codigo_Casa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vehiculo`
--

INSERT INTO `vehiculo` (`Codigo_Vehiculo`, `Codigo_Casa`) VALUES
(4, 1),
(5, 1),
(7, 1),
(2, 3),
(3, 3),
(1, 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `agente`
--
ALTER TABLE `agente`
  ADD PRIMARY KEY (`Codigo_Agente`);

--
-- Indices de la tabla `casa_automotriz`
--
ALTER TABLE `casa_automotriz`
  ADD PRIMARY KEY (`Codigo_Casa`),
  ADD KEY `Codigo_Modelo` (`Codigo_Modelo`);

--
-- Indices de la tabla `infraccion`
--
ALTER TABLE `infraccion`
  ADD PRIMARY KEY (`Codigo_Infraccion`),
  ADD KEY `Codigo_Infractor` (`Codigo_Infractor`),
  ADD KEY `Codigo_Agente` (`Codigo_Agente`);

--
-- Indices de la tabla `infractor`
--
ALTER TABLE `infractor`
  ADD PRIMARY KEY (`Codigo_Infractor`),
  ADD KEY `Placa_Matriculado` (`Placa_Matriculado`),
  ADD KEY `Codigo_Tipo` (`Codigo_Tipo`);

--
-- Indices de la tabla `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`Codigo_Marca`);

--
-- Indices de la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD PRIMARY KEY (`Placa_Matriculado`),
  ADD KEY `Codigo_Vehiculo` (`Codigo_Vehiculo`);

--
-- Indices de la tabla `modelo`
--
ALTER TABLE `modelo`
  ADD PRIMARY KEY (`Codigo_Modelo`),
  ADD KEY `Codigo_Marca` (`Codigo_Marca`);

--
-- Indices de la tabla `tipo_infractor`
--
ALTER TABLE `tipo_infractor`
  ADD PRIMARY KEY (`Codigo_Tipo`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`Codigo_Vehiculo`),
  ADD KEY `Codigo_Casa` (`Codigo_Casa`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `casa_automotriz`
--
ALTER TABLE `casa_automotriz`
  ADD CONSTRAINT `Codigo_Modelo` FOREIGN KEY (`Codigo_Modelo`) REFERENCES `modelo` (`Codigo_Modelo`);

--
-- Filtros para la tabla `infraccion`
--
ALTER TABLE `infraccion`
  ADD CONSTRAINT `Codigo_Agente` FOREIGN KEY (`Codigo_Agente`) REFERENCES `agente` (`Codigo_Agente`),
  ADD CONSTRAINT `Codigo_Infractor` FOREIGN KEY (`Codigo_Infractor`) REFERENCES `infractor` (`Codigo_Infractor`);

--
-- Filtros para la tabla `infractor`
--
ALTER TABLE `infractor`
  ADD CONSTRAINT `Codigo_Tipo` FOREIGN KEY (`Codigo_Tipo`) REFERENCES `tipo_infractor` (`Codigo_Tipo`),
  ADD CONSTRAINT `Placa_Matriculado` FOREIGN KEY (`Placa_Matriculado`) REFERENCES `matricula` (`Placa_Matriculado`);

--
-- Filtros para la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD CONSTRAINT `Codigo_Vehiculo` FOREIGN KEY (`Codigo_Vehiculo`) REFERENCES `vehiculo` (`Codigo_Vehiculo`);

--
-- Filtros para la tabla `modelo`
--
ALTER TABLE `modelo`
  ADD CONSTRAINT `Codigo_Marca` FOREIGN KEY (`Codigo_Marca`) REFERENCES `marca` (`Codigo_Marca`);

--
-- Filtros para la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD CONSTRAINT `Codigo_Casa` FOREIGN KEY (`Codigo_Casa`) REFERENCES `casa_automotriz` (`Codigo_Casa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
