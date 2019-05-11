package ssr;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Yuangong {
    
	int num;
     String name;
     String sex;
     Date sr;
     int age;
    
    
    
    
    
     public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public int getNum() {
		return num;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getSr() {
		return sr;
	}
	public void setSr(Date sr) {
		this.sr = sr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Yuangong(int num,String name,String sex,Date sr){
    	 this.num=num;
    	 this.name=name;
    	 this.sex=sex;
    	 this.sr=sr;
    	 this.age=getage();
     }
     public int getage(){
    	 Calendar c=Calendar.getInstance();
    	 int now=c.get(Calendar.YEAR);
    	 c.setTime(sr);
    	 int bri=c.get(Calendar.YEAR);
    	 return now-bri;
     }
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		return "Yuangong [num=" + num + ", name=" + name + ", sex=" + sex
				+ ", sr=" + sdf.format(sr)+ ", age=" + age + "]";
	}
     
     
     
     
}
