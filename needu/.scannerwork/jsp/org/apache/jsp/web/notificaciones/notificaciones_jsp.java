/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Generated at: 2024-05-03 17:52:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.web.notificaciones;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import ModeloDAO.NotificacionDAO;
import Modelo.Notificacion;

public final class notificaciones_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("ModeloDAO.NotificacionDAO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Modelo.Notificacion");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n\r\n\r\n\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n    <title>Notificaciones</title>\r\n    <meta charset=\"UTF-8\">\r\n    <title>Notificaciones</title>\r\n    <style>\r\n        body {\r\n            font-family: Arial, sans-serif;\r\n            margin: 0;\r\n            padding: 0;\r\n            background-color: #f4f4f4;\r\n        }\r\n        .container {\r\n            width: 80%;\r\n            margin: 20px auto;\r\n        }\r\n        h1 {\r\n            text-align: center;\r\n            color: #333;\r\n        }\r\n        .notification {\r\n            background-color: #fff;\r\n            border-radius: 8px;\r\n            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\r\n            margin-bottom: 20px;\r\n            padding: 15px;\r\n        }\r\n        .notification h3 {\r\n            margin-top: 0;\r\n            font-size: 18px;\r\n            color: #555;\r\n        }\r\n        .notification-list {\r\n            list-style: none;\r\n            padding: 0;\r\n            margin: 0;\r\n        }\r\n        .notification-item {\r\n            border-bottom: 1px solid #eee;\r\n");
      out.write("            padding: 10px 0;\r\n        }\r\n        .notification-item:last-child {\r\n            border-bottom: none;\r\n        }\r\n        .notification-item a {\r\n            text-decoration: none;\r\n            color: #007bff;\r\n        }\r\n        /* Estilos para la barra de menú */\r\n.menu {\r\n  background-color: #ffffff; /* Fondo blanco */\r\n  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1); /* Sombra ligera */\r\n  padding: 10px 20px; /* Espaciado interno */\r\n  text-align: right; /* Alineación del texto a la derecha */\r\n}\r\n\r\n.menu a {\r\n  font-family: Helvetica, Arial, sans-serif; /* Fuentes de sistema similares a Poppins */\r\n  text-decoration: none; /* Sin subrayado en los enlaces */\r\n  color: #666; /* Color de texto gris */\r\n  margin-right: 50px; /* Espaciado entre elementos */\r\n  font-weight: bold; /* Texto en negrita */\r\n}\r\n\r\n.menu a:hover {\r\n  color: #333; /* Cambio de color al pasar el ratón por encima */\r\n}\r\n    </style>\r\n    <link rel=\"icon\" type=\"image/jpeg\" href=\"imagenes\\logo.jpeg\"> \r\n</head>\r\n<body>\r\n    <div class=\"menu\">\r\n");
      out.write("  <a href=\"ControladorLogin?accion=redirigirInicio\">Inicio</a>\r\n  <a href=\"ControladorChat?accion=allchats\">Chat</a>\r\n  <a href=\"ControladorNotificacion?accion=notificacion\">Notificaciones</a>\r\n  <a href=\"ControladorPerfil?accion=perfil\">Perfil</a>\r\n  <a href=\"ControladorUsuario?accion=control\">Control de usuarios</a>\r\n  <a href=\"ControladorLogin?accion=logout\">Cerrar Sesión</a>\r\n</div>\r\n    ");

    int idusuario = (int) session.getAttribute("idusuario");
    NotificacionDAO dao = new NotificacionDAO();
    List<Notificacion> lista = dao.listarMensajes(idusuario);

      out.write("\r\n    <div class=\"container\">\r\n        <h1>Notificaciones</h1>\r\n        <div class=\"notification\">\r\n            <h3>Mensajes    <h4><a href=\"ControladorNotificacion?accion=marcar\">Marcar como leído todas</a></h4></h3>\r\n            <ul class=\"notification-list\">\r\n                ");
 for (Notificacion not : lista) { 
      out.write("\r\n                    <li class=\"notification-item\">\r\n                        <strong>");
      out.print( not.getFecha() );
      out.write("</strong><br>\r\n                        ");
      out.print( not.getMensaje() );
      out.write("<br>\r\n                        <a href=\"ControladorChat?accion=allchats\">Abrir</a>\r\n                    </li>\r\n                ");
 } 
      out.write("\r\n            </ul>\r\n        </div>\r\n        <div class=\"notification\">\r\n            <h3>Solicitudes</h3>\r\n            <ul class=\"notification-list\">\r\n                ");
 lista = dao.listarSolicitudes(idusuario);
                for (Notificacion not : lista) { 
      out.write("\r\n                    <li class=\"notification-item\">\r\n                        <strong>");
      out.print( not.getFecha() );
      out.write("</strong><br>\r\n                        ");
      out.print( not.getMensaje() );
      out.write("<br>\r\n                        <a href=\"#\">Abrir</a>\r\n                    </li>\r\n                ");
 } 
      out.write("\r\n            </ul>\r\n        </div>\r\n        <div class=\"notification\">\r\n            <h3>Aprobaciones</h3>\r\n            <ul class=\"notification-list\">\r\n                ");
 lista = dao.listarAprobaciones(idusuario);
                for (Notificacion not : lista) { 
      out.write("\r\n                    <li class=\"notification-item\">\r\n                        <strong>");
      out.print( not.getFecha() );
      out.write("</strong><br>\r\n                        ");
      out.print( not.getMensaje() );
      out.write("<br>\r\n                        <a href=\"#\">Abrir</a>\r\n                    </li>\r\n                ");
 } 
      out.write("\r\n            </ul>\r\n        </div>\r\n    </div>\r\n</body>\r\n</html>\r\n");
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
