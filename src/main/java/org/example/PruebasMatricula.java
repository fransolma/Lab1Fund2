package org.example;
public class PruebasMatricula {
    public static void main(String[] args) {

        probarCaso(
                "CP-01",
                25,
                12,
                85.0,
                false,
                "Matrícula permitida"
        );

        probarCaso(
                "CP-02",
                16,
                12,
                85.0,
                false,
                "Matrícula rechazada"
        );

        probarCaso(
                "CP-03",
                21,
                0,
                75.0,
                false,
                "Matrícula rechazada"
        );

        probarCaso(
                "CP-04",
                35,
                19,
                90.0,
                false,
                "Matrícula rechazada"
        );

        probarCaso(
                "CP-05",
                21,
                5,
                71.0,
                true,
                "Matrícula rechazada"
        );

        probarCaso(
                "CP-06",
                22,
                4,
                70.0,
                false,
                "Matrícula permitida"
        );
    }

    public static void probarCaso(
            String id,
            int edad,
            int creditos,
            double promedio,
            boolean tieneMora,
            String resultadoEsperado) {

        String resultadoObtenido =
                Matricula.matricularEstudiante(
                        edad,
                        creditos,
                        promedio,
                        tieneMora
                );

        System.out.println("Caso: " + id);
        System.out.println("Resultado esperado: "
                + resultadoEsperado);
        System.out.println("Resultado obtenido: "
                + resultadoObtenido);

        if (resultadoEsperado.equals(resultadoObtenido)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println();
    }

}