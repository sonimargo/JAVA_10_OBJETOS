package practica09;

import java.text.Normalizer;
import java.util.ArrayList;

public class Biblioteca 
{
	ArrayList<Libro> listaLibros;
	
	public Biblioteca() 
	{
		listaLibros = new ArrayList<Libro>();
	}

	
	public void addLibroAlistaLibros (Libro libroAagregar)
	{
		listaLibros.add(libroAagregar);
	}
	

	public void printLibros()
	{
		System.out.println("Biblioteca con los libros: " + "\n"  + 
				            getListaLibros());
	}
	

	// Usar metodo contains 
	public ArrayList<Libro> buscarPorTitulo(String tituloAbuscar) 
	{
		ArrayList<Libro> listaLibrosEncontradros = new ArrayList<Libro>();
		boolean libroExisteEnLaLista;
		tituloAbuscar = tituloAbuscar.toUpperCase();	
		
		// iterate the list of books and add all the matching books to the list found return found;		
		for(Libro libroEnLaLista :  this.listaLibros)
		{
			//libroEnLaLista.reemplazarCaractersEspeciales(libroEnLaLista.getTitulo());
			
			libroExisteEnLaLista = libroEnLaLista.getTitulo().toUpperCase().contains(tituloAbuscar) ;
			if (libroExisteEnLaLista)
				listaLibrosEncontradros.add(libroEnLaLista);			
		}
		
		return listaLibrosEncontradros;
	}

	
	public ArrayList<Libro> buscarPorEditor(String editorAbuscar) 
	{
		ArrayList<Libro> listaLibrosEncontradros = new ArrayList<Libro>();
		boolean editorExisteEnLaLista;
		editorAbuscar = editorAbuscar.toUpperCase();	
		
		
		// iterate the list of books and add all the matching books to the list found return found;		
		for(Libro libroEnLaLista :  this.listaLibros)
		{
			//libroEnLaLista.reemplazarCaractersEspeciales(libroEnLaLista.getTitulo());
			
			editorExisteEnLaLista = libroEnLaLista.getEditor().toUpperCase().contains(editorAbuscar) ;
			if (editorExisteEnLaLista)
				listaLibrosEncontradros.add(libroEnLaLista);			
		}
		
		return listaLibrosEncontradros;

	}
	
	
	public ArrayList<Libro> buscarPorAny(int anyoAbuscar) 
	{
		ArrayList<Libro> listaLibrosEncontradros = new ArrayList<Libro>();
		boolean anyoExisteEnLaLista;	
				
		// iterate the list of books and add all the matching books to the list found return found;		
		for(Libro libroEnLaLista :  this.listaLibros)
		{
			if (libroEnLaLista.getAny() == anyoAbuscar)
				listaLibrosEncontradros.add(libroEnLaLista);			
		}
		
		return listaLibrosEncontradros;
	}
	
	
	/// getters and setters
	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
}

