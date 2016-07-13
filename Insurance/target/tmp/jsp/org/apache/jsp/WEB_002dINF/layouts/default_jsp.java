package org.apache.jsp.WEB_002dINF.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class default_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/layouts/header.jsp");
    _jspx_dependants.add("/WEB-INF/layouts/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sitemesh_title_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sitemesh_head_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_user;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_principal_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_hasRole_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sitemesh_body_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sitemesh_title_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sitemesh_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_user = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_principal_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_hasRole_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sitemesh_body_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_sitemesh_title_nobody.release();
    _jspx_tagPool_sitemesh_head_nobody.release();
    _jspx_tagPool_shiro_user.release();
    _jspx_tagPool_shiro_principal_property_nobody.release();
    _jspx_tagPool_shiro_hasRole_name.release();
    _jspx_tagPool_sitemesh_body_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>QuickStart示例:");
      if (_jspx_meth_sitemesh_title_0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-store\" />\r\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\" />\r\n");
      out.write("<meta http-equiv=\"Expires\" content=\"0\" />\r\n");
      out.write("\r\n");
      out.write("<link type=\"image/x-icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/favicon.ico\" rel=\"shortcut icon\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/2.3.2/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/jquery-validation/1.11.1/validate.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/styles/default.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/jquery/jquery-1.9.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/jquery-validation/1.11.1/jquery.validate.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/jquery-validation/1.11.1/messages_bs_zh.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_sitemesh_head_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<div id=\"title\">\r\n");
      out.write("\t    <h1><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">QuickStart示例</a><small>--TodoList应用演示</small>\r\n");
      out.write("\t    ");
      if (_jspx_meth_shiro_user_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_sitemesh_body_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\tCopyright &copy; 2005-2012 <a href=\"http://www.springside.org.cn\">springside.org.cn</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/2.3.2/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_sitemesh_title_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_sitemesh_title_0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _jspx_tagPool_sitemesh_title_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_sitemesh_title_0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_title_0.setParent(null);
    int _jspx_eval_sitemesh_title_0 = _jspx_th_sitemesh_title_0.doStartTag();
    if (_jspx_th_sitemesh_title_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sitemesh_title_nobody.reuse(_jspx_th_sitemesh_title_0);
      return true;
    }
    _jspx_tagPool_sitemesh_title_nobody.reuse(_jspx_th_sitemesh_title_0);
    return false;
  }

  private boolean _jspx_meth_sitemesh_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_sitemesh_head_0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _jspx_tagPool_sitemesh_head_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    _jspx_th_sitemesh_head_0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_head_0.setParent(null);
    int _jspx_eval_sitemesh_head_0 = _jspx_th_sitemesh_head_0.doStartTag();
    if (_jspx_th_sitemesh_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sitemesh_head_nobody.reuse(_jspx_th_sitemesh_head_0);
      return true;
    }
    _jspx_tagPool_sitemesh_head_nobody.reuse(_jspx_th_sitemesh_head_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("ctx");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_shiro_user_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:user
    org.apache.shiro.web.tags.UserTag _jspx_th_shiro_user_0 = (org.apache.shiro.web.tags.UserTag) _jspx_tagPool_shiro_user.get(org.apache.shiro.web.tags.UserTag.class);
    _jspx_th_shiro_user_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_user_0.setParent(null);
    int _jspx_eval_shiro_user_0 = _jspx_th_shiro_user_0.doStartTag();
    if (_jspx_eval_shiro_user_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<div class=\"btn-group pull-right\">\r\n");
        out.write("\t\t\t\t<a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
        out.write("\t\t\t\t\t<i class=\"icon-user\"></i> ");
        if (_jspx_meth_shiro_principal_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_user_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<span class=\"caret\"></span>\r\n");
        out.write("\t\t\t\t</a>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_shiro_hasRole_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_user_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/api\">APIs</a></li>\r\n");
        out.write("\t\t\t\t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/profile\">Edit Profile</a></li>\r\n");
        out.write("\t\t\t\t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/logout\">Logout</a></li>\r\n");
        out.write("\t\t\t\t</ul>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_shiro_user_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_user_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_user.reuse(_jspx_th_shiro_user_0);
      return true;
    }
    _jspx_tagPool_shiro_user.reuse(_jspx_th_shiro_user_0);
    return false;
  }

  private boolean _jspx_meth_shiro_principal_0(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_user_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_principal_0 = (org.apache.shiro.web.tags.PrincipalTag) _jspx_tagPool_shiro_principal_property_nobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_principal_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_principal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_user_0);
    _jspx_th_shiro_principal_0.setProperty("name");
    int _jspx_eval_shiro_principal_0 = _jspx_th_shiro_principal_0.doStartTag();
    if (_jspx_th_shiro_principal_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_principal_property_nobody.reuse(_jspx_th_shiro_principal_0);
      return true;
    }
    _jspx_tagPool_shiro_principal_property_nobody.reuse(_jspx_th_shiro_principal_0);
    return false;
  }

  private boolean _jspx_meth_shiro_hasRole_0(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_user_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasRole
    org.apache.shiro.web.tags.HasRoleTag _jspx_th_shiro_hasRole_0 = (org.apache.shiro.web.tags.HasRoleTag) _jspx_tagPool_shiro_hasRole_name.get(org.apache.shiro.web.tags.HasRoleTag.class);
    _jspx_th_shiro_hasRole_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasRole_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_user_0);
    _jspx_th_shiro_hasRole_0.setName("admin");
    int _jspx_eval_shiro_hasRole_0 = _jspx_th_shiro_hasRole_0.doStartTag();
    if (_jspx_eval_shiro_hasRole_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/admin/user\">Admin Users</a></li>\r\n");
        out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_shiro_hasRole_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasRole_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasRole_name.reuse(_jspx_th_shiro_hasRole_0);
      return true;
    }
    _jspx_tagPool_shiro_hasRole_name.reuse(_jspx_th_shiro_hasRole_0);
    return false;
  }

  private boolean _jspx_meth_sitemesh_body_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_sitemesh_body_0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _jspx_tagPool_sitemesh_body_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_sitemesh_body_0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_body_0.setParent(null);
    int _jspx_eval_sitemesh_body_0 = _jspx_th_sitemesh_body_0.doStartTag();
    if (_jspx_th_sitemesh_body_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sitemesh_body_nobody.reuse(_jspx_th_sitemesh_body_0);
      return true;
    }
    _jspx_tagPool_sitemesh_body_nobody.reuse(_jspx_th_sitemesh_body_0);
    return false;
  }
}
