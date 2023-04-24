# EXEMPLO GUI

## 1. ventanas

```java
setVisible(true) // hace que sea visible esa ventana
```

Si no añadimos esto, al cerrar la ventana, se seguira ejecutando:

```java
marco.setDefaultCloseOperation(0) // el 0 no hace nada
marco.setDefaultCloseOperation(3) // el 3 pararia ejecucion
```
JFrame.EXIT_ON_CLOSE // corresponde al numero 3.

* Ventana2 creo que es otra forma de crear una GUI, extendiendo de JFrame?¿

## 2. layouts

distribuidorLayout()
1. Creamos panel y elementos del panel. 
2. Añadimos el panel al marco y los elementos al panel
3. Añadimos las lineas "importantes" mencionadas arriba, cerramos correctamente



_BorderLayout_

si borramos uno, se amplia el espacio del otro o los otros y desaparece el que borramos

```java
    public void distribucionBorderLayout(){
        iniciarComponentes();
        panel.setLayout(new BorderLayout());
        //panel.add(boton1, BorderLayout.NORTH);// se borra este y se expanden los otros
        panel.add(boton2, BorderLayout.SOUTH);
        panel.add(boton3, BorderLayout.CENTER);
        panel.add(boton4,  BorderLayout.EAST);
        panel.add(boton5,  BorderLayout.WEST);
        marco.add(panel);
        pecharVentana();
    }
```

## 3. componentes

setBounds() // dd lo sustitiye y con que tamaño (largo y ancho)

## 4. eventos

añadimos acciones a los botones
