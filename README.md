# Trivial
***
Tarea 13 destinada a poner en practica gran parte de lo aprendido en tareas anteriores.
## Explicacion ejercicios

## Ejercicio 1
***
He modificado el GameLauncher para que comience la partida solo si hay suficientes jugadores, y un test que comprueba el minimo de jugadores.

## Ejercicio 2
***
He hecho modificaciones muy parecidas a las del ejercicio 1 en el game launcher y he creado un nuevo test para el maximo de jugadores, ademas de modificar la clase Game, el metodo esJugable para que compruebe tambien el maximo de jugadores.

## Ejercicio 3
***
He hecho una unica modificacion en la clase game, en el metodo tirar dado, en el if que comprueba si el jugador esta en la casilla de castigo, y es que cuando salia un numero impar se ponia un mensaje de que el jugador estaba saliendo de la carcel, pero el codigo no modificaba el valor de que el jugador estaba en la carcer, asi que he hecho que si sale un numero impar esa variable sea false.