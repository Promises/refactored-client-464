package com.jagex.runescape;

public class Class4_Sub2_Sub2 extends Class4_Sub2 {
	public Class65 aClass65_2623 = new Class65();
	public Class65 aClass65_2624 = new Class65();
	public int anInt2625 = 0;
	public int anInt2626 = -1;

	public synchronized void method120(Class4_Sub2 arg0) {
		aClass65_2623.method1077(false, arg0);
	}

	public void method121(Class4_Sub5 arg0) {
		arg0.method70(-315);
		arg0.method178();
		RSFont class4 = aClass65_2624.aClass4_1286.aClass4_149;
		if (class4 == aClass65_2624.aClass4_1286)
			anInt2626 = -1;
		else
			anInt2626 = ((Class4_Sub5) class4).anInt1914;
	}

	public synchronized void method122(Class4_Sub2 arg0) {
		arg0.method70(-315);
	}

	public void method123(RSFont arg0, Class4_Sub5 arg1) {
		for (/**/; (arg0 != aClass65_2624.aClass4_1286 && ((Class4_Sub5) arg0).anInt1914 <= arg1.anInt1914); arg0 = arg0.aClass4_149) {
			/* empty */
		}
		aClass65_2624.method1074(arg1, (byte) -62, arg0);
		anInt2626 = ((Class4_Sub5) aClass65_2624.aClass4_1286.aClass4_149).anInt1914;
	}

	public void method124() {
		if (anInt2625 > 0) {
			for (Class4_Sub5 class4_sub5 = (Class4_Sub5) aClass65_2624
					.method1071(-120); class4_sub5 != null; class4_sub5 = (Class4_Sub5) aClass65_2624
					.method1075(18485))
				class4_sub5.anInt1914 -= anInt2625;
			anInt2626 -= anInt2625;
			anInt2625 = 0;
		}
	}

	public void method125(int[] arg0, int arg1, int arg2) {
		for (Class4_Sub2 class4_sub2 = (Class4_Sub2) aClass65_2623
				.method1071(-120); class4_sub2 != null; class4_sub2 = (Class4_Sub2) aClass65_2623
				.method1075(18485))
			class4_sub2.method84(arg0, arg1, arg2);
	}

	public void method126(int arg0) {
		for (Class4_Sub2 class4_sub2 = (Class4_Sub2) aClass65_2623
				.method1071(-122); class4_sub2 != null; class4_sub2 = (Class4_Sub2) aClass65_2623
				.method1075(18485))
			class4_sub2.method82(arg0);
	}

	@Override
	public int method78() {
		return 0;
	}

	@Override
	public Class4_Sub2 method79() {
		return (Class4_Sub2) aClass65_2623.method1071(-125);
	}

	@Override
	public synchronized void method80(int[] arg0, int arg1, int arg2) {
		do {
			if (anInt2626 < 0) {
				method125(arg0, arg1, arg2);
				break;
			}
			if (anInt2625 + arg2 < anInt2626) {
				anInt2625 += arg2;
				method125(arg0, arg1, arg2);
				break;
			}
			int i = anInt2626 - anInt2625;
			method125(arg0, arg1, i);
			arg1 += i;
			arg2 -= i;
			anInt2625 += i;
			method124();
			Class4_Sub5 class4_sub5 = (Class4_Sub5) aClass65_2624
					.method1071(-121);
			synchronized (class4_sub5) {
				int i_0_ = class4_sub5.method179(this);
				if (i_0_ < 0) {
					class4_sub5.anInt1914 = 0;
					method121(class4_sub5);
				} else {
					class4_sub5.anInt1914 = i_0_;
					method123(class4_sub5.aClass4_149, class4_sub5);
				}
			}
		} while (arg2 != 0);
	}

	@Override
	public Class4_Sub2 method81() {
		return (Class4_Sub2) aClass65_2623.method1075(18485);
	}

	@Override
	public synchronized void method82(int arg0) {
		do {
			if (anInt2626 < 0) {
				method126(arg0);
				break;
			}
			if (anInt2625 + arg0 < anInt2626) {
				anInt2625 += arg0;
				method126(arg0);
				break;
			}
			int i = anInt2626 - anInt2625;
			method126(i);
			arg0 -= i;
			anInt2625 += i;
			method124();
			Class4_Sub5 class4_sub5 = (Class4_Sub5) aClass65_2624
					.method1071(-122);
			synchronized (class4_sub5) {
				int i_1_ = class4_sub5.method179(this);
				if (i_1_ < 0) {
					class4_sub5.anInt1914 = 0;
					method121(class4_sub5);
				} else {
					class4_sub5.anInt1914 = i_1_;
					method123(class4_sub5.aClass4_149, class4_sub5);
				}
			}
		} while (arg0 != 0);
	}
}
