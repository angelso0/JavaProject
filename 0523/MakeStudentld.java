import java.util.Random;

public class MakeStudentld {
	private String name; //�̸�
	private String dept; //�а�
	private String std_id; //�й�
	Random Id = new Random (); //�й� ���ڸ� �������ι޾���
	
	public MakeStudentld(String name,int num) {
		this.name=name;
		
		switch(num) {
		case 1 : //�����а� 1�����ý�
			this.dept = "�����а�";
			this.std_id = "2019010";
			break;
			
		case 2 : //2�����ý� ��ȸ�����а�
			this.dept = "��ȸ�����а�";
			this.std_id = "2019020";
			break;
			
		case 3 : //3�����ý� �����ƺ����а�
			this.dept = "�����ƺ����а�";
			this.std_id = "2019030";
			break;
			
		case 4 : //4�����ý� ��ǻ�ͼ���Ʈ�����а�
			this.dept = "��ǻ�ͼ���Ʈ�����а�";
			this.std_id = "2019040";
			break;
		
		case 5 : //5�����ý� ��ȣ�а�
			this.dept = "��ȣ�а�";
			this.std_id = "2019050";
			break;
			
		}
	}
	public String getName() {
		return name; //�̸� ����
	}
	public String getDept() {
		return dept; //�а�
	}
	public String makeId() { //�й�
		for(int i = 0; i <= 1; i++) {
			std_id += Id.nextInt(10);
		}
		return std_id;
	}
	
	}
	
