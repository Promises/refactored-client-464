package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub1 extends RSFont {
	public static Class19_Sub1 aClass19_Sub1_1861;
	public static Class19_Sub1 aClass19_Sub1_1863;
	public static Class4_Sub11_Sub1 aClass4_Sub11_Sub1_1854 = new Class4_Sub11_Sub1(5000);
	public static int anInt1855;
	public static int anInt1857;
	public static int anInt1859 = 0;
	public static int anInt1860;
	public static int anInt1864;
	public static int anInt1865;
	public static int anInt1867;
	public static int[] anIntArray1862 = new int[500];

	public static void method75(int arg0, Class4_Sub2 arg1) {
		anInt1855++;
		arg1.aBoolean1874 = false;
		if (arg1.aClass4_Sub4_1873 != null)
			arg1.aClass4_Sub4_1873.anInt1913 = 0;
		for (Class4_Sub2 class4_sub2 = arg1.method79(); class4_sub2 != null; class4_sub2 = arg1
				.method81())
			method75(-19798, class4_sub2);
		if (arg0 != -19798)
			aClass19_Sub1_1861 = null;
	}

	public static void method76(byte arg0) {
		try {
			aClass19_Sub1_1863 = null;
			StringUtilities.aJagexString_1869 = null;
			aClass4_Sub11_Sub1_1854 = null;
			if (arg0 != 95)
				method76((byte) -93);
			StringUtilities.aJagexString_1868 = null;
			StringUtilities.aJagexString_1856 = null;
			aClass19_Sub1_1861 = null;
			anIntArray1862 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "af.A("
					+ arg0 + ')');
		}
	}

	public static boolean method77(int arg0) {
		try {
			anInt1867++;
			if ((Buffer.anInt2085 ^ 0xffffffff) != -1)
				return true;
			return Class1.aClass4_Sub2_Sub1_64.method119((byte) -25);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "af.B("
					+ arg0 + ')');
		}
	}

	public int[] anIntArray1858 = new int[1];

	public int[] anIntArray1866 = { -1 };
}
