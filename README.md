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
		
		