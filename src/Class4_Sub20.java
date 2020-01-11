/* Class4_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4_Sub20 extends RSFont {
	public static JagexString aJagexString_2352 = JagexString.getRs2PreparedString("T"
    );
	public static JagexString aJagexString_2356 = JagexString.getRs2PreparedString(
			"Keine Antwort vom Anmelde)2Server)3");
	public static StreamBuffer aClass4_Sub11_2363;
	public static int anInt2348;
	public static int anInt2349;
	public static int anInt2350;
	public static int anInt2351;
	public static int anInt2353 = 0;
	public static int anInt2354;
	public static int anInt2357;
	public static int anInt2358 = 1;
	public static int anInt2360;
	public static int anInt2361;
	public static int anInt2362;

	public static void method316(boolean arg0) {
		try {
			aClass4_Sub11_2363 = null;
			if (arg0 == true) {
				aJagexString_2352 = null;
				aJagexString_2356 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "rc.AC("
					+ arg0 + ')');
		}
	}

	public static Class19_Sub1 method317(int arg0, boolean arg1, boolean arg2,
			int arg3, boolean arg4) {
		try {
			anInt2348++;
			if (arg0 != 1)
				return null;
			Class10 class10 = null;
			if (Class4_Sub20_Sub13.aClass27_3127 != null)
				class10 = new Class10(arg3, Class4_Sub20_Sub13.aClass27_3127,
						Class24.aClass27Array550[arg3], 1000000);
			return new Class19_Sub1(class10, Class11.aClass10_321, arg3, arg4,
					arg1, arg2);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("rc.SB(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ')'));
		}
	}

	public static void method318(int arg0) {
		try {
			anInt2361++;
			if (arg0 == 14931) {
				for (int i = 0; (RSApplet.anInt12 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
					int i_0_ = Class4_Sub11_Sub1.anIntArray2695[i];
					Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_0_];
					if (class4_sub20_sub7_sub1_sub2 != null)
						Client.method31(
								(class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617.anInt2791),
								4, class4_sub20_sub7_sub1_sub2);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "rc.VB("
					+ arg0 + ')');
		}
	}

	public static boolean method319(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11) {
		try {
			anInt2350++;
			for (int i = 0; (i ^ 0xffffffff) > -105; i++) {
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -105; i_1_++) {
					SceneGraph.anIntArrayArray2489[i][i_1_] = 0;
					Class9.anIntArrayArray274[i][i_1_] = 99999999;
				}
			}
			SceneGraph.anIntArrayArray2489[arg11][arg1] = 99;
			Class9.anIntArrayArray274[arg11][arg1] = 0;
			int i = arg11;
			int i_2_ = arg1;
			int i_3_ = 0;
			Class49.anIntArray1003[i_3_] = arg11;
			Class30.anIntArray661[i_3_++] = arg1;
			int i_4_ = arg9;
			boolean bool = false;
			int i_5_ = Class49.anIntArray1003.length;
			int[][] is = (Class57.regions[Class82.anInt1711].clippingData);
			while (i_3_ != i_4_) {
				i_2_ = Class30.anIntArray661[i_4_];
				i = Class49.anIntArray1003[i_4_];
				i_4_ = (1 + i_4_) % i_5_;
				if (i == arg3 && (i_2_ ^ 0xffffffff) == (arg2 ^ 0xffffffff)) {
					bool = true;
					break;
				}
				if ((arg5 ^ 0xffffffff) != -1) {
					if ((arg5 < 5 || arg5 == 10)
							&& (Class57.regions[Class82.anInt1711].canMove(
									arg2, (byte) 105, -1 + arg5, arg3, i, arg8,
									i_2_))) {
						bool = true;
						break;
					}
					if ((arg5 ^ 0xffffffff) > -11
							&& (Class57.regions[Class82.anInt1711].method48(
									arg2, arg9 + -97, -1 + arg5, arg3, i_2_,
									arg8, i))) {
						bool = true;
						break;
					}
				}
				if (arg4 != 0
						&& (arg0 ^ 0xffffffff) != -1
						&& (Class57.regions[Class82.anInt1711].method49(arg0,
								i_2_, arg4, i, arg3, true, arg2, arg10))) {
					bool = true;
					break;
				}
				int i_6_ = 1 + Class9.anIntArrayArray274[i][i_2_];
				if ((i ^ 0xffffffff) < -1
						&& SceneGraph.anIntArrayArray2489[-1 + i][i_2_] == 0
						&& (is[i + -1][i_2_] & 0x12c0108 ^ 0xffffffff) == -1) {
					Class49.anIntArray1003[i_3_] = i + -1;
					Class30.anIntArray661[i_3_] = i_2_;
					SceneGraph.anIntArrayArray2489[-1 + i][i_2_] = 2;
					i_3_ = (i_3_ - -1) % i_5_;
					Class9.anIntArrayArray274[i + -1][i_2_] = i_6_;
				}
				if ((i ^ 0xffffffff) > -104
						&& SceneGraph.anIntArrayArray2489[1 + i][i_2_] == 0
						&& (is[i + 1][i_2_] & 0x12c0180 ^ 0xffffffff) == -1) {
					Class49.anIntArray1003[i_3_] = i - -1;
					Class30.anIntArray661[i_3_] = i_2_;
					i_3_ = (1 + i_3_) % i_5_;
					SceneGraph.anIntArrayArray2489[1 + i][i_2_] = 8;
					Class9.anIntArrayArray274[i + 1][i_2_] = i_6_;
				}
				if ((i_2_ ^ 0xffffffff) < -1
						&& (SceneGraph.anIntArrayArray2489[i][i_2_ - 1] ^ 0xffffffff) == -1
						&& (is[i][i_2_ + -1] & 0x12c0102) == 0) {
					Class49.anIntArray1003[i_3_] = i;
					Class30.anIntArray661[i_3_] = -1 + i_2_;
					i_3_ = (1 + i_3_) % i_5_;
					SceneGraph.anIntArrayArray2489[i][-1 + i_2_] = 1;
					Class9.anIntArrayArray274[i][-1 + i_2_] = i_6_;
				}
				if (i_2_ < 103
						&& (SceneGraph.anIntArrayArray2489[i][1 + i_2_] ^ 0xffffffff) == -1
						&& (is[i][i_2_ - -1] & 0x12c0120 ^ 0xffffffff) == -1) {
					Class49.anIntArray1003[i_3_] = i;
					Class30.anIntArray661[i_3_] = 1 + i_2_;
					SceneGraph.anIntArrayArray2489[i][1 + i_2_] = 4;
					Class9.anIntArrayArray274[i][1 + i_2_] = i_6_;
					i_3_ = (i_3_ - -1) % i_5_;
				}
				if ((i ^ 0xffffffff) < -1
						&& i_2_ > 0
						&& (SceneGraph.anIntArrayArray2489[i - 1][i_2_ - 1] ^ 0xffffffff) == -1
						&& (0x12c010e & is[-1 + i][-1 + i_2_]) == 0
						&& (0x12c0108 & is[-1 + i][i_2_]) == 0
						&& (is[i][-1 + i_2_] & 0x12c0102 ^ 0xffffffff) == -1) {
					Class49.anIntArray1003[i_3_] = -1 + i;
					Class30.anIntArray661[i_3_] = i_2_ - 1;
					i_3_ = (i_3_ - -1) % i_5_;
					SceneGraph.anIntArrayArray2489[i - 1][i_2_ + -1] = 3;
					Class9.anIntArrayArray274[i + -1][i_2_ + -1] = i_6_;
				}
				if ((i ^ 0xffffffff) > -104
						&& i_2_ > 0
						&& (SceneGraph.anIntArrayArray2489[i - -1][-1 + i_2_] ^ 0xffffffff) == -1
						&& (0x12c0183 & is[i - -1][i_2_ + -1] ^ 0xffffffff) == -1
						&& (0x12c0180 & is[1 + i][i_2_] ^ 0xffffffff) == -1
						&& (is[i][-1 + i_2_] & 0x12c0102 ^ 0xffffffff) == -1) {
					Class49.anIntArray1003[i_3_] = i + 1;
					Class30.anIntArray661[i_3_] = -1 + i_2_;
					i_3_ = (i_3_ + 1) % i_5_;
					SceneGraph.anIntArrayArray2489[i - -1][-1 + i_2_] = 9;
					Class9.anIntArrayArray274[1 + i][-1 + i_2_] = i_6_;
				}
				if (i > 0
						&& (i_2_ ^ 0xffffffff) > -104
						&& (SceneGraph.anIntArrayArray2489[i + -1][1 + i_2_] ^ 0xffffffff) == -1
						&& (is[-1 + i][i_2_ - -1] & 0x12c0138 ^ 0xffffffff) == -1
						&& (is[i - 1][i_2_] & 0x12c0108 ^ 0xffffffff) == -1
						&& (is[i][i_2_ - -1] & 0x12c0120) == 0) {
					Class49.anIntArray1003[i_3_] = -1 + i;
					Class30.anIntArray661[i_3_] = 1 + i_2_;
					SceneGraph.anIntArrayArray2489[i - 1][i_2_ - -1] = 6;
					Class9.anIntArrayArray274[-1 + i][1 + i_2_] = i_6_;
					i_3_ = (1 + i_3_) % i_5_;
				}
				if ((i ^ 0xffffffff) > -104
						&& i_2_ < 103
						&& SceneGraph.anIntArrayArray2489[i - -1][i_2_ - -1] == 0
						&& (is[i + 1][i_2_ - -1] & 0x12c01e0 ^ 0xffffffff) == -1
						&& (0x12c0180 & is[i - -1][i_2_]) == 0
						&& (0x12c0120 & is[i][1 + i_2_]) == 0) {
					Class49.anIntArray1003[i_3_] = 1 + i;
					Class30.anIntArray661[i_3_] = i_2_ + 1;
					SceneGraph.anIntArrayArray2489[i + 1][1 + i_2_] = 12;
					Class9.anIntArrayArray274[i - -1][i_2_ - -1] = i_6_;
					i_3_ = (i_3_ + 1) % i_5_;
				}
			}
			Class4_Sub20_Sub3.anInt2816 = 0;
			if (!bool) {
				if (!arg6)
					return false;
				int i_7_ = 100;
				int i_8_ = 1000;
				int i_9_ = 10;
				for (int i_10_ = arg3 + -i_9_; arg3 + i_9_ >= i_10_; i_10_++) {
					for (int i_11_ = arg2 - i_9_; (i_11_ ^ 0xffffffff) >= (i_9_
							+ arg2 ^ 0xffffffff); i_11_++) {
						if ((i_10_ ^ 0xffffffff) <= -1
								&& (i_11_ ^ 0xffffffff) <= -1
								&& (i_10_ ^ 0xffffffff) > -105
								&& i_11_ < 104
								&& (Class9.anIntArrayArray274[i_10_][i_11_] ^ 0xffffffff) > -101) {
							int i_12_ = 0;
							int i_13_ = 0;
							if (arg3 > i_10_)
								i_12_ = -i_10_ + arg3;
							else if ((arg4 + arg3 - 1 ^ 0xffffffff) > (i_10_ ^ 0xffffffff))
								i_12_ = i_10_ - arg4 - arg3 - -1;
							if ((i_11_ ^ 0xffffffff) > (arg2 ^ 0xffffffff))
								i_13_ = -i_11_ + arg2;
							else if (i_11_ > arg0 + (arg2 - 1))
								i_13_ = i_11_ - arg2 - arg0 - -1;
							int i_14_ = i_13_ * i_13_ + i_12_ * i_12_;
							if (i_14_ < i_8_
									|| i_14_ == i_8_
									&& i_7_ > (Class9.anIntArrayArray274[i_10_][i_11_])) {
								i_2_ = i_11_;
								i_7_ = Class9.anIntArrayArray274[i_10_][i_11_];
								i = i_10_;
								i_8_ = i_14_;
							}
						}
					}
				}
				if ((i_8_ ^ 0xffffffff) == -1001)
					return false;
				if ((i ^ 0xffffffff) == (arg11 ^ 0xffffffff)
						&& (i_2_ ^ 0xffffffff) == (arg1 ^ 0xffffffff))
					return false;
				Class4_Sub20_Sub3.anInt2816 = 1;
			}
			i_4_ = 0;
			Class49.anIntArray1003[i_4_] = i;
			Class30.anIntArray661[i_4_++] = i_2_;
			int i_16_;
			int i_15_ = i_16_ = SceneGraph.anIntArrayArray2489[i][i_2_];
			while (arg11 != i || arg1 != i_2_) {
				if (i_16_ != i_15_) {
					Class49.anIntArray1003[i_4_] = i;
					Class30.anIntArray661[i_4_++] = i_2_;
					i_16_ = i_15_;
				}
				if ((0x1 & i_15_) == 0) {
					if ((0x4 & i_15_) != 0)
						i_2_--;
				} else
					i_2_++;
				if ((i_15_ & 0x2) != 0)
					i++;
				else if ((i_15_ & 0x8) != 0)
					i--;
				i_15_ = SceneGraph.anIntArrayArray2489[i][i_2_];
			}
			if (i_4_ > 0) {
				i_5_ = i_4_;
				i_4_--;
				int i_17_ = Class49.anIntArray1003[i_4_];
				if (i_5_ > 25)
					i_5_ = 25;
				int i_18_ = Class30.anIntArray661[i_4_];
				if ((arg7 ^ 0xffffffff) == -1) {
					Class4_Sub23.anInt2413++;
					Class66.aClass4_Sub11_Sub1_1328.method264(50, -88);
					Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27, i_5_
							+ i_5_ + 3); // byte
				}
				if (arg7 == 1) {
					Class11.anInt327++;
					Class66.aClass4_Sub11_Sub1_1328.method264(143, -25);
					Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27, 14
							+ i_5_ + (i_5_ - -3));
				}
				if ((arg7 ^ 0xffffffff) == -3) {
					Class66.aClass4_Sub11_Sub1_1328.method264(36, 117);
					Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27, i_5_
							+ i_5_ - -3);
					Class48.anInt987++;
				}
				Class66.aClass4_Sub11_Sub1_1328.method210(
						(Class4_Sub17.aBooleanArray2320[82]) ? 1 : 0, 128);
				Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_18_
						- -Class4_Sub20_Sub8.anInt2987);
				Class66.aClass4_Sub11_Sub1_1328.method218(112, i_17_
						- -Class6.anInt217);
				Class67.anInt1352 = Class30.anIntArray661[0];
				Class1.anInt74 = Class49.anIntArray1003[0];
				for (int i_19_ = 1; (i_19_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_19_++) {
					i_4_--;
					Class66.aClass4_Sub11_Sub1_1328.method210(
							Class49.anIntArray1003[i_4_] + -i_17_, arg9 ^ 0x80);
					Class66.aClass4_Sub11_Sub1_1328.method210(
							Class30.anIntArray661[i_4_] + -i_18_, 128);
				}
				return true;
			}
			if ((arg7 ^ 0xffffffff) == -2)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("rc.UB("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
					+ ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ','
					+ arg9 + ',' + arg10 + ',' + arg11 + ')'));
		}
	}

	public static Class4_Sub20_Sub12_Sub2 method321(int arg0, int arg1,
			int arg2, Class19 arg3) {
		try {
			anInt2351++;
			if (!Class4_Sub20_Sub14.method594(-30384, arg0, arg1, arg3))
				return null;
			if (arg2 != -1)
				return null;
			return Class4_Sub20_Sub7_Sub1.method387((byte) -59);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("rc.RB("
					+ arg0 + ',' + arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static RSInterface method322(boolean arg0, int arg1) {
		try {
			if (arg0 != true)
				return null;
			int i = arg1 >> 896933264;
			anInt2362++;
			int i_20_ = 0xffff & arg1;
			if (Class28.aClass4_Sub13ArrayArray632[i] == null
					|| Class28.aClass4_Sub13ArrayArray632[i][i_20_] == null) {
				boolean bool = Class4_Sub12.method277((byte) 116, i);
				if (!bool)
					return null;
			}
			return Class28.aClass4_Sub13ArrayArray632[i][i_20_];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("rc.TB("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method323(Class4_Sub20_Sub12_Sub2 arg0, int arg1,
			int arg2, byte arg3, int arg4, int arg5) {
		try {
			anInt2360++;
			int i = arg5 * arg5 - -(arg2 * arg2);
			if (i > 4225 && (i ^ 0xffffffff) > -90001) {
				int i_22_ = Class31.anInt680 + Class49.anInt999 & 0x7ff;
				int i_23_ = Class4_Sub20_Sub12_Sub3.anIntArray3524[i_22_];
				i_23_ = i_23_ * 256 / (256 + Class4_Sub20_Sub5.anInt2889);
				int i_24_ = Class4_Sub20_Sub12_Sub3.anIntArray3528[i_22_];
				i_24_ = i_24_ * 256 / (Class4_Sub20_Sub5.anInt2889 - -256);
				int i_25_ = -(i_23_ * arg5) + i_24_ * arg2 >> -630159696;
				int i_26_ = arg2 * i_23_ - -(arg5 * i_24_) >> -1413307024;
				double d = Math.atan2(i_26_, i_25_);
				int i_27_ = (int) (Math.sin(d) * 63.0);
				int i_28_ = (int) (Math.cos(d) * 57.0);
				Class4_Sub21.aClass4_Sub20_Sub12_Sub2_2368.method517(arg4
						+ (94 + i_27_ + -6), -20 + -i_28_ + 83 + arg1, 20, 20,
						15, 15, d, 256);
			} else
				Class4_Sub20_Sub9.method475(arg5, arg2, (byte) 118, arg0, arg1,
						arg4);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("rc.BC("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')'));
		}
	}

	public Class4_Sub20 aClass4_Sub20_2355;

	public Class4_Sub20 aClass4_Sub20_2359;

	public void method320(int arg0) {
		try {
			anInt2354++;
			if (aClass4_Sub20_2355 != null && arg0 == -1) {
				aClass4_Sub20_2355.aClass4_Sub20_2359 = aClass4_Sub20_2359;
				aClass4_Sub20_2359.aClass4_Sub20_2355 = aClass4_Sub20_2355;
				aClass4_Sub20_2355 = null;
				aClass4_Sub20_2359 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "rc.WB("
					+ arg0 + ')');
		}
	}
}
