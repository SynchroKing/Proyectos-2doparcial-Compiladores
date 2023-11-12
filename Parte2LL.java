/**
 * Analiza una columna individual en la lista de columnas seleccionadas.
 * Esta funciÃ³n representa la producciÃ³n A en la gramÃ¡tica.
 */
private static void parseA() {
    // Verificar si hemos alcanzado el final de la entrada
    //Analiza una unica columna en la lista de columnas seleccionadas
    if (position == input.length()) {
        return;
    }
    // Llamar a la funciÃ³n parseA2
    parseA2();

    // Llamar a la funciÃ³n parseA1
    parseA1();
}

/**
 * Esta funciÃ³n representa la producciÃ³n A2 .
 * Analiza el identificador de la tabla en la consulta SQL y la parte de la consulta SQL que se 
 * refiere a la tabla de la columna seleccionada */
private static void parseA2() {
    // Verificar si hemos alcanzado el final de la entrada
    if (position == input.length()) {
        return;
    }

    // Verificar si el carÃ¡cter actual es una letra o un dÃ­gito
    if (Character.isLetter(input.charAt(position)) || Character.isDigit(input.charAt(position))) {
        position++; // Avanzar a la siguiente posiciÃ³n en la entrada
    }

    // Llamar a la funciÃ³n parseA3
    parseA3();
}

/**
 * Analiza la parte de la consulta SQL que se refiere a las columnas seleccionadas.
 * Esta funciÃ³n representa la producciÃ³n A3 */
private static void parseA3() {
    // Verificar si hemos alcanzado el final de la entrada
    if (position == input.length()) {
        return;
    }

    // Verificar si la entrada comienza con un punto (.) en la posiciÃ³n actual
    if (input.startsWith(".", position)) {
        position++; // Avanzar a la siguiente posiciÃ³n en la entrada
    }

    // Verificar si el carÃ¡cter actual es una letra o un dÃ­gito
    if (Character.isLetter(input.charAt(position)) || Character.isDigit(input.charAt(position))) {
        position++; // Avanzar a la siguiente posiciÃ³n en la entrada
    }
}

/**
 * Analiza la parte de la consulta SQL que se refiere a las columnas adicionales en la lista de columnas 
 * seleccionadas.
 * Esta funciÃ³n representa la producciÃ³n A1
 */
private static void parseA1() {
    // Verificar si hemos alcanzado el final de la entrada
    if (position == input.length()) {
        return;
    }

    // Verificar si la entrada comienza con una coma (,) en la posiciÃ³n actual
    if (input.startsWith(",", position)) {
        position++; // Avanzar a la siguiente posiciÃ³n en la entrada

        // Llamar a la funciÃ³n parseA para analizar columnas adicionales
        parseA();
    }
}
