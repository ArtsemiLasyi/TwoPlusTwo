<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
  <head>
  	<%@ include file="head.jsp" %>
  </head>
  <fmt:setLocale value='<%=request.getSession().getAttribute("lang")%>'/>
  <fmt:setBundle basename="resources.lang" var="loc"/>
  <fmt:message bundle="${loc}" key="lang.label.bookrooms" var="bookrooms"/>
  <fmt:message bundle="${loc}" key="lang.label.bestprice" var="bestprice"/>
  <fmt:message bundle="${loc}" key="lang.label.specialoffers" var="specialoffers"/>
  <fmt:message bundle="${loc}" key="lang.label.loyaltyprogram" var="loyaltyprogram"/>
  <fmt:message bundle="${loc}" key="lang.label.hoteltelephone" var="hoteltelephone"/>
  <fmt:message bundle="${loc}" key="lang.link.readmore" var="readmore"/>
  <fmt:message bundle="${loc}" key="lang.label.roomreservation" var="roomreservation"/>
  <fmt:message bundle="${loc}" key="lang.label.checkin" var="checkin"/>
  <fmt:message bundle="${loc}" key="lang.label.checkout" var="checkout"/>
  <fmt:message bundle="${loc}" key="lang.label.numberofpersons" var="numberofpersons"/>
  <fmt:message bundle="${loc}" key="lang.link.findroom" var="findroom"/>
  <fmt:message bundle="${loc}" key="lang.label.services" var="services"/>
  <fmt:message bundle="${loc}" key="lang.link.rooms" var="rooms"/>
  <fmt:message bundle="${loc}" key="lang.link.restaurants" var="restaurants"/>
  <fmt:message bundle="${loc}" key="lang.link.lobbybar" var="lobbybar"/>
  <fmt:message bundle="${loc}" key="lang.link.concerthall" var="concerthall"/>
  <fmt:message bundle="${loc}" key="lang.link.gym" var="gym"/>
  <fmt:message bundle="${loc}" key="lang.link.conferencecenter" var="conferencecenter"/>
  <fmt:message bundle="${loc}" key="lang.label.abouthotel" var="abouthotel"/>
  <fmt:message bundle="${loc}" key="lang.label.reviews" var="labelreviews"/>
  <fmt:message bundle="${loc}" key="lang.link.writereview" var="writereview"/>
  <fmt:message bundle="${loc}" key="lang.label.contacts" var="contacts"/>
  <fmt:message bundle="${loc}" key="lang.label.hotelphone" var="hotelphone"/>
  <body class="container">
    <%@ include file="header.jsp" %>
    <content class="content" id="main">
      <div class="article">
        <h2 class="bigtitle">${bookrooms}</h2>
        <ul class="ul">
          <li class="li"><img src="images/checkmark.png" />${bestprice}</li>
          <li class="li">
            <img src="images/checkmark.png" />${specialoffers}
          </li>
          <li class="li">
            <img src="images/checkmark.png" />${loyaltyprogram}
          </li>
        </ul>
        <br />
        <a class="link" href="specialoffers.html">${readmore}</a>
      </div>
      <form id="booking" class="article" method="POST">
        <h4 class="smalltitle">${roomreservation}</h4>
        <div>
          <span class="plaintext">${checkin}:</span>
          <input type="datetime" class="input" name="checkInDate" />
          <br />
        </div>
        <div>
          <span class="plaintext">${checkout}:</span>
          <input type="datetime" class="input" name="checkOutDate" />
          <br />
        </div>
        <br />
        <div>
          <span class="plaintext">${numberofpersons}:</span>
          <input type="number" class="input" name="peopleNumber" />
          <br />
        </div>
        <br />
        <div>
          <input type="button" class="button" name="findHotelRoomButton" value=${findroom}/>
        </div>
        <br />
      </form>
      <div id="services" class="article">
        <h4 class="smalltitle">${services}</h4>
        <div class="services-wrapper">
          <div class="tablecell">
            <a class="tinytitle" href="rooms.html">${rooms}</a>
            <figure class="photo">
              <img class="picture" src="images/rooms.jpg" />
            </figure>
          </div>
          <div class="tablecell">
            <a class="tinytitle" href="restaurants.html">${restaurants}</a>
            <figure class="photo">
              <img class="picture" src="images/restourant.jpg" />
            </figure>
          </div>
          <div class="tablecell">
            <a class="tinytitle" href="lobbybar.html">${lobbybar}</a>
            <figure class="photo">
              <img class="picture" src="images/lobbybar.jpg" />
            </figure>
          </div>
          <div class="tablecell">
            <a class="tinytitle" href="concerthall.html">${concerthall}</a>
            <figure class="photo">
              <img class="picture" src="images/concerthall.jpg" />
            </figure>
          </div>
          <div class="tablecell">
            <a class="tinytitle" href="gym.html">${gym}</a>
            <figure class="photo">
              <img class="picture" src="images/gym.jpg" />
            </figure>
          </div>
          <div class="tablecell">
            <a class="tinytitle" href="conferencecenter.html">${conferencecenter}</a>
            <figure class="photo">
              <img class="picture" src="images/conferencecenter.jpg" />
            </figure>
          </div>
        </div>
      </div>
      <div id="about" class="article">
        <h4 class="smalltitle">${abouthotel}</h4>
        <p style="padding: 0.5em; font-size: 2em">
          Гостиница «Два плюс два» — один из лучших четырехзвездочных отелей
          города %ситинейм%. Гостиничный комплекс располагает современной
          инфраструктурой как для комфортного туристического отдыха, так и для
          деловых поездок в Северную столицу. К Вашим услугам более 400
          современных комфортабельных номеров категорий Стандарт, Бизнес,
          Комфорт и Люкс. Отель удобно расположен в двух минутах ходьбы от
          станции метро %станциянейм%, что позволит Вам легко добраться до любой
          точки города. Исторический центр %ситинейм% находится в 10 минутах
          езды. Более подробную информацию о достопримечательностях города Вы
          сможете найти в разделе "Мир вокруг". Воспользуйтесь услугами
          консьерж-сервиса гостиницы «Два плюс два» - мы с радостью поможем Вам
          организовать интересную экскурсию, а также заказать билеты в театр, на
          концерты, выставки и другие развлекательные мероприятия. Также для Вас
          на территории гостиницы «Два плюс два» работают 2+2 ресторана,
          лобби-бар, сервис-центр, конференц-центр, а также концертный зал. На
          всей территории отеля доступен бесплатный Wi-Fi. В гостинице «Два плюс
          два» Вам всегда рады!
        </p>
      </div>
      <div id="reviews" class="article">
        <h4 class="smalltitle">${labelreviews}</h4>
        <div class="tablerow">
          <div class="topreview">
            <h5 class="tinytitle">Максим</h5>
            <img class="picture" src="images/person3.jpg" /><br />
            <span class="plaintext">Классная гостиница!</span>
          </div>
          <div class="topreview">
            <h5 class="tinytitle">Илья</h5>
            <img class="picture" src="images/person4.jpg" />><br />
            <span class="plaintext"
              >Для этой гостинице у меня всегда найдется пара хороших
              слов!</span
            >
          </div>
          <div class="topreview">
            <h5 class="tinytitle">Алеся</h5>
            <img class="picture" src="images/person5.jpg" />><br />
            <span class="plaintext">Вот оно, наше золото!</span>
          </div>
          <div class="topreview">
            <h5 class="tinytitle">Давид</h5>
            <img class="picture" src="images/person6.jpg" />><br />
            <span class="plaintext">Никогда не упущу возможности посетить данную гостиницу!</span>
          </div>
        </div>
        <br />
        <a class="link" href="reviews.html">${writereview}</a>
      </div>
      <div id="contacts" class="article">
        <h4 class="smalltitle">${contacts}</h4>
        <div class="contacts-wrapper">
          <div class="tablecell">
            <h5 class="tinytitle">Telegram</h5>
            <a href="https://t.me/twoplustwohotel" class="plaintext"
              >t.me/twoplustwohotel</a
            >
          </div>
          <div class="tablecell">
            <h5 class="tinytitle">Vkontakte</h5>
            <a href="https://vk.com/twoplustwohotel" class="plaintext"
              >https://vk.com/twoplustwohotel</a
            >
          </div>
          <div class="tablecell">
            <h5 class="tinytitle">Email</h5>
            <a href="twoplustwohotel@gmail.com" class="plaintext"
              >twoplustwohotel@gmail.com</a
            >
          </div>
          <div class="tablecell">
            <h5 class="tinytitle">${hotelphone}</h5>
            <span class="plaintext">+375298102020</span>
          </div>
        </div>
        <iframe
          id="googlemap"
          src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2222.841502650632!2d91.42096091558228!3d53.71483065474755!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x5d2c3d439b7a2499%3A0x2881e3f6dfe09a4d!2z0JTQvtC8INCa0L7Qu9C-0YLRg9GI0LrQuNC90LA!5e1!3m2!1sru!2sby!4v1602057369698!5m2!1sru!2sby"
          frameborder="0"
          style="
            padding: 1em;
            align-content: center;
            border: 0;
            width: 90%;
            height: 40em;
          "
          allowfullscreen=""
          aria-hidden="false"
          tabindex="0"
        ></iframe>
      </div>
    </content>
    <%@ include file="footer.jsp" %>
  </body>
</html>
