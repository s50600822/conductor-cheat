# About
docker image for mysql with a few setup for conductor to connect and write

# To build
```
docker build . -t s50600822/conductor-mysql:8.0.23-vb-SYD
```

# To run
```
docker run -p 3306:3306  -e MYSQL_ROOT_PASSWORD=pass  s50600822/conductor-mysql:8.0.23-vb-SYD
```


https://severalnines.com/database-blog/mysql-performance-benchmarking-mysql-57-vs-mysql-80
https://dev.mysql.com/doc/refman/8.0/en/show-variables.html
https://dev.mysql.com/doc/refman/8.0/en/option-files.html

| Tables                | Purpose                                    |
| ----------------------|:------------------------------------------:|
| /etc/my.cnf           | Global options                             |
| MYSQL_HOME/my.cnf     | Server-specific options (server only)      |
| ~/.my.cnf             | User-specific options                      |