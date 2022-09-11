package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub20_Sub16 extends Class4_Sub20 {
	public static boolean aBoolean3169 = false;
	public static RSInterface aClass4_Sub13_3179 = null;
	public static ImageRGB aImageRGB_3177;
	public static int anInt3160;
	public static int anInt3161;
	public static int anInt3164 = 0;
	public static int anInt3167;
	public static int anInt3170;
	public static int anInt3175;
	public static int anInt3176;

	public static void method606(int arg0) {
		try {
			anInt3175++;
			if (arg0 != 25651)
				method611((byte) -7, -6, -84, null, -1, 100);
			Class1.aClass4_Sub2_Sub1_64.method110((byte) -56);
			Buffer.anInt2085 = 1;
			Class67.aClass19_1363 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "ta.E("
					+ arg0 + ')');
		}
	}

	public static boolean method607(boolean arg0, Class19 arg1, int arg2) {
		try {
			anInt3176++;
			byte[] is = arg1.method740(arg2, arg0);
			if (is == null)
				return false;
			Class64.method1060(is, 53);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("ta.B("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ')'));
		}
	}

	public static int method608(int arg0) {
		try {
			anInt3161++;
			if (arg0 != 6)
				return -115;
			return 6;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "ta.D("
					+ arg0 + ')');
		}
	}

	public static byte[] method609(int arg0, byte[] arg1) {
		try {
			if (arg0 > -3)
				method609(-121, null);
			Buffer class4_sub11 = new Buffer(arg1);
			anInt3167++;
			int i = class4_sub11.get();
			int i_0_ = class4_sub11.readInt();
			if (i_0_ < 0 || Class31.anInt689 != 0 && Class31.anInt689 < i_0_)
				throw new RuntimeException();
			if (i != 0) {
				int i_1_ = class4_sub11.readInt();
				if ((i_1_ ^ 0xffffffff) > -1
						|| ((Class31.anInt689 ^ 0xffffffff) != -1 && (i_1_ ^ 0xffffffff) < (Class31.anInt689 ^ 0xffffffff)))
					throw new RuntimeException();
				byte[] is = new byte[i_1_];
				if ((i ^ 0xffffffff) == -2)
					Class23.method780(is, i_1_, arg1, i_0_, 9);
				else
					ItemDefinition.aClass77_3020.method1190((byte) -84, is,
							class4_sub11);
				return is;
			}
			byte[] is = new byte[i_0_];
			class4_sub11.method253(0, (byte) -15, i_0_, is);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("ta.C("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method610(int arg0) {
		try {
			StringUtilities.aJagexString_3181 = null;
			if (arg0 < 95)
				method609(25, null);
			aClass4_Sub13_3179 = null;
			StringUtilities.aJagexString_3180 = null;
			aImageRGB_3177 = null;
			StringUtilities.aJagexString_3162 = null;
			StringUtilities.aJagexString_3165 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "ta.A("
					+ arg0 + ')');
		}
	}

	public static void method611(byte arg0, int arg1, int arg2,
			Class4_Sub20_Sub1 arg3, int arg4, int arg5) {
		anInt3160++;
		Class4_Sub22 class4_sub22 = new Class4_Sub22();
		class4_sub22.anInt2394 = 128 * arg1;
		class4_sub22.anInt2384 = arg3.anInt2727;
		class4_sub22.anInt2397 = arg4;
		class4_sub22.anInt2404 = arg3.anInt2756;
		class4_sub22.anInt2386 = 128 * arg3.anInt2743;
		class4_sub22.anInt2388 = arg3.anInt2721;
		class4_sub22.anIntArray2383 = arg3.anIntArray2736;
		if (arg0 < 26)
			method606(78);
		class4_sub22.anInt2407 = 128 * arg5;
		int i = arg3.anInt2725;
		int i_2_ = arg3.anInt2744;
		if (arg2 == 1 || (arg2 ^ 0xffffffff) == -4) {
			i = arg3.anInt2744;
			i_2_ = arg3.anInt2725;
		}
		class4_sub22.anInt2389 = (i + arg1) * 128;
		class4_sub22.anInt2408 = 128 * (i_2_ + arg5);
		if (arg3.anIntArray2732 != null) {
			class4_sub22.aClass4_Sub20_Sub1_2399 = arg3;
			class4_sub22.method626(false);
		}
		Buffer.aClass65_2073.method1068(class4_sub22, (byte) -117);
		if (class4_sub22.anIntArray2383 != null)
			class4_sub22.anInt2409 = (class4_sub22.anInt2384 - -(int) ((class4_sub22.anInt2388 + -class4_sub22.anInt2384) * Math
					.random()));
	}

	public JagexString aJagexString_3172;

	public JagexString[] aJagexStringArray3178;

	public int anInt3163;

	public int anInt3168;

	public int anInt3173;

	public int anInt3174;

	public int[] anIntArray3171;

	public int[] anIntArray3182;
}
