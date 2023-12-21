# employees-JGVG

> [!NOTE]
> El objetivo de este proyecto es crear un front y un back usando SpringBoot para mostrar, editar, añadir y borrar empleados.
> El proyecto actualmente dispone de tres paginas:
> - Una lista de empleados y se muestran en una tabla.
> - Un formulario para añadir un empleado.
> - Un formulario para editar un empleado.

# Instalación

Para levantar el contenedor solo hace falta que tengas instalado docker, y en la raiz del proyecto ejecutar:

```js
docker.compose up -d
```
   
> [!WARNING]
> La primera vez fallará porque no se habrá creado la base de datos para cuando la API solicite conexión... ¡a la segunda va a la vencida!

El gestor se accede desde el puerto 8080 (Navegador web) -> http://localhost:8080/demo/v1/employees
La API se accede desde el puerto 8081 (Postman) -> http://localhost:8081/api/getAllEmployees

> [!TIP]
> Es recomendable tener instalado Postman, un software que tiene el proposito de falicitar el visionado respuestas de peticiones http -> https://www.postman.com/downloads/ pero también podemos usar nuestro navegador para el visualizado del json de respuesta.
> 
>![image](https://github.com/JGVG/prueba_tnight_php/assets/37996973/4176f1fb-cad0-4a1f-b3dd-45ed3fd83fad)


# Listado de empleados

![image](https://github.com/JGVG/employees-JGVG/assets/37996973/361135e9-a887-4725-86bf-0968372390b1)

# Añadir un empleado

![image](https://github.com/JGVG/employees-JGVG/assets/37996973/dff57d67-00f7-44e9-9dcf-cd64c9d9d2cd)

# Borrado de un empleado

![image](https://github.com/JGVG/employees-JGVG/assets/37996973/7e1c3595-447d-4638-b0d1-3bdc4d864a4c)
