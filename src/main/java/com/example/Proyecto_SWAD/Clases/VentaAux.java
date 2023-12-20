package com.example.Proyecto_SWAD.Clases;

import java.util.Date;
import lombok.Data;


@Data
public class VentaAux {
    
    private int id;
    private Date fecha;
    private String nom_cliente;
    private String ape_cliente;
    private String mediopago;
    private String tipocomprobante;
    private String nom_usuario;
    private String ape_usuario;
    private Double soles;
    private Double cantidad;
    private String estado;
  
}