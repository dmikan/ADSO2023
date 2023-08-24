## Paso de Parámetros por Valor y por Referencia en C++

### Diferencia Principal entre Paso por Valor y Paso por Referencia

La principal diferencia entre el paso de parámetros por valor y por referencia radica en cómo se manejan y modifican los valores de los parámetros dentro de una función:

- **Paso por Valor:** Al pasar un parámetro por valor a una función, se crea una copia local de la variable original en la función. Las modificaciones realizadas en la copia local no afectarán la variable original fuera de la función. El valor original permanece inalterado.

- **Paso por Referencia:** Al pasar un parámetro por referencia, se pasa la dirección de memoria de la variable original. Esto significa que la función trabaja directamente con la variable original, y los cambios realizados dentro de la función se reflejarán en la variable original.

### Relevancia del Paso de Parámetros por Referencia

La posibilidad de pasar parámetros por referencia en una función es de gran relevancia en muchos escenarios. Aunque el paso de parámetros por valor puede ser útil en algunas situaciones, el paso por referencia ofrece varias ventajas:

1. **Eficiencia:** Al pasar un parámetro por valor, se crea una copia del valor en memoria, lo que puede ser costoso en términos de rendimiento y uso de memoria, especialmente para objetos grandes. Con el paso por referencia, se evita la copia innecesaria y se mejora la eficiencia.

2. **Modificación de Parámetros:** En muchas ocasiones, es necesario modificar los valores de los parámetros dentro de una función y reflejar esos cambios fuera de ella. Esto solo es posible con el paso por referencia, ya que el paso por valor solo afecta la copia local de la función.

3. **Cambios Globales:** Si se desea cambiar una variable global dentro de una función, es necesario pasarla por referencia.

4. **Trabajo con Objetos:** En la programación orientada a objetos, el paso por referencia permite trabajar con objetos sin hacer copias innecesarias, lo que es esencial para el rendimiento y la coherencia.

5. **Optimización de Memoria:** En situaciones donde la memoria es limitada, el paso por referencia ayuda a evitar la duplicación de datos.
