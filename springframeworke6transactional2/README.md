
For this tutorial we need a MySQL instance. If you want to avoid the
hassle that comes with installing MySQL simply 

###### **Start the infrastructure:**

 In command line issue: 
    `docker-compose up -d`

 Check if the database container is up:
    `docker ps -a`

 You should have something similar with
 `CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                                      NAMES
 2cbe5d078739        mysql:5.7           "docker-entrypoint.s…"   8 minutes ago       Up 8 minutes        0.0.0.0:3306->3306/tcp, 33060/tcp          springframeworke6transactional2_db_1
 `
 
 Connect to server
    `mysql -h 127.0.0.1 -u root -P 3306 -p password`
 Stop the MySQL container:
    `docker-compose stop`

Other useful commands:
`docker-compose build`