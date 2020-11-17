package practica09;

public class Libro 
{
	String titulo;
	String editor;
	int any;
	
	public Libro(String titulo, String editor, int any) 
	{
		this.setTitulo(titulo);
		this.setEditor(editor);
		this.setAny(any);		
	}



	
	/////// getters and setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getAny() {
		return any;
	}

	public void setAny(int any) {
		this.any = any;
	}


	@Override
	public String toString() {
		return "\n  Titulo=" + titulo + ", Editor=" + editor + ", Año=" + any ;
	}
}


