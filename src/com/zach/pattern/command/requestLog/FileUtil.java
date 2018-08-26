package com.zach.pattern.command.requestLog;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件操作类
 * @author Zach
 *
 */
public class FileUtil {
	
	//将命令集合写入日志文件
	public static void writeCommands(List<Command> commands) {
		try {
			FileOutputStream fos = new FileOutputStream("config.log");
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(fos));
			
			//将对象写入文件
			oos.writeObject(commands);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//从日志文件中提取命令集合
	@SuppressWarnings({ "unchecked" })
	public static List<Command> readCommands() {
		
		try {
			FileInputStream fis = new FileInputStream("config.log");
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(fis));
			
			//将文件中的对象读出来并转换成ArrayList类型
			List<Command> commands = (ArrayList<Command>)ois.readObject();
			ois.close();
			return commands;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
