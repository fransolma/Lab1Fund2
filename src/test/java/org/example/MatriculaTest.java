package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatriculaTest {

    @Test
    void debePermitirMatriculaConDatosValidos() {

        assertEquals(
                "Matrícula permitida",
                Matricula.matricularEstudiante(25, 12, 85.0, false
                )
        );
    }

    @Test
    void debeRechazarEdadMenorDe17() {

        assertEquals(
                "Matrícula rechazada",
                Matricula.matricularEstudiante(16, 12, 85.0, false
                )
        );
    }

    @Test
    void debeRechazarCeroCreditos() {

        assertEquals(
                "Matrícula rechazada",
                Matricula.matricularEstudiante(25, 0, 85.0, false
                )
        );
    }

    @Test
    void debeRechazarMasDe18Creditos() {

        assertEquals(
                "Matrícula rechazada",
                Matricula.matricularEstudiante(25, 19, 85.0, false
                )
        );
    }

    @Test
    void debeRechazarPromedioMenorDe70() {

        assertEquals(
                "Matrícula rechazada",
                Matricula.matricularEstudiante(25, 12, 69.99, false
                )
        );
    }

    @Test
    void debeRechazarEstudianteConMora() {

        assertEquals(
                "Matrícula rechazada",
                Matricula.matricularEstudiante(25, 12, 85.0, true
                )
        );
    }


    @Test
    void edad16() {
        assertEquals(
                "Matrícula rechazada",
                Matricula.matricularEstudiante(16, 12, 85, false)
        );
    }

    @Test
    void edad17() {
        assertEquals(
                "Matrícula permitida",
                Matricula.matricularEstudiante(17, 12, 85, false)
        );
    }

    @Test
    void edad18() {
        assertEquals(
                "Matrícula permitida",
                Matricula.matricularEstudiante(18, 12, 85, false)
        );
    }
    //Valores límite de Créditos: 0, 1, 18 y 19

    @Test
    void creditos0() {
        assertEquals(
                "Matrícula rechazada",
                Matricula.matricularEstudiante(25, 0, 85, false)
        );
    }

    @Test
    void creditos1() {
        assertEquals(
                "Matrícula permitida",
                Matricula.matricularEstudiante(25, 1, 85, false)
        );
    }

    @Test
    void creditos18() {
        assertEquals(
                "Matrícula permitida",
                Matricula.matricularEstudiante(25, 18, 85, false)
        );
    }

    @Test
    void creditos19() {
        assertEquals(
                "Matrícula rechazada",
                Matricula.matricularEstudiante(25, 19, 85, false)
        );
    }

    //Valores límite del promedio: 69.99, 70 y 70.01
    @Test
    void promedio6999() {
        assertEquals(
                "Matrícula rechazada",
                Matricula.matricularEstudiante(25, 12, 69.99, false)
        );
    }

    @Test
    void promedio70() {
        assertEquals(
                "Matrícula permitida",
                Matricula.matricularEstudiante(25, 12, 70, false)
        );
    }

    @Test
    void promedio7001() {
        assertEquals(
                "Matrícula permitida",
                Matricula.matricularEstudiante(25, 12, 70.01, false)
        );
    }

}
