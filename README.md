# Web-сервис вычислений

Реализовано с помощью Spring WebMVC и PostgreSQL.

## Установка базы данных

Выполнить из под администратора скрипт из dbinstall/install.sql

## Подключение к БД

### Tomcat

В файле server.xml в разделе Server/GlobalNamingResources добавить запись:

```
<Resource name="jdbc/TestDB" 
      global="jdbc/TestDB" 
      auth="Container" 
      type="javax.sql.DataSource" 
      driverClassName="org.postgresql.Driver" 
      url="jdbc:postgresql://localhost:5432/calculation" 
      username="пользователь"
      password="пароль"
      maxActive="100"
      maxIdle="20"
      minIdle="5"
      maxWait="10000"/>
```

В файле context.xml в разделе Context добавить запись:

```
<ResourceLink name="jdbc/SampleDB"
                global="jdbc/TestDB"
                    auth="Container"
                    type="javax.sql.DataSource" />
```

### Glassfish

В настройках создать JNDI запись с именем SampleDB.


## Тесты

Тесты Insomnia находятся в папке src/test/json.