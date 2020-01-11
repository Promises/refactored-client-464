/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class73 {
	public static volatile boolean aBoolean1495;
	public static Class19_Sub1 aClass19_Sub1_1504;
	public static JagexString aJagexString_1499;
	public static JagexString aJagexString_1501;
	public static JagexString aJagexString_1503 = JagexString.getRs2PreparedString("K"
    );
	public static JagexString aJagexString_1507;
	public static int anInt1496;
	public static int anInt1497 = 0;
	public static int anInt1498 = 2;
	public static int anInt1500;
	public static int anInt1502;
	public static int anInt1505;
	public static int anInt1506;
	public static int anInt1508;

	static {
		aJagexString_1501 = aJagexString_1503;
		anInt1502 = 0;
		aBoolean1495 = false;
		aJagexString_1507 = aJagexString_1503;
		aJagexString_1499 = JagexString.getRs2PreparedString("Sprites geladen)3");
	}

	public static void method1164(int arg0) {
		try {
			aJagexString_1503 = null;
			aJagexString_1499 = null;
			aJagexString_1507 = null;
			aClass19_Sub1_1504 = null;
			aJagexString_1501 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "v.C("
					+ arg0 + ')');
		}
	}

	public static void method1165(byte arg0) {
		try {
			Class65.anIntArray1297 = new int[104];
			Class4_Sub20_Sub4.aByteArrayArrayArray2861 = new byte[4][104][104];
			Class4_Sub6.anInt1918 = 99;
			anInt1506++;
			JagexString.anIntArray1798 = new int[104];
			Class4_Sub23.anIntArray2411 = new int[104];
			Class4_Sub20_Sub10.aByteArrayArrayArray3065 = new byte[4][104][104];
			Class4_Sub14.aByteArrayArrayArray2275 = new byte[4][105][105];
			SceneGraph.heightmap = new int[4][105][105];
			Class4_Sub21.anIntArray2373 = new int[104];
			Class4_Sub20_Sub10.aByteArrayArrayArray3054 = new byte[4][104][104];
			Class59.aByteArrayArrayArray1181 = new byte[4][104][104];
			Class46.anIntArray937 = new int[104];
			Class4_Sub20_Sub7_Sub5.anIntArrayArray3390 = new int[105][105];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "v.A("
					+ arg0 + ')');
		}
	}

	public static void method1166(int arg0, int arg1,
			Class4_Sub20_Sub7_Sub1_Sub1 arg2, int arg3) {
		if (arg1 != 17933)
			aJagexString_1507 = null;
		anInt1505++;
		if ((arg3 & 0x100 ^ 0xffffffff) != -1) {
			int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method240(32767); // bytes
			int i_0_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method240(32767); // bytes
			arg2.method383(i, false, Region.anInt134, i_0_);
			arg2.anInt3273 = 300 + Region.anInt134;
			arg2.anInt3259 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method239((byte) 111); // bytea
			arg2.anInt3262 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method239((byte) 92); // bytea
		}
		if ((0x200 & arg3) != 0) {
			arg2.anInt3226 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method209((byte) -110); // short
			int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method237(arg1
					+ -18031); // int2
			arg2.anInt3241 = 0;
			arg2.anInt3242 = 0;
			if ((arg2.anInt3226 ^ 0xffffffff) == -65536)
				arg2.anInt3226 = -1;
			arg2.anInt3235 = (i & 0xffff) + Region.anInt134;
			arg2.anInt3229 = i >> -831758576;
			if (arg2.anInt3235 > Region.anInt134)
				arg2.anInt3242 = -1;
		}
		if ((arg3 & 0x8 ^ 0xffffffff) != -1) {
			arg2.anInt3293 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method213((byte) -85);
			if (arg2.anInt3293 == 65535)
				arg2.anInt3293 = -1;
		}
		if ((arg3 & 0x4) != 0) {
			arg2.anInt3292 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method235((byte) -52); // leshorta
			arg2.anInt3231 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method235((byte) -118); // leshorta
		}
		if ((0x400 & arg3 ^ 0xffffffff) != -1) {
			arg2.anInt3240 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method240(32767);
			arg2.anInt3279 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method240(32767);
			arg2.anInt3278 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method240(arg1 + 14834);
			arg2.anInt3232 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method239((byte) 42);
			arg2.anInt3224 = (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method223(0) + Region.anInt134);
			arg2.anInt3281 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method209((byte) -114) + Region.anInt134;
			arg2.anInt3245 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.getC();
			arg2.anInt3236 = 0;
			arg2.anInt3228 = 1;
		}
		if ((0x80 & arg3) != 0) {
			arg2.aJagexString_3271 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method212(arg1 + -17848);
			if (arg2.aJagexString_3271.method834(21340, 0) == 126) {
				arg2.aJagexString_3271 = arg2.aJagexString_3271.method805(1, arg1
						^ ~0x466a);
				Class43.method955(arg2.aJagexString_3271, arg2.aJagexString_3593,
						(byte) 122, 2);
			} else if (Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302 == arg2)
				Class43.method955(arg2.aJagexString_3271, arg2.aJagexString_3593,
						(byte) 114, 2);
			arg2.anInt3253 = 150;
			arg2.anInt3220 = 0;
			arg2.anInt3225 = 0;
		}
		if ((arg3 & 0x20) != 0) {
			int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method213((byte) -87); // leshort
			if ((i ^ 0xffffffff) == -65536)
				i = -1;
			int i_1_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.getC(); // bytec
			Class64.method1064(i_1_, (byte) 91, arg2, i);
		}
		if ((0x1 & arg3) != 0) {
			int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method235((byte) 116); // leshorta
			int i_2_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method239((byte) 34); // bytea
			int i_3_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // byte
			int i_4_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion;
			if (arg2.aJagexString_3593 != null && arg2.aClass35_3609 != null) {
				long l = arg2.aJagexString_3593.method806((byte) -113);
				boolean bool = false;
				if (i_2_ <= 1) {
					for (int i_5_ = 0; ((i_5_ ^ 0xffffffff) > (JagexString.anInt1827 ^ 0xffffffff)); i_5_++) {
						if ((Class9.aLongArray284[i_5_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
							bool = true;
							break;
						}
					}
				}
				if (!bool && Class81.anInt1695 == 0) {
					Class41.aClass4_Sub11_796.pointion = 0;
					Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method220(
							Class41.aClass4_Sub11_796.byteBuffer, 0,
							arg1 + 960034779, i_3_);
					Class41.aClass4_Sub11_796.pointion = 0;
					JagexString jagexString = (Class4_Sub20_Sub12_Sub4
							.method574(Class4_Sub22.method629((byte) -83,
									Class41.aClass4_Sub11_796).method801(false)));
					arg2.aJagexString_3271 = jagexString.method815(124);
					arg2.anInt3253 = 150;
					arg2.anInt3220 = i & 0xff;
					arg2.anInt3225 = i >> -594483512;
					if (i_2_ != 2 && i_2_ != 3) {
						if (i_2_ == 1)
							Class43.method955(
                                    jagexString,
									(Class4_Sub24.method639((new JagexString[] {
											Class48.aJagexString_986,
											arg2.aJagexString_3593}), arg1
											^ ~0x4544)), (byte) 126, 1);
						else
							Class43.method955(jagexString, arg2.aJagexString_3593,
									(byte) 122, 2);
					} else
						Class43.method955(
                                jagexString,
								Class4_Sub24.method639((new JagexString[] {
										Class64.aJagexString_1268,
										arg2.aJagexString_3593}), arg1 + -18775),
								(byte) 122, 1);
				}
			}
			Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion = i_3_ + i_4_;
		}
		if ((0x2 & arg3) != 0) {
			int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method239((byte) 33); // bytea
			int i_6_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method240(32767); // bytes
			arg2.method383(i, false, Region.anInt134, i_6_);
			arg2.anInt3273 = Region.anInt134 - -300;
			arg2.anInt3259 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method240(arg1 + 14834); // bytes
			arg2.anInt3262 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method240(arg1 ^ 0x39f2); // bytes
		}
		if ((arg3 & 0x40) != 0) {
			int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
					.method239((byte) 108);
			byte[] is = new byte[i];
			StreamBuffer class4_sub11 = new StreamBuffer(is);
			Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method253(0, (byte) -75,
					i, is);
			Class25.aClass4_Sub11Array575[arg0] = class4_sub11;
			arg2.method391(arg1 ^ 0x460c, class4_sub11);
		}
	}
}
