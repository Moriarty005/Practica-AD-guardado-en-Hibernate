/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import jdk.internal.org.xml.sax.SAXException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proyecto_ad_hibernate.Cliente;
import proyecto_ad_hibernate.Cocinero;
import proyecto_ad_hibernate.Controlador;
import proyecto_ad_hibernate.Plato;
import proyecto_ad_hibernate.Restaurante;

/**
 *
 * @author lolac
 */
public class UnitTest {
    
     @Test
    public void pruebaContructorPorParametrosCocinero(){
        
        Plato plato = new Plato();
        
        Cocinero juan = new Cocinero(plato, 1235.5, "juanillo", "Comida japonesa", 3);
        
        Assert.assertEquals(1, juan.getIdcocinero().intValue());
        Assert.assertEquals(1235.5, juan.getSalario());
        Assert.assertEquals("juanillo", juan.getNombreCocinero());
        Assert.assertEquals("Comida japonesa", juan.getEspcialidad());
        Assert.assertEquals(3, juan.getNumeroDePremios());
    }
    
    @Test
    public void pruebaContructorPorParametrosPlato(){
        
        Restaurante res = new Restaurante();
        
        Plato revuleto_de_setas = new Plato(res, "Revuelto de setas con huevos rotos", "Umami", 25, 1);
        
        Assert.assertEquals(1, revuleto_de_setas.getIdplato().intValue());
        Assert.assertEquals("Revuelto de setas con huevos rotos", revuleto_de_setas.getNombrePlato());
        Assert.assertEquals("Umami", revuleto_de_setas.getSaborPrincipal());
        Assert.assertEquals(25, revuleto_de_setas.getTiempoDePrepEnMins());
        Assert.assertEquals(1, revuleto_de_setas.getNumIngredientes());
    }
    
    @Test
    public void pruebaContructorPorParametrosRestaurante(){
        
        Cliente cliente = new Cliente();
        
        Restaurante casaMari = new Restaurante(cliente, "Casa Mari", "Granda", "yepale", 10);
        
        Assert.assertEquals(1, casaMari.getIdrestaurante().intValue());
        Assert.assertEquals("Casa Mari", casaMari.getNombreRestaurante());
        Assert.assertEquals("Granda", casaMari.getDireccionRestaurante());
        Assert.assertEquals(55, casaMari.getAforoMaximoRestaurante());
        Assert.assertEquals(10, casaMari.getNumeroEmpleadosRestaurante());
    }
    
    @Test
    public void pruebaContructorPorParametrosCliente(){
        
        Cliente raul = new Cliente("twt", "Renault", "Sí", 14);
        
        Assert.assertEquals(1, raul.getIdCliente().intValue());
        Assert.assertEquals("Renault", raul.getNombreCliente());
        Assert.assertEquals("Sí", raul.getAlergico());
        Assert.assertEquals("Sí", raul.getReserva());
        Assert.assertEquals(15, raul.getCosteDeLaComida());
    }
    
    @Test
    public void pruebaAniadirCocinero() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException, org.xml.sax.SAXException{
        
        Controlador c = new Controlador();
        
        Plato plato = new Plato();
        
        Cocinero juan = new Cocinero(plato, 1235.5, "juanillo", "Comida japonesa", 3);
        
        c.addCocineroToList(juan);
        
        Assert.assertEquals(1, c.getCocineroListSize());
    }
    
    @Test
    public void pruebaAniadirPlato() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException, org.xml.sax.SAXException{
        
        Controlador c = new Controlador();
        
        Restaurante res = new Restaurante();
        
        Plato revuleto_de_setas = new Plato(res, "Revuelto de setas con huevos rotos", "Umami", 25, 1);
        
        c.addPlatoToList(revuleto_de_setas);
        
        Assert.assertEquals(1, c.getPlatoListSize());
    }
    
    @Test
    public void pruebaAniadirRestaurante() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException, org.xml.sax.SAXException{
        
        Controlador c = new Controlador();
        
        Cliente cl = new Cliente();
        
        Restaurante casaMari = new Restaurante(cl, "Casa Mari", "Granda", "yepale", 10);
        
        c.addRestauranteToList(casaMari);
        
        Assert.assertEquals(1, c.getRestauranteListSize());
    }
    
    @Test
    public void pruebaAniadirCliente() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException, org.xml.sax.SAXException{
        
        Controlador c = new Controlador();
        
        Cliente raul = new Cliente();
        
        c.addClienteToList(raul);
        
        Assert.assertEquals(1, c.getClienteListSize());
    }
    
    @Test
    public void pruebaBorrarCocinero() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException, org.xml.sax.SAXException{
        
        Controlador c = new Controlador();
        
        Plato plato = new Plato();
        
        Cocinero juan = new Cocinero(plato, 1235.5, "juanillo", "Comida japonesa", 3);
        
        c.addCocineroToList(juan);
        
        c.removeCocinero(juan);
        
        Assert.assertEquals(0, c.getCocineroListSize());
    }
    
    @Test
    public void pruebaBorrarPlato() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException, org.xml.sax.SAXException{
        
        Controlador c = new Controlador();
        
        Restaurante r = new Restaurante();
        
        Plato revuleto_de_setas = new Plato(r, "Revuelto de setas con huevos rotos", "Umami", 25, 1);
        
        c.addPlatoToList(revuleto_de_setas);
        
        c.removePlato(revuleto_de_setas);
        
        Assert.assertEquals(0, c.getPlatoListSize());
    }
    
    @Test
    public void pruebaBorrarRestaurante() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException, org.xml.sax.SAXException{
        
        Controlador c = new Controlador();
        
        Cliente cl = new Cliente();
        
        Restaurante casaMari = new Restaurante(cl, "Casa Mari", "Granda", "s", 10);
        
        c.addRestauranteToList(casaMari);
        
        c.removeRestaurante(casaMari);
        
        Assert.assertEquals(0, c.getRestauranteListSize());
    }
    
    @Test
    public void pruebaBorrarCliente() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException, org.xml.sax.SAXException{
        
        Controlador c = new Controlador();
        
        Cliente raul = new Cliente();
        
        c.addClienteToList(raul);
        
        c.removeCliente(raul);
        
        Assert.assertEquals(0, c.getClienteListSize());
    }

    
}
