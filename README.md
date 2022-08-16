# It Team `SpringOffers`

Este proyecto implementa la API para offertas implementando un CRUD para su funcionamiento.

## Demo en tiempo real

* La Aplicacion esta desplegada en heroku 

[https://back-spring-it-team.herokuapp.com/offers](https://back-spring-it-team.herokuapp.com/offers)

## Instalar local

### Requerimientos

* Dependencias de Spring, las puedes encontrar en Spring [Getting Started](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html)
* JDK 18 
* MySql 5.0 +
* IntelliJ IDEA Recomedado

### Configuracion 

* Inicializar Base de Datos `mysql -u username -p database_name < sql/initial_schema.sql`
* Editar el archivo de configuracion [src/main/resources/application.properties](src/main/resources/application.properties) con los datos respectivos 
* Instalar las dependencias con MAVEN

### Correr 

Ir al archivo [src/main/java/com/oscar/crudIt/CrudItApplication.java](src/main/java/com/oscar/crudIt/CrudItApplication.java)