/**
 * Analiza una columna individual en la lista de columnas seleccionadas.
 * Esta función representa la producción A en la gramática.
 */
private static void parseA() {
    // Verificar si hemos alcanzado el final de la entrada
    //Analiza una unica columna en la lista de columnas seleccionadas
    if (position == input.length()) {
        return;
    }
    // Llamar a la función parseA2
    parseA2();

    // Llamar a la función parseA1
    parseA1();
}

/**
 * Esta función representa la producción A2 .
 * Analiza el identificador de la tabla en la consulta SQL y la parte de la consulta SQL que se 
 * refiere a la tabla de la columna seleccionada */
private static void parseA2() {
    // Verificar si hemos alcanzado el final de la entrada
    if (position == input.length()) {
        return;
    }

    // Verificar si el carácter actual es una letra o un dígito
    if (Character.isLetter(input.charAt(position)) || Character.isDigit(input.charAt(position))) {
        position++; // Avanzar a la siguiente posición en la entrada
    }

    // Llamar a la función parseA3
    parseA3();
}

/**
 * Analiza la parte de la consulta SQL que se refiere a las columnas seleccionadas.
 * Esta función representa la producción A3 */
private static void parseA3() {
    // Verificar si hemos alcanzado el final de la entrada
    if (position == input.length()) {
        return;
    }

    // Verificar si la entrada comienza con un punto (.) en la posición actual
    if (input.startsWith(".", position)) {
        position++; // Avanzar a la siguiente posición en la entrada
    }

    // Verificar si el carácter actual es una letra o un dígito
    if (Character.isLetter(input.charAt(position)) || Character.isDigit(input.charAt(position))) {
        position++; // Avanzar a la siguiente posición en la entrada
    }
}

/**
 * Analiza la parte de la consulta SQL que se refiere a las columnas adicionales en la lista de columnas 
 * seleccionadas.
 * Esta función representa la producción A1
 */
private static void parseA1() {
    // Verificar si hemos alcanzado el final de la entrada
    if (position == input.length()) {
        return;
    }

    // Verificar si la entrada comienza con una coma (,) en la posición actual
    if (input.startsWith(",", position)) {
        position++; // Avanzar a la siguiente posición en la entrada

        // Llamar a la función parseA para analizar columnas adicionales
        parseA();
    }
}