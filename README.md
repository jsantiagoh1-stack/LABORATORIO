# LABORATORIO
### ¿Qué partes del código pueden convertirse en métodos?

El programa ya tiene varios métodos, pero se pueden identificar claramente responsabilidades separadas como:

* Mostrar el menú.

* Leer opción del usuario.

* Agregar estudiante.

* Mostrar estudiantes.

* Calcular promedio.

* Mostrar mejor estudiante.

* Validar entrada numérica.

Cada una de estas acciones cumple una función específica y puede mantenerse como método independiente.

### ¿Qué bloques de código se repiten?

Lectura de datos usando scanner.nextLine().

Validaciones con try-catch.

Verificación de listas vacías.

Recorridos con estructuras for.

Estos bloques pueden centralizarse en métodos auxiliares para evitar repetición.

### ¿Qué responsabilidades pueden separarse?

Entrada de datos.

Validación de datos.

Procesamiento (cálculos).

Mostrar resultados.

Separar estas responsabilidades hace que el código sea más organizado.

### ¿Por qué dividir estas tareas mejora el programa?

Dividir el código en métodos mejora:

La organización.

La claridad.

El mantenimiento.

La reutilización de código.

La facilidad para detectar errores.

Además, permite que cada método tenga una sola responsabilidad, lo cual es una buena práctica en programación.

# Variables Locales vs Globales

### ¿Qué variables deberían ser globales?

En este programa:

static List<String> estudiantes
static List<Double> calificaciones
static Scanner scanner

Estas deben ser globales porque:
Se usan en varios métodos.
Representan los datos principales del programa.
Todos los métodos necesitan acceder a ellas.

### ¿Cuáles deberían ser locales?

Variables como:
opcion
numero
nota
suma
promedio
mayor
nombreMayor
i (contador)

Estas deben ser locales porque:
Solo se usan dentro de un método.
No necesitan ser compartidas.
Reducen el riesgo de errores.
Reflexión

* Alcance (scope)
Las variables locales solo existen dentro del método donde se declaran, lo que reduce errores accidentales.

* Tiempo de vida
Las variables locales desaparecen cuando termina el método.
Las globales permanecen durante toda la ejecución del programa.

* Riesgos de modificar datos globales
Si muchas partes del código modifican una variable global, pueden ocurrir errores inesperados y es más difícil depurar.

# VALIDACIONES Y MANEJO DE EXCEPCIONES
### ¿Qué errores podrían ocurrir?

* Que el usuario ingrese texto en vez de número.

* Que la calificación esté fuera del rango 0–100.

* Que se intente calcular promedio sin estudiantes.

* Que el programa falle por un NumberFormatException.

* ¿Qué validaciones se implementaron?

* Uso de try-catch al convertir números.

* Validación de rango para calificaciones.

* Verificación de listas vacías antes de calcular promedio o buscar el mejor estudiante.

* Mensajes claros cuando ocurre un error.

### ¿Por qué son importantes?

Evitan que el programa se cierre inesperadamente.

Mejoran la experiencia del usuario.

Hacen el sistema más seguro.

Previenen errores lógicos como división entre cero.

# PREGUNTAS DE REFLEXIÓN
### ¿Qué ventajas tiene dividir el código en métodos?

Dividir el código permite:

* Mejor organización.

* Código más limpio.

* Mayor claridad.

* Reutilización de funciones.

* Mantenimiento más sencillo.

También facilita el trabajo en equipo porque cada persona puede trabajar en un método diferente.

### ¿Por qué no es recomendable usar muchas variables globales?

Porque:

Pueden modificarse desde cualquier parte del programa.

Generan errores difíciles de detectar.

Crean dependencia entre métodos.

Hacen el código menos seguro.

Mientras menos variables globales se usen, mejor control tendrá el programa.

### ¿Cómo mejora la modularización la legibilidad del código?

La modularización mejora la legibilidad porque:

Divide el problema en partes pequeñas.

Permite entender qué hace cada método.

Hace el código más ordenado.

Reduce la complejidad visual.

Un programa modular es más profesional y más fácil de entender.

