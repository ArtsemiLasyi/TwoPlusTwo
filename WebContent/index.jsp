<!DOCTYPE html>
<html lang="ru">
  <head>
    <title>Гостиница "Два плюс два"</title>
    <meta charset="UTF-8" />
    <meta name="description" lang="ru" content="Главная страница сайта" />
    <meta name="description" lang="en" content="Main page of site" />
    <meta
      name="keywords"
      lang="ru"
      content="Два, Плюс, +, 2, Отель, Гостиница"
    />
    <meta name="keywords" lang="en" content="Two, plus, +, 2, hotel" />
    <link rel="shortcut icon" href="images/logo.png" type="image/png" />
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  </head>
  <body class="container">
    <header class="header">
      <div class="logo">
        <img class="logoimg" src="images/biglogo_use.png" />
      </div>
      <div class=""></div>
      <div class="account">
        <a class="button" id="account_button" href="account.html"
          >Регистрация</a
        >
      </div>
      <nav class="navigation">
        <a class="nav_menu" href="#booking">Найти номер</a>
        <a class="nav_menu" href="#services">Услуги</a>
        <a class="nav_menu" href="#about">О гостинице</a>
        <a class="nav_menu" href="#reviews">Отзывы</a>
        <a class="nav_menu" href="#contacts">Контакты</a>
      </nav>
    </header>
    <content class="content">
      <div class="article">
        <h2 class="bigtitle">БРОНИРУЙТЕ НОМЕРА НА НАШЕМ САЙТЕ</h2>
        <ul class="ul">
          <li class="li"><img src="images/checkmark.png" />Лучшая цена</li>
          <li class="li">
            <img src="images/checkmark.png" />Специальные предложения
          </li>
          <li class="li">
            <img src="images/checkmark.png" />Программа лояльности
          </li>
        </ul>
        <br />
        <a class="link" href="specialoffers.html">Подробнее</a>
      </div>
      <form id="booking" class="article" method="POST">
        <h4 class="smalltitle">Бронирование номеров</h4>
        <div>
          <span class="plaintext">Заезд:</span>
          <input type="datetime" class="input" name="checkInDate" />
          <br />
        </div>
        <div>
          <span class="plaintext">Выезд:</span>
          <input type="datetime" class="input" name="checkOutDate" />
          <br />
        </div>
        <br />
        <div>
          <span class="plaintext">Количество человек:</span>
          <input type="number" class="input" name="peopleNumber" />
          <br />
        </div>
        <br />
        <div>
          <input
            type="button"
            class="button"
            name="findHotelRoomButton"
            value="Найти номер"
          />
        </div>
        <br />
      </form>
      <div id="services" class="article">
        <h4 class="smalltitle">Услуги</h4>
        <div class="services-wrapper">
          <div class="tablecell">
            <a class="tinytitle" href="rooms.html">Номера</a>
            <figure class="photo">
              <img class="picture" src="images/rooms.jpg" />
            </figure>
          </div>
          <div class="tablecell">
            <a class="tinytitle" href="restaurants.html">Рестораны</a>
            <figure class="photo">
              <img class="picture" src="images/restourant.jpg" />
            </figure>
          </div>
          <div class="tablecell">
            <a class="tinytitle" href="lobbybar.html">Лобби-бар</a>
            <figure class="photo">
              <img class="picture" src="images/lobbybar.jpg" />
            </figure>
          </div>
          <div class="tablecell">
            <a class="tinytitle" href="concerthall.html">Концертный зал</a>
            <figure class="photo">
              <img class="picture" src="images/concerthall.jpg" />
            </figure>
          </div>
          <div class="tablecell">
            <a class="tinytitle" href="gym.html">Спортзал</a>
            <figure class="photo">
              <img class="picture" src="images/gym.jpg" />
            </figure>
          </div>
          <div class="tablecell">
            <a class="tinytitle" href="conferencecenter.html"
              >Конференц-центр</a
            >
            <figure class="photo">
              <img class="picture" src="images/conferencecenter.jpg" />
            </figure>
          </div>
        </div>
      </div>
      <div id="about" class="article">
        <h4 class="smalltitle">О гостинице</h4>
        <p style="padding: 0.5em">
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
        <h4 class="smalltitle">Отзывы</h4>
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
            <h5 class="tinytitle">Алеся</h5>
            <img class="picture" src="images/person5.jpg" />><br />
            <span class="plaintext">Вот оно, наше золото!</span>
          </div>
        </div>
        <br />
        <a class="link" href="reviews.html">Написать отзыв</a>
      </div>
      <div id="contacts" class="article">
        <h4 class="smalltitle">Контакты</h4>
        <div class="contacts-wrapper">
          <div class="tablecell">
            <h5 class="tinytitle">Telegram</h5>
            <a href="https://t.me/twoplustwohotel" class="plaintext"
              >t.me/twoplustwohotel</a
            >
          </div>
          <div class="tablecell">
            <h5 class="tinytitle">Vk</h5>
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
            <h5 class="tinytitle">Телефон</h5>
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
    <footer class="footer">
      <p>© 2020 Гостиница "Два плюс два"</p>
    </footer>
  </body>
</html>
