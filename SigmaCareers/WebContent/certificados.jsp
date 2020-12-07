<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<%@ include file="head.jsp" %>

<body>
    <%@ include file="menu.jsp" %>
    <%@ include file="topnavbar.jsp" %>
       
        <section id="equipe">
            <h2 style="text-align: center;">Certificados</h2>
            <div class="div-msg"><span class="msg">${msg}</span></div>

            <div class="painel-blur">
                <div class="container-certificados">

	                   <c:forEach items="${certificados}" var="c"> 
		                    <div class="item-certif">
		                    
				                        	<img class="img-certif" src="img/certif/004-certificate-2.png" alt="Certificado">
				                            <h3>${c.nomeCurso}</h3>
				                        	<p>${c.emissor}</p>
				                        
									        <c:url value="certificado" var="link1">
											<c:param name="acao" value="editar"/>
											<c:param name="codCertificado" value="${c.codigo}"/>
											</c:url>
											<div class="btn-opcoes">
											<a class="btn-alt" href="${link1}">Editar</a>
											<a class="btn-alt-2" href="${link2}">Excluir</a>
											</div>
											
											<c:url value="certificado" var="link2">
											<c:param name="acao" value="remover"/>
											<c:param name="codCertificado" value="${c.codigo}"/>
											</c:url>
											
							</div>
		                </c:forEach>  
		           
                </div>
            </div>
        </section>
    <%@ include file="chatbot.jsp" %>
    <%@ include file="rodape.jsp" %>
<!--     <script type="text/javascript" src="../js/script.js"></script>-->
 </body>

</html>