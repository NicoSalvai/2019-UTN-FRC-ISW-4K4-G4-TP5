<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="net.sf.jasperreports.engine.JRException"%>
<%@ page import="com.meta4.m4operations.M4Operations" %>
<%@ page import="com.meta4.m4operations.OperationException"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Map"%>
<%@ page import="util.Utilidad"%>
<%@ page import="domain.bussines.Producto"%>
<%@ page import="com.google.gson.JsonArray"%>
<%@ page import="com.google.gson.JsonObject"%>



<%
    JsonArray listaProductos = Utilidad.productoJson();

    out.print(listaProductos);
    



%>