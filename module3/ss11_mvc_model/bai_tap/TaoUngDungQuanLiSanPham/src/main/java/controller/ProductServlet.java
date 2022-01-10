package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductService products = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                updateProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "find":
                findProduct(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        display(request, response);
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                showCreateForm(request, response);
                break;
            }
            case "update":
                showEditForm(request, response);
                break;

            case "delete":
                showDeleteFrom(request, response);
                break;

            case "view":
                viewProduct(request, response);

            case "find":
                showFindForm(request, response);
                break;
            default:
                display(request, response);
                break;
        }
    }

    private void display(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = products.findAll();
        request.setAttribute("products", productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = this.products.findById(id);
        RequestDispatcher dispatcher;
        req.setAttribute("product", product);
        dispatcher = req.getRequestDispatcher("product/edit.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showDeleteFrom(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));

        Product product = this.products.findById(id);
        RequestDispatcher dispatcher;
        req.setAttribute("product", product);
        dispatcher = req.getRequestDispatcher("product/delete.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void viewProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product myProduct = this.products.findById(id);
        RequestDispatcher dispatcher;
        request.setAttribute("product", myProduct);
        dispatcher = request.getRequestDispatcher("product/view.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFindForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("product/find.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    static int id = 0;

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        id++;
        String name = request.getParameter("name");
        int amount = Integer.parseInt(request.getParameter("amount"));
        double price = Double.parseDouble(request.getParameter("amount"));
        String descripton = request.getParameter("description");
        Product product = new Product(id, name, amount, price, descripton);
        products.save(product);
        request.setAttribute("msg", "New product was created");
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int amount = Integer.parseInt(request.getParameter("amount"));
        double price = Double.parseDouble(request.getParameter("amount"));
        String desc = request.getParameter("description");
        RequestDispatcher dispatcher;
        Product myProduct = products.findById(id);
        myProduct.setName(name);
        myProduct.setAmount(amount);
        myProduct.setPrice(price);
        myProduct.setDescript(desc);
        products.update(id, myProduct);
        request.setAttribute("product", myProduct);
        dispatcher = request.getRequestDispatcher("product/update.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.products.findById(id);
        RequestDispatcher dispatcher;
        this.products.remove(id);
        try {
            response.sendRedirect("/products");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findProduct(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        Product product = this.products.findByName(name);
        req.setAttribute("product", product);
        RequestDispatcher dispatcher = req.getRequestDispatcher("product/view.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


}


