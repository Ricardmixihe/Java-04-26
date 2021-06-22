package com.jizhong.demo;

/**
 * 
 * @author BaiHongyu
 * 数据类型转换
 * 	1. 自动类型转换：小数据转大类型，java内部会自动做类型转换处理
 * 		byte->short-> int -> long -> float -> double //自动类型转换
 * 		byte、short、char-> int -> long -> float -> double //计算
		大类型可以直接接收小类型数据。
		
 * 	2. 强制类型转换：大数据转小类型，需要自行转换（强制转换符号：(type)）
 * 		
 * 		
 */
public class Demo01 {
	public static void main(String[] args) {
//		byte b1 = 127;	//小数据
//		int i1 = b1;
//		System.out.println(b1);
//		System.out.println(i1);
		
		//long类型赋值需要在数值后加上 l or L
//		long l1 = 3000l;	//直接写整数，默认为int类型
//		float f1 = l1;	//整数转换为小数，整数后加上小数点
//		System.out.println(l1);
//		System.out.println(f1);
		
		//float类型赋值需要在数值后加上 f or F
		//浮点数类型在计算机中计算或者转换会丢失精度
//		float f1 = 123.23f;	//浮点数直接编写，默认为double类型
//		double d1 = f1;
//		System.out.println(f1);
//		System.out.println(d1);
		
		//char类型转换数字，先把字符对应unicode编码拿到，然后再进行转换
		// unicode a = 97  A = 65
//		char c1 = 'a';	
//		int i1 = c1;
//		System.out.println(c1);
//		System.out.println(i1);
		
		//计算
		//byte、short、char-> int -> long -> float -> double //计算
		//计算中：byte、short、char类型进行计算 最终结果默认为int类型
//		byte b1 = 127;
//		short s = 1;
//		int s2 = b1 + s;
//		System.out.println(s2);
		
		//两个数值之间进行计算，得到的结果类型只能是两个数值之间大的那个类型
//		long l1 = 1000l;
//		int i1 = 100;
//		long i2 =  l1 + i1;	
		
		
		
		//2. 强制类型转换：大数据转小类型，需要自行转换（强制转换符号：(type)）
		//注意：强制类型转换会丢失数据
//		double d1 = 10000.99;
//		int i1 = (int)d1;
//		System.out.println(d1);
//		System.out.println(i1);
		
		int i1 = 128;
		byte b1 = (byte)i1;
		System.out.println(i1);	// 128
		System.out.println(b1);	// - 128
		
		String num1 = Integer.toOctalString(10);	//转换为8进制
		String num2 = Integer.toHexString(10);	//转换为16进制
		String num3 = Integer.toBinaryString(10);	//转换为2进制
		
		System.out.println("2进制" + num3);
		System.out.println("8进制" + num1);
		System.out.println("16进制" + num2);
		
		
	}
}
