import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Comprueba si existe el indice introducido. Responde con los validos solo si no existe
     */
    public void checkIndex (int index){
        int sizeFiles = files.size();
        if (sizeFiles == 0){
            System.out.println("Lista de canciones vacia");
        }else if(index < 0 || index > (sizeFiles - 1)){
            System.out.println("El rango de indices valido es de 0 a " + (sizeFiles - 1));
        }
    }
    
    /**
     * Devuelve un boolean que indica la existencia del indice introducido
     */
    public boolean validIndex(int index){
        Boolean exist = true;
        if(index > (files.size() -1) || index < 0){
            exist = false;
        }
        return exist;
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
}
