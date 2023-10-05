# employees-JGVG
Gestor de empleados basado y programado en el framework SpringBoot (Java) y dockerizado en Docker (MySQL, API Rest y gestor web)

Para levantar el contenedor solo hace falta que tengas instalado docker, y en la raiz del proyecto ejecutar:
 - docker-compose up (con logs)
 - docker.compose up -d (sin logs)

Para actualizar los contenedores con nuevos cambios en las apps generar un nuevo .jar por cada proyecto actualizado y relanzar el "docker-compose.yml"
 - ./mvnw clean package -DskipTests (genera nuevo .jar)
 - docker-compose down (skipea y borra el contenedor)
 - docker-compose up (levanta el contenedor)

El gestor se accede desde el puerto 8080 (Navegador web) -> http://localhost:8080/demo/v1/employees
La API se accede desde el puerto 8081 (Postman) -> http://localhost:8081/api/getAllEmployees
