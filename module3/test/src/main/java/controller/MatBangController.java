package controller;

import Model.MatBang;
import Service.impl.MatBangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MatBangController", urlPatterns = "/matbang")
public class MatBangController extends HttpServlet {
    private MatBangService matBangService = new MatBangService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                    showCreateForm(request, response);
                break;

            case "delete":
//                    showDeleteForm(request, response);
                break;
            case "search":
                break;
            default:
                    displayAll(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                    create(request, response);
                break;
            case "delete":
//                    delete(request, response);
                break;
            case "search":

                break;
            default:
                break;
        }
    }
    private void displayAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<MatBang> matBangList = matBangService.getList();
        request.setAttribute("matBangList", matBangList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("matbang/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/matbang/create.jsp").forward(request, response);
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String status = request.getParameter("status");
        double area = Double.parseDouble(request.getParameter("area"));
        int floor =Integer.parseInt(request.getParameter("floor"));
//
//        MatBang matBang =new MatBang(id,status,area, floor,type,price, dateStart,dateEnd);
//        matBangService.create(matBang);
        request.getRequestDispatcher("customer/create.jsp").forward(request, response);
    }
}
