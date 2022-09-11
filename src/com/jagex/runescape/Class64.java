package com.jagex.runescape;
import com.jagex.runescape.io.Buffer;
import com.jagex.runescape.util.Signlink;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class64 {
	public static Class16 aClass16_1259;
	public static JagexString aJagexString_1257;
	public static JagexString aJagexString_1258;
	public static JagexString aJagexString_1260;
	public static JagexString aJagexString_1266;
	public static JagexString aJagexString_1268 = JagexString.getRs2PreparedString(
			"<img=1>");
	public static JagexString aJagexString_1276;
	public static JagexString aJagexString_1281;
	public static JagexString aJagexString_1283;
	public static long[] aLongArray1279;
	public static int anInt1253;
	public static int anInt1254;
	public static int anInt1255;
	public static int anInt1256;
	public static int anInt1263;
	public static int anInt1264;
	public static int anInt1265;
	public static int anInt1267;
	public static int anInt1271;
	public static int anInt1272;
	public static int anInt1273;
	public static int anInt1277;
	public static int anInt1278;
	public static int anInt1282;
	static {
		aJagexString_1258 = JagexString.getRs2PreparedString("(U3");
		aJagexString_1257 = JagexString.getRs2PreparedString("rot:");
		anInt1277 = -1;
		aJagexString_1276 = JagexString.getRs2PreparedString("yellow:");
		aJagexString_1266 = aJagexString_1276;
		aJagexString_1260 = aJagexString_1276;
		aLongArray1279 = new long[200];
		aClass16_1259 = new Class16(512);
		anInt1282 = 0;
		aJagexString_1283 = JagexString.getRs2PreparedString(
				"Please enter your password)3");
		aJagexString_1281 = aJagexString_1283;
	}

	public static void method1060(byte[] arg0, int arg1) {
		try {
			anInt1256++;
			Buffer class4_sub11 = new Buffer(arg0);
			class4_sub11.currentPosition = arg0.length - 2;
			Class49.anInt991 = class4_sub11.readShort();
			Class30.anIntArray650 = new int[Class49.anInt991];
			Class35.anIntArray726 = new int[Class49.anInt991];
			Class13_Sub2.anIntArray2480 = new int[Class49.anInt991];
			Class4_Sub23.aByteArrayArray2426 = new byte[Class49.anInt991][];
			Class4_Sub20_Sub7_Sub5.anIntArray3395 = new int[Class49.anInt991];
			class4_sub11.currentPosition = -7 + arg0.length + -(8 * Class49.anInt991);
			Class53.anInt1080 = class4_sub11.readShort();
			Class32.anInt696 = class4_sub11.readShort();
			int i_1_ = (class4_sub11.get() & 0xff) - -1;
			for (int i_2_ = 0; i_2_ < Class49.anInt991; i_2_++)
				Class35.anIntArray726[i_2_] = class4_sub11
						.readShort();
			for (int i_3_ = 0; i_3_ < Class49.anInt991; i_3_++)
				Class4_Sub20_Sub7_Sub5.anIntArray3395[i_3_] = class4_sub11
						.readShort();
			for (int i_4_ = 0; i_4_ < Class49.anInt991; i_4_++)
				Class30.anIntArray650[i_4_] = class4_sub11
						.readShort();
			for (int i_5_ = 0; (Class49.anInt991 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++)
				Class13_Sub2.anIntArray2480[i_5_] = class4_sub11
						.readShort();
			class4_sub11.currentPosition = (-(3 * (i_1_ + -1)) + (arg0.length + -7) - 8 * Class49.anInt991);
			Class67.anIntArray1367 = new int[i_1_];
			for (int i_6_ = 1; (i_1_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
				Class67.anIntArray1367[i_6_] = class4_sub11.method248(false);
				if (Class67.anIntArray1367[i_6_] == 0)
					Class67.anIntArray1367[i_6_] = 1;
			}
			class4_sub11.currentPosition = 0;
			for (int i_7_ = 0; (Class49.anInt991 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
				int i_8_ = Class30.anIntArray650[i_7_];
				int i_9_ = Class13_Sub2.anIntArray2480[i_7_];
				int i_10_ = i_9_ * i_8_;
				byte[] is = new byte[i_10_];
				Class4_Sub23.aByteArrayArray2426[i_7_] = is;
				int i_11_ = class4_sub11.get();
				if (i_11_ == 0) {
					for (int i_12_ = 0; i_12_ < i_10_; i_12_++)
						is[i_12_] = class4_sub11.method229(109);
				} else if ((i_11_ ^ 0xffffffff) == -2) {
					for (int i_13_ = 0; i_8_ > i_13_; i_13_++) {
						for (int i_14_ = 0; i_9_ > i_14_; i_14_++)
							is[i_8_ * i_14_ + i_13_] = class4_sub11
									.method229(-120);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("sd.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static boolean method1061(byte arg0) {
		try {
			anInt1265++;
			try {
				if (arg0 != 90)
					return false;
				if ((Buffer.anInt2085 ^ 0xffffffff) == -3) {
					if (Class4_Sub20_Sub1.aClass4_Sub18_2704 == null) {
						Class4_Sub20_Sub1.aClass4_Sub18_2704 = Class4_Sub18
								.method311(Class67.aClass19_1363,
										Class4_Sub21.anInt2374,
										Class25.anInt577);
						if (Class4_Sub20_Sub1.aClass4_Sub18_2704 == null)
							return false;
					}
					if (Class4_Sub20_Sub5.aClass81_2880 == null)
						Class4_Sub20_Sub5.aClass81_2880 = new Class81(
								Class61.aClass19_1202, Class71.aClass19_1474);
					if (Class1.aClass4_Sub2_Sub1_64.method103(22050,
							Class4_Sub20_Sub5.aClass81_2880, false,
							Class4_Sub20_Sub1.aClass4_Sub18_2704,
							Class4_Sub7.aClass19_1956)) {
						Class1.aClass4_Sub2_Sub1_64.method107(false);
						Class1.aClass4_Sub2_Sub1_64.method112(
								Class4_Sub20_Sub9.anInt3050, arg0 ^ 0x38);
						Class1.aClass4_Sub2_Sub1_64.method109(
								Class4_Sub20_Sub1.aClass4_Sub18_2704, 124,
								Class4_Sub20_Sub6.aBoolean2914);
						Class4_Sub20_Sub1.aClass4_Sub18_2704 = null;
						Class67.aClass19_1363 = null;
						Class4_Sub20_Sub5.aClass81_2880 = null;
						Buffer.anInt2085 = 0;
						return true;
					}
				}
			} catch (Exception exception) {
				exception.printStackTrace();
				Class1.aClass4_Sub2_Sub1_64.method110((byte) -127);
				Class4_Sub20_Sub5.aClass81_2880 = null;
				Class67.aClass19_1363 = null;
				Buffer.anInt2085 = 0;
				Class4_Sub20_Sub1.aClass4_Sub18_2704 = null;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "sd.D("
					+ arg0 + ')');
		}
	}

	public static void method1062(int arg0) {
		try {
			aJagexString_1281 = null;
			aLongArray1279 = null;
			aJagexString_1260 = null;
			aJagexString_1266 = null;
			if (arg0 >= 59) {
				aJagexString_1257 = null;
				aJagexString_1258 = null;
				aJagexString_1268 = null;
				aJagexString_1276 = null;
				aClass16_1259 = null;
				aJagexString_1283 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "sd.B("
					+ arg0 + ')');
		}
	}

	public static void method1063(byte arg0) {
		try {
			synchronized (Class12.anObject366) {
				if ((Class10.anInt307 ^ 0xffffffff) == -1)
					Class43.aClass75_872.method1172(new Class49(), 5, 83);
				if (arg0 <= 114)
					aLongArray1279 = null;
				Class10.anInt307 = 600;
			}
			anInt1267++;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "sd.C("
					+ arg0 + ')');
		}
	}

	public static void method1064(int arg0, byte arg1,
                                  Player arg2, int arg3) {
		if (arg1 < 88)
			method1066(-109, null, -20);
		anInt1255++;
		if ((arg3 ^ 0xffffffff) != (arg2.anInt3277 ^ 0xffffffff)
				|| (arg3 ^ 0xffffffff) == 0) {
			if (arg3 == -1
					|| arg2.anInt3277 == -1
					|| ((Class68.method1093(arg3, (byte) -119).anInt3208 ^ 0xffffffff) <= ((Class68
							.method1093(arg2.anInt3277, (byte) -120).anInt3208) ^ 0xffffffff))) {
				arg2.anInt3276 = 0;
				arg2.anInt3277 = arg3;
				arg2.anInt3239 = 0;
				arg2.anInt3233 = 0;
				arg2.anInt3236 = arg2.anInt3228;
				arg2.anInt3222 = arg0;
			}
		} else {
			int i = Class68.method1093(arg3, (byte) -109).anInt3191;
			if ((i ^ 0xffffffff) == -2) {
				arg2.anInt3276 = 0;
				arg2.anInt3239 = 0;
				arg2.anInt3222 = arg0;
				arg2.anInt3233 = 0;
			}
			if (i == 2)
				arg2.anInt3276 = 0;
		}
	}

	public static JagexString method1065(int arg0, int arg1, int arg2,
                                         JagexString[] arg3) {
		try {
			if (arg0 <= 72)
				aJagexString_1266 = null;
			anInt1254++;
			int i = 0;
			for (int i_15_ = 0; (arg1 ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
				if (arg3[arg2 - -i_15_] == null)
					arg3[i_15_ + arg2] = StringUtilities.aJagexString_2288;
				i += arg3[arg2 + i_15_].anInt1805;
			}
			byte[] is = new byte[i];
			int i_16_ = 0;
			for (int i_17_ = 0; i_17_ < arg1; i_17_++) {
				JagexString jagexString = arg3[i_17_ + arg2];
				Class21.method777(jagexString.aByteArray1803, 0, is, i_16_,
						jagexString.anInt1805);
				i_16_ += jagexString.anInt1805;
			}
			JagexString jagexString = new JagexString();
			jagexString.anInt1805 = i;
			jagexString.aByteArray1803 = is;
			return jagexString;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("sd.F("
					+ arg0 + ',' + arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1066(int arg0, Class19_Sub1 arg1, int arg2) {
		try {
			anInt1272++;
			if (Class4_Sub20.aClass4_Sub11_2363 != null) {
				Class4_Sub20.aClass4_Sub11_2363.currentPosition = arg0 * 8 + 5;
				int i = Class4_Sub20.aClass4_Sub11_2363.readInt();
				int i_18_ = Class4_Sub20.aClass4_Sub11_2363
						.readInt();
				arg1.method760(i_18_, 255, i);
			} else {
				Class11.method672(0, 255, null, (byte) 0, arg2, true,
						(byte) -123);
				SceneGraph.aClass19_Sub1Array2492[arg0] = arg1;
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("sd.H("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ')'));
		}
	}

	public byte[] aByteArray1262 = new byte[4];

	public byte[] aByteArray1274;

	public Class22 aClass22_1269;

	public DataInputStream aDataInputStream1261;

	public long aLong1280;

	public int anInt1252;

	public int anInt1270;

	public int anInt1275;

	public Class64(Signlink arg0, URL arg1) {
		try {
			aClass22_1269 = arg0.method1173(-128, arg1);
			anInt1252 = 0;
			aLong1280 = 30000L + Class52.method1002((byte) -42);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception,
					("sd.<init>(" + (arg0 != null ? "{...}" : "null") + ','
							+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public byte[] method1059(boolean arg0) throws IOException {
		try {
			anInt1263++;
			if ((aLong1280 ^ 0xffffffffffffffffL) > (Class52
					.method1002((byte) -42) ^ 0xffffffffffffffffL))
				throw new IOException("fdt");
			if ((anInt1252 ^ 0xffffffff) == -1) {
				if ((aClass22_1269.anInt545 ^ 0xffffffff) == -3)
					throw new IOException("fds");
				if (aClass22_1269.anInt545 == 1) {
					aDataInputStream1261 = (DataInputStream) aClass22_1269.anObject543;
					anInt1252 = 1;
				}
			}
			if ((anInt1252 ^ 0xffffffff) == -2) {
				int i = aDataInputStream1261.available();
				if (i > 0) {
					if ((anInt1275 + i ^ 0xffffffff) < -5)
						i = 4 + -anInt1275;
					anInt1275 += aDataInputStream1261.read(aByteArray1262,
							anInt1275, i);
					if ((anInt1275 ^ 0xffffffff) == -5) {
						int i_0_ = new Buffer(aByteArray1262)
								.readInt();
						anInt1252 = 2;
						aByteArray1274 = new byte[i_0_];
					}
				}
			}
			if (anInt1252 == 2) {
				int i = aDataInputStream1261.available();
				if ((i ^ 0xffffffff) < -1) {
					if ((anInt1270 + i ^ 0xffffffff) < (aByteArray1274.length ^ 0xffffffff))
						i = aByteArray1274.length + -anInt1270;
					anInt1270 += aDataInputStream1261.read(aByteArray1274,
							anInt1270, i);
					if (anInt1270 == aByteArray1274.length)
						return aByteArray1274;
				}
			}
			if (arg0 != true) {
				return null;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "sd.G("
					+ arg0 + ')');
		}
	}
}
