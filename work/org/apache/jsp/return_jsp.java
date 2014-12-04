package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.sql.*;
import java.text.*;
import javax.naming.*;
import javax.sql.*;

public final class return_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");

  request.setCharacterEncoding("Windows-31J");
  response.setCharacterEncoding("Windows-31J");

      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"Windows-31J\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Book On</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"css/jumbotron.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    function toggleAll(source) {\r\n");
      out.write("      checkboxes = document.getElementsByName('bk_id');\r\n");
      out.write("      for(var i=0; i < checkboxes.length; i++) {\r\n");
      out.write("        checkboxes[i].checked = source.checked;\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    ");

      String email = request.getParameter("email");
      String login_pass = request.getParameter("password");

      if((email != null || email != "") && (login_pass != null || login_pass != "")){
        Context context = new InitialContext();
        DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/bookon");
        Connection db = ds.getConnection();
        db.setReadOnly(true);
        Statement objSql=db.createStatement();
        String login_query = ("SELECT * FROM user_data WHERE email = '" + email + "' AND password = HASHBYTES('SHA2_256', '" + login_pass + "')");
        ResultSet rs=objSql.executeQuery(login_query);

        if(rs.next()){
                //セッションを一度破棄
                session.invalidate();
                //セッション再生成
                session = request.getSession();
                //セッションへ保存
                session.setAttribute("email", email);
                //画面遷移
                response.sendRedirect("./index.jsp");
            }
        rs.close();
        objSql.close();
        db.close();
        }
    
      out.write("\r\n");
      out.write("    <div class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"index.jsp\">Book On</a>\r\n");
      out.write("          <ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t    \t\t<li><a href=\"\">about</a></li>\r\n");
      out.write("\t\t    \t\t<li><a href=\"\">contact</a></li>\r\n");
      out.write("            <li><a href=\"\">");
      out.print( new Date() );
      out.write("</a></li>\r\n");
      out.write("\t\t      </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("              ");
if((session.getAttribute("login") == null) || !session.getAttribute("login").equals("true")){
      out.write("\r\n");
      out.write("              <form class=\"navbar-form navbar-right\" role=\"form\" method=\"post\" action=\"authentication.jsp\">\r\n");
      out.write("              <div class=\"form-group ");
if (session.getAttribute("login") != null &&
          !session.getAttribute("login").equals("true")){
      out.write("has-error has-feedback");
}
      out.write("\">\r\n");
      out.write("              <input type=\"text\" name='email' placeholder=\"Email\" class=\"form-control\">\r\n");
      out.write("              ");
if (session.getAttribute("login") != null &&
                  !session.getAttribute("login").equals("true")){
      out.write("\r\n");
      out.write("                  <span class=\"glyphicon glyphicon-remove form-control-feedback\"></span>\r\n");
      out.write("                  ");
}
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group ");
if (session.getAttribute("login") != null &&
          !session.getAttribute("login").equals("true")){
      out.write("has-error has-feedback");
}
      out.write("\">\r\n");
      out.write("                <input type=\"password\" name='pass' placeholder=\"Password\" class=\"form-control\">\r\n");
      out.write("                ");
if (session.getAttribute("login") != null &&
                  !session.getAttribute("login").equals("true")){
      out.write("\r\n");
      out.write("                  <span class=\"glyphicon glyphicon-remove form-control-feedback\"></span>\r\n");
      out.write("                  ");
}
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-success\">ログイン</button>\r\n");
      out.write("              </form>\r\n");
      out.write("              ");
}else{
      out.write("\r\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                  <li><a href=\"#\">");
      out.print(session.getAttribute("email"));
      out.write("</a></li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                      <form class=\"navbar-form navbar-right\" role=\"form\" method=\"post\" action=\"SignOut\">\r\n");
      out.write("                      <button type=\"submit\" class=\"btn btn-success\">ログアウト</button>\r\n");
      out.write("                      </form>\r\n");
      out.write("                  </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("              ");
}
      out.write("\r\n");
      out.write("          </div><!--/.navbar-collapse -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"col-sm-2\" style=\"background:white;\">\r\n");
      out.write("        <form class=\"form\" name=\"item_state_form\" role=\"form\" action=\"./return.jsp\">\r\n");
      out.write("          <div class=\"btn-group-vertical btn-block\">\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-default btn-block\">");
if((session.getAttribute("login") != null) && session.getAttribute("login").equals("true")){
      out.print(session.getAttribute("last_name"));
      out.write(' ');
      out.print(session.getAttribute("first_name"));
      out.write(' ');
      out.write('さ');
      out.write('ん');
}else{
      out.write('全');
      out.write('体');
}
      out.write("</button>\r\n");
      out.write("            ");

            Context context = new InitialContext();
            DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/bookon");
            Connection db = ds.getConnection();
            db.setReadOnly(true);
            Statement objSql7=db.createStatement();
            String countQuery = "SELECT COUNT(*) AS number FROM item_state WHERE return_date IS NULL";
            if((session.getAttribute("login") != null) && session.getAttribute("login").equals("true"))
              {
                countQuery += " AND id = '" + session.getAttribute("id") + "'";
              }
            ResultSet rs7=objSql7.executeQuery(countQuery);
            while(rs7.next()){
            
      out.write("\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-default btn-block\">貸出中書籍 <span class=\"badge pull-right\">");
      out.print(rs7.getInt("number"));
      out.write("</span></button>\r\n");
      out.write("            ");

            }
            rs7.close();
            objSql7.close();

            Statement objSql8=db.createStatement();
            String overdueQuery = "SELECT COUNT(*) AS number FROM item_state WHERE return_date IS NULL AND estimate_return_date < DATEDIFF(day, 1, GETDATE())";
            if((session.getAttribute("login") != null) && session.getAttribute("login").equals("true"))
              {
                overdueQuery += " AND id = '" + session.getAttribute("id") + "'";
              }
            ResultSet rs8=objSql8.executeQuery(overdueQuery);
            while(rs8.next()){
            
      out.write("\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-default btn-block\">貸出期限超過 <span class=\"badge pull-right\">");
      out.print(rs8.getInt("number"));
      out.write("</span></button>\r\n");
      out.write("            ");

            }
            
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("          ");
if((session.getAttribute("login") != null) && session.getAttribute("login").equals("true")){
      out.write("\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-danger btn-block\" onClick=\"return document.forms['lend'].submit()\">返却</button>\r\n");
      out.write("          ");
}
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-sm-10\" style=\"background:white;\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("          <!-- Default panel contents -->\r\n");
      out.write("          <form class=\"form\" name=\"lend\" role=\"form\" action=\"ReturnTransaction\">\r\n");
      out.write("            <div class=\"panel-heading\">貸出中書籍</div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Table -->\r\n");
      out.write("            <table class=\"table\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th>#</th>\r\n");
      out.write("                ");
if((session.getAttribute("login") != null) && session.getAttribute("login").equals("true")){
      out.write("\r\n");
      out.write("                <th>\r\n");
      out.write("                  <div class=\"checkbox\">\r\n");
      out.write("                      <input type=\"checkbox\" onClick=\"toggleAll(this)\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </th>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("                <th>書籍名</th>\r\n");
      out.write("                <th>出版社</th>\r\n");
      out.write("                <th>貸出日</th>\r\n");
      out.write("                <th>返却予定日</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");

              String query = "SELECT item_state.bk_id, bk_name, pub_name, lend_date, estimate_return_date FROM item_state INNER JOIN (SELECT bk_id, bk_name, pub_name FROM books_data bd INNER JOIN pub_master pm ON bd.pub_id = pm.pub_id) AS books_and_pub_data ON item_state.bk_id = books_and_pub_data.bk_id WHERE return_date IS NULL";
              if(session.getAttribute("id") != null)
                {
                  query += " AND id = '" + session.getAttribute("id") + "'";
                }

                Statement objSql2=db.createStatement();
                ResultSet rs2=objSql2.executeQuery(query);
                while(rs2.next()){
              
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>");
      out.print(rs2.getString("bk_id"));
      out.write("</td>\r\n");
      out.write("                  ");
if((session.getAttribute("login") != null) && session.getAttribute("login").equals("true")){
      out.write("\r\n");
      out.write("                  <td>\r\n");
      out.write("                    <div class=\"checkbox\">\r\n");
      out.write("                        <input type=\"checkbox\" name=\"bk_id\" value='");
      out.print(rs2.getString("bk_id"));
      out.write("'>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </td>\r\n");
      out.write("                  ");
}
      out.write("\r\n");
      out.write("                  <td>");
      out.print(rs2.getString("bk_name"));
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(rs2.getString("pub_name"));
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(rs2.getDate("lend_date"));
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(rs2.getDate("estimate_return_date"));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              ");

              }
              rs2.close();
              objSql2.close();
              
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"col-sm-2\" style=\"background:white;\"></div>\r\n");
      out.write("      <div class=\"col-sm-10\" style=\"background:white;\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("          <!-- Default panel contents -->\r\n");
      out.write("          <form class=\"form\" name=\"overdue\" role=\"form\" action=\"./lend.jsp\">\r\n");
      out.write("            <div class=\"panel-heading\">貸出期限超過書籍</div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Table -->\r\n");
      out.write("            <table class=\"table\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th>#</th>\r\n");
      out.write("                <th>書籍名</th>\r\n");
      out.write("                <th>出版社</th>\r\n");
      out.write("                <th>貸出日</th>\r\n");
      out.write("                <th>返却予定日</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");

              String overdue_query = "SELECT item_state.bk_id, bk_name, pub_name, lend_date, estimate_return_date FROM item_state INNER JOIN (SELECT bk_id, bk_name, pub_name FROM books_data bd INNER JOIN pub_master pm ON bd.pub_id = pm.pub_id) AS books_and_pub_data ON item_state.bk_id = books_and_pub_data.bk_id WHERE return_date IS NULL　AND estimate_return_date < DATEDIFF(day, 1, GETDATE())";
              if(session.getAttribute("id") != null)
                {
                  overdue_query += " AND id = '" + session.getAttribute("id") + "'";
                }

                Statement objSql3=db.createStatement();
                ResultSet rs3=objSql3.executeQuery(overdue_query);
                while(rs3.next()){
              
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>");
      out.print(rs3.getString("bk_id"));
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(rs3.getString("bk_name"));
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(rs3.getString("pub_name"));
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(rs3.getDate("lend_date"));
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(rs3.getDate("estimate_return_date"));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              ");

              }
              rs3.close();
              objSql3.close();
              db.close();
              
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
