package com.jagex.runescape;
import java.awt.Component;

public abstract class Class42 {
	public static Class19_Sub1 aClass19_Sub1_856;
    public static RSInterface aClass4_Sub13_855;
	public static Class59[] aClass59Array849 = new Class59[50];
	public static Class66 aClass66_853 = new Class66(64);
	public static int anInt844 = 1;
	public static int anInt845;
	public static int anInt847;
	public static int anInt848;
	public static int anInt851;
	public static int[] anIntArray841 = new int[32];
	public static int[] anIntArray852 = new int[100];
	public static short[][] aShortArrayArray854 = (new short[][] {
            { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054,
                    7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990,
                    -21969, -21952, -22182, -27211, -27198, -27186, -27302,
                    542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014,
                    11179, 11197, 11096, 10258, 10776, 10661, 10419,
                    -10984, -11095, -11072, -6630, -5467, -6473, -6838,
                    -32318, -26069, -25925, -25669, 11202, 22193, 123, 111,
                    99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49,
                    61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123,
                    111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330,
                    7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384,
                    -22370, -22221, -22196, -22314, -29637, -27434, -29604,
                    -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314,
                    10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301,
                    -11108, -11093, -11203, -8034, -5839, -6836, -5934,
                    -32674, -14444, -15455, -15697, -15557, -15424, -11622,
                    -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054,
                    -30159, -30019, -21734, -21845, -21707, -21690, -21564,
                    -24921, -24775, -24640, 662, 794, 811, 945, 827, 957,
                    5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775,
                    3891, 3904, -18792, -19799, -20807, -20677, -20534,
                    123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366,
                    21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300,
                    8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304,
                    16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056,
                    6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952,
                    14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951,
                    148, 6936, 5675, 5440, 10014, 11179, 11197, 10894,
                    10776, 10661, 10795, 10419, -10984, -11095, -11072,
                    12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49,
                    61, 74, 86 },
            { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054,
                    7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990,
                    -21969, -21952, -22182, -27211, -27198, -27186, -27302,
                    542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014,
                    11179, 11197, 11096, 10258, 10776, 10661, 10419,
                    -10984, -11095, -11072, -6630, -5467, -6473, -6838,
                    -32318, -26069, -25925, -25669, 11202, 22193, 123, 111,
                    99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49,
                    61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123,
                    111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330,
                    7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384,
                    -22370, -22221, -22196, -22314, -29637, -27434, -29604,
                    -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314,
                    10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301,
                    -11108, -11093, -11203, -8034, -5839, -6836, -5934,
                    -32674, -14444, -15455, -15697, -15557, -15424, -11622,
                    -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054,
                    -30159, -30019, -21734, -21845, -21707, -21690, -21564,
                    -24921, -24775, -24640, 662, 794, 811, 945, 827, 957,
                    5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775,
                    3891, 3904, -18792, -19799, -20807, -20677, -20534,
                    123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366,
                    21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300,
                    8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304,
                    16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056,
                    6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952,
                    14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951,
                    148, 6936, 5675, 5440, 10014, 11179, 11197, 10894,
                    10776, 10661, 10795, 10419, -10984, -11095, -11072,
                    12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49,
                    61, 74, 86 },
            { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054,
                    7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990,
                    -21969, -21952, -22182, -27211, -27198, -27186, -27302,
                    542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014,
                    11179, 11197, 11096, 10258, 10776, 10661, 10419,
                    -10984, -11095, -11072, -6630, -5467, -6473, -6838,
                    -32318, -26069, -25925, -25669, 11202, 22193, 123, 111,
                    99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49,
                    61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123,
                    111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330,
                    7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384,
                    -22370, -22221, -22196, -22314, -29637, -27434, -29604,
                    -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314,
                    10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301,
                    -11108, -11093, -11203, -8034, -5839, -6836, -5934,
                    -32674, -14444, -15455, -15697, -15557, -15424, -11622,
                    -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054,
                    -30159, -30019, -21734, -21845, -21707, -21690, -21564,
                    -24921, -24775, -24640, 662, 794, 811, 945, 827, 957,
                    5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775,
                    3891, 3904, -18792, -19799, -20807, -20677, -20534,
                    123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366,
                    21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300,
                    8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304,
                    16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056,
                    6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952,
                    14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951,
                    148, 6936, 5675, 5440, 10014, 11179, 11197, 10894,
                    10776, 10661, 10795, 10419, -10984, -11095, -11072,
                    12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49,
                    61, 74, 86 },
            { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384,
                    8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 4, 12, 24, 37, 49, 61, 74, 86, -25437,
                    -26445, -27450, 9694, 21824, 123, 111, 99, 17814,
                    16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268,
                    3230, 2223, 72, 10277, 8377, 8394, 7384, -22370,
                    -22221, -22196, -22314, -29637, -27434, -29604, -25491,
                    662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917,
                    10925, 10935, 10471, 10258, 10524, 10415, 10301,
                    -11108, -11093, -11203, -8034, -5839, -6836, -5934,
                    -32674, -14444, -15455, -15697, -15557, -15424, -11622,
                    -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054,
                    -30159, -30019, -21734, -21845, -21707, -21690, -21564,
                    -24921, -24775, -24640, 662, 794, 811, 945, 827, 957,
                    5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775,
                    3891, 3904, -18792, -19799, -20807, -20677, -20534,
                    123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366,
                    21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300,
                    8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304,
                    16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056,
                    6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952,
                    14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951,
                    148, 6936, 5675, 5440, 10014, 11179, 11197, 10894,
                    10776, 10661, 10795, 10419, -10984, -11095, -11072,
                    12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49,
                    61, 74, 86 },
            { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054,
                    7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990,
                    -21969, -21952, -22182, -27211, -27198, -27186, -27302,
                    542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014,
                    11179, 11197, 11096, 10258, 10776, 10661, 10419,
                    -10984, -11095, -11072, -6630, -5467, -6473, -6838,
                    -32318, -26069, -25925, -25669, 11202, 22193, 123, 111,
                    99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571,
                    11200, 957, -10317, 5056, -31808, 123, 22453, -21579,
                    11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 20366, 20401, 662, 827, 7054, 5056,
                    -21734, -21564, -14444, -15424, 11032, 11200, 4, 123,
                    61, -18792, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4300,
                    3294, 3303, 3264, 4506, 4382, 4387, 5293, 8412, 8301,
                    8076, 6936, 5675, 941, 5056, 15795, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0 } });

