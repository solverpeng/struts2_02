package com.solverpeng.struts2;

import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
public class RequestAction4 {

    public String testResource() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        System.out.println("request:" + request);
        System.out.println("response:" + response);
        return "success";
    }
}
