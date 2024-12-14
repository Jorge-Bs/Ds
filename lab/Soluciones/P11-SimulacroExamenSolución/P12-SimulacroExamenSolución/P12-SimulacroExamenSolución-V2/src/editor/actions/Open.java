package editor.actions;

import editor.Document;
import files.FileManager;

public class Open implements Action
{
	private String filename;
	private FileManager fileManager;
	
	public Open(String filename, FileManager fileManager)
	{
		if (filename == null || filename.trim().length() == 0)
			throw new IllegalArgumentException("¡La acción de abrir un fichero necesita el nombre del fichero!");
		this.filename = filename;
		this.fileManager = fileManager;
	}
	
	@Override
	public void execute(Document document) {
		document.setText(fileManager.readFile(filename));
	}
	
	@Override
	public String toString()
	{
		return "Abrir " + filename;
	}
}
