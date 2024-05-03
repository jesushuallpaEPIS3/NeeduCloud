/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Generated at: 2024-05-03 17:52:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.web.Usuario.PERFILUsuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.*;
import java.util.*;
import Modelo.*;

public final class Perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("Modelo");
    _jspx_imports_packages.add("ModeloDAO");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <title>Perfil de Usuario</title>\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"Usuario/PERFILUsuario/EstilosPerfil.css\">\r\n\r\n\r\n\r\n</form>\r\n     <style>\r\n\r\n\r\n        ");
 if (session.getAttribute("rol") != null && session.getAttribute("rol").equals("voluntario")) { 
      out.write("\r\n            body {\r\n                background-color: #add8e6; \r\n            }\r\n        ");
 } else if (session.getAttribute("rol") != null && session.getAttribute("rol").equals("organizacion")) { 
      out.write("\r\n            body {\r\n                background-color: #d3d3d3;\r\n            }\r\n        ");
 } else if (session.getAttribute("rol") != null && session.getAttribute("rol").equals("administrador")) { 
      out.write("\r\n            body {\r\n                background-color: #fffacd;\r\n            }\r\n        ");
 } 
      out.write("\r\n\r\n        \r\n    </style>\r\n    <link rel=\"icon\" type=\"image/jpeg\" href=\"imagenes\\logo.jpeg\"> \r\n</head>\r\n<body>\r\n    <div class=\"menu\">\r\n    <div class=\"menu-title\">Perfil de usuario</div>\r\n    <a href=\"ControladorLogin?accion=redirigirInicio\">Inicio</a>\r\n    <a href=\"ControladorChat?accion=allchats\">Chat</a>\r\n    <a href=\"ControladorNotificacion?accion=notificacion\">Notificaciones</a>\r\n    <a href=\"ControladorPerfil?accion=perfil\">Perfil</a>\r\n    <a href=\"ControladorUsuario?accion=control\">Control de usuarios</a>\r\n    <a href=\"ControladorLogin?accion=logout\">Cerrar Sesión</a>\r\n  </div>\r\n    \r\n    <div class=\"main-content\">\r\n        <div class=\"bienvenida\">\r\n            ");
 String nombreUsuario = (session.getAttribute("nombre") != null) ? (String) session.getAttribute("nombre") : "Usuario"; 
      out.write("\r\n            <label>Bienvenido, <strong>");
      out.print( nombreUsuario );
      out.write("</strong></label><br><br>\r\n        </div>\r\n\r\n        ");
 if (session.getAttribute("rol") != null) { 
      out.write("\r\n            ");
 if (session.getAttribute("rol").equals("voluntario")) { 
      out.write("\r\n                <label>Rol: Voluntario</label><br><br>\r\n            ");
 } else if (session.getAttribute("rol").equals("organizacion")) { 
      out.write("\r\n                <label>Rol: Organización</label><br><br>\r\n            ");
 } else if (session.getAttribute("rol").equals("administrador")) { 
      out.write("\r\n                <label>Rol: Administrador</label><br><br>\r\n            ");
 } 
      out.write("\r\n        ");
 } 
      out.write("\r\n            ");
 
            int estado = (session.getAttribute("estado") != null) ? (int)session.getAttribute("estado") : 0;
        
      out.write("\r\n        <p class='");
      out.print( (estado == 0) ? "red" : "lightgreen" );
      out.write("'>Estado: ");
      out.print( (estado == 0) ? "Inactivo" : "Activo" );
      out.write("</p>\r\n\r\n\r\n        <div class=\"content\">\r\n        ");
 if (session.getAttribute("rol") != null && session.getAttribute("rol").equals("voluntario")) { 
      out.write("\r\n            <div class=\"voluntario-profile\">\r\n                <label>ID Voluntario:</label>\r\n                <input type=\"text\" value=\"");
      out.print( (session.getAttribute("idvoluntario") != null) ? session.getAttribute("idvoluntario") : "" );
      out.write("\" disabled><br>\r\n                    <form method=\"post\" action=\"ControladorPerfil?accion=editarVoluntario\">\r\n                    \r\n                    <div class=\"input-row\">\r\n                        <div class=\"input-group\">\r\n                            <label>Nombre:</label>\r\n                            <input type=\"text\" value=\"");
      out.print( (session.getAttribute("nombre") != null) ? session.getAttribute("nombre") : "" );
      out.write("\" name=\"nombre\" required>\r\n                        </div>\r\n                        \r\n                        <div class=\"input-group\">\r\n                            <label>Edad:</label>\r\n                            <input type=\"number\" value=\"");
      out.print( (session.getAttribute("edad") != null) ? session.getAttribute("edad") : "" );
      out.write("\" name=\"edad\" required>\r\n                        </div>\r\n                    </div>\r\n                    \r\n                    <div class=\"input-row\">\r\n                        <div class=\"input-group\">\r\n                            <label>Apellido:</label>\r\n                            <input type=\"text\" value=\"");
      out.print( (session.getAttribute("apellido") != null) ? session.getAttribute("apellido") : "" );
      out.write("\" name=\"apellido\" required>\r\n                        </div>\r\n                        \r\n                        <div class=\"input-group\">\r\n                            <label>Correo:</label>\r\n                            <input type=\"email\" value=\"");
      out.print( (session.getAttribute("correo") != null) ? session.getAttribute("correo") : "" );
      out.write("\" name=\"correo\" required>\r\n                        </div>\r\n                    </div>\r\n                        \r\n                        <label>Género:</label>\r\n                        <select name=\"genero\" required>\r\n                            <option value=\"Hombre\" ");
      out.print( (session.getAttribute("genero") != null && session.getAttribute("genero").equals("Hombre")) ? "selected" : "" );
      out.write(">Hombre</option>\r\n                            <option value=\"Mujer\" ");
      out.print( (session.getAttribute("genero") != null && session.getAttribute("genero").equals("Mujer")) ? "selected" : "" );
      out.write(">Mujer</option>\r\n                            <option value=\"Prefiero no decirlo\" ");
      out.print( (session.getAttribute("genero") != null && session.getAttribute("genero").equals("Prefiero no decirlo")) ? "selected" : "" );
      out.write(">Prefiero no decirlo</option>\r\n                        </select>\r\n                        \r\n\r\n                        <input type=\"submit\" value=\"Actualizar Perfil\" class=\"btn-actualizar\"><br>\r\n                    </form>\r\n            </div>\r\n        </div>\r\n        \r\n       \r\n\r\n    \r\n        \r\n            \r\n    ");
 } else if (session.getAttribute("rol") != null && session.getAttribute("rol").equals("organizacion")) { 
      out.write("\r\n    <div class=\"perfil-organizacion\">\r\n            <div class=\"datos-organizacion\">\r\n    <label>ID Organización:</label>\r\n    <input type=\"text\" value=\"");
      out.print( (session.getAttribute("idorganizacion") != null) ? session.getAttribute("idorganizacion") : "" );
      out.write("\" disabled><br><br>\r\n    <form method=\"post\" action=\"ControladorPerfil?accion=editarOrganizacion\">\r\n        <label>Nombre de la Organización:</label>\r\n        <input type=\"text\" value=\"");
      out.print( (session.getAttribute("nombre") != null) ? session.getAttribute("nombre") : "" );
      out.write("\" name=\"nombre\" required><br><br>\r\n\r\n        <label>Tipo:</label>\r\n        <input type=\"text\" value=\"");
      out.print( (session.getAttribute("tipo") != null) ? session.getAttribute("tipo") : "" );
      out.write("\" name=\"tipo\" required><br><br>\r\n\r\n        <label>Correo:</label>\r\n        <input type=\"email\" value=\"");
      out.print( (session.getAttribute("correo") != null) ? session.getAttribute("correo") : "" );
      out.write("\" name=\"correo\" required><br><br>\r\n\r\n        <input type=\"submit\" value=\"Actualizar Perfil\" class=\"btn-actualizar\"><br>\r\n        <br>\r\n    </form>\r\n        <form action=\"ControladorCalificar\" method=\"GET\">\r\n            <input type=\"hidden\" name=\"accion\" value=\"listarPerfiles\">\r\n            <button type=\"submit\" class=\"btn-listar\">Listar Perfiles</button>\r\n        </form>\r\n     </div>\r\n    <div class=\"agregar-oportunidad\">\r\n    <h1>Agregar Oportunidad:</h1>  \r\n    <!-- Agregar Oportunidad-->\r\n<div class=\"agregar-oportunidad\">\r\n    <!-- Formulario Agregar Oportunidad -->\r\n    <form action=\"ControladorOportunidad\" method=\"post\">\r\n\r\n        <!-- Título -->\r\n        <label for=\"titulo\">Título:</label>\r\n        <input type=\"text\" name=\"titulo\" id=\"titulo\" required><br>\r\n\r\n        <!-- Descripción -->\r\n        <label for=\"descripcion\">Descripción:</label>\r\n        <textarea name=\"descripcion\" id=\"descripcion\" required></textarea><br>\r\n\r\n        <!-- Fecha -->\r\n        <label for=\"fecha\">Fecha:</label>\r\n        <input type=\"date\" name=\"fecha\" id=\"fecha\" required><br>\r\n");
      out.write("\r\n        <!-- Ubicación -->\r\n        <label for=\"idubicacion\">Ubicación:</label>\r\n        <select name=\"idubicacion\" id=\"idubicacion\" required>\r\n            ");
 
            UbicacionDAO ubicacionDao = new UbicacionDAO();
            List<Ubicacion> ubicaciones = ubicacionDao.listarUbicaciones();
            for (Ubicacion ubi : ubicaciones) {
                out.println("<option value='" + ubi.getIdubicacion() + "'>" + ubi.getPais() + ", " + ubi.getCiudad() + " - " + ubi.getDireccion() + "</option>");
            }
            
      out.write("\r\n        </select><br>\r\n\r\n        <!-- Causa -->\r\n        <label for=\"idcausa\">Causa:</label>\r\n        <select name=\"idcausa\" id=\"idcausa\" required>\r\n            ");
 
            CausaDAO causaDao = new CausaDAO();
            List<Causa> causas = causaDao.listarCausas();
            for (Causa caus : causas) {
                out.println("<option value='" + caus.getIdcausa() + "'>" + caus.getNombre() + "</option>");
            }
            
      out.write("\r\n        </select><br>\r\n\r\n        <!-- Campo oculto para la acción \"crear\" -->\r\n        <input type=\"hidden\" name=\"accion\" value=\"crear\">\r\n\r\n        <!-- Botón de enviar -->\r\n        <input type=\"submit\" value=\"Crear Oportunidad\">\r\n    </form>\r\n</div>\r\n\r\n    <br>\r\n    <div class=\"oportunidades-organizacion\">\r\n    <h1>Todas las Oportunidades creadas por su Organizacion:</h1>\r\n    <div>\r\n        ");

            Integer idOrganizacion = null;
            if (session.getAttribute("idorganizacion") != null) {
                idOrganizacion = (Integer) session.getAttribute("idorganizacion");

                OportunidadDAO oportunidadDao = new OportunidadDAO();
                List<Oportunidad> oportunidadesOrganizacion = oportunidadDao.listarOportunidadesPorOrganizacion(idOrganizacion);

                if (oportunidadesOrganizacion != null && !oportunidadesOrganizacion.isEmpty()) {
                    for (Oportunidad opo : oportunidadesOrganizacion) {
        
      out.write("\r\n                        <div class='oportunidad'>\r\n                            <h2>");
      out.print( opo.getTitulo() );
      out.write("</h2>\r\n                            <p>Descripción: ");
      out.print( opo.getDescripcion() );
      out.write("</p>\r\n                            <p>Fecha: ");
      out.print( opo.getFecha() );
      out.write("</p>\r\n\r\n                            <!-- Botón de eliminar oportunidad con confirmación -->\r\n                            <form method='post' action='ControladorOportunidad' onsubmit=\"return confirm('¿Estás seguro de eliminar esta oportunidad?');\">\r\n                                <input type='hidden' name='accion' value='eliminar'>\r\n                                <input type='hidden' name='idOportunidad' value='");
      out.print( opo.getIdoportunidad() );
      out.write("'>\r\n                                <input type='submit' value='Eliminar'>\r\n                            </form>\r\n                        </div>\r\n        ");

                    }
                } else {
                    out.print("<p>No hay oportunidades disponibles para tu organización.</p>");
                }
            } else {
                // Redirigir al inicio de sesión si no hay una sesión válida
                response.sendRedirect("login.jsp");
                return;
            }
        
      out.write("\r\n    </div>\r\n\r\n\r\n        \r\n        \r\n        \r\n        \r\n        \r\n        \r\n        \r\n        \r\n        \r\n        \r\n        \r\n        \r\n        \r\n        \r\n        \r\n    ");
 } else if (session.getAttribute("rol") != null && session.getAttribute("rol").equals("administrador")) { 
      out.write("\r\n    <label>ID Administrador:</label>\r\n    <input type=\"text\" value=\"");
      out.print( (session.getAttribute("idadmin") != null) ? session.getAttribute("idadmin") : "" );
      out.write("\" disabled><br><br>\r\n    <form method=\"post\" action=\"ControladorPerfil?accion=editarAdministrador\">\r\n        <label>Nombre del Administrador:</label>\r\n        <input type=\"text\" value=\"");
      out.print( (session.getAttribute("nombre") != null) ? session.getAttribute("nombre") : "" );
      out.write("\" name=\"nombre\" required><br><br>\r\n\r\n  \r\n\r\n        <input type=\"submit\" value=\"Actualizar Perfil\" class=\"btn-actualizar\"><br>\r\n    </form>\r\n    ");
 } 
      out.write("\r\n\r\n\r\n    <form method=\"post\" action=\"ControladorPerfil?accion=actualizarEstado\" onsubmit=\"return confirm('¿Está seguro de realizar esta acción?');\">\r\n        <button type=\"submit\" name=\"estado\" value=\"1\">Activar Cuenta</button>\r\n        <button type=\"submit\" name=\"estado\" value=\"0\">Desactivar Cuenta</button>\r\n    </form>\r\n\r\n    <p class='");
      out.print( (estado == 0) ? "red" : "lightgreen" );
      out.write("'>Estado: ");
      out.print( (estado == 0) ? "Inactivo" : "Activo" );
      out.write("</p>\r\n    \r\n    <script>\r\n        function checkState() {\r\n            let currentState = ");
      out.print( (int)session.getAttribute("estado") );
      out.write(";\r\n\r\n            if (currentState === 0) {\r\n                let countdown = 4; \r\n                let timer = setInterval(function() {\r\n                    countdown--;\r\n                    if (countdown === 0) {\r\n                        clearInterval(timer);\r\n                        document.getElementById(\"message\").innerText = \"Cuenta desactivada. Cerrando sesión...\";\r\n                        setTimeout(() => {\r\n                            window.location.href = 'index.jsp'; \r\n                        }, 1000);\r\n                    }\r\n                }, 1000); \r\n            }\r\n        }\r\n\r\n        checkState(); \r\n    </script>\r\n\r\n    <p id=\"message\"></p>\r\n    \r\n    \r\n    \r\n    <script>\r\n        window.onload = function() {\r\n            var gender = '");
      out.print( session.getAttribute("genero") );
      out.write("';\r\n            var profileImg = document.getElementById('profile-img');\r\n\r\n            if (gender === 'Mujer') {\r\n                profileImg.src = 'ruta/a/mujerperfil.png';\r\n            } else {\r\n                profileImg.src = 'ruta/a/hombreperfil.png';\r\n            }\r\n        };\r\n    </script>\r\n\r\n</body>\r\n</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}