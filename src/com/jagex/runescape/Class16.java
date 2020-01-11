package com.jagex.runescape;
import java.util.Date;

public class Class16 {
	public static boolean[] aBooleanArray452 = new boolean[100];
	public static Class19 aClass19_429;
	public static int anInt426 = 0;
	public static int anInt427;
	public static int anInt430;
	public static int anInt431;
	public static int anInt433;
	public static int anInt435;
	public static int anInt438;
	public static int anInt440;
	public static int anInt441;
	public static int anInt442;
	public static int anInt444;
	public static int anInt446;
	public static int anInt447;
	public static int anInt454;
	public static short[] aShortArray448;

	public static void method718(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, byte arg6) {
		try {
			anInt446++;
			int i = -arg0 + 2048 & 0x7ff;
			int i_0_ = 0x7ff & 2048 + -arg5;
			if (arg6 <= 31) {
				StringUtilities.aJagexString_432 = null;
			}
			int i_1_ = 0;
			int i_2_ = 0;
			int i_3_ = arg3;
			if (i != 0) {
				int i_4_ = Class4_Sub20_Sub12_Sub3.anIntArray3524[i];
				int i_5_ = Class4_Sub20_Sub12_Sub3.anIntArray3528[i];
				int i_6_ = i_1_ * i_5_ + -(i_3_ * i_4_) >> 403159312;
				i_3_ = i_1_ * i_4_ + i_3_ * i_5_ >> -1415500816;
				i_1_ = i_6_;
			}
			if (i_0_ != 0) {
				int i_7_ = Class4_Sub20_Sub12_Sub3.anIntArray3524[i_0_];
				int i_8_ = Class4_Sub20_Sub12_Sub3.anIntArray3528[i_0_];
				int i_9_ = i_7_ * i_3_ + i_2_ * i_8_ >> 1463245200;
				i_3_ = -(i_2_ * i_7_) + i_8_ * i_3_ >> 1330156432;
				i_2_ = i_9_;
			}
			Class33.anInt708 = arg4 + -i_3_;
			Class6.anInt209 = -i_2_ + arg1;
			Class4_Sub20_Sub13.anInt3131 = arg0;
			RSInterface.anInt2176 = -i_1_ + arg2;
			Class4_Sub6.anInt1941 = arg5;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ec.K("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
					+ ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	public static void method719(int arg0, byte arg1, int arg2) {
		try {
			long l = (arg0 + (arg2 << 65759792));
			anInt430++;
			Class4_Sub20_Sub10 class4_sub20_sub10 = ((Class4_Sub20_Sub10) Class58.aClass16_1171
					.method725((byte) 117, l));
			if (class4_sub20_sub10 != null) {
				Region.aClass1_103.method38(class4_sub20_sub10, 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ec.L("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method721(int arg0, Class4_Sub14 arg1) {
		try {
			anInt454++;
			Object[] objects = arg1.anObjectArray2267;
			int i = ((Integer) objects[0]).intValue();
			Class4_Sub20_Sub16 class4_sub20_sub16 = Class66.method1085(39, i);
			if (class4_sub20_sub16 != null) {
				Class31.anInt669 = 0;
				int i_10_ = 0;
				int i_11_ = 0;
				int i_12_ = -1;
				int[] is = class4_sub20_sub16.anIntArray3171;
				int i_13_ = -1;
				int[] is_14_ = class4_sub20_sub16.anIntArray3182;
				try {
					RSCanvas.aJagexStringArray59 = new JagexString[class4_sub20_sub16.anInt3163];
					Class74.anIntArray1518 = new int[class4_sub20_sub16.anInt3174];
					int i_15_ = 0;
					int i_16_ = 0;
					for (int i_17_ = arg0; (i_17_ ^ 0xffffffff) > (objects.length ^ 0xffffffff); i_17_++) {
						if (!(objects[i_17_] instanceof Integer)) {
							if (objects[i_17_] instanceof JagexString) {
								JagexString jagexString = (JagexString) objects[i_17_];
								if (jagexString.method802(1,
										(Class4_Sub20_Sub10.aJagexString_3071))) {
									jagexString = arg1.aJagexString_2276;
								}
								RSCanvas.aJagexStringArray59[i_16_++] = jagexString;
							}
						} else {
							int i_18_ = ((Integer) objects[i_17_]).intValue();
							if (i_18_ == -2147483647) {
								i_18_ = arg1.anInt2268;
							}
							if ((i_18_ ^ 0xffffffff) == 2147483645) {
								i_18_ = arg1.anInt2280;
							}
							if (i_18_ == -2147483645) {
								i_18_ = (arg1.aClass4_Sub13_2282 != null ? arg1.aClass4_Sub13_2282.anInt2172
										: -1);
							}
							if (i_18_ == -2147483644) {
								i_18_ = arg1.anInt2269;
							}
							if ((i_18_ ^ 0xffffffff) == 2147483642) {
								i_18_ = (arg1.aClass4_Sub13_2282 != null ? arg1.aClass4_Sub13_2282.anInt2163
										: -1);
							}
							if ((i_18_ ^ 0xffffffff) == 2147483641) {
								i_18_ = (arg1.aClass4_Sub13_2270 != null ? arg1.aClass4_Sub13_2270.anInt2172
										: -1);
							}
							if ((i_18_ ^ 0xffffffff) == 2147483640) {
								i_18_ = (arg1.aClass4_Sub13_2270 == null ? -1
										: arg1.aClass4_Sub13_2270.anInt2163);
							}
							if ((i_18_ ^ 0xffffffff) == 2147483639) {
								i_18_ = arg1.anInt2273;
							}
							if (i_18_ == -2147483639) {
								i_18_ = arg1.anInt2281;
							}
							Class74.anIntArray1518[i_15_++] = i_18_;
						}
					}
					int i_19_ = 0;
					for (;;) {
						if (++i_19_ > 200000) {
							throw new RuntimeException("slow");
						}
						i_13_ = is_14_[++i_12_];
						if ((i_13_ ^ 0xffffffff) > -101) {
							if ((i_13_ ^ 0xffffffff) == -1) {
								Class24.anIntArray557[i_10_++] = is[i_12_];
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -2) {
								int i_20_ = is[i_12_];
								Class24.anIntArray557[i_10_++] = Class31.anIntArray687[i_20_];
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -3) {
								int i_21_ = is[i_12_];
								Class31.anIntArray687[i_21_] = Class24.anIntArray557[--i_10_];
								continue;
							}
							if (i_13_ == 3) {
								Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (class4_sub20_sub16.aJagexStringArray3178[i_12_]);
								continue;
							}
							if (i_13_ == 6) {
								i_12_ += is[i_12_];
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -8) {
								i_10_ -= 2;
								if (Class24.anIntArray557[i_10_] != Class24.anIntArray557[i_10_
										- -1]) {
									i_12_ += is[i_12_];
								}
								continue;
							}
							if (i_13_ == 8) {
								i_10_ -= 2;
								if ((Class24.anIntArray557[i_10_ + 1] ^ 0xffffffff) == (Class24.anIntArray557[i_10_] ^ 0xffffffff)) {
									i_12_ += is[i_12_];
								}
								continue;
							}
							if (i_13_ == 9) {
								i_10_ -= 2;
								if (Class24.anIntArray557[i_10_ + 1] > Class24.anIntArray557[i_10_]) {
									i_12_ += is[i_12_];
								}
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -11) {
								i_10_ -= 2;
								if ((Class24.anIntArray557[1 + i_10_] ^ 0xffffffff) > (Class24.anIntArray557[i_10_] ^ 0xffffffff)) {
									i_12_ += is[i_12_];
								}
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -22) {
								if ((Class31.anInt669 ^ 0xffffffff) != -1) {
									Class59 class59 = (Class42.aClass59Array849[--Class31.anInt669]);
									RSCanvas.aJagexStringArray59 = class59.aJagexStringArray1177;
									Class74.anIntArray1518 = class59.anIntArray1179;
									class4_sub20_sub16 = class59.aClass4_Sub20_Sub16_1182;
									is = class4_sub20_sub16.anIntArray3171;
									is_14_ = class4_sub20_sub16.anIntArray3182;
									i_12_ = class59.anInt1175;
									continue;
								}
								return;
							}
							if ((i_13_ ^ 0xffffffff) == -26) {
								int i_22_ = is[i_12_];
								Class24.anIntArray557[i_10_++] = Class57
										.method1028(-1, i_22_);
								continue;
							}
							if (i_13_ == 27) {
								int i_23_ = is[i_12_];
								Class81.method1208(
										(Class24.anIntArray557[--i_10_]),
										i_23_, arg0 + -1);
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -32) {
								i_10_ -= 2;
								if ((Class24.anIntArray557[1 + i_10_] ^ 0xffffffff) <= (Class24.anIntArray557[i_10_] ^ 0xffffffff)) {
									i_12_ += is[i_12_];
								}
								continue;
							}
							if (i_13_ == 32) {
								i_10_ -= 2;
								if (Class24.anIntArray557[i_10_] >= Class24.anIntArray557[i_10_
										- -1]) {
									i_12_ += is[i_12_];
								}
								continue;
							}
							if (i_13_ == 33) {
								Class24.anIntArray557[i_10_++] = Class74.anIntArray1518[is[i_12_]];
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -35) {
								Class74.anIntArray1518[is[i_12_]] = Class24.anIntArray557[--i_10_];
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -36) {
								Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = RSCanvas.aJagexStringArray59[is[i_12_]];
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -37) {
								RSCanvas.aJagexStringArray59[is[i_12_]] = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
								continue;
							}
							if (i_13_ == 37) {
								int i_24_ = is[i_12_];
								i_11_ -= i_24_;
								JagexString jagexString = Class64.method1065(
										arg0 ^ 0x4f, i_24_, i_11_,
										(Class4_Sub11_Sub1.aJagexStringArray2673));
								Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = jagexString;
								continue;
							}
							if (i_13_ == 38) {
								i_10_--;
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -40) {
								i_11_--;
								continue;
							}
							if (i_13_ == 40) {
								int i_25_ = is[i_12_];
								Class4_Sub20_Sub16 class4_sub20_sub16_26_ = Class66
										.method1085(39, i_25_);
								int[] is_27_ = (new int[class4_sub20_sub16_26_.anInt3174]);
								JagexString[] jagexStrings = (new JagexString[class4_sub20_sub16_26_.anInt3163]);
								for (int i_28_ = 0; class4_sub20_sub16_26_.anInt3173 > i_28_; i_28_++) {
									is_27_[i_28_] = (Class24.anIntArray557[i_28_
											+ -(class4_sub20_sub16_26_.anInt3173)
											+ i_10_]);
								}
								for (int i_29_ = 0; ((i_29_ ^ 0xffffffff) > (class4_sub20_sub16_26_.anInt3168 ^ 0xffffffff)); i_29_++) {
									jagexStrings[i_29_] = (Class4_Sub11_Sub1.aJagexStringArray2673[(i_29_
											+ i_11_ - (class4_sub20_sub16_26_.anInt3168))]);
								}
								i_10_ -= class4_sub20_sub16_26_.anInt3173;
								i_11_ -= class4_sub20_sub16_26_.anInt3168;
								Class59 class59 = new Class59();
								class59.anIntArray1179 = Class74.anIntArray1518;
								class59.aJagexStringArray1177 = RSCanvas.aJagexStringArray59;
								class59.anInt1175 = i_12_;
								i_12_ = -1;
								class59.aClass4_Sub20_Sub16_1182 = class4_sub20_sub16;
								class4_sub20_sub16 = class4_sub20_sub16_26_;
								Class42.aClass59Array849[Class31.anInt669++] = class59;
								is = class4_sub20_sub16.anIntArray3171;
								Class74.anIntArray1518 = is_27_;
								RSCanvas.aJagexStringArray59 = jagexStrings;
								is_14_ = class4_sub20_sub16.anIntArray3182;
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -43) {
								Class24.anIntArray557[i_10_++] = RSFont.anIntArray160[is[i_12_]];
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -44) {
								RSFont.anIntArray160[is[i_12_]] = Class24.anIntArray557[--i_10_];
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -45) {
								int i_30_ = is[i_12_] >> 1675468080;
								int i_31_ = is[i_12_] & 0xffff;
								int i_32_ = Class24.anIntArray557[--i_10_];
								if (i_32_ < 0 || (i_32_ ^ 0xffffffff) < -5001) {
									throw new RuntimeException();
								}
								Class46.anIntArray939[i_30_] = i_32_;
								int i_33_ = -1;
								if ((i_31_ ^ 0xffffffff) == -106) {
									i_33_ = 0;
								}
								for (int i_34_ = 0; i_32_ > i_34_; i_34_++) {
									Class32.anIntArrayArray697[i_30_][i_34_] = i_33_;
								}
								continue;
							}
							if (i_13_ == 45) {
								int i_35_ = is[i_12_];
								int i_36_ = Class24.anIntArray557[--i_10_];
								if (i_36_ < 0
										|| ((i_36_ ^ 0xffffffff) <= (Class46.anIntArray939[i_35_] ^ 0xffffffff))) {
									throw new RuntimeException();
								}
								Class24.anIntArray557[i_10_++] = Class32.anIntArrayArray697[i_35_][i_36_];
								continue;
							}
							if ((i_13_ ^ 0xffffffff) == -47) {
								int i_37_ = is[i_12_];
								i_10_ -= 2;
								int i_38_ = Class24.anIntArray557[i_10_];
								if ((i_38_ ^ 0xffffffff) > -1
										|| (Class46.anIntArray939[i_37_] ^ 0xffffffff) >= (i_38_ ^ 0xffffffff)) {
									throw new RuntimeException();
								}
								Class32.anIntArrayArray697[i_37_][i_38_] = Class24.anIntArray557[1 + i_10_];
								continue;
							}
							if (i_13_ == 47) {
								JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2671[is[i_12_]]);
								if (jagexString == null) {
									jagexString = Class80.aJagexString_1648;
								}
								Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = jagexString;
								continue;
							}
							if (i_13_ == 48) {
								Class4_Sub11_Sub1.aJagexStringArray2671[is[i_12_]] = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
								continue;
							}
						}
						boolean bool;
						if ((is[i_12_] ^ 0xffffffff) == -2) {
							bool = true;
						} else {
							bool = false;
						}
						if (i_13_ < 1000) {
							if (i_13_ == 100) {
								i_10_ -= 3;
								int i_39_ = Class24.anIntArray557[i_10_];
								int i_40_ = Class24.anIntArray557[1 + i_10_];
								int i_41_ = Class24.anIntArray557[i_10_ - -2];
								if (i_40_ == 0) {
									throw new RuntimeException();
								}
								RSInterface class4_sub13 = Class4_Sub20
										.method322(true, i_39_);
								if (class4_sub13.aClass4_Sub13Array2215 == null) {
									class4_sub13.aClass4_Sub13Array2215 = new RSInterface[i_41_ + 1];
								}
								if (class4_sub13.aClass4_Sub13Array2215.length <= i_41_) {
									RSInterface[] class4_sub13s = new RSInterface[i_41_ + 1];
									for (int i_42_ = 0; (i_42_ < (class4_sub13.aClass4_Sub13Array2215).length); i_42_++) {
										class4_sub13s[i_42_] = (class4_sub13.aClass4_Sub13Array2215[i_42_]);
									}
									class4_sub13.aClass4_Sub13Array2215 = class4_sub13s;
								}
								if ((i_41_ ^ 0xffffffff) < -1
										&& (class4_sub13.aClass4_Sub13Array2215[i_41_
												+ -1]) == null) {
									throw new RuntimeException("Gap at:"
											+ (-1 + i_41_));
								}
								RSInterface class4_sub13_43_ = new RSInterface();
								class4_sub13_43_.anInt2258 = i_40_;
								class4_sub13_43_.anInt2183 = class4_sub13_43_.anInt2172 = class4_sub13.anInt2172;
								class4_sub13_43_.anInt2163 = i_41_;
								class4_sub13_43_.aBoolean2178 = true;
								class4_sub13.aClass4_Sub13Array2215[i_41_] = class4_sub13_43_;
								if (bool) {
									Class9.aClass4_Sub13_285 = class4_sub13_43_;
								} else {
									Class4_Sub20_Sub5.aClass4_Sub13_2882 = class4_sub13_43_;
								}
								Class67.method1088(class4_sub13);
							} else if (i_13_ == 101) {
								RSInterface class4_sub13 = (!bool ? Class4_Sub20_Sub5.aClass4_Sub13_2882
										: Class9.aClass4_Sub13_285);
								RSInterface class4_sub13_44_ = Class4_Sub20
										.method322(true,
												(class4_sub13.anInt2172));
								class4_sub13_44_.aClass4_Sub13Array2215[class4_sub13.anInt2163] = null;
								Class67.method1088(class4_sub13_44_);
							} else if (i_13_ == 102) {
								RSInterface class4_sub13 = Class4_Sub20
										.method322(
												true,
												(Class24.anIntArray557[--i_10_]));
								class4_sub13.aClass4_Sub13Array2215 = null;
								Class67.method1088(class4_sub13);
							} else {
								if (i_13_ != 200) {
									break;
								}
								i_10_ -= 2;
								int i_45_ = Class24.anIntArray557[i_10_];
								int i_46_ = Class24.anIntArray557[1 + i_10_];
								RSInterface class4_sub13 = Class54.method1012(
										i_45_, arg0 + -2, i_46_);
								if (class4_sub13 != null
										&& (i_46_ ^ 0xffffffff) != 0) {
									Class24.anIntArray557[i_10_++] = 1;
									if (bool) {
										Class9.aClass4_Sub13_285 = class4_sub13;
									} else {
										Class4_Sub20_Sub5.aClass4_Sub13_2882 = class4_sub13;
									}
								} else {
									Class24.anIntArray557[i_10_++] = 0;
								}
							}
						} else if ((i_13_ < 1000 || i_13_ >= 1100)
								&& (i_13_ < 2000 || i_13_ >= 2100)) {
							if (((i_13_ ^ 0xffffffff) <= -1101 && (i_13_ ^ 0xffffffff) > -1201)
									|| i_13_ >= 2100 && i_13_ < 2200) {
								RSInterface class4_sub13;
								if (i_13_ < 2000) {
									class4_sub13 = (bool ? Class9.aClass4_Sub13_285
											: (Class4_Sub20_Sub5.aClass4_Sub13_2882));
								} else {
									i_13_ -= 1000;
									class4_sub13 = (Class4_Sub20.method322(
											true,
											Class24.anIntArray557[--i_10_]));
								}
								if (i_13_ == 1100) {
									i_10_ -= 2;
									class4_sub13.anInt2231 = Class24.anIntArray557[i_10_];
									if (((-class4_sub13.anInt2156 + class4_sub13.anInt2208) ^ 0xffffffff) > (class4_sub13.anInt2231 ^ 0xffffffff)) {
										class4_sub13.anInt2231 = (class4_sub13.anInt2208 - class4_sub13.anInt2156);
									}
									if ((class4_sub13.anInt2231 ^ 0xffffffff) > -1) {
										class4_sub13.anInt2231 = 0;
									}
									class4_sub13.anInt2238 = Class24.anIntArray557[i_10_
											- -1];
									if ((-class4_sub13.anInt2185 + class4_sub13.anInt2206) < class4_sub13.anInt2238) {
										class4_sub13.anInt2238 = (-class4_sub13.anInt2185 + class4_sub13.anInt2206);
									}
									if ((class4_sub13.anInt2238 ^ 0xffffffff) > -1) {
										class4_sub13.anInt2238 = 0;
									}
									Class67.method1088(class4_sub13);
								} else if (i_13_ == 1101) {
									class4_sub13.anInt2195 = Class24.anIntArray557[--i_10_];
									Class67.method1088(class4_sub13);
								} else if ((i_13_ ^ 0xffffffff) == -1103) {
									class4_sub13.aBoolean2165 = Class24.anIntArray557[--i_10_] == 1;
									Class67.method1088(class4_sub13);
								} else if ((i_13_ ^ 0xffffffff) == -1104) {
									class4_sub13.anInt2266 = Class24.anIntArray557[--i_10_];
									Class67.method1088(class4_sub13);
								} else if (i_13_ == 1104) {
									class4_sub13.anInt2199 = Class24.anIntArray557[--i_10_];
									Class67.method1088(class4_sub13);
								} else if ((i_13_ ^ 0xffffffff) == -1106) {
									class4_sub13.anInt2147 = Class24.anIntArray557[--i_10_];
									Class67.method1088(class4_sub13);
								} else if ((i_13_ ^ 0xffffffff) == -1107) {
									class4_sub13.anInt2218 = Class24.anIntArray557[--i_10_];
									Class67.method1088(class4_sub13);
								} else if ((i_13_ ^ 0xffffffff) == -1108) {
									class4_sub13.aBoolean2253 = (Class24.anIntArray557[--i_10_] ^ 0xffffffff) == -2;
									Class67.method1088(class4_sub13);
								} else if ((i_13_ ^ 0xffffffff) == -1109) {
									class4_sub13.anInt2137 = 1;
									class4_sub13.anInt2250 = Class24.anIntArray557[--i_10_];
									Class67.method1088(class4_sub13);
								} else if ((i_13_ ^ 0xffffffff) == -1110) {
									i_10_ -= 6;
									class4_sub13.anInt2224 = Class24.anIntArray557[i_10_];
									class4_sub13.anInt2148 = Class24.anIntArray557[1 + i_10_];
									class4_sub13.anInt2213 = Class24.anIntArray557[2 + i_10_];
									class4_sub13.anInt2236 = Class24.anIntArray557[i_10_
											- -3];
									class4_sub13.anInt2151 = Class24.anIntArray557[i_10_ + 4];
									class4_sub13.anInt2168 = Class24.anIntArray557[5 + i_10_];
									Class67.method1088(class4_sub13);
								} else if ((i_13_ ^ 0xffffffff) == -1111) {
									int i_47_ = Class24.anIntArray557[--i_10_];
									if (i_47_ != class4_sub13.anInt2210) {
										class4_sub13.anInt2210 = i_47_;
										class4_sub13.anInt2153 = 0;
										class4_sub13.anInt2241 = 0;
										Class67.method1088(class4_sub13);
									}
								} else if (i_13_ == 1111) {
									class4_sub13.aBoolean2263 = (Class24.anIntArray557[--i_10_] ^ 0xffffffff) == -2;
									Class67.method1088(class4_sub13);
								} else if (i_13_ == 1112) {
									JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
									if (!jagexString.method802(1,
											(class4_sub13.aJagexString_2150))) {
										class4_sub13.aJagexString_2150 = jagexString;
										Class67.method1088(class4_sub13);
									}
								} else if ((i_13_ ^ 0xffffffff) == -1114) {
									class4_sub13.anInt2170 = Class24.anIntArray557[--i_10_];
									Class67.method1088(class4_sub13);
								} else if (i_13_ == 1114) {
									i_10_ -= 3;
									class4_sub13.anInt2214 = Class24.anIntArray557[i_10_];
									class4_sub13.anInt2262 = Class24.anIntArray557[1 + i_10_];
									class4_sub13.anInt2161 = Class24.anIntArray557[i_10_
											- -2];
									Class67.method1088(class4_sub13);
								} else if (i_13_ == 1115) {
									class4_sub13.aBoolean2159 = Class24.anIntArray557[--i_10_] == 1;
									Class67.method1088(class4_sub13);
								} else if (i_13_ == 1116) {
									class4_sub13.anInt2201 = Class24.anIntArray557[--i_10_];
									Class67.method1088(class4_sub13);
								} else if (i_13_ == 1117) {
									class4_sub13.anInt2162 = Class24.anIntArray557[--i_10_];
									Class67.method1088(class4_sub13);
								} else if ((i_13_ ^ 0xffffffff) == -1119) {
									class4_sub13.aBoolean2187 = Class24.anIntArray557[--i_10_] == 1;
									Class67.method1088(class4_sub13);
								} else if (i_13_ == 1119) {
									class4_sub13.aBoolean2194 = (Class24.anIntArray557[--i_10_] ^ 0xffffffff) == -2;
									Class67.method1088(class4_sub13);
								} else {
									if (i_13_ != 1120) {
										break;
									}
									i_10_ -= 2;
									class4_sub13.anInt2208 = Class24.anIntArray557[i_10_];
									class4_sub13.anInt2206 = Class24.anIntArray557[i_10_ + 1];
									Class67.method1088(class4_sub13);
								}
							} else if (((i_13_ ^ 0xffffffff) <= -1201 && (i_13_ ^ 0xffffffff) > -1301)
									|| ((i_13_ ^ 0xffffffff) <= -2201 && (i_13_ ^ 0xffffffff) > -2301)) {
								RSInterface class4_sub13;
								if ((i_13_ ^ 0xffffffff) > -2001) {
									class4_sub13 = (!bool ? (Class4_Sub20_Sub5.aClass4_Sub13_2882)
											: Class9.aClass4_Sub13_285);
								} else {
									i_13_ -= 1000;
									class4_sub13 = (Class4_Sub20.method322(
											true,
											Class24.anIntArray557[--i_10_]));
								}
								Class67.method1088(class4_sub13);
								if ((i_13_ ^ 0xffffffff) == -1201) {
									i_10_ -= 2;
									int i_48_ = Class24.anIntArray557[i_10_];
									int i_49_ = Class24.anIntArray557[1 + i_10_];
									class4_sub13.anInt2226 = i_48_;
									class4_sub13.anInt2143 = i_49_;
									Class4_Sub20_Sub8 class4_sub20_sub8 = Class4_Sub23
											.method633(i_48_, (byte) -107);
									class4_sub13.anInt2224 = class4_sub20_sub8.anInt2965;
									class4_sub13.anInt2213 = class4_sub20_sub8.anInt3003;
									class4_sub13.anInt2151 = class4_sub20_sub8.anInt2976;
									class4_sub13.anInt2236 = class4_sub20_sub8.anInt2995;
									class4_sub13.anInt2168 = class4_sub20_sub8.anInt2983;
									class4_sub13.anInt2148 = class4_sub20_sub8.anInt3010;
									if (class4_sub13.anInt2156 > 0) {
										class4_sub13.anInt2168 = (32 * class4_sub13.anInt2168 / class4_sub13.anInt2156);
									}
								} else if (i_13_ == 1201) {
									class4_sub13.anInt2137 = 2;
									class4_sub13.anInt2250 = Class24.anIntArray557[--i_10_];
								} else {
									if (i_13_ != 1202) {
										break;
									}
									class4_sub13.anInt2137 = 3;
									class4_sub13.anInt2250 = Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.aClass35_3609
											.method898(-256);
								}
							} else if (((i_13_ ^ 0xffffffff) <= -1301 && (i_13_ ^ 0xffffffff) > -1401)
									|| ((i_13_ ^ 0xffffffff) <= -2301 && i_13_ < 2400)) {
								RSInterface class4_sub13;
								if ((i_13_ ^ 0xffffffff) > -2001) {
									class4_sub13 = (!bool ? (Class4_Sub20_Sub5.aClass4_Sub13_2882)
											: Class9.aClass4_Sub13_285);
								} else {
									i_13_ -= 1000;
									class4_sub13 = (Class4_Sub20.method322(
											true,
											Class24.anIntArray557[--i_10_]));
								}
								if ((i_13_ ^ 0xffffffff) == -1301) {
									int i_50_ = -1
											+ Class24.anIntArray557[--i_10_];
									if (i_50_ < 0 || (i_50_ ^ 0xffffffff) < -10) {
										i_11_--;
									} else {
										class4_sub13
												.method294(
														arg0,
														i_50_,
														(Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]));
									}
								} else if (i_13_ == 1301) {
									i_10_ -= 2;
									int i_51_ = Class24.anIntArray557[i_10_];
									int i_52_ = Class24.anIntArray557[1 + i_10_];
									class4_sub13.aClass4_Sub13_2205 = Class54
											.method1012(i_51_, arg0 ^ ~0x1,
													i_52_);
								} else if ((i_13_ ^ 0xffffffff) == -1303) {
									class4_sub13.aBoolean2160 = (Class24.anIntArray557[--i_10_] ^ 0xffffffff) == -2;
								} else if ((i_13_ ^ 0xffffffff) == -1304) {
									class4_sub13.anInt2248 = Class24.anIntArray557[--i_10_];
								} else if (i_13_ == 1304) {
									class4_sub13.anInt2198 = Class24.anIntArray557[--i_10_];
								} else if ((i_13_ ^ 0xffffffff) == -1306) {
									class4_sub13.aJagexString_2196 = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
								} else if (i_13_ == 1306) {
									class4_sub13.aJagexString_2174 = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
								} else {
									if ((i_13_ ^ 0xffffffff) != -1308) {
										break;
									}
									class4_sub13.aJagexStringArray2247 = null;
								}
							} else if (i_13_ >= 1400
									&& i_13_ < 1500
									|| ((i_13_ ^ 0xffffffff) <= -2401 && (i_13_ ^ 0xffffffff) > -2501)) {
								RSInterface class4_sub13;
								if (i_13_ >= 2000) {
									class4_sub13 = (Class4_Sub20.method322(
											true,
											Class24.anIntArray557[--i_10_]));
									i_13_ -= 1000;
								} else {
									class4_sub13 = (!bool ? (Class4_Sub20_Sub5.aClass4_Sub13_2882)
											: Class9.aClass4_Sub13_285);
								}
								JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
								int[] is_53_ = null;
								if ((jagexString.method825(-106) ^ 0xffffffff) < -1
										&& ((jagexString.method834(21340, -1
												+ jagexString.method825(-117))) ^ 0xffffffff) == -90) {
									int i_54_ = Class24.anIntArray557[--i_10_];
									if ((i_54_ ^ 0xffffffff) < -1) {
										is_53_ = new int[i_54_];
										while (i_54_-- > 0) {
											is_53_[i_54_] = (Class24.anIntArray557[--i_10_]);
										}
									}
									jagexString = (jagexString.method829((byte) 16, 0,
											-1 + jagexString.method825(-127)));
								}
								Object[] objects_55_ = new Object[jagexString
										.method825(-114) + 1];
								for (int i_56_ = objects_55_.length + -1; (i_56_ ^ 0xffffffff) <= -2; i_56_--) {
									if ((jagexString.method834(arg0 ^ 0x535d, i_56_
											+ -1) ^ 0xffffffff) == -116) {
										objects_55_[i_56_] = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
									} else {
										objects_55_[i_56_] = new Integer(
												Class24.anIntArray557[--i_10_]);
									}
								}
								int i_57_ = Class24.anIntArray557[--i_10_];
								if (i_57_ != -1) {
									objects_55_[0] = new Integer(i_57_);
								} else {
									objects_55_ = null;
								}
								if ((i_13_ ^ 0xffffffff) == -1404) {
									class4_sub13.anObjectArray2265 = objects_55_;
								}
								if ((i_13_ ^ 0xffffffff) == -1412) {
									class4_sub13.anObjectArray2221 = objects_55_;
								}
								if (i_13_ == 1400) {
									class4_sub13.anObjectArray2167 = objects_55_;
								}
								if (i_13_ == 1412) {
									class4_sub13.anObjectArray2222 = objects_55_;
								}
								class4_sub13.aBoolean2237 = true;
								if (i_13_ == 1408) {
									class4_sub13.anObjectArray2200 = objects_55_;
								}
								if ((i_13_ ^ 0xffffffff) == -1417) {
									class4_sub13.anObjectArray2158 = objects_55_;
								}
								if (i_13_ == 1409) {
									class4_sub13.anObjectArray2145 = objects_55_;
								}
								if (i_13_ == 1419) {
									class4_sub13.anObjectArray2130 = objects_55_;
								}
								if (i_13_ == 1402) {
									class4_sub13.anObjectArray2252 = objects_55_;
								}
								if (i_13_ == 1414) {
									class4_sub13.anIntArray2234 = is_53_;
									class4_sub13.anObjectArray2155 = objects_55_;
								}
								if (i_13_ == 1415) {
									class4_sub13.anIntArray2230 = is_53_;
									class4_sub13.anObjectArray2188 = objects_55_;
								}
								if ((i_13_ ^ 0xffffffff) == -1422) {
									class4_sub13.anObjectArray2255 = objects_55_;
								}
								if (i_13_ == 1422) {
									class4_sub13.anObjectArray2204 = objects_55_;
								}
								if ((i_13_ ^ 0xffffffff) == -1419) {
									class4_sub13.anObjectArray2180 = objects_55_;
								}
								if (i_13_ == 1420) {
									class4_sub13.anObjectArray2251 = objects_55_;
								}
								if ((i_13_ ^ 0xffffffff) == -1411) {
									class4_sub13.anObjectArray2164 = objects_55_;
								}
								if ((i_13_ ^ 0xffffffff) == -1408) {
									class4_sub13.anIntArray2261 = is_53_;
									class4_sub13.anObjectArray2259 = objects_55_;
								}
								if ((i_13_ ^ 0xffffffff) == -1425) {
									class4_sub13.anObjectArray2244 = objects_55_;
								}
								if ((i_13_ ^ 0xffffffff) == -1402) {
									class4_sub13.anObjectArray2220 = objects_55_;
								}
								if (i_13_ == 1417) {
									class4_sub13.anObjectArray2169 = objects_55_;
								}
								if ((i_13_ ^ 0xffffffff) == -1407) {
									class4_sub13.anObjectArray2152 = objects_55_;
								}
								if (i_13_ == 1405) {
									class4_sub13.anObjectArray2135 = objects_55_;
								}
								if (i_13_ == 1423) {
									class4_sub13.anObjectArray2133 = objects_55_;
								}
								if ((i_13_ ^ 0xffffffff) == -1405) {
									class4_sub13.anObjectArray2182 = objects_55_;
								}
							} else if (i_13_ >= 1600) {
								if ((i_13_ ^ 0xffffffff) <= -1701) {
									if ((i_13_ ^ 0xffffffff) <= -1801) {
										if (i_13_ < 1900) {
											RSInterface class4_sub13 = (!bool ? (Class4_Sub20_Sub5.aClass4_Sub13_2882)
													: Class9.aClass4_Sub13_285);
											if (i_13_ == 1800) {
												Class24.anIntArray557[i_10_++] = (Class68
														.method1092(
																14423,
																(Class54.method1011(
																		class4_sub13,
																		arg0
																				+ -22390))));
											} else if (i_13_ == 1801) {
												int i_58_ = (Class24.anIntArray557[--i_10_]);
												i_58_--;
												if (((class4_sub13.aJagexStringArray2247) == null)
														|| ((i_58_ ^ 0xffffffff) <= ((class4_sub13.aJagexStringArray2247).length ^ 0xffffffff))
														|| (class4_sub13.aJagexStringArray2247[i_58_]) == null) {
													Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub20_Sub1.aJagexString_2738);
												} else {
													Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (class4_sub13.aJagexStringArray2247[i_58_]);
												}
											} else {
												if (i_13_ != 1802) {
													break;
												}
												if (class4_sub13.aJagexString_2196 != null) {
													Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (class4_sub13.aJagexString_2196);
												} else {
													Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub20_Sub1.aJagexString_2738);
												}
											}
										} else if (i_13_ < 2600) {
											RSInterface class4_sub13 = (Class4_Sub20
													.method322(
															true,
															(Class24.anIntArray557[--i_10_])));
											if ((i_13_ ^ 0xffffffff) == -2501) {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2181;
											} else if (i_13_ == 2501) {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2212;
											} else if (i_13_ == 2502) {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2156;
											} else if (i_13_ == 2503) {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2185;
											} else if (i_13_ == 2504) {
												Class24.anIntArray557[i_10_++] = !(class4_sub13.aBoolean2225) ? 0
														: 1;
											} else {
												if ((i_13_ ^ 0xffffffff) != -2506) {
													break;
												}
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2183;
											}
										} else if (i_13_ < 2700) {
											RSInterface class4_sub13 = (Class4_Sub20
													.method322(
															true,
															(Class24.anIntArray557[--i_10_])));
											if (i_13_ == 2600) {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2231;
											} else if (i_13_ == 2601) {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2238;
											} else if ((i_13_ ^ 0xffffffff) == -2603) {
												Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (class4_sub13.aJagexString_2150);
											} else if (i_13_ == 2603) {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2208;
											} else if ((i_13_ ^ 0xffffffff) == -2605) {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2206;
											} else if ((i_13_ ^ 0xffffffff) == -2606) {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2168;
											} else if ((i_13_ ^ 0xffffffff) == -2607) {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2213;
											} else if (i_13_ == 2607) {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2151;
											} else {
												if ((i_13_ ^ 0xffffffff) != -2609) {
													break;
												}
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2236;
											}
										} else if (i_13_ >= 2800) {
											if ((i_13_ ^ 0xffffffff) <= -2901) {
												if (i_13_ >= 3200) {
													if (i_13_ >= 3300) {
														if (i_13_ < 3400) {
															if ((i_13_ ^ 0xffffffff) == -3301) {
																Class24.anIntArray557[i_10_++] = (Region.anInt134);
															} else if ((i_13_ ^ 0xffffffff) == -3302) {
																i_10_ -= 2;
																int i_59_ = (Class24.anIntArray557[i_10_]);
																int i_60_ = (Class24.anIntArray557[1 + i_10_]);
																Class24.anIntArray557[i_10_++] = (Class50
																		.method997(
																				(arg0 + -2),
																				i_60_,
																				i_59_));
															} else if ((i_13_ ^ 0xffffffff) == -3303) {
																i_10_ -= 2;
																int i_61_ = (Class24.anIntArray557[i_10_]);
																int i_62_ = (Class24.anIntArray557[1 + i_10_]);
																Class24.anIntArray557[i_10_++] = (Class4_Sub6
																		.method183(
																				i_61_,
																				(arg0 + 127),
																				i_62_));
															} else if ((i_13_ ^ 0xffffffff) == -3304) {
																i_10_ -= 2;
																int i_63_ = (Class24.anIntArray557[i_10_]);
																int i_64_ = (Class24.anIntArray557[1 + i_10_]);
																Class24.anIntArray557[i_10_++] = (Class49
																		.method988(
																				(byte) 123,
																				i_63_,
																				i_64_));
															} else if (i_13_ == 3304) {
																int i_65_ = (Class24.anIntArray557[--i_10_]);
																Class24.anIntArray557[i_10_++] = (Class38
																		.method924(
																				536870912,
																				i_65_).anInt3082);
															} else if (i_13_ == 3305) {
																int i_66_ = (Class24.anIntArray557[--i_10_]);
																Class24.anIntArray557[i_10_++] = (Class76.anIntArray1571[i_66_]);
															} else if (i_13_ == 3306) {
																int i_67_ = (Class24.anIntArray557[--i_10_]);
																Class24.anIntArray557[i_10_++] = (Class31.anIntArray693[i_67_]);
															} else if (i_13_ == 3307) {
																int i_68_ = (Class24.anIntArray557[--i_10_]);
																Class24.anIntArray557[i_10_++] = (Class46.anIntArray945[i_68_]);
															} else if ((i_13_ ^ 0xffffffff) == -3309) {
																int i_69_ = (Class82.anInt1711);
																int i_70_ = ((Class6.anInt217) + ((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) >> 1922140999));
																int i_71_ = ((Class4_Sub20_Sub8.anInt2987) + ((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267) >> 2023477031));
																Class24.anIntArray557[i_10_++] = ((i_69_ << -603115332)
																		+ (i_70_ << -1841350386) + i_71_);
															} else if (i_13_ == 3309) {
																int i_72_ = (Class24.anIntArray557[--i_10_]);
																Class24.anIntArray557[i_10_++] = ((Class59
																		.method1035(
																				268431226,
																				i_72_)) >> 336041742);
															} else if (i_13_ == 3310) {
																int i_73_ = (Class24.anIntArray557[--i_10_]);
																Class24.anIntArray557[i_10_++] = (i_73_ >> -1864682532);
															} else if (i_13_ == 3311) {
																int i_74_ = (Class24.anIntArray557[--i_10_]);
																Class24.anIntArray557[i_10_++] = (Class59
																		.method1035(
																				16383,
																				i_74_));
															} else if ((i_13_ ^ 0xffffffff) == -3313) {
																Class24.anIntArray557[i_10_++] = ((Class77.aBoolean1590) ? 1
																		: 0);
															} else if ((i_13_ ^ 0xffffffff) == -3314) {
																i_10_ -= 2;
																int i_75_ = (32768 + (Class24.anIntArray557[i_10_]));
																int i_76_ = (Class24.anIntArray557[1 + i_10_]);
																Class24.anIntArray557[i_10_++] = (Class50
																		.method997(
																				(arg0 + -2),
																				i_76_,
																				i_75_));
															} else if ((i_13_ ^ 0xffffffff) == -3315) {
																i_10_ -= 2;
																int i_77_ = (32768 + (Class24.anIntArray557[i_10_]));
																int i_78_ = (Class24.anIntArray557[(i_10_ + 1)]);
																Class24.anIntArray557[i_10_++] = (Class4_Sub6
																		.method183(
																				i_77_,
																				128,
																				i_78_));
															} else if ((i_13_ ^ 0xffffffff) == -3316) {
																i_10_ -= 2;
																int i_79_ = (Class24.anIntArray557[(i_10_ - -1)]);
																int i_80_ = (32768 + (Class24.anIntArray557[i_10_]));
																Class24.anIntArray557[i_10_++] = (Class49
																		.method988(
																				(byte) 120,
																				i_80_,
																				i_79_));
															} else if (i_13_ == 3316) {
																if ((Class14.anInt410) < 2) {
																	Class24.anIntArray557[i_10_++] = 0;
																} else {
																	Class24.anIntArray557[i_10_++] = (Class14.anInt410);
																}
															} else if ((i_13_ ^ 0xffffffff) == -3318) {
																Class24.anIntArray557[i_10_++] = (Class57.anInt1130);
															} else if ((i_13_ ^ 0xffffffff) == -3319) {
																Class24.anIntArray557[i_10_++] = (Class61.anInt1201);
															} else if ((i_13_ ^ 0xffffffff) == -3322) {
																Class24.anIntArray557[i_10_++] = (Class4_Sub20_Sub7_Sub1.runEnergy);
															} else if (i_13_ == 3322) {
																Class24.anIntArray557[i_10_++] = (Class77.anInt1588);
															} else {
																if (i_13_ != 3323) {
																	break;
																}
																if (((Class14.anInt410) ^ 0xffffffff) != -2) {
																	Class24.anIntArray557[i_10_++] = 0;
																} else {
																	Class24.anIntArray557[i_10_++] = 1;
																}
															}
														} else if ((i_13_ ^ 0xffffffff) > -3501) {
															if ((i_13_ ^ 0xffffffff) == -3401) {
																i_10_ -= 2;
																int i_81_ = (Class24.anIntArray557[(i_10_ - -1)]);
																int i_82_ = (Class24.anIntArray557[i_10_]);
																Class4_Sub20_Sub5 class4_sub20_sub5 = (Class38
																		.method922(
																				i_82_,
																				(arg0 + -10835)));
																for (int i_83_ = 0; (((class4_sub20_sub5.anInt2875) ^ 0xffffffff) < (i_83_ ^ 0xffffffff)); i_83_++) {
																	if ((class4_sub20_sub5.anIntArray2870[i_83_]) == i_81_) {
																		Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = class4_sub20_sub5.aJagexStringArray2877[i_83_];
																		class4_sub20_sub5 = null;
																		break;
																	}
																}
																if (class4_sub20_sub5 != null) {
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (class4_sub20_sub5.aJagexString_2878);
																}
															} else {
																if ((i_13_ ^ 0xffffffff) != -3409) {
																	break;
																}
																i_10_ -= 4;
																int i_84_ = (Class24.anIntArray557[1 + i_10_]);
																int i_85_ = (Class24.anIntArray557[i_10_]);
																int i_86_ = (Class24.anIntArray557[(i_10_ + 2)]);
																int i_87_ = (Class24.anIntArray557[(i_10_ - -3)]);
																Class4_Sub20_Sub5 class4_sub20_sub5 = (Class38
																		.method922(
																				i_86_,
																				-10834));
																if (((class4_sub20_sub5.anInt2874) != i_85_)
																		|| (i_84_ != (class4_sub20_sub5.anInt2876))) {
																	if (i_84_ != 115) {
																		Class24.anIntArray557[i_10_++] = 0;
																	} else {
																		Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = Class80.aJagexString_1648;
																	}
																} else {
																	for (int i_88_ = 0; ((class4_sub20_sub5.anInt2875) > i_88_); i_88_++) {
																		if ((class4_sub20_sub5.anIntArray2870[i_88_] ^ 0xffffffff) == (i_87_ ^ 0xffffffff)) {
																			if ((i_84_ ^ 0xffffffff) == -116) {
																				Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = class4_sub20_sub5.aJagexStringArray2877[i_88_];
																			} else {
																				Class24.anIntArray557[i_10_++] = class4_sub20_sub5.anIntArray2872[i_88_];
																			}
																			class4_sub20_sub5 = null;
																			break;
																		}
																	}
																	if (class4_sub20_sub5 != null) {
																		if (i_84_ == 115) {
																			Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = class4_sub20_sub5.aJagexString_2878;
																		} else {
																			Class24.anIntArray557[i_10_++] = class4_sub20_sub5.anInt2881;
																		}
																	}
																}
															}
														} else if ((i_13_ ^ 0xffffffff) > -3701) {
															if ((i_13_ ^ 0xffffffff) == -3601) {
																if ((Class11.anInt326) == 0) {
																	Class24.anIntArray557[i_10_++] = -2;
																} else if (((Class11.anInt326) ^ 0xffffffff) != -2) {
																	Class24.anIntArray557[i_10_++] = (GameShell.anInt23);
																} else {
																	Class24.anIntArray557[i_10_++] = -1;
																}
															} else if (i_13_ == 3601) {
																int i_89_ = (Class24.anIntArray557[--i_10_]);
																if ((((Class11.anInt326) ^ 0xffffffff) == -3)
																		&& ((i_89_ ^ 0xffffffff) > ((GameShell.anInt23) ^ 0xffffffff))) {
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub20_Sub5.aJagexStringArray2893[i_89_]);
																} else {
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub20_Sub1.aJagexString_2738);
																}
															} else if ((i_13_ ^ 0xffffffff) == -3603) {
																int i_90_ = (Class24.anIntArray557[--i_10_]);
																if (((Class11.anInt326) == 2)
																		&& ((GameShell.anInt23) > i_90_)) {
																	Class24.anIntArray557[i_10_++] = (Class50.anIntArray1005[i_90_]);
																} else {
																	Class24.anIntArray557[i_10_++] = 0;
																}
															} else if (i_13_ == 3603) {
																int i_91_ = (Class24.anIntArray557[--i_10_]);
																if (((Class11.anInt326) != 2)
																		|| ((GameShell.anInt23) <= i_91_)) {
																	Class24.anIntArray557[i_10_++] = 0;
																} else {
																	Class24.anIntArray557[i_10_++] = (Class34.anIntArray1743[i_91_]);
																}
															} else if ((i_13_ ^ 0xffffffff) == -3605) {
																int i_92_ = (Class24.anIntArray557[--i_10_]);
																JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
																Class40.method936(
																		(byte) -105,
																		i_92_,
                                                                        jagexString);
															} else if ((i_13_ ^ 0xffffffff) == -3606) {
																JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
																Class4_Sub11_Sub1
																		.method263(
																				(jagexString.method806((byte) -76)),
																				(arg0 + -315));
															} else if ((i_13_ ^ 0xffffffff) == -3607) {
																JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
																Class5.method641(
																		(jagexString.method806((byte) -33)),
																		(byte) 68);
															} else if ((i_13_ ^ 0xffffffff) == -3608) {
																JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
																Class48.method984(
																		(jagexString.method806((byte) -41)),
																		(byte) 0);
															} else if ((i_13_ ^ 0xffffffff) == -3609) {
																JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
																Class4_Sub24
																		.method638(
																				arg0 + 1,
																				(jagexString.method806((byte) -112)));
															} else if (i_13_ == 3609) {
																JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
																if ((jagexString
																		.method808(
																				(Class4_Sub2_Sub1.aJagexString_2595),
																				(byte) -95))
																		|| (jagexString
																				.method808(
																						(Class4_Sub20_Sub17.aJagexString_3210),
																						(byte) -95))) {
																	jagexString = (jagexString
																			.method805(
																					7,
																					113));
																}
																Class24.anIntArray557[i_10_++] = ((JagexString
																		.method830(
																				60,
                                                                                jagexString)) ? 1
																		: 0);
															} else if (i_13_ == 3611) {
																if ((Class50.aJagexString_1019) == null) {
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub20_Sub1.aJagexString_2738);
																} else {
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class50.aJagexString_1019);
																}
															} else if ((i_13_ ^ 0xffffffff) == -3613) {
																if ((Class50.aJagexString_1019) == null) {
																	Class24.anIntArray557[i_10_++] = 0;
																} else {
																	Class24.anIntArray557[i_10_++] = (Class4_Sub10.anInt2021);
																}
															} else if ((i_13_ ^ 0xffffffff) == -3614) {
																int i_93_ = (Class24.anIntArray557[--i_10_]);
																if (((Class50.aJagexString_1019) != null)
																		&& (i_93_ < (Class4_Sub10.anInt2021))) {
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class13_Sub2.aClass4_Sub8Array2482[i_93_].aJagexString_1975);
																} else {
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub20_Sub1.aJagexString_2738);
																}
															} else if (i_13_ == 3614) {
																int i_94_ = (Class24.anIntArray557[--i_10_]);
																if (((Class50.aJagexString_1019) != null)
																		&& ((Class4_Sub10.anInt2021) > i_94_)) {
																	Class24.anIntArray557[i_10_++] = (Class13_Sub2.aClass4_Sub8Array2482[i_94_].anInt1969);
																} else {
																	Class24.anIntArray557[i_10_++] = 0;
																}
															} else if ((i_13_ ^ 0xffffffff) == -3616) {
																int i_95_ = (Class24.anIntArray557[--i_10_]);
																if (((Class50.aJagexString_1019) == null)
																		|| (i_95_ >= (Class4_Sub10.anInt2021))) {
																	Class24.anIntArray557[i_10_++] = 0;
																} else {
																	Class24.anIntArray557[i_10_++] = (Class13_Sub2.aClass4_Sub8Array2482[i_95_].aByte1973);
																}
															} else if (i_13_ == 3616) {
																Class24.anIntArray557[i_10_++] = (Class4_Sub20_Sub17.aByte3194);
															} else if ((i_13_ ^ 0xffffffff) == -3618) {
																int i_96_ = (Class24.anIntArray557[--i_10_]);
																Class4_Sub8
																		.method189(
																				-125,
																				i_96_);
															} else if (i_13_ == 3618) {
																Class24.anIntArray557[i_10_++] = (Class27.aByte613);
															} else if ((i_13_ ^ 0xffffffff) == -3620) {
																JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
																Class4_Sub20_Sub10
																		.method482(
																				true,
																				(jagexString.method806((byte) -112)));
															} else if ((i_13_ ^ 0xffffffff) == -3621) {
																Class37.method918(-7398);
															} else if (i_13_ == 3621) {
																if ((Class11.anInt326) != 0) {
																	Class24.anIntArray557[i_10_++] = (JagexString.anInt1827);
																} else {
																	Class24.anIntArray557[i_10_++] = -1;
																}
															} else {
																if ((i_13_ ^ 0xffffffff) != -3623) {
																	break;
																}
																int i_97_ = (Class24.anIntArray557[--i_10_]);
																if ((((Class11.anInt326) ^ 0xffffffff) != -1)
																		&& ((i_97_ ^ 0xffffffff) > ((JagexString.anInt1827) ^ 0xffffffff))) {
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = Class68
																			.method1094(
																					-5,
																					Class9.aLongArray284[i_97_])
																			.method839(
																					91);
																} else {
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub20_Sub1.aJagexString_2738);
																}
															}
														} else if (i_13_ < 4100) {
															if (i_13_ == 4000) {
																i_10_ -= 2;
																int i_98_ = (Class24.anIntArray557[(i_10_ + 1)]);
																int i_99_ = (Class24.anIntArray557[i_10_]);
																Class24.anIntArray557[i_10_++] = (i_98_ + i_99_);
															} else if ((i_13_ ^ 0xffffffff) == -4002) {
																i_10_ -= 2;
																int i_100_ = (Class24.anIntArray557[i_10_]);
																int i_101_ = (Class24.anIntArray557[1 + i_10_]);
																Class24.anIntArray557[i_10_++] = (i_100_ - i_101_);
															} else if ((i_13_ ^ 0xffffffff) == -4003) {
																i_10_ -= 2;
																int i_102_ = (Class24.anIntArray557[i_10_]);
																int i_103_ = (Class24.anIntArray557[1 + i_10_]);
																Class24.anIntArray557[i_10_++] = (i_103_ * i_102_);
															} else if (i_13_ == 4003) {
																i_10_ -= 2;
																int i_104_ = (Class24.anIntArray557[i_10_]);
																int i_105_ = (Class24.anIntArray557[(i_10_ - -1)]);
																Class24.anIntArray557[i_10_++] = (i_104_ / i_105_);
															} else if ((i_13_ ^ 0xffffffff) == -4005) {
																int i_106_ = (Class24.anIntArray557[--i_10_]);
																Class24.anIntArray557[i_10_++] = (int) (Math
																		.random() * i_106_);
															} else if ((i_13_ ^ 0xffffffff) == -4006) {
																int i_107_ = (Class24.anIntArray557[--i_10_]);
																Class24.anIntArray557[i_10_++] = (int) (Math
																		.random() * (1 + i_107_));
															} else if (i_13_ == 4006) {
																i_10_ -= 5;
																int i_108_ = (Class24.anIntArray557[2 + i_10_]);
																int i_109_ = (Class24.anIntArray557[(i_10_ - -1)]);
																int i_110_ = (Class24.anIntArray557[i_10_]);
																int i_111_ = (Class24.anIntArray557[4 + i_10_]);
																int i_112_ = (Class24.anIntArray557[(i_10_ - -3)]);
																Class24.anIntArray557[i_10_++] = (((i_109_ + -i_110_)
																		* (i_111_ + -i_108_) / (i_112_ - i_108_)) + i_110_);
															} else if (i_13_ == 4007) {
																i_10_ -= 2;
																int i_113_ = (Class24.anIntArray557[i_10_]);
																int i_114_ = (Class24.anIntArray557[1 + i_10_]);
																Class24.anIntArray557[i_10_++] = ((i_114_
																		* i_113_ / 100) + i_113_);
															} else if ((i_13_ ^ 0xffffffff) == -4009) {
																i_10_ -= 2;
																int i_115_ = (Class24.anIntArray557[i_10_]);
																int i_116_ = (Class24.anIntArray557[(i_10_ + 1)]);
																Class24.anIntArray557[i_10_++] = (Class4_Sub20_Sub7_Sub1
																		.method389(
																				1 << i_116_,
																				i_115_));
															} else if (i_13_ == 4009) {
																i_10_ -= 2;
																int i_117_ = (Class24.anIntArray557[i_10_]);
																int i_118_ = (Class24.anIntArray557[1 + i_10_]);
																Class24.anIntArray557[i_10_++] = (Class59
																		.method1035(
																				(-(1 << i_118_) + -1),
																				i_117_));
															} else if ((i_13_ ^ 0xffffffff) == -4011) {
																i_10_ -= 2;
																int i_119_ = (Class24.anIntArray557[i_10_]);
																int i_120_ = (Class24.anIntArray557[(i_10_ + 1)]);
																Class24.anIntArray557[i_10_++] = ((((Class59
																		.method1035(
																				1 << i_120_,
																				i_119_)) ^ 0xffffffff) == -1) ? 0
																		: 1);
															} else if ((i_13_ ^ 0xffffffff) == -4012) {
																i_10_ -= 2;
																int i_121_ = (Class24.anIntArray557[i_10_]);
																int i_122_ = (Class24.anIntArray557[(i_10_ + 1)]);
																Class24.anIntArray557[i_10_++] = (i_121_ % i_122_);
															} else if (i_13_ == 4012) {
																i_10_ -= 2;
																int i_123_ = (Class24.anIntArray557[1 + i_10_]);
																int i_124_ = (Class24.anIntArray557[i_10_]);
																if (i_124_ == 0) {
																	Class24.anIntArray557[i_10_++] = 0;
																} else {
																	Class24.anIntArray557[i_10_++] = (int) Math
																			.pow(i_124_,
																					i_123_);
																}
															} else if (i_13_ == 4013) {
																i_10_ -= 2;
																int i_125_ = (Class24.anIntArray557[i_10_]);
																int i_126_ = (Class24.anIntArray557[1 + i_10_]);
																if (i_125_ != 0) {
																	if (i_126_ != 0) {
																		Class24.anIntArray557[i_10_++] = (int) Math
																				.pow(i_125_,
																						1.0 / i_126_);
																	} else {
																		Class24.anIntArray557[i_10_++] = 2147483647;
																	}
																} else {
																	Class24.anIntArray557[i_10_++] = 0;
																}
															} else if ((i_13_ ^ 0xffffffff) == -4015) {
																i_10_ -= 2;
																int i_127_ = (Class24.anIntArray557[1 + i_10_]);
																int i_128_ = (Class24.anIntArray557[i_10_]);
																Class24.anIntArray557[i_10_++] = (Class59
																		.method1035(
																				i_128_,
																				i_127_));
															} else {
																if (i_13_ != 4015) {
																	break;
																}
																i_10_ -= 2;
																int i_129_ = (Class24.anIntArray557[i_10_]);
																int i_130_ = (Class24.anIntArray557[1 + i_10_]);
																Class24.anIntArray557[i_10_++] = (Class4_Sub20_Sub7_Sub1
																		.method389(
																				i_130_,
																				i_129_));
															}
														} else if ((i_13_ ^ 0xffffffff) <= -4201) {
															if ((i_13_ ^ 0xffffffff) > -4301) {
																if (i_13_ == 4200) {
																	int i_131_ = (Class24.anIntArray557[--i_10_]);
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub23
																			.method633(
																					i_131_,
																					(byte) -121).aJagexString_2991);
																} else if ((i_13_ ^ 0xffffffff) == -4202) {
																	i_10_ -= 2;
																	int i_132_ = (Class24.anIntArray557[i_10_]);
																	int i_133_ = (Class24.anIntArray557[1 + i_10_]);
																	Class4_Sub20_Sub8 class4_sub20_sub8 = (Class4_Sub23
																			.method633(
																					i_132_,
																					(byte) -123));
																	if ((i_133_ >= 1)
																			&& (i_133_ <= 5)
																			&& (class4_sub20_sub8.aJagexStringArray3008[-1
																					+ i_133_]) != null) {
																		Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = class4_sub20_sub8.aJagexStringArray3008[-1
																				+ i_133_];
																	} else {
																		Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = Class4_Sub20_Sub1.aJagexString_2738;
																	}
																} else if (i_13_ == 4202) {
																	i_10_ -= 2;
																	int i_134_ = (Class24.anIntArray557[i_10_]);
																	int i_135_ = (Class24.anIntArray557[(i_10_ + 1)]);
																	Class4_Sub20_Sub8 class4_sub20_sub8 = (Class4_Sub23
																			.method633(
																					i_134_,
																					(byte) -107));
																	if (((i_135_ ^ 0xffffffff) <= -2)
																			&& (i_135_ <= 5)
																			&& (class4_sub20_sub8.aJagexStringArray2988[-1
																					+ i_135_]) != null) {
																		Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = class4_sub20_sub8.aJagexStringArray2988[i_135_
																				+ -1];
																	} else {
																		Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = Class4_Sub20_Sub1.aJagexString_2738;
																	}
																} else if ((i_13_ ^ 0xffffffff) == -4204) {
																	int i_136_ = (Class24.anIntArray557[--i_10_]);
																	Class24.anIntArray557[i_10_++] = (Class4_Sub23
																			.method633(
																					i_136_,
																					(byte) -108).anInt3017);
																} else if (i_13_ == 4204) {
																	int i_137_ = (Class24.anIntArray557[--i_10_]);
																	Class24.anIntArray557[i_10_++] = (((Class4_Sub23
																			.method633(
																					i_137_,
																					(byte) -107).anInt3012) ^ 0xffffffff) == -2 ? 1
																			: 0);
																} else if ((i_13_ ^ 0xffffffff) == -4206) {
																	int i_138_ = (Class24.anIntArray557[--i_10_]);
																	Class4_Sub20_Sub8 class4_sub20_sub8 = (Class4_Sub23
																			.method633(
																					i_138_,
																					(byte) -128));
																	if ((((class4_sub20_sub8.anInt2986) ^ 0xffffffff) == 0)
																			&& ((class4_sub20_sub8.anInt2977 ^ 0xffffffff) <= -1)) {
																		Class24.anIntArray557[i_10_++] = class4_sub20_sub8.anInt2977;
																	} else {
																		Class24.anIntArray557[i_10_++] = i_138_;
																	}
																} else if (i_13_ == 4206) {
																	int i_139_ = (Class24.anIntArray557[--i_10_]);
																	Class4_Sub20_Sub8 class4_sub20_sub8 = (Class4_Sub23
																			.method633(
																					i_139_,
																					(byte) -116));
																	if ((((class4_sub20_sub8.anInt2986) ^ 0xffffffff) <= -1)
																			&& ((class4_sub20_sub8.anInt2977 ^ 0xffffffff) <= -1)) {
																		Class24.anIntArray557[i_10_++] = class4_sub20_sub8.anInt2977;
																	} else {
																		Class24.anIntArray557[i_10_++] = i_139_;
																	}
																} else {
																	if ((i_13_ ^ 0xffffffff) != -4208) {
																		break;
																	}
																	int i_140_ = (Class24.anIntArray557[--i_10_]);
																	Class24.anIntArray557[i_10_++] = (!(Class4_Sub23
																			.method633(
																					i_140_,
																					(byte) -105).aBoolean3002) ? 0
																			: 1);
																}
															} else {
																if (i_13_ >= 5100) {
																	break;
																}
																if ((i_13_ ^ 0xffffffff) == -5001) {
																	Class24.anIntArray557[i_10_++] = (Class27.anInt618);
																} else if (i_13_ == 5001) {
																	JagexException.anInt1735++;
																	i_10_ -= 3;
																	Class27.anInt618 = (Class24.anIntArray557[i_10_]);
																	Class76.anInt1580 = (Class24.anIntArray557[1 + i_10_]);
																	Class4_Sub20_Sub7_Sub4.anInt3357 = (Class24.anIntArray557[2 + i_10_]);
																	Class66.aClass4_Sub11_Sub1_1328
																			.method264(
																					11,
																					(arg0 + 112));
																	Class66.aClass4_Sub11_Sub1_1328
																			.method227(
																					(byte) -27,
																					(Class27.anInt618));
																	Class66.aClass4_Sub11_Sub1_1328
																			.method227(
																					(byte) -27,
																					(Class76.anInt1580));
																	Class66.aClass4_Sub11_Sub1_1328
																			.method227(
																					(byte) -27,
																					(Class4_Sub20_Sub7_Sub4.anInt3357));
																} else if (i_13_ == 5002) {
																	Class28.anInt636++;
																	i_10_ -= 2;
																	int i_141_ = (Class24.anIntArray557[i_10_]);
																	int i_142_ = (Class24.anIntArray557[(i_10_ - -1)]);
																	JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
																	Class66.aClass4_Sub11_Sub1_1328
																			.method264(
																					47,
																					-105);
																	Class66.aClass4_Sub11_Sub1_1328
																			.method255(
																					(arg0 ^ 0xb4951d1),
																					(jagexString.method806((byte) -107)));
																	Class66.aClass4_Sub11_Sub1_1328
																			.method227(
																					(byte) -27,
																					(i_141_ - 1));
																	Class66.aClass4_Sub11_Sub1_1328
																			.method227(
																					(byte) -27,
																					i_142_);
																} else if (i_13_ == 5003) {
																	int i_143_ = (Class24.anIntArray557[--i_10_]);
																	JagexString jagexString = null;
																	if (i_143_ < 100) {
																		jagexString = Class4_Sub2_Sub1.aJagexStringArray2574[i_143_];
																	}
																	if (jagexString == null) {
																		jagexString = Class4_Sub20_Sub1.aJagexString_2738;
																	}
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = jagexString;
																} else if (i_13_ == 5004) {
																	int i_144_ = (Class24.anIntArray557[--i_10_]);
																	int i_145_ = -1;
																	if ((i_144_ < 100)
																			&& (Class4_Sub2_Sub1.aJagexStringArray2574[i_144_]) != null) {
																		i_145_ = Class18.anIntArray473[i_144_];
																	}
																	Class24.anIntArray557[i_10_++] = i_145_;
																} else if ((i_13_ ^ 0xffffffff) == -5006) {
																	Class24.anIntArray557[i_10_++] = (Class76.anInt1580);
																} else if (i_13_ == 5008) {
																	JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
																	if (jagexString
																			.method808(
																					(RS2Font.aJagexString_2779),
																					(byte) -95)) {
																		Class5.method642(
                                                                                jagexString,
																				false);
																	} else {
																		Class13.anInt369++;
																		JagexString jagexString_146_ = jagexString
																				.method827((byte) -55);
																		int i_147_ = 0;
																		int i_148_ = 0;
																		if (jagexString_146_
																				.method808(
																						Class64.aJagexString_1266,
																						(byte) -95)) {
																			i_147_ = 0;
																			jagexString = jagexString
																					.method805(
																							Class64.aJagexString_1266
																									.method825(arg0
																											^ ~0x78),
																							-46);
																		} else if (!jagexString_146_
																				.method808(
																						Class62.aJagexString_1226,
																						(byte) -95)) {
																			if (jagexString_146_
																					.method808(
																							Class4_Sub24.aJagexString_2442,
																							(byte) -95)) {
																				jagexString = jagexString
																						.method805(
																								Class4_Sub24.aJagexString_2442
																										.method825(-107),
																								106);
																				i_147_ = 2;
																			} else if (jagexString_146_
																					.method808(
																							StringUtilities.aJagexString_836,
																							(byte) -95)) {
																				i_147_ = 3;
																				jagexString = jagexString
																						.method805(
																								StringUtilities.aJagexString_836
																										.method825(arg0
																												^ ~0x73),
																								94);
																			} else if (jagexString_146_
																					.method808(
																							Class4_Sub20_Sub4.aJagexString_2853,
																							(byte) -95)) {
																				jagexString = jagexString
																						.method805(
																								Class4_Sub20_Sub4.aJagexString_2853
																										.method825(-127),
																								121);
																				i_147_ = 4;
																			} else if (!jagexString_146_
																					.method808(
																							StringUtilities.aJagexString_403,
																							(byte) -95)) {
																				if (jagexString_146_
																						.method808(
																								StringUtilities.aJagexString_2474,
																								(byte) -95)) {
																					jagexString = jagexString
																							.method805(
																									StringUtilities.aJagexString_2474
																											.method825(arg0
																													^ ~0x6c),
																									-110);
																					i_147_ = 6;
																				} else if (!jagexString_146_
																						.method808(
																								StringUtilities.aJagexString_295,
																								(byte) -95)) {
																					if (!jagexString_146_
																							.method808(
																									Class58.aJagexString_1172,
																									(byte) -95)) {
																						if (!jagexString_146_
																								.method808(
																										Class4_Sub20_Sub11.aJagexString_3094,
																										(byte) -95)) {
																							if (jagexString_146_
																									.method808(
																											Class6.aJagexString_207,
																											(byte) -95)) {
																								i_147_ = 10;
																								jagexString = jagexString
																										.method805(
																												Class6.aJagexString_207
																														.method825(-126),
																												-77);
																							} else if (jagexString_146_
																									.method808(
																											Class54.aJagexString_1106,
																											(byte) -95)) {
																								jagexString = jagexString
																										.method805(
																												Class54.aJagexString_1106
																														.method825(-102),
																												-122);
																								i_147_ = 11;
																							} else if (Class19_Sub1.anInt2536 != 0) {
																								if (!jagexString_146_
																										.method808(
																												Class64.aJagexString_1260,
																												(byte) -95)) {
																									if (jagexString_146_
																											.method808(
																													Class62.aJagexString_1236,
																													(byte) -95)) {
																										i_147_ = 1;
																										jagexString = jagexString
																												.method805(
																														Class62.aJagexString_1236
																																.method825(arg0
																																		^ ~0x6f),
																														-100);
																									} else if (!jagexString_146_
																											.method808(
																													Class4_Sub24.aJagexString_2435,
																													(byte) -95)) {
																										if (!jagexString_146_
																												.method808(
																														StringUtilities.aJagexString_839,
																														(byte) -95)) {
																											if (jagexString_146_
																													.method808(
																															Class4_Sub20_Sub4.aJagexString_2854,
																															(byte) -95)) {
																												i_147_ = 4;
																												jagexString = jagexString
																														.method805(
																																Class4_Sub20_Sub4.aJagexString_2854
																																		.method825(-121),
																																-48);
																											} else if (jagexString_146_
																													.method808(
																															StringUtilities.aJagexString_407,
																															(byte) -95)) {
																												i_147_ = 5;
																												jagexString = jagexString
																														.method805(
																																StringUtilities.aJagexString_407
																																		.method825(-99),
																																103);
																											} else if (jagexString_146_
																													.method808(
																															StringUtilities.aJagexString_2479,
																															(byte) -95)) {
																												jagexString = jagexString
																														.method805(
																																StringUtilities.aJagexString_2479
																																		.method825(arg0
																																				^ ~0x73),
																																-93);
																												i_147_ = 6;
																											} else if (!jagexString_146_
																													.method808(
																															StringUtilities.aJagexString_297,
																															(byte) -95)) {
																												if (jagexString_146_
																														.method808(
																																Class58.aJagexString_1166,
																																(byte) -95)) {
																													i_147_ = 8;
																													jagexString = jagexString
																															.method805(
																																	Class58.aJagexString_1166
																																			.method825(-97),
																																	94);
																												} else if (jagexString_146_
																														.method808(
																																Class4_Sub20_Sub11.aJagexString_3095,
																																(byte) -95)) {
																													jagexString = jagexString
																															.method805(
																																	Class4_Sub20_Sub11.aJagexString_3095
																																			.method825(-111),
																																	arg0 ^ 0x62);
																													i_147_ = 9;
																												} else if (jagexString_146_
																														.method808(
																																Class6.aJagexString_206,
																																(byte) -95)) {
																													jagexString = jagexString
																															.method805(
																																	Class6.aJagexString_206
																																			.method825(-96),
																																	73);
																													i_147_ = 10;
																												} else if (jagexString_146_
																														.method808(
																																Class54.aJagexString_1093,
																																(byte) -95)) {
																													i_147_ = 11;
																													jagexString = jagexString
																															.method805(
																																	Class54.aJagexString_1093
																																			.method825(arg0
																																					^ ~0x73),
																																	-91);
																												}
																											} else {
																												i_147_ = 7;
																												jagexString = jagexString
																														.method805(
																																StringUtilities.aJagexString_297
																																		.method825(arg0
																																				+ -112),
																																-89);
																											}
																										} else {
																											jagexString = jagexString
																													.method805(
																															StringUtilities.aJagexString_839
																																	.method825(arg0
																																			+ -105),
																															-35);
																											i_147_ = 3;
																										}
																									} else {
																										jagexString = jagexString
																												.method805(
																														Class4_Sub24.aJagexString_2435
																																.method825(-125),
																														79);
																										i_147_ = 2;
																									}
																								} else {
																									i_147_ = 0;
																									jagexString = jagexString
																											.method805(
																													Class64.aJagexString_1260
																															.method825(-128),
																													-117);
																								}
																							}
																						} else {
																							jagexString = jagexString
																									.method805(
																											Class4_Sub20_Sub11.aJagexString_3094
																													.method825(arg0
																															+ -102),
																											-42);
																							i_147_ = 9;
																						}
																					} else {
																						jagexString = jagexString
																								.method805(
																										Class58.aJagexString_1172
																												.method825(-111),
																										arg0
																												^ ~0x32);
																						i_147_ = 8;
																					}
																				} else {
																					i_147_ = 7;
																					jagexString = jagexString
																							.method805(
																									StringUtilities.aJagexString_295
																											.method825(-120),
																									arg0 ^ 0x6d);
																				}
																			} else {
																				jagexString = jagexString
																						.method805(
																								StringUtilities.aJagexString_403
																										.method825(-110),
																								-37);
																				i_147_ = 5;
																			}
																		} else {
																			jagexString = jagexString
																					.method805(
																							Class62.aJagexString_1226
																									.method825(-99),
																							124);
																			i_147_ = 1;
																		}
																		jagexString_146_ = jagexString
																				.method827((byte) -55);
																		if (!jagexString_146_
																				.method808(
																						Class4_Sub20_Sub7_Sub1_Sub1.aJagexString_3589,
																						(byte) -95)) {
																			if (!jagexString_146_
																					.method808(
																							Class4_Sub21.aJagexString_2375,
																							(byte) -95)) {
																				if (jagexString_146_
																						.method808(
																								Class4_Sub11_Sub1.aJagexString_2676,
																								(byte) -95)) {
																					i_148_ = 3;
																					jagexString = jagexString
																							.method805(
																									Class4_Sub11_Sub1.aJagexString_2676
																											.method825(-100),
																									103);
																				} else if (jagexString_146_
																						.method808(
																								Class4_Sub20_Sub4.aJagexString_2860,
																								(byte) -95)) {
																					jagexString = jagexString
																							.method805(
																									Class4_Sub20_Sub4.aJagexString_2860
																											.method825(-128),
																									85);
																					i_148_ = 4;
																				} else if (!jagexString_146_
																						.method808(
																								Class80.aJagexString_1635,
																								(byte) -95)) {
																					if ((Class19_Sub1.anInt2536 ^ 0xffffffff) != -1) {
																						if (!jagexString_146_
																								.method808(
																										Class4_Sub20_Sub7_Sub1_Sub1.aJagexString_3600,
																										(byte) -95)) {
																							if (!jagexString_146_
																									.method808(
																											Class4_Sub21.aJagexString_2377,
																											(byte) -95)) {
																								if (!jagexString_146_
																										.method808(
																												Class4_Sub11_Sub1.aJagexString_2669,
																												(byte) -95)) {
																									if (jagexString_146_
																											.method808(
																													Class4_Sub20_Sub4.aJagexString_2852,
																													(byte) -95)) {
																										i_148_ = 4;
																										jagexString = jagexString
																												.method805(
																														Class4_Sub20_Sub4.aJagexString_2852
																																.method825(-106),
																														-87);
																									} else if (jagexString_146_
																											.method808(
																													Class80.aJagexString_1640,
																													(byte) -95)) {
																										i_148_ = 5;
																										jagexString = jagexString
																												.method805(
																														Class80.aJagexString_1640
																																.method825(-105),
																														123);
																									}
																								} else {
																									jagexString = jagexString
																											.method805(
																													Class4_Sub11_Sub1.aJagexString_2669
																															.method825(-109),
																													99);
																									i_148_ = 3;
																								}
																							} else {
																								jagexString = jagexString
																										.method805(
																												Class4_Sub21.aJagexString_2377
																														.method825(arg0
																																^ ~0x69),
																												76);
																								i_148_ = 2;
																							}
																						} else {
																							i_148_ = 1;
																							jagexString = jagexString
																									.method805(
																											Class4_Sub20_Sub7_Sub1_Sub1.aJagexString_3600
																													.method825(-97),
																											100);
																						}
																					}
																				} else {
																					i_148_ = 5;
																					jagexString = jagexString
																							.method805(
																									Class80.aJagexString_1635
																											.method825(-127),
																									86);
																				}
																			} else {
																				jagexString = jagexString
																						.method805(
																								Class4_Sub21.aJagexString_2375
																										.method825(-106),
																								-73);
																				i_148_ = 2;
																			}
																		} else {
																			i_148_ = 1;
																			jagexString = jagexString
																					.method805(
																							Class4_Sub20_Sub7_Sub1_Sub1.aJagexString_3589
																									.method825(-114),
																							-56);
																		}
																		Class66.aClass4_Sub11_Sub1_1328
																				.method264(
																						115,
																						arg0 ^ 0x78);
																		Class66.aClass4_Sub11_Sub1_1328
																				.method227(
																						(byte) -27,
																						0);
																		int i_149_ = Class66.aClass4_Sub11_Sub1_1328.pointion;
																		Class66.aClass4_Sub11_Sub1_1328
																				.method227(
																						(byte) -27,
																						i_147_);
																		Class66.aClass4_Sub11_Sub1_1328
																				.method227(
																						(byte) -27,
																						i_148_);
																		Class4_Sub11_Sub1
																				.method270(
																						Class66.aClass4_Sub11_Sub1_1328,
																						-7547,
                                                                                        jagexString);
																		Class66.aClass4_Sub11_Sub1_1328
																				.method258(
																						Class66.aClass4_Sub11_Sub1_1328.pointion
																								+ -i_149_,
																						(byte) 90);
																	}
																} else if ((i_13_ ^ 0xffffffff) == -5010) {
																	Class54.anInt1099++;
																	i_11_ -= 2;
																	JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[i_11_]);
																	JagexString jagexString_150_ = (Class4_Sub11_Sub1.aJagexStringArray2673[1 + i_11_]);
																	Class66.aClass4_Sub11_Sub1_1328
																			.method264(
																					238,
																					-47);
																	Class66.aClass4_Sub11_Sub1_1328
																			.method227(
																					(byte) -27,
																					0);
																	int i_151_ = (Class66.aClass4_Sub11_Sub1_1328.pointion);
																	Class66.aClass4_Sub11_Sub1_1328
																			.method255(
																					189354448,
																					(jagexString.method806((byte) -32)));
																	Class4_Sub11_Sub1
																			.method270(
																					(Class66.aClass4_Sub11_Sub1_1328),
																					-7547,
                                                                                    jagexString_150_);
																	Class66.aClass4_Sub11_Sub1_1328
																			.method258(
																					(-i_151_ + (Class66.aClass4_Sub11_Sub1_1328.pointion)),
																					(byte) 93);
																} else if ((i_13_ ^ 0xffffffff) == -5011) {
																	int i_152_ = (Class24.anIntArray557[--i_10_]);
																	JagexString jagexString = null;
																	if (i_152_ < 100) {
																		jagexString = Class13.aJagexStringArray385[i_152_];
																	}
																	if (jagexString == null) {
																		jagexString = Class4_Sub20_Sub1.aJagexString_2738;
																	}
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = jagexString;
																} else if (i_13_ == 5011) {
																	int i_153_ = (Class24.anIntArray557[--i_10_]);
																	JagexString jagexString = null;
																	if ((i_153_ ^ 0xffffffff) > -101) {
																		jagexString = Class4_Sub20_Sub9.aJagexStringArray3046[i_153_];
																	}
																	if (jagexString == null) {
																		jagexString = Class4_Sub20_Sub1.aJagexString_2738;
																	}
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = jagexString;
																} else if ((i_13_ ^ 0xffffffff) == -5016) {
																	JagexString jagexString;
																	if (((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302) != null)
																			&& (Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.aJagexString_3593) != null) {
																		jagexString = Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.aJagexString_3593;
																	} else {
																		jagexString = StringUtilities.aJagexString_1768;
																	}
																	Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = jagexString;
																} else if ((i_13_ ^ 0xffffffff) == -5017) {
																	Class24.anIntArray557[i_10_++] = (Class4_Sub20_Sub7_Sub4.anInt3357);
																} else {
																	if ((i_13_ ^ 0xffffffff) != -5018) {
																		break;
																	}
																	Class24.anIntArray557[i_10_++] = (Class80.anInt1646);
																}
															}
														} else if ((i_13_ ^ 0xffffffff) == -4101) {
															int i_154_ = (Class24.anIntArray557[--i_10_]);
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
															Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub24
																	.method639(
																			(new JagexString[] {
                                                                                    jagexString,
																					(Class74.method1168(
																							-66,
																							i_154_)) }),
																			-842));
														} else if ((i_13_ ^ 0xffffffff) == -4102) {
															i_11_ -= 2;
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[1 + i_11_]);
															JagexString jagexString_155_ = (Class4_Sub11_Sub1.aJagexStringArray2673[i_11_]);
															Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub24
																	.method639(
																			(new JagexString[] {
                                                                                    jagexString_155_,
                                                                                    jagexString}),
																			-842));
														} else if ((i_13_ ^ 0xffffffff) == -4103) {
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
															int i_156_ = (Class24.anIntArray557[--i_10_]);
															Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub24
																	.method639(
																			(new JagexString[] {
                                                                                    jagexString,
																					(Class34.method896(
																							true,
																							i_156_,
																							117)) }),
																			-842));
														} else if ((i_13_ ^ 0xffffffff) == -4104) {
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
															Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (jagexString
																	.method827((byte) -55));
														} else if (i_13_ == 4104) {
															int i_157_ = (Class24.anIntArray557[--i_10_]);
															long l = ((i_157_ * 86400000L) + 1014768000000L);
															Class45.aCalendar919
																	.setTime(new Date(
																			l));
															int i_158_ = Class45.aCalendar919
																	.get(5);
															int i_159_ = Class45.aCalendar919
																	.get(2);
															int i_160_ = Class45.aCalendar919
																	.get(1);
															Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub24
																	.method639(
																			(new JagexString[] {
																					(Class74.method1168(
																							-44,
																							i_158_)),
																					(StringUtilities.aJagexString_846),
																					(Class47.aJagexStringArray954[i_159_]),
																					(StringUtilities.aJagexString_846),
																					(Class74.method1168(
																							-102,
																							i_160_)) }),
																			-842));
														} else if ((i_13_ ^ 0xffffffff) == -4106) {
															i_11_ -= 2;
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[(i_11_ - -1)]);
															JagexString jagexString_161_ = (Class4_Sub11_Sub1.aJagexStringArray2673[i_11_]);
															if (((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.aClass35_3609) == null)
																	|| !(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.aClass35_3609.aBoolean725)) {
																Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = jagexString_161_;
															} else {
																Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = jagexString;
															}
														} else if ((i_13_ ^ 0xffffffff) == -4107) {
															int i_162_ = (Class24.anIntArray557[--i_10_]);
															Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class74
																	.method1168(
																			-86,
																			i_162_));
														} else if (i_13_ == 4107) {
															i_11_ -= 2;
															Class24.anIntArray557[i_10_++] = (Class4_Sub11_Sub1.aJagexStringArray2673[i_11_]
																	.method833(
																			(Class4_Sub11_Sub1.aJagexStringArray2673[1 + i_11_]),
																			-96));
														} else if ((i_13_ ^ 0xffffffff) == -4109) {
															i_10_ -= 2;
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
															int i_163_ = (Class24.anIntArray557[1 + i_10_]);
															int i_164_ = (Class24.anIntArray557[i_10_]);
															byte[] is_165_ = (Class4_Sub20_Sub6.aClass19_Sub1_2921
																	.method746(
																			i_163_,
																			(byte) 107,
																			0));
															Class4_Sub20_Sub12_Sub4_Sub1 class4_sub20_sub12_sub4_sub1 = (new Class4_Sub20_Sub12_Sub4_Sub1(
																	is_165_));
															Class24.anIntArray557[i_10_++] = (class4_sub20_sub12_sub4_sub1
																	.method570(
                                                                            jagexString,
																			i_164_));
														} else if ((i_13_ ^ 0xffffffff) == -4110) {
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
															i_10_ -= 2;
															int i_166_ = (Class24.anIntArray557[i_10_]);
															int i_167_ = (Class24.anIntArray557[1 + i_10_]);
															byte[] is_168_ = (Class4_Sub20_Sub6.aClass19_Sub1_2921
																	.method746(
																			i_167_,
																			(byte) 90,
																			0));
															Class4_Sub20_Sub12_Sub4_Sub1 class4_sub20_sub12_sub4_sub1 = (new Class4_Sub20_Sub12_Sub4_Sub1(
																	is_168_));
															Class24.anIntArray557[i_10_++] = (class4_sub20_sub12_sub4_sub1
																	.method568(
                                                                            jagexString,
																			i_166_));
														} else if ((i_13_ ^ 0xffffffff) == -4111) {
															i_11_ -= 2;
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[1 + i_11_]);
															JagexString jagexString_169_ = (Class4_Sub11_Sub1.aJagexStringArray2673[i_11_]);
															if (((Class24.anIntArray557[--i_10_]) ^ 0xffffffff) != -2) {
																Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = jagexString;
															} else {
																Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = jagexString_169_;
															}
														} else if ((i_13_ ^ 0xffffffff) == -4112) {
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
															Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub20_Sub12_Sub4
																	.method574(jagexString));
														} else if (i_13_ == 4112) {
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
															int i_170_ = (Class24.anIntArray557[--i_10_]);
															Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (jagexString
																	.method838(
																			15871,
																			i_170_));
														} else if ((i_13_ ^ 0xffffffff) == -4114) {
															int i_171_ = (Class24.anIntArray557[--i_10_]);
															Class24.anIntArray557[i_10_++] = (!(Class82
																	.method1215(
																			false,
																			i_171_)) ? 0
																	: 1);
														} else if (i_13_ == 4114) {
															int i_172_ = (Class24.anIntArray557[--i_10_]);
															Class24.anIntArray557[i_10_++] = ((Class19
																	.method750(
																			true,
																			i_172_)) ? 1
																	: 0);
														} else if (i_13_ == 4115) {
															int i_173_ = (Class24.anIntArray557[--i_10_]);
															Class24.anIntArray557[i_10_++] = ((Class2
																	.method45(
																			-103,
																			i_173_)) ? 1
																	: 0);
														} else if ((i_13_ ^ 0xffffffff) == -4117) {
															int i_174_ = (Class24.anIntArray557[--i_10_]);
															Class24.anIntArray557[i_10_++] = ((Class50
																	.method993(
																			i_174_,
																			(byte) -120)) ? 1
																	: 0);
														} else if (i_13_ == 4117) {
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
															if (jagexString == null) {
																Class24.anIntArray557[i_10_++] = 0;
															} else {
																Class24.anIntArray557[i_10_++] = (jagexString
																		.method825(arg0
																				+ -113));
															}
														} else if (i_13_ == 4118) {
															i_10_ -= 2;
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
															int i_175_ = (Class24.anIntArray557[(i_10_ - -1)]);
															int i_176_ = (Class24.anIntArray557[i_10_]);
															Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (jagexString
																	.method829(
																			(byte) 93,
																			i_176_,
																			i_175_));
														} else if ((i_13_ ^ 0xffffffff) == -4120) {
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
															JagexString jagexString_177_ = (Class4_Sub10
																	.method205(
																			(byte) -99,
																			(jagexString.method825(arg0
																					+ -123))));
															boolean bool_178_ = false;
															for (int i_179_ = 0; ((jagexString
																	.method825(-116)) > i_179_); i_179_++) {
																int i_180_ = (jagexString
																		.method834(
																				21340,
																				i_179_));
																if ((i_180_ ^ 0xffffffff) != -61) {
																	if ((i_180_ ^ 0xffffffff) == -63) {
																		bool_178_ = false;
																	} else if (!bool_178_) {
																		jagexString_177_
																				.method824(
																						i_180_,
																						0);
																	}
																} else {
																	bool_178_ = true;
																}
															}
															jagexString_177_
																	.method831(0);
															Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = jagexString_177_;
														} else {
															if (i_13_ != 4120) {
																break;
															}
															JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
															int i_181_ = (Class24.anIntArray557[--i_10_]);
															Class24.anIntArray557[i_10_++] = (jagexString
																	.method837(
																			i_181_,
																			0));
														}
													} else if ((i_13_ ^ 0xffffffff) == -3201) {
														i_10_ -= 3;
														Class35.method900(
																(Class24.anIntArray557[2 + i_10_]),
																(Class24.anIntArray557[i_10_]),
																(Class24.anIntArray557[i_10_ + 1]),
																12644);
													} else if ((i_13_ ^ 0xffffffff) == -3202) {
														Class4_Sub11_Sub1
																.method275(
																		(byte) 60,
																		(Class24.anIntArray557[--i_10_]));
													} else {
														if ((i_13_ ^ 0xffffffff) != -3203) {
															break;
														}
														i_10_ -= 2;
														Class46.method973(
																false,
																(Class24.anIntArray557[i_10_]),
																(Class24.anIntArray557[i_10_
																		- -1]));
													}
												} else if (i_13_ == 3100) {
													JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
													Class43.method955(
                                                            jagexString,
															(Class4_Sub20_Sub1.aJagexString_2738),
															(byte) 123, 0);
												} else if ((i_13_ ^ 0xffffffff) == -3102) {
													i_10_ -= 2;
													Class64.method1064(
															(Class24.anIntArray557[1 + i_10_]),
															(byte) 114,
															(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302),
															(Class24.anIntArray557[i_10_]));
												} else if ((i_13_ ^ 0xffffffff) == -3104) {
													Class2.method43(122);
												} else if ((i_13_ ^ 0xffffffff) == -3105) {
													JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
													Class24.anInt554++;
													int i_182_ = 0;
													if (jagexString
															.method819((byte) -91)) {
														i_182_ = (jagexString
																.method804((byte) -89));
													}
													Class66.aClass4_Sub11_Sub1_1328
															.method264(78, -47);
													Class66.aClass4_Sub11_Sub1_1328
															.method236(181,
																	i_182_);
												} else if ((i_13_ ^ 0xffffffff) == -3106) {
													JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
													Class66.anInt1318++;
													Class66.aClass4_Sub11_Sub1_1328
															.method264(45,
																	arg0 ^ 0x73);
													Class66.aClass4_Sub11_Sub1_1328
															.method255(
																	189354448,
																	(jagexString.method806((byte) -42)));
												} else if (i_13_ == 3106) {
													Class4_Sub2_Sub4.anInt2658++;
													JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
													Class66.aClass4_Sub11_Sub1_1328
															.method264(150, 111);
													Class66.aClass4_Sub11_Sub1_1328
															.method227(
																	(byte) -27,
																	(jagexString.method825(-105) - -1));
													Class66.aClass4_Sub11_Sub1_1328
															.method259(jagexString,
																	18601);
												} else if ((i_13_ ^ 0xffffffff) == -3108) {
													JagexString jagexString = (Class4_Sub11_Sub1.aJagexStringArray2673[--i_11_]);
													int i_183_ = (Class24.anIntArray557[--i_10_]);
													Class4_Sub20_Sub7_Sub5
															.method430(
																	(byte) 121,
                                                                    jagexString,
																	i_183_);
												} else if (i_13_ == 3108) {
													i_10_ -= 3;
													int i_184_ = (Class24.anIntArray557[i_10_
															- -1]);
													int i_185_ = (Class24.anIntArray557[i_10_]);
													int i_186_ = (Class24.anIntArray557[2 + i_10_]);
													RSInterface class4_sub13 = (Class4_Sub20
															.method322(true,
																	i_186_));
													Region.method54((byte) 85,
															i_184_, i_185_,
															class4_sub13);
												} else {
													if ((i_13_ ^ 0xffffffff) != -3110) {
														break;
													}
													RSInterface class4_sub13 = (!bool ? (Class4_Sub20_Sub5.aClass4_Sub13_2882)
															: (Class9.aClass4_Sub13_285));
													i_10_ -= 2;
													int i_187_ = (Class24.anIntArray557[i_10_
															- -1]);
													int i_188_ = (Class24.anIntArray557[i_10_]);
													Region.method54((byte) 85,
															i_187_, i_188_,
															class4_sub13);
												}
											} else {
												RSInterface class4_sub13 = (Class4_Sub20
														.method322(
																true,
																(Class24.anIntArray557[--i_10_])));
												if (i_13_ == 2800) {
													Class24.anIntArray557[i_10_++] = (Class68
															.method1092(
																	14423,
																	(Class54.method1011(
																			class4_sub13,
																			-22389))));
												} else if ((i_13_ ^ 0xffffffff) == -2802) {
													int i_189_ = (Class24.anIntArray557[--i_10_]);
													i_189_--;
													if (((class4_sub13.aJagexStringArray2247) == null)
															|| (i_189_ >= (class4_sub13.aJagexStringArray2247).length)
															|| (class4_sub13.aJagexStringArray2247[i_189_]) == null) {
														Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub20_Sub1.aJagexString_2738);
													} else {
														Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (class4_sub13.aJagexStringArray2247[i_189_]);
													}
												} else {
													if ((i_13_ ^ 0xffffffff) != -2803) {
														break;
													}
													if ((class4_sub13.aJagexString_2196) == null) {
														Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (Class4_Sub20_Sub1.aJagexString_2738);
													} else {
														Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = (class4_sub13.aJagexString_2196);
													}
												}
											}
										} else if ((i_13_ ^ 0xffffffff) == -2701) {
											RSInterface class4_sub13 = (Class4_Sub20
													.method322(
															true,
															(Class24.anIntArray557[--i_10_])));
											Class24.anIntArray557[i_10_++] = class4_sub13.anInt2226;
										} else if ((i_13_ ^ 0xffffffff) == -2702) {
											RSInterface class4_sub13 = (Class4_Sub20
													.method322(
															true,
															(Class24.anIntArray557[--i_10_])));
											if ((class4_sub13.anInt2226 ^ 0xffffffff) == 0) {
												Class24.anIntArray557[i_10_++] = 0;
											} else {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2143;
											}
										} else {
											if (i_13_ != 2702) {
												break;
											}
											int i_190_ = (Class24.anIntArray557[--i_10_]);
											Class4_Sub16 class4_sub16 = ((Class4_Sub16) (Class31.aClass16_677
													.method725((byte) 117,
															i_190_)));
											if (class4_sub16 == null) {
												Class24.anIntArray557[i_10_++] = 0;
											} else {
												Class24.anIntArray557[i_10_++] = 1;
											}
										}
									} else {
										RSInterface class4_sub13 = (bool ? Class9.aClass4_Sub13_285
												: (Class4_Sub20_Sub5.aClass4_Sub13_2882));
										if (i_13_ == 1700) {
											Class24.anIntArray557[i_10_++] = class4_sub13.anInt2226;
										} else if ((i_13_ ^ 0xffffffff) == -1702) {
											if (class4_sub13.anInt2226 == -1) {
												Class24.anIntArray557[i_10_++] = 0;
											} else {
												Class24.anIntArray557[i_10_++] = class4_sub13.anInt2143;
											}
										} else {
											if ((i_13_ ^ 0xffffffff) != -1703) {
												break;
											}
											Class24.anIntArray557[i_10_++] = class4_sub13.anInt2163;
										}
									}
								} else {
									RSInterface class4_sub13 = (bool ? Class9.aClass4_Sub13_285
											: (Class4_Sub20_Sub5.aClass4_Sub13_2882));
									if (i_13_ == 1600) {
										Class24.anIntArray557[i_10_++] = class4_sub13.anInt2231;
									} else if (i_13_ == 1601) {
										Class24.anIntArray557[i_10_++] = class4_sub13.anInt2238;
									} else if ((i_13_ ^ 0xffffffff) == -1603) {
										Class4_Sub11_Sub1.aJagexStringArray2673[i_11_++] = class4_sub13.aJagexString_2150;
									} else if ((i_13_ ^ 0xffffffff) == -1604) {
										Class24.anIntArray557[i_10_++] = class4_sub13.anInt2208;
									} else if (i_13_ == 1604) {
										Class24.anIntArray557[i_10_++] = class4_sub13.anInt2206;
									} else if (i_13_ == 1605) {
										Class24.anIntArray557[i_10_++] = class4_sub13.anInt2168;
									} else if (i_13_ == 1606) {
										Class24.anIntArray557[i_10_++] = class4_sub13.anInt2213;
									} else if ((i_13_ ^ 0xffffffff) == -1608) {
										Class24.anIntArray557[i_10_++] = class4_sub13.anInt2151;
									} else {
										if (i_13_ != 1608) {
											break;
										}
										Class24.anIntArray557[i_10_++] = class4_sub13.anInt2236;
									}
								}
							} else {
								RSInterface class4_sub13 = (bool ? Class9.aClass4_Sub13_285
										: Class4_Sub20_Sub5.aClass4_Sub13_2882);
								if ((i_13_ ^ 0xffffffff) == -1501) {
									Class24.anIntArray557[i_10_++] = class4_sub13.anInt2181;
								} else if ((i_13_ ^ 0xffffffff) == -1502) {
									Class24.anIntArray557[i_10_++] = class4_sub13.anInt2212;
								} else if ((i_13_ ^ 0xffffffff) == -1503) {
									Class24.anIntArray557[i_10_++] = class4_sub13.anInt2156;
								} else if ((i_13_ ^ 0xffffffff) == -1504) {
									Class24.anIntArray557[i_10_++] = class4_sub13.anInt2185;
								} else if (i_13_ == 1504) {
									Class24.anIntArray557[i_10_++] = class4_sub13.aBoolean2225 ? 1
											: 0;
								} else {
									if (i_13_ != 1505) {
										break;
									}
									Class24.anIntArray557[i_10_++] = class4_sub13.anInt2183;
								}
							}
						} else {
							RSInterface class4_sub13;
							if (i_13_ >= 2000) {
								class4_sub13 = Class4_Sub20.method322(true,
										(Class24.anIntArray557[--i_10_]));
								i_13_ -= 1000;
							} else {
								class4_sub13 = (!bool ? Class4_Sub20_Sub5.aClass4_Sub13_2882
										: Class9.aClass4_Sub13_285);
							}
							if (i_13_ == 1000) {
								i_10_ -= 2;
								class4_sub13.anInt2181 = Class24.anIntArray557[i_10_];
								class4_sub13.anInt2212 = Class24.anIntArray557[i_10_ + 1];
								Class67.method1088(class4_sub13);
							} else if (i_13_ == 1001) {
								i_10_ -= 2;
								class4_sub13.anInt2156 = Class24.anIntArray557[i_10_];
								class4_sub13.anInt2185 = Class24.anIntArray557[1 + i_10_];
								Class67.method1088(class4_sub13);
							} else {
								if (i_13_ != 1003) {
									break;
								}
								boolean bool_191_ = ((Class24.anIntArray557[--i_10_] ^ 0xffffffff) == -2);
								if (!bool_191_ == class4_sub13.aBoolean2225) {
									class4_sub13.aBoolean2225 = bool_191_;
									Class67.method1088(class4_sub13);
								}
							}
						}
					}
					throw new IllegalStateException();
				} catch (Exception exception) {
					if (class4_sub20_sub16.aJagexString_3172 != null) {
						JagexString jagexString = Class4_Sub10
								.method205((byte) -89, 30);
						jagexString.method832(RS2Font.aJagexString_2770,
								(byte) -28).method832(
								class4_sub20_sub16.aJagexString_3172, (byte) -28);
						for (int i_192_ = -1 + Class31.anInt669; i_192_ >= 0; i_192_--) {
							jagexString.method832(Class66.aJagexString_1334, (byte) -28)
									.method832(
											(Class42.aClass59Array849[i_192_].aClass4_Sub20_Sub16_1182.aJagexString_3172),
											(byte) -28);
						}
						if ((i_13_ ^ 0xffffffff) == -41) {
							int i_193_ = is[i_12_];
							jagexString.method832(Class5.aJagexString_176, (byte) -28)
									.method832(Class74.method1168(-60, i_193_),
											(byte) -28);
						}
						if (Class12.anInt341 != 0) {
							Class43.method955(
									Class4_Sub24
											.method639(
													(new JagexString[] {
															StringUtilities.aJagexString_81,
															(class4_sub20_sub16.aJagexString_3172) }),
													-842),
									Class4_Sub20_Sub1.aJagexString_2738,
									(byte) 113, 0);
						}
						Class4_Sub20_Sub7_Sub4.method422(
								exception,
								arg0 ^ ~0x61,
								("CS2 - scr:" + class4_sub20_sub16.aLong150
										+ " op:" + i_13_ + new String(jagexString
										.method836(-10650))));
					} else {
						if (Class12.anInt341 != 0) {
							Class43.method955(Class4_Sub2_Sub1.aJagexString_2581,
									Class4_Sub20_Sub1.aJagexString_2738,
									(byte) 117, 0);
						}
						Class4_Sub20_Sub7_Sub4.method422(exception, -122,
								("CS2 - scr:" + (class4_sub20_sub16.aLong150)
										+ " op:" + i_13_));
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ec.D("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method722(int arg0) {
		try {
			if (arg0 > 35) {
				StringUtilities.aJagexString_434 = null;
				StringUtilities.aJagexString_445 = null;
				StringUtilities.aJagexString_451 = null;
				aBooleanArray452 = null;
				aClass19_429 = null;
				StringUtilities.aJagexString_432 = null;
				aShortArray448 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ec.G("
					+ arg0 + ')');
		}
	}

	public static void method726(int arg0, Class47 arg1) {
		try {
			anInt435++;
			if (arg0 != -1) {
				StringUtilities.aJagexString_451 = null;
			}
			Class10.aClass47_305 = arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ec.I("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method727(int arg0, byte arg1) {
		try {
			anInt440++;
			if (arg1 <= 13) {
				method727(67, (byte) -32);
			}
			Class4_Sub1 class4_sub1 = ((Class4_Sub1) Class31.aClass16_671
					.method725((byte) 117, arg0));
			if (class4_sub1 != null) {
				class4_sub1.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ec.F("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method729(Class4_Sub20_Sub7_Sub1 arg0, byte arg1) {
		try {
			anInt447++;
			if (arg0.anInt3237 != 0) {
				if ((arg0.anInt3293 ^ 0xffffffff) != 0
						&& (arg0.anInt3293 ^ 0xffffffff) > -32769) {
					Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[arg0.anInt3293]);
					if (class4_sub20_sub7_sub1_sub2 != null) {
						int i_196_ = (arg0.anInt3267 - class4_sub20_sub7_sub1_sub2.anInt3267);
						int i_197_ = (-class4_sub20_sub7_sub1_sub2.anInt3270 + arg0.anInt3270);
						if (i_197_ != 0 || i_196_ != 0) {
							arg0.anInt3217 = ((int) (325.949 * Math.atan2(
									i_197_, i_196_)) & 0x7ff);
						}
					}
				}
				if (arg0.anInt3293 >= 32768) {
					int i_198_ = arg0.anInt3293 + -32768;
					if ((i_198_ ^ 0xffffffff) == (Region.anInt127 ^ 0xffffffff)) {
						i_198_ = 2047;
					}
					Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i_198_]);
					if (class4_sub20_sub7_sub1_sub1 != null) {
						int i_199_ = (arg0.anInt3267 + -class4_sub20_sub7_sub1_sub1.anInt3267);
						int i_200_ = (arg0.anInt3270 + -class4_sub20_sub7_sub1_sub1.anInt3270);
						if ((i_200_ ^ 0xffffffff) != -1
								|| (i_199_ ^ 0xffffffff) != -1) {
							arg0.anInt3217 = (int) (Math.atan2(i_200_, i_199_) * 325.949) & 0x7ff;
						}
					}
				}
				if (((arg0.anInt3292 ^ 0xffffffff) != -1 || (arg0.anInt3231 ^ 0xffffffff) != -1)
						&& ((arg0.anInt3228 ^ 0xffffffff) == -1 || (arg0.anInt3266 ^ 0xffffffff) < -1)) {
					int i_201_ = (-(64 * (-Class6.anInt217 + (-Class6.anInt217 + arg0.anInt3292))) + arg0.anInt3270);
					int i_202_ = (arg0.anInt3267 - (-Class4_Sub20_Sub8.anInt2987
							+ arg0.anInt3231 - Class4_Sub20_Sub8.anInt2987) * 64);
					if ((i_201_ ^ 0xffffffff) != -1 || i_202_ != 0) {
						arg0.anInt3217 = 0x7ff & (int) (325.949 * Math.atan2(
								i_201_, i_202_));
					}
					arg0.anInt3292 = 0;
					arg0.anInt3231 = 0;
				}
				int i_203_ = 0x7ff & -arg0.anInt3219 + arg0.anInt3217;
				if ((i_203_ ^ 0xffffffff) != -1) {
					arg0.anInt3221++;
					if ((i_203_ ^ 0xffffffff) >= -1025) {
						arg0.anInt3219 += arg0.anInt3237;
						boolean bool = true;
						if (arg0.anInt3237 > i_203_
								|| 2048 + -arg0.anInt3237 < i_203_) {
							bool = false;
							arg0.anInt3219 = arg0.anInt3217;
						}
						if (arg0.anInt3265 == arg0.anInt3257
								&& ((arg0.anInt3221 ^ 0xffffffff) < -26 || bool)) {
							if (arg0.anInt3246 != -1) {
								arg0.anInt3257 = arg0.anInt3246;
							} else {
								arg0.anInt3257 = arg0.anInt3272;
							}
						}
					} else {
						arg0.anInt3219 -= arg0.anInt3237;
						boolean bool = true;
						if (i_203_ < arg0.anInt3237
								|| (i_203_ ^ 0xffffffff) < (-arg0.anInt3237 + 2048 ^ 0xffffffff)) {
							bool = false;
							arg0.anInt3219 = arg0.anInt3217;
						}
						if ((arg0.anInt3257 ^ 0xffffffff) == (arg0.anInt3265 ^ 0xffffffff)
								&& ((arg0.anInt3221 ^ 0xffffffff) < -26 || bool)) {
							if ((arg0.anInt3250 ^ 0xffffffff) != 0) {
								arg0.anInt3257 = arg0.anInt3250;
							} else {
								arg0.anInt3257 = arg0.anInt3272;
							}
						}
					}
					arg0.anInt3219 &= 0x7ff;
				} else {
					arg0.anInt3221 = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ec.A("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public RSFont aClass4_443;

	public RSFont aClass4_453;

	public RSFont[] aClass4Array428;

	public long aLong439;

	public int anInt436;

	public int anInt449 = 0;

	public Class16(int arg0) {
		try {
			aClass4Array428 = new RSFont[arg0];
			anInt436 = arg0;
			for (int i = 0; (arg0 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				RSFont class4 = aClass4Array428[i] = new RSFont();
				class4.next = class4;
				class4.prev = class4;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"ec.<init>(" + arg0 + ')');
		}
	}

	public void method720(RSFont arg0, long arg1, boolean arg2) {
		try {
			anInt438++;
			if (arg0.prev != null) {
				arg0.clear();
			}
			RSFont class4 = aClass4Array428[(int) (arg1 & (-1 + anInt436))];
			if (arg2 != false) {
				anInt426 = -60;
			}
			arg0.next = class4;
			arg0.prev = class4.prev;
			arg0.aLong150 = arg1;
			arg0.prev.next = arg0;
			arg0.next.prev = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ec.H("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public RSFont method723(byte arg0) {
		try {
			anInt441++;
			if (anInt449 > 0 && aClass4_453 != aClass4Array428[anInt449 + -1]) {
				RSFont class4 = aClass4_453;
				aClass4_453 = class4.next;
				return class4;
			}
			if (arg0 != -25) {
				anInt426 = -34;
			}
			while ((anInt449 ^ 0xffffffff) > (anInt436 ^ 0xffffffff)) {
				RSFont class4 = aClass4Array428[anInt449++].next;
				if (aClass4Array428[anInt449 + -1] != class4) {
					aClass4_453 = class4.next;
					return class4;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ec.C("
					+ arg0 + ')');
		}
	}

	public RSFont method724(byte arg0) {
		try {
			anInt449 = 0;
			anInt442++;
			return method723((byte) -25);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ec.E("
					+ arg0 + ')');
		}
	}

	public RSFont method725(byte arg0, long arg1) {
		try {
			aLong439 = arg1;
			anInt433++;
			RSFont class4 = aClass4Array428[(int) (arg1 & (anInt436 + -1))];
			if (arg0 != 117) {
				StringUtilities.aJagexString_434 = null;
			}
			for (aClass4_443 = class4.next; aClass4_443 != class4; aClass4_443 = aClass4_443.next) {
				if ((arg1 ^ 0xffffffffffffffffL) == (aClass4_443.aLong150 ^ 0xffffffffffffffffL)) {
					RSFont class4_194_ = aClass4_443;
					aClass4_443 = aClass4_443.next;
					return class4_194_;
				}
			}
			aClass4_443 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ec.J("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public RSFont method728(int arg0) {
		try {
			if (arg0 != 12133) {
				method719(-6, (byte) 101, -73);
			}
			anInt431++;
			if (aClass4_443 == null) {
				return null;
			}
			for (RSFont class4 = aClass4Array428[(int) ((anInt436 + -1) & aLong439)]; aClass4_443 != class4; aClass4_443 = aClass4_443.next) {
				if (aClass4_443.aLong150 == aLong439) {
					RSFont class4_195_ = aClass4_443;
					aClass4_443 = aClass4_443.next;
					return class4_195_;
				}
			}
			aClass4_443 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ec.B("
					+ arg0 + ')');
		}
	}
}
