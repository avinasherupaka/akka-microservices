# Microservice example

# Build & Run

To run simply use:

```
sbt run
```

Run tests with:

```
sbt test
```

To build & run:

```
sbt assembly
```

And then run JAR as usual, something like this:

```
nohup java -jar target/scala-2.11/akka-microservice-assembly-1.0.jar 1>/dev/null 2>&1 &
```
