package com.cxf.soap.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "operations",name="operations")
public interface Operations {
    @WebMethod
    public int add(int a,int b);
}
