<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<%@ include file="head.jsp" %>

<body>
    <%@ include file="menu.jsp" %>
    <section>
        <div id="section-form-login">
            <form id="form-login" action="" method="post">
                <div class="img-container-login">
                    <img src="img/index/logo-sigma-2.png" alt="Logo" class="logo">
                </div>

                <div class="container-login" id="container-1">
                    <label for="uname"><b>Usuario</b></label>
                    <input type="text" placeholder="e-mail ou nome de usuário" name="uname" required>

                    <label for="psw"><b>Senha</b></label>
                    <input type="password" placeholder="Senha" name="psw" required>

                    <button id="btn-login" class="btn-login" type="submit" value ="certificado?acao=listarPorColab">Login</button>
                    <label id="rmb-check">
                        <input type="checkbox" checked="checked" name="remember">Lembrar Senha
                    </label>
                </div>

                <div class="container-login" id="container-2">
                    <button id="btn-login" class="btn-cancelar" type="button">Cancelar</button>
                    <span class="senha">Esqueceu a <a href="#">Senha</a>?</span>
                </div>
            </form>
        </div>
    </section>
   <%@ include file="rodape.jsp" %>
</body>

</html>