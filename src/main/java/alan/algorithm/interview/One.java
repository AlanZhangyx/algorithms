package main.java.alan.algorithm.interview;

import java.io.IOException;

/**
 * 编写一个程序，将a.txt文件中的单词与b.txt文件中的单词交替合并到c.txt文件中，a.txt文件中的单词用回车符分隔，b.
 * txt文件中用回车或空格进行分隔。
 * make it work
 * make it right
 * make it fast
 * 
 * @author ZhangYaxu
 * @date Jun 25, 2015
 */
public class One {
	public static void main(String[] args) throws IOException {
		String lineSeparator=System.getProperty("line.separator");
		System.err.println(One.class.getClassLoader());
		
		/*
		File a=new File("G:\\a.txt");
		File b=new File("G:\\b.txt");
		File c=new File("G:\\c.txt");
		
		FileReader frA=new FileReader(a);
		FileReader frB=new FileReader(b);
		
		FileWriter fwC=new FileWriter(c);
		
		char[] chars=new char[1024];
		//frA.read();
		int count=0;
		while ((count=frA.read(chars))!=-1) {
			fwC.write(chars, 0, count);
		}
		frA.close();
		frB.close();
		fwC.close();*/
	}
}
