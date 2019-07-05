package control_process;
//黄金分割比，求一个最接近0.618的数字，而且分子和坟墓不能同时为偶数

public class Golden_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float i, j, m = 0 , n = 0.0f, min = 1.0f, value;

	        for(i = 1.0f; i <= 20.0; i++){
	            for(j = i + 1; j <= 20.0; j++){//取值在0.618附近式，分数值必小于1，故分母＞分子
	                if(i % 2 != 0 || j % 2 != 0){//在分子分母不同时为偶数的前提下，再计算分数值
	                    if(i / j > 0.618)value = i / j - 0.618f;
	                    else value =  0.618f - i / j;//求分数值与黄金分割点的差值绝对值
	                    if(value < min){//找出最小差值下的分子分母值
	                        min = value;
	                        m = i;
	                        n = j;
	                    }
	                }
	            }
	        }
	        System.out.println("离黄金分割点（0.618）最近的两个数相除是："+(int)m+"/"+(int)n+"="+(m / n));

	}

}
