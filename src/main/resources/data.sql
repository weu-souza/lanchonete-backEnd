INSERT INTO tb_users (ID, NAME, LOGIN, PASSWORD, ROLE)
VALUES (10, 'Admin', 'admin', '$2a$10$uwQ8Ij.P8/Dz97lIbZrCD.rifW65YuvzyAbf3FkiLU6M2zz3Ho7GG', 'admin');
INSERT INTO tb_users (ID, NAME, LOGIN, PASSWORD, ROLE)
VALUES (11, 'User', 'user', '$2a$10$uwQ8Ij.P8/Dz97lIbZrCD.rifW65YuvzyAbf3FkiLU6M2zz3Ho7GG', 'user');
INSERT INTO tb_categories (ID, NAME)
VALUES (10, 'hamburguer');
INSERT INTO tb_products (ID, NAME, PRICE, INGREDIENTS, category_id)
VALUES (10, 'hamburguer', 20, 'hamburguer,carne, queijo', 10);
INSERT INTO tb_offers (ID, NAME, PRICE, ingredients)
VALUES (10, 'combo 1', 20, 'hamburguer + refri');
