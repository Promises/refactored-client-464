package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class58 {
	public static Class16 aClass16_1171;
	public static Class19 aClass19_1165;
	public static JagexString aJagexString_1157;
	public static JagexString aJagexString_1162;
	public static JagexString aJagexString_1166;
	public static JagexString aJagexString_1168 = JagexString.getRs2PreparedString(
			"Bitte warten Sie eine Minute");
	public static JagexString aJagexString_1172;
	public static JagexString aJagexString_1173;
	public static RSInterface aClass4_Sub13_1159;
	public static int anInt1156;
	public static int anInt1158;
    public static int anInt1161;
	public static int anInt1169;
	public static int anInt1170;
	public static int[] anIntArray1163 = new int[5];
	public static int[] removePlayers;
	public static int[] anIntArray1167 = new int[128];

	static {
		aJagexString_1162 = JagexString.getRs2PreparedString("Lade Konfiguration )2 "
        );
		aClass4_Sub13_1159 = null;
		aJagexString_1157 = JagexString.getRs2PreparedString("flash3:");
		anInt1161 = 0;
		removePlayers = new int[1000];
		aJagexString_1166 = aJagexString_1157;
		aJagexString_1172 = aJagexString_1157;
		aClass16_1171 = new Class16(4096);
		aJagexString_1173 = JagexString.getRs2PreparedString(
				"Ladevorgang )2 bitte warten Sie)3");
	}

	public static void method1029(int arg0) {
		try {
			aClass19_1165 = null;
			aJagexString_1157 = null;
			aJagexString_1172 = null;
			anIntArray1167 = null;
			removePlayers = null;
			if (arg0 == 4) {
				aJagexString_1168 = null;
				aJagexString_1162 = null;
				anIntArray1163 = null;
				aJagexString_1173 = null;
				aClass16_1171 = null;
				aJagexString_1166 = null;
				aClass4_Sub13_1159 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "qd.A("
					+ arg0 + ')');
		}
	}

	public static void method1030(int arg0, int arg1, Region[] arg2, int arg3,
			byte[] arg4, int arg5, int arg6) {
		try {
			anInt1156++;
			if (arg6 == 100) {
				for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
					for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -65; i_0_++) {
						for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -65; i_1_++) {
							if (i_0_ + arg0 > 0
									&& (i_0_ + arg0 ^ 0xffffffff) > -104
									&& arg1 + i_1_ > 0 && arg1 - -i_1_ < 103)
								arg2[i].clippingData[i_0_ + arg0][arg1 + i_1_] = Class59
										.method1035((arg2[i].clippingData[i_0_
												+ arg0][arg1 + i_1_]),
												-16777217);
						}
					}
				}
				Buffer class4_sub11 = new Buffer(arg4);
				for (int i = 0; i < 4; i++) {
					for (int i_2_ = 0; i_2_ < 64; i_2_++) {
						for (int i_3_ = 0; i_3_ < 64; i_3_++)
							Class82.method1217(i, arg0 + i_2_, arg1 + i_3_,
									class4_sub11, arg3, -105, arg5, 0);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("qd.B("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
					+ (arg4 != null ? "{...}" : "null") + ',' + arg5 + ','
					+ arg6 + ')'));
		}
	}

	public static void parseNpcUpdateMasks(int arg0) {
		try {
			anInt1169++;
			int i = 0;
			if (arg0 == -1) {
				for (/**/; ((JagexException.updatedPlayerCount ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
					int i_4_ = Class48.anIntArray979[i];
					Npc npc = Class57.npcs[i_4_];
					int i_5_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get();
					if ((i_5_ & 0x40) != 0) {
						int i_6_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method223(0); // readShortA()
						int i_7_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method239((byte) 122); // readByteA()
						if (i_6_ == 65535)
							i_6_ = -1;
						if (((i_6_ ^ 0xffffffff) == (npc.anInt3277 ^ 0xffffffff))
								&& (i_6_ ^ 0xffffffff) != 0) {
							int i_8_ = (Class68.method1093(i_6_, (byte) -113).anInt3191);
							if (i_8_ == 1) {
								npc.anInt3276 = 0;
								npc.anInt3233 = 0;
								npc.anInt3239 = 0;
								npc.anInt3222 = i_7_;
							}
							if ((i_8_ ^ 0xffffffff) == -3)
								npc.anInt3276 = 0;
						} else if ((i_6_ ^ 0xffffffff) == 0
								|| (npc.anInt3277 ^ 0xffffffff) == 0
								|| ((Class68.method1093(i_6_, (byte) -110).anInt3208) >= (Class68
										.method1093(
												(npc.anInt3277),
												(byte) -126).anInt3208))) {
							npc.anInt3277 = i_6_;
							npc.anInt3233 = 0;
							npc.anInt3276 = 0;
							npc.anInt3222 = i_7_;
							npc.anInt3239 = 0;
							npc.anInt3236 = npc.anInt3228;
						}
					}
					if ((i_5_ & 0x80 ^ 0xffffffff) != -1) {
						npc.aJagexString_3271 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.readString();
						npc.anInt3253 = 100;
					}
					if ((i_5_ & 0x8 ^ 0xffffffff) != -1) {
						npc.anInt3226 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.method213((byte) -117);
						int i_9_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.method241(4);
						if (npc.anInt3226 == 65535)
							npc.anInt3226 = -1;
						npc.anInt3242 = 0;
						npc.anInt3235 = Region.pulseCycle
								- -(i_9_ & 0xffff);
						if (npc.anInt3235 > Region.pulseCycle)
							npc.anInt3242 = -1;
						npc.anInt3241 = 0;
						npc.anInt3229 = i_9_ >> 460614160;
					}
					if ((0x1 & i_5_) != 0) {
						npc.anInt3292 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.method223(0);
						npc.anInt3231 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.readShort();
					}
					if ((i_5_ & 0x10 ^ 0xffffffff) != -1) {
						int i_10_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.readByteSubtracted(32767);
						int i_11_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.method239((byte) 31);
						npc.method383(i_10_, false,
								Region.pulseCycle, i_11_);
						npc.anInt3273 = Region.pulseCycle + 300;
						npc.anInt3259 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.method239((byte) 40);
						npc.anInt3262 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.readByteSubtracted(32767);
					}
					if ((0x4 & i_5_) != 0) {
						npc.anInt3293 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.readShort();
						if (npc.anInt3293 == 65535)
							npc.anInt3293 = -1;
					}
					if ((0x20 & i_5_ ^ 0xffffffff) != -1) {
						int i_12_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.get();
						int i_13_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.method239((byte) 79);
						npc.method383(i_12_, false,
								Region.pulseCycle, i_13_);
						npc.anInt3273 = Region.pulseCycle
								- -300;
						npc.anInt3259 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.get();
						npc.anInt3262 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.get();
					}
					if ((i_5_ & 0x2) != 0) {
						npc.npcDefinition = Class71
								.method1155(
										arg0 ^ 0x30,
										Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
												.readShort());
						npc.anInt3246 = (npc.npcDefinition.anInt2800);
						npc.anInt3251 = (npc.npcDefinition.anInt2796);
						npc.anInt3272 = (npc.npcDefinition.anInt2801);
						npc.anInt3237 = (npc.npcDefinition.anInt2837);
						npc.anInt3244 = (npc.npcDefinition.anInt2791);
						npc.anInt3269 = (npc.npcDefinition.anInt2821);
						npc.anInt3263 = (npc.npcDefinition.anInt2793);
						npc.anInt3265 = (npc.npcDefinition.anInt2825);
						npc.anInt3250 = (npc.npcDefinition.anInt2807);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "qd.C("
					+ arg0 + ')');
		}
	}

	public static void method1032(int arg0, int arg1, int arg2) {
		try {
			if (arg0 != 0)
				aJagexString_1166 = null;
			anInt1158++;
			if (Class4_Sub12.method277((byte) 120, arg2))
				Class19_Sub1.method763(arg1, (byte) 2,
						(Class28.aClass4_Sub13ArrayArray632[arg2]));
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("qd.D("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static boolean method1033(int arg0, int arg1, int arg2) {
		try {
			if (arg0 != 0)
				return true;
			if ((arg2 ^ 0xffffffff) == -12)
				arg2 = 10;
			anInt1170++;
			if ((arg2 ^ 0xffffffff) <= -6 && arg2 <= 8)
				arg2 = 4;
			Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(true, arg1);
			return class4_sub20_sub1.method329(arg2, arg0 ^ 0xf29);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("qd.E("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}
}
