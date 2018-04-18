
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <div class="all">
      <div class="user">
        <form method="get">
          Имя: <input type="text" name="name"><br/>
          Фамилия: <input type="text" name="surname"><br/>
          Возраст: <input type="text" name="age"><br/>
        </form>
      </div>
      <div class="question1">
        <form method="get" action="/Main">
          <br/><br/>
          2 + 2 =<br/>
          <input type="radio" name="plus" value="4"/>4<br/>
          <input type="radio" name="plus" value="128"/>128

          <br/>
          _опа пишется через<br/>
          <input type="radio" name="letter" value="ж"/>ж<br/>
          <input type="radio" name="letter" value="п"/>п<br/>
          <input type="submit" value="OK">
        </form>
      </div>
    </div>
  </body>
</html>
