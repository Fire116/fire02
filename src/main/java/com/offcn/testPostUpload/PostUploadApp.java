package com.offcn.testPostUpload;


import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * 
 * 上传 文件
 * @author Administrator
 *
 */
public class PostUploadApp {

	public static void main(String[] args) {
		
		// 创建HttpClient 对象
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		// post 请求上传
		HttpPost httpPost = new HttpPost("http://localhost:8080/Day03_HttpClient/uploadServlet");
	
		// 设置请求头
		httpPost.setHeader("123asd","qwe");
		
		// 传递参数， 参数数量不确定的话
	/*	List<NameValuePair> list=new ArrayList<NameValuePair>();
		list.add(new BasicNameValuePair("username", "java999"));
		list.add(new BasicNameValuePair("password", "123"));
		//把list请求参数集合和httppost对象关联绑定
		httppost.setEntity(new UrlEncodedFormEntity(list));*/

		//创建file对象
		File file1 = new File("d:/chart/bar1.jpg");
//		File file2 = new File("d:/chart/bar2.jpg");
		
		//把要上传的File文件转换成支持上传的文件对象
		FileBody fileBody = new FileBody(file1);
		
		// 创建HttpEntity
//		HttpEntity httpEntity = MultipartEntityBuilder.create().;
		
	
	
	}
}
