FROM mysql:8.0.23
ENV MYSQL_DATABASE conductor
ENV MYSQL_ROOT_PASSWORD pass

COPY ./cnf/my.cnf /etc/my.cnf
RUN chmod 0444 /etc/my.cnf
