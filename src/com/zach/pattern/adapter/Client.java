package com.zach.pattern.adapter;

//客户端代码
public class Client {
	public static void main(String[] args) {
		
		//可以将类配置在配置文件中,提高扩展性,此处就不展示
		ScoreOperation operation = new OperationAdapter();
		int scores[] = {84,76,50,69,90,91,88,96};
		System.out.println("成绩排序结果:");
		int result[] = operation.sort(scores);
		
		//遍历输出成绩
		for (int i : result) {
			System.out.print(i+",");
			
		}
		
		System.out.println();
		int score = 0;
		System.out.println("查找成绩90:");
		 score = operation.search(result, 90);
		
		if(score !=-1){
			System.out.println("找到成绩90.");
		}else{
			System.out.println("没有找到成绩90.");
		}
		
		System.out.println("查找成绩92:");
		 score = operation.search(result, 92);
		
		if(score !=-1){
			System.out.println("找到成绩92.");
		}else{
			System.out.println("没有找到成绩92.");
		}
		
	}
}
