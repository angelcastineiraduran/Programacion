# Eventos 17/04

## Evento mesma clase

1. Implementamos la interfaz

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
