/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_cliente_soap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pkg_servicio_web.ServicioWebServidor;
import pkg_servicio_web.ServicioWebServidor_Service;

/**
 *
 * @author diego
 */
@ManagedBean() @SessionScoped
public class cliente_soap {
    private ServicioWebServidor_Service service=new ServicioWebServidor_Service(); ServicioWebServidor port= service.getServicioWebServidorPort();
public String pro_id="";
public String dep_id="";
public String lug_id="";
public String pro_nombre="";
public String mensaje="";
public cliente_soap () {
}

public String getpro_id() {
return pro_id; }

public void setpro_id(String as_pro_id) { this.pro_id = as_pro_id;
}

public String getdep_id() {
return dep_id; }
public void setdep_id(String as_dep_id) { this.dep_id = as_dep_id;
}

public String getmensaje() {
return mensaje; }
public void setmensaje(String as_mensaje) { this.mensaje = as_mensaje;
}

    public String getLug_id() {
        return lug_id;
    }

    public void setLug_id(String lug_id) {
        this.lug_id = lug_id;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }


/*METODO INSERTAR */ 

public void insertar()
{
int resultado;
try
{ resultado=port.insertar(pro_id, dep_id,lug_id,pro_nombre);
if (resultado==1) {
mensaje="Se insertó satisfactoriamente"; }
else {
mensaje="No se pudo insertar"; }
}
catch (Exception ex) {
mensaje="No se pudo insertar"; }
}
public void eliminar() {
int resultado; try
    { resultado=port.eliminar(pro_id); if (resultado==1)
{
mensaje="Se eliminó satisfactoriamente"; }
else {
mensaje="No se pudo eliminar"; }
}
catch (Exception ex) {
mensaje="No se pudo eliminar"; }
}
public void modificar() {
int resultado;
try
{ resultado=port.modificar(pro_id, dep_id,lug_id,pro_nombre);
if (resultado==1) {
mensaje="Se modificó satisfactoriamente";
} else {
mensaje="No se pudo modificar"; }
}
catch (Exception ex) {
mensaje="No se pudo modificar"; }
}
public void buscar() {
String ls_dep_id;
try
{ ls_dep_id=port.buscar(pro_id);
if (ls_dep_id!=null) {
dep_id=ls_dep_id;
mensaje="Registro encontrado"; }
else {
mensaje="No se pudo encontrar el registro";
}
}
catch (Exception ex) {
mensaje="No se pudo encontrar el registro"; }
} 
}
