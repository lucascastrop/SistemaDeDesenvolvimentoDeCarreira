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
        <!-- action=certificado -->
        <form id="form-up-certicado" action="certificado" method="post">
            <div id="form-upload">
				<input type="hidden" name="acao" value="cadastrar">
				<input type="hidden" name="codigo" value="20001">
				<input type="hidden" name="codCertificado" value="${certificado.codigo}">
				<input type="hidden" name="data" id="datepicker" autocomplete="off"
				value='<fmt:formatDate pattern="dd/MM/yyyy" value="20/10/2020"/>'>
			    <div class="item-form-up">
                    <label class="form-label" for="curso"><b>Nome Certificação</b></label>
                    <input type="text" placeholder="Nome do curso realizado" name="curso" value="${certificado.nomeCurso}" required>
                </div>
                <div class="item-form-up">
                    <label class="form-label" for="emissor"><b>Instituição Emissora</b></label> 
                    <input type="text" placeholder="Nome da Instituição" name="emissor" value="${certificado.emissor}" required>
                </div>
                <div class="item-form-up">
                    <label class="form-label" for="codVerificador"><b>Codigo de Verificação</b></label>
                    <input type="text" placeholder="Codigo de Autencidade" name="codVerificador" value="${certificado.codVerificador}" required>
                </div>
                <div class="item-form-up">
                    <label class="form-label" for="linkCertificado"><b>Link Documento</b></label>
                    <input type="text" placeholder="Link Documento" name="linkCertificado" value="${certificado.linkCertificado}"required>
                </div>
                <!-- Codigo de Colab, cod de Certificado-->
                <!-- <div class="item-form-up">
                    <label class="form-label" for="file-upload"><b>Anexar Arquivo</b><br></label>
                    <input id="file-upload" type="file" required>
                </div> -->
                <div class="btn-upload">
                    <button class="btn-enviar" type="submit" value="Salvar"><span> Enviar</span></button>
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