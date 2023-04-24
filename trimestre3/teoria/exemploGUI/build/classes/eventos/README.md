# Eventos 17/04

## Evento mesma clase

1. Implementamos la interfaz

public class EventoMesmaClase implements ActionListener{

2. Lo asociamos con el this

```java
bCopiar.addActionListener(this); // na mesma clase
```

3. definimos `actionPerformed()`

## Evento clase interna

```java
bCopiar.addActionListener(new Interna());
bSair.addActionListener(new Interna());
```
Porque es posible utilizar el metodo addActionListener() si la clase no extiende 
de `ActionListener`?

Porque `addActionListener()` es una caracteristica del objeto boton ('bCopiar', 'bSair')
y no de esa interfaz.

## Evento clase anonima

En Java, una clase anónima es una clase que se define sin nombre y que se utiliza 
para implementar una interfaz o una clase abstracta de manera temporal y específica. 
En otras palabras, es una forma de crear una clase que solo se utiliza una vez, 
sin necesidad de definirla en otro lugar.

Una clase anónima se compone de dos partes:

1. La declaración de la clase: se define la clase anónima utilizando 
la sintaxis new Interfaz() o new ClaseAbstracta(){}. 
Esta declaración incluye la implementación de los métodos de la interfaz o de la clase abstracta.

2. La definición de los métodos: se definen los métodos necesarios 
para implementar la interfaz o la clase abstracta. Estos métodos son implementados 
dentro de la declaración de la clase anónima.

En el codigo de se utilizan dos clases anónimas para implementar la interfaz ActionListener 
y definir el comportamiento de los botones bCopiar y bSair. 
La implementación de la interfaz ActionListener se realiza en la declaración de la clase anónima, 
y se definen los métodos actionPerformed() para cada botón.
