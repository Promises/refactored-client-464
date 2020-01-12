package com.jagex.runescape;
import com.jagex.runescape.io.Buffer;
import com.jagex.runescape.util.Signlink;

import java.util.zip.Inflater;

public class Class77 {
	public static boolean members;
	public static Class19_Sub1 aClass19_Sub1_1589;
	public static Signlink aClass75_1597;
	public static int anInt1583;
	public static int anInt1584;
	public static int anInt1587;
	public static int anInt1588;
	public static int anInt1591;
	public static int anInt1593;
	public static int anInt1594;
	public static int anInt1595;
	public static int anInt1596;
	public static int[] anIntArray1585;
	public static int[][] anIntArrayArray1592 = new int[104][104];
	static {
		anIntArray1585 = new int[100];
		members = false;
		anInt1591 = 0;
		anInt1588 = 0;
		anInt1583 = 0;
		anInt1587 = 0;
	}

	public static void method1191(byte arg0) {
		anInt1596++;
		if (Class59.aBoolean1189
				&& (Class82.plane ^ 0xffffffff) != (Class50.anInt1010 ^ 0xffffffff))
			Class47.method978(
					Class53.anInt1079,
					(Class4_Sub15.localPlayer.anIntArray3248[0]),
					false,
					Class82.plane,
					(Class4_Sub15.localPlayer.anIntArray3247[0]),
					Class4_Sub17.anInt2324);
		else if (arg0 < -8) {
			if ((Class18.anInt477 ^ 0xffffffff) != (Class82.plane ^ 0xffffffff)) {
				Class18.anInt477 = Class82.plane;
				Class4_Sub20_Sub7_Sub5.method429(4, Class82.plane);
			}
		}
	}

	public static void method1192(int arg0, boolean arg1, Class19 arg2,
			int arg3, int arg4, int arg5, int arg6) {
		try {

			if (arg6 == 0) {
				Class25.anInt577 = arg0;
				Class67.aClass19_1363 = arg2;
				anInt1593++;
				Buffer.anInt2085 = 1;
				Class4_Sub20_Sub6.aBoolean2914 = arg1;
				Class4_Sub20_Sub9.anInt3050 = arg4;
				Class4_Sub20_Sub5.anInt2888 = arg3;
				Class4_Sub21.anInt2374 = arg5;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("vd.A("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
					+ arg4 + ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	public static void method1193(byte arg0) {
		try {
			anIntArrayArray1592 = null;
			if (arg0 != 60)
				anInt1591 = 32;
			aClass19_Sub1_1589 = null;
			anIntArray1585 = null;
			aClass75_1597 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "vd.D("
					+ arg0 + ')');
		}
	}

	public Inflater anInflater1586;

	public Class77() {
		this(-1, 1000000, 1000000);
	}

	public Class77(int arg0, int arg1, int arg2) {
		/* empty */
	}

	public void method1190(byte arg0, byte[] arg1, Buffer arg2) {
		try {
			anInt1594++;
			if (arg2.byteBuffer[arg2.currentPosition] != 31
					|| arg2.byteBuffer[1 + arg2.currentPosition] != -117)
				throw new RuntimeException("Invalid GZIP header!");
			if (anInflater1586 == null)
				anInflater1586 = new Inflater(true);
			try {
				anInflater1586.setInput(arg2.byteBuffer, 10 + arg2.currentPosition,
						(arg2.byteBuffer.length + (-arg2.currentPosition - 10 + -8)));
				anInflater1586.inflate(arg1);
			} catch (Exception exception) {
				anInflater1586.reset();
				throw new RuntimeException("Invalid GZIP compressed data!");
			}
			anInflater1586.reset();
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("vd.C("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}
}
