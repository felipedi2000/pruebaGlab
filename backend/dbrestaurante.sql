USE dbrestaurante;
CREATE TABLE Reservas (
	ReservaID INT AUTO_INCREMENT PRIMARY KEY,
    Nombres VARCHAR(50) NOT NULL,
    Apellidos VARCHAR(50) NOT NULL,
    Tipo_documento VARCHAR(20) NOT NULL,
    Identificacion VARCHAR(20) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    Fecha_reserva DATE NOT NULL,
    Tipo_reserva VARCHAR(50) NOT NULL,
    Observaciones VARCHAR(50) NOT NULL,
    Cantidad_personas INT NOT NULL
);

CREATE TABLE Usuarios (
	UserID INT AUTO_INCREMENT PRIMARY KEY,
    Email VARCHAR(100) NOT NULL,
    Clave VARCHAR(30) NOT NULL
);

CREATE TABLE Roles (
	UserID INT AUTO_INCREMENT PRIMARY KEY,
    Email VARCHAR(100) NOT NULL,
    Rol VARCHAR(30) NOT NULL
);