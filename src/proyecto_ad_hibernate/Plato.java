package proyecto_ad_hibernate;
// Generated 20-ene-2020 12:37:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Plato generated by hbm2java
 */
public class Plato  implements java.io.Serializable {


     private Integer idplato;
     private Restaurante restaurante;
     private String nombrePlato;
     private String saborPrincipal;
     private int tiempoDePrepEnMins;
     private int numIngredientes;
     private Set cocineros = new HashSet(0);

    public Plato() {
    }

	
    public Plato(Restaurante restaurante, String nombrePlato, String saborPrincipal, int tiempoDePrepEnMins, int numIngredientes) {
        this.restaurante = restaurante;
        this.nombrePlato = nombrePlato;
        this.saborPrincipal = saborPrincipal;
        this.tiempoDePrepEnMins = tiempoDePrepEnMins;
        this.numIngredientes = numIngredientes;
    }
    public Plato(Restaurante restaurante, String nombrePlato, String saborPrincipal, int tiempoDePrepEnMins, int numIngredientes, Set cocineros) {
       this.restaurante = restaurante;
       this.nombrePlato = nombrePlato;
       this.saborPrincipal = saborPrincipal;
       this.tiempoDePrepEnMins = tiempoDePrepEnMins;
       this.numIngredientes = numIngredientes;
       this.cocineros = cocineros;
    }
   
    public Integer getIdplato() {
        return this.idplato;
    }
    
    public void setIdplato(Integer idplato) {
        this.idplato = idplato;
    }
    public Restaurante getRestaurante() {
        return this.restaurante;
    }
    
    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
    public String getNombrePlato() {
        return this.nombrePlato;
    }
    
    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }
    public String getSaborPrincipal() {
        return this.saborPrincipal;
    }
    
    public void setSaborPrincipal(String saborPrincipal) {
        this.saborPrincipal = saborPrincipal;
    }
    public int getTiempoDePrepEnMins() {
        return this.tiempoDePrepEnMins;
    }
    
    public void setTiempoDePrepEnMins(int tiempoDePrepEnMins) {
        this.tiempoDePrepEnMins = tiempoDePrepEnMins;
    }
    public int getNumIngredientes() {
        return this.numIngredientes;
    }
    
    public void setNumIngredientes(int numIngredientes) {
        this.numIngredientes = numIngredientes;
    }
    public Set getCocineros() {
        return this.cocineros;
    }
    
    public void setCocineros(Set cocineros) {
        this.cocineros = cocineros;
    }




}

