package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class Test {

	public static void main(String[] args) throws IOException {
		
		URL example = new URL("https://www.wykop.pl");
		BufferedReader in = new BufferedReader(new InputStreamReader(example.openStream(), "UTF-8"));
		
		StringBuilder webSideSource = new StringBuilder();
		String temp = null;
		 while ((temp=in.readLine()) != null) {
			 webSideSource.append(temp);
		 }
		 in.close();
		 System.out.println(webSideSource.toString());
		/* 
		 System.out.println("________________________________");
		 Document doc = Jsoup.parse(webSideSource.toString());
		 Elements h1Elements = doc.getElementsByTag("h1");
		 for(Element e:h1Elements) {
			 System.out.println(e.text());
		 }
		 */
		
		 Document doc = Jsoup.parse(webSideSource.toString());
		 Elements element = doc.select("h2");
		 for (Element e:element)
		 {
			System.out.println(e.text());
		 }
		 
	}

}
