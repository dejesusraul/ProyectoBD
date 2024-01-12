Estructura del Proyecto de Curso de Bases de Datos
La estructura del proyecto de base de datos está compuesta por cuatro paquetes 
En el paquete dto aparecen los objetos o clases que permiten realizar la transferencia 
de datos entre las capas de la aplicación. Estas clases son muy similares a las tablas 
de la base de datos, deben contener los atributos, que se corresponden con las 
columnas de la tabla, con sus respectivos métodos de acceso (get() y set()). Este 
enfoque responde al patrón DTO (Data Transfer Object). Esto significa que al presionar
en el ActionPerformed de un botón se invoca a un servicio y este recibe como 
parámetro un objeto DTO que se construye a partir de los campos de entrada de la 
vista. Las clases DTO deben contener al final el sufijo “DTO”, por ejemplo: UserDTO.
En el paquete services aparecen las clases que contienen la lógica de negocio de la 
aplicación. Es posible hacer una clase servicio por cada entidad o tabla de la base de 
datos. Cuando se cree una clase servicio el nombre de la misma debe terminar en 
Services, por ejemplo: xxxxServices.java. Dentro del paquete services debe aparecer 
una clase llamada “ServicesLocator.java” en la que están todas las instancias de los 
servicios de la aplicación, esto permite que desde las clases visuales solamente se 
cree una sola instancia a todos los servicios, precisamente a través de esta clase. Por 
tanto, en las clases visuales solamente se declara la instancia a la clase 
“ServicesLocator.java” y a través de esta se accede a todos los servicios.
En el paquete utils se encuentran diferentes clases que sirven de apoyo al desarrollo 
del proyecto. Un ejemplo de esto pudiera ser una clase “Conection.java” donde se 
define la conexión a la base de datos. 
El en paquete visual se ubican todas las clases correspondientes a la interfaz gráfica 
de usuario. Los componentes visuales deben mapear con las clases DTO.
Adicionalmente, cada equipo puede diseñar otros paquetes para dar respuesta a la 
problemática planteada, por ejemplo para los reportes o el tratamiento de excepciones.
NOTA: aclarar que desde la interfaz gráfica de usuario solamente se deben realizar las 
llamadas de los métodos que están en los servicios, no se deben realizar consultas 
desde estas.