    public static boolean method942(int arg0, int arg1) {
		try {
			anInt847++;
			if ((arg1 ^ 0xffffffff) > -1)
				return false;
			int i = Class82.anIntArray1712[arg1];
			if ((i ^ 0xffffffff) <= -2001)
				i -= 2000;
			if (i == 1006)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("lc.F("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method945(int rotation, int zAbs, int localX,
			int objectId, int localY, int type, Region arg7, Class69 arg8) {
		try {
			anInt848++;
			if (!Class59.aBoolean1189
					|| (0x2 & Class46.landscapeData[0][localX][localY] ^ 0xffffffff) != -1
					|| (((0x10 & Class46.landscapeData[zAbs][localX][localY]) == 0) && (Class4_Sub15
							.method301(localX, 0, zAbs, localY) == Class50.anInt1010))) {
				if ((Class4_Sub6.anInt1918 ^ 0xffffffff) < (zAbs ^ 0xffffffff))
					Class4_Sub6.anInt1918 = zAbs;
				int i = (Class4_Sub23.anIntArrayArrayArray2416[zAbs][1 + localX][localY]);
				int i_1_ = Class4_Sub23.anIntArrayArrayArray2416[zAbs][localX][localY];
				int i_2_ = (Class4_Sub23.anIntArrayArrayArray2416[zAbs][localX][1 + localY]);
				int i_3_ = (Class4_Sub23.anIntArrayArrayArray2416[zAbs][1 + localX][1 + localY]);
				int i_4_ = i_2_ + (i_3_ + i_1_) - -i >> 1681185986;
				Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(true,
						objectId);
				int i_5_ = 1073741824 + ((objectId << -1262659762)
						+ (localY << -1134983833) + localX);
				if ((class4_sub20_sub1.anInt2726 ^ 0xffffffff) == -1)
					i_5_ += -2147483648;
				int i_6_ = type + (rotation << 944001286);
				if ((class4_sub20_sub1.anInt2747 ^ 0xffffffff) == -2)
					i_6_ += 256;
				if (class4_sub20_sub1.method331(8021))
					Class4_Sub20_Sub16.method611((byte) 89, localX, rotation,
							class4_sub20_sub1, zAbs, localY);
				if ((type ^ 0xffffffff) == -23) {
					if (!Class59.aBoolean1189
							|| class4_sub20_sub1.anInt2726 != 0
							|| class4_sub20_sub1.anInt2741 == 1
							|| class4_sub20_sub1.aBoolean2730) {
						Class4_Sub20_Sub7 class4_sub20_sub7;
						if ((class4_sub20_sub1.anInt2709 ^ 0xffffffff) != 0
								|| class4_sub20_sub1.anIntArray2732 != null)
							class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
									objectId, 22, rotation, i_1_, i, i_3_,
									i_2_, (class4_sub20_sub1.anInt2709), true,
									null);
						else
							class4_sub20_sub7 = class4_sub20_sub1.method324(
									i_2_, i_1_, rotation, i, -102, 22, i_3_);
						arg8.method1134(zAbs, localX, localY, i_4_,
								class4_sub20_sub7, i_5_, i_6_);
						if ((class4_sub20_sub1.anInt2741 ^ 0xffffffff) == -2
								&& arg7 != null)
							arg7.method55((byte) 126, localY, localX);
					}
				} else if ((type ^ 0xffffffff) == -11
						|| (type ^ 0xffffffff) == -12) {
					Class4_Sub20_Sub7 class4_sub20_sub7;
					if (class4_sub20_sub1.anInt2709 != -1
							|| class4_sub20_sub1.anIntArray2732 != null)
						class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
								objectId, 10, rotation, i_1_, i, i_3_, i_2_,
								(class4_sub20_sub1.anInt2709), true, null);
					else
						class4_sub20_sub7 = class4_sub20_sub1.method324(i_2_,
								i_1_, rotation, i, 92, 10, i_3_);
					if (class4_sub20_sub7 != null) {
						int i_7_ = 0;
						if ((type ^ 0xffffffff) == -12)
							i_7_ += 256;
						int i_8_;
						int i_9_;
						if ((rotation ^ 0xffffffff) == -2
								|| (rotation ^ 0xffffffff) == -4) {
							i_9_ = class4_sub20_sub1.anInt2725;
							i_8_ = class4_sub20_sub1.anInt2744;
						} else {
							i_8_ = class4_sub20_sub1.anInt2725;
							i_9_ = class4_sub20_sub1.anInt2744;
						}
						if (arg8.method1129(zAbs, localX, localY, i_4_, i_8_,
								i_9_, class4_sub20_sub7, i_7_, i_5_, i_6_)
								&& class4_sub20_sub1.aBoolean2712) {
							int i_10_ = 15;
							if (class4_sub20_sub7 instanceof Class4_Sub20_Sub7_Sub7) {
								i_10_ = ((Class4_Sub20_Sub7_Sub7) class4_sub20_sub7)
										.method457() / 4;
								if ((i_10_ ^ 0xffffffff) < -31)
									i_10_ = 30;
							}
							for (int i_11_ = 0; (i_8_ ^ 0xffffffff) <= (i_11_ ^ 0xffffffff); i_11_++) {
								for (int i_12_ = 0; i_12_ <= i_9_; i_12_++) {
									if (i_10_ > (Class4_Sub14.aByteArrayArrayArray2275[zAbs][i_11_
											+ localX][localY - -i_12_]))
										Class4_Sub14.aByteArrayArrayArray2275[zAbs][i_11_
												+ localX][i_12_ + localY] = (byte) i_10_;
								}
							}
						}
					}
					if (class4_sub20_sub1.anInt2741 != 0 && arg7 != null)
						arg7.method60(localY, 2,
								class4_sub20_sub1.aBoolean2698,
								class4_sub20_sub1.anInt2744, rotation,
								class4_sub20_sub1.anInt2725, localX);
				} else if (type >= 12) {
					Class4_Sub20_Sub7 class4_sub20_sub7;
					if ((class4_sub20_sub1.anInt2709 ^ 0xffffffff) == 0
							&& class4_sub20_sub1.anIntArray2732 == null)
						class4_sub20_sub7 = class4_sub20_sub1.method324(i_2_,
								i_1_, rotation, i, -110, type, i_3_);
					else
						class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
								objectId, type, rotation, i_1_, i, i_3_, i_2_,
								(class4_sub20_sub1.anInt2709), true, null);
					arg8.method1129(zAbs, localX, localY, i_4_, 1, 1,
							class4_sub20_sub7, 0, i_5_, i_6_);
					if (type >= 12 && (type ^ 0xffffffff) >= -18 && type != 13
							&& (zAbs ^ 0xffffffff) < -1)
						SceneGraph.heightmap[zAbs][localX][localY] = (Class4_Sub20_Sub7_Sub1
								.method389(
										(SceneGraph.heightmap[zAbs][localX][localY]),
										2340));
					if ((class4_sub20_sub1.anInt2741 ^ 0xffffffff) != -1
							&& arg7 != null)
						arg7.method60(localY, 2,
								class4_sub20_sub1.aBoolean2698,
								class4_sub20_sub1.anInt2744, rotation,
								class4_sub20_sub1.anInt2725, localX);
				} else if (type == 0) {
					Class4_Sub20_Sub7 class4_sub20_sub7;
					if ((class4_sub20_sub1.anInt2709 ^ 0xffffffff) == 0
							&& class4_sub20_sub1.anIntArray2732 == null)
						class4_sub20_sub7 = class4_sub20_sub1.method324(i_2_,
								i_1_, rotation, i, 30, 0, i_3_);
					else
						class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
								objectId, 0, rotation, i_1_, i, i_3_, i_2_,
								(class4_sub20_sub1.anInt2709), true, null);
					arg8.method1113(zAbs, localX, localY, i_4_,
							class4_sub20_sub7, null,
							Class4_Sub20_Sub3.anIntArray2799[rotation], 0,
							i_5_, i_6_);
					if ((rotation ^ 0xffffffff) != -1) {
						if ((rotation ^ 0xffffffff) == -2) {
							if (class4_sub20_sub1.aBoolean2712) {
								Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX][localY + 1] = (byte) 50;
								Class4_Sub14.aByteArrayArrayArray2275[zAbs][1 + localX][localY
										- -1] = (byte) 50;
							}
							if (class4_sub20_sub1.aBoolean2724)
								SceneGraph.heightmap[zAbs][localX][localY + 1] = (Class4_Sub20_Sub7_Sub1
										.method389(
												(SceneGraph.heightmap[zAbs][localX][localY + 1]),
												1170));
						} else if ((rotation ^ 0xffffffff) != -3) {
							if ((rotation ^ 0xffffffff) == -4) {
								if (class4_sub20_sub1.aBoolean2712) {
									Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX][localY] = (byte) 50;
									Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX
											- -1][localY] = (byte) 50;
								}
								if (class4_sub20_sub1.aBoolean2724)
									SceneGraph.heightmap[zAbs][localX][localY] = (Class4_Sub20_Sub7_Sub1
											.method389(
													(SceneGraph.heightmap[zAbs][localX][localY]),
													1170));
							}
						} else {
							if (class4_sub20_sub1.aBoolean2712) {
								Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX + 1][localY] = (byte) 50;
								Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX
										- -1][1 + localY] = (byte) 50;
							}
							if (class4_sub20_sub1.aBoolean2724)
								SceneGraph.heightmap[zAbs][1 + localX][localY] = (Class4_Sub20_Sub7_Sub1
										.method389(
												(SceneGraph.heightmap[zAbs][1 + localX][localY]),
												585));
						}
					} else {
						if (class4_sub20_sub1.aBoolean2712) {
							Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX][localY] = (byte) 50;
							Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX][localY
									- -1] = (byte) 50;
						}
						if (class4_sub20_sub1.aBoolean2724)
							SceneGraph.heightmap[zAbs][localX][localY] = (Class4_Sub20_Sub7_Sub1
									.method389(
											(SceneGraph.heightmap[zAbs][localX][localY]),
											585));
					}
					if ((class4_sub20_sub1.anInt2741 ^ 0xffffffff) != -1
							&& arg7 != null)
						arg7.method52(class4_sub20_sub1.aBoolean2698, type,
								rotation, localX, -117, localY);
					if ((class4_sub20_sub1.anInt2750 ^ 0xffffffff) != -17)
						arg8.method1127(zAbs, localX, localY,
								class4_sub20_sub1.anInt2750);
				} else if ((type ^ 0xffffffff) == -2) {
					Class4_Sub20_Sub7 class4_sub20_sub7;
					if ((class4_sub20_sub1.anInt2709 ^ 0xffffffff) == 0
							&& class4_sub20_sub1.anIntArray2732 == null)
						class4_sub20_sub7 = class4_sub20_sub1.method324(i_2_,
								i_1_, rotation, i, -128, 1, i_3_);
					else
						class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
								objectId, 1, rotation, i_1_, i, i_3_, i_2_,
								(class4_sub20_sub1.anInt2709), true, null);
					arg8.method1113(zAbs, localX, localY, i_4_,
							class4_sub20_sub7, null,
							Class4_Sub20_Sub11.anIntArray3076[rotation], 0,
							i_5_, i_6_);
					if (class4_sub20_sub1.aBoolean2712) {
						if (rotation == 0)
							Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX][localY + 1] = (byte) 50;
						else if (rotation == 1)
							Class4_Sub14.aByteArrayArrayArray2275[zAbs][1 + localX][1 + localY] = (byte) 50;
						else if (rotation != 2) {
							if (rotation == 3)
								Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX][localY] = (byte) 50;
						} else
							Class4_Sub14.aByteArrayArrayArray2275[zAbs][1 + localX][localY] = (byte) 50;
					}
					if (class4_sub20_sub1.anInt2741 != 0 && arg7 != null)
						arg7.method52(class4_sub20_sub1.aBoolean2698, type,
								rotation, localX, -123, localY);
				} else if (type == 2) {
					int i_13_ = rotation + 1 & 0x3;
					Class4_Sub20_Sub7 class4_sub20_sub7;
					Class4_Sub20_Sub7 class4_sub20_sub7_14_;
					if (class4_sub20_sub1.anInt2709 == -1
							&& class4_sub20_sub1.anIntArray2732 == null) {
						class4_sub20_sub7 = class4_sub20_sub1.method324(i_2_,
								i_1_, 4 + rotation, i, 118, 2, i_3_);
						class4_sub20_sub7_14_ = class4_sub20_sub1.method324(
								i_2_, i_1_, i_13_, i, -126, 2, i_3_);
					} else {
						class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
								objectId, 2, 4 - -rotation, i_1_, i, i_3_,
								i_2_, (class4_sub20_sub1.anInt2709), true, null);
						class4_sub20_sub7_14_ = new Class4_Sub20_Sub7_Sub6(
								objectId, 2, i_13_, i_1_, i, i_3_, i_2_,
								(class4_sub20_sub1.anInt2709), true, null);
					}
					arg8.method1113(zAbs, localX, localY, i_4_,
							class4_sub20_sub7, class4_sub20_sub7_14_,
							Class4_Sub20_Sub3.anIntArray2799[rotation],
							Class4_Sub20_Sub3.anIntArray2799[i_13_], i_5_, i_6_);
					if (class4_sub20_sub1.aBoolean2724) {
						if (rotation != 0) {
							if ((rotation ^ 0xffffffff) != -2) {
								if ((rotation ^ 0xffffffff) != -3) {
									if (rotation == 3) {
										SceneGraph.heightmap[zAbs][localX][localY] = (Class4_Sub20_Sub7_Sub1
												.method389(
														(SceneGraph.heightmap[zAbs][localX][localY]),
														1170));
										SceneGraph.heightmap[zAbs][localX][localY] = (Class4_Sub20_Sub7_Sub1
												.method389(
														(SceneGraph.heightmap[zAbs][localX][localY]),
														585));
									}
								} else {
									SceneGraph.heightmap[zAbs][localX + 1][localY] = (Class4_Sub20_Sub7_Sub1
											.method389(
													(SceneGraph.heightmap[zAbs][localX + 1][localY]),
													585));
									SceneGraph.heightmap[zAbs][localX][localY] = (Class4_Sub20_Sub7_Sub1
											.method389(
													(SceneGraph.heightmap[zAbs][localX][localY]),
													1170));
								}
							} else {
								SceneGraph.heightmap[zAbs][localX][localY + 1] = (Class4_Sub20_Sub7_Sub1
										.method389(
												(SceneGraph.heightmap[zAbs][localX][localY + 1]),
												1170));
								SceneGraph.heightmap[zAbs][1 + localX][localY] = (Class4_Sub20_Sub7_Sub1
										.method389(
												(SceneGraph.heightmap[zAbs][1 + localX][localY]),
												585));
							}
						} else {
							SceneGraph.heightmap[zAbs][localX][localY] = (Class4_Sub20_Sub7_Sub1
									.method389(
											(SceneGraph.heightmap[zAbs][localX][localY]),
											585));
							SceneGraph.heightmap[zAbs][localX][1 + localY] = (Class4_Sub20_Sub7_Sub1
									.method389(
											(SceneGraph.heightmap[zAbs][localX][1 + localY]),
											1170));
						}
					}
					if ((class4_sub20_sub1.anInt2741 ^ 0xffffffff) != -1
							&& arg7 != null)
						arg7.method52(class4_sub20_sub1.aBoolean2698, type,
								rotation, localX, -120, localY);
					if (class4_sub20_sub1.anInt2750 != 16)
						arg8.method1127(zAbs, localX, localY,
								class4_sub20_sub1.anInt2750);
				} else if (type == 3) {
					Class4_Sub20_Sub7 class4_sub20_sub7;
					if (class4_sub20_sub1.anInt2709 != -1
							|| class4_sub20_sub1.anIntArray2732 != null)
						class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
								objectId, 3, rotation, i_1_, i, i_3_, i_2_,
								(class4_sub20_sub1.anInt2709), true, null);
					else
						class4_sub20_sub7 = class4_sub20_sub1.method324(i_2_,
								i_1_, rotation, i, 83, 3, i_3_);
					arg8.method1113(zAbs, localX, localY, i_4_,
							class4_sub20_sub7, null,
							Class4_Sub20_Sub11.anIntArray3076[rotation], 0,
							i_5_, i_6_);
					if (class4_sub20_sub1.aBoolean2712) {
						if (rotation != 0) {
							if ((rotation ^ 0xffffffff) != -2) {
								if ((rotation ^ 0xffffffff) != -3) {
									if (rotation == 3)
										Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX][localY] = (byte) 50;
								} else
									Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX
											- -1][localY] = (byte) 50;
							} else
								Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX
										- -1][localY - -1] = (byte) 50;
						} else
							Class4_Sub14.aByteArrayArrayArray2275[zAbs][localX][localY + 1] = (byte) 50;
					}
					if ((class4_sub20_sub1.anInt2741 ^ 0xffffffff) != -1
							&& arg7 != null)
						arg7.method52(class4_sub20_sub1.aBoolean2698, type,
								rotation, localX, -126, localY);
				} else if ((type ^ 0xffffffff) == -10) {
					Class4_Sub20_Sub7 class4_sub20_sub7;
					if (class4_sub20_sub1.anInt2709 == -1
							&& class4_sub20_sub1.anIntArray2732 == null)
						class4_sub20_sub7 = class4_sub20_sub1.method324(i_2_,
								i_1_, rotation, i, -115, type, i_3_);
					else
						class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
								objectId, type, rotation, i_1_, i, i_3_, i_2_,
								(class4_sub20_sub1.anInt2709), true, null);
					arg8.method1129(zAbs, localX, localY, i_4_, 1, 1,
							class4_sub20_sub7, 0, i_5_, i_6_);
					if (class4_sub20_sub1.anInt2741 != 0 && arg7 != null)
						arg7.method60(localY, 2,
								class4_sub20_sub1.aBoolean2698,
								class4_sub20_sub1.anInt2744, rotation,
								class4_sub20_sub1.anInt2725, localX);
				} else {
					if (class4_sub20_sub1.aBoolean2697) {
						if (rotation == 1) {
							int i_16_ = i_2_;
							i_2_ = i_3_;
							i_3_ = i;
							i = i_1_;
							i_1_ = i_16_;
						} else if (rotation == 2) {
							int i_17_ = i_2_;
							i_2_ = i;
							i = i_17_;
							i_17_ = i_3_;
							i_3_ = i_1_;
							i_1_ = i_17_;
						} else if ((rotation ^ 0xffffffff) == -4) {
							int i_18_ = i_2_;
							i_2_ = i_1_;
							i_1_ = i;
							i = i_3_;
							i_3_ = i_18_;
						}
					}
					if (type == 4) {
						Class4_Sub20_Sub7 class4_sub20_sub7;
						if (class4_sub20_sub1.anInt2709 == -1
								&& class4_sub20_sub1.anIntArray2732 == null)
							class4_sub20_sub7 = class4_sub20_sub1.method324(
									i_2_, i_1_, 0, i, 50, 4, i_3_);
						else
							class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
									objectId, 4, 0, i_1_, i, i_3_, i_2_,
									(class4_sub20_sub1.anInt2709), true, null);
						arg8.method1123(zAbs, localX, localY, i_4_,
								class4_sub20_sub7,
								Class4_Sub20_Sub3.anIntArray2799[rotation],
								512 * rotation, 0, 0, i_5_, i_6_);
					} else if (type == 5) {
						int i_19_ = arg8.method1126(zAbs, localX, localY);
						int i_20_ = 16;
						if ((i_19_ ^ 0xffffffff) != -1)
							i_20_ = (Region.method56(true,
									0x7fff & i_19_ >> -1150756722).anInt2750);
						Class4_Sub20_Sub7 class4_sub20_sub7;
						if (class4_sub20_sub1.anInt2709 == -1
								&& class4_sub20_sub1.anIntArray2732 == null)
							class4_sub20_sub7 = class4_sub20_sub1.method324(
									i_2_, i_1_, 0, i, -106, 4, i_3_);
						else
							class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
									objectId, 4, 0, i_1_, i, i_3_, i_2_,
									(class4_sub20_sub1.anInt2709), true, null);
						arg8.method1123(zAbs, localX, localY, i_4_,
								class4_sub20_sub7,
								Class4_Sub20_Sub3.anIntArray2799[rotation],
								512 * rotation, Class25.anIntArray587[rotation]
										* i_20_, i_20_
										* Class6.anIntArray205[rotation], i_5_,
								i_6_);
					} else if ((type ^ 0xffffffff) == -7) {
						Class4_Sub20_Sub7 class4_sub20_sub7;
						if (class4_sub20_sub1.anInt2709 != -1
								|| class4_sub20_sub1.anIntArray2732 != null)
							class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
									objectId, 4, 0, i_1_, i, i_3_, i_2_,
									(class4_sub20_sub1.anInt2709), true, null);
						else
							class4_sub20_sub7 = class4_sub20_sub1.method324(
									i_2_, i_1_, 0, i, 74, 4, i_3_);
						arg8.method1123(zAbs, localX, localY, i_4_,
								class4_sub20_sub7, 256, rotation, 0, 0, i_5_,
								i_6_);
					} else if ((type ^ 0xffffffff) == -8) {
						Class4_Sub20_Sub7 class4_sub20_sub7;
						if ((class4_sub20_sub1.anInt2709 ^ 0xffffffff) == 0
								&& class4_sub20_sub1.anIntArray2732 == null)
							class4_sub20_sub7 = class4_sub20_sub1.method324(
									i_2_, i_1_, 0, i, -100, 4, i_3_);
						else
							class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
									objectId, 4, 0, i_1_, i, i_3_, i_2_,
									(class4_sub20_sub1.anInt2709), true, null);
						arg8.method1123(zAbs, localX, localY, i_4_,
								class4_sub20_sub7, 512, rotation, 0, 0, i_5_,
								i_6_);
					} else if ((type ^ 0xffffffff) == -9) {
						Class4_Sub20_Sub7 class4_sub20_sub7;
						if ((class4_sub20_sub1.anInt2709 ^ 0xffffffff) == 0
								&& class4_sub20_sub1.anIntArray2732 == null)
							class4_sub20_sub7 = class4_sub20_sub1.method324(
									i_2_, i_1_, 0, i, -104, 4, i_3_);
						else
							class4_sub20_sub7 = new Class4_Sub20_Sub7_Sub6(
									objectId, 4, 0, i_1_, i, i_3_, i_2_,
									(class4_sub20_sub1.anInt2709), true, null);
						arg8.method1123(zAbs, localX, localY, i_4_,
								class4_sub20_sub7, 768, rotation, 0, 0, i_5_,
								i_6_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("lc.B("
					+ rotation + ',' + zAbs + ',' + localX + ',' + objectId
					+ ',' + localY + ',' + type + ','
					+ (arg7 != null ? "{...}" : "null") + ','
					+ (arg8 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method946(Class4_Sub20_Sub3 arg0, int arg1, int arg2,
			int arg3, int arg4) {
		do {
			try {
				anInt845++;
				if (Class4_Sub20_Sub8.anInt2980 < 400) {
					if (arg0.anIntArray2832 != null)
						arg0 = arg0.method354((byte) 123);
					if (arg0 != null) {
						if (arg2 != 1170)
							method948(1);
						if (arg0.aBoolean2835) {
							JagexString jagexString = arg0.aJagexString_2812;
							if (arg0.anInt2814 != 0)
								jagexString = (Class4_Sub24
										.method639(
												(new JagexString[] {
                                                        jagexString,
														(Class19_Sub1
																.method765(
																		(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3584),
																		arg0.anInt2814,
																		(byte) -45)),
														Class4_Sub7.aJagexString_1957,
														RSFont.aJagexString_164,
														Class74.method1168(arg2
																^ ~0x48d,
																arg0.anInt2814),
														StringUtilities.aJagexString_652}),
												-842));
							if (Class4_Sub20_Sub1.anInt2734 == 1) {
								Class4_Sub20_Sub4.method359(
										(Class4_Sub24.method639((new JagexString[] {
												Class62.aJagexString_1239,
												Class4_Sub14.aJagexString_2271,
                                                jagexString}), -842)), arg3, arg1,
										46, arg4, (byte) 38,
										Class57.aJagexString_1154);
								Class4_Sub20_Sub6.anInt2917++;
							} else if (!Class4_Sub23.aBoolean2421) {
								Class73.anInt1508++;
								JagexString[] jagexStrings = arg0.aJagexStringArray2790;
								if (Class4_Sub17.aBoolean2319)
									jagexStrings = Class10.method671(false,
                                            jagexStrings);
								if (jagexStrings != null) {
									for (int i = 4; (i ^ 0xffffffff) <= -1; i--) {
										if (jagexStrings[i] != null
												&& !(jagexStrings[i]
														.method818(
																Class4_Sub16.aJagexString_2305,
																(byte) -105))) {
											RSCanvas.anInt49++;
											int i_21_ = 0;
											if (i == 0)
												i_21_ = 43;
											if (i == 1)
												i_21_ = 58;
											if ((i ^ 0xffffffff) == -3)
												i_21_ = 44;
											if ((i ^ 0xffffffff) == -4)
												i_21_ = 3;
											if (i == 4)
												i_21_ = 47;
											Class4_Sub20_Sub4
													.method359(
															(Class4_Sub24
																	.method639(
																			(new JagexString[] {
																					Class80.aJagexString_1641,
                                                                                    jagexString}),
																			-842)),
															arg3, arg1, i_21_,
															arg4, (byte) 18,
															jagexStrings[i]);
										}
									}
								}
								if (jagexStrings != null) {
									for (int i = 4; (i ^ 0xffffffff) <= -1; i--) {
										if (jagexStrings[i] != null
												&& (jagexStrings[i]
														.method818(
																Class4_Sub16.aJagexString_2305,
																(byte) -105))) {
											Class4_Sub20_Sub3.anInt2808++;
											int i_22_ = 0;
											int i_23_ = 0;
											if ((arg0.anInt2814 ^ 0xffffffff) < ((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3584) ^ 0xffffffff))
												i_22_ = 2000;
											if ((i ^ 0xffffffff) == -1)
												i_23_ = 43 - -i_22_;
											if ((i ^ 0xffffffff) == -2)
												i_23_ = i_22_ + 58;
											if (i == 2)
												i_23_ = i_22_ + 44;
											if (i == 3)
												i_23_ = 3 + i_22_;
											if ((i ^ 0xffffffff) == -5)
												i_23_ = 47 - -i_22_;
											Class4_Sub20_Sub4
													.method359(
															(Class4_Sub24
																	.method639(
																			(new JagexString[] {
																					Class80.aJagexString_1641,
                                                                                    jagexString}),
																			arg2
																					^ ~0x7db)),
															arg3, arg1, i_23_,
															arg4, (byte) 120,
															jagexStrings[i]);
										}
									}
								}
								Class4_Sub20_Sub4.method359((Class4_Sub24
										.method639(
												new JagexString[] {
														Class80.aJagexString_1641,
                                                        jagexString}, -842)),
										arg3, arg1, 1004, arg4, (byte) 110,
										StringUtilities.aJagexString_665);
							} else {
								if ((0x2 & Class35.anInt740 ^ 0xffffffff) != -3)
									break;
								Class4_Sub20_Sub4.method359(
										(Class4_Sub24.method639((new JagexString[] {
												Class5.aJagexString_194,
												Class4_Sub14.aJagexString_2271,
                                                jagexString}), -842)), arg3, arg1,
										38, arg4, (byte) 120,
										Class82.aJagexString_1714);
								Class9.anInt270++;
							}
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4
						.method423(runtimeexception,
								("lc.C(" + (arg0 != null ? "{...}" : "null")
										+ ',' + arg1 + ',' + arg2 + ',' + arg3
										+ ',' + arg4 + ')'));
			}
			break;
		} while (false);
	}

	public static void method948(int arg0) {
		try {
			StringUtilities.aJagexString_843 = null;
			anIntArray841 = null;
			StringUtilities.aJagexString_857 = null;
			aShortArrayArray854 = null;
			aClass66_853 = null;
			anIntArray852 = null;
			aClass4_Sub13_855 = null;
			aClass19_Sub1_856 = null;
			StringUtilities.aJagexString_846 = null;
			StringUtilities.aJagexString_850 = null;
			aClass59Array849 = null;
			StringUtilities.aJagexString_842 = null;
			StringUtilities.aJagexString_840 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "lc.A("
					+ arg0 + ')');
		}
	}

	public abstract void method943(int i, Component component);

	public abstract int method944(int i);

	public abstract void method947(int i, Component component);
}
