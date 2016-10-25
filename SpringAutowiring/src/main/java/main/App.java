package main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import beans.Carta;
import beans.Cuartilla;
import beans.Folio;
import beans.Papel;
import beans.Papiro;

public class App {

	public static void main(String[] args) {
		// Obtenemos el bean container indicando el xml donde estan definidos los beans
		// Como está en la raiz del workspace, podemos poner directamente el nombre del archivo usando
		// FileSystemXmlApplicationContext		
		// ApplicationContext  context = new FileSystemXmlApplicationContext("beans.xml");
		
		// Normalmente, como suele haber muchos archivos xml en una aplicacion, se suelen poner carpetas.
		// Podemos indicar la ruta, partiendo del paquete donde se encuentre el archivo
		// ApplicationContext  context = new FileSystemXmlApplicationContext("src/main/java/com/spring/section1/xml/beans.xml");
		
		// Tambien se puede definir el applicationcontext de forma que busque dentro de classpath del proyecto
		// Haciendolo así, podemos indicar la ruta partiendo del paquete en el que se encuentra xml, que puede ser cualquier
		// ruta dentro del classpath
		ApplicationContext  context1 = new ClassPathXmlApplicationContext("/xml/beanspapel.xml");
		ApplicationContext  context2 = new ClassPathXmlApplicationContext("/xml/beanscarta.xml");
		ApplicationContext  context3 = new ClassPathXmlApplicationContext("/xml/beansfolio.xml");
		ApplicationContext  context4 = new ClassPathXmlApplicationContext("/xml/beanscuartilla.xml");
		
		// Instanciamos un objeto Person desde el bean container
		// Autowire por clase
		Papel papel = (Papel)context1.getBean("papel");
		System.out.println(papel);
		
		// Autowire por tipo
		Carta carta = (Carta)context2.getBean("carta");
		System.out.println(carta);
		
		// Autowire por constructor
		Papiro papiro = (Papiro)context1.getBean("papiro");
		System.out.println(papiro);
		
		// Autowire default autowire candidate 
		Folio folio = (Folio)context3.getBean("folio");
		System.out.println(folio);
		
		// Autowire default autowire candidate 
		Cuartilla cuartilla = (Cuartilla)context4.getBean("cuartilla");
		System.out.println(cuartilla);
		
		// Cerramos el applicationcontext para evitar el warning
		// No sería necesario porque se hace por defecto
		
		//((FileSystemXmlApplicationContext)context).close();
		((ClassPathXmlApplicationContext)context1).close();
		((ClassPathXmlApplicationContext)context2).close();
		((ClassPathXmlApplicationContext)context3).close();
		((ClassPathXmlApplicationContext)context4).close();
	}

}
