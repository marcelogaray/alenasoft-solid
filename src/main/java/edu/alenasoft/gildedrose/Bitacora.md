#Code smells 

##GildRose class.

###Blocks and Indenting
```
No tiene una identacion apropiada, o standard.
```


###Classes Should Be Small, Long methods, Encapsulation: 

```
Codigo muy grande
Codigo duplicado
No existe encapsulacion
Todo esta en un solo metodo.
```

###One Level of Abstraction per Function, Methods too complex, Have No Side Effects,  Functions Should Do One Thing:
```
Mismo punto que arriba, al tener tanto codigo vuelve muy compleja la clase.
```

###Magic numbers, Use Pronounceable Names, Avoid Encodings, Hungarian Notation
```
Mezcla de símbolos y números mágicos. 
Muchos Ifs. 
No indican su significado semantico.
```

### Single responsability
```
Todo el calculo de la "actualizacion de cantidad" esta en Gilded Rose class
```

###OCP(Open/Closes Principle)
```
updateQuantity no permitir extender la funcionalidad de un nuevo Item 
sin tener que modificar la clase misma.
```


##Item class.

### Encapsulation:

```
Codigo muy grande
Codigo duplicado
No existe encapsulacion
Todo esta en un solo metodo.
```