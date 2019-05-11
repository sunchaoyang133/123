package ssr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Guanli {
    ArrayList<Yuangong> list= new ArrayList<Yuangong>();
    Scanner sc= new Scanner(System.in);
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    public Guanli() throws ParseException{
    	list.add(new Yuangong(100,"jim","nan",sdf.parse("2000-01-01")));
    	list.add(new Yuangong(101,"jim","nan",sdf.parse("2000-01-01")));
    	list.add(new Yuangong(102,"jim","nan",sdf.parse("2000-01-01")));
    	list.add(new Yuangong(103,"jim","nan",sdf.parse("2000-01-01")));
    }
    
    /**
     * 添加员工
     * @throws ParseException
     */
    
    public void add() throws ParseException{
    	System.out.println("请输入工号：");
    	int num=sc.nextInt();
    	System.out.println("请输入姓名：");
        String name=sc.next();
        System.out.println("请输入性别：");
        String sex=sc.next();
        System.out.println("请输入生日：(2000-01-01)");
        String sr=sc.next();
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date brithday=sdf.parse(sr);
        Yuangong e1= new Yuangong(num,name,sex,brithday);
        list.add(e1);
        
        
    }
    /**
     * 输出全部员工
     */
    public void printall(){
    	for(int i=0;i<list.size();i++){
    		System.out.println(list.get(i));
    	}
    }
    
    public void chazhao(int num){
    	System.out.println("请");
    }
    
    
}
