<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	 <header class="header">
      <div class="logo">
        <img class="logoimg" src="images/biglogo_use.png" />
      </div>
      <div>
      	<form method="post" class="language" action="">
        	<input type="hidden" class="language_elem" name="lang" value="ru" />
        	<input type="submit" class="language_elem" value="RU" /></input>
        </form>
        <form method="post" class="language" action="">
        	<input type="hidden" class="language_elem" name="lang" value="en" />
            <input type="submit" class="language_elem" value="EN" /></input>
        </form>
      </div>
      <div class="account">
      	<a class="button" id="account_button" name="login" href="Account">Вход</a>
        <a class="button" id="account_button" name="registration" href="Account">Регистрация</a>
      </div>
      <nav class="navigation">
      	<a class="nav_menu" href="Main">Главная</a>
        <a class="nav_menu" href="Main#booking">Найти номер</a>
        <a class="nav_menu" href="Main#services">Услуги</a>
        <a class="nav_menu" href="Main#about">О гостинице</a>
        <a class="nav_menu" href="Main#reviews">Отзывы</a>
        <a class="nav_menu" href="Main#contacts">Контакты</a>
      </nav>
    </header>