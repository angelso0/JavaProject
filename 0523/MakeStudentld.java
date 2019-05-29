import java.util.Random;

public class MakeStudentld {
	private String name; //이름
	private String dept; //학과
	private String std_id; //학번
	Random Id = new Random (); //학번 뒷자리 랜덤으로받아줌
	
	public MakeStudentld(String name,int num) {
		this.name=name;
		
		switch(num) {
		case 1 : //성서학과 1번선택시
			this.dept = "성서학과";
			this.std_id = "2019010";
			break;
			
		case 2 : //2번선택시 사회복지학과
			this.dept = "사회복지학과";
			this.std_id = "2019020";
			break;
			
		case 3 : //3번선택시 영유아보육학과
			this.dept = "영유아보육학과";
			this.std_id = "2019030";
			break;
			
		case 4 : //4번선택시 컴퓨터소프트웨어학과
			this.dept = "컴퓨터소프트웨어학과";
			this.std_id = "2019040";
			break;
		
		case 5 : //5번선택시 간호학과
			this.dept = "간호학과";
			this.std_id = "2019050";
			break;
			
		}
	}
	public String getName() {
		return name; //이름 변수
	}
	public String getDept() {
		return dept; //학과
	}
	public String makeId() { //학번
		for(int i = 0; i <= 1; i++) {
			std_id += Id.nextInt(10);
		}
		return std_id;
	}
	
	}
	
