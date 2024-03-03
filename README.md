#Microservicio de descuento en Spring Boot
Introducción
Está implementando un microservicio en Spring Boot. El microservicio es responsable de proporcionar descuentos actuales para otros componentes de un sistema de compras. Los descuentos se proporcionan a través de un punto final REST configurado en un archivo .

Planteamiento del problema
Cambie el , para que el descuento se tome de una propiedad 'descuento' configurada en application.properties.

Cree un perfil llamado "gran descuento" y establezca su valor de descuento en "11,56".

Agregue las dependencias correctas en 'build.gradle' para habilitar el módulo Actuator.

Configure el módulo Actuator para exponer sus puntos finales en la siguiente ruta: /monitoring.
