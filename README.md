ChessBoard JavaFX
Este proyecto es una aplicación simple de JavaFX que muestra un tablero de ajedrez de 1000x1000 con casillas rojas y azules alternas.

Requisitos
Java 8 o superior
JavaFX SDK
Instalación
Descargue e instale Java si aún no lo ha hecho. Puede descargarlo desde el sitio oficial de Oracle.

Descargue el JavaFX SDK desde el sitio oficial de OpenJFX. Asegúrese de descargar la versión que corresponda a su versión de Java.

Extraiga el archivo ZIP de JavaFX en un directorio de su elección.

Configuración del entorno
Para configurar JavaFX en su entorno de desarrollo, debe agregar el directorio lib del SDK de JavaFX a su variable de entorno PATH_TO_FX. Aquí hay un ejemplo de cómo hacerlo en Windows:

bash
set PATH_TO_FX="ruta\donde\extrajo\javafx-sdk\lib"
Y en Linux/Mac:

bash
export PATH_TO_FX=ruta/donde/extrajo/javafx-sdk/lib
Ejecución
Para ejecutar la aplicación, primero debe compilarla. Navegue hasta el directorio donde se encuentra el archivo ChessBoard.java y ejecute el siguiente comando:

bash
javac --module-path %PATH_TO_FX% --add-modules javafx.controls ChessBoard.java
Luego, puede ejecutar la aplicación con el siguiente comando:

bash
java --module-path %PATH_TO_FX% --add-modules javafx.controls ChessBoard
Esto abrirá una ventana con el tablero de ajedrez.
