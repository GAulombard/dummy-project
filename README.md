# dummy-project

docker build -t dummy-api .

1 - docker network create spring-net
2 - docker run -d --net spring-net -p 3307:3306 --name mysqldb -e MYSQL_ROOT_PASSWORD=rootroot -e MYSQL_DATABASE=dummy_db mysql
3 - docker run -d --net spring-net -p 9090:8080 --name dummy-api -e MYSQL_HOST=mysqldb -e MYSQL_PASSWORD=rootroot -e MYSQL_USER=root -e MYSQL_PORT=3306 dummy-api

