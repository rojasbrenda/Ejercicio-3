package Clases;

import javax.swing.JOptionPane;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brenda R
 */
public class ClaseConjuntodeLibros {
   
    ClaseLibro[] libros= new ClaseLibro[5];

    public ClaseLibro[] getLibros() {
        return libros;
    }
    
   public void añadir(ClaseLibro libro){
       try {
         for (int i = 0; i < 4 ; i++) {
             if (libros[i]== null) {
              libros[i]=libro;
              break;
             }
                         
    
       }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "No se podido añadir el libro " + e);
       }
      
       
   }
          
    
  public void eliminarLibro(String nombre){
      try {
           for (int i = 0; i < 4; i++) {
          if (libros[i].titulo== nombre || libros[i].autor == nombre) {
              libros[i]= null;
          }
      }
      } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "No se podido eliminar el libro" + e);
      }
        
     
     }  
  public void mostar(){
      for (int i = 0; i < 4; i++) {
          JOptionPane.showMessageDialog(null,"Autor " + libros[i].getAutor() + "\n" + "Título " + libros[i].getTitulo() + "\n" + "Número de páginas " + libros[i].getNumpag() + "\n" + "Calificación " + libros[i].getNum() );
      }
      
  }
    public void ordenar(){
        Arrays.sort(libros);
        
    }
   
}
