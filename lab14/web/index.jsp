<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Authorization</title>
  </head>
  <body>
  <form action="login" method="post">
    <p><input type="text" name="login" value="" placeholder="Login"></p>
    <p><input type="password" name="password" value="" placeholder="Password"></p>
    </p>
    <p><input type="submit" value="login"></p>
      <span class="error">${error}</span>
  </form>
  <div id="res"></div>
  </body>
</html>
