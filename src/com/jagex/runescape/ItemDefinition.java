package com.jagex.runescape;
import com.jagex.runescape.io.Buffer;
import com.jagex.runescape.util.Signlink;

import java.awt.Component;
import java.lang.reflect.Method;

public class ItemDefinition extends Class4_Sub20 {
	public static JagexString aJagexString_2958 = JagexString.getRs2PreparedString(
			"Loading sprites )2 ");
	public static JagexString aJagexString_2967;
	public static JagexString aJagexString_2973;
	public static JagexString aJagexString_2981;
	public static JagexString aJagexString_2982;
	public static JagexString aJagexString_2996;
	public static JagexString aJagexString_2998;
	public static JagexString aJagexString_3013;
	public static JagexString aJagexString_3015;
	public static JagexString[] aJagexStringArray2957;
	public static Class4_Sub20_Sub10 aClass4_Sub20_Sub10_2990;
	public static Class66 aClass66_3014;
	public static Class77 aClass77_3020;
	public static int anInt2952;
	public static int anInt2953;
	public static int anInt2955;
	public static int anInt2956;
	public static int anInt2959;
	public static int anInt2960;
	public static int anInt2962;
	public static int anInt2968;
	public static int anInt2969;
	public static int anInt2978;
	public static int anInt2980;
	public static int anInt2987;
	public static int anInt2992;
	public static int anInt2994;
	public static int anInt3001;
	public static int anInt3004;
	public static int anInt3016;
	public static int anInt3018;
	public static int anInt3019;
	public static int anInt3021;
	static {
		aJagexStringArray2957 = new JagexString[500];
		aJagexString_2981 = JagexString
				.getRs2PreparedString("Please try again)3");
		aJagexString_2973 = aJagexString_2958;
		anInt2980 = 0;
		aJagexString_3013 = JagexString.getRs2PreparedString("cross");
		aJagexString_2998 = JagexString.getRs2PreparedString("Loading wordpack )2 "
		);
		aJagexString_2996 = aJagexString_2981;
		aJagexString_2982 = aJagexString_2998;
		aJagexString_3015 = JagexString.getRs2PreparedString("Continue");
		aJagexString_2967 = aJagexString_3015;
		aClass66_3014 = new Class66(64);
		aClass77_3020 = new Class77();
		anInt3021 = 255;
	}

	public static void method462(int arg0) {
		aJagexString_2981 = null;
		aClass66_3014 = null;
		aJagexString_2998 = null;
		aJagexString_2973 = null;
		aJagexString_2982 = null;
		aJagexString_2958 = null;
		aJagexString_2996 = null;
		aJagexString_3013 = null;
		aClass4_Sub20_Sub10_2990 = null;
		aJagexString_3015 = null;
		aClass77_3020 = null;
		aJagexStringArray2957 = null;
		aJagexString_2967 = null;
		if (arg0 != 0) {
			method462(-35);
		}
	}

