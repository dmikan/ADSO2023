<?php

$calificacion = 85;


switch (true) {
    case ($calificacion >= 90 && $calificacion <= 100):
        echo "Excelente";
        break;
    case ($calificacion >= 75 && $calificacion < 90):
        echo "Bueno";
        break;
    case ($calificacion >= 50 && $calificacion < 75):
        echo "Regular";
        break;
    case ($calificacion >= 0 && $calificacion < 50):
        echo "Insuficiente";
        break;
    default:
        echo "Calificación no válida";
        break;
}
?>