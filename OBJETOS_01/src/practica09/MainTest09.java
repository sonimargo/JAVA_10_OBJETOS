package practica09;

import java.util.ArrayList;

public class MainTest09 {

	public static void main(String[] args) 
	{
		
		Libro libroAccion, libroClasico, libroClasico2, libroNovela, libroNovela2, libroNovela3, libroNovela4;
		Biblioteca biblioteca;
		
		libroAccion = new Libro("El Galeon","Sint Maarten",2020);
		biblioteca = new Biblioteca();		
		
		System.out.println("\n**** TEST Impresion *********************");
		System.out.println(libroAccion.getTitulo() );
		System.out.println(libroAccion.getEditor());
		System.out.println(libroAccion.getAny());
		
		System.out.println(libroAccion);
		
		// test biblioteca
		System.out.println("\n*******************************************");
		libroClasico = new Libro("El conde Lucanor","Juan Manuel",1338);
		libroClasico2 = new Libro("Libro del caballero y el escudero","Juan Manuel",1335);		 
		libroNovela = new Libro("El origen de los sueños","María Serrano",2019);
		libroNovela2 = new Libro("Misión Olvido","María Dueñas",2012);
		libroNovela3 = new Libro("El alquimista","Ben Jonson",1983);
		libroNovela4 = new Libro("El alquimista","Paulo Coelho",2019);		
		
		// Llenar lista de libros
		biblioteca.addLibroAlistaLibros(libroAccion);
		biblioteca.addLibroAlistaLibros(libroClasico);
		biblioteca.addLibroAlistaLibros(libroClasico2);
		biblioteca.addLibroAlistaLibros(libroNovela);
		biblioteca.addLibroAlistaLibros(libroNovela2);
		biblioteca.addLibroAlistaLibros(libroNovela3);
		biblioteca.addLibroAlistaLibros(libroNovela4);
		
		biblioteca.printLibros();
		
		// test buscar por titulo
		String titolOrEditor = "alquimista"; 
		System.out.println("\n**** TEST Buscar por titulo *********************" + titolOrEditor);
		ArrayList<Libro> listaLibrosBuscarTitulo = new ArrayList<Libro>();
		
		listaLibrosBuscarTitulo = biblioteca.buscarPorTitulo(titolOrEditor);		
		System.out.println(listaLibrosBuscarTitulo);
		
		// test buscar por editor
		titolOrEditor = "María";
		System.out.println("\n**** TEST Buscar por editor *********************" + titolOrEditor);
		ArrayList<Libro> listaLibrosBuscarEditor = new ArrayList<Libro>();
		
		listaLibrosBuscarEditor = biblioteca.buscarPorEditor(titolOrEditor);		
		System.out.println(listaLibrosBuscarEditor);
		

		// test buscar por año
		System.out.println("\n**** TEST Buscar por añor *********************" + titolOrEditor);
		ArrayList<Libro> listaLibrosBuscarAnyo = new ArrayList<Libro>();
		
		listaLibrosBuscarAnyo = biblioteca.buscarPorAny(2019);		
		System.out.println(listaLibrosBuscarAnyo);

		
		// Eliminar acentos
		System.out.print("\n**** TEST Reemplazar acentos del texto: ");
		String textoReemplazarCaracteres = "María"; 
		System.out.println(textoReemplazarCaracteres);
		System.out.println("***** Reemplazados acentos: " + Utilidades.eliminarAcentos(textoReemplazarCaracteres));
		
	}

}