	public static void method464(byte arg0, Component arg1) {
		try {
			anInt3016++;
			Method method = Signlink.aMethod1537;
			if (method != null) {
				try {
					method.invoke(arg1, Boolean.FALSE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			arg1.addKeyListener(Class4_Sub14.aClass18_2272);
			if (arg0 == 79) {
				arg1.addFocusListener(Class4_Sub14.aClass18_2272);
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("je.L("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method467(Class19 arg0, int arg1) {
		try {
			Class50.aClass19_1021 = arg0;
			if (arg1 != 14531) {
				method470(false, null, null);
			}
			anInt2962++;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("je.K("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static void method470(boolean arg0, Class19 arg1, Class19 arg2) {
		do {
			try {
				Class16.aClass19_429 = arg2;
				Class4_Sub11_Sub1.aClass19_2691 = arg1;
				anInt3018++;
				if (arg0 == true) {
					break;
				}
				method470(true, null, null);
			} catch (RuntimeException runtimeexception) {
				throw JagexException.create(runtimeexception,
						("je.P(" + arg0 + ','
								+ (arg1 != null ? "{...}" : "null") + ','
								+ (arg2 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method471(byte[] arg0, byte arg1, Class69 arg2,
			Region[] arg3, int yAbs, int xAbs) {
		try {
			anInt2952++;
			int objectId = -1;
			Buffer buffer = new Buffer(arg0);
			if (arg1 <= -23) {
				for (;;) {
					int incr = buffer.readUnsignedSmart();
					if (incr == 0) {
						break;
					}
					objectId += incr;
					int location = 0;
					for (;;) {
						int incr2 = buffer.readUnsignedSmart();
						if (incr2 == 0) {
							break;
						}
						location += -1 + incr2;
						int xAbsOffset = (0xfe1 & location) >> 774081286;
						int zAbs = location >> 1804348492;
						int objectData = buffer.get();
						int yAbsOffset = location & 0x3f;
						int type = objectData >> 179973826;
						int rotation = 0x3 & objectData;
						int localY = yAbs + yAbsOffset;
						int localX = xAbs + xAbsOffset;
						if (localX > 0 && (localY ^ 0xffffffff) < -1
								&& localX < 103 && (localY ^ 0xffffffff) > -104) {
							int z = zAbs;
							Region class3 = null;
							if (((Class46.currentSceneTileFlags[1][localX][localY]) & 0x2 ^ 0xffffffff) == -3) {
								z--;
							}
							if ((z ^ 0xffffffff) <= -1) {
								class3 = arg3[z];
							}
							Class42.method945(rotation, zAbs, localX, objectId,
									localY, type, class3, arg2);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("je.F("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + yAbs + ','
					+ xAbs + ')'));
		}
	}

	public boolean members;
	public JagexString name;
	public JagexString[] iops;
	public JagexString[] ops;
	public int resizeZ;
	public int anInt2954;
	public int contrast = 0;
	public int manModel1;
	public int xof2d;
	public int resizeY;
	public int ambient;
	public int womanHead2;
	public int manHead2;
	public int womanModel2;
	public int manHead1 = -1;
	public int zan2d;
	public int certLink;
	public int womanHead1 = -1;
	public int zoom2d;
	public int womanModel1Offset;
	public int manModel1Offset;
	public int certTemplate;
	public int manModel3;
	public int yan2d;
	public int womanModel3;
	public int team;
	public int xan2d;
	public int resizeX;
	public int manModel2;
	public int mesh;
	public int yof2d;
	public int womanModel1;

	public int stackable;

	public int cost;

	public int[] stackIds;

	public int[] stackAmounts;

	public short[] originalColors;

	public short[] modifiedColors;

	public ItemDefinition() {
		resizeY = 128;
		womanHead2 = -1;
		womanModel2 = -1;
		members = false;
		xof2d = 0;
		name = Class4_Sub22.localizedNull;
		xan2d = 0;
		manModel2 = -1;
		iops = new JagexString[] { null, null, null, null,
				StringUtilities.drop};
		ops = new JagexString[] { null, null,
				Class4_Sub6.localizedTake, null, null };
		certTemplate = -1;
		resizeX = 128;
		yan2d = 0;
		zan2d = 0;
		manModel1 = -1;
		team = 0;
		zoom2d = 2000;
		ambient = 0;
		manHead2 = -1;
		manModel1Offset = 0;
		womanModel3 = -1;
		womanModel1 = -1;
		yof2d = 0;
		manModel3 = -1;
		womanModel1Offset = 0;
		resizeZ = 128;
		stackable = 0;
		certLink = -1;
		cost = 1;
	}

	public boolean method459(byte arg0, boolean arg1) {
		try {
			anInt2955++;
			int i = manHead1;
			int i_0_ = manHead2;
			if (arg0 != -73) {
				method462(68);
			}
			if (arg1) {
				i_0_ = womanHead2;
				i = womanHead1;
			}
			if ((i ^ 0xffffffff) == 0) {
				return true;
			}
			boolean bool = RSFont.aClass19_169.method739((byte) -4, i, 0);
			if ((i_0_ ^ 0xffffffff) != 0
					&& !RSFont.aClass19_169.method739((byte) -4, i_0_, 0)) {
				bool = false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("je.O("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public boolean method460(int arg0, boolean arg1) {
		try {
			anInt2992++;
			int i = manModel3;
			int i_1_ = manModel1;
			int i_2_ = manModel2;
			if (arg1) {
				i_2_ = womanModel2;
				i = womanModel3;
				i_1_ = womanModel1;
			}
			if (i_1_ == arg0) {
				return true;
			}
			boolean bool = RSFont.aClass19_169.method739((byte) -4, i_1_, 0);
			if (i_2_ != -1
					&& !RSFont.aClass19_169.method739((byte) -4, i_2_, 0)) {
				bool = false;
			}
			if ((i ^ 0xffffffff) != 0
					&& !RSFont.aClass19_169.method739((byte) -4, i, 0)) {
				bool = false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("je.N("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub7 method461(int arg0, int arg1) {
		try {
			anInt3001++;
			if (stackIds != null && (arg1 ^ 0xffffffff) < -2) {
				int i = -1;
				for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -11; i_3_++) {
					if (stackAmounts[i_3_] <= arg1
							&& stackAmounts[i_3_] != 0) {
						i = stackIds[i_3_];
					}
				}
				if ((i ^ 0xffffffff) != 0) {
					return Class4_Sub23.method633(i, (byte) -124).method461(
							-11, 1);
				}
			}
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = ((Class4_Sub20_Sub7_Sub7) Class25.aClass66_592
					.method1083(anInt2954, true));
			if (class4_sub20_sub7_sub7 != null) {
				return class4_sub20_sub7_sub7;
			}
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class4_Sub20_Sub7_Sub2
					.method399(RSFont.aClass19_169, mesh, 0);
			if (arg0 != -11) {
				manModel3 = -95;
			}
			if (class4_sub20_sub7_sub2 == null) {
				return null;
			}
			if (resizeX != 128 || (resizeY ^ 0xffffffff) != -129
					|| resizeZ != 128) {
				class4_sub20_sub7_sub2.method406(resizeX, resizeY,
						resizeZ);
			}
			if (originalColors != null) {
				for (int i = 0; (i ^ 0xffffffff) > (originalColors.length ^ 0xffffffff); i++) {
					class4_sub20_sub7_sub2.method416(originalColors[i],
							modifiedColors[i]);
				}
			}
			class4_sub20_sub7_sub7 = class4_sub20_sub7_sub2.method411(
					64 - -ambient, contrast + 768, -50, -10, -50);
			class4_sub20_sub7_sub7.aBoolean3454 = true;
			Class25.aClass66_592.method1082(true, anInt2954,
					class4_sub20_sub7_sub7);
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("je.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method463(int arg0) {
		try {
			if (arg0 == 4065) {
				anInt2959++;
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "je.I("
					+ arg0 + ')');
		}
	}

	public void readValue(Buffer data, int opcode) {
		try {
			anInt2968++;
			if (opcode == 1) {
				mesh = data.readShort();
			} else if (opcode == 2) {
				name = data.readString();
			} else if (opcode == 4) {
				zoom2d = data.readShort();
			} else if (opcode == 5) {
				xan2d = data.readShort();
			} else if (opcode == 6) {
				yan2d = data.readShort();
			} else if (opcode == 7) {
				xof2d = data.readShort();
				if (xof2d > 32767) {
					xof2d -= 65536;
				}
			} else if (opcode == 8) {
				yof2d = data.readShort();
				if (yof2d > 32767) {
					yof2d -= 65536;
				}
			} else if (opcode == 11) {
				stackable = 1;
			} else if (opcode == 12) {
				cost = data.readInt();
			} else if (opcode == 16) {
				members = true;
			} else if (opcode == 23) {
				manModel1 = data.readShort();
				manModel1Offset = data.get();
			} else if (opcode == 24) {
				manModel2 = data.readShort();
			} else if (opcode == 25) {
				womanModel1 = data.readShort();
				womanModel1Offset = data.get();
			} else if (opcode == 26) {
				womanModel2 = data.readShort();
			} else if (opcode >= 30 && opcode < 35) {
				ops[opcode - 30] = data.readString();
				if (ops[opcode + -30].stringEquals(StringUtilities.hidden)) {
					ops[opcode + -30] = null;
				}
			} else if (opcode >= 35 && opcode < 40) {
				iops[opcode + -35] = data.readString();
			} else if (opcode == 40) {
				int recolCount = data.get();
				originalColors = new short[recolCount];
				modifiedColors = new short[recolCount];
				for (int i = 0; recolCount > i; i++) {
					originalColors[i] = (short) (data.readShort());
					modifiedColors[i] = (short) (data.readShort());
				}
			} else if (opcode == 78) {
				manModel3 = (data.readShort());
			} else if (opcode == 79) {
				womanModel3 = (data.readShort());
			} else if (opcode == 90) {
				manHead1 = (data.readShort());
			} else if (opcode == 91) {
				womanHead1 = (data.readShort());
			} else if (opcode == 92) {
				manHead2 = (data.readShort());
			} else if (opcode == 93) {
				womanHead2 = (data.readShort());
			} else if (opcode == 95) {
				zan2d = (data.readShort());
			} else if (opcode == 97) {
				certLink = (data.readShort());
			} else if (opcode == 98) {
				certTemplate = (data.readShort());
			} else if ((opcode >= 100) && (opcode < 110)) {
				if (stackIds == null) {
					stackIds = (new int[10]);
					stackAmounts = (new int[10]);
				}
				stackIds[(opcode + -100)] = (data.readShort());
				stackAmounts[(opcode - 100)] = (data.readShort());
			} else if (opcode == 110) {
				resizeX = (data.readShort());
			} else if (opcode == 111) {
				resizeY = (data.readShort());
			} else if (opcode == 112) {
				resizeZ = (data.readShort());
			} else if (opcode == 113) {
				ambient = data.method229(104);
			} else if (opcode == 114) {
				contrast = data.method229(-114) * 5;
			} else if (opcode == 115) {
				team = data.get();
			}
		} catch (RuntimeException runtimeException) {
			throw JagexException.create(
					runtimeException,
					("ItemDefinition.readValue(" + (data != null ? "{...}" : "null") + ',' + opcode + ')'));
		}
	}

	public void readFileData(Buffer data) {
		try {
			for (;;) {
				int opcode = data.get();
				if (opcode == 0) {
					break;
				}
				readValue(data, opcode);
			}
			anInt2956++;
		} catch (RuntimeException jagexException) {
			throw JagexException.create(
					jagexException,
					("ItemDefinition.readFileData(" + (data != null ? "{...}" : "null") + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub2 method468(boolean arg0, int arg1) {
		try {
			anInt3019++;
			int i = manHead1;
			int i_5_ = manHead2;
			if (arg0) {
				i_5_ = womanHead2;
				i = womanHead1;
			}
			if ((i ^ 0xffffffff) == arg1) {
				return null;
			}
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class4_Sub20_Sub7_Sub2
					.method399(RSFont.aClass19_169, i, 0);
			if (i_5_ != -1) {
				Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2_6_ = Class4_Sub20_Sub7_Sub2
						.method399(RSFont.aClass19_169, i_5_, 0);
				Class4_Sub20_Sub7_Sub2[] class4_sub20_sub7_sub2s = {
						class4_sub20_sub7_sub2, class4_sub20_sub7_sub2_6_ };
				class4_sub20_sub7_sub2 = new Class4_Sub20_Sub7_Sub2(
						class4_sub20_sub7_sub2s, 2);
			}
			if (originalColors != null) {
				for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (originalColors.length ^ 0xffffffff)); i_7_++) {
					class4_sub20_sub7_sub2.method416(originalColors[i_7_],
							modifiedColors[i_7_]);
				}
			}
			return class4_sub20_sub7_sub2;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("je.H("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public ItemDefinition method469(int arg0, int arg1) {
		try {
			anInt2994++;
			if (arg0 != 0) {
				yof2d = 112;
			}
			if (stackIds != null && arg1 > 1) {
				int i = -1;
				for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -11; i_8_++) {
					if (stackAmounts[i_8_] <= arg1
							&& stackAmounts[i_8_] != 0) {
						i = stackIds[i_8_];
					}
				}
				if ((i ^ 0xffffffff) != 0) {
					return Class4_Sub23.method633(i, (byte) -118);
				}
			}
			return this;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("je.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method472(int arg0, ItemDefinition arg1,
			ItemDefinition arg2) {
		try {
			members = arg1.members;
			zan2d = arg2.zan2d;
			anInt2978++;
			cost = arg1.cost;
			zoom2d = arg2.zoom2d;
			modifiedColors = arg2.modifiedColors;
			mesh = arg2.mesh;
			xof2d = arg2.xof2d;
			stackable = 1;
			xan2d = arg2.xan2d;
			yof2d = arg2.yof2d;
			name = arg1.name;
			originalColors = arg2.originalColors;
			if (arg0 >= 51) {
				yan2d = arg2.yan2d;
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("je.A("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub2 method473(boolean arg0, int arg1) {
		try {
			int i = manModel1;
			int i_21_ = manModel2;
			int i_22_ = manModel3;
			anInt2969++;
			if (arg0) {
				i_22_ = womanModel3;
				i_21_ = womanModel2;
				i = womanModel1;
			}
			if ((i ^ 0xffffffff) == 0) {
				return null;
			}
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class4_Sub20_Sub7_Sub2
					.method399(RSFont.aClass19_169, i, 0);
			if ((i_21_ ^ 0xffffffff) != 0) {
				Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2_23_ = Class4_Sub20_Sub7_Sub2
						.method399(RSFont.aClass19_169, i_21_, 0);
				if ((i_22_ ^ 0xffffffff) != 0) {
					Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2_24_ = Class4_Sub20_Sub7_Sub2
							.method399(RSFont.aClass19_169, i_22_, 0);
					Class4_Sub20_Sub7_Sub2[] class4_sub20_sub7_sub2s = {
							class4_sub20_sub7_sub2, class4_sub20_sub7_sub2_23_,
							class4_sub20_sub7_sub2_24_ };
					class4_sub20_sub7_sub2 = new Class4_Sub20_Sub7_Sub2(
							class4_sub20_sub7_sub2s, 3);
				} else {
					Class4_Sub20_Sub7_Sub2[] class4_sub20_sub7_sub2s = {
							class4_sub20_sub7_sub2, class4_sub20_sub7_sub2_23_ };
					class4_sub20_sub7_sub2 = new Class4_Sub20_Sub7_Sub2(
							class4_sub20_sub7_sub2s, 2);
				}
			}
			if (!arg0 && (manModel1Offset ^ 0xffffffff) != -1) {
				class4_sub20_sub7_sub2.method410(0, manModel1Offset, 0);
			}
			if (arg0 && womanModel1Offset != 0) {
				class4_sub20_sub7_sub2.method410(0, womanModel1Offset, 0);
			}
			if (originalColors != null) {
				for (int i_25_ = 0; ((originalColors.length ^ 0xffffffff) < (i_25_ ^ 0xffffffff)); i_25_++) {
					class4_sub20_sub7_sub2.method416(originalColors[i_25_],
							modifiedColors[i_25_]);
				}
			}
			if (arg1 != -25) {
				return null;
			}
			return class4_sub20_sub7_sub2;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("je.E("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub2 method474(int arg0, int arg1) {
		try {
			if (arg0 != 10) {
				method464((byte) -26, null);
			}
			anInt2953++;
			if (stackIds != null && arg1 > 1) {
				int i = -1;
				for (int i_26_ = 0; i_26_ < 10; i_26_++) {
					if ((stackAmounts[i_26_] ^ 0xffffffff) >= (arg1 ^ 0xffffffff)
							&& (stackAmounts[i_26_] ^ 0xffffffff) != -1) {
						i = stackIds[i_26_];
					}
				}
				if ((i ^ 0xffffffff) != 0) {
					return Class4_Sub23.method633(i, (byte) -105).method474(
							arg0, 1);
				}
			}
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class4_Sub20_Sub7_Sub2
					.method399(RSFont.aClass19_169, mesh, 0);
			if (class4_sub20_sub7_sub2 == null) {
				return null;
			}
			if (resizeX != 128 || (resizeY ^ 0xffffffff) != -129
					|| (resizeZ ^ 0xffffffff) != -129) {
				class4_sub20_sub7_sub2.method406(resizeX, resizeY,
						resizeZ);
			}
			if (originalColors != null) {
				for (int i = 0; i < originalColors.length; i++) {
					class4_sub20_sub7_sub2.method416(originalColors[i],
							modifiedColors[i]);
				}
			}
			return class4_sub20_sub7_sub2;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("je.J("
					+ arg0 + ',' + arg1 + ')'));
		}
	}
}
