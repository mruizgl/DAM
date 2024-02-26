-- Crear la tabla Clientes
CREATE TABLE Clientes (
    id_cliente INTEGER PRIMARY KEY,
    nombre TEXT,
    apellido TEXT,
    edad INTEGER,
    ciudad TEXT
);

-- Añadir registros a la tabla Clientes
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Juan', 'González', 30, 'Madrid');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('María', 'López', 25, 'Barcelona');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Carlos', 'Martínez', 35, 'Sevilla');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Ana', 'Ruiz', 28, 'Valencia');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Pedro', 'Sánchez', 40, 'Bilbao');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Laura', 'Díaz', 22, 'Málaga');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Sara', 'Fernández', 33, 'Zaragoza');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('David', 'Pérez', 27, 'Granada');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Elena', 'Gómez', 31, 'Alicante');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('José', 'Rodríguez', 29, 'Murcia');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Carmen', 'Hernández', 45, 'Córdoba');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Miguel', 'Moreno', 32, 'Valladolid');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Paula', 'Torres', 26, 'Santander');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Daniel', 'Jiménez', 38, 'Salamanca');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Lucía', 'Ruíz', 24, 'Toledo');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Alejandro', 'Ortega', 34, 'Pamplona');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Natalia', 'Sanz', 23, 'Badajoz');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Sergio', 'Vega', 37, 'Albacete');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Cristina', 'Blanco', 39, 'Huelva');
INSERT INTO Clientes (nombre, apellido, edad, ciudad) VALUES ('Iván', 'García', 36, 'Jaén');

-- Crear la tabla Pedidos
CREATE TABLE Pedidos (
    id_pedido INTEGER PRIMARY KEY,
    producto TEXT,
    cantidad INTEGER,
    precio REAL,
    fecha_pedido DATE,
    id_cliente INTEGER,
    FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente)
);

-- Añadir registros a la tabla Pedidos
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Camiseta', 2, 15.99, '2023-02-01', 1);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Pantalón', 1, 29.99, '2022-02-02', 2);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Zapatos', 1, 49.99, '2024-03-03', 3);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Gorra', 3, 9.99, '2024-02-04', 2);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Calcetines', 5, 4.99, '2019-04-04', 5);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Chaqueta', 1, 59.99, '2024-02-06', 5);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Bufanda', 2, 12.99, '2022-02-22', 7);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Pantalón', 1, 29.99, '2022-08-08', 8);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Vestido', 1, 39.99, '2024-09-09', 9);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Corbata', 2, 19.99, '2017-02-14', 20);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Bolso', 1, 69.99, '2022-02-11', 11);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Pantalón', 1, 29.99, '2024-12-12', 12);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Jersey', 1, 49.99, '2022-08-17', 13);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Sudadera', 1, 39.99, '2022-02-14', 14);
INSERT INTO Pedidos (producto, cantidad, precio, fecha_pedido, id_cliente) VALUES ('Zapatos', 1, 59.99, '2024-03-15', 19);
