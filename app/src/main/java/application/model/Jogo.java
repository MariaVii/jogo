package application.model;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@EntityScan
@Table(name= "jogos")
public class Jogo {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String titulo;
   private int anoDeLancamento; 

    public int getId() {
    return id;
    }

   public void setId() {
    this.id = id;
   }
    public String getTitulo() {
      return titulo;
    }

   public String setTitulo(){
   this.titulo = titulo;
   }

   public int getanoDeLancamento(){
      this.anoDeLancamento = anoDeLancamento;
   }

   public int setanodeLancamento(){
      this.anoDeLancamento = anoDeLancamento;
   }
}
