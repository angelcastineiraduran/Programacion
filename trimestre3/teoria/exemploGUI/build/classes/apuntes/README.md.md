# Eventos

```java
    public MiPanel() {
        boton = new JButton("Azul");
        this.add(boton);
        
        boton.addActionListener(this);

    public void actionPerformed(ActionEvent e) {
    }
}
```

Al ser un tipo de evento de tipo click del ratón el "action performed" utilizado 
será addActionListener(this) y por tanto el tipo de objeto que tendrá el metodo
actionPerformed() será de tipo ActionEvent. Es un evento de tipo **action**

Si el tipo de interacion fuera de ventana, el tipo de evento sería **window**
un objeto de tipo WindowEvent

Nombrardos a estos objetos por convencion como "e"


## Estructura evento
1. Identificar tipo de Objeto evento

en este caso sería de tipo Action

2. Identificar objeto fuente

Que objeto es el que desencadena el evento?

En este caso el boton

3. Objeto que recibe el objeto, el ActionListener

Se indica siempre dentro del metodo `addActionListener()` 
