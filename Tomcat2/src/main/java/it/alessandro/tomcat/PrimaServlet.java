package it.alessandro.tomcat;
import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimaServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Writer w = resp.getWriter();
        
        w.write("<html>");
        w.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        w.write("<style>"
                + ".footer {"
                + "position: fixed;"
                + "left: 0;"
                + " bottom: 0;"
                + "width: 100%;"
                + "background-color: #04AA6D;"
                + "color: white;"
                + "text-align: center;"
                + "     }"
                + "</style>"); 
        w.write("<style>\r\n"
        		+ "body {\r\n"
        		+ "  margin: 0;\r\n"
        		+ "  font-family: Arial, Helvetica, sans-serif;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".topnav {\r\n"
        		+ "  overflow: hidden;\r\n"
        		+ "  background-color: #333;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".topnav a {\r\n"
        		+ "  float: left;\r\n"
        		+ "  color: #f2f2f2;\r\n"
        		+ "  text-align: center;\r\n"
        		+ "  padding: 14px 16px;\r\n"
        		+ "  text-decoration: none;\r\n"
        		+ "  font-size: 17px;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".topnav a:hover {\r\n"
        		+ "  background-color: #ddd;\r\n"
        		+ "  color: black;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".topnav a.active {\r\n"
        		+ "  background-color: #04AA6D;\r\n"
        		+ "  color: white;\r\n"
        		+ "}\r\n"
        		+ "</style>");
        w.write("<style>\r\n"
        		+ "body {\r\n"
        		+ "  font-family: 'Lato', sans-serif;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".overlay {\r\n"
        		+ "  height: 63.7%;\r\n"
        		+ "  width: 0;\r\n"
        		+ "  position: relative;\r\n"
        		//+ "  z-index: 1;\r\n"
        		+ "  top: 0;\r\n"
        		+ "  left: 0;\r\n"
        		+ "  background-color: rgb(51,51,51);\r\n"
        		+ "  background-color: rgba(51,51,51,1);\r\n"
        		+ "  overflow-x: hidden;\r\n"
        		+ "  transition: 0.5s;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".overlay-content {\r\n"
        		+ "  position: relative;\r\n"
        		+ "  top: 25%;\r\n"
        		+ "  width: 100%;\r\n"
        		+ "  text-align: center;\r\n"
        		+ "  margin-top: 30px;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".overlay a {\r\n"
        		+ "  padding: 8px;\r\n"
        		+ "  text-decoration: none;\r\n"
        		+ "  font-size: 36px;\r\n"
        		+ "  color: #818181;\r\n"
        		+ "  display: block;\r\n"
        		+ "  transition: 0.3s;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".overlay a:hover, .overlay a:focus {\r\n"
        		+ "  color: #f1f1f1;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".overlay .closebtn {\r\n"
        		+ "  position: absolute;\r\n"
        		+ "  top: 20px;\r\n"
        		+ "  right: 45px;\r\n"
        		+ "  font-size: 60px;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "@media screen and (max-height: 450px) {\r\n"
        		+ "  .overlay a {font-size: 20px}\r\n"
        		+ "  .overlay .closebtn {\r\n"
        		+ "  font-size: 40px;\r\n"
        		+ "  top: 15px;\r\n"
        		+ "  right: 35px;\r\n"
        		+ "  }\r\n"
        		+ "}"
        		+ "</style>");
        w.write("<title>Prima pagina web (Java)</title>");
        w.write("<body style=\'background-color:powderblue;\'>>");
        w.write("<header>");
        w.write("<h1 align=center>PRIMO PROGRAMMA\n</h1>");
        w.write("</header>");
        w.write("<h1 align=center>Benvenuto\n</h1>");
        w.write("<h2 align=center>Selezionare opzione\n</h2>");
        w.write("<div class='topnav'>"
        		+"<a class='active' href='#home'>Home</a>"
        		+"<a href='#Login'>Login</a>"
        		+"<a href='#Register'>Register</a>"
        		+"<a href='#News'>News</a>"
        		+"<a href='#About'>About</a>"
        		+"<a href='#Credits'>Credits</a>"
        		+"</div>");
        w.write("<center><span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">&#9776; Opzioni</span></center>");
        //w.write("<div>");
        w.write("<div id=\"myNav\" class=\"overlay\">\r\n"
        		+ "  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n"
        		+ "  <div class=\"overlay-content\">\r\n"
        		+ "    <a href=\"#\">Inserisci</a>\r\n"
        		+ "    <a href=\"#\">Modifica</a>\r\n"
        		+ "    <a href=\"#\">Cancella</a>\r\n"
        		+ "    <a href=\"#\">Logout</a>\r\n"
        		+ "  </div>\r\n"
        		+ "</div>");
        //w.write("</div>");
        w.write("<script>\r\n"
        		+ "function openNav() {\r\n"
        		+ "  document.getElementById(\"myNav\").style.width = \"100%\";\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "function closeNav() {\r\n"
        		+ "  document.getElementById(\"myNav\").style.width = \"0%\";\r\n"
        		+ "}\r\n"
        		+ "</script>");
        w.write("<div class='footer'>"
        		+ "<p>Prima pagina html con Java - 19/10/2022</p>"
        		+ "</div>");
        w.write("</body>");
        w.write("</html>");
        w.flush();
        w.close();
    }
	
	
}
