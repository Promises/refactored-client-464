package com.jagex.runescape;

public class Class4_Sub4_Sub1 extends Class4_Sub4 {
	public boolean aBoolean2664;
	public byte[] aByteArray2661;
	public int anInt2660;
	public int anInt2662;
	public int anInt2663;

	public Class4_Sub4_Sub1(int arg0, byte[] arg1, int arg2, int arg3) {
		anInt2662 = arg0;
		aByteArray2661 = arg1;
		anInt2663 = arg2;
		anInt2660 = arg3;
	}

	public Class4_Sub4_Sub1(int arg0, byte[] arg1, int arg2, int arg3,
			boolean arg4) {
		anInt2662 = arg0;
		aByteArray2661 = arg1;
		anInt2663 = arg2;
		anInt2660 = arg3;
		aBoolean2664 = arg4;
	}

	public Class4_Sub4_Sub1 method177(Class8 arg0) {
		aByteArray2661 = arg0.method657(aByteArray2661, 0);
		anInt2662 = arg0.method658(-1006, anInt2662);
		if (anInt2663 == anInt2660)
			anInt2663 = anInt2660 = arg0.method660(31942, anInt2663);
		else {
			anInt2663 = arg0.method660(31942, anInt2663);
			anInt2660 = arg0.method660(31942, anInt2660);
			if (anInt2663 == anInt2660)
				anInt2663--;
		}
		return this;
	}
}
