package softwork.evaluation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CourseName {
	
	private static String txt;
//*可以儲存課程的名稱,代碼,評價與資料,教授姓名
	public String courseName;
	public String[] courseData;
	public String teacherName;
	public String courseCode;
	
	public CourseName(String Cname,String Ccode, String[] Cdata, String Tname){
		courseName = Cname;
		courseData = Cdata;
		teacherName = Tname;
		courseCode = Ccode;
	}
	public CourseName(){}
	
	public String list[]={"資訊系","財金系","行銷系","電機系","機械系"};
	public  String course_name[][]={{"資料結構","計算機概論","系統程式","作業系統","線性代數"},
									{"經濟學","會計學","保險學 "," 金融市場 ","國際財務管理 "},
									{"管理學","服務業行銷","零售與通路經營 ","跨文化行銷溝通","創意學 "},
									{"電子學","電磁學","機率論","電磁干擾概論","高頻電路概論"},
									{"工程圖學","熱力學","材料力學","流體力學","機械設計"},
									{"營養學","心理學","醫學與人生","詩詞欣賞","倫理與道德"}};
	public String course_id[][]={{"00","01","02","03","04"},
								 {"05","06","07","08","09"},
								 {"10","11","12","13","14"},
								 {"15","16","17","18","19"},
								 {"20","21","22","23","24"},
								 {"25","26","27","28","29"}
								};
	
	public int[] modify = new int [30] ;
	
	public float[] score = new float [30] ;
	
	public String[] commend = new String [30];
	
	public  int listnum[]={0,0,0,0,0};
	
	
	public String[] sourse = {"物件導向"};
	public String[] sourse1 = {"體育"};
	public String[] sourse2 = {"軟工導論"};
	public String[] sourse3 = {"資料結構"};
	public String[] sourse4 = {"戀愛心理學"};
	public String[] course1 = {"評價人數:1","學生評價:上"};
	public String[] course2 = {"評價人數:2","學生評價:中"};
	public String[] course3 = {"評價人數:3","學生評價:下"};
	public String[] course4 = {"評價人數:4","學生評價:中上"};
	//public String[] course5 = {"評價人數:5","學生評價:中下"};
	
	//public Teacher [] T = new Teacher[5];{
	//T[0] = new Teacher("蔡昌銘",sourse,"畢業於逢甲大學");
	//T[1] = new Teacher("高維均",sourse1,"畢業於逢甲大學");
	//T[2] = new Teacher("陳柏翔",sourse2,"畢業於逢甲大學");
	//T[3] = new Teacher("劉俊甫",sourse3,"畢業於逢甲大學");
	//T[4] = new Teacher("王呈峻",sourse4,"畢業於逢甲大學");
	}
	/*
	public Course [] C = new Course[5];{
	C[0] = new Course("物件導向","9487", course1, "蔡昌銘");
	C[1] = new Course("體育","9478", course2, "高維均");
	C[2] = new Course("軟工導論","9477", course3, "陳柏翔");
	C[3] = new Course("資料結構","9488", course4, "劉俊甫");
	C[4] = new Course("戀愛心理學","9466", course5,"王呈峻");
	}
	*/
	/*
	public static void main(String [] argc){
		System.out.println("check");
		readFile();
	}
	*/
	/**
	 * Open and read a file, and return the lines in the file as a list
	 * of Strings.
	 * (Demonstrates Java FileReader, BufferedReader, and Java5.)
	 
	private static void readFile()
	{
	  try
	  {
	    BufferedReader reader = new BufferedReader(new FileReader("F:/Project for java/Soft_Job/src/data/Course.txt"));
	    String line;
	    while ((line = reader.readLine()) != null)
	    {
	      System.out.println(line);
	    }
	    
	  }
	  catch (IOException e) {System.out.println(e);}
	}
	*/

