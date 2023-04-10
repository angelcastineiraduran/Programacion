# Explicacion

## Creacion de ficheros
Tenemos que utilizar la clase File ya que tiene un metodo llamado
`createNewFile` que genera un fichero en la path que queremos

```java
String nombreArchivo = "miArchivo.text";
String rutaArchivo = "/home/dam1/NetBeansProjects/programacion_2tri_v2/boletines/boletin27";
    
File archivo = new File(rutaArchivo,nombreArchivo); // creo objeto File
```

Una vez creado el fichero solo tenemos que invocar el metodo `createNewFile()`
teniendo cuidado de que puede lanzar una excepcion que hay que capturarla
