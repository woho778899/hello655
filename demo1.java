public class demo1
{
//主程序入口
public static void main(String args[])
	{
//定义变量
	int i=42;
	int i2=06;
	int j=-12;
	int j2=0x06;
	
	float ii=11.91f;
	int z=(int)ii;
int s=i+i2+j+j2;
	char c='岁';
	char c2=233;
	char c3='\n';
	int z2=(int)c3;

//输出
	System.out.println("整数变量和为："+s);
	System.out.println(c3);
	System.out.println("浮点变量为："+ii);
	System.out.println("浮点变量转化为整数变量为："+z);
	System.out.println("字符转化为数字为："+z2);
	
	System.out.println(c3);
	System.out.println("黄小妹老爸今年"+i+c+"了，可喜可贺！");

	}


}