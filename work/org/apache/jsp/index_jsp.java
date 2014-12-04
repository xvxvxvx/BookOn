package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.sql.*;
import java.text.*;
import javax.naming.*;
import javax.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    ");

      String enable_pub_name = request.getParameter("enable_pub_name");
      String pub_name = request.getParameter("pub_name");
      String name = request.getParameter("name");
      String writer = request.getParameter("writer");
      String isbn = request.getParameter("isbn");
      String below_price = request.getParameter("below_price");
      String above_price = request.getParameter("above_price");
      String large_id = request.getParameter("large_id");
      String middle_id = request.getParameter("middle_id");
      String small_id = request.getParameter("small_id");
      String email = request.getParameter("email");
      String login_pass = request.getParameter("password");

      if((email != null || email != "") && (login_pass != null || login_pass != "")){
        Context context = new InitialContext();
        DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/bookon");
        Connection db6 = ds.getConnection();
        db6.setReadOnly(true);
        Statement objSql6=db6.createStatement();
        String login_query = ("SELECT * FROM user_data WHERE email = '" + email + "' AND password = HASHBYTES('SHA2_256', '" + login_pass + "')");
        ResultSet rs6=objSql6.executeQuery(login_query);

        if(rs6.next()){
                //セッションを一度破棄
                session.invalidate();
                //セッション再生成
                session = request.getSession();
                //セッションへ保存
                session.setAttribute("email", email);
                //画面遷移
                response.sendRedirect("./index.jsp");
            }
        rs6.close();
        objSql6.close();
        db6.close();
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
      out.write("          <a class=\"navbar-brand\" href=\"#\" onClick=\"clearAll()\">Book On</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t    \t\t<li><a href=\"\">about</a></li>\r\n");
      out.write("\t\t    \t\t<li><a href=\"\">contact</a></li>\r\n");
      out.write("            <li><a href=\"\">");
      out.print( new Date() );
      out.write("</a></li>\r\n");
      out.write("\t\t      </ul>\r\n");
      out.write("          ");
if((session.getAttribute("login") == null) || !session.getAttribute("login").equals("true")){
      out.write("\r\n");
      out.write("          <form class=\"navbar-form navbar-right\" role=\"form\" method=\"post\" action=\"Authentication\">\r\n");
      out.write("          <div class=\"form-group ");
if (session.getAttribute("login") != null &&
      !session.getAttribute("login").equals("true")){
      out.write("has-error has-feedback");
}
      out.write("\">\r\n");
      out.write("          <input type=\"text\" name='email' placeholder=\"Email\" class=\"form-control\">\r\n");
      out.write("          ");
if (session.getAttribute("login") != null &&
              !session.getAttribute("login").equals("true")){
      out.write("\r\n");
      out.write("              <span class=\"glyphicon glyphicon-remove form-control-feedback\"></span>\r\n");
      out.write("              ");
}
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group ");
if (session.getAttribute("login") != null &&
      !session.getAttribute("login").equals("true")){
      out.write("has-error has-feedback");
}
      out.write("\">\r\n");
      out.write("            <input type=\"password\" name='pass' placeholder=\"Password\" class=\"form-control\">\r\n");
      out.write("            ");
if (session.getAttribute("login") != null &&
              !session.getAttribute("login").equals("true")){
      out.write("\r\n");
      out.write("              <span class=\"glyphicon glyphicon-remove form-control-feedback\"></span>\r\n");
      out.write("              ");
}
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-success\">ログイン</button>\r\n");
      out.write("          <!-- Button trigger modal -->\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-success\" data-toggle=\"modal\" data-target=\"#myModal\">登録\r\n");
      out.write("          </button>\r\n");
      out.write("          </form>\r\n");
      out.write("          ");
}else{
      out.write("\r\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("              <li><a href=\"#\">");
      out.print(session.getAttribute("email"));
      out.write("</a></li>\r\n");
      out.write("              <li>\r\n");
      out.write("                  <form class=\"navbar-form navbar-right\" role=\"form\" method=\"post\" action=\"SignOut\">\r\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-success\">ログアウト</button>\r\n");
      out.write("                  </form>\r\n");
      out.write("              </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          ");
}
      out.write("\r\n");
      out.write("        </div><!--/.navbar-collapse -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Modal -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("      <div class=\"modal-dialog\">\r\n");
      out.write("        <form class=\"form-horizontal register_form\" method=\"POST\" name=\"register_form\" role=\"form\" action=\"RegisterTransaction\">\r\n");
      out.write("          <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("              <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("              <h4 class=\"modal-title\" id=\"myModalLabel\">ユーザー登録</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"register_id\" class=\"col-md-4 control-label\">ID</label>\r\n");
      out.write("                  <div class=\"col-md-6\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"register_id\" maxlength=\"4\" placeholder=\"ID\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"register_last_name\" class=\"col-md-4 control-label\">名前</label>\r\n");
      out.write("                  <div class=\"col-md-3\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"register_last_name\" placeholder=\"姓\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-md-3\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"register_first_name\" placeholder=\"名\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"register_email\" class=\"col-md-4 control-label\">メールアドレス</label>\r\n");
      out.write("                  <div class=\"col-md-6\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"register_email\" maxlength=\"100\" placeholder=\"Email\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"register_password\" class=\"col-md-4 control-label\">パスワード</label>\r\n");
      out.write("                  <div class=\"col-md-6\">\r\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"register_password\" placeholder=\"Password\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"confirm_register_password\" class=\"col-md-4 control-label\">パスワード再入力</label>\r\n");
      out.write("                  <div class=\"col-md-6\">\r\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"confirm_register_password\" placeholder=\"Password\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-success\" name=\"register\">登録</button>\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">閉じる</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <form class=\"form search_form\" name=\"search_form\" role=\"form\" action=\"SearchBooks\">\r\n");
      out.write("          <div class=\"col-sm-2\" style=\"background:white;\">\r\n");
      out.write("            <div class=\"btn-group-vertical btn-block\" data-toggle=\"buttons\">\r\n");
      out.write("              <label class=\"btn btn-primary\">\r\n");
      out.write("                <input type=\"radio\" autocomplete=\"off\">大分類\r\n");
      out.write("              </label>\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-sm-2\" style=\"background:white;\">\r\n");
      out.write("            <div class=\"btn-group-vertical btn-block\" data-toggle=\"buttons\">\r\n");
      out.write("              <label class=\"btn btn-success\">\r\n");
      out.write("                <input type=\"radio\" autocomplete=\"off\">中分類\r\n");
      out.write("              </label>\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-sm-2\" style=\"background:white;\">\r\n");
      out.write("            <div class=\"btn-group-vertical btn-block\" data-toggle=\"buttons\">\r\n");
      out.write("              <label class=\"btn btn-danger\">\r\n");
      out.write("                <input type=\"radio\" autocomplete=\"off\">小分類\r\n");
      out.write("              </label>\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-sm-2\" style=\"background:white;\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <div class=\"checkbox\">\r\n");
      out.write("                <label>\r\n");
      out.write("                \t");
      if (_jspx_meth_c_005fchoose_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </label>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <select id=\"pub_name\" name=\"pub_name\" size =\"14\" class=\"form-control\">\r\n");
      out.write("            \t");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-sm-2\" style=\"background:white;\">\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\"><span class=\"glyphicon glyphicon-book\"></span></div>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"name\" value='");
