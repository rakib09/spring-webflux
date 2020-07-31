# spring-webflux-R2DBC
Example project spring webflux with R2DBC

### Project Info:
- Java: 11
- Type: Maven
- Database: Postgresql
- Database info is described in the application.properties file

#### Table Schema
```
CREATE TABLE categories (
    id              SERIAL PRIMARY KEY,
    name           VARCHAR(100) NOT NULL
);
```

#### Sample Data:
```
INSERT INTO categories (name) values ('Cars');
INSERT INTO categories (name) values ('Planes');
INSERT INTO categories (name) values ('Busses');
INSERT INTO categories (name) values ('Trucks');
```

