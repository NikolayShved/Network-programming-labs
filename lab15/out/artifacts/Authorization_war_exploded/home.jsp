<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
    <title>JSP Page</title>
</head>
<body>
<%
    Connection connection = null;
    String login_user = null;
    String password_user = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/users_db"+
                "?verifyServerCertificate=false"+
                "&useSSL=false"+
                "&requireSSL=false"+
                "&useLegacyDatetimeCode=false"+
                "&amp"+
                "&serverTimezone=UTC";
        connection = DriverManager.getConnection(url, "root", "root");
    } catch (Exception e){
        System.err.println(e);
    }
    ResultSet users_list = null;
    try {
        login_user = request.getParameter("login");
        password_user = request.getParameter("password");
        Statement s = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into besuchsprotokoll(id_user,times,ip) values(?,?,?);");
        users_list = s.executeQuery("SELECT * FROM users;");
        boolean check=false;
        while (users_list.next()) {

            if ((login_user.equals(users_list.getString("logins")))&(password_user.equals(users_list.getString("passwords")))) {
                String str = "Здравствуйте, " + users_list.getString("fio");
                int id = users_list.getInt(1);
%> <%=str %> <%
            check = true;
            InetAddress addr = InetAddress.getLocalHost();
            String ip = addr.getHostAddress();
            Calendar calendar = Calendar.getInstance();
            Date time = calendar.getTime();
            String time_login = time.toString();
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2, time_login);
            preparedStatement.setString(3, ip);
            preparedStatement.executeUpdate();
        }
    }
    if (!check) { %> Ошибка ввода логина или пароля
<br> <a href="http://localhost:8080/Authorization_war_exploded/index.jsp">Назад</a>
<% }
} catch (Exception e) {
    System.out.println(e);}
%>
</body>
</html>
