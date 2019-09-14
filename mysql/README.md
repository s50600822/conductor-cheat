# About
docker image for mysql with a few setup for conductor to connect and write

# To build
```
docker build . -t s50600822/conductor-mysql:5.7.26-vb-SYD
```

# To run
```
docker run -p 3306:3306  -e MYSQL_ROOT_PASSWORD=pass  s50600822/conductor-mysql:5.7.26-vb-SYD
```

# Customize
- Put SQL files/data/dump into [sql](sql) dir before build to have them setup in your MySQL container
- Put your config like logging, locking strategry, admin config into [cnf](cnf/mysqld.cnf)
