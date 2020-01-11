package com.jagex.runescape;/* Class4_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;
import java.util.zip.CRC32;

public class StreamBuffer extends RSFont {
	public static boolean aBoolean2066 = false;
	public static JagexString aJagexString_2101 = JagexString.getRs2PreparedString(":"
	);
	public static JagexString aJagexString_2115;
	public static Class64 aClass64_2096;
	public static Class65 aClass65_2073;
	public static CRC32 aCRC32_2116;
	public static int anInt2052;
	public static int anInt2053;
	public static int anInt2054;
	public static int anInt2055;
	public static int anInt2056;
	public static int anInt2057;
	public static int anInt2058;
	public static int anInt2059;
	public static int anInt2060;
	public static int anInt2061;
	public static int anInt2062;
	public static int anInt2063;
	public static int anInt2064;
	public static int anInt2065;
	public static int anInt2067;
	public static int anInt2068;
	public static int anInt2069;
	public static int anInt2070;
	public static int anInt2071;
	public static int anInt2072;
	public static int anInt2074;
	public static int anInt2075;
	public static int anInt2076;
	public static int anInt2077;
	public static int anInt2078;
	public static int anInt2079;
	public static int anInt2080;
	public static int anInt2081;
	public static int anInt2082;
	public static int anInt2083;
	public static int anInt2084;
	public static int anInt2085;
	public static int anInt2086;
	public static int anInt2087;
	public static int anInt2088;
	public static int anInt2090;
	public static int anInt2091;
	public static int anInt2092;
	public static int anInt2093;
	public static int anInt2094;
	public static int anInt2095;
	public static int anInt2097;
	public static int anInt2098;
	public static int anInt2099;
	public static int anInt2100;
	public static int anInt2102;
	public static int anInt2103;
	public static int anInt2104;
	public static int anInt2105;
	public static int anInt2106;
	public static int anInt2107;
	public static int anInt2108;
	public static int anInt2109;
	public static int anInt2111;
	public static int anInt2112;
	public static int anInt2113;
	public static int anInt2114;
	static {
		anInt2085 = 0;
		aClass65_2073 = new Class65();
		aJagexString_2115 = JagexString.getRs2PreparedString(": ");
		aCRC32_2116 = new CRC32();
	}

	public static boolean method206(Class19 arg0, int arg1, Class19 arg2,
			Class4_Sub2_Sub1 arg3, Class19 arg4) {
		try {
			Class1.aClass4_Sub2_Sub1_64 = arg3;
			Class4_Sub7.aClass19_1956 = arg0;
			Class71.aClass19_1474 = arg4;
			Class61.aClass19_1202 = arg2;
			if (arg1 <= 26)
				aBoolean2066 = false;
			anInt2064++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.JB("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ','
					+ (arg4 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method217(int arg0) {
		try {
			aCRC32_2116 = null;
			aClass64_2096 = null;
			aJagexString_2115 = null;
			aJagexString_2101 = null;
			if (arg0 != 0)
				aCRC32_2116 = null;
			aClass65_2073 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.T("
					+ arg0 + ')');
		}
	}

	public static void method221(int arg0, int arg1) {
		anInt2078++;
		if ((arg1 ^ 0xffffffff) <= -1) {
			int i = Class82.anIntArray1712[arg1];
			int i_1_ = Class43.anIntArray885[arg1];
			if ((i ^ 0xffffffff) <= -2001)
				i -= 2000;
			int i_2_ = Class4_Sub1.anIntArray1862[arg1];
			int i_3_ = Class40.anIntArray789[arg1];
			if ((i ^ 0xffffffff) == -58) {
				Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i_2_]);
				if (class4_sub20_sub7_sub1_sub1 != null) {
					Class4_Sub20
							.method319(
									1,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
									class4_sub20_sub7_sub1_sub1.anIntArray3247[0],
									class4_sub20_sub7_sub1_sub1.anIntArray3248[0],
									1,
									0,
									false,
									2,
									0,
									arg0,
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
					Class28.anInt640 = 2;
					Class57.anInt1155 = Class37.anInt758;
					Class2.anInt96 = JagexException.anInt1729;
					Class72.anInt1492++;
					Class11.anInt331 = 0;
					Class66.aClass4_Sub11_Sub1_1328.method264(180, 126);
					Class66.aClass4_Sub11_Sub1_1328.method207(i_2_, 2018779304);
				}
			}
			if (i == 47) {
				Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_2_];
				if (class4_sub20_sub7_sub1_sub2 != null) {
					Class49.anInt993++;
					Class4_Sub20
							.method319(
									1,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
									class4_sub20_sub7_sub1_sub2.anIntArray3247[0],
									class4_sub20_sub7_sub1_sub2.anIntArray3248[0],
									1,
									0,
									false,
									2,
									0,
									arg0,
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
					Class2.anInt96 = JagexException.anInt1729;
					Class28.anInt640 = 2;
					Class57.anInt1155 = Class37.anInt758;
					Class11.anInt331 = 0;
					Class66.aClass4_Sub11_Sub1_1328.method264(43, 114);
					Class66.aClass4_Sub11_Sub1_1328.method224(arg0 + 13421,
							i_2_);
				}
			}
			if ((i ^ 0xffffffff) == -21) {
				Class4_Sub20_Sub4.anInt2844++;
				Class66.aClass4_Sub11_Sub1_1328.method264(159, -107);
				Class66.aClass4_Sub11_Sub1_1328.method244(116, i_3_);
				Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_1_);
				Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_2_);
				Class18.anInt475 = 0;
				Class46.rsInterface = Class4_Sub20.method322(true, i_3_);
				Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
			}
			if (i == 29) {
				Class66.aClass4_Sub11_Sub1_1328.method264(177, -61);
				Class66.aClass4_Sub11_Sub1_1328.method207(i_2_, 2018779304);
				Class4_Sub14.anInt2283++;
				Class66.aClass4_Sub11_Sub1_1328.method211(i_3_, -1387540232);
				Class66.aClass4_Sub11_Sub1_1328.method207(i_1_, 2018779304);
				Class18.anInt475 = 0;
				Class46.rsInterface = Class4_Sub20.method322(true, i_3_);
				Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
			}
			if ((i ^ 0xffffffff) == -5) {
				Class64.anInt1271++;
				Class66.aClass4_Sub11_Sub1_1328.method264(4, -108);
				Class66.aClass4_Sub11_Sub1_1328.method251(i_1_, (byte) 53);
				Class66.aClass4_Sub11_Sub1_1328.method207(i_2_, 2018779304);
				Class66.aClass4_Sub11_Sub1_1328.method244(98, i_3_);
				Class18.anInt475 = 0;
				Class46.rsInterface = Class4_Sub20.method322(true, i_3_);
				Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
			}
			if (i == 26) {
				Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i_2_]);
				if (class4_sub20_sub7_sub1_sub1 != null) {
					Class4_Sub20
							.method319(
									1,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
									class4_sub20_sub7_sub1_sub1.anIntArray3247[0],
									class4_sub20_sub7_sub1_sub1.anIntArray3248[0],
									1,
									0,
									false,
									2,
									0,
									0,
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
					Class2.anInt96 = JagexException.anInt1729;
					Class28.anInt640 = 2;
					Class57.anInt1155 = Class37.anInt758;
					Class4_Sub15.anInt2296++;
					Class11.anInt331 = 0;
					Class66.aClass4_Sub11_Sub1_1328.method264(181, arg0 + 110);
					Class66.aClass4_Sub11_Sub1_1328.method207(i_2_,
							arg0 + 2018779304);
				}
			}
			if ((i ^ 0xffffffff) == -11 || i == 1006)
				Class4_Sub20_Sub11.method484((byte) 45,
						Class18.aJagexStringArray462[arg1], i_2_, i_3_, i_1_);
			if (i == 5) {
				RSInterface class4_sub13 = Class54.method1012(i_3_, arg0 + -1,
						i_1_);
				if (class4_sub13 != null) {
					Class4_Sub20_Sub7_Sub5.method432(false);
					Class4_Sub20_Sub13.method586(
							Class68.method1092(arg0 + 14423,
									Class54.method1011(class4_sub13, -22389)),
							i_3_, i_1_, -95);
					Class4_Sub20_Sub1.anInt2734 = 0;
					Class82.aJagexString_1714 = Class4_Sub2_Sub4.method167(-86,
							class4_sub13);
					if (Class82.aJagexString_1714 == null)
						Class82.aJagexString_1714 = Class4_Sub20_Sub7_Sub6.aJagexString_3440;
					if (class4_sub13.aBoolean2178)
						Class5.aJagexString_194 = Class4_Sub24.method639(
								(new JagexString[] { (class4_sub13.aJagexString_2196),
										(Class4_Sub8.aJagexString_1971) }), -842);
					else
						Class5.aJagexString_194 = Class4_Sub24.method639(
								(new JagexString[] { Class50.aJagexString_1016,
										(class4_sub13.aJagexString_2202),
										(Class4_Sub8.aJagexString_1971) }), -842);
				}
			} else {
				if (i == 3) {
					Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_2_];
					if (class4_sub20_sub7_sub1_sub2 != null) {
						SceneGraph.anInt2498++;
						Class4_Sub20
								.method319(
										1,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
										class4_sub20_sub7_sub1_sub2.anIntArray3247[0],
										class4_sub20_sub7_sub1_sub2.anIntArray3248[0],
										1,
										0,
										false,
										2,
										0,
										0,
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
						Class57.anInt1155 = Class37.anInt758;
						Class11.anInt331 = 0;
						Class28.anInt640 = 2;
						Class2.anInt96 = JagexException.anInt1729;
						Class66.aClass4_Sub11_Sub1_1328.method264(51, arg0
								^ ~0x72);
						Class66.aClass4_Sub11_Sub1_1328.method218(-112, i_2_);
					}
				}
				if ((i ^ 0xffffffff) == -52)
					Class2.method43(123);
				if ((i ^ 0xffffffff) == -59) {
					Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_2_];
					if (class4_sub20_sub7_sub1_sub2 != null) {
						Class4_Sub1.anInt1864++;
						Class4_Sub20
								.method319(
										1,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
										class4_sub20_sub7_sub1_sub2.anIntArray3247[0],
										class4_sub20_sub7_sub1_sub2.anIntArray3248[0],
										1,
										0,
										false,
										2,
										0,
										0,
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
						Class28.anInt640 = 2;
						Class57.anInt1155 = Class37.anInt758;
						Class11.anInt331 = 0;
						Class2.anInt96 = JagexException.anInt1729;
						Class66.aClass4_Sub11_Sub1_1328.method264(129, arg0
								^ ~0x53);
						Class66.aClass4_Sub11_Sub1_1328.method224(
								arg0 ^ 0x346d, i_2_);
					}
				}
				if ((i ^ 0xffffffff) == -1003) {
					RSInterface class4_sub13 = Class4_Sub20.method322(true,
							i_3_);
					if (class4_sub13 == null
							|| class4_sub13.anIntArray2216[i_1_] < 100000) {
						Class66.aClass4_Sub11_Sub1_1328.method264(205,
								arg0 + 107);
						Class66.aClass4_Sub11_Sub1_1328.method207(i_2_,
								arg0 ^ 0x785420a8);
						Class73.anInt1496++;
					} else
						Class43.method955(
								(Class4_Sub24.method639(
										(new JagexString[] {
												Class74.method1168(
														arg0 ^ ~0x22,
														(class4_sub13.anIntArray2216[i_1_])),
												Class4_Sub20_Sub1.aJagexString_2733,
												(Class4_Sub23.method633(i_2_,
														(byte) -117).aJagexString_2991) }),
										-842)), Class4_Sub3.aJagexString_1895,
								(byte) 110, 0);
					Class18.anInt475 = 0;
					Class46.rsInterface = Class4_Sub20.method322(true,
							i_3_);
					Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
				}
				if ((i ^ 0xffffffff) == -35) {
					Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i_2_]);
					if (class4_sub20_sub7_sub1_sub1 != null) {
						Class4_Sub20
								.method319(
										1,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
										class4_sub20_sub7_sub1_sub1.anIntArray3247[0],
										class4_sub20_sub7_sub1_sub1.anIntArray3248[0],
										1,
										0,
										false,
										2,
										0,
										0,
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
						Class28.anInt640 = 2;
						Class11.anInt331 = 0;
						Class7.anInt233++;
						Class57.anInt1155 = Class37.anInt758;
						Class2.anInt96 = JagexException.anInt1729;
						Class66.aClass4_Sub11_Sub1_1328.method264(162, 122);
						Class66.aClass4_Sub11_Sub1_1328.method251(i_2_,
								(byte) 53);
					}
				}
				if ((i ^ 0xffffffff) == -23) {
					boolean bool = (Class4_Sub20
							.method319(
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
									i_3_,
									i_1_,
									0,
									0,
									false,
									2,
									0,
									0,
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
					if (!bool)
						bool = (Class4_Sub20
								.method319(
										1,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
										i_3_,
										i_1_,
										1,
										0,
										false,
										2,
										0,
										arg0,
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
					Class28.anInt640 = 2;
					Class6.anInt200++;
					Class2.anInt96 = JagexException.anInt1729;
					Class11.anInt331 = 0;
					Class57.anInt1155 = Class37.anInt758;
					Class66.aClass4_Sub11_Sub1_1328.method264(20, arg0 ^ ~0x4);
					Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_1_
							- -Class6.anInt217);
					Class66.aClass4_Sub11_Sub1_1328.method207(i_2_,
							arg0 ^ 0x785420a8);
					Class66.aClass4_Sub11_Sub1_1328.method224(arg0 + 13421,
							Class4_Sub20_Sub8.anInt2987 + i_3_);
				}
				if (i == 1005) {
					Class2.anInt96 = JagexException.anInt1729;
					Class28.anInt640 = 2;
					Class11.anInt331 = 0;
					Class57.anInt1155 = Class37.anInt758;
					Class82.anInt1718++;
					Class66.aClass4_Sub11_Sub1_1328.method264(97, -1);
					Class66.aClass4_Sub11_Sub1_1328.method218(-104,
							0x7fff & i_2_ >> 430998190);
				}
				if (i == 32) {
					Class4_Sub20_Sub9.anInt3022++;
					boolean bool = (Class4_Sub20
							.method319(
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
									i_3_,
									i_1_,
									0,
									0,
									false,
									2,
									0,
									0,
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
					if (!bool)
						bool = (Class4_Sub20
								.method319(
										1,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
										i_3_,
										i_1_,
										1,
										0,
										false,
										2,
										0,
										arg0,
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
					Class28.anInt640 = 2;
					Class2.anInt96 = JagexException.anInt1729;
					Class11.anInt331 = 0;
					Class57.anInt1155 = Class37.anInt758;
					Class66.aClass4_Sub11_Sub1_1328.method264(216, -47);
					Class66.aClass4_Sub11_Sub1_1328.method207(i_2_, 2018779304);
					Class66.aClass4_Sub11_Sub1_1328.method218(60,
							Class4_Sub20_Sub8.anInt2987 + i_3_);
					Class66.aClass4_Sub11_Sub1_1328.method251(Class6.anInt217
							+ i_1_, (byte) 53);
				}
				if (i == 1) {
					Class34.anInt1757++;
					boolean bool = (Class4_Sub20
							.method319(
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
									i_3_,
									i_1_,
									0,
									0,
									false,
									2,
									0,
									0,
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
					if (!bool)
						bool = (Class4_Sub20
								.method319(
										1,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
										i_3_,
										i_1_,
										1,
										0,
										false,
										2,
										0,
										0,
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
					Class57.anInt1155 = Class37.anInt758;
					Class2.anInt96 = JagexException.anInt1729;
					Class28.anInt640 = 2;
					Class11.anInt331 = 0;
					Class66.aClass4_Sub11_Sub1_1328.method264(144, -59);
					Class66.aClass4_Sub11_Sub1_1328.method207(i_1_
							+ Class6.anInt217, arg0 ^ 0x785420a8);
					Class66.aClass4_Sub11_Sub1_1328.method207(i_2_, 2018779304);
					Class66.aClass4_Sub11_Sub1_1328.method218(55, i_3_
							- -Class4_Sub20_Sub8.anInt2987);
				}
				if ((i ^ 0xffffffff) == -7) {
					boolean bool = (Class4_Sub20
							.method319(
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
									i_3_,
									i_1_,
									0,
									0,
									false,
									2,
									0,
									0,
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
					AppletListener.anInt1453++;
					if (!bool)
						bool = (Class4_Sub20
								.method319(
										1,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
										i_3_,
										i_1_,
										1,
										0,
										false,
										2,
										0,
										0,
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
					Class2.anInt96 = JagexException.anInt1729;
					Class57.anInt1155 = Class37.anInt758;
					Class11.anInt331 = 0;
					Class28.anInt640 = 2;
					Class66.aClass4_Sub11_Sub1_1328.method264(255, 116);
					Class66.aClass4_Sub11_Sub1_1328.method207(i_2_, 2018779304);
					Class66.aClass4_Sub11_Sub1_1328.method224(13421,
							Class6.anInt217 + i_1_);
					Class66.aClass4_Sub11_Sub1_1328.method207(
							Class4_Sub20_Sub8.anInt2987 + i_3_,
							arg0 ^ 0x785420a8);
				}
				if ((i ^ 0xffffffff) == -51) {
					Class4_Sub20_Sub7_Sub5.method432(false);
					RSInterface class4_sub13 = Class4_Sub20.method322(true,
							i_3_);
					Class35.anInt730 = i_2_;
					Class57.anInt1142 = i_3_;
					Class43.anInt887 = i_1_;
					Class4_Sub20_Sub1.anInt2734 = 1;
					Class67.method1088(class4_sub13, 0);
					Class62.aJagexString_1239 = Class4_Sub24
							.method639(
									(new JagexString[] {
											Class62.aJagexString_1230,
											(Class4_Sub23.method633(i_2_,
													(byte) -109).aJagexString_2991),
											(Class4_Sub8.aJagexString_1971) }),
									arg0 + -842);
					if (Class62.aJagexString_1239 == null)
						Class62.aJagexString_1239 = Class4_Sub24.aJagexString_2448;
				} else {
					if (i == 12) {
						Class4_Sub20_Sub8.anInt2960++;
						Class25.method798(i_2_, i_3_, i_1_, 0);
						Class66.aClass4_Sub11_Sub1_1328.method264(44, -46);
						Class66.aClass4_Sub11_Sub1_1328.method224(13421,
								i_2_ >> 1921194254 & 0x7fff);
						Class66.aClass4_Sub11_Sub1_1328.method207(
								Class6.anInt217 + i_1_, 2018779304);
						Class66.aClass4_Sub11_Sub1_1328.method224(
								arg0 ^ 0x346d, Class4_Sub20_Sub8.anInt2987
										+ i_3_);
					}
					if (i == 28) {
						Class66.aClass4_Sub11_Sub1_1328.method264(215, -88);
						Class54.anInt1091++;
						Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_1_);
						Class66.aClass4_Sub11_Sub1_1328.method244(98, i_3_);
						Class66.aClass4_Sub11_Sub1_1328.method224(arg0 + 13421,
								i_2_);
						Class18.anInt475 = 0;
						Class46.rsInterface = Class4_Sub20.method322(
								true, i_3_);
						Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
					}
					if (i == 35)
						Class4_Sub20_Sub7_Sub6.aClass69_3439.method1139(
								Class82.anInt1711, i_1_, i_3_);
					if ((i ^ 0xffffffff) == -1004) {
						Class12.anInt356++;
						Class25.method798(i_2_, i_3_, i_1_, 0);
						Class66.aClass4_Sub11_Sub1_1328.method264(250, 108);
						Class66.aClass4_Sub11_Sub1_1328.method218(-107, i_3_
								- -Class4_Sub20_Sub8.anInt2987);
						Class66.aClass4_Sub11_Sub1_1328.method207(
								(0x1fffc6b3 & i_2_) >> 551356174, 2018779304);
						Class66.aClass4_Sub11_Sub1_1328.method207(i_1_
								+ Class6.anInt217, 2018779304);
					}
					if ((i ^ 0xffffffff) == -39) {
						Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_2_]);
						if (class4_sub20_sub7_sub1_sub2 != null) {
							Class64.anInt1264++;
							Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											class4_sub20_sub7_sub1_sub2.anIntArray3247[0],
											class4_sub20_sub7_sub1_sub2.anIntArray3248[0],
											1,
											0,
											false,
											2,
											0,
											arg0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
							Class2.anInt96 = JagexException.anInt1729;
							Class11.anInt331 = 0;
							Class28.anInt640 = 2;
							Class57.anInt1155 = Class37.anInt758;
							Class66.aClass4_Sub11_Sub1_1328.method264(69, -83);
							Class66.aClass4_Sub11_Sub1_1328.method207(
									Class4_Sub20_Sub11.anInt3088, 2018779304);
							Class66.aClass4_Sub11_Sub1_1328.method236(181,
									Class4_Sub20.anInt2357);
							Class66.aClass4_Sub11_Sub1_1328.method207(i_2_,
									2018779304);
						}
					}
					if (i == 42) {
						boolean bool = (Class4_Sub20
								.method319(
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
										i_3_,
										i_1_,
										0,
										0,
										false,
										2,
										0,
										0,
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
						if (!bool)
							bool = (Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											i_3_,
											i_1_,
											1,
											0,
											false,
											2,
											0,
											0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
						Class28.anInt640 = 2;
						Class57.anInt1155 = Class37.anInt758;
						Class4_Sub20_Sub17.anInt3203++;
						Class2.anInt96 = JagexException.anInt1729;
						Class11.anInt331 = 0;
						Class66.aClass4_Sub11_Sub1_1328.method264(221, 126);
						Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_2_);
						Class66.aClass4_Sub11_Sub1_1328.method224(arg0 + 13421,
								Class4_Sub20_Sub8.anInt2987 + i_3_);
						Class66.aClass4_Sub11_Sub1_1328.method251(
								Class6.anInt217 + i_1_, (byte) 53);
					}
					if ((i ^ 0xffffffff) == -15) {
						Class25.method798(i_2_, i_3_, i_1_, arg0);
						Class66.anInt1327++;
						Class66.aClass4_Sub11_Sub1_1328.method264(120, -99);
						Class66.aClass4_Sub11_Sub1_1328.method207(i_3_
								- -Class4_Sub20_Sub8.anInt2987, 2018779304);
						Class66.aClass4_Sub11_Sub1_1328.method218(-8,
								i_2_ >> 618647726 & 0x7fff);
						Class66.aClass4_Sub11_Sub1_1328.method218(56, i_1_
								- -Class6.anInt217);
					}
					if ((i ^ 0xffffffff) == -31) {
						Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i_2_]);
						if (class4_sub20_sub7_sub1_sub1 != null) {
							Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											class4_sub20_sub7_sub1_sub1.anIntArray3247[0],
											class4_sub20_sub7_sub1_sub1.anIntArray3248[0],
											1,
											0,
											false,
											2,
											0,
											0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
							Class28.anInt640 = 2;
							Class2.anInt96 = JagexException.anInt1729;
							Class57.anInt1155 = Class37.anInt758;
							Class11.anInt331 = 0;
							Class4_Sub20_Sub15.anInt3153++;
							Class66.aClass4_Sub11_Sub1_1328.method264(27, -77);
							Class66.aClass4_Sub11_Sub1_1328.method251(
									Class35.anInt730, (byte) 53);
							Class66.aClass4_Sub11_Sub1_1328.method224(13421,
									i_2_);
							Class66.aClass4_Sub11_Sub1_1328.method207(
									Class43.anInt887, 2018779304);
							Class66.aClass4_Sub11_Sub1_1328.method244(
									arg0 ^ 0x61, Class57.anInt1142);
						}
					}
					if ((i ^ 0xffffffff) == -40) {
						Class66.aClass4_Sub11_Sub1_1328.method264(88, 107);
						Class66.aClass4_Sub11_Sub1_1328.method244(96, i_3_);
						Class30.anInt657++;
						Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_2_);
						Class66.aClass4_Sub11_Sub1_1328.method251(i_1_,
								(byte) 53);
						Class18.anInt475 = 0;
						Class46.rsInterface = Class4_Sub20.method322(
								true, i_3_);
						Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
					}
					if (i == 41) {
						Class4_Sub8.anInt1967++;
						Class66.aClass4_Sub11_Sub1_1328.method264(212, -44);
						Class66.aClass4_Sub11_Sub1_1328.method211(i_3_,
								-1387540232);
						Class66.aClass4_Sub11_Sub1_1328.method251(i_1_,
								(byte) 53);
						Class66.aClass4_Sub11_Sub1_1328.method224(
								arg0 ^ 0x346d, i_2_);
						Class18.anInt475 = 0;
						Class46.rsInterface = Class4_Sub20.method322(
								true, i_3_);
						Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
					}
					if (i == 33) {
						Class1.anInt73++;
						Class66.aClass4_Sub11_Sub1_1328.method264(153, -92);
						Class66.aClass4_Sub11_Sub1_1328.method236(arg0 ^ 0xb5,
								i_3_);
						RSInterface class4_sub13 = Class4_Sub20.method322(
								true, i_3_);
						if (class4_sub13.anIntArrayArray2134 != null
								&& (class4_sub13.anIntArrayArray2134[0][0] ^ 0xffffffff) == -6) {
							int i_4_ = class4_sub13.anIntArrayArray2134[0][1];
							if ((Class31.anIntArray687[i_4_] ^ 0xffffffff) != (class4_sub13.anIntArray2166[0] ^ 0xffffffff)) {
								Class31.anIntArray687[i_4_] = class4_sub13.anIntArray2166[0];
								Region.method65(i_4_, arg0 ^ 0x2);
							}
						}
					}
					if ((i ^ 0xffffffff) == -10) {
						anInt2082++;
						boolean bool = (Class4_Sub20
								.method319(
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
										i_3_,
										i_1_,
										0,
										0,
										false,
										2,
										0,
										arg0,
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
						if (!bool)
							bool = (Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											i_3_,
											i_1_,
											1,
											0,
											false,
											2,
											0,
											0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
						Class11.anInt331 = 0;
						Class28.anInt640 = 2;
						Class2.anInt96 = JagexException.anInt1729;
						Class57.anInt1155 = Class37.anInt758;
						Class66.aClass4_Sub11_Sub1_1328.method264(152, 127);
						Class66.aClass4_Sub11_Sub1_1328.method236(181,
								Class57.anInt1142);
						Class66.aClass4_Sub11_Sub1_1328.method218(-13, i_1_
								- -Class6.anInt217);
						Class66.aClass4_Sub11_Sub1_1328.method251(
								Class43.anInt887, (byte) 53);
						Class66.aClass4_Sub11_Sub1_1328.method251(i_2_,
								(byte) 53);
						Class66.aClass4_Sub11_Sub1_1328.method218(-99,
								Class35.anInt730);
						Class66.aClass4_Sub11_Sub1_1328.method207(
								Class4_Sub20_Sub8.anInt2987 + i_3_, 2018779304);
					}
					if (i == 7) {
						Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i_2_]);
						if (class4_sub20_sub7_sub1_sub1 != null) {
							Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											class4_sub20_sub7_sub1_sub1.anIntArray3247[0],
											class4_sub20_sub7_sub1_sub1.anIntArray3248[0],
											1,
											0,
											false,
											2,
											0,
											0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
							Class11.anInt331 = 0;
							Class57.anInt1155 = Class37.anInt758;
							Class2.anInt96 = JagexException.anInt1729;
							Class28.anInt640 = 2;
							Class66.aClass4_Sub11_Sub1_1328.method264(123, 120);
							Class66.aClass4_Sub11_Sub1_1328
									.method224(arg0 ^ 0x346d,
											Class4_Sub20_Sub11.anInt3088);
							Class66.aClass4_Sub11_Sub1_1328.method251(i_2_,
									(byte) 53);
							Class66.aClass4_Sub11_Sub1_1328.method244(94,
									Class4_Sub20.anInt2357);
							Class5.anInt182++;
						}
					}
					if (arg0 != 0)
						aClass64_2096 = null;
					if (i == 21) {
						Class4_Sub20_Sub17.anInt3204++;
						Class66.aClass4_Sub11_Sub1_1328.method264(86, 117);
						Class66.aClass4_Sub11_Sub1_1328.method224(
								arg0 ^ 0x346d, i_1_);
						Class66.aClass4_Sub11_Sub1_1328.method207(i_2_,
								2018779304);
						Class66.aClass4_Sub11_Sub1_1328.method230(false, i_3_);
						Class18.anInt475 = 0;
						Class46.rsInterface = Class4_Sub20.method322(
								true, i_3_);
						Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
					}
					if ((i ^ 0xffffffff) == -16
							&& Class25.method798(i_2_, i_3_, i_1_, 0)) {
						Class66.aClass4_Sub11_Sub1_1328.method264(103, -25);
						Class66.aClass4_Sub11_Sub1_1328.method218(74,
								Class4_Sub20_Sub8.anInt2987 + i_3_);
						Class66.aClass4_Sub11_Sub1_1328.method207(
								Class43.anInt887, 2018779304);
						Class66.aClass4_Sub11_Sub1_1328.method251(i_1_
								+ Class6.anInt217, (byte) 53);
						Class66.aClass4_Sub11_Sub1_1328.method230(false,
								Class57.anInt1142);
						Class66.aClass4_Sub11_Sub1_1328.method218(arg0 + 52,
								Class35.anInt730);
						Region.anInt117++;
						Class66.aClass4_Sub11_Sub1_1328.method224(13421,
								i_2_ >> 559792750 & 0x7fff);
					}
					if (i == 1001) {
						Class2.anInt96 = JagexException.anInt1729;
						Class28.anInt640 = 2;
						Class57.anInt1155 = Class37.anInt758;
						Class11.anInt331 = 0;
						Class66.aClass4_Sub11_Sub1_1328.method264(205, 112);
						Class73.anInt1496++;
						Class66.aClass4_Sub11_Sub1_1328.method207(i_2_,
								arg0 + 2018779304);
					}
					if (i == 44) {
						Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_2_]);
						if (class4_sub20_sub7_sub1_sub2 != null) {
							Class4_Sub20_Sub7_Sub4.anInt3364++;
							Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											class4_sub20_sub7_sub1_sub2.anIntArray3247[0],
											class4_sub20_sub7_sub1_sub2.anIntArray3248[0],
											1,
											0,
											false,
											2,
											0,
											0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
							Class2.anInt96 = JagexException.anInt1729;
							Class11.anInt331 = 0;
							Class28.anInt640 = 2;
							Class57.anInt1155 = Class37.anInt758;
							Class66.aClass4_Sub11_Sub1_1328.method264(19, -31);
							Class66.aClass4_Sub11_Sub1_1328.method251(i_2_,
									(byte) 53);
						}
					}
					if (i == 8) {
						Class66.aClass4_Sub11_Sub1_1328.method264(153,
								arg0 ^ 0x7e);
						Class1.anInt73++;
						Class66.aClass4_Sub11_Sub1_1328.method236(181, i_3_);
						RSInterface class4_sub13 = Class4_Sub20.method322(
								true, i_3_);
						if (class4_sub13.anIntArrayArray2134 != null
								&& (class4_sub13.anIntArrayArray2134[0][0] ^ 0xffffffff) == -6) {
							int i_5_ = class4_sub13.anIntArrayArray2134[0][1];
							Class31.anIntArray687[i_5_] = -Class31.anIntArray687[i_5_] + 1;
							Region.method65(i_5_, arg0 ^ 0x2);
						}
					}
					if (i == 19 && RSInterface.aClass4_Sub13_2141 == null) {
						Class78.method1195(i_1_, i_3_, false);
						RSInterface.aClass4_Sub13_2141 = Class54.method1012(
								i_3_, -1, i_1_);
						Class67.method1088(RSInterface.aClass4_Sub13_2141, 0);
					}
					if ((i ^ 0xffffffff) == -50) {
						Class4_Sub20_Sub8.anInt3004++;
						Class66.aClass4_Sub11_Sub1_1328.method264(142, -109);
						Class66.aClass4_Sub11_Sub1_1328.method207(
								Class4_Sub20_Sub11.anInt3088, 2018779304);
						Class66.aClass4_Sub11_Sub1_1328.method211(i_3_, arg0
								^ ~0x52b42f07);
						Class66.aClass4_Sub11_Sub1_1328.method211(
								Class4_Sub20.anInt2357, -1387540232);
						Class66.aClass4_Sub11_Sub1_1328.method207(i_1_,
								2018779304);
					}
					if (i == 11) {
						boolean bool = (Class4_Sub20
								.method319(
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
										i_3_,
										i_1_,
										0,
										0,
										false,
										2,
										0,
										0,
										0,
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
						Class4_Sub20_Sub7_Sub3.anInt3339++;
						if (!bool)
							bool = (Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											i_3_,
											i_1_,
											1,
											0,
											false,
											2,
											0,
											0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
						Class11.anInt331 = 0;
						Class57.anInt1155 = Class37.anInt758;
						Class2.anInt96 = JagexException.anInt1729;
						Class28.anInt640 = 2;
						Class66.aClass4_Sub11_Sub1_1328.method264(63, 117);
						Class66.aClass4_Sub11_Sub1_1328.method218(-103,
								Class4_Sub20_Sub11.anInt3088);
						Class66.aClass4_Sub11_Sub1_1328.method236(arg0 ^ 0xb5,
								Class4_Sub20.anInt2357);
						Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_3_
								+ Class4_Sub20_Sub8.anInt2987);
						Class66.aClass4_Sub11_Sub1_1328.method218(-111,
								Class6.anInt217 + i_1_);
						Class66.aClass4_Sub11_Sub1_1328.method207(i_2_,
								2018779304);
					}
					if ((i ^ 0xffffffff) == -26
							&& Class25.method798(i_2_, i_3_, i_1_, 0)) {
						Class25.anInt580++;
						Class66.aClass4_Sub11_Sub1_1328.method264(207, 3);
						Class66.aClass4_Sub11_Sub1_1328.method251(i_3_
								+ Class4_Sub20_Sub8.anInt2987, (byte) 53);
						Class66.aClass4_Sub11_Sub1_1328.method251(
								Class6.anInt217 + i_1_, (byte) 53);
						Class66.aClass4_Sub11_Sub1_1328.method244(96,
								Class4_Sub20.anInt2357);
						Class66.aClass4_Sub11_Sub1_1328.method207(
								(i_2_ & 0x1ffff1c5) >> -1850884178,
								arg0 + 2018779304);
						Class66.aClass4_Sub11_Sub1_1328.method224(13421,
								Class4_Sub20_Sub11.anInt3088);
					}
					if ((i ^ 0xffffffff) == -32) {
						Class13.anInt374++;
						Class66.aClass4_Sub11_Sub1_1328.method264(220, -65);
						Class66.aClass4_Sub11_Sub1_1328.method218(arg0 ^ 0x66,
								i_2_);
						Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_1_);
						Class66.aClass4_Sub11_Sub1_1328.method236(181, i_3_);
						Class18.anInt475 = 0;
						Class46.rsInterface = Class4_Sub20.method322(
								true, i_3_);
						Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
					}
					if ((i ^ 0xffffffff) == -24) {
						Class66.aClass4_Sub11_Sub1_1328.method264(166, -103);
						Class66.aClass4_Sub11_Sub1_1328.method224(13421,
								Class43.anInt887);
						Class33.anInt704++;
						Class66.aClass4_Sub11_Sub1_1328.method207(i_1_,
								2018779304);
						Class66.aClass4_Sub11_Sub1_1328.method251(i_2_,
								(byte) 53);
						Class66.aClass4_Sub11_Sub1_1328.method230(false,
								Class57.anInt1142);
						Class66.aClass4_Sub11_Sub1_1328.method244(103, i_3_);
						Class66.aClass4_Sub11_Sub1_1328.method218(-98,
								Class35.anInt730);
						Class18.anInt475 = 0;
						Class46.rsInterface = Class4_Sub20.method322(
								true, i_3_);
						Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
					}
					if ((i ^ 0xffffffff) == -17) {
						Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i_2_]);
						if (class4_sub20_sub7_sub1_sub1 != null) {
							Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											class4_sub20_sub7_sub1_sub1.anIntArray3247[0],
											class4_sub20_sub7_sub1_sub1.anIntArray3248[0],
											1,
											0,
											false,
											2,
											0,
											0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
							Class11.anInt331 = 0;
							Class4_Sub20_Sub15.anInt3156++;
							Class28.anInt640 = 2;
							Class57.anInt1155 = Class37.anInt758;
							Class2.anInt96 = JagexException.anInt1729;
							Class66.aClass4_Sub11_Sub1_1328.method264(114, 111);
							Class66.aClass4_Sub11_Sub1_1328.method207(i_2_,
									arg0 ^ 0x785420a8);
						}
					}
					if (i == 37) {
						Class8.anInt248++;
						Class66.aClass4_Sub11_Sub1_1328.method264(101, -113);
						Class66.aClass4_Sub11_Sub1_1328.method211(i_3_, arg0
								+ -1387540232);
						Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_1_);
						Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_2_);
						Class18.anInt475 = 0;
						Class46.rsInterface = Class4_Sub20.method322(
								true, i_3_);
						Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
					}
					if (i == 45) {
						Class66.anInt1317++;
						Class66.aClass4_Sub11_Sub1_1328.method264(247, -68);
						Class66.aClass4_Sub11_Sub1_1328.method230(false, i_3_);
						Class66.aClass4_Sub11_Sub1_1328.method218(-98, i_2_);
						Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_1_);
						Class18.anInt475 = 0;
						Class46.rsInterface = Class4_Sub20.method322(
								true, i_3_);
						Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
					}
					if (i == 24) {
						RSInterface class4_sub13 = Class4_Sub20.method322(
								true, i_3_);
						boolean bool = true;
						if (class4_sub13.anInt2227 > 0)
							bool = RSFont.method71(arg0 + -124, class4_sub13);
						if (bool) {
							Class1.anInt73++;
							Class66.aClass4_Sub11_Sub1_1328.method264(153, 115);
							Class66.aClass4_Sub11_Sub1_1328.method236(
									arg0 ^ 0xb5, i_3_);
						}
					}
					if (i == 48) {
						Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i_2_]);
						if (class4_sub20_sub7_sub1_sub1 != null) {
							Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											class4_sub20_sub7_sub1_sub1.anIntArray3247[0],
											class4_sub20_sub7_sub1_sub1.anIntArray3248[0],
											1,
											0,
											false,
											2,
											0,
											0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
							Class2.anInt96 = JagexException.anInt1729;
							RSFont.anInt141++;
							Class11.anInt331 = 0;
							Class57.anInt1155 = Class37.anInt758;
							Class28.anInt640 = 2;
							Class66.aClass4_Sub11_Sub1_1328.method264(117,
									arg0 ^ 0x6e);
							Class66.aClass4_Sub11_Sub1_1328.method218(-100,
									i_2_);
						}
					}
					if (i == 17) {
						Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i_2_]);
						if (class4_sub20_sub7_sub1_sub1 != null) {
							Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											class4_sub20_sub7_sub1_sub1.anIntArray3247[0],
											class4_sub20_sub7_sub1_sub1.anIntArray3248[0],
											1,
											0,
											false,
											2,
											0,
											0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
							Class67.anInt1339++;
							Class28.anInt640 = 2;
							Class2.anInt96 = JagexException.anInt1729;
							Class57.anInt1155 = Class37.anInt758;
							Class11.anInt331 = 0;
							Class66.aClass4_Sub11_Sub1_1328.method264(183,
									arg0 + 117);
							Class66.aClass4_Sub11_Sub1_1328.method251(i_2_,
									(byte) 53);
						}
					}
					if (i == 40) {
						Class66.aClass4_Sub11_Sub1_1328.method264(163, 125);
						Class66.aClass4_Sub11_Sub1_1328.method251(i_2_,
								(byte) 53);
						Class62.anInt1234++;
						Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_1_);
						Class66.aClass4_Sub11_Sub1_1328.method251(
								Class4_Sub20_Sub11.anInt3088, (byte) 53);
						Class66.aClass4_Sub11_Sub1_1328.method230(false, i_3_);
						Class66.aClass4_Sub11_Sub1_1328.method244(114,
								Class4_Sub20.anInt2357);
						Class18.anInt475 = 0;
						Class46.rsInterface = Class4_Sub20.method322(
								true, i_3_);
						Class4_Sub20_Sub7_Sub6.anInt3443 = i_1_;
					}
					if (i == 18) {
						Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i_2_]);
						if (class4_sub20_sub7_sub1_sub1 != null) {
							Class73.anInt1500++;
							Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											class4_sub20_sub7_sub1_sub1.anIntArray3247[0],
											class4_sub20_sub7_sub1_sub1.anIntArray3248[0],
											1,
											0,
											false,
											2,
											0,
											arg0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
							Class28.anInt640 = 2;
							Class11.anInt331 = 0;
							Class57.anInt1155 = Class37.anInt758;
							Class2.anInt96 = JagexException.anInt1729;
							Class66.aClass4_Sub11_Sub1_1328.method264(1, arg0
									+ -84);
							Class66.aClass4_Sub11_Sub1_1328
									.method218(-21, i_2_);
						}
					}
					if ((i ^ 0xffffffff) == -47) {
						Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_2_]);
						if (class4_sub20_sub7_sub1_sub2 != null) {
							Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											class4_sub20_sub7_sub1_sub2.anIntArray3247[0],
											class4_sub20_sub7_sub1_sub2.anIntArray3248[0],
											1,
											0,
											false,
											2,
											0,
											arg0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
							Class11.anInt331 = 0;
							Class28.anInt640 = 2;
							Class27.anInt626++;
							Class57.anInt1155 = Class37.anInt758;
							Class2.anInt96 = JagexException.anInt1729;
							Class66.aClass4_Sub11_Sub1_1328
									.method264(187, -123);
							Class66.aClass4_Sub11_Sub1_1328.method236(
									arg0 ^ 0xb5, Class57.anInt1142);
							Class66.aClass4_Sub11_Sub1_1328
									.method218(-98, i_2_);
							Class66.aClass4_Sub11_Sub1_1328.method207(
									Class35.anInt730, 2018779304);
							Class66.aClass4_Sub11_Sub1_1328.method207(
									Class43.anInt887, 2018779304);
						}
					}
					if (i == 1004) {
						Class2.anInt96 = JagexException.anInt1729;
						Class57.anInt1155 = Class37.anInt758;
						Class11.anInt331 = 0;
						Class28.anInt640 = 2;
						Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_2_]);
						if (class4_sub20_sub7_sub1_sub2 != null) {
							Class4_Sub20_Sub3 class4_sub20_sub3 = (class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617);
							if (class4_sub20_sub3.anIntArray2832 != null)
								class4_sub20_sub3 = class4_sub20_sub3
										.method354((byte) 104);
							if (class4_sub20_sub3 != null) {
								Class53.anInt1085++;
								Class66.aClass4_Sub11_Sub1_1328.method264(176,
										120);
								Class66.aClass4_Sub11_Sub1_1328.method251(
										class4_sub20_sub3.anInt2820, (byte) 53);
							}
						}
					}
					if ((i ^ 0xffffffff) == -44) {
						Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_2_]);
						if (class4_sub20_sub7_sub1_sub2 != null) {
							Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											class4_sub20_sub7_sub1_sub2.anIntArray3247[0],
											class4_sub20_sub7_sub1_sub2.anIntArray3248[0],
											1,
											0,
											false,
											2,
											0,
											0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
							Class49.anInt996++;
							Class2.anInt96 = JagexException.anInt1729;
							Class28.anInt640 = 2;
							Class57.anInt1155 = Class37.anInt758;
							Class11.anInt331 = 0;
							Class66.aClass4_Sub11_Sub1_1328.method264(156, -35);
							Class66.aClass4_Sub11_Sub1_1328.method218(
									arg0 ^ 0x2f, i_2_);
						}
					}
					if ((i ^ 0xffffffff) == -3) {
						Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i_2_]);
						if (class4_sub20_sub7_sub1_sub1 != null) {
							Class4_Sub10.anInt2038++;
							Class4_Sub20
									.method319(
											1,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
											class4_sub20_sub7_sub1_sub1.anIntArray3247[0],
											class4_sub20_sub7_sub1_sub1.anIntArray3248[0],
											1,
											0,
											false,
											2,
											0,
											arg0,
											0,
											(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0]));
							Class11.anInt331 = 0;
							Class28.anInt640 = 2;
							Class2.anInt96 = JagexException.anInt1729;
							Class57.anInt1155 = Class37.anInt758;
							Class66.aClass4_Sub11_Sub1_1328.method264(84,
									arg0 + 120);
							Class66.aClass4_Sub11_Sub1_1328.method207(i_2_,
									2018779304);
						}
					}
					if (i == 36) {
						Class25.method798(i_2_, i_3_, i_1_, 0);
						Class72.anInt1488++;
						Class66.aClass4_Sub11_Sub1_1328.method264(119, 113);
						Class66.aClass4_Sub11_Sub1_1328.method207(
								Class6.anInt217 + i_1_, 2018779304);
						Class66.aClass4_Sub11_Sub1_1328.method251(
								(i_2_ & 0x1fffd509) >> 1268673358, (byte) 53);
						Class66.aClass4_Sub11_Sub1_1328.method251(i_3_
								- -Class4_Sub20_Sub8.anInt2987, (byte) 53);
					}
					if ((i ^ 0xffffffff) == -14) {
						Class25.method798(i_2_, i_3_, i_1_, 0);
						Class4_Sub17.anInt2330++;
						Class66.aClass4_Sub11_Sub1_1328.method264(127, arg0
								+ -23);
						Class66.aClass4_Sub11_Sub1_1328.method218(-108,
								0x7fff & i_2_ >> -977817042);
						Class66.aClass4_Sub11_Sub1_1328.method218(arg0 + 51,
								i_3_ + Class4_Sub20_Sub8.anInt2987);
						Class66.aClass4_Sub11_Sub1_1328.method224(13421, i_1_
								- -Class6.anInt217);
					}
					if ((Class4_Sub20_Sub1.anInt2734 ^ 0xffffffff) != -1) {
						Class4_Sub20_Sub1.anInt2734 = 0;
						Class67.method1088(
								Class4_Sub20.method322(true, Class57.anInt1142),
								0);
					}
					if (Class4_Sub23.aBoolean2421)
						Class4_Sub20_Sub7_Sub5.method432(false);
					if (Class46.rsInterface != null
							&& (Class18.anInt475 ^ 0xffffffff) == -1)
						Class67.method1088(Class46.rsInterface, 0);
				}
			}
		}
	}

	public static void method246(byte arg0) {
		anInt2075++;
		while (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method262((byte) 24,
				Class4_Sub20_Sub15.anInt3157) >= 11) {
			int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
					-1432215741, 11);
			if ((i ^ 0xffffffff) == -2048)
				break;
			boolean bool = false;
			if (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i] == null) {
				bool = true;
				Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i] = new Class4_Sub20_Sub7_Sub1_Sub1();
				if (Class25.aClass4_Sub11Array575[i] != null)
					Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i]
							.method391(1, Class25.aClass4_Sub11Array575[i]);
			}
			Class4_Sub23.anIntArray2432[Class4_Sub20_Sub7_Sub6.anInt3431++] = i;
			Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i]);
			class4_sub20_sub7_sub1_sub1.anInt3256 = Region.anInt134;
			int i_9_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
					-1432215741, 5);
			if ((i_9_ ^ 0xffffffff) < -16)
				i_9_ -= 32;
			int i_10_ = (Class34.anIntArray1763[Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method266(-1432215741, 3)]);
			if (bool)
				class4_sub20_sub7_sub1_sub1.anInt3217 = class4_sub20_sub7_sub1_sub1.anInt3219 = i_10_;
			int i_11_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
					-1432215741, 1);
			int i_12_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
					-1432215741, 1);
			if ((i_12_ ^ 0xffffffff) == -2)
				Class48.anIntArray979[JagexException.anInt1726++] = i;
			int i_13_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
					-1432215741, 5);
			if ((i_13_ ^ 0xffffffff) < -16)
				i_13_ -= 32;
			class4_sub20_sub7_sub1_sub1
					.method385(
							(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])
									- -i_13_,
							i_11_ == 1,
							128,
							i_9_
									+ (Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]));
		}
		Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method274((byte) 56);
		if (arg0 <= 69)
			method246((byte) -32);
	}

	public static void method257(int arg0, Region arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, Class69 arg9) {
		try {
			anInt2095++;
			int i = Class4_Sub23.anIntArrayArrayArray2416[arg5][arg8][arg2];
			int i_21_ = Class4_Sub23.anIntArrayArrayArray2416[arg5][arg8 - -1][arg2];
			int i_22_ = (Class4_Sub23.anIntArrayArrayArray2416[arg5][arg8 - -1][1 + arg2]);
			int i_23_ = Class4_Sub23.anIntArrayArrayArray2416[arg5][arg8][1 + arg2];
			Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(true, arg4);
			int i_24_ = (1073741824 + ((arg2 << -2107600025) + arg8) + (arg4 << -1252001074));
			if ((class4_sub20_sub1.anInt2726 ^ 0xffffffff) == -1)
				i_24_ += -2147483648;
			int i_25_ = i_23_ + (i_22_ + i) - -i_21_ >> 1798042498;
			int i_26_ = (arg0 << 189273926) + arg6;
			if ((class4_sub20_sub1.anInt2747 ^ 0xffffffff) == -2)
				i_26_ += 256;
			if (arg6 == 22) {
				Class4_Sub20_Sub7 class4_sub20_sub7;
				if ((class4_sub20_sub1.anInt2709 ^ 0xffffffff) != 0
						|| class4_sub20_sub1.anIntArray2732 != null)
					class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(arg4, 22,
							arg0, i, i_21_, i_22_, i_23_,
							(class4_sub20_sub1.anInt2709), true, null);
				else
					class4_sub20_sub7 = class4_sub20_sub1.method326(i_21_, 22,
							arg0, i_22_, i_23_, false, i);
				arg9.method1134(arg3, arg8, arg2, i_25_, class4_sub20_sub7,
						i_24_, i_26_);
				if ((class4_sub20_sub1.anInt2741 ^ 0xffffffff) == -2)
					arg1.method55((byte) 121, arg2, arg8);
			} else if ((arg6 ^ 0xffffffff) == -11 || arg6 == 11) {
				Class4_Sub20_Sub7 class4_sub20_sub7;
				if (class4_sub20_sub1.anInt2709 == -1
						&& class4_sub20_sub1.anIntArray2732 == null)
					class4_sub20_sub7 = class4_sub20_sub1.method326(i_21_, 10,
							arg0, i_22_, i_23_, false, i);
				else
					class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(arg4, 10,
							arg0, i, i_21_, i_22_, i_23_,
							(class4_sub20_sub1.anInt2709), true, null);
				if (class4_sub20_sub7 != null) {
					int i_27_;
					int i_28_;
					if ((arg0 ^ 0xffffffff) == -2 || arg0 == 3) {
						i_27_ = class4_sub20_sub1.anInt2744;
						i_28_ = class4_sub20_sub1.anInt2725;
					} else {
						i_27_ = class4_sub20_sub1.anInt2725;
						i_28_ = class4_sub20_sub1.anInt2744;
					}
					int i_29_ = 0;
					if ((arg6 ^ 0xffffffff) == -12)
						i_29_ += 256;
					arg9.method1129(arg3, arg8, arg2, i_25_, i_27_, i_28_,
							class4_sub20_sub7, i_29_, i_24_, i_26_);
				}
				if ((class4_sub20_sub1.anInt2741 ^ 0xffffffff) != -1)
					arg1.method60(arg2, 2, class4_sub20_sub1.aBoolean2698,
							class4_sub20_sub1.anInt2744, arg0,
							class4_sub20_sub1.anInt2725, arg8);
			} else if (arg6 >= 12) {
				Class4_Sub20_Sub7 class4_sub20_sub7;
				if ((class4_sub20_sub1.anInt2709 ^ 0xffffffff) != 0
						|| class4_sub20_sub1.anIntArray2732 != null)
					class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(arg4, arg6,
							arg0, i, i_21_, i_22_, i_23_,
							(class4_sub20_sub1.anInt2709), true, null);
				else
					class4_sub20_sub7 = class4_sub20_sub1.method326(i_21_,
							arg6, arg0, i_22_, i_23_, false, i);
				arg9.method1129(arg3, arg8, arg2, i_25_, 1, 1,
						class4_sub20_sub7, 0, i_24_, i_26_);
				if ((class4_sub20_sub1.anInt2741 ^ 0xffffffff) != -1)
					arg1.method60(arg2, arg7 + -529,
							class4_sub20_sub1.aBoolean2698,
							class4_sub20_sub1.anInt2744, arg0,
							class4_sub20_sub1.anInt2725, arg8);
			} else if (arg6 == 0) {
				Class4_Sub20_Sub7 class4_sub20_sub7;
				if (class4_sub20_sub1.anInt2709 != -1
						|| class4_sub20_sub1.anIntArray2732 != null)
					class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(arg4, 0,
							arg0, i, i_21_, i_22_, i_23_,
							(class4_sub20_sub1.anInt2709), true, null);
				else
					class4_sub20_sub7 = class4_sub20_sub1.method326(i_21_, 0,
							arg0, i_22_, i_23_, false, i);
				arg9.method1113(arg3, arg8, arg2, i_25_, class4_sub20_sub7,
						null, Class4_Sub20_Sub3.anIntArray2799[arg0], 0, i_24_,
						i_26_);
				if (class4_sub20_sub1.anInt2741 != 0)
					arg1.method52(class4_sub20_sub1.aBoolean2698, arg6, arg0,
							arg8, -118, arg2);
			} else if ((arg6 ^ 0xffffffff) == -2) {
				Class4_Sub20_Sub7 class4_sub20_sub7;
				if (class4_sub20_sub1.anInt2709 == -1
						&& class4_sub20_sub1.anIntArray2732 == null)
					class4_sub20_sub7 = class4_sub20_sub1.method326(i_21_, 1,
							arg0, i_22_, i_23_, false, i);
				else
					class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(arg4, 1,
							arg0, i, i_21_, i_22_, i_23_,
							(class4_sub20_sub1.anInt2709), true, null);
				arg9.method1113(arg3, arg8, arg2, i_25_, class4_sub20_sub7,
						null, Class4_Sub20_Sub11.anIntArray3076[arg0], 0,
						i_24_, i_26_);
				if (class4_sub20_sub1.anInt2741 != 0)
					arg1.method52(class4_sub20_sub1.aBoolean2698, arg6, arg0,
							arg8, -121, arg2);
			} else if (arg7 == 531) {
				if (arg6 == 2) {
					int i_30_ = 1 + arg0 & 0x3;
					Class4_Sub20_Sub7 class4_sub20_sub7;
					Class4_Sub20_Sub7 class4_sub20_sub7_31_;
					if (class4_sub20_sub1.anInt2709 != -1
							|| class4_sub20_sub1.anIntArray2732 != null) {
						class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(arg4, 2,
								arg0 + 4, i, i_21_, i_22_, i_23_,
								(class4_sub20_sub1.anInt2709), true, null);
						class4_sub20_sub7_31_ = new Class4_Sub20_Sub7_Sub6(
								arg4, 2, i_30_, i, i_21_, i_22_, i_23_,
								(class4_sub20_sub1.anInt2709), true, null);
					} else {
						class4_sub20_sub7 = class4_sub20_sub1.method326(i_21_,
								2, 4 - -arg0, i_22_, i_23_, false, i);
						class4_sub20_sub7_31_ = class4_sub20_sub1.method326(
								i_21_, 2, i_30_, i_22_, i_23_, false, i);
					}
					arg9.method1113(arg3, arg8, arg2, i_25_, class4_sub20_sub7,
							class4_sub20_sub7_31_,
							Class4_Sub20_Sub3.anIntArray2799[arg0],
							Class4_Sub20_Sub3.anIntArray2799[i_30_], i_24_,
							i_26_);
					if ((class4_sub20_sub1.anInt2741 ^ 0xffffffff) != -1)
						arg1.method52(class4_sub20_sub1.aBoolean2698, arg6,
								arg0, arg8, arg7 + -647, arg2);
				} else if ((arg6 ^ 0xffffffff) == -4) {
					Class4_Sub20_Sub7 class4_sub20_sub7;
					if (class4_sub20_sub1.anInt2709 != -1
							|| class4_sub20_sub1.anIntArray2732 != null)
						class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(arg4, 3,
								arg0, i, i_21_, i_22_, i_23_,
								(class4_sub20_sub1.anInt2709), true, null);
					else
						class4_sub20_sub7 = class4_sub20_sub1.method326(i_21_,
								3, arg0, i_22_, i_23_, false, i);
					arg9.method1113(arg3, arg8, arg2, i_25_, class4_sub20_sub7,
							null, Class4_Sub20_Sub11.anIntArray3076[arg0], 0,
							i_24_, i_26_);
					if ((class4_sub20_sub1.anInt2741 ^ 0xffffffff) != -1)
						arg1.method52(class4_sub20_sub1.aBoolean2698, arg6,
								arg0, arg8, -128, arg2);
				} else if ((arg6 ^ 0xffffffff) == -10) {
					Class4_Sub20_Sub7 class4_sub20_sub7;
					if ((class4_sub20_sub1.anInt2709 ^ 0xffffffff) == 0
							&& class4_sub20_sub1.anIntArray2732 == null)
						class4_sub20_sub7 = class4_sub20_sub1.method326(i_21_,
								arg6, arg0, i_22_, i_23_, false, i);
					else
						class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(arg4,
								arg6, arg0, i, i_21_, i_22_, i_23_,
								(class4_sub20_sub1.anInt2709), true, null);
					arg9.method1129(arg3, arg8, arg2, i_25_, 1, 1,
							class4_sub20_sub7, 0, i_24_, i_26_);
					if ((class4_sub20_sub1.anInt2741 ^ 0xffffffff) != -1)
						arg1.method60(arg2, 2, class4_sub20_sub1.aBoolean2698,
								class4_sub20_sub1.anInt2744, arg0,
								class4_sub20_sub1.anInt2725, arg8);
				} else {
					if (class4_sub20_sub1.aBoolean2697) {
						if ((arg0 ^ 0xffffffff) == -2) {
							int i_32_ = i_23_;
							i_23_ = i_22_;
							i_22_ = i_21_;
							i_21_ = i;
							i = i_32_;
						} else if (arg0 != 2) {
							if ((arg0 ^ 0xffffffff) == -4) {
								int i_33_ = i_23_;
								i_23_ = i;
								i = i_21_;
								i_21_ = i_22_;
								i_22_ = i_33_;
							}
						} else {
							int i_34_ = i_23_;
							i_23_ = i_21_;
							i_21_ = i_34_;
							i_34_ = i_22_;
							i_22_ = i;
							i = i_34_;
						}
					}
					if ((arg6 ^ 0xffffffff) == -5) {
						Class4_Sub20_Sub7 class4_sub20_sub7;
						if (class4_sub20_sub1.anInt2709 == -1
								&& class4_sub20_sub1.anIntArray2732 == null)
							class4_sub20_sub7 = class4_sub20_sub1.method326(
									i_21_, 4, 0, i_22_, i_23_, false, i);
						else
							class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
									arg4, 4, 0, i, i_21_, i_22_, i_23_,
									(class4_sub20_sub1.anInt2709), true, null);
						arg9.method1123(arg3, arg8, arg2, i_25_,
								class4_sub20_sub7,
								Class4_Sub20_Sub3.anIntArray2799[arg0],
								512 * arg0, 0, 0, i_24_, i_26_);
					} else if ((arg6 ^ 0xffffffff) == -6) {
						int i_35_ = 16;
						int i_36_ = arg9.method1126(arg3, arg8, arg2);
						if (i_36_ != 0)
							i_35_ = (Region.method56(true,
									0x7fff & i_36_ >> -44483410).anInt2750);
						Class4_Sub20_Sub7 class4_sub20_sub7;
						if (class4_sub20_sub1.anInt2709 != -1
								|| class4_sub20_sub1.anIntArray2732 != null)
							class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
									arg4, 4, 0, i, i_21_, i_22_, i_23_,
									(class4_sub20_sub1.anInt2709), true, null);
						else
							class4_sub20_sub7 = class4_sub20_sub1.method326(
									i_21_, 4, 0, i_22_, i_23_, false, i);
						arg9.method1123(arg3, arg8, arg2, i_25_,
								class4_sub20_sub7,
								Class4_Sub20_Sub3.anIntArray2799[arg0],
								512 * arg0,
								i_35_ * Class25.anIntArray587[arg0], i_35_
										* Class6.anIntArray205[arg0], i_24_,
								i_26_);
					} else if ((arg6 ^ 0xffffffff) == -7) {
						Class4_Sub20_Sub7 class4_sub20_sub7;
						if (class4_sub20_sub1.anInt2709 != -1
								|| class4_sub20_sub1.anIntArray2732 != null)
							class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
									arg4, 4, 0, i, i_21_, i_22_, i_23_,
									(class4_sub20_sub1.anInt2709), true, null);
						else
							class4_sub20_sub7 = class4_sub20_sub1.method326(
									i_21_, 4, 0, i_22_, i_23_, false, i);
						arg9.method1123(arg3, arg8, arg2, i_25_,
								class4_sub20_sub7, 256, arg0, 0, 0, i_24_,
								i_26_);
					} else if ((arg6 ^ 0xffffffff) == -8) {
						Class4_Sub20_Sub7 class4_sub20_sub7;
						if (class4_sub20_sub1.anInt2709 != -1
								|| class4_sub20_sub1.anIntArray2732 != null)
							class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
									arg4, 4, 0, i, i_21_, i_22_, i_23_,
									(class4_sub20_sub1.anInt2709), true, null);
						else
							class4_sub20_sub7 = class4_sub20_sub1.method326(
									i_21_, 4, 0, i_22_, i_23_, false, i);
						arg9.method1123(arg3, arg8, arg2, i_25_,
								class4_sub20_sub7, 512, arg0, 0, 0, i_24_,
								i_26_);
					} else if (arg6 == 8) {
						Class4_Sub20_Sub7 class4_sub20_sub7;
						if ((class4_sub20_sub1.anInt2709 ^ 0xffffffff) == 0
								&& class4_sub20_sub1.anIntArray2732 == null)
							class4_sub20_sub7 = class4_sub20_sub1.method326(
									i_21_, 4, 0, i_22_, i_23_, false, i);
						else
							class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
									arg4, 4, 0, i, i_21_, i_22_, i_23_,
									(class4_sub20_sub1.anInt2709), true, null);
						arg9.method1123(arg3, arg8, arg2, i_25_,
								class4_sub20_sub7, 768, arg0, 0, 0, i_24_,
								i_26_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.BC("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6
					+ ',' + arg7 + ',' + arg8 + ','
					+ (arg9 != null ? "{...}" : "null") + ')'));
		}
	}

	public byte[] byteBuffer;

	public int pointion;

	public StreamBuffer(byte[] data) {
		try {
			pointion = 0;
			byteBuffer = data;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("m.<init>(" + (data != null ? "{...}" : "null") + ')'));
		}
	}

	public StreamBuffer(int arg0) {
		try {
			pointion = 0;
			byteBuffer = Class72.method1160(-1, arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"m.<init>(" + arg0 + ')');
		}
	}

	public void method207(int arg0, int arg1) {
		try {
			if (arg1 != 2018779304)
				method242(-57);
			anInt2111++;
			byteBuffer[pointion++] = (byte) (arg0 >> 2018779304);
			byteBuffer[pointion++] = (byte) arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.TB("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public int getC() {
		try {
			return -byteBuffer[pointion++] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"Error with getC in: " + StreamBuffer.class.getName());
		}
	}

	public int method209(byte arg0) {
		try {
			if (arg0 >= -98)
				method257(-47, null, 97, 16, 50, 40, -107, 76, 42, null);
			anInt2072++;
			pointion += 2;
			return ((byteBuffer[-1 + pointion] & 0xff) + (byteBuffer[pointion
					+ -2] << -315536632 & 0xff00));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.V("
					+ arg0 + ')');
		}
	}

	public void method210(int arg0, int arg1) {
		try {
			anInt2112++;
			byteBuffer[pointion++] = (byte) (arg1 + -arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.UB("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method211(int arg0, int arg1) {
		try {
			byteBuffer[pointion++] = (byte) (arg0 >> -760978392);
			anInt2069++;
			byteBuffer[pointion++] = (byte) arg0;
			byteBuffer[pointion++] = (byte) (arg0 >> -1387540232);
			if (arg1 != -1387540232)
				aClass64_2096 = null;
			byteBuffer[pointion++] = (byte) (arg0 >> 1641445456);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.GC("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public JagexString method212(int arg0) {
		try {
			int i = pointion;
			if (arg0 < 70)
				aBoolean2066 = false;
			anInt2100++;
			while ((byteBuffer[pointion++] ^ 0xffffffff) != -1) {
				/* empty */
			}
			return Class61.method1046(-1 + -i + pointion, (byte) 73, i,
					byteBuffer);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.VA("
					+ arg0 + ')');
		}
	}

	public int method213(byte arg0) {
		try {
			if (arg0 > -11)
				method250(-118);
			pointion += 2;
			anInt2102++;
			return ((byteBuffer[-1 + pointion] << -1801742808 & 0xff00) + (0xff & byteBuffer[-2
					+ pointion]));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.JA("
					+ arg0 + ')');
		}
	}

	public int getSmart() {
		try {
			int i = 0xff & byteBuffer[pointion];
			anInt2113++;
			if ((i ^ 0xffffffff) <= -129)
				return -32768 + method209((byte) -102);
			return get();
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"Error with getSmart in: " + StreamBuffer.class.getName());
		}
	}

	public long readLong(byte arg0) {
		try {
			anInt2099++;
			long l = method219((byte) 73) & 0xffffffffL;
			long l_0_ = method219((byte) 73) & 0xffffffffL;
			if (arg0 != 33)
				aJagexString_2115 = null;
			return (l << -1181163488) - -l_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.CC("
					+ arg0 + ')');
		}
	}

	public int get() {
		try {
			anInt2052++;
			return byteBuffer[pointion++] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"Error with get in: " + StreamBuffer.class.getName());
		}
	}

	public void method218(int arg0, int arg1) {
		try {
			anInt2063++;
			byteBuffer[pointion++] = (byte) (arg1 >> -508699864);
			byteBuffer[pointion++] = (byte) (arg1 - -128);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.EC("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public int method219(byte arg0) {
		try {
			pointion += 4;
			anInt2087++;
			if (arg0 != 73)
				return -52;
			return ((0xff0000 & byteBuffer[pointion - 3] << 189354448) + ((~0xffffff & byteBuffer[pointion - 4] << 1162396728)
					+ ((0xff & byteBuffer[-2 + pointion]) << 716984520) + (byteBuffer[-1
					+ pointion] & 0xff)));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.QB("
					+ arg0 + ')');
		}
	}

	public void method220(byte[] arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg2 == 960052712) {
				for (int i = arg1 + arg3 + -1; (arg1 ^ 0xffffffff) >= (i ^ 0xffffffff); i--)
					arg0[i] = byteBuffer[pointion++];
				anInt2084++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.WB("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ')'));
		}
	}

	public int method222(boolean arg0) {
		try {
			if (arg0 != false)
				anInt2085 = -41;
			anInt2067++;
			pointion += 4;
			return (((0xff & byteBuffer[-3 + pointion]) << -739116824) + ((0xff0000 & byteBuffer[-2
					+ pointion] << -1421440464) + ((~0xffffff & byteBuffer[-1
					+ pointion] << 2049339992) + (byteBuffer[pointion - 4] & 0xff))));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.UA("
					+ arg0 + ')');
		}
	}

	public int method223(int arg0) {
		try {
			if (arg0 != 0)
				return -30;
			anInt2091++;
			pointion += 2;
			return ((0xff & -128 + byteBuffer[pointion + -1]) + (0xff00 & byteBuffer[-2
					+ pointion] << 37992360));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.CA("
					+ arg0 + ')');
		}
	}

	public void method224(int arg0, int arg1) {
		try {
			if (arg0 != 13421)
				method238((byte) 125);
			byteBuffer[pointion++] = (byte) arg1;
			anInt2059++;
			byteBuffer[pointion++] = (byte) (arg1 >> 1446702280);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.WA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method225(int arg0, byte arg1) {
		try {
			byteBuffer[pointion++] = (byte) (arg0 - -128);
			if (arg1 == 97)
				anInt2055++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.BA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public JagexString method226(byte arg0) {
		try {
			if (arg0 != 76)
				return null;
			anInt2104++;
			if ((byteBuffer[pointion] ^ 0xffffffff) == -1) {
				pointion++;
				return null;
			}
			return method212(arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.U("
					+ arg0 + ')');
		}
	}

	public void method227(byte arg0, int arg1) {
		byteBuffer[pointion++] = (byte) arg1;
		anInt2083++;
		if (arg0 != -27)
			readLong((byte) -64);
	}

	public int method228(int arg0) {
		try {
			anInt2077++;
			int i = byteBuffer[pointion++];
			int i_6_ = arg0;
			for (/**/; (i ^ 0xffffffff) > -1; i = byteBuffer[pointion++])
				i_6_ = (0x7f & i | i_6_) << 432199079;
			return i | i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.NA("
					+ arg0 + ')');
		}
	}

	public byte method229(int arg0) {
		try {
			anInt2105++;
			return byteBuffer[pointion++];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.S("
					+ arg0 + ')');
		}
	}

	public void method230(boolean arg0, int arg1) {
		try {
			byteBuffer[pointion++] = (byte) (arg1 >> 1910008400);
			byteBuffer[pointion++] = (byte) (arg1 >> 275834264);
			byteBuffer[pointion++] = (byte) arg1;
			anInt2107++;
			if (arg0 != false)
				aCRC32_2116 = null;
			byteBuffer[pointion++] = (byte) (arg1 >> -652404408);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.FA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method231(int arg0, int arg1) {
		try {
			anInt2108++;
			byteBuffer[pointion++] = (byte) (arg0 >> -653287184);
			byteBuffer[pointion++] = (byte) (arg0 >> 972296968);
			byteBuffer[pointion++] = (byte) arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.OA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method232(byte[] arg0, int arg1, byte arg2, int arg3) {
		try {
			anInt2088++;
			int i = arg1;
			if (arg2 == -104) {
				for (/**/; (i ^ 0xffffffff) > (arg1 + arg3 ^ 0xffffffff); i++)
					byteBuffer[pointion++] = arg0[i];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.O("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ')'));
		}
	}

	public void method233(BigInteger arg0, BigInteger arg1, int arg2) {
		try {
			if (arg2 != -25481)
				pointion = 98;
			anInt2093++;
			int i = pointion;
			byte[] is = new byte[i];
			pointion = 0;
			method253(0, (byte) -105, i, is);
			BigInteger biginteger = new BigInteger(is);
			BigInteger biginteger_7_ = biginteger;// .modPow(arg1, arg0);
			byte[] is_8_ = biginteger_7_.toByteArray();
			pointion = 0;
			method227((byte) -27, is_8_.length);
			method232(is_8_, 0, (byte) -104, is_8_.length);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.EA("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public int method234(int arg0, int arg1) {
		try {
			anInt2065++;
			int i = Class53.method1009((byte) -127, byteBuffer, arg0, pointion);
			if (arg1 != 1)
				return 91;
			method236(181, i);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.VB("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public int method235(byte arg0) {
		try {
			anInt2106++;
			pointion += 2;
			return (((0xff & byteBuffer[pointion - 1]) << 1159843944) + (0xff & byteBuffer[-2
					+ pointion] - 128));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.TA("
					+ arg0 + ')');
		}
	}

	public void method236(int arg0, int arg1) {
		try {
			anInt2056++;
			byteBuffer[pointion++] = (byte) (arg1 >> 622136184);
			byteBuffer[pointion++] = (byte) (arg1 >> 550550928);
			byteBuffer[pointion++] = (byte) (arg1 >> 545485064);
			if (arg0 != 181)
				method236(102, -54);
			byteBuffer[pointion++] = (byte) arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.QA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public int method237(int arg0) {
		try {
			anInt2054++;
			pointion += 4;
			return ((byteBuffer[pointion + -2] & 0xff)
					+ (((0xff & byteBuffer[-1 + pointion]) << 479365160) + ((byteBuffer[pointion - 3] & 0xff) << -1995013832)) + (0xff0000 & byteBuffer[-4
					+ pointion] << 2021760848));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.SA("
					+ arg0 + ')');
		}
	}

	public int method238(byte arg0) {
		try {
			pointion += 2;
			if (arg0 > -45)
				method207(-7, -42);
			anInt2103++;
			int i = ((byteBuffer[-1 + pointion] & 0xff) + ((0xff & byteBuffer[pointion
					+ -2]) << -1101684792));
			if ((i ^ 0xffffffff) < -32768)
				i -= 65536;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.HA("
					+ arg0 + ')');
		}
	}

	public int method239(byte arg0) {
		try {
			if (arg0 < 28)
				method236(30, -102);
			anInt2060++;
			return -128 + byteBuffer[pointion++] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.AB("
					+ arg0 + ')');
		}
	}

	public int method240(int arg0) {
		try {
			anInt2114++;
			if (arg0 != 32767)
				return -65;
			return 0xff & 128 - byteBuffer[pointion++];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.KA("
					+ arg0 + ')');
		}
	}

	public int method241(int arg0) {
		try {
			pointion += arg0;
			anInt2080++;
			return (((byteBuffer[pointion - 2] & 0xff) << 2127599416)
					- (-(byteBuffer[pointion + -1] << 967823088 & 0xff0000) - ((byteBuffer[-4
							+ pointion] & 0xff) << -1687385432)) + (0xff & byteBuffer[-3
					+ pointion]));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.IA("
					+ arg0 + ')');
		}
	}

	public byte method242(int arg0) {
		try {
			if (arg0 != 0)
				return (byte) -114;
			anInt2092++;
			return (byte) -byteBuffer[pointion++];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.FC("
					+ arg0 + ')');
		}
	}

	public void method243(int arg0, int arg1) {
		try {
			anInt2061++;
			if ((arg1 ^ 0xffffffff) <= -1 && arg1 < 128)
				method227((byte) -27, arg1);
			else if ((arg1 ^ 0xffffffff) <= -1 && (arg1 ^ 0xffffffff) > -32769)
				method207(32768 - -arg1, arg0 ^ 0x78541628);
			else {
				if (arg0 != 13952)
					method224(-12, 46);
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.NB("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method244(int arg0, int arg1) {
		try {
			anInt2074++;
			if (arg0 < 87)
				method224(-114, -102);
			byteBuffer[pointion++] = (byte) arg1;
			byteBuffer[pointion++] = (byte) (arg1 >> -313779192);
			byteBuffer[pointion++] = (byte) (arg1 >> -61734032);
			byteBuffer[pointion++] = (byte) (arg1 >> -1178496840);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.LB("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public byte method245(int arg0) {
		try {
			if (arg0 != 12605)
				pointion = 125;
			anInt2098++;
			return (byte) (128 - byteBuffer[pointion++]);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.AA("
					+ arg0 + ')');
		}
	}

	public void method247(int arg0, int arg1, int[] arg2, int arg3) {
		try {
			int i = pointion;
			int i_14_ = (arg3 - arg0) / 8;
			anInt2094++;
			pointion = arg0;
			for (int i_15_ = 0; i_14_ > i_15_; i_15_++) {
				int i_16_ = method219((byte) 73);
				int i_17_ = -957401312;
				int i_18_ = method219((byte) 73);
				int i_19_ = -1640531527;
				int i_20_ = 32;
				while (i_20_-- > 0) {
					i_18_ -= ((i_16_ << 175332292 ^ i_16_ >>> 617590501)
							+ i_16_ ^ (i_17_ + arg2[i_17_ >>> -1178540949
							& ~0x30fffffc]));
					i_17_ -= i_19_;
					i_16_ -= ((i_18_ << 1436977156 ^ i_18_ >>> -848638619) - -i_18_)
							^ arg2[i_17_ & 0x3] + i_17_;
				}
				pointion -= 8;
				method236(181, i_16_);
				method236(181, i_18_);
			}
			if (arg1 != 255)
				byteBuffer = null;
			pointion = i;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.DA("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public int method248(boolean arg0) {
		try {
			anInt2058++;
			pointion += 3;
			if (arg0 != false)
				aJagexString_2101 = null;
			return ((byteBuffer[pointion + -1] & 0xff) + ((0xff0000 & byteBuffer[-3
					+ pointion] << 609314768) + ((0xff & byteBuffer[pointion - 2]) << -970674840)));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.MA("
					+ arg0 + ')');
		}
	}

	public void method249(int arg0, int arg1) {
		try {
			if (arg1 != -22334)
				method260(-29);
			anInt2086++;
			byteBuffer[pointion - (arg0 + 4)] = (byte) (arg0 >> 785083640);
			byteBuffer[pointion - (arg0 + 3)] = (byte) (arg0 >> -1508303056);
			byteBuffer[-2 + pointion - arg0] = (byte) (arg0 >> -812178424);
			byteBuffer[-1 + pointion - arg0] = (byte) arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.AC("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public int method250(int arg0) {
		try {
			anInt2057++;
			if (arg0 != 0)
				return -61;
			pointion += 2;
			int i = (((0xff & byteBuffer[-1 + pointion]) << -1006873816) - -(0xff & byteBuffer[-2
					+ pointion]));
			if (i > 32767)
				i -= 65536;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.RB("
					+ arg0 + ')');
		}
	}

	public void method251(int arg0, byte arg1) {
		byteBuffer[pointion++] = (byte) (128 + arg0);
		byteBuffer[pointion++] = (byte) (arg0 >> 970760744);
		anInt2071++;
		if (arg1 != 53)
			aJagexString_2101 = null;
	}

	public int method252(int arg0) {
		try {
			pointion += 2;
			anInt2097++;
			if (arg0 != 23580)
				pointion = 88;
			int i = (((byteBuffer[-1 + pointion] & 0xff) << 1150759592) + (0xff & -128
					+ byteBuffer[pointion - 2]));
			if (i > 32767)
				i -= 65536;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.SB("
					+ arg0 + ')');
		}
	}

	public void method253(int arg0, byte arg1, int arg2, byte[] arg3) {
		try {
			for (int i = arg0; i < arg0 + arg2; i++)
				arg3[i] = byteBuffer[pointion++];
			if (arg1 >= -5)
				method240(-98);
			anInt2068++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.R("
					+ arg0 + ',' + arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method254(int arg0, byte arg1) {
		anInt2109++;
		if ((~0x7f & arg0) != 0) {
			if ((~0x3fff & arg0) != 0) {
				if ((arg0 & ~0x1fffff ^ 0xffffffff) != -1) {
					if ((arg0 & ~0xfffffff ^ 0xffffffff) != -1)
						method227((byte) -27, 0x80 | arg0 >>> -843683044);
					method227((byte) -27, 0x80 | arg0 >>> -190836939);
				}
				method227((byte) -27, arg0 >>> 161369646 | 0x80);
			}
			method227((byte) -27, arg0 >>> -1347969305 | 0x80);
		}
		method227((byte) -27, 0x7f & arg0);
		if (arg1 < 30)
			aJagexString_2115 = null;
	}

	public void method255(int arg0, long arg1) {
		try {
			anInt2090++;
			byteBuffer[pointion++] = (byte) (int) (arg1 >> -810024136);
			byteBuffer[pointion++] = (byte) (int) (arg1 >> -600474832);
			byteBuffer[pointion++] = (byte) (int) (arg1 >> 832291176);
			if (arg0 != 189354448)
				aBoolean2066 = true;
			byteBuffer[pointion++] = (byte) (int) (arg1 >> 1902473824);
			byteBuffer[pointion++] = (byte) (int) (arg1 >> 71101464);
			byteBuffer[pointion++] = (byte) (int) (arg1 >> 1758569936);
			byteBuffer[pointion++] = (byte) (int) (arg1 >> -1402663096);
			byteBuffer[pointion++] = (byte) (int) arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.OB("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method256(int arg0, long arg1) {
		do {
			try {
				anInt2070++;
				method244(125, (int) (arg1 >> 1918583904));
				method244(92, (int) arg1);
				if (arg0 == 1918583904)
					break;
				method218(-24, -60);
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
						("m.PB(" + arg0 + ',' + arg1 + ')'));
			}
			break;
		} while (false);
	}

	public void method258(int arg0, byte arg1) {
		byteBuffer[-arg0 + (pointion + -1)] = (byte) arg0;
		anInt2062++;
		if (arg1 <= 18)
			method226((byte) -3);
	}

	public void method259(JagexString arg0, int arg1) {
		try {
			anInt2076++;
			if (arg1 != 18601)
				pointion = -31;
			pointion += arg0.method821(arg0.method825(-114), pointion, true, 0,
					byteBuffer);
			byteBuffer[pointion++] = (byte) 0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("m.KB("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public int method260(int arg0) {
		try {
			anInt2053++;
			if (arg0 > -54)
				method219((byte) 15);
			int i = byteBuffer[pointion] & 0xff;
			if ((i ^ 0xffffffff) <= -129)
				return -49152 + method209((byte) -114);
			return get() - 64;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.Q("
					+ arg0 + ')');
		}
	}

	public byte method261(int arg0) {
		try {
			anInt2081++;
			if (arg0 >= -62)
				return (byte) -29;
			return (byte) (-128 + byteBuffer[pointion++]);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "m.HB("
					+ arg0 + ')');
		}
	}
}
