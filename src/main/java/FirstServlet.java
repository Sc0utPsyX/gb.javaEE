
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;


public class FirstServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().printf("<html><body>");
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Bread"));
        products.add(new Product("Egg"));
        products.add(new Product("Lettuce"));
        products.add(new Product("Tomatoes"));
        products.add(new Product("Milk"));
        products.add(new Product("Cucumber"));
        products.add(new Product("Peperoni"));
        products.add(new Product("Pizza"));
        products.add(new Product("Dumplings"));
        products.add(new Product("Burger"));
        for (Product product: products) {
            resp.getWriter().printf(String.format("<p>" + product.toString() + "</p>"));
        }
        resp.getWriter().printf("</html></body>");
        resp.getWriter().close();
    }
}



