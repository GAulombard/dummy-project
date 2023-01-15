# dummy-project

http://localhost:8080/swagger-ui/index.html

mvn clean install
docker build -t dummy-api .

1 - docker network create spring-net
2 - docker run -d --net spring-net -p 3307:3306 --name mysqldb -e MYSQL_ROOT_PASSWORD=rootroot -e
MYSQL_DATABASE=dummy_db -v "D:/Programming/_database/dummy_db":/var/lib/mysql mysql
3 - docker run -d --net spring-net -p 9090:8080 --name dummy-api -e MYSQL_HOST=mysqldb -e MYSQL_PASSWORD=rootroot -e
MYSQL_USER=root -e MYSQL_PORT=3306 hod0r/dummy-api

