package control_process;
//�ƽ�ָ�ȣ���һ����ӽ�0.618�����֣����ҷ��Ӻͷ�Ĺ����ͬʱΪż��

public class Golden_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float i, j, m = 0 , n = 0.0f, min = 1.0f, value;

	        for(i = 1.0f; i <= 20.0; i++){
	            for(j = i + 1; j <= 20.0; j++){//ȡֵ��0.618����ʽ������ֵ��С��1���ʷ�ĸ������
	                if(i % 2 != 0 || j % 2 != 0){//�ڷ��ӷ�ĸ��ͬʱΪż����ǰ���£��ټ������ֵ
	                    if(i / j > 0.618)value = i / j - 0.618f;
	                    else value =  0.618f - i / j;//�����ֵ��ƽ�ָ��Ĳ�ֵ����ֵ
	                    if(value < min){//�ҳ���С��ֵ�µķ��ӷ�ĸֵ
	                        min = value;
	                        m = i;
	                        n = j;
	                    }
	                }
	            }
	        }
	        System.out.println("��ƽ�ָ�㣨0.618�����������������ǣ�"+(int)m+"/"+(int)n+"="+(m / n));

	}

}
