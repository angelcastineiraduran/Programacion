# FileWriter

Si encuentra fichero sobreescribe, si no encuentra lo crea
````java
ou = new FileWriter(ficheiro);
ou.write("buenas dias");
````
Mediante el metodo FIleWriter podriamos perfectamete escribir en el arhivo.
Si hacemos esto debemos cerrar el flujo en el try o agrgar un try/catch en el 
finally ya que este metodo lanza una excepcion:
````java
try {
            ou = new FileWriter(ficheiro);
            ou.write("buenas dias");
            //fich = new PrintWriter(ou);

//            fich.println("lun++++s"); // escribo
//            fich.println("maertes");
//            fich.println("mercoles");
            ou.close(); // **cerramos flujo**

        }
````

Sin embargo la clase PrintWriter nos da metodos mas optimizados y completos
para hacer esto. 

> Recordar que independientemente de  utilizar un metodo u otro, si no cerramos
el flujo, no se escribira nada en el fichero

# Añadir cadenas, no sobreescribir
**Recordar que el `true` va en el FileWriter y NO en el PrintWriter**
```java
ou = new FileWriter(ficheiro, true);
fich = new PrintWriter(ou);
```


# Posible problema

cd abro el fluxo en modo escribtura abro el fichero.
Despues escribo (como si fuera en una libreta en varias paginas).

Pero si lo vuelvo a a abrir se me vuelve a abrir por
el principio, para que se me abra en dd lo habia dejado:
tengo que hacer un proceso que a eso se le llama engadir cosas al ficheiro.

Para ello tengo que añadir una clase que me permita engadir.
Clase FileWriter (file nome)

-------

Si utilizo PrintWriter siempre debo utilizar los complementarios
