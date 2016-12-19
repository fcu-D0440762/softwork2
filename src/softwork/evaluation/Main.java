package softwork.evaluation;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//import org.apache.xmlbeans.impl.piccolo.io.FileFormatException;
//import com.itextpdf.text.DocumentException;

//import Course.Search;
//import Simulation_Curriculum.Course;
//import Simulation_Curriculum.SimulationCurriculum;
//import data.CourseName;
//import login.Login;

public class Main {
	
	public static void main(String [] argc) /*throws FileNotFoundException, FileFormatException, IOException*/{
		Scanner scanner=new Scanner(System.in);
		//Wisdom_Curriculum w=new Wisdom_Curriculum();
		//printPDF ppdf=new printPDF();
		//Favorate favorate = new Favorate();
		//Search search1 = new Search();
		
		
		
		//登入
		/*boolean flag=false;
		System.out.print("輸入帳號:");
		String account = scanner.next();
		System.out.print("輸入密碼:");
		String password = scanner.next();*/
		//flag=Login.login(account, password);
		
		if(true){
			while(true){
				System.out.println("輸入功能代碼(輸入0為離開)");
				System.out.println("1.搜尋老師或課程名稱");
				System.out.println("2.給予評價");
				System.out.println("3.將課程加入我的最愛");
				System.out.println("4.智慧課表");
				System.out.println("5.生成課表");
				int num=scanner.nextInt();
				switch(num){
				case 0:{
					break;
				}
				case 1: {
					String str;
					Scanner scan = new Scanner(System.in);
					System.out.println("請輸入搜尋條件:");
					while(true){
					str = scan.next();
					//search1.search(str);
					break;
					}
					break;
				}
				case 2:{
					Evaluation evaluation = new Evaluation() ;
					
					Scanner scanner1 = new Scanner(System.in);
					
					while(true){
						System.out.println("請輸入課程代碼 :");
						CourseName c=new CourseName();
						evaluation.showList();
						int classcourse = scanner1.nextInt() ; // 輸入對應課程的選課代碼
						evaluation.setClass_course(classcourse);
						//假設有1這個課程代碼 之後希望是從課程清單中比對代碼
						System.out.println("顯示課程資訊") ; //這裡是要將所選課程的相關資訊輸出出來 僅帶過
						System.out.println(" 1. 課程評分 \n 2. 返回 ") ;//應該有多項功能 這裡僅做出評分
						Scanner scanner2= new Scanner(System.in);
						int choose1= scanner2.nextInt() ;
						switch(choose1){
						case 1 :
							while(c.modify[classcourse] == 0){
							int s = evaluation.list() ;
							evaluation.select_list(s) ;
							}
							c.modify[classcourse] = 1 ;
							break ;
						
						case 2 :
						    break ;	
						default :
							System.out.println("無此動作 !") ;
							break;
						}		
						}
				}
				/*case 3:{
					String coursecode, choose;
					boolean found;
					System.out.println("輸入選課代碼:");
					coursecode = scanner.next();// 輸入選課代碼
					if (favorate.getcoursecode(coursecode)) {
						System.out.println("顯示課程資訊");// 這裡要輸出相對應的課程

						System.out.println("1.加入我的最愛\n2.刪除我的最愛\n3.display我的最愛");
						choose = scanner.next();
						switch (choose) {
						case "1": {
							System.out.println("是否加入我的最愛y/n");// 選則是否加入我的最愛
							choose = scanner.next();
							if (choose.equalsIgnoreCase("y")) {// 檢查是否有加入
								if (favorate.getFavorate(favorate.getcoursename(coursecode))) {// 有
								}
							} else {
								System.out.println("無此代碼請重新輸入  http://查詢選課網址");
							}
							break;
						}
						case "2": {
							favorate.display_favorate();
							favorate.rewitreFavorate();
							break;
						}

						case "3": {
							favorate.display_favorate();
							break;
						}
						}
					}
					break;
				}*/
				case 4:{//智慧課表
					while(true){//讓使用者選擇要那些課程當參數
						//w.Request_kind();
						//if(w.check_checkbox()){
							break;
						}
					}
					//w.sqlIdNameStatement();//將使用者學號存入資料庫
					//w.construct_course();//生成課表
					//w.sqlCourseListStatement();//將生成後的課表存入database
					//j.SelectCourseListTable();//用select * from  courselist 顯示
					/*if(w.final_check()==true){
						try {
							ppdf.printPdf();
						} catch (FileNotFoundException e) {
							// TODO 自動產生的 catch 區塊
							e.printStackTrace();
						} catch (DocumentException e) {
							// TODO 自動產生的 catch 區塊
							e.printStackTrace();
						}
					
					else{
						System.out.println("不另輸出課表PDF檔");
					}*/
					break;
				}
				/*case 6:{//生成課表
					Course course = new Course();
					SimulationCurriculum test = new SimulationCurriculum("IECS", "D0000000", 4); // ("科系縮寫名", "學號", "目前哪個學期(1 2 3 4 5 6 7 8)")
					
					String[] chosenCourse = test.Switch();
					course.setCourseName(chosenCourse); // 模擬所選放到Course 以couse.setCourseName進入但其實courseName和courseCode都設定了
					
					// 測試
					int[] code = course.getCourseCode();
					String[] name = course.getCourseName();
					System.out.println(code[0]+name[0]);
					break;
				}*/
				}		
			}
		}
	}
	

