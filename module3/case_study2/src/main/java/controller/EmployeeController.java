package controller;


import model.Customer;
import service.impl.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeController", urlPatterns = "/employee")
public class EmployeeController extends HttpServlet {
    //    private IEmployeeService iEmployeeService = new EmployeeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
 //       String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//                   createEmployee(request, response);
                break;
            case "update":
//                  updateEmployee(request, response);
                break;
            case "delete":
//                 deleteEmployee(request, response);
                break;
            case "search":
                break;
            default:
                break;
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
   //                 showCreateForm(request, response);
                    break;
                case "update":
   //                 showUpdateForm(request, response);
                    break;
                case "delete":
      //              showDeleteForm(request, response);
                    break;
                case "search":
                    break;
                case "view":
                    break;
                default:
                    displayAllEmployee(request, response);
                    break;
            }
        } catch (ServletException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private void displayAllEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      //  List<Customer> employee = EmployeeService.getEmployeeList();
//        request.setAttribute("employees", employees);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("employeer/list.jsp");
//        dispatcher.forward(request, response);
    }
}
