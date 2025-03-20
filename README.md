Implementa las siguientes pruebas en JUnit 5, asegurándote de que cada una cubra correctamente los casos especificados:

Parte 1

1.Depósito en la cuenta:

Verifica que al depositar dinero, el saldo aumenta correctamente.
2.Retiro de dinero:

Verifica que al retirar dinero, el saldo se reduce correctamente.
3.Fondos insuficientes:

Intenta retirar más dinero del disponible y verifica que se lanza una excepción con el mensaje "Fondos insuficientes".
4.Depósito negativo:

Intenta depositar un monto negativo y verifica que se lanza una excepción con el mensaje "El depósito debe ser mayor que 0".
5.Retiro negativo:

Intenta retirar un monto negativo y verifica que se lanza una excepción con el mensaje "El retiro debe ser mayor que 0".
6.Transferencia entre cuentas:

Simula una transferencia de dinero entre dos cuentas y verifica que los saldos se actualizan correctamente.
Aclaración:

Para la realización de las pruebas 1-5 realizar una cuenta que siempre que se inicie cada prueba el saldo de esa cuenta este a 100.
Para la prueba 6 son cuentas independientes.

Parte 2:

Realiza una modificación en el código que cuando se realice tanto un ingreso como un retiro se realice una comisión del importe del 3%.
Vuelve a lanzar las pruebas y comprar que siguen pasando los test.
