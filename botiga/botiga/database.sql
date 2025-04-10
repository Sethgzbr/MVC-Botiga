-- Evitar conflictes

DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS Subcategoria;
DROP TABLE IF EXISTS Categoria;

-- TABLE CATEGORIA
CREATE TABLE Categoria (
    id_Categoria BIGINT AUTO_INCREMENT PRIMARY KEY,
    desc_Categoria VARCHAR(255),
    status_Categoria VARCHAR(255),
    creation_at DATETIME(6) DEFAULT CURRENT_TIMESTAMP(6),
    updated_at DATETIME(6) DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6)
);

-- TABLE SUBCATEGORIA
CREATE TABLE Subcategoria (
    id_Subcategoria BIGINT AUTO_INCREMENT PRIMARY KEY,
    desc_Subcategoria VARCHAR(255),
    status_Subcategoria VARCHAR(255),
    categoria_id BIGINT,
    creation_at DATETIME(6) DEFAULT CURRENT_TIMESTAMP(6),
    updated_at DATETIME(6) DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
    FOREIGN KEY (categoria_id) REFERENCES Categoria(id_Categoria)
);

-- TABLE PRODUCTS
CREATE TABLE products (
    product_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    company VARCHAR(255),
    creation_at DATETIME(6) DEFAULT CURRENT_TIMESTAMP(6),
    description VARCHAR(255),
    name VARCHAR(255),
    price FLOAT,
    units BIGINT,
    updated_at DATETIME(6) DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
    categoria_id BIGINT UNIQUE,
    subcategoria_id BIGINT,
    CONSTRAINT fk_products_categoria 
        FOREIGN KEY (categoria_id) REFERENCES Categoria(id_Categoria),
    CONSTRAINT fk_products_subcategoria 
        FOREIGN KEY (subcategoria_id) REFERENCES Subcategoria(id_Subcategoria)
);

-- Millorar el rendiment
CREATE INDEX idx_products_categoria ON products(categoria_id);
CREATE INDEX idx_products_subcategoria ON products(subcategoria_id);