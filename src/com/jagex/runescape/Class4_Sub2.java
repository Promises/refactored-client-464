package com.jagex.runescape;

public abstract class Class4_Sub2 extends RSFont {
	public volatile boolean aBoolean1874 = true;
	public Class4_Sub2 aClass4_Sub2_1872;
	public Class4_Sub4 aClass4_Sub4_1873;
	public int anInt1871;

	public abstract int method78();

	public abstract Class4_Sub2 method79();

	public abstract void method80(int[] is, int i, int i_0_);

	public abstract Class4_Sub2 method81();

	public abstract void method82(int i);

	public int method83() {
		return 255;
	}

	public void method84(int[] arg0, int arg1, int arg2) {
		if (aBoolean1874)
			method80(arg0, arg1, arg2);
		else
			method82(arg2);
	}
}