if (name != null){
      out.print(name);
}
      out.write("' placeholder=\"書籍名\">\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\"><span class=\"glyphicon glyphicon-user\"></span></div>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"writer\" value='");
if (writer != null){
      out.print(writer);
}
      out.write("' placeholder=\"著者\">\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\"><span class=\"glyphicon glyphicon-barcode\"></span></div>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"isbn\" value='");
if (isbn != null){
      out.print(isbn);
}
      out.write("' placeholder=\"ISBN\">\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\"><span class=\"glyphicon glyphicon-usd\"></span></div>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"below_price\" value='");
if (below_price != null){
      out.print(below_price);
}
      out.write("' placeholder=\"価格\">\r\n");
      out.write("                  <div class=\"input-group-addon\">以下</span></div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                  <div class=\"input-group-addon\"><span class=\"glyphicon glyphicon-usd\"></span></div>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"above_price\" value='");
if (above_price != null){
      out.print(above_price);
}
      out.write("' placeholder=\"価格\">\r\n");
      out.write("                  <div class=\"input-group-addon\">以上</span></div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\">検索</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <div class=\"col-sm-2\" style=\"background:white;\">\r\n");
      out.write("          <form class=\"form\" name=\"item_state_form\" role=\"form\" action=\"./return.jsp\">\r\n");
      out.write("            <div class=\"btn-group-vertical btn-block\">\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-default btn-block\">");
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
      out.write("              ");

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
      out.write("                <button type=\"submit\" class=\"btn btn-default btn-block\">貸出中書籍 <span class=\"badge pull-right\">");
      out.print(rs7.getInt("number"));
      out.write("</span></button>\r\n");
      out.write("              ");

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
      out.write("              <button type=\"submit\" class=\"btn btn-default btn-block\">貸出期限超過 <span class=\"badge pull-right\">");
      out.print(rs8.getInt("number"));
      out.write("</span></button>\r\n");
      out.write("              ");

              }
              
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"panel panel-default\">\r\n");
      out.write("        <!-- Default panel contents -->\r\n");
      out.write("        <form class=\"form\" name=\"book_table\" role=\"form\" action=\"LendTransaction\">\r\n");
      out.write("          <div class=\"panel-heading\">検索結果\r\n");
      out.write("            <div class=\"form-group pull-right\">\r\n");
      out.write("              <button type=\"button\" name=\"pdf\" class=\"btn btn-danger\" onClick =\"createPDF()\">PDF</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Table -->\r\n");
      out.write("          <table class=\"table\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>#</th>\r\n");
      out.write("              <th>書籍名</th>\r\n");
      out.write("              <th>著者</th>\r\n");
      out.write("              <th>出版社</th>\r\n");
      out.write("              <th>発行年</th>\r\n");
      out.write("              <th>ISBN</th>\r\n");
      out.write("              <th>価格</th>\r\n");
      out.write("              <th>貸出状況</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

            String query = "SELECT books_data.bk_id, bk_name, writer, pub_name, pub_date, isbn_no, price, state = CASE WHEN lend_date IS NOT NULL AND return_date IS NULL THEN 'false' ELSE 'true' END FROM books_data LEFT OUTER JOIN item_state ON books_data.bk_id = item_state.bk_id, pub_master WHERE pub_master.pub_id = books_data.pub_id";
            if((pub_name != "") && (enable_pub_name != null))
            {
              query += (" AND pub_name = '" + pub_name + "'");
            }
            if(name != null && name !="")
            {
              query += (" AND bk_name LIKE '%" + name + "%'");
            }
            if(writer != null && writer !="")
            {
              query += (" AND writer LIKE '%" + writer + "%'");
            }
            if(isbn != null && isbn !="")
            {
              query += (" AND isbn_no = '" + isbn + "'");
            }
            if(below_price != null && below_price !="")
            {
              query += (" AND price <= " + below_price);
            }
            if(above_price != null && above_price !="")
            {
              query += (" AND price >= " + above_price);
            }
            if(large_id != null && large_id !="")
            {
              query += (" AND books_data.bk_id LIKE '" + large_id + "%'");
            }
            if(middle_id != null && middle_id !="")
            {
              query += (" AND books_data.bk_id LIKE '_" + middle_id + "%'");
            }
            if(small_id != null && small_id !="")
            {
              query += (" AND books_data.bk_id LIKE '__" + small_id + "%'");
            }
              session.setAttribute("large_id", large_id);
              session.setAttribute("middle_id", middle_id);
              session.setAttribute("small_id", small_id);
              session.setAttribute("search_query", query);
              Statement objSql5=db.createStatement();
              ResultSet rs5=objSql5.executeQuery(query);
              while(rs5.next()){
            
      out.write("\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>");
      out.print(rs5.getString("bk_id"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(rs5.getString("bk_name"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(rs5.getString("writer"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(rs5.getString("pub_name"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(rs5.getDate("pub_date"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(rs5.getString("isbn_no"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(rs5.getInt("price"));
      out.write("</td>\r\n");
      out.write("                <td>");
if(rs5.getString("state").equals("true")){
      out.write("<button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\" ");
if((session.getAttribute("login") == null) || !session.getAttribute("login").equals("true")){
      out.write("disabled=disabled");
}
      out.write(" name=\"bk_id\" value=\"");
      out.print(rs5.getString("bk_id"));
      out.write("\" onClick=\"return confirm('");
      out.print(rs5.getString("bk_name"));
      out.write("を借りますか？')\">貸出可</button>");
}else{
      out.write("<button type=\"button\" class=\"btn btn-danger btn-lg btn-block\">貸出中</button>");
}
      out.write("</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            ");

            }
            rs5.close();
            objSql5.close();
            db.close();
            
      out.write("\r\n");
      out.write("          </table>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrapValidator.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    var wrapperSubmit = function(callObj) {\r\n");
      out.write("\r\n");
      out.write("      var large_id = document.getElementsByName('large_id');\r\n");
      out.write("      var middle_id = document.getElementsByName('middle_id');\r\n");
      out.write("      var small_id = document.getElementsByName('small_id');\r\n");
      out.write("      var large_id_is_not_checked = true;\r\n");
      out.write("      var middle_id_is_not_checked = true;\r\n");
      out.write("\r\n");
      out.write("      if (callObj.name == 'large_id') {\r\n");
      out.write("        for(var i=0; i < middle_id.length; i++)\r\n");
      out.write("        {\r\n");
      out.write("        middle_id[i].checked = false;\r\n");
      out.write("        }\r\n");
      out.write("        for(var i=0; i < small_id.length; i++)\r\n");
      out.write("        {\r\n");
      out.write("        small_id[i].checked = false;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      if (callObj.name == 'middle_id') {\r\n");
      out.write("        for(var i=0; i < small_id.length; i++)\r\n");
      out.write("        {\r\n");
      out.write("        small_id[i].checked = false;\r\n");
      out.write("        }\r\n");
      out.write("        for(var i=0; i < large_id.length; i++)\r\n");
      out.write("        {\r\n");
      out.write("          if(large_id[i].checked == true)\r\n");
      out.write("          {\r\n");
      out.write("            large_id_is_not_checked = false;\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("        if(large_id_is_not_checked == true) {\r\n");
      out.write("          large_id[0].checked = true;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      if (callObj.name == 'small_id') {\r\n");
      out.write("        for(var i=0; i < large_id.length; i++)\r\n");
      out.write("        {\r\n");
      out.write("          if(large_id[i].checked == true)\r\n");
      out.write("          {\r\n");
      out.write("            large_id_is_not_checked = false;\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("        if(large_id_is_not_checked == true) {\r\n");
      out.write("          large_id[0].checked = true;\r\n");
      out.write("        }\r\n");
      out.write("        for(var i=0; i < middle_id.length; i++)\r\n");
      out.write("        {\r\n");
      out.write("          if(middle_id[i].checked == true)\r\n");
      out.write("          {\r\n");
      out.write("            middle_id_is_not_checked = false;\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("        if(middle_id_is_not_checked == true) {\r\n");
      out.write("          middle_id[0].checked = true;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      document.forms['search_form'].submit();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function clearAll() {\r\n");
      out.write("      var large_id = document.getElementsByName('large_id');\r\n");
      out.write("      var middle_id = document.getElementsByName('middle_id');\r\n");
      out.write("      var small_id = document.getElementsByName('small_id');\r\n");
      out.write("\r\n");
      out.write("      for(var i=0; i < large_id.length; i++)\r\n");
      out.write("        {\r\n");
      out.write("          large_id[i].checked = false;\r\n");
      out.write("        }\r\n");
      out.write("        for(var i=0; i < middle_id.length; i++)\r\n");
      out.write("        {\r\n");
      out.write("          middle_id[i].checked = false;\r\n");
      out.write("        }\r\n");
      out.write("        for(var i=0; i < small_id.length; i++)\r\n");
      out.write("        {\r\n");
      out.write("          small_id[i].checked = false;\r\n");
      out.write("        }\r\n");
      out.write("        document.forms['search_form'].submit();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        $('.register_form').bootstrapValidator({\r\n");
      out.write("            live: 'disabled',\r\n");
      out.write("            message: 'This value is not valid',\r\n");
      out.write("            feedbackIcons: {\r\n");
      out.write("                valid: 'glyphicon glyphicon-ok',\r\n");
      out.write("                invalid: 'glyphicon glyphicon-remove',\r\n");
      out.write("                validating: 'glyphicon glyphicon-refresh'\r\n");
      out.write("            },\r\n");
      out.write("            fields: {\r\n");
      out.write("                register_id: {\r\n");
      out.write("                    message: 'ID is not valid',\r\n");
      out.write("                    validators: {\r\n");
      out.write("                        notEmpty: {\r\n");
      out.write("                            message: 'IDを入力してください'\r\n");
      out.write("                        },\r\n");
      out.write("                        stringLength: {\r\n");
      out.write("                            min: 4,\r\n");
      out.write("                            max: 4,\r\n");
      out.write("                            message: '有効なIDを入力してください'\r\n");
      out.write("                        },\r\n");
      out.write("                        integer: {\r\n");
      out.write("                            message: '半角数字で入力してください'\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                register_last_name: {\r\n");
      out.write("                    validators: {\r\n");
      out.write("                        notEmpty: {\r\n");
      out.write("                            message: 'お名前(姓)を入力してください'\r\n");
      out.write("                        },\r\n");
      out.write("                        stringLength: {\r\n");
      out.write("                            max: 20,\r\n");
      out.write("                            message: '全角10文字まで'\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                register_first_name: {\r\n");
      out.write("                    validators: {\r\n");
      out.write("                        notEmpty: {\r\n");
      out.write("                            message: 'お名前(名)を入力してください'\r\n");
      out.write("                        },\r\n");
      out.write("                        stringLength: {\r\n");
      out.write("                            max: 20,\r\n");
      out.write("                            message: '全角10文字まで'\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                register_email: {\r\n");
      out.write("                    validators: {\r\n");
      out.write("                        notEmpty: {\r\n");
      out.write("                            message: 'メールアドレスを入力してください'\r\n");
      out.write("                        },\r\n");
      out.write("                        emailAddress: {\r\n");
      out.write("                            message: '有効なメールアドレスを入力してください'\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                register_password: {\r\n");
      out.write("                    validators: {\r\n");
      out.write("                        notEmpty: {\r\n");
      out.write("                            message: 'パスワードを入力してください'\r\n");
      out.write("                        },\r\n");
      out.write("                        stringLength: {\r\n");
      out.write("                            min: 5,\r\n");
      out.write("                            max: 20,\r\n");
      out.write("                            message: '5 ～ 20文字で作成してください'\r\n");
      out.write("                        },\r\n");
      out.write("                        regexp: {\r\n");
      out.write("                            regexp: /(?=(.*[0-9])+|(.*[ !\\\"#$%&'()*+,\\-.\\/:;<=>?@\\[\\\\\\]^_`{|}~])+)(?=(.*[a-z])+)(?=(.*[A-Z])+)[0-9a-zA-Z !\\\"#$%&'()*+,\\-.\\/:;<=>?@\\[\\\\\\]^_`{|}~]{8,}/g,\r\n");
      out.write("                            message: '大文字、小文字、数字、ASCIIシンボルを含む半角の文字列で登録してください'\r\n");
      out.write("                        },\r\n");
      out.write("                        identical: {\r\n");
      out.write("                        field: 'confirm_register_password',\r\n");
      out.write("                        message: 'パスワードが一致しません'\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                confirm_register_password: {\r\n");
      out.write("                    validators: {\r\n");
      out.write("                        notEmpty: {\r\n");
      out.write("                            message: 'パスワードを再度入力してください'\r\n");
      out.write("                        },\r\n");
      out.write("                        stringLength: {\r\n");
      out.write("                            min: 5,\r\n");
      out.write("                            max: 20,\r\n");
      out.write("                            message: '5 ～ 20文字で作成してください'\r\n");
      out.write("                        },\r\n");
      out.write("                        regexp: {\r\n");
      out.write("                            regexp: /(?=(.*[0-9])+|(.*[ !\\\"#$%&'()*+,\\-.\\/:;<=>?@\\[\\\\\\]^_`{|}~])+)(?=(.*[a-z])+)(?=(.*[A-Z])+)[0-9a-zA-Z !\\\"#$%&'()*+,\\-.\\/:;<=>?@\\[\\\\\\]^_`{|}~]{8,}/g,\r\n");
      out.write("                            message: '大文字、小文字、数字、ASCIIシンボルを含む半角の文字列で登録してください'\r\n");
      out.write("                        },\r\n");
      out.write("                        identical: {\r\n");
      out.write("                        field: 'register_password',\r\n");
      out.write("                        message: 'パスワードが一致しません'\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $('#myModal').on('shown.bs.modal', function() {\r\n");
      out.write("            $('.register_form').bootstrapValidator('resetForm', true);\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function createPDF() {\r\n");
      out.write("      window.open(\"./CreatePDF\");\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /index.jsp(185,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    // /index.jsp(185,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(185,16) '${requestScope['list']}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope['list']}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("              \t");
          if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("              ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /index.jsp(187,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.large_id != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fchoose_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /index.jsp(189,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.large_id == item.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<label class=\"btn btn-default active\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"large_id\" value =\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" autocomplete=\"off\" onChange=\"wrapperSubmit(this)\" checked>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(item.classification)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<label class=\"btn btn-default\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"large_id\" value =\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" autocomplete=\"off\" onChange=\"wrapperSubmit(this)\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(item.classification)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<label class=\"btn btn-default\">\r\n");
        out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"large_id\" value =\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" autocomplete=\"off\" onChange=\"wrapperSubmit(this)\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(item.classification)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /index.jsp(215,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("item");
    // /index.jsp(215,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(215,16) '${requestScope['list2']}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope['list2']}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("              \t");
          if (_jspx_meth_c_005fchoose_005f2(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("              ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
    if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f3(_jspx_th_c_005fchoose_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    // /index.jsp(217,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.middle_id != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
    if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fchoose_005f3(_jspx_th_c_005fwhen_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
    int _jspx_eval_c_005fchoose_005f3 = _jspx_th_c_005fchoose_005f3.doStartTag();
    if (_jspx_eval_c_005fchoose_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f3(_jspx_th_c_005fchoose_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f2(_jspx_th_c_005fchoose_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
    // /index.jsp(219,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.middle_id == item.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f3 = _jspx_th_c_005fwhen_005f3.doStartTag();
    if (_jspx_eval_c_005fwhen_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<label class=\"btn btn-default active\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"middle_id\" value =\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" autocomplete=\"off\" onChange=\"wrapperSubmit(this)\" checked>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(item.classification)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
    int _jspx_eval_c_005fotherwise_005f2 = _jspx_th_c_005fotherwise_005f2.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<label class=\"btn btn-default\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"middle_id\" value =\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" autocomplete=\"off\" onChange=\"wrapperSubmit(this)\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(item.classification)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    int _jspx_eval_c_005fotherwise_005f3 = _jspx_th_c_005fotherwise_005f3.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<label class=\"btn btn-default\">\r\n");
        out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"middle_id\" value =\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" autocomplete=\"off\" onChange=\"wrapperSubmit(this)\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(item.classification)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /index.jsp(245,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("item");
    // /index.jsp(245,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(245,16) '${requestScope['list3']}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope['list3']}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("              \t");
          if (_jspx_meth_c_005fchoose_005f4(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write("\r\n");
          out.write("              ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f4 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    int _jspx_eval_c_005fchoose_005f4 = _jspx_th_c_005fchoose_005f4.doStartTag();
    if (_jspx_eval_c_005fchoose_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f4(_jspx_th_c_005fchoose_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f5(_jspx_th_c_005fchoose_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f4);
    // /index.jsp(247,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.small_id != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f4 = _jspx_th_c_005fwhen_005f4.doStartTag();
    if (_jspx_eval_c_005fwhen_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fchoose_005f5(_jspx_th_c_005fwhen_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f5 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f4);
    int _jspx_eval_c_005fchoose_005f5 = _jspx_th_c_005fchoose_005f5.doStartTag();
    if (_jspx_eval_c_005fchoose_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f5(_jspx_th_c_005fchoose_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f4(_jspx_th_c_005fchoose_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f5);
    // /index.jsp(249,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.small_id == item.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f5 = _jspx_th_c_005fwhen_005f5.doStartTag();
    if (_jspx_eval_c_005fwhen_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<label class=\"btn btn-default active\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"small_id\" value =\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" autocomplete=\"off\" onChange=\"wrapperSubmit(this)\" checked>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(item.classification)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f4 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f5);
    int _jspx_eval_c_005fotherwise_005f4 = _jspx_th_c_005fotherwise_005f4.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<label class=\"btn btn-default\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"small_id\" value =\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" autocomplete=\"off\" onChange=\"wrapperSubmit(this)\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(item.classification)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f5 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f4);
    int _jspx_eval_c_005fotherwise_005f5 = _jspx_th_c_005fotherwise_005f5.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<label class=\"btn btn-default\">\r\n");
        out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"small_id\" value =\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" autocomplete=\"off\" onChange=\"wrapperSubmit(this)\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(item.classification)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f6 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f6.setParent(null);
    int _jspx_eval_c_005fchoose_005f6 = _jspx_th_c_005fchoose_005f6.doStartTag();
    if (_jspx_eval_c_005fchoose_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                \t\t");
        if (_jspx_meth_c_005fwhen_005f6(_jspx_th_c_005fchoose_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                \t\t");
        if (_jspx_meth_c_005fotherwise_005f6(_jspx_th_c_005fchoose_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            \t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f6);
    // /index.jsp(275,18) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.enable_pub_name != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f6 = _jspx_th_c_005fwhen_005f6.doStartTag();
    if (_jspx_eval_c_005fwhen_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                \t\t\t<input type=\"checkbox\" name=\"enable_pub_name\" value=\"enable\" checked>出版社\r\n");
        out.write("                \t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f6 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f6);
    int _jspx_eval_c_005fotherwise_005f6 = _jspx_th_c_005fotherwise_005f6.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                \t\t\t<input type=\"checkbox\" name=\"enable_pub_name\" value=\"enable\">出版社\r\n");
        out.write("                \t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent(null);
    // /index.jsp(286,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("item");
    // /index.jsp(286,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(286,13) '${requestScope['list4']}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope['list4']}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            \t\t");
          if (_jspx_meth_c_005fchoose_005f7(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write("\r\n");
          out.write("            \t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f7 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    int _jspx_eval_c_005fchoose_005f7 = _jspx_th_c_005fchoose_005f7.doStartTag();
    if (_jspx_eval_c_005fchoose_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t\t\t");
        if (_jspx_meth_c_005fwhen_005f7(_jspx_th_c_005fchoose_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        out.write("\r\n");
        out.write("            \t\t\t");
        if (_jspx_meth_c_005fotherwise_005f8(_jspx_th_c_005fchoose_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        out.write("\r\n");
        out.write("            \t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f7);
    // /index.jsp(288,15) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.pub_name != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f7 = _jspx_th_c_005fwhen_005f7.doStartTag();
    if (_jspx_eval_c_005fwhen_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t\t\t\t");
        if (_jspx_meth_c_005fchoose_005f8(_jspx_th_c_005fwhen_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        out.write("\r\n");
        out.write("            \t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f8 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f7);
    int _jspx_eval_c_005fchoose_005f8 = _jspx_th_c_005fchoose_005f8.doStartTag();
    if (_jspx_eval_c_005fchoose_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f8(_jspx_th_c_005fchoose_005f8, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        out.write("\r\n");
        out.write("            \t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f7(_jspx_th_c_005fchoose_005f8, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        out.write("\r\n");
        out.write("            \t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f8);
    // /index.jsp(290,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.pub_name == item.name}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f8 = _jspx_th_c_005fwhen_005f8.doStartTag();
    if (_jspx_eval_c_005fwhen_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t\t\t\t\t\t<option selected>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(item.name)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("</option>\r\n");
        out.write("            \t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f7 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f8);
    int _jspx_eval_c_005fotherwise_005f7 = _jspx_th_c_005fotherwise_005f7.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t\t\t\t\t\t<option>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(item.name)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("</option>\r\n");
        out.write("            \t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f8 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f7);
    int _jspx_eval_c_005fotherwise_005f8 = _jspx_th_c_005fotherwise_005f8.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t\t\t\t<option>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(item.name)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
        out.write("</option>\r\n");
        out.write("            \t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f8);
    return false;
  }
}
