CREATE TABLE Cliente (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT,
    email TEXT
);

CREATE TABLE Pedido (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    clienteId INTEGER,
    producto TEXT,
    cantidad INTEGER,
    FOREIGN KEY (clienteId) REFERENCES Cliente(id)
);

INSERT INTO Cliente (nombre, email) VALUES
('Juan', 'juan@example.com'),
('María', 'maria@example.com');

INSERT INTO Pedido (clienteId, producto, cantidad) VALUES
(1, 'Producto A', 2),
(1, 'Producto B', 1),
(2, 'Producto C', 3);

