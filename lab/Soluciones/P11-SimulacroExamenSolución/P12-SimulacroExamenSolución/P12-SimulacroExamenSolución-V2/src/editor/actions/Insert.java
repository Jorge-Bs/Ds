package editor.actions;

import editor.Document;

public class Insert implements Action
{
	private StringBuilder text = new StringBuilder();
	
	public Insert(String[] words)
	{
		if (words == null || words.length == 0)
			throw new IllegalArgumentException("Se necesita al menos una palabra a insertar");
		for (String word : words) {
			text.append(word + " ");
		}
	}
	
	@Override
	public void execute(Document document) {
		document.insert(text.toString());
	}

	@Override
	public String toString()
	{
		return "Insertar " + text;
	}
}
