#FROM mariadb/server
#ENV MARIADB_ROOT_PASSWORD pass

FROM mysql:5.7.26
ENV MYSQL_DATABASE conductor
ENV MYSQL_ROOT_PASSWORD pass
ENV innodb_print_all_deadlocks ON

COPY ./sql/ /docker-entrypoint-initdb.d/
