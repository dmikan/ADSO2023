## Variables Globales y Locales en C++

### Diferencia entre Variable Global y Variable Local

- **Variable Global:** Una variable global se declara fuera de todas las funciones en un programa. Es accesible desde cualquier parte del código. Sin embargo, su uso excesivo puede causar problemas de mantenimiento y depuración, ya que su modificación puede ser difícil de rastrear.

- **Variable Local:** Una variable local se declara dentro de una función o bloque de código específico. Solo es visible y accesible dentro de ese contexto. Esto ayuda a encapsular y modularizar el código.

### Programa sin Variables Globales

Es posible escribir programas sin utilizar variables globales. En su lugar, se pueden utilizar parámetros de función para pasar datos o valores de retorno para devolver resultados. Esto mejora la seguridad y estructura del código, evitando modificaciones no deseadas de variables.

### Programa sin Variables Locales

En la práctica, sería difícil escribir un programa sin variables locales. Estas son necesarias para almacenar datos temporales y resultados intermedios dentro de las funciones. Aunque se usen principalmente variables globales o se pasen parámetros, aún se necesitarán variables locales para cálculos y manipulaciones internas.