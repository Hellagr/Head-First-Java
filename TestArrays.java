class TestArrays {
	public static void main (String[] args) {
	int y=0;
	
	String [] islands = new String[4];
	
	islands[0] = "�����";
	islands[1] = "�����";
	islands[2] = "����᪨� ���஢�";
	islands[3] = "���㬥��";
	
	int ref;
	while (y<4) {
	
	int [] index = new int[4];
		
	index[0]=1;
	index[1]=3;
	index[2]=0;
	index[3]=2;
	
	ref=index[y];
	
	
	
	y=y+1;
	
	System.out.print("���஢� =");
	System.out.println(" "+islands[ref]);
	
	}
	
	
	}
}