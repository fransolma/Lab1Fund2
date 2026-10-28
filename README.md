# Sistema de Matrícula Universitaria

Proyecto final del curso **SOFT-306 - Fundamentos de Pruebas de Software 2**.

El proyecto implementa y verifica un sistema de matrícula universitaria utilizando
Java, Maven, JUnit 5 y JaCoCo. Incluye pruebas funcionales, análisis de valores
límite, pruebas de regresión y una mejora orientada a la claridad del resultado.

## Reglas funcionales

El sistema utiliza las siguientes reglas:

- R1: La edad mínima para matricularse es 17 años.
- R2: La cantidad de créditos debe estar entre 1 y 18.
- R3: El promedio mínimo requerido es 70.
- R4: Una mora activa implica el rechazo de la matrícula.
- R5: Si todas las condiciones anteriores son válidas, la matrícula es permitida.

## Tecnologías utilizadas

- Java
- Maven
- JUnit 5
- JaCoCo
- Git
- IntelliJ IDEA

## Estructura principal

```text
src/
├── main/
│   └── java/
│       └── org.example/
│           ├── Matricula.java
│           └── PruebasMatricula.java
│
└── test/
    └── java/
        └── org.example/
            ├── MatriculaTest.java
            └── MatriculaCalidadTest.java