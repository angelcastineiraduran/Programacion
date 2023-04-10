# Ejemplo Pildoras

> Todas las clases/metodos correspondientes al paquete io nos van a pedir que
capturemos respec errores pq una cosa que puede ocurir y que no depende de progra
madores es q xej alguien quite o mueva el fichero.

## Lectura

La clase InputStreamReader que extiende de Reader, lee los bytes y los decodifica
a los codigos correspondientes de los caracteres alfanumericos. En concreto la 
clase que vamos a utilizar, extiende de esta. mirar API

```java
 public String ruta = 
        "C:\\Users\\casty\\OneDrive\\Documentos\\NetBeansProjects\\programacion_2tri_v2\\teoria\\teoriaFicherosUndmy\\src\\ejemploPildoras\\ejemplo.txt";
```
 al copiar y pegar la ruta se me pone automaticamente con doble barra
 pq la barra inver en windows se considera como un carac de escape para carac especiales..

### Metodo leer fichero
abrimos un stream, nos comunicamos con el fichero). si no cerramos comunicacion el IDE nos avisara (pero no impedira ejecucion). Ademas si no ceramos = mayor consumo recursos:
```java
FileReader entrada = new FileReader(ruta);
```

De esta forma solo imprimiria el codigo en binario de los caracteres:

```java
c = entrada.read();
System.out.println(letra);
```

Por lo que tenemos que castear
```java
c = entrada.read();
char letra = (char)c; // casteamos
System.out.println(letra); // imprime: ola Mundo?
```
Tendriamos que modificarlo y este seria el resultado final:
```java
FileReader entrada = new FileReader(ruta);
int c = 0;
while(c != -1) {
    c = entrada.read();
    char letra = (char)c;
    System.out.print(letra);  // Hola Mundo?
}
```

Pero aun no esta cerrado el flujo de datos. hay que añadirlo fuera del `while`.
```java
// caso A
/* se podria poner el close en finally pero habria que hacer algunas mods. De todas formas nos daría error ya que el IDE nos obliga a poner close() en un try/catch */
try{
    FileReader entrada = new FileReader(ruta); 
    ...
    entrada.close();
} catch {
    ...
}
// caso B
/* este caso NO seria posible ya que el IDE obliga a tratar con try/catch esta
clase */ 
FileReader entrada = new FileReader(ruta); 
try{
    ...
} catch {
    ...
} finally {
    entrada.close(); // si hubieramos cerrado en try y este no se ejectura = abierto
}
```