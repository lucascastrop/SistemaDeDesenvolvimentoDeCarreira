<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<%@ include file="head.jsp" %>

<body>
<%@ include file="menu.jsp" %>

<div class="banner">
<!-- 	<img class="img-banner" src="img/index/background-yellow.png">
 -->    <div class="texto-banner">
      <h1>Domine sua <br> Carreira.</h1>
    </div>
	<iframe width="560" height="315" src="https://www.youtube.com/embed/87Hney3ky1I" frameborder="0"
        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen></iframe>
  </div>
  <div class="expo">
    <h1>O que é o sigma Career?</h1>
  </div>
  <div class="botoes-explicacao">
    <div class="item-b">
      <button class="b1"></button>
      <div class="botao-texto">Employee <br> Experience</div>
    </div>
    <div class="item-b">
      <button class="b2"></button>
      <div class="botao-texto">Missão</div>
    </div>
    <div class="item-b">
      <button class="b3"></button>
      <div class="botao-texto">Produto</div>
    </div>
    <div class="item-b">
      <button class="b4"></button>
      <div class="botao-texto">Benefícios</div>
    </div>
  </div>
  <div>
    <header id="hero" class="hero">
      <div class="flex-container w-container">
        <div class="explicacao-items">
          <h1>Employee <br> Experience</h1>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
            labore et dolore magna aliqua</p>
        </div>
        <div class="explicacao-img"><img src="img/index/tela-exemplo.png"></div>
      </div>
    </header>
  </div>
  
  <%@ include file="rodape.jsp" %>
</body>

</html>