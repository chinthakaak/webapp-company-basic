package com.company.controller;

import com.company.model.CompanyModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ka40215 on 12/26/15.
 */
public class CompanyFrontControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CompanyModel company = new CompanyModel();
//        req.setAttribute("message", company.getMessage());
//        RequestDispatcher view = req.getRequestDispatcher("view/jsp/ViewCompany.jsp");
//        view.forward(req, resp);

        RequestDispatcher view = req.getRequestDispatcher("view/html/company-home.html");
        view.forward(req, resp);
    }
}
