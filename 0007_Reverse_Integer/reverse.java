public class Helloworld{
	public static void main(String[] args) {
		// 输入一个三位数，输出它的逆序排列
		Scanner input=new Scanner(System.in);//创建Scanner对象
		System.out.println("请输入三位数:");
		int score = input.nextInt();//获取用户输入成绩并保存在变量中
		int m = Math.abs(score);
		int a = m / 100;
		
		int b = (m - a * 100) / 10;
		int c = (m - a * 100 - b * 10);
		int n = c * 100 + b * 10 + a;
		if (score > 0) {
		System.out.println("输出结果为："+n);
		}else {
			System.out .println("输出结果为：-"+n);
		}
	}
	}
