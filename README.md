# spring-elasticsearch
Integrate Spring Boot with Elasticsearch

# steps

1- Create a `docker-compose` file.

2- Create a `logstash` folder.

3- Create a `config` folder under `logstash` folder then create a new file: `logstash.yml`.

4- Create a `pipeline` folder under `logstash` folder then create a new file: `logstash.conf`.

5- Run the `docker-compose` file to check.

6- check those two URLs: http://localhost:9200/ and http://localhost:5601/.

7- Go to `pom.xml` and add dependencies of `logstash`:

		<dependency>
			<groupId>net.logstash.logback</groupId>
			<artifactId>logstash-logback-encoder</artifactId>
			<version>7.4</version>
		</dependency>

8- Create a new file `logback-spring.xml`.

9- Run `TestController.java` APIs to check (for `URL` or `Postman`).

10- Got to: http://localhost:5601/ and `Management/Stack Management/Data/Index Management` you will see `springboot-test-log`.

11- Click on: `Kibana/Data Views` then click on `Create data view` button.

12- Choose `name` like: `spring*` (in your application choose: anchtunentreprise*).

13- Choose the `Index pattern` like: `spring*`.

14- Go to `Analitics/Discover`

15- In `Selected Fields` choose `message` and `app`. 

# Tips

- To see elasticsearch configuration run: `curl "localhost:9200/_nodes/settings?pretty=true"`


		