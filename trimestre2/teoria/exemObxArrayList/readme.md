## Comparar, ordenar
Collection.sort(lista) lo que me va a hacer el ordenar.
si le doy una colleccion de numeros o strings lo sabe ordenar,
pero si le mando una lista de xogadores no sabe que criterio seguir

Primero tengo que declarar el atributo dorsal y la interfaz _Comparable_ 
```java
public class Xogador implements Comparable{
```
En la clase _Xogador_
Estoy sobreescribiendo el metodo para que me ordene por dorsal y que me siga ese criterio,
le tengo que decir como ordenar.

```java
@Override
public int compareTo(Object o) { //recibe un obj y me interesa pasarlo a la clase Xogador
        Xogador x = (Xogador)o; //hago un cast
        if(this.dorsal > x.dorsal)
            return 1;
        else if (this.dorsal < x.dorsal)
            return -1;
        else
            return 0;
    }
```
Despues, con el `sort` va a buscar este metodo.

### Ordenamos por nombre
```java
@Override
    public int compareTo(Object o) {
        Xogador x = (Xogador)o; // casteamos
        if (this.nome.compareToIgnoreCase(x.nome) > 0) 
            return 1;
        else if (this.nome.compareToIgnoreCase(x.nome) < 0)
            return -1;
        else
            return 0;
    }
```
El this.nome es el nombre de la lista.
el x.nome es 

El metodo `compareTo` debe devolver un número negativo, 0, o un número positivo en función de que el objeto que comparemos con el objeto “o” de referencia sea menor, igual o mayor respectivamente que ese objeto de referencia.

Cuando queremos ordenar por tipo Float el sort ya sabe que tipo es y lo sabe ordenar,
pero si el tipo lo creamos nosotros, java no sabe lo que es y lo que tenemos dentro de la clase.
Por tanto con ` if (this.nome.compareToIgnoreCase(x.nome) > 0) ` le estmos diciendo que es lo que tiene que comparar
