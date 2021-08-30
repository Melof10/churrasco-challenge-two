# Server Base - Churrasco


## ENVIROMENT SETUP

1) CREATE DATABASE 
``` mysql
Create a database on your computer
```

2) SET VALUES IN application.properties
``` bash
Add your own values in the properties of application.properties
```
--- application.properties ---
``` bash
logging.pattern.dateformat=hh:mm
spring.main.banner-mode=off

# MySQL connection
spring.datasource.url=jdbc:mysql://YOUR_HOSTNAME:3306/YOUR_DATABASE?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrival=true
spring.datasource.username=
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update

# Show SQL
spring.jpa.properties.hibernate.format_sql=true
logging.level.org.hibernate.SQL=debug
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=trace

# Zendesk credentials
zendeskSubdomain=
zendeskUsername=
zendeskPassword=
```

3) RUN APP:
``` bash
Run the application so that the tables are created in the database
```

## API REST

### Endpoints for Zendesk

Endpoint to GET feedback on a ticket (GET)
``` bash
http://localhost:8080/api/comments/all/35 ----> (ticket id)
```
Endpoint to CREATE a comment on a ticket (POST)
``` bash
http://localhost:8080/api/comments/save/35 ----> (ticket id)
```
--- body ---
``` bash
{
    "body": "Probando desde Spring boot"    
}
```
### Enpoints for career
Endpoint to GET feedback on a careers (GET)
``` bash
http://localhost:8080/api/careers/all
```
Endpoint to CREATE career (POST)
``` bash
http://localhost:8080/api/careers/save
```
--- body ---
``` bash
{
    "name": "Desarrollo de Software",
    "description": "Carrera que tiene una duración de tres año",
    "semester": [
        {
            "name": "1er semestre",
            "course": [
                { "name": "MATEMÁTICA Y LÓGICA" },
                { "name": "SISTEMAS Y ORGANIZACIONES" },
                { "name": "ARQUITECTURA DE LAS COMPUTADORAS" },
                { "name": "PROGRAMACIÓN I" },
                { "name": "INGLÉS" },
                { "name": "LENGUA Y COMUNICACIÓN" }
            ]
        },
        {
            "name": "2do semestre",
            "course": [
                { "name": "SISTEMAS OPERATIVOS" },
                { "name": "MATEMÁTICA APLICADA" },
                { "name": "MODELADO DE SISTEMAS" },
                { "name": "PROGRAMACIÓN II" },
                { "name": "BASE DE DATOS" },
                { "name": "PRÁCTICA PROFESIONALIZANTE I" }
            ]
        },
        {
            "name": "3er semestre",
            "course": [
                { "name": "INTERFAZ DE USUARIO" },
                { "name": "REDES" },
                { "name": "INGENIERÍA DE SOFTWARE" },
                { "name": "PROGRAMACIÓN III" },
                { "name": "VALIDACIÓN Y VERIFICACIÓN DE PROGRAMAS" },
                { "name": "ÉTICA Y DEONTOLOGÍA PROFESIONAL" },
                { "name": "PRÁCTICA PROFESIONALIZANTE" }
            ]
        }
    ]
}
```
Endpoint to UPDATE career (POST). 
Just put idCareer in the body of the request record to modify
``` bash
http://localhost:8080/api/careers/save
```
--- body ---
``` bash
{
    "idCareer": 12,
    "name": "Ingenieria en Sistemas modificadooo",
    "description": "Dura 3 años",
    "semester": [
        {
            "name": "1er semestre",
            "course": [
                { "name": "Matemática de ingenieria" },
                { "name": "Algebra" }
            ]
        },
        {
            "name": "2do semestre",
            "course": [
                { "name": "Matemática II" },
                { "name": "Algebra II" }
            ]
        },
        {
            "name": "3er semestre",
            "course": [
                { "name": "Matemática III" },
                { "name": "Algebra III" }
            ]
        }
    ]
}
```
Endpoint to DELETE career (DELETE)
``` bash
http://localhost:8080/api/careers/delete/1 ----> (career id)
```
