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

- Copy data from container to the host: `sudo docker cp 4aa06b42ef44:/usr/share/elasticsearch/data /home/mohammedayman/elasticsearch/data/`

- You can delete index... by API via console: http://localhost:5601/app/kibana#/dev_tools/console?load_from=https:%2F%2Fwww.elastic.co%2Fguide%2Fen%2Felasticsearch%2Freference%2F5.4%2Fsnippets%2F458.console&_g=()

# Combine ELK with Filebeat

1- Create a new folder: `filebeat_docker`

2- Filebeat:

Create a new file `Dockerfile` and create a new file `filebeat.yml`

3- run: `docker build -t filebeatimage .`

4- Configuring ELK or Elastic Stack

5- `ElasticSearch`: `docker pull docker.elastic.co/elasticsearch/elasticsearch:7.5.1`

6- Create a new folder `docker_elk`: `mkdir docker_elk && cd $_` and another folder `elasticsearch`

7- Run: `touch Dockerfile && touch elasticsearch.yml`

Note that you can set `xpack.license.self_generated.type` from `basic` to `trial` if you wish to evaluate the commercial feature of x-pack for 30 days.

The command `chown` is to change the file owner to elasticsearch as of other files in container.

8- `Kibana`: Run this: `docker pull docker.elastic.co/kibana/kibana:7.5.1`

9- Create a new folder inside `docker_elk`: `mkdir kibana && cd $_`

10- Run this: `touch Dockerfile && touch kibana.yml`

11- `Logstash`: Run this: `docker pull docker.elastic.co/logstash/logstash:7.5.1`

12- Create a new folder inside `docker_elk`: `mkdir logstash && cd $_`

13- Run this: `touch Dockerfile && touch logstash.yml`

14- Inside `logstash` folder create this file: `logstash.conf`

It will be like this:

.
├── elasticsearch
│   ├── Dockerfile
│   └── elasticsearch.yml
├── kibana
│   ├── Dockerfile
│   └── kibana.yml
└── logstash
    ├── Dockerfile
    ├── logstash.conf
    └── logstash.yml
 
3 directories, 7 files


15- `Docker Compose`

Create a `docker-compose.yml` file in the `docker_elk` directory.

16- Run: `sudo docker compose up -d`

17- To ensure that the pipeline is working all fine, run the following command to see the Elasticsearch indices:

`curl 'localhost:9200/_cat/indices?v' -u elastic:yourstrongpasswordhere`

	