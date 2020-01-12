package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class44 {
	public static int[] anIntArray907 = new int[500];
	public static int[] anIntArray913;
	public static int[] anIntArray914 = new int[500];
	public static int[] anIntArray916;
	static {
		anIntArray913 = new int[500];
		anIntArray916 = new int[500];
	}

	public static void method969() {
		anIntArray913 = null;
		anIntArray914 = null;
		anIntArray907 = null;
		anIntArray916 = null;
	}

	public boolean aBoolean911 = false;
	public Class4_Sub24 aClass4_Sub24_915;
	public int anInt910;
	public int[] anIntArray908;
	public int[] anIntArray909;

	public int[] anIntArray912;

	public int[] anIntArray917;

	public Class44(byte[] arg0, Class4_Sub24 arg1) {
		anInt910 = -1;
		aClass4_Sub24_915 = null;
		aClass4_Sub24_915 = arg1;
		Buffer class4_sub11 = new Buffer(arg0);
		Buffer class4_sub11_0_ = new Buffer(arg0);
		class4_sub11.currentPosition = 2;
		int i = class4_sub11.get();
		int i_1_ = -1;
		int i_2_ = 0;
		class4_sub11_0_.currentPosition = class4_sub11.currentPosition + i;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			int i_4_ = class4_sub11.get();
			if (i_4_ > 0) {
				if (aClass4_Sub24_915.anIntArray2444[i_3_] != 0) {
					for (int i_5_ = i_3_ - 1; i_5_ > i_1_; i_5_--) {
						if (aClass4_Sub24_915.anIntArray2444[i_5_] == 0) {
							anIntArray913[i_2_] = i_5_;
							anIntArray914[i_2_] = 0;
							anIntArray907[i_2_] = 0;
							anIntArray916[i_2_] = 0;
							i_2_++;
							break;
						}
					}
				}
				anIntArray913[i_2_] = i_3_;
				int i_6_ = 0;
				if (aClass4_Sub24_915.anIntArray2444[i_3_] == 3)
					i_6_ = 128;
				if ((i_4_ & 0x1) != 0)
					anIntArray914[i_2_] = class4_sub11_0_.readSmart(-59);
				else
					anIntArray914[i_2_] = i_6_;
				if ((i_4_ & 0x2) != 0)
					anIntArray907[i_2_] = class4_sub11_0_.readSmart(-84);
				else
					anIntArray907[i_2_] = i_6_;
				if ((i_4_ & 0x4) != 0)
					anIntArray916[i_2_] = class4_sub11_0_.readSmart(-80);
				else
					anIntArray916[i_2_] = i_6_;
				i_1_ = i_3_;
				i_2_++;
				if (aClass4_Sub24_915.anIntArray2444[i_3_] == 5)
					aBoolean911 = true;
			}
		}
		if (class4_sub11_0_.currentPosition != arg0.length)
			throw new RuntimeException();
		anInt910 = i_2_;
		anIntArray909 = new int[i_2_];
		anIntArray912 = new int[i_2_];
		anIntArray908 = new int[i_2_];
		anIntArray917 = new int[i_2_];
		for (int i_7_ = 0; i_7_ < i_2_; i_7_++) {
			anIntArray909[i_7_] = anIntArray913[i_7_];
			anIntArray912[i_7_] = anIntArray914[i_7_];
			anIntArray908[i_7_] = anIntArray907[i_7_];
			anIntArray917[i_7_] = anIntArray916[i_7_];
		}
	}
}
