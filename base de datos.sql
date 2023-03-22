-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.29 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.4.0.6659
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Volcando datos para la tabla hospital.citas: ~4 rows (aproximadamente)
INSERT INTO `citas` (`idcita`, `idconsultorio`, `iddoctor`, `horario_consul`, `nombre_paciente`) VALUES
	(4, 3, 3, '2023-03-22 05:52:00', 'fdgdfgfdg'),
	(5, 1, 2, '2023-03-18 18:15:00', 'Pedro antonio cadena'),
	(6, 2, 1, '2023-03-22 05:16:00', 'Solino Sosaga Solis'),
	(7, 4, 3, '2023-03-22 05:16:00', 'Adria perez mendez');

-- Volcando datos para la tabla hospital.consultorios: ~4 rows (aproximadamente)
INSERT INTO `consultorios` (`idconsultorio`, `numero`, `piso`) VALUES
	(1, 10, '2-B'),
	(2, 2, '3-A'),
	(3, 4, '1-C'),
	(4, 7, '4-A');

-- Volcando datos para la tabla hospital.doctores: ~4 rows (aproximadamente)
INSERT INTO `doctores` (`iddoctor`, `nombre`, `ape_p`, `ape_m`, `especialidad`) VALUES
	(1, 'Geremias', 'Cordova', 'Ruiz', 'Dentista'),
	(2, 'Alfonos', 'Cuaron', 'Sebes', 'Ginecologo'),
	(3, 'Alejandro', 'Reyna', 'Peres', 'algo'),
	(4, 'phineas', 'Sanches', 'olga', 'algo');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
