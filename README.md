# Trivial
***
Tarea 13 destinada a poner en practica gran parte de lo aprendido en tareas anteriores.
## Explicacion ejercicios

## Ejercicio 1
***
He modificado el GameLauncher para que comience la partida solo si hay suficientes jugadores, y un test que comprueba el minimo de jugadores.

## Ejercicio 2
***
He hecho modificaciones muy parecidas a las del ejercicio 1 en el game launcher y he creado un nuevo test para el maximo de jugadores, ademas de modificar la clase Game, el metodo esJugable para que compruebe tambien el maximo de jugadores. Se ha corregido el error.

## Ejercicio 3
***
He hecho una unica modificacion en la clase game, en el metodo tirar dado, en el if que comprueba si el jugador esta en la casilla de castigo, y es que cuando salia un numero impar se ponia un mensaje de que el jugador estaba saliendo de la carcel, pero el codigo no modificaba el valor de que el jugador estaba en la carcer, asi que he hecho que si sale un numero impar esa variable sea false.
## Ejercicio 4
***
He realizado una modificación en GameLauncher para invertir los datos de noGanador a ganador e inicializarlo en false. En la clase game he modificado el método respuestaIncorrecta para que devuelva false en vez de true. Por último en el método jugadorHaGanado he invertido el return(quitando la exclamación) de tal forma que devuelve que el jugador ha ganado 6 monedas.
## Ejercicio 5
***
He realizado una refactorización para extraer el código y generar un método al que se pueda llamar sin repetir líneas de código.
## Ejercicio 6
***
He realizado una refactorización para extraer el código que se repite y generar un método. Creamos un booleano y lo igualamos a este método creado para devolverlo y no generar tanta línea de código.