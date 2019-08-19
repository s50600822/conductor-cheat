FROM mariadb/server
ENV MYSQL_DATABASE conductor
ENV MARIADB_ROOT_PASSWORD pass
ENV innodb_print_all_deadlocks ON

COPY ./sql/ /docker-entrypoint-initdb.d/
