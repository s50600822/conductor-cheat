#FROM mariadb/server
#ENV MARIADB_ROOT_PASSWORD pass

FROM mysql:5.7.26
ENV MYSQL_DATABASE conductor
ENV MYSQL_ROOT_PASSWORD pass

COPY ./cnf/mysqld.cnf /etc/mysql/mysql.conf.d/mysqld.cnf
COPY ./sql/ /docker-entrypoint-initdb.d/