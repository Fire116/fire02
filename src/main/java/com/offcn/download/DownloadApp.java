package com.offcn.download;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * 
 * 下载 文件
 * @author Administrator
 *
 */
public class DownloadApp {

	public static void main(String[] args) {

		// 创建HttpClient对象
		CloseableHttpClient httpClient = HttpClients.createDefault();

		// 下载 get
		HttpGet httpGet = new HttpGet("https://www.baidu.com/img/bd_logo1.png");

		// 发出请求

		try {
			// 发出请求
			CloseableHttpResponse response = httpClient.execute(httpGet);

			// 解析 response ，获取HttpEntity
			HttpEntity entity = response.getEntity();

			// 从entity中引出 流
			InputStream inputStream = entity.getContent();

			// 写入输出流
//			FileOutputStream outputStream = new FileOutputStream("d:/chart/downoad.png");
		
			FileOutputStream outputStream = new FileOutputStream("d:/chart/downoad1.jpg");

			int len = -1;
			
			byte[] by = new byte[1024];
			
			while ((len = (inputStream.read(by))) != -1) {

				outputStream.write(by, 0, len);
			}

			outputStream.flush();
			outputStream.close();
			inputStream.close();
			EntityUtils.consume(entity);

		} catch (IOException e) {

			e.printStackTrace();
		}

		try {

			httpClient.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("O");
	}
}
