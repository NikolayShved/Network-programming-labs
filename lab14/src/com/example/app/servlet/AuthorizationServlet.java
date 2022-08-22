package com.example.app.servlet;

import com.example.app.bean.AuthorizationBean;
import com.example.app.database.AuthorizationDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthorizationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private AuthorizationDao authorizationDao;

    public void init() {
        authorizationDao = new AuthorizationDao();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        AuthorizationBean authorizationBean = new AuthorizationBean();
        authorizationBean.setLogin(login);
        authorizationBean.setPassword(password);

        try {
            if (authorizationDao.validate(authorizationBean)) {
                response.sendRedirect("home?login="+ login);
            } else {
                request.setAttribute("error", "Unknown user, please try again");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
