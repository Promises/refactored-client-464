/* Class14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SceneGraph extends Class14 {
	public static Class19 aClass19_2483;
	public static Class19_Sub1[] aClass19_Sub1Array2492;
	public static JagexString aJagexString_2485 = JagexString.getRs2PreparedString("Welt"
    );
	public static JagexString aJagexString_2488;
	public static JagexString aJagexString_2496;
	public static JagexString aJagexString_2497;
	public static int anInt2484;
	public static int anInt2486;
	public static int anInt2487;
	public static int anInt2493 = 0;
	public static int anInt2498;
	public static int anInt2502;
	public static int anInt2503;
	public static int[] anIntArray2504;
	public static int[][] anIntArrayArray2489 = new int[104][104]; //104 | 104 = length, width - Barry
	public static int[][][] heightmap;
	static {
		aJagexString_2488 = JagexString.getRs2PreparedString("Stufe)2");
		aClass19_Sub1Array2492 = new Class19_Sub1[256];
		aJagexString_2496 = JagexString.getRs2PreparedString(
				"RuneScape has been updated(Q");
		anInt2502 = -1;
		anIntArray2504 = new int[5];
		aJagexString_2497 = aJagexString_2496;
	}

	public static void method707(int arg0) {
		try {
			anInt2487++;
			int i = Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384
					.method560(Class24.aJagexString_563);
			for (int i_3_ = 0; ((Class4_Sub20_Sub8.anInt2980 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
				int i_4_ = Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384
						.method560(Class4_Sub15.method298(i_3_, true));
				if ((i_4_ ^ 0xffffffff) < (i ^ 0xffffffff))
					i = i_4_;
			}
			Class45.anInt926 = Class4_Sub20_Sub8.anInt2980 * 15 + 22;
			Class4_Sub20_Sub16.aBoolean3169 = true;
			i += 8;
			int i_5_ = Class37.anInt758 - i / 2;
			Class63.anInt1243 = i;
			if ((i_5_ + i ^ 0xffffffff) < -766)
				i_5_ = -i + 765;
			int i_6_ = JagexException.anInt1729;
			int i_7_ = Class4_Sub20_Sub8.anInt2980 * 15 - arg0;
			if (i_5_ < 0)
				i_5_ = 0;
			if (i_6_ + i_7_ > 503)
				i_6_ = -i_7_ + 503;
			Class4_Sub20_Sub17.anInt3195 = i_5_;
			if (i_6_ < 0)
				i_6_ = 0;
			Class4_Sub1.anInt1860 = i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ca.E("
					+ arg0 + ')');
		}
	}

	public static void method708(int arg0) {
		try {
			anIntArrayArray2489 = null;
			if (arg0 != 256)
				anInt2493 = 99;
			aJagexString_2485 = null;
			anIntArray2504 = null;
			aJagexString_2496 = null;
			heightmap = null;
			aJagexString_2497 = null;
			aClass19_2483 = null;
			aJagexString_2488 = null;
			aClass19_Sub1Array2492 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ca.B("
					+ arg0 + ')');
		}
	}

	public static void createCollisionMaps(int arg0, int arg1, Region[] arg2,
			byte[] arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8,
			int arg9) {
		try {
			if (arg7 != true)
				anIntArray2504 = null;
			for (int i = 0; (i ^ 0xffffffff) > -9; i++) {
				for (int i_8_ = 0; i_8_ < 8; i_8_++) {
					if ((i + arg5 ^ 0xffffffff) < -1
							&& (arg5 + i ^ 0xffffffff) > -104
							&& (i_8_ + arg8 ^ 0xffffffff) < -1
							&& (arg8 - -i_8_ ^ 0xffffffff) > -104)
						arg2[arg9].clippingData[arg5 - -i][arg8 - -i_8_] = Class59
								.method1035(
										(arg2[arg9].clippingData[arg5 - -i][arg8
												- -i_8_]), -16777217);
				}
			}
			anInt2486++;
			StreamBuffer streamBuffer = new StreamBuffer(arg3);
			for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -65; i_9_++) {
					for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -65; i_10_++) {
						if ((i ^ 0xffffffff) != (arg1 ^ 0xffffffff)
								|| arg0 > i_9_
								|| i_9_ >= arg0 - -8
								|| (i_10_ ^ 0xffffffff) > (arg6 ^ 0xffffffff)
								|| (8 + arg6 ^ 0xffffffff) >= (i_10_ ^ 0xffffffff))
							Class82.method1217(0, -1, -1, streamBuffer, 0,
									-105, 0, 0);
						else
							Class82.method1217(
									arg9,
									arg5
											+ Class18.method733(0x7 & i_9_,
													(byte) 18, 0x7 & i_10_,
													arg4),
									arg8
											+ Class4_Sub6.method185(
													i_10_ & 0x7, arg4,
													(byte) -70, i_9_ & 0x7),
									streamBuffer, 0, -105, 0, arg4);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ca.A(" + arg0 + ',' + arg1 + ','
							+ (arg2 != null ? "{...}" : "null") + ','
							+ (arg3 != null ? "{...}" : "null") + ',' + arg4
							+ ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8
							+ ',' + arg9 + ')'));
		}
	}

	public long aLong2495;
	public long[] aLongArray2499 = new long[10];

	public int anInt2490;

	public int anInt2494;

	public int anInt2500;

	public int anInt2501;

	public SceneGraph() {
		try {
			anInt2490 = 256;
			anInt2500 = 1;
			anInt2501 = 0;
			aLong2495 = Class52.method1002((byte) -42);
			for (int i = 0; i < 10; i++)
				aLongArray2499[i] = aLong2495;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"ca.<init>(" + ')');
		}
	}

	@Override
	public void method699(int arg0) {
		try {
			anInt2484++;
			int i = 0;
			if (arg0 != -1)
				anInt2500 = -22;
			for (/**/; (i ^ 0xffffffff) > -11; i++)
				aLongArray2499[i] = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ca.D("
					+ arg0 + ')');
		}
	}

	@Override
	public int method705(boolean arg0, int arg1, int arg2) {
		try {
			anInt2503++;
			int i = anInt2500;
			anInt2500 = 1;
			int i_0_ = anInt2490;
			anInt2490 = 300;
			aLong2495 = Class52.method1002((byte) -42);
			if (arg0 != true)
				aJagexString_2488 = null;
			if (aLongArray2499[anInt2494] != 0L) {
				if ((aLongArray2499[anInt2494] ^ 0xffffffffffffffffL) > (aLong2495 ^ 0xffffffffffffffffL))
					anInt2490 = (int) ((2560 * arg2) / (-aLongArray2499[anInt2494] + aLong2495));
			} else {
				anInt2500 = i;
				anInt2490 = i_0_;
			}
			if (anInt2490 < 25)
				anInt2490 = 25;
			if (anInt2490 > 256) {
				anInt2490 = 256;
				anInt2500 = (int) (arg2 + -((aLong2495 + -aLongArray2499[anInt2494]) / 10L));
			}
			if ((arg2 ^ 0xffffffff) > (anInt2500 ^ 0xffffffff))
				anInt2500 = arg2;
			aLongArray2499[anInt2494] = aLong2495;
			anInt2494 = (1 + anInt2494) % 10;
			if (anInt2500 > 1) {
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -11; i_1_++) {
					if ((aLongArray2499[i_1_] ^ 0xffffffffffffffffL) != -1L)
						aLongArray2499[i_1_] = aLongArray2499[i_1_] + anInt2500;
				}
			}
			int i_2_ = 0;
			if (anInt2500 < arg1)
				anInt2500 = arg1;
			Class25.method799(anInt2500, 10);
			while (anInt2501 < 256) {
				anInt2501 += anInt2490;
				i_2_++;
			}
			anInt2501 &= 0xff;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ca.C("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}
}
