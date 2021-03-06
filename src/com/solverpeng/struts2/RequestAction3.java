package com.solverpeng.struts2;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/2/8 0008.
 */
public class RequestAction3 implements ServletRequestAware, ServletResponseAware, ServletContextAware {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private ServletContext context;

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.response = httpServletResponse;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.context = servletContext;
    }

    public String testResource() {
        System.out.println("request:" + request);
        System.out.println("response:" + response);
        return "success";
    }
}
