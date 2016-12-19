package softwork.evaluation;

import java.util.Scanner;


//import Simulation_Curriculum.Course;
//import data.CourseName;

public class Evaluation {

	private float score; 
	private String [] commend = new String[20] ;
	private int people = 0;
	private float peoplescore = 0 ;
	private float average_score = 0 ;
	private int commend_sum = 0 ;
    public boolean check = true ;
    private boolean checkclass = false ;
    CourseName coursename=new CourseName();
    
    int class_course;
    public void setClass_course(int CC){
    	class_course = CC;
    }
	
   
	public int list(){ // 評分表單
		System.out.println("[評分頁面]") ;
		System.out.println(" 1. 評分 \n 2. 評論\n 3. 顯示你給的評分\n 4. 顯示你給的評論\n 5. 返回") ;
		Scanner scanner3 = new Scanner(System.in);
		int select = scanner3.nextInt() ;
		if(select == 1){
			return 1 ;
		}
		else if(select == 2){
			return 2 ;
		}
		else if(select == 3){
			return 3 ;
		}
		else if(select == 4){
			return 4 ;
		}
		else if(select == 5){
			return 5 ;
		}
		else{
			System.out.println("無此代碼 !") ;
			return 0 ;
		}
	}
	
	public void select_list(int s){ // 透過表單選項指定操作項目
		switch(s){
		case 1 :
			setscore() ;
			break ;
		case 2 :
			setcommend() ;
			break ;
		case 3 :
			getscore() ;
			break ;
		case 4 :
			getcommend() ;
			break ;
		case 5:
			check = false ;
			break ;
		default :
			System.out.println("無此選項 !") ;
			break ;
		}
	}
	
		
	public void setscore(){  //設定分數
		if(coursename.modify[class_course] == 0){
		System.out.println("警告 : 礙於修課原則分數每人僅能針對已修過的課程評分一次") ;
		System.out.println("請輸入分數(1~5) :") ;
		Scanner inputscore = new Scanner(System.in);
		coursename.score[class_course] = inputscore.nextFloat() ;
		if(coursename.score[class_course] > 5 || coursename.score[class_course] < 1 ){
			System.out.println("評分失敗 !") ;
		}else{
			System.out.println("評分成功 !") ;
			people++ ;
			peoplescore += score ;
			coursename.modify[class_course] = 1 ;
		}
		}else{
			System.out.println("你已經為此課程評分過了 !") ;
		}
	}

	public void setcommend(){  //設定評論
		if(coursename.commend[class_course] == null){
			System.out.println("警告 : 礙於修課原則分數每人僅能針對已修過的課程評分一次") ;
			System.out.println("請輸入評論 :") ;
			Scanner inputcommend = new Scanner(System.in);
			coursename.commend[class_course] = inputcommend.next() ;
		}else{
			System.out.println("你已經為此課程評分過了 !") ;
		}
	}
	
	
	
	public void getscore(){   //顯示使用者給的分數和平均分數
		System.out.println("你給的分數 :" +coursename.score[class_course]) ;
	}
	public void getcommend(){  //顯示評論數量
		System.out.println("你給過的評論 : " ) ;
		System.out.println(coursename.commend[class_course]) ;
		
	}
	public void showList(){
		for(int i=0;i<6;i++){
			for(int j=0;j<5;j++){
				System.out.print(coursename.course_id[i][j]+" : "+coursename.course_name[i][j]);
			}
			System.out.print(" \n");
		}
	}
}
