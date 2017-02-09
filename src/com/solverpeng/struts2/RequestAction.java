package com.solverpeng.struts2;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/2/8 0008.
 */
public class RequestAction implements RequestAware, SessionAware, ParameterAware, ApplicationAware {

    private Map<String, Object> requestMap;
    private Map<String, Object> sessionMap;
    private Map<String, Object> applicationMap;
    private Map<String, String[]> parameters;


    public String testResource() {
        System.out.println(this);
        requestMap.put("requestKey", "requestValue");
        sessionMap.put("sessionKey", "sessionValue");
        applicationMap.put("applicationKey", "applicationValue");

        Set<Map.Entry<String, String[]>> entries = parameters.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            System.out.println("key:" + entry.getKey());
            System.out.println("value:" + entry.getValue()[0]);
        }

        return "success";
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        this.requestMap = map;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap = map;
    }

    @Override
    public void setParameters(Map<String, String[]> map) {
        this.parameters = map;
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        this.applicationMap = map;
    }
}
