package com.jagex.runescape;
import com.jagex.runescape.io.Buffer;

import java.awt.Image;

public class Class66 {
	public static Class19_Sub1 aClass19_Sub1_1336;
	public static JagexString aJagexString_1319;
	public static JagexString aJagexString_1320;
	public static JagexString aJagexString_1324 = (JagexString.getRs2PreparedString(
			"Press (Wchange your password(W on front page)3"));
	public static JagexString aJagexString_1325;
	public static JagexString aJagexString_1334;
	public static Class4_Sub11_Sub1 aClass4_Sub11_Sub1_1328;
	public static Class66 aClass66_1330;
	public static Class66 aClass66_1337;
	public static Image anImage1326;
	public static int anInt1313;
	public static int anInt1314;
	public static int anInt1315;
	public static int anInt1316;
	public static int anInt1317;
	public static int anInt1318;
	public static int anInt1322;
	public static int anInt1323;
	public static int anInt1327;
	public static int anInt1329;
	static {
		aJagexString_1319 = aJagexString_1324;
		aJagexString_1325 = JagexString.getRs2PreparedString("Connection lost");
		aJagexString_1320 = aJagexString_1325;
		aClass4_Sub11_Sub1_1328 = new Class4_Sub11_Sub1(5000);
		aJagexString_1334 = JagexString.getRs2PreparedString("(U0a )2 via: ");
		aClass66_1330 = new Class66(64);
		aClass66_1337 = new Class66(64);
	}

	public static void method1079(byte arg0) {
		aClass4_Sub11_Sub1_1328 = null;
		aJagexString_1320 = null;
		aClass19_Sub1_1336 = null;
		aJagexString_1334 = null;
		aJagexString_1319 = null;
		anImage1326 = null;
		aClass66_1330 = null;
		aJagexString_1325 = null;
		aJagexString_1324 = null;
		aClass66_1337 = null;
		if (arg0 != -117)
			aClass66_1330 = null;
	}

