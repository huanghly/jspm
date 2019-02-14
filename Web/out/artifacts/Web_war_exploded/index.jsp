<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/2/14
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
  </head>
  <body>
  <script type="text/javascript">
    //通过前端的定时器模拟数据的实时传输
    window.setInterval(function () {
      $.get("/Web_war_exploded/test",{data:01020304},function (data) {
        console.log(data);
      })
    },1000);

  </script>
  </body>
</html>
