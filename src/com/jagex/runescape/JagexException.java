package com.jagex.runescape;/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class JagexException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5345797095678146377L;
	public static JagexString aJagexString_1733;
	public static JagexString aJagexString_1734 = JagexString.getRs2PreparedString(
			")4lang)4de");
	public static Class4_Sub20_Sub12_Sub2[] aClass4_Sub20_Sub12_Sub2Array1732;
	public static Class43 aClass43_1728;
	public static int anInt1726 = 0;
	public static int anInt1727;
	public static int anInt1729 = 0;
	public static int anInt1731;
	public static int anInt1735;
	static {
		aJagexString_1733 = JagexString.getRs2PreparedString("(Z");
	}

	public static void method1218(int arg0) {
		try {
			aClass4_Sub20_Sub12_Sub2Array1732 = null;
			if (arg0 != 32768)
				aJagexString_1733 = null;
			aJagexString_1733 = null;
			aJagexString_1734 = null;
			aClass43_1728 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static void method1219(Class19 arg0, Class19 arg1, byte arg2,
			Component arg3) {
		try {
			anInt1731++;
			if (!RSInterface.aBoolean2203) {
				Class4_Sub20_Sub12.method496();
				byte[] is = arg1.method753(false, JagexString.aJagexString_1824,
						Class34.aJagexString_1767);
				Class4_Sub20_Sub16.aClass4_Sub20_Sub12_Sub2_3177 = new Class4_Sub20_Sub12_Sub2(
						is, arg3);
				Class34.aClass4_Sub20_Sub12_Sub2_1760 = Class4_Sub20_Sub16.aClass4_Sub20_Sub12_Sub2_3177
						.method524();
				Class31.aClass4_Sub20_Sub12_Sub1_676 = Class2.method44(24094,
						Class34.aJagexString_1767, RSApplet.aJagexString_25, arg0);
				Class24.aClass4_Sub20_Sub12_Sub1_549 = Class2.method44(24094,
						Class34.aJagexString_1767, Class2.aJagexString_92, arg0);
				Class4_Sub20_Sub7_Sub1.aClass4_Sub20_Sub12_Sub1_3260 = Class2
						.method44(24094, Class34.aJagexString_1767,
								Class4_Sub20_Sub11.aJagexString_3090, arg0);
				Class81.aClass4_Sub20_Sub12_Sub1Array1709 = Class63.method1055(
						Class34.aJagexString_1767, arg0, 92,
						Class4_Sub20_Sub17.aJagexString_3214);
				RSApplet.aClass4_Sub20_Sub12_Sub1Array43 = Class63.method1055(
						Class34.aJagexString_1767, arg0, 11,
						Class4_Sub20_Sub7_Sub3.aJagexString_3337);
				Class65.anIntArray1307 = new int[256];
				for (int i = 0; (i ^ 0xffffffff) > -65; i++)
					Class65.anIntArray1307[i] = 262144 * i;
				for (int i = 0; (i ^ 0xffffffff) > -65; i++)
					Class65.anIntArray1307[i + 64] = i * 1024 + 16711680;
				for (int i = 0; i < 64; i++)
					Class65.anIntArray1307[i + 128] = 4 * i + 16776960;
				for (int i = 0; i < 64; i++)
					Class65.anIntArray1307[i - -192] = 16777215;
				Class80.anIntArray1644 = new int[256];
				for (int i = 0; (i ^ 0xffffffff) > -65; i++)
					Class80.anIntArray1644[i] = i * 1024;
				for (int i = 0; i < 64; i++)
					Class80.anIntArray1644[64 + i] = i * 4 + 65280;
				for (int i = 0; i < 64; i++)
					Class80.anIntArray1644[i + 128] = 262144 * i + 65535;
				for (int i = 0; i < 64; i++)
					Class80.anIntArray1644[192 + i] = 16777215;
				Class2.anIntArray90 = new int[256];
				for (int i = 0; i < 64; i++)
					Class2.anIntArray90[i] = i * 4;
				for (int i = 0; i < 64; i++)
					Class2.anIntArray90[i - -64] = i * 262144 + 255;
				if (arg2 < 13)
					method1218(73);
				for (int i = 0; i < 64; i++)
					Class2.anIntArray90[i - -128] = 1024 * i + 16711935;
				for (int i = 0; i < 64; i++)
					Class2.anIntArray90[i - -192] = 16777215;
				Class4_Sub24.anIntArray2450 = new int[256];
				Class52.anIntArray1059 = new int[32768];
				Class65.anIntArray1284 = new int[32768];
				Region.method58((byte) 127, null);
				Class4_Sub20_Sub17.anIntArray3206 = new int[32768];
				if (Class4_Sub20_Sub8.anInt3021 != 0)
					Class34.aBoolean1765 = false;
				else
					Class34.aBoolean1765 = true;
				Class34.aJagexString_1764 = Class34.aJagexString_1767;
				Class34.aJagexString_1768 = Class34.aJagexString_1767;
				Class4_Sub20_Sub14.anInt3140 = 0;
				Class49.aBoolean990 = false;
				Class76.anIntArray1565 = new int[32768];
				if (Class34.aBoolean1765)
					Class32.method882(2, 97);
				else
					Class31.method879(Class9.aJagexString_269, 2,
							Class54.aClass19_Sub1_1107, false, 255, -90,
							Class34.aJagexString_1767);
				Class4_Sub20_Sub7_Sub5.method426(118, false);
				RSInterface.aBoolean2203 = true;
				Class4_Sub20_Sub16.aClass4_Sub20_Sub12_Sub2_3177
						.method523(0, 0);
				Class34.aClass4_Sub20_Sub12_Sub2_1760.method523(382, 0);
				Class31.aClass4_Sub20_Sub12_Sub1_676
						.method507(
								(-(Class31.aClass4_Sub20_Sub12_Sub1_676.anInt3511 / 2) + 382),
								18);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("cf.A("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public String errorMessage;

	public Throwable throwable;

	public JagexException(Throwable t, String err) {
		try {
			throwable = t;
			errorMessage = err;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
