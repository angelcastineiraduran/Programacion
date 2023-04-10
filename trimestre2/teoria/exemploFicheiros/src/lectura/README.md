# Delimitador

El delimitador se utiliza para separar las palabras del archivo. 
Es decir, cuando el objeto Scanner lee el archivo, utiliza el delimitador para 
determinar dónde comienza y termina cada palabra.

Por ejemplo, si el delimitador es una coma (","), y el archivo contiene la siguiente línea:
```java
hola, como estas, bien gracias
```
El objeto Scanner utilizará la coma como delimitador, por lo que considerará "hola" como una palabra, 
"como estas" como otra palabra, "bien gracias" como otra palabra, y así sucesivamente.

El delimitador también puede incluir cualquier cantidad de espacios en blanco, 
como se muestra en el código que proporcionaste:
```java
sc = new Scanner(ficheiro).useDelimiter("\\s*" + del + "\\s*");
```

Aquí, se utiliza la cadena \\s* para indicar cualquier cantidad de espacios en 
blanco antes y después del delimitador. Esto significa que, en el ejemplo anterior,
el objeto Scanner también ignoraría cualquier espacio en blanco antes o después de la coma.
>con coble back slash por el tema del escape en windows!=linux

En resumen, el delimitador se utiliza para determinar cómo se deben separar las 
palabras en el archivo, y se puede personalizar según el formato del archivo que se esté leyendo.

# Metodo lerPalabras

Esta expresión regular indica al objeto Scanner que debe buscar cualquier 
cantidad de espacios en blanco (cero o más) seguidos por el delimitador(`del`), 
y luego cualquier cantidad de espacios en blanco adicionales (también cero o más), 
para identificar cada palabra en el archivo.
```java
sc = new Scanner(ficheiro).useDelimiter("\\s*" + del + "\\s*");
```

Por lo tanto, cada vez que se llama al método next() en el bucle while, 
el objeto Scanner lee la próxima palabra del archivo y utiliza el delimitador
 para separarla de las palabras anteriores y posteriores.
```java
while(sc.hasNext()){
    String dato = sc.nextLine();
    System.out.println(dato);
}
```


Además, si no se cierra el Scanner, es posible que no se escriban todos los datos 
del archivo en la salida, ya que algunos datos pueden almacenarse en un búfer
 interno del Scanner y no se escribirán en la salida hasta que se cierre el objeto Scanner:

````java
finally{
    sc.close();
        }
````
*mejor cerrarlo en el finllay para que pase lo que pase se cirre el obj Scanner

> Recordar: contenido fiche:
> un
> dous, dous
> tres, tres,tres
> catro,catro ,catro,catro

Lo que imprime:
````java
`obx.lerPalabras(f,",");
/* imprime:
un
dous
dous
tres
tres
tres
catro
catro
catro
catro
BUILD ...
*/
````
hay un enter entre uno y dous pq en el fichero tengo un enter creo, ya que los 
enter NO los ignora (los espacios en blanco si ya que lo especificamos con \\s*

Cada vez que hay una coma, considera que es una palabra

De esta forma los espcacios en blanco NO los ignora y los imprime tambien
````java
sc = new Scanner(ficheiro).useDelimiter(del); // prueba
/*
un
dous
 dous
tres
 tres
tres
catro
catro 
catro
catro
*/
````

# Leer objeto
````java
ArrayList<Alumno> lista = new ArrayList();
String []aux = new String[2]; // tendra solo 2 posiciones: 0 y 1
try{
    sc = new Scanner(ficheiro);
    while(sc.hasNextLine()){
        aux = sc.nextLine().split(", ");
        lista.add(new Alumno(aux[0], Integer.parseInt(aux[1])));
    }
}
````java
````

1. Mientras haya lineas develve true
````java
    while(sc.hasNextLine()){
````
2. Lee la siguiente linea y divide la matriz en una String segun el tipo de delimitacion
Cada vez que encuentra ", " delimita, por lo que la matriz "aux" solo tendra 2 posiciones
````java
    aux = sc.nextLine().split(", ");
````
El caracter ", " NO se considera como valor del elemento. Entonces pq se imprime???:
````
aa, 5
bb, 6
cc, 7
ee, 8
````

Porque luego imprimira el objecto y utilizando el toString de la clase Alumno
````java
@Override
public String toString() {
    return nome + ", " + nota;
}
````

3. Almacenamos en la arrayList `lista` los objectos `Alumno`
se van pasando los parametros de la **array** `aux` conforme se leen

se pasaran tantos objetos como lineas ya no??
```java
lista.add(new Alumno(aux[0], Integer.parseInt(aux[1])));
```
lista.add para agregar objetos "Alumno" 
a ArrayList "lista"
