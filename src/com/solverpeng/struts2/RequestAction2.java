package com.solverpeng.struts2;

import com.opensymphony.xwork2.ActionContext;

import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
public class RequestAction2 {
    private ActionContext context = ActionContext.getContext();
    private Map<String, Object> requestMap;
    private Map<String, Object> sessionMap;
    private Map<String, Object> applicationMap;
    private Map<String, Object> parameterMap;

    {
        requestMap = (Map<String, Object>) context.get("request");
        sessionMap = context.getSession();
        applicationMap = context.getApplication();
        parameterMap = context.getParameters();
    }

    public String testResource() {
        System.out.println(this);
        requestMap.put("requestKey", "requestValue2");
        sessionMap.put("sessionKey", "sessionValue2");
        applicationMap.put("applicationKey", "applicationValue2");

        Set<Map.Entry<String, Object>> entries = parameterMap.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println("key:" + entry.getKey());
            System.out.println("value:" + ((String[])entry.getValue())[0]);
        }

        return "success";
    }
}