	public static void method1080(int arg0, int arg1) {
		try {
			anInt1322++;
			if (Class4_Sub12.method277((byte) 116, arg0)) {
				RSInterface[] class4_sub13s = Class28.aClass4_Sub13ArrayArray632[arg0];
				for (int i = arg1; class4_sub13s.length > i; i++) {
					RSInterface class4_sub13 = class4_sub13s[i];
					if (class4_sub13 != null) {
						class4_sub13.anInt2153 = 0;
						class4_sub13.anInt2241 = 0;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("sf.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static Class4_Sub20_Sub16 method1085(int arg0, int arg1) {
		try {
			anInt1329++;
			Class4_Sub20_Sub16 class4_sub20_sub16 = ((Class4_Sub20_Sub16) Class4_Sub14.aClass66_2286
					.method1083(arg1, true));
			if (class4_sub20_sub16 != null)
				return class4_sub20_sub16;
			byte[] is = Class4_Sub20_Sub14.aClass19_Sub1_3146.method746(arg1,
					(byte) 124, 0);
			if (is == null)
				return null;
			class4_sub20_sub16 = new Class4_Sub20_Sub16();
			int i = 0;
			Buffer class4_sub11 = new Buffer(is);
			class4_sub11.pointer = -12 + class4_sub11.byteBuffer.length;
			int i_0_ = class4_sub11.method219((byte) 73);
			class4_sub20_sub16.anInt3174 = class4_sub11.read_u16((byte) -103);
			class4_sub20_sub16.anInt3163 = class4_sub11.read_u16((byte) -121);
			class4_sub20_sub16.anInt3173 = class4_sub11.read_u16((byte) -119);
			if (arg0 != 39)
				method1079((byte) 126);
			class4_sub20_sub16.anInt3168 = class4_sub11.read_u16((byte) -111);
			class4_sub11.pointer = 0;
			class4_sub20_sub16.aJagexString_3172 = class4_sub11
					.method226((byte) 76);
			class4_sub20_sub16.anIntArray3171 = new int[i_0_];
			class4_sub20_sub16.aJagexStringArray3178 = new JagexString[i_0_];
			class4_sub20_sub16.anIntArray3182 = new int[i_0_];
			while ((class4_sub11.byteBuffer.length - 12 ^ 0xffffffff) < (class4_sub11.pointer ^ 0xffffffff)) {
				int i_1_ = class4_sub11.read_u16((byte) -104);
				if ((i_1_ ^ 0xffffffff) == -4)
					class4_sub20_sub16.aJagexStringArray3178[i] = class4_sub11
							.method212();
				else if (i_1_ < 100 && i_1_ != 21 && i_1_ != 38 && i_1_ != 39)
					class4_sub20_sub16.anIntArray3171[i] = class4_sub11
							.method219((byte) 73);
				else
					class4_sub20_sub16.anIntArray3171[i] = class4_sub11.get();
				class4_sub20_sub16.anIntArray3182[i++] = i_1_;
			}
			Class4_Sub14.aClass66_2286.method1082(true, arg1,
					class4_sub20_sub16);
			return class4_sub20_sub16;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("sf.E("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public Class1 aClass1_1332 = new Class1();

	public Class16 aClass16_1335;

	public Class4_Sub20 aClass4_Sub20_1321 = new Class4_Sub20();

	public int anInt1331;

	public int anInt1333;

	public Class66(int arg0) {
		try {
			anInt1333 = arg0;
			anInt1331 = arg0;
			int i;
			for (i = 1; arg0 > i + i; i += i) {
				/* empty */
			}
			aClass16_1335 = new Class16(i);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"sf.<init>(" + arg0 + ')');
		}
	}

	public void method1081(int arg0, long arg1) {
		do {
			try {
				anInt1315++;
				Class4_Sub20 class4_sub20 = (Class4_Sub20) aClass16_1335
						.method725((byte) 117, arg1);
				if (arg0 > -54)
					method1081(75, -61L);
				if (class4_sub20 == null)
					break;
				class4_sub20.clear();
				class4_sub20.method320(-1);
				anInt1333++;
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
						("sf.D(" + arg0 + ',' + arg1 + ')'));
			}
			break;
		} while (false);
	}

	public void method1082(boolean arg0, long arg1, Class4_Sub20 arg2) {
		try {
			if (arg0 == true) {
				if ((anInt1333 ^ 0xffffffff) == -1) {
					Class4_Sub20 class4_sub20 = aClass1_1332.method40(118);
					class4_sub20.clear();
					class4_sub20.method320(-1);
					if (aClass4_Sub20_1321 == class4_sub20) {
						class4_sub20 = aClass1_1332.method40(-101);
						class4_sub20.clear();
						class4_sub20.method320(-1);
					}
				} else
					anInt1333--;
				anInt1323++;
				aClass16_1335.method720(arg2, arg1, false);
				aClass1_1332.method36(arg2, 3);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("sf.G("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class4_Sub20 method1083(long arg0, boolean arg1) {
		try {
			anInt1314++;
			if (arg1 != true)
				method1079((byte) -91);
			Class4_Sub20 class4_sub20 = (Class4_Sub20) aClass16_1335.method725(
					(byte) 117, arg0);
			if (class4_sub20 != null)
				aClass1_1332.method36(class4_sub20, 3);
			return class4_sub20;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("sf.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method1084(int arg0) {
		try {
			for (;;) {
				Class4_Sub20 class4_sub20 = aClass1_1332.method40(-88);
				if (class4_sub20 == null)
					break;
				class4_sub20.clear();
				class4_sub20.method320(-1);
			}
			if (arg0 != 0)
				method1085(117, -70);
			anInt1316++;
			anInt1333 = anInt1331;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "sf.F("
					+ arg0 + ')');
		}
	}
}
