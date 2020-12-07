<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<%@ include file="head.jsp" %>

<body>
	<%@ include file="menu.jsp" %>
	<%@ include file="topnavbar.jsp" %>

    <h2 class="titulo-upload">Upload Certificados</h2>
    <div id="main" class="main-upload">
        <div id="upload">
        </div>
		        <form id="form-up-certicado" action="certificado" method="post">
		            <div id="form-upload">
						<input type="hidden" name="acao" value="editar">
						<c:forEach items="${certificados}" var="c"> 
							<c:param name="codCertificado" value="${c.codigo}"/>
						</c:forEach>
						    <div class="item-form-up">
			                    <label class="form-label" for="curso"><b>Nome Certificação</b></label>
			                    		<input type="text" placeholder="Nome do curso realizado" name="${certificado.nomeCurso}" required>
			                    	  
			                </div>
			                <div class="item-form-up">
			                    <label class="form-label" for="emissor"><b>Instituição Emissora</b></label>
			                    <input type="text" placeholder="Nome da Instituição" name="${c.emissor}" required>
			                </div>
			                <div class="item-form-up">
			                    <label class="form-label" for="codVerificador"><b>Codigo de Verificação</b></label>
			                    <input type="text" placeholder="Codigo de Autencidade" name="${c.codVerificador}" required>
			                </div>
			                <div class="item-form-up">
			                    <label class="form-label" for="linkCertificado"><b>Link Documento</b></label>
			                    <input type="text" placeholder="Link Documento" name="${c.linkCertificado}" required>
			                </div>
		     			
		                <div class="btn-upload">
		                    <button class="btn-enviar" type="submit" value="certificado?acao=listarPorColab"><span> Enviar</span></button>
		                </div>
		                <div>
		                	<span class="msg">${msg}</span>
		                </div>
		            </div>
		        </form>
    </div>
    <%@ include file="chatbot.jsp" %>
   <%@ include file="rodape.jsp" %>
<!--     <script type="text/javascript" src="../js/script.js"></script>-->
 </body>

</html>