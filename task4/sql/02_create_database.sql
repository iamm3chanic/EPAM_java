CREATE DATABASE `races_db` DEFAULT CHARACTER SET utf8;

GRANT ALL PRIVILEGES
ON `races_db`.*
TO administrator@localhost
IDENTIFIED BY 'admin_password';

GRANT SELECT
ON `races_db`.*
TO client@localhost
IDENTIFIED BY 'client_password',
bookmaker@localhost
IDENTIFIED BY 'bookm_password';

GRANT INSERT,UPDATE,DELETE
ON `races_db`.`request`
TO client@localhost
IDENTIFIED BY 'client_password';

GRANT INSERT,UPDATE,DELETE
ON `races_db`.`car`
TO bookmaker@localhost
IDENTIFIED BY 'bookm_password';
