package com.offcn.httpClient;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpClientApp_01 {

	public static void main(String[] args) {
		
		// 1 创建httpClient 对象
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		// 2 get请求
		HttpGet httpGet= new HttpGet("http://localhost:8080/Day03_HttpClient/send?username=123123&password=123");
		
		// 3 发送请求头(可以有多个请求头参数)
		
		
	}
}
