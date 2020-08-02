package Clases;
/**
 *
 * @author Brenda R
 */
public class ClaseLibro implements Comparable<ClaseLibro>{
    String titulo;
    String autor;
    int numpag;
    int num;
    
    public ClaseLibro(String titulo, String autor, int numpag, int num) {
        this.titulo = titulo;
        this.autor = autor;
        this.numpag = numpag;
        this.num = num;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(ClaseLibro t) {
        if (num< t.num) {
            return -1;
        }
        if (num> t.num) {
            return 1;
        }
    return 0;    
    }
    
    
    
}
