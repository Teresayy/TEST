package flower;

public class flower {

	public static void main(String[] args) {
        int x = 0;        //����ˮ�ɻ����ĸ���
        System.out.println("ˮ�ɻ���Ϊ��"); 
        for(int i=100;i<=999;i++){
            int b = i/100;        //ȡ�ð�λ��
            int s = (i-100*b)/10;        //ȡ��ʮλ��
            int g = (i-s*10-b*100);        //ȡ�ø�λ��
            
            if(i==g*g*g+s*s*s+b*b*b){
                x++;    //ÿ�η���ˮ�ɻ�����������x+1;
                System.out.print(" "+i);    //���������������
        }
        }
	}
}
