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
<%@ page import="domain.builder.DetallePedidoBuilder"%>
<%@ page import="domain.builder.ProductoBuilder"%>
<%@ page import="domain.bussines.DetallePedido"%>
<%@ page import="domain.bussines.Producto"%>




<%


   
    ArrayList<DetallePedido> lista = Utilidad.listaCarro();
    JsonArray listaCarro = Utilidad.pasarAJson(lista);
    
    out.print(listaCarro);
    
%>