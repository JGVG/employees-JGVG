# employees-JGVG
Gestor de empleados basado y programado en el framework SpringBoot (Java) y dockerizado en Docker (MySQL, API Rest y gestor web)

Para levantar el contenedor solo hace falta que tengas instalado docker, y en la raiz del proyecto ejecutar:
 - docker-compose up (con logs)
 - docker.compose up -d (sin logs)
   
ATENCION!!: la primera vez fallará porque no se habrá creado la base de datos para cuando la API lo solicite conexión con ella... ¡a la segunda va a la vencida!

El gestor se accede desde el puerto 8080 (Navegador web) -> http://localhost:8080/demo/v1/employees
La API se accede desde el puerto 8081 (Postman) -> http://localhost:8081/api/getAllEmployees
