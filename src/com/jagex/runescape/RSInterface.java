package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class RSInterface extends RSFont {
	public static boolean aBoolean2203;
	public static JagexString aJagexString_2249 = JagexString.getRs2PreparedString(
			"Sichtbare Karte vorbereitet)3");
	public static RSInterface aClass4_Sub13_2141 = null;
	public static int anInt2131;
	public static int anInt2139;
	public static int anInt2157;
	public static int cameraZ;
	public static int anInt2184;
	public static int anInt2186 = 1;
	public static int anInt2191;
	public static int anInt2207;
	public static int anInt2209;
	public static int anInt2211;
	public static int anInt2217;
	public static int anInt2219;
	public static int anInt2239;
	public static int anInt2243;
	public static int anInt2254;
	public static int anInt2260;

	public static void method281(int arg0, byte arg1) {
		int i = 256;
		anInt2207++;
		Class4_Sub20_Sub7_Sub4.anInt3366 += arg0 * 128;
		if ((Class4_Sub20_Sub7_Sub4.anInt3366 ^ 0xffffffff) < (Class65.anIntArray1284.length ^ 0xffffffff)) {
			Class4_Sub20_Sub7_Sub4.anInt3366 -= Class65.anIntArray1284.length;
			int i_0_ = (int) (Math.random() * 12.0);
			Region.method58((byte) 126,
					Class81.aClass4_Sub20_Sub12_Sub1Array1709[i_0_]);
		}

		int i_1_ = 0;
		int i_2_ = (i - arg0) * 128;
		int i_3_ = arg0 * 128;

		for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_4_++) {

			int i_5_ = (Class76.anIntArray1565[i_1_ + i_3_] - ((Class65.anIntArray1284[(-1
					+ Class65.anIntArray1284.length & i_1_
					- -Class4_Sub20_Sub7_Sub4.anInt3366)])
					* arg0 / 6));
			if ((i_5_ ^ 0xffffffff) > -1)
				i_5_ = 0;
			Class76.anIntArray1565[i_1_++] = i_5_;
		}

		for (int i_6_ = -arg0 + i; (i ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {

			int i_7_ = i_6_ * 128;
			for (int i_8_ = 0; i_8_ < 128; i_8_++) {
				int i_9_ = (int) (Math.random() * 100.0);
				if (i_9_ < 50 && i_8_ > 10 && i_8_ < 118)
					Class76.anIntArray1565[i_8_ + i_7_] = 255;
				else
					Class76.anIntArray1565[i_8_ - -i_7_] = 0;
			}
		}

		if (Class48.anInt984 > 0)
			Class48.anInt984 -= 4 * arg0;
		if ((Class45.anInt923 ^ 0xffffffff) < -1)
			Class45.anInt923 -= 4 * arg0;
		if (Class45.anInt923 == 0 && (Class48.anInt984 ^ 0xffffffff) == -1) {
			int i_10_ = (int) ((2000 / arg0) * Math.random());
			if ((i_10_ ^ 0xffffffff) == -1)
				Class45.anInt923 = 1024;
			if ((i_10_ ^ 0xffffffff) == -2)
				Class48.anInt984 = 1024;
		}
		int i_11_ = 0;
		if (arg1 < 0) {

			for (/**/; i_11_ < i - arg0; i_11_++)
				RS2Font.anIntArray2771[i_11_] = RS2Font.anIntArray2771[i_11_
						+ arg0];
			for (int i_12_ = i - arg0; (i ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
				RS2Font.anIntArray2771[i_12_] = (int) (Math
						.sin(Class28.anInt633 / 14.0)
						* 16.0
						+ (14.0 * Math.sin(Class28.anInt633 / 15.0)) + (Math
						.sin(Class28.anInt633 / 16.0) * 12.0));
				Class28.anInt633++;
			}

			Class62.anInt1241 += arg0;
			int i_13_ = ((0x1 & Region.pulseCycle) + arg0) / 2;
			if ((i_13_ ^ 0xffffffff) < -1) {
				for (int i_14_ = 0; ((i_14_ ^ 0xffffffff) > (100 * Class62.anInt1241 ^ 0xffffffff)); i_14_++) {
					int i_15_ = (int) (128.0 * Math.random()) + 128;
					int i_16_ = (int) (124.0 * Math.random()) + 2;
					Class76.anIntArray1565[i_16_ + (i_15_ << 610069191)] = 192;
				}

				Class62.anInt1241 = 0;

				for (int i_17_ = 0; (i ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
					int i_18_ = i_17_ * 128;
					int i_19_ = 0;
					for (int i_20_ = -i_13_; (i_20_ ^ 0xffffffff) > -129; i_20_++) {
						if ((i_13_ + i_20_ ^ 0xffffffff) > -129)
							i_19_ += Class76.anIntArray1565[i_18_
									+ (i_20_ + i_13_)];
						if (-i_13_ - 1 + i_20_ >= 0)
							i_19_ -= Class76.anIntArray1565[i_20_
									+ (i_18_ + -1 + -i_13_)];
						if ((i_20_ ^ 0xffffffff) <= -1)
							Class4_Sub20_Sub17.anIntArray3206[i_20_ + i_18_] = i_19_
									/ (i_13_ * 2 + 1);
					}
				}

				for (int i_21_ = 0; i_21_ < 128; i_21_++) {
					int i_22_ = 0;
					for (int i_23_ = -i_13_; i > i_23_; i_23_++) {
						int i_24_ = i_23_ * 128;
						if (i_23_ + i_13_ < i)
							i_22_ += (Class4_Sub20_Sub17.anIntArray3206[i_21_ - -i_24_ - -(128 * i_13_)]);
						if ((~(-i_13_ + (-1 + i_23_))) <= -1)
							i_22_ -= (Class4_Sub20_Sub17.anIntArray3206[-128 + -(i_13_ * 128) + (i_24_ + i_21_)]);
						if ((~i_23_) <= -1)
							Class76.anIntArray1565[i_24_ + i_21_] = i_22_ / (2 * i_13_ + 1);
					}
				}
			}

		}
	}

	public static Class4_Sub23 method285(int arg0, byte arg1, Class19 arg2) {
		try {
			if (arg1 >= -66)
				return null;
			anInt2243++;
			byte[] is = arg2.method740(arg0, true);
			if (is == null)
				return null;
			return new Class4_Sub23(is);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("nc.A("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method291(int arg0) {
		try {
			aJagexString_2249 = null;
			aClass4_Sub13_2141 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "nc.F("
					+ arg0 + ')');
		}
	}

	public static int method293(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg2 != 1427931656)
				anInt2139 = -53;
			anInt2217++;
			int i = 256 - arg1;
			return (((0xff0000 & (arg3 & 0xff00) * arg1 + (0xff00 & arg0) * i) + (i
					* (arg0 & 0xff00ff) - -((arg3 & 0xff00ff) * arg1) & ~0xff00ff)) >> 1427931656);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("nc.I("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public boolean aBoolean2132 = false;
	public boolean aBoolean2159 = false;
	public boolean aBoolean2160;
	public boolean aBoolean2165;
	public boolean aBoolean2178;
	public boolean aBoolean2187;
	public boolean aBoolean2189;
	public boolean aBoolean2194;
	public boolean aBoolean2225;
	public boolean aBoolean2237;
	public boolean aBoolean2253;
	public boolean aBoolean2263;
	public JagexString aJagexString_2149;
	public JagexString aJagexString_2150;
	public JagexString aJagexString_2174;
	public JagexString aJagexString_2196;
	public JagexString aJagexString_2202;
	public JagexString aJagexString_2264;
	public JagexString[] aJagexStringArray2233;
	public JagexString[] aJagexStringArray2247;
	public RSInterface aClass4_Sub13_2205;
	public RSInterface[] aClass4_Sub13Array2215;
	public int anInt2136;
	public int anInt2137;
	public int anInt2138 = 0;
	public int anInt2140;
	public int anInt2142;
	public int anInt2143;
	public int anInt2146;
	public int anInt2147;
	public int anInt2148;
	public int anInt2151;
	public int anInt2153;
	public int anInt2154;
	public int anInt2156;
	public int anInt2161;
	public int anInt2162;
	public int anInt2163;
	public int anInt2168;
	public int anInt2170;
	public int anInt2171;
	public int anInt2172;
	public int anInt2173;
	public int anInt2175;
	public int anInt2181;
	public int anInt2183;
	public int anInt2185;
	public int anInt2190;
	public int anInt2192;
	public int anInt2193;
	public int anInt2195;
	public int anInt2197;
	public int anInt2198;
	public int anInt2199;
	public int anInt2201;
	public int anInt2206;
	public int anInt2208;
	public int anInt2210;
	public int anInt2212;
	public int anInt2213;
	public int anInt2214;
	public int anInt2218;
	public int anInt2224;
	public int anInt2226;
	public int anInt2227;
	public int anInt2228;
	public int anInt2229;
	public int anInt2231;
	public int anInt2232;
	public int anInt2235;
	public int anInt2236;
	public int anInt2238;
	public int anInt2240;
	public int anInt2241;
	public int anInt2245;
	public int anInt2246;
	public int anInt2248;
	public int anInt2250;
	public int anInt2256;
	public int anInt2258;
	public int anInt2262;
	public int anInt2266;
	public int[] anIntArray2144;
	public int[] anIntArray2166;
	public int[] anIntArray2177;
	public int[] items;
	public int[] itemAmounts;
	public int[] anIntArray2223;
	public int[] anIntArray2230;
	public int[] anIntArray2234;
	public int[] anIntArray2257;
	public int[] anIntArray2261;
	public int[][] anIntArrayArray2134;
	public Object[] anObjectArray2130;
	public Object[] anObjectArray2133;
	public Object[] anObjectArray2135;
	public Object[] anObjectArray2145;
	public Object[] anObjectArray2152;
	public Object[] anObjectArray2155;
	public Object[] anObjectArray2158;
	public Object[] anObjectArray2164;
	public Object[] anObjectArray2167;
	public Object[] anObjectArray2169;
	public Object[] anObjectArray2180;
	public Object[] anObjectArray2182;
	public Object[] anObjectArray2188;
	public Object[] anObjectArray2200;
	public Object[] anObjectArray2204;
	public Object[] anObjectArray2220;
	public Object[] anObjectArray2221;
	public Object[] anObjectArray2222;
	public Object[] anObjectArray2242;
	public Object[] anObjectArray2244;
	public Object[] anObjectArray2251;

	public Object[] anObjectArray2252;

	public Object[] anObjectArray2255;

	public Object[] anObjectArray2259;

	public Object[] anObjectArray2265;

	public RSInterface() {
		aJagexString_2150 = StringUtilities.aJagexString_3334;
		anInt2140 = 0;
		anInt2137 = 1;
		anInt2170 = -1;
		anInt2168 = 100;
		anInt2171 = 0;
		anInt2185 = 0;
		aJagexString_2149 = StringUtilities.aJagexString_3334;
		anInt2161 = 0;
		anInt2192 = 0;
		anInt2190 = 0;
		aBoolean2178 = false;
		aJagexString_2174 = StringUtilities.aJagexString_3334;
		aBoolean2165 = false;
		anInt2193 = -1;
		anInt2173 = -1;
		aJagexString_2202 = StringUtilities.aJagexString_3334;
		aJagexString_2196 = StringUtilities.aJagexString_3334;
		anInt2147 = -1;
		anInt2201 = 0;
		anInt2210 = -1;
		anInt2183 = -1;
		aBoolean2189 = false;
		anInt2151 = 0;
		aClass4_Sub13_2205 = null;
		anInt2199 = 1;
		aBoolean2225 = false;
		anInt2197 = 0;
		anInt2195 = 0;
		anInt2153 = 0;
		aBoolean2160 = false;
		anInt2206 = 0;
		anInt2227 = 0;
		anInt2156 = 0;
		anInt2224 = 0;
		anInt2236 = 0;
		anInt2214 = 0;
		anInt2229 = 0;
		anInt2232 = 0;
		anInt2136 = -1;
		anInt2241 = 0;
		anInt2218 = 0;
		anInt2246 = 0;
		anInt2231 = 0;
		anInt2198 = 0;
		anInt2162 = 0;
		anInt2213 = 0;
		anInt2228 = -1;
		anInt2248 = 0;
		aBoolean2237 = false;
		anInt2143 = 0;
		anInt2208 = 0;
		anInt2240 = -1;
		anInt2154 = 1;
		anInt2146 = -1;
		anInt2172 = -1;
		anInt2175 = 0;
		anInt2142 = 0;
		anInt2181 = 0;
		anInt2148 = 0;
		anInt2250 = -1;
		anInt2256 = 0;
		anInt2212 = 0;
		anInt2245 = 0;
		anInt2163 = -1;
		anInt2226 = -1;
		anInt2235 = -1;
		anInt2238 = 0;
		aBoolean2263 = false;
		anInt2262 = 0;
		aJagexString_2264 = Class50.aJagexString_1011;
		aBoolean2253 = false;
		anInt2266 = 0;
	}

    public static RSInterface forId(int id) { //forId maybe?
        try {
            int i = id >> 16;
            int i_20_ = 0xffff & id;
            if (Class28.aClass4_Sub13ArrayArray632[i] == null || Class28.aClass4_Sub13ArrayArray632[i][i_20_] == null) {
                boolean bool = Class4_Sub12.method277((byte) 116, i);
                if (!bool)
                    return null;
            }
            return Class28.aClass4_Sub13ArrayArray632[i][i_20_];
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, ("RSInterface.forId(" + id + ')'));
        }
    }

    public Class4_Sub20_Sub7_Sub7 method282(byte arg0, Class4_Sub20_Sub17 arg1,
			Class35 arg2, boolean arg3, int arg4) {
		try {
			anInt2260++;
			Class4_Sub20_Sub13.aBoolean3116 = false;
			int i_25_;
			int i_26_;
			if (arg3) {
				i_25_ = anInt2154;
				i_26_ = anInt2146;
			} else {
				i_25_ = anInt2137;
				i_26_ = anInt2250;
			}
			if (i_25_ == 0)
				return null;
			if (i_25_ == 1 && (i_26_ ^ 0xffffffff) == 0)
				return null;
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = ((Class4_Sub20_Sub7_Sub7) Region.aClass66_131
					.method1083(((i_25_ << 1812754480) + i_26_), true));
			if (class4_sub20_sub7_sub7 == null) {
				if (i_25_ == 1) {
					Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class4_Sub20_Sub7_Sub2
							.method399(Class58.aClass19_1165, i_26_, 0);
					if (class4_sub20_sub7_sub2 == null) {
						Class4_Sub20_Sub13.aBoolean3116 = true;
						return null;
					}
					class4_sub20_sub7_sub7 = class4_sub20_sub7_sub2.method411(
							64, 768, -50, -10, -50);
				}
				if (i_25_ == 2) {
					Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class71
							.method1155(-116, i_26_).method353(0);
					if (class4_sub20_sub7_sub2 == null) {
						Class4_Sub20_Sub13.aBoolean3116 = true;
						return null;
					}
					class4_sub20_sub7_sub7 = class4_sub20_sub7_sub2.method411(
							64, 768, -50, -10, -50);
				}
				if ((i_25_ ^ 0xffffffff) == -4) {
					if (arg2 == null)
						return null;
					Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = arg2
							.method903(0);
					if (class4_sub20_sub7_sub2 == null) {
						Class4_Sub20_Sub13.aBoolean3116 = true;
						return null;
					}
					class4_sub20_sub7_sub7 = class4_sub20_sub7_sub2.method411(
							64, 768, -50, -10, -50);
				}
				if ((i_25_ ^ 0xffffffff) == -5) {
					ItemDefinition itemDefinition = Class4_Sub23
							.method633(i_26_, (byte) -118);
					Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = itemDefinition
							.method474(10, 10);
					if (class4_sub20_sub7_sub2 == null) {
						Class4_Sub20_Sub13.aBoolean3116 = true;
						return null;
					}
					class4_sub20_sub7_sub7 = (class4_sub20_sub7_sub2.method411(
							64 + itemDefinition.ambient,
							itemDefinition.contrast + 768, -50, -10, -50));
				}
				Region.aClass66_131.method1082(true,
						((i_25_ << 1760011184) - -i_26_),
						class4_sub20_sub7_sub7);
			}
			if (arg1 != null)
				class4_sub20_sub7_sub7 = arg1.method613(class4_sub20_sub7_sub7,
						arg4, (byte) 114);
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("nc.K("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
					+ arg4 + ')'));
		}
	}

	public void method283(int arg0, Buffer arg1) {
		anInt2254++;
		aBoolean2178 = false;
		anInt2258 = arg1.get();
		anInt2171 = arg1.get();
		anInt2227 = arg1.readShort();
		anInt2192 = anInt2181 = arg1.method238((byte) -76);
		anInt2229 = anInt2212 = arg1.method238((byte) -114);
		anInt2156 = arg1.readShort();
		anInt2185 = arg1.readShort();
		anInt2266 = arg1.get();
		anInt2183 = arg1.readShort();
		if (anInt2183 == 65535)
			anInt2183 = -1;
		else
			anInt2183 = (anInt2172 & ~0xffff) - -anInt2183;
		anInt2136 = arg1.readShort();
		if ((anInt2136 ^ 0xffffffff) == -65536)
			anInt2136 = -1;
		int i = arg1.get();
		if ((i ^ 0xffffffff) < -1) {
			anIntArray2144 = new int[i];
			anIntArray2166 = new int[i];
			for (int i_27_ = 0; i_27_ < i; i_27_++) {
				anIntArray2144[i_27_] = arg1.get();
				anIntArray2166[i_27_] = arg1.readShort();
			}
		}
		int i_28_ = arg1.get();
		if ((i_28_ ^ 0xffffffff) < -1) {
			anIntArrayArray2134 = new int[i_28_][];
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
				int i_30_ = arg1.readShort();
				anIntArrayArray2134[i_29_] = new int[i_30_];
				for (int i_31_ = 0; (i_30_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++) {
					anIntArrayArray2134[i_29_][i_31_] = arg1
							.readShort();
					if (anIntArrayArray2134[i_29_][i_31_] == 65535)
						anIntArrayArray2134[i_29_][i_31_] = -1;
				}
			}
		}
		if ((anInt2258 ^ 0xffffffff) == -1) {
			anInt2206 = arg1.readShort();
			aBoolean2225 = (arg1.get() ^ 0xffffffff) == -2;
		}
		if ((anInt2258 ^ 0xffffffff) == -2) {
			arg1.readShort();
			arg1.get();
		}
		if ((anInt2258 ^ 0xffffffff) == -3) {
			items = new int[anInt2156 * anInt2185];
			itemAmounts = new int[anInt2156 * anInt2185];
			int i_32_ = arg1.get();
			if (i_32_ == 1)
				anInt2246 |= 0x10000000;
			int i_33_ = arg1.get();
			if ((i_33_ ^ 0xffffffff) == -2)
				anInt2246 |= 0x40000000;
			int i_34_ = arg1.get();
			if ((i_34_ ^ 0xffffffff) == -2)
				anInt2246 |= ~0x7fffffff;
			int i_35_ = arg1.get();
			if (i_35_ == 1)
				anInt2246 |= 0x20000000;
			anInt2190 = arg1.get();
			anInt2232 = arg1.get();
			anIntArray2177 = new int[20];
			anIntArray2223 = new int[20];
			anIntArray2257 = new int[20];
			for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > -21; i_36_++) {
				int i_37_ = arg1.get();
				if (i_37_ == 1) {
					anIntArray2223[i_36_] = arg1.method238((byte) -65);
					anIntArray2257[i_36_] = arg1.method238((byte) -117);
					anIntArray2177[i_36_] = arg1.readInt();
				} else
					anIntArray2177[i_36_] = -1;
			}
			aJagexStringArray2233 = new JagexString[5];
			for (int i_38_ = 0; i_38_ < 5; i_38_++) {
				JagexString jagexString = arg1.readString();
				if (jagexString.method825(arg0 ^ ~0x70) > 0) {
					aJagexStringArray2233[i_38_] = jagexString;
					anInt2246 |= 1 << i_38_ + 23;
				}
			}
		}
		if ((anInt2258 ^ 0xffffffff) == -4)
			aBoolean2165 = (arg1.get() ^ 0xffffffff) == -2;
		if (anInt2258 == 4 || (anInt2258 ^ 0xffffffff) == -2) {
			anInt2214 = arg1.get();
			anInt2262 = arg1.get();
			anInt2161 = arg1.get();
			anInt2170 = arg1.readShort();
			if ((anInt2170 ^ 0xffffffff) == -65536)
				anInt2170 = -1;
			aBoolean2159 = (arg1.get() ^ 0xffffffff) == -2;
		}
		if (anInt2258 == 4) {
			aJagexString_2150 = arg1.readString();
			aJagexString_2149 = arg1.readString();
		}
		if ((anInt2258 ^ 0xffffffff) == -2 || anInt2258 == 3
				|| (anInt2258 ^ 0xffffffff) == -5)
			anInt2195 = arg1.readInt();
		if (anInt2258 == 3 || (anInt2258 ^ 0xffffffff) == -5) {
			anInt2256 = arg1.readInt();
			anInt2197 = arg1.readInt();
			anInt2142 = arg1.readInt();
		}
		if (anInt2258 == 5) {
			anInt2147 = arg1.readInt();
			anInt2228 = arg1.readInt();
		}
		if ((anInt2258 ^ 0xffffffff) == -7) {
			anInt2137 = 1;
			anInt2250 = arg1.readShort();
			anInt2154 = 1;
			if ((anInt2250 ^ 0xffffffff) == -65536)
				anInt2250 = -1;
			anInt2146 = arg1.readShort();
			if (anInt2146 == 65535)
				anInt2146 = -1;
			anInt2210 = arg1.readShort();
			if ((anInt2210 ^ 0xffffffff) == -65536)
				anInt2210 = -1;
			anInt2173 = arg1.readShort();
			if (anInt2173 == 65535)
				anInt2173 = -1;
			anInt2168 = arg1.readShort();
			anInt2213 = arg1.readShort();
			anInt2236 = arg1.readShort();
		}
		if ((anInt2258 ^ 0xffffffff) == -8) {
			itemAmounts = new int[anInt2185 * anInt2156];
			items = new int[anInt2185 * anInt2156];
			anInt2214 = arg1.get();
			anInt2170 = arg1.readShort();
			if ((anInt2170 ^ 0xffffffff) == -65536)
				anInt2170 = -1;
			aBoolean2159 = arg1.get() == 1;
			anInt2195 = arg1.readInt();
			anInt2190 = arg1.method238((byte) -97);
			anInt2232 = arg1.method238((byte) -53);
			int i_39_ = arg1.get();
			if ((i_39_ ^ 0xffffffff) == -2)
				anInt2246 |= 0x40000000;
			aJagexStringArray2233 = new JagexString[5];
			for (int i_40_ = 0; i_40_ < 5; i_40_++) {
				JagexString jagexString = arg1.readString();
				if ((jagexString.method825(-114) ^ 0xffffffff) < -1) {
					aJagexStringArray2233[i_40_] = jagexString;
					anInt2246 |= 1 << 23 - -i_40_;
				}
			}
		}
		if (anInt2258 == 8)
			aJagexString_2150 = arg1.readString();
		if (anInt2171 == 2 || (anInt2258 ^ 0xffffffff) == -3) {
			aJagexString_2174 = arg1.readString();
			aJagexString_2202 = arg1.readString();
			int i_41_ = 0x3f & arg1.readShort();
			anInt2246 |= i_41_ << -340517109;
		}
		if ((anInt2171 ^ 0xffffffff) == -2 || (anInt2171 ^ 0xffffffff) == -5
				|| (anInt2171 ^ 0xffffffff) == -6 || anInt2171 == 6) {
			aJagexString_2264 = arg1.readString();
			if ((aJagexString_2264.method825(-112) ^ 0xffffffff) == -1) {
				if ((anInt2171 ^ 0xffffffff) == -2)
					aJagexString_2264 = Class50.aJagexString_1011;
				if (anInt2171 == 4)
					aJagexString_2264 = StringUtilities.aJagexString_586;
				if ((anInt2171 ^ 0xffffffff) == -6)
					aJagexString_2264 = StringUtilities.aJagexString_586;
				if ((anInt2171 ^ 0xffffffff) == -7)
					aJagexString_2264 = ItemDefinition.aJagexString_2967;
			}
		}
		if (arg0 == anInt2171 || anInt2171 == 4 || anInt2171 == 5)
			anInt2246 |= 0x400000;
		if (anInt2171 == 6)
			anInt2246 |= 0x1;
	}

	public int[] method284(boolean arg0, Buffer arg1) {
		try {
			anInt2184++;
			if (arg0 != false)
				method281(-61, (byte) 51);
			int i = arg1.get();
			if (i == 0)
				return null;
			int[] is = new int[i];
			for (int i_42_ = 0; i_42_ < i; i_42_++)
				is[i_42_] = arg1.readInt();
			return is;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("nc.M("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public ImageRGB method286(int arg0, boolean arg1) {
		try {
			Class4_Sub20_Sub13.aBoolean3116 = false;
			int i;
			if (arg1)
				i = anInt2228;
			else
				i = anInt2147;
			anInt2239++;
			if (i == -1)
				return null;
			long l = (((long) anInt2162 << -455131544)
					+ ((!aBoolean2194 ? 0L : 1L) << -234930969)
					+ ((!aBoolean2187 ? 0L : 1L) << -2021443098) + (i - -((long) anInt2201 << 1107163492)));
			ImageRGB imageRGB = ((ImageRGB) Class62.aClass66_1231
					.method1083(l, true));
			if (imageRGB != null)
				return imageRGB;
			imageRGB = Class4_Sub20.method321(0, i, -1,
					Class7.aClass19_234);
			if (imageRGB == null) {
				Class4_Sub20_Sub13.aBoolean3116 = true;
				return null;
			}
			if (aBoolean2187)
				imageRGB.method529();
			if (aBoolean2194)
				imageRGB.method536();
			if ((anInt2201 ^ 0xffffffff) < -1)
				imageRGB.method531(anInt2201);
			if (anInt2201 >= arg0)
				imageRGB.method537(1);
			if ((anInt2201 ^ 0xffffffff) <= -3)
				imageRGB.method537(16777215);
			if ((anInt2162 ^ 0xffffffff) != -1)
				imageRGB.method520(anInt2162);
			Class62.aClass66_1231.method1082(true, l, imageRGB);
			return imageRGB;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("nc.H("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method287(Buffer arg0, byte arg1) {
		try {
			arg0.get();
			anInt2191++;
			aBoolean2178 = true;
			anInt2258 = arg0.get();
			anInt2227 = arg0.readShort();
			anInt2192 = anInt2181 = arg0.method238((byte) -47);
			anInt2229 = anInt2212 = arg0.method238((byte) -49);
			anInt2156 = arg0.readShort();
			if (anInt2258 != 9)
				anInt2185 = arg0.readShort();
			else
				anInt2185 = arg0.method238((byte) -56);
			anInt2183 = arg0.readShort();
			if ((anInt2183 ^ 0xffffffff) == -65536)
				anInt2183 = -1;
			else
				anInt2183 = anInt2183 + (~0xffff & anInt2172);
			aBoolean2225 = (arg0.get() ^ 0xffffffff) == -2;
			if (anInt2258 == 0) {
				anInt2208 = arg0.readShort();
				anInt2206 = arg0.readShort();
			}
			if (anInt2258 == 5) {
				anInt2147 = arg0.readInt();
				anInt2218 = arg0.readShort();
				aBoolean2253 = (arg0.get() ^ 0xffffffff) == -2;
				anInt2266 = arg0.get();
				anInt2201 = arg0.get();
				anInt2162 = arg0.readInt();
				aBoolean2187 = (arg0.get() ^ 0xffffffff) == -2;
				aBoolean2194 = (arg0.get() ^ 0xffffffff) == -2;
			}
			if (arg1 >= 27) {
				if ((anInt2258 ^ 0xffffffff) == -7) {
					anInt2137 = 1;
					anInt2250 = arg0.readShort();
					if (anInt2250 == 65535)
						anInt2250 = -1;
					anInt2224 = arg0.method238((byte) -82);
					anInt2148 = arg0.method238((byte) -84);
					anInt2213 = arg0.readShort();
					anInt2236 = arg0.readShort();
					anInt2151 = arg0.readShort();
					anInt2168 = arg0.readShort();
					anInt2210 = arg0.readShort();
					if (anInt2210 == 65535)
						anInt2210 = -1;
					aBoolean2263 = (arg0.get() ^ 0xffffffff) == -2;
				}
				if (anInt2258 == 4) {
					anInt2170 = arg0.readShort();
					if ((anInt2170 ^ 0xffffffff) == -65536)
						anInt2170 = -1;
					aJagexString_2150 = arg0.readString();
					anInt2161 = arg0.get();
					anInt2214 = arg0.get();
					anInt2262 = arg0.get();
					aBoolean2159 = (arg0.get() ^ 0xffffffff) == -2;
					anInt2195 = arg0.readInt();
				}
				if (anInt2258 == 3) {
					anInt2195 = arg0.readInt();
					aBoolean2165 = (arg0.get() ^ 0xffffffff) == -2;
					anInt2266 = arg0.get();
				}
				if (anInt2258 == 9) {
					anInt2199 = arg0.get();
					anInt2195 = arg0.readInt();
				}
				anInt2246 = arg0.method248(false);
				aJagexString_2196 = arg0.readString();
				int i = arg0.get();
				if ((i ^ 0xffffffff) < -1) {
					aJagexStringArray2247 = new JagexString[i];
					for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > (i ^ 0xffffffff); i_43_++)
						aJagexStringArray2247[i_43_] = arg0.readString();
				}
				anInt2248 = arg0.get();
				anInt2198 = arg0.get();
				aBoolean2160 = (arg0.get() ^ 0xffffffff) == -2;
				aJagexString_2174 = arg0.readString();
				anObjectArray2242 = method290(arg0, (byte) 115);
				anObjectArray2265 = method290(arg0, (byte) 115);
				anObjectArray2182 = method290(arg0, (byte) 115);
				anObjectArray2152 = method290(arg0, (byte) 115);
				anObjectArray2158 = method290(arg0, (byte) 115);
				anObjectArray2259 = method290(arg0, (byte) 115);
				anObjectArray2155 = method290(arg0, (byte) 115);
				anObjectArray2188 = method290(arg0, (byte) 115);
				anObjectArray2200 = method290(arg0, (byte) 115);
				anObjectArray2145 = method290(arg0, (byte) 115);
				anObjectArray2222 = method290(arg0, (byte) 115);
				anObjectArray2167 = method290(arg0, (byte) 115);
				anObjectArray2221 = method290(arg0, (byte) 115);
				anObjectArray2252 = method290(arg0, (byte) 115);
				anObjectArray2220 = method290(arg0, (byte) 115);
				anObjectArray2135 = method290(arg0, (byte) 115);
				anObjectArray2164 = method290(arg0, (byte) 115);
				anObjectArray2169 = method290(arg0, (byte) 115);
				anIntArray2261 = method284(false, arg0);
				anIntArray2234 = method284(false, arg0);
				anIntArray2230 = method284(false, arg0);
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("nc.C("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public void method288(int arg0, int arg1, int arg2) {
		try {
			int i = items[arg2];
			anInt2209++;
			items[arg2] = items[arg0];
			items[arg0] = i;
			i = itemAmounts[arg2];
			if (arg1 != 21533)
				anInt2241 = 112;
			itemAmounts[arg2] = itemAmounts[arg0];
			itemAmounts[arg0] = i;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("nc.L("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public Class4_Sub20_Sub12_Sub4_Sub1 method289(int arg0) {
		try {
			anInt2131++;
			Class4_Sub20_Sub13.aBoolean3116 = false;
			if ((anInt2170 ^ 0xffffffff) == 0)
				return null;
			Class4_Sub20_Sub12_Sub4_Sub1 class4_sub20_sub12_sub4_sub1 = ((Class4_Sub20_Sub12_Sub4_Sub1) Game.aClass66_1844
					.method1083(anInt2170, true));
			if (class4_sub20_sub12_sub4_sub1 != null)
				return class4_sub20_sub12_sub4_sub1;
			class4_sub20_sub12_sub4_sub1 = Class4_Sub20_Sub4.method357(
					Class4_Sub2_Sub4.aClass19_2648, 4550, Class7.aClass19_234,
					anInt2170, arg0);
			if (class4_sub20_sub12_sub4_sub1 == null)
				Class4_Sub20_Sub13.aBoolean3116 = true;
			else
				Game.aClass66_1844.method1082(true, anInt2170,
						class4_sub20_sub12_sub4_sub1);
			return class4_sub20_sub12_sub4_sub1;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "nc.N("
					+ arg0 + ')');
		}
	}

	public Object[] method290(Buffer arg0, byte arg1) {
		try {
			anInt2219++;
			int i = arg0.get();
			if (i == 0)
				return null;
			if (arg1 != 115)
				return null;
			Object[] objects = new Object[i];
			for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > (i ^ 0xffffffff); i_44_++) {
				int i_45_ = arg0.get();
				if ((i_45_ ^ 0xffffffff) == -1)
					objects[i_44_] = arg0.readInt();
				else if ((i_45_ ^ 0xffffffff) == -2)
					objects[i_44_] = arg0.readString();
			}
			aBoolean2237 = true;
			return objects;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("nc.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public ImageRGB method292(int arg0, byte arg1) {
		try {
			anInt2157++;
			Class4_Sub20_Sub13.aBoolean3116 = false;
			if (arg0 < 0
					|| (anIntArray2177.length ^ 0xffffffff) >= (arg0 ^ 0xffffffff))
				return null;
			int i = anIntArray2177[arg0];
			if (i == -1)
				return null;
			if (arg1 != -107)
				return null;
			ImageRGB imageRGB = ((ImageRGB) Class62.aClass66_1231
					.method1083(i, true));
			if (imageRGB != null)
				return imageRGB;
			imageRGB = Class4_Sub20.method321(0, i, -1,
					Class7.aClass19_234);
			if (imageRGB != null)
				Class62.aClass66_1231.method1082(true, i,
						imageRGB);
			else
				Class4_Sub20_Sub13.aBoolean3116 = true;
			return imageRGB;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("nc.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method294(int arg0, int arg1, JagexString arg2) {
		try {
			if (aJagexStringArray2247 == null
					|| (aJagexStringArray2247.length ^ 0xffffffff) >= (arg1 ^ 0xffffffff)) {
				JagexString[] jagexStrings = new JagexString[1 + arg1];
				if (aJagexStringArray2247 != null) {
					for (int i = 0; ((i ^ 0xffffffff) > (aJagexStringArray2247.length ^ 0xffffffff)); i++)
						jagexStrings[i] = aJagexStringArray2247[i];
				}
				aJagexStringArray2247 = jagexStrings;
			}
			anInt2211++;
			if (arg0 != 1)
				method284(false, null);
			aJagexStringArray2247[arg1] = arg2;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("nc.J("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}
}
