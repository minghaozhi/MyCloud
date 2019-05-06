package com.moshang.cloud.utils;

import java.util.HashMap;

/**
 * ResponseBody构造器。一般用于ajax、rest等类型的Web服务
 */
@SuppressWarnings("serial")
public class RestResponse extends HashMap<String, Object> {
    public static RestResponse success(){
        return success("成功");
    }
    public static RestResponse success1(){
        return success1("成功");
    }
    public static RestResponse success(String message){
        RestResponse restResponse = new RestResponse();
        restResponse.setCode(200);
        restResponse.setSuccess(true);
        restResponse.setMessage(message);
        return restResponse;
    }
    public static RestResponse success1(String message){
        RestResponse restResponse = new RestResponse();
        restResponse.setCode(0);
        restResponse.setSuccess(true);
        restResponse.setMsg(message);
        return restResponse;
    }
    public static RestResponse failure(String message){
        RestResponse restResponse = new RestResponse();
        restResponse.setCode(400);
        restResponse.setSuccess(false);
        restResponse.setMessage(message);
        return restResponse;
    }
    public static RestResponse failure(){
        RestResponse restResponse = new RestResponse();
        return restResponse;
    }

    public RestResponse setSuccess(Boolean success) {
        if (success != null) put("success", success);
        return this;
    }

    public RestResponse setMessage(String message) {
        if (message != null) put("message", message);
        return this;
    }
    public RestResponse setMsg(String msg) {
        if (msg != null) put("msg", msg);
        return this;
    }
    public RestResponse setData(Object data) {
        if (data != null) put("data", data);
        return this;
    }

    public RestResponse setCode(Object code) {
        if (code != null) put("code", code);
        return this;
    }
    public RestResponse setPage(Integer page) {
        if (page != null) put("back", page);
        return this;
    }
    
    public RestResponse setCurrentPage(Integer currentPage){
    	if (currentPage != null) put("currentPage", currentPage);
        return this;
    }

    public RestResponse setLimit(Integer limit) {
        if (limit != null) put("limit", limit);
        return this;
    }

    public RestResponse setTotal(Long total) {
        if (total != null) put("total", total);
        return this;
    }
    public RestResponse setStatus(Object status) {
        if (status != null) put("status", status);
        return this;
    }
    public RestResponse setAny(String key, Object value) {
        if (key != null && value != null) put(key, value);
        return this;
    }
}
