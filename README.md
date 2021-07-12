# full-stack-back-end

To start please do the following

```
mvn clean install -DskipTests
```

After that you can change the config in `application.properties` to automatically create table in your DB. **Don't forget to create DB first and change connection config**
```
spring.jpa.hibernate.ddl-auto=update
```

Then seeds your database and enjoy!