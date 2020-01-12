package com.jagex.runescape;

public class Class69 {
	public static boolean aBoolean1392;
	public static boolean aBoolean1400 = true;
	public static boolean[][] aBooleanArrayArray1439;
	public static boolean[][][][] aBooleanArrayArrayArrayArray1438;
	public static Class12[] aClass12Array1430;
	public static Class12[][] aClass12ArrayArray1423;
	public static Class65 aClass65_1394;
	public static Class67[] aClass67Array1424;
	public static int anInt1388 = 0;
	public static int anInt1390;
	public static int anInt1391;
	public static int anInt1393;
	public static int anInt1395;
	public static int anInt1396;
	public static int anInt1397;
	public static int anInt1399;
	public static int anInt1405;
	public static int anInt1406;
	public static int anInt1409;
	public static int anInt1410;
	public static int anInt1411;
	public static int anInt1412;
	public static int anInt1413;
	public static int anInt1414;
	public static int anInt1416;
	public static int anInt1420;
	public static int anInt1421;
	public static int anInt1425;
	public static int anInt1426;
	public static int anInt1428;
	public static int anInt1429;
	public static int anInt1434;
	public static int anInt1435;
	public static int anInt1440;
	public static int anInt1441;
	public static int anInt1444;
	public static int anInt1445;
	public static int[] anIntArray1398;
	public static int[] anIntArray1401;
	public static int[] anIntArray1404;
	public static int[] anIntArray1415;
	public static int[] anIntArray1422;
	public static int[] anIntArray1433;
	public static int[] anIntArray1436;
	public static int[] anIntArray1437;
	public static int[] anIntArray1442;
	public static int[] anIntArray1443;
	public static int[] anIntArray1446;
	public static int[] anIntArray1447;
	static {
		anInt1393 = 4;
		anInt1396 = 0;
		anInt1391 = 0;
		anIntArray1398 = new int[] { 53, -53, -53, 53 };
		anInt1413 = -1;
		anIntArray1401 = new int[] { 45, 45, -45, -45 };
		anIntArray1404 = new int[anInt1393];
		anIntArray1415 = new int[] { -45, 45, 45, -45 };
		anInt1411 = 0;
		anInt1416 = 0;
		anIntArray1422 = new int[] { -53, -53, 53, 53 };
		aClass67Array1424 = new Class67[100];
		anInt1409 = 0;
		aBoolean1392 = false;
		anInt1420 = -1;
		aClass12ArrayArray1423 = new Class12[anInt1393][500];
		aClass12Array1430 = new Class12[500];
		aClass65_1394 = new Class65();
		anIntArray1437 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		anIntArray1433 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
		aBooleanArrayArrayArrayArray1438 = new boolean[8][32][51][51];
		anIntArray1443 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
		anIntArray1436 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
		anIntArray1442 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		anIntArray1447 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
		anIntArray1446 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
	}

	public static void method1106() {
		aClass67Array1424 = null;
		anIntArray1398 = null;
		anIntArray1422 = null;
		anIntArray1415 = null;
		anIntArray1401 = null;
		anIntArray1404 = null;
		aClass12ArrayArray1423 = null;
		aClass12Array1430 = null;
		aClass65_1394 = null;
		anIntArray1443 = null;
		anIntArray1447 = null;
		anIntArray1433 = null;
		anIntArray1446 = null;
		anIntArray1437 = null;
		anIntArray1442 = null;
		anIntArray1436 = null;
		aBooleanArrayArrayArrayArray1438 = null;
		aBooleanArrayArray1439 = null;
	}

	public static int method1114(int arg0, int arg1) {
		arg1 = (127 - arg1) * (arg0 & 0x7f) >> 7;
		if (arg1 < 2)
			arg1 = 2;
		else if (arg1 > 126)
			arg1 = 126;
		return (arg0 & 0xff80) + arg1;
	}

	public static boolean method1118(int arg0, int arg1, int arg2) {
		int i = arg2 * anInt1390 + arg0 * anInt1410 >> 16;
		int i_50_ = arg2 * anInt1410 - arg0 * anInt1390 >> 16;
		int i_51_ = arg1 * anInt1399 + i_50_ * anInt1426 >> 16;
		int i_52_ = arg1 * anInt1426 - i_50_ * anInt1399 >> 16;
		if (i_51_ < 50 || i_51_ > 3500)
			return false;
		int i_53_ = anInt1445 + (i << 9) / i_51_;
		int i_54_ = anInt1440 + (i_52_ << 9) / i_51_;
		if (i_53_ < anInt1444 || i_53_ > anInt1434 || i_54_ < anInt1435
				|| i_54_ > anInt1441)
			return false;
		return true;
	}

	public static void method1120(int[] arg0, int arg1, int arg2, int arg3,
			int arg4) {
		anInt1444 = 0;
		anInt1435 = 0;
		anInt1434 = arg3;
		anInt1441 = arg4;
		anInt1445 = arg3 / 2;
		anInt1440 = arg4 / 2;
		boolean[][][][] bools = new boolean[9][32][53][53];
		for (int i = 128; i <= 384; i += 32) {
			for (int i_56_ = 0; i_56_ < 2048; i_56_ += 64) {
				anInt1399 = Class4_Sub20_Sub12_Sub3.SINE[i];
				anInt1426 = Class4_Sub20_Sub12_Sub3.COSINE[i];
				anInt1390 = Class4_Sub20_Sub12_Sub3.SINE[i_56_];
				anInt1410 = Class4_Sub20_Sub12_Sub3.COSINE[i_56_];
				int i_57_ = (i - 128) / 32;
				int i_58_ = i_56_ / 64;
				for (int i_59_ = -26; i_59_ <= 26; i_59_++) {
					for (int i_60_ = -26; i_60_ <= 26; i_60_++) {
						int i_61_ = i_59_ * 128;
						int i_62_ = i_60_ * 128;
						boolean bool = false;
						for (int i_63_ = -arg1; i_63_ <= arg2; i_63_ += 128) {
							if (method1118(i_61_, arg0[i_57_] + i_63_, i_62_)) {
								bool = true;
								break;
							}
						}
						bools[i_57_][i_58_][i_59_ + 25 + 1][i_60_ + 25 + 1] = bool;
					}
				}
			}
		}
		for (int i = 0; i < 8; i++) {
			for (int i_64_ = 0; i_64_ < 32; i_64_++) {
				for (int i_65_ = -25; i_65_ < 25; i_65_++) {
					for (int i_66_ = -25; i_66_ < 25; i_66_++) {
						boolean bool = false;
						while_14_: for (int i_67_ = -1; i_67_ <= 1; i_67_++) {
							for (int i_68_ = -1; i_68_ <= 1; i_68_++) {
								if (bools[i][i_64_][i_65_ + i_67_ + 25 + 1][i_66_
										+ i_68_ + 25 + 1]) {
									bool = true;
									break while_14_;
								}
								if (bools[i][(i_64_ + 1) % 31][i_65_ + i_67_
										+ 25 + 1][i_66_ + i_68_ + 25 + 1]) {
									bool = true;
									break while_14_;
								}
								if (bools[i + 1][i_64_][i_65_ + i_67_ + 25 + 1][i_66_
										+ i_68_ + 25 + 1]) {
									bool = true;
									break while_14_;
								}
								if (bools[i + 1][(i_64_ + 1) % 31][i_65_
										+ i_67_ + 25 + 1][i_66_ + i_68_ + 25
										+ 1]) {
									bool = true;
									break while_14_;
								}
							}
						}
						aBooleanArrayArrayArrayArray1438[i][i_64_][i_65_ + 25][i_66_ + 25] = bool;
					}
				}
			}
		}
	}

	public static void method1133(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7) {
		Class12 class12 = new Class12();
		class12.anInt340 = arg2 / 128;
		class12.anInt349 = arg3 / 128;
		class12.anInt353 = arg4 / 128;
		class12.anInt332 = arg5 / 128;
		class12.anInt360 = arg1;
		class12.anInt355 = arg2;
		class12.anInt354 = arg3;
		class12.anInt347 = arg4;
		class12.anInt337 = arg5;
		class12.anInt335 = arg6;
		class12.anInt333 = arg7;
		aClass12ArrayArray1423[arg0][anIntArray1404[arg0]++] = class12;
	}

	public Class4_Sub3[][][] aClass4_Sub3ArrayArrayArray1427;
	public Class67[] aClass67Array1407 = new Class67[5000];
	public int anInt1389 = 0;
	public int regionSizeY;
	public int anInt1403;

	public int regionSizeX;

	public int anInt1419;

	public int[][] anIntArrayArray1431;

	public int[][] anIntArrayArray1432;

	public int[][][] anIntArrayArrayArray1408;

	public int[][][] anIntArrayArrayArray1418;

	public Class69(int size, int sizeX, int sizeY, int[][][] arg3) {
		anInt1403 = 0;
		anIntArrayArray1431 = (new int[][] {
				{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
				{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
				{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
				{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } });
		anIntArrayArray1432 = new int[][] { new int[16],
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
				{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
				{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
		anInt1419 = size;
		regionSizeX = sizeX;
		regionSizeY = sizeY;
		aClass4_Sub3ArrayArrayArray1427 = new Class4_Sub3[size][sizeX][sizeY];
		anIntArrayArrayArray1408 = new int[size][sizeX + 1][sizeY + 1];
		anIntArrayArrayArray1418 = arg3;
		method1136();
	}

	public void method1098(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 != null)
			class4_sub3.aClass74_1910 = null;
	}

	public boolean method1099(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
			return false;
		if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
			return false;
		if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
			return false;
		if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7)
			return false;
		int i = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
		int i_0_ = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7)
				* (arg2 - arg4);
		int i_1_ = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6)
				* (arg4 - arg3);
		if (i * i_1_ > 0 && i_1_ * i_0_ > 0)
			return true;
		return false;
	}

	public boolean method1100(int arg0, int arg1, int arg2, int arg3, int arg4,
			Class4_Sub20_Sub7 arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11) {
		if (arg5 == null)
			return true;
		return method1145(arg0, arg8, arg9, arg10 - arg8 + 1, arg11 - arg9 + 1,
				arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	public int method1101(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 == null || class4_sub3.aClass74_1910 == null)
			return 0;
		return class4_sub3.aClass74_1910.anInt1509;
	}

	public void method1102(Class4_Sub20_Sub7_Sub2 arg0, int arg1, int arg2,
			int arg3, int arg4, int arg5) {
		boolean bool = true;
		int i = arg2;
		int i_2_ = arg2 + arg4;
		int i_3_ = arg3 - 1;
		int i_4_ = arg3 + arg5;
		for (int i_5_ = arg1; i_5_ <= arg1 + 1; i_5_++) {
			if (i_5_ != anInt1419) {
				for (int i_6_ = i; i_6_ <= i_2_; i_6_++) {
					if (i_6_ >= 0 && i_6_ < regionSizeX) {
						for (int i_7_ = i_3_; i_7_ <= i_4_; i_7_++) {
							if (i_7_ >= 0
									&& i_7_ < regionSizeY
									&& (!bool || i_6_ >= i_2_ || i_7_ >= i_4_ || i_7_ < arg3
											&& i_6_ != arg2)) {
								Class4_Sub3 class4_sub3 = (aClass4_Sub3ArrayArrayArray1427[i_5_][i_6_][i_7_]);
								if (class4_sub3 != null) {
									int i_8_ = (((anIntArrayArrayArray1418[i_5_][i_6_][i_7_])
											+ (anIntArrayArrayArray1418[i_5_][i_6_ + 1][i_7_])
											+ (anIntArrayArrayArray1418[i_5_][i_6_][i_7_ + 1]) + (anIntArrayArrayArray1418[i_5_][i_6_ + 1][i_7_ + 1])) / 4 - ((anIntArrayArrayArray1418[arg1][arg2][arg3])
											+ (anIntArrayArrayArray1418[arg1][arg2 + 1][arg3])
											+ (anIntArrayArrayArray1418[arg1][arg2][arg3 + 1]) + (anIntArrayArrayArray1418[arg1][arg2 + 1][arg3 + 1])) / 4);
									Class68 class68 = class4_sub3.aClass68_1898;
									if (class68 != null) {
										if (class68.aClass4_Sub20_Sub7_1372 instanceof Class4_Sub20_Sub7_Sub2) {
											Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = ((Class4_Sub20_Sub7_Sub2) (class68.aClass4_Sub20_Sub7_1372));
											Class4_Sub20_Sub7_Sub2
													.method415(
															arg0,
															class4_sub20_sub7_sub2,
															((i_6_ - arg2) * 128 + (1 - arg4) * 64),
															i_8_,
															((i_7_ - arg3) * 128 + (1 - arg5) * 64),
															bool);
										}
										if (class68.aClass4_Sub20_Sub7_1375 instanceof Class4_Sub20_Sub7_Sub2) {
											Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = ((Class4_Sub20_Sub7_Sub2) (class68.aClass4_Sub20_Sub7_1375));
											Class4_Sub20_Sub7_Sub2
													.method415(
															arg0,
															class4_sub20_sub7_sub2,
															((i_6_ - arg2) * 128 + (1 - arg4) * 64),
															i_8_,
															((i_7_ - arg3) * 128 + (1 - arg5) * 64),
															bool);
										}
									}
									for (int i_9_ = 0; i_9_ < class4_sub3.anInt1905; i_9_++) {
										Class67 class67 = (class4_sub3.aClass67Array1890[i_9_]);
										if (class67 != null
												&& (class67.aClass4_Sub20_Sub7_1366 instanceof Class4_Sub20_Sub7_Sub2)) {
											Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = ((Class4_Sub20_Sub7_Sub2) (class67.aClass4_Sub20_Sub7_1366));
											int i_10_ = (class67.anInt1356
													- class67.anInt1359 + 1);
											int i_11_ = (class67.anInt1347
													- class67.anInt1338 + 1);
											Class4_Sub20_Sub7_Sub2
													.method415(
															arg0,
															class4_sub20_sub7_sub2,
															((class67.anInt1359 - arg2) * 128)
																	+ (i_10_ - arg4)
																	* 64,
															i_8_,
															((class67.anInt1338 - arg3) * 128)
																	+ (i_11_ - arg5)
																	* 64, bool);
										}
									}
								}
							}
						}
					}
				}
				i--;
				bool = false;
			}
		}
	}

	public int method1103(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 == null)
			return 0;
		for (int i = 0; i < class4_sub3.anInt1905; i++) {
			Class67 class67 = class4_sub3.aClass67Array1890[i];
			if ((class67.anInt1361 >> 29 & 0x3) == 2
					&& class67.anInt1359 == arg1 && class67.anInt1338 == arg2)
				return class67.anInt1361;
		}
		return 0;
	}

	public void method1104(int arg0, int arg1, int arg2, int arg3) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 != null)
			aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2].anInt1897 = arg3;
	}

	public void method1105(Class67 arg0) {
		for (int i = arg0.anInt1359; i <= arg0.anInt1356; i++) {
			for (int i_12_ = arg0.anInt1338; i_12_ <= arg0.anInt1347; i_12_++) {
				Class4_Sub3 class4_sub3 = (aClass4_Sub3ArrayArrayArray1427[arg0.anInt1350][i][i_12_]);
				if (class4_sub3 != null) {
					for (int i_13_ = 0; i_13_ < class4_sub3.anInt1905; i_13_++) {
						if (class4_sub3.aClass67Array1890[i_13_] == arg0) {
							class4_sub3.anInt1905--;
							for (int i_14_ = i_13_; i_14_ < class4_sub3.anInt1905; i_14_++) {
								class4_sub3.aClass67Array1890[i_14_] = class4_sub3.aClass67Array1890[i_14_ + 1];
								class4_sub3.anIntArray1883[i_14_] = class4_sub3.anIntArray1883[i_14_ + 1];
							}
							class4_sub3.aClass67Array1890[(class4_sub3.anInt1905)] = null;
							break;
						}
					}
					class4_sub3.anInt1889 = 0;
					for (int i_15_ = 0; i_15_ < class4_sub3.anInt1905; i_15_++)
						class4_sub3.anInt1889 |= class4_sub3.anIntArray1883[i_15_];
				}
			}
		}
	}

	public void method1107(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 != null)
			class4_sub3.aClass25_1879 = null;
	}

	public Class74 method1108(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 == null || class4_sub3.aClass74_1910 == null)
			return null;
		return class4_sub3.aClass74_1910;
	}

	public void method1109(int arg0, int arg1) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[0][arg0][arg1];
		for (int i = 0; i < 3; i++) {
			Class4_Sub3 class4_sub3_16_ = (aClass4_Sub3ArrayArrayArray1427[i][arg0][arg1] = aClass4_Sub3ArrayArrayArray1427[i + 1][arg0][arg1]);
			if (class4_sub3_16_ != null) {
				class4_sub3_16_.anInt1901--;
				for (int i_17_ = 0; i_17_ < class4_sub3_16_.anInt1905; i_17_++) {
					Class67 class67 = class4_sub3_16_.aClass67Array1890[i_17_];
					if ((class67.anInt1361 >> 29 & 0x3) == 2
							&& class67.anInt1359 == arg0
							&& class67.anInt1338 == arg1)
						class67.anInt1350--;
				}
			}
		}
		if (aClass4_Sub3ArrayArrayArray1427[0][arg0][arg1] == null)
			aClass4_Sub3ArrayArrayArray1427[0][arg0][arg1] = new Class4_Sub3(0,
					arg0, arg1);
		aClass4_Sub3ArrayArrayArray1427[0][arg0][arg1].aClass4_Sub3_1893 = class4_sub3;
		aClass4_Sub3ArrayArrayArray1427[3][arg0][arg1] = null;
	}

	public void method1110(Class4_Sub20_Sub7_Sub2 arg0, int arg1, int arg2,
			int arg3) {
		if (arg2 < regionSizeX) {
			Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg1][arg2 + 1][arg3];
			if (class4_sub3 != null
					&& class4_sub3.aClass74_1910 != null
					&& (class4_sub3.aClass74_1910.aClass4_Sub20_Sub7_1512 instanceof Class4_Sub20_Sub7_Sub2)) {
				Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = ((Class4_Sub20_Sub7_Sub2) class4_sub3.aClass74_1910.aClass4_Sub20_Sub7_1512);
				Class4_Sub20_Sub7_Sub2.method415(arg0, class4_sub20_sub7_sub2,
						128, 0, 0, true);
			}
		}
		if (arg3 < regionSizeX) {
			Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg1][arg2][arg3 + 1];
			if (class4_sub3 != null
					&& class4_sub3.aClass74_1910 != null
					&& (class4_sub3.aClass74_1910.aClass4_Sub20_Sub7_1512 instanceof Class4_Sub20_Sub7_Sub2)) {
				Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = ((Class4_Sub20_Sub7_Sub2) class4_sub3.aClass74_1910.aClass4_Sub20_Sub7_1512);
				Class4_Sub20_Sub7_Sub2.method415(arg0, class4_sub20_sub7_sub2,
						0, 0, 128, true);
			}
		}
		if (arg2 < regionSizeX && arg3 < regionSizeY) {
			Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg1][arg2 + 1][arg3 + 1];
			if (class4_sub3 != null
					&& class4_sub3.aClass74_1910 != null
					&& (class4_sub3.aClass74_1910.aClass4_Sub20_Sub7_1512 instanceof Class4_Sub20_Sub7_Sub2)) {
				Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = ((Class4_Sub20_Sub7_Sub2) class4_sub3.aClass74_1910.aClass4_Sub20_Sub7_1512);
				Class4_Sub20_Sub7_Sub2.method415(arg0, class4_sub20_sub7_sub2,
						128, 0, 128, true);
			}
		}
		if (arg2 < regionSizeX && arg3 > 0) {
			Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg1][arg2 + 1][arg3 - 1];
			if (class4_sub3 != null
					&& class4_sub3.aClass74_1910 != null
					&& (class4_sub3.aClass74_1910.aClass4_Sub20_Sub7_1512 instanceof Class4_Sub20_Sub7_Sub2)) {
				Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = ((Class4_Sub20_Sub7_Sub2) class4_sub3.aClass74_1910.aClass4_Sub20_Sub7_1512);
				Class4_Sub20_Sub7_Sub2.method415(arg0, class4_sub20_sub7_sub2,
						128, 0, -128, true);
			}
		}
	}

	public Class25 method1111(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 == null)
			return null;
		return class4_sub3.aClass25_1879;
	}

	public void method1112(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 != null) {
			for (int i = 0; i < class4_sub3.anInt1905; i++) {
				Class67 class67 = class4_sub3.aClass67Array1890[i];
				if ((class67.anInt1361 >> 29 & 0x3) == 2
						&& class67.anInt1359 == arg1
						&& class67.anInt1338 == arg2) {
					method1105(class67);
					break;
				}
			}
		}
	}

	public void method1113(int arg0, int arg1, int arg2, int arg3,
			Class4_Sub20_Sub7 arg4, Class4_Sub20_Sub7 arg5, int arg6, int arg7,
			int arg8, int arg9) {
		if (arg4 != null || arg5 != null) {
			Class68 class68 = new Class68();
			class68.anInt1371 = arg8;
			class68.anInt1369 = arg9;
			class68.anInt1370 = arg1 * 128 + 64;
			class68.anInt1380 = arg2 * 128 + 64;
			class68.anInt1373 = arg3;
			class68.aClass4_Sub20_Sub7_1372 = arg4;
			class68.aClass4_Sub20_Sub7_1375 = arg5;
			class68.anInt1387 = arg6;
			class68.anInt1381 = arg7;
			for (int i = arg0; i >= 0; i--) {
				if (aClass4_Sub3ArrayArrayArray1427[i][arg1][arg2] == null)
					aClass4_Sub3ArrayArrayArray1427[i][arg1][arg2] = new Class4_Sub3(
							i, arg1, arg2);
			}
			aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2].aClass68_1898 = class68;
		}
	}

	public Class67 method1115(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 == null)
			return null;
		for (int i = 0; i < class4_sub3.anInt1905; i++) {
			Class67 class67 = class4_sub3.aClass67Array1890[i];
			if ((class67.anInt1361 >> 29 & 0x3) == 2
					&& class67.anInt1359 == arg1 && class67.anInt1338 == arg2)
				return class67;
		}
		return null;
	}

	public void method1116(Class51 arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {
		int i = arg0.anIntArray1041.length;
		for (int i_18_ = 0; i_18_ < i; i_18_++) {
			int i_19_ = arg0.anIntArray1041[i_18_] - anInt1395;
			int i_20_ = arg0.anIntArray1042[i_18_] - anInt1429;
			int i_21_ = arg0.anIntArray1032[i_18_] - anInt1406;
			int i_22_ = i_21_ * arg3 + i_19_ * arg4 >> 16;
			i_21_ = i_21_ * arg4 - i_19_ * arg3 >> 16;
			i_19_ = i_22_;
			i_22_ = i_20_ * arg2 - i_21_ * arg1 >> 16;
			i_21_ = i_20_ * arg1 + i_21_ * arg2 >> 16;
			i_20_ = i_22_;
			if (i_21_ < 50)
				return;
			if (arg0.anIntArray1046 != null) {
				Class51.anIntArray1044[i_18_] = i_19_;
				Class51.anIntArray1049[i_18_] = i_20_;
				Class51.anIntArray1035[i_18_] = i_21_;
			}
			Class51.anIntArray1029[i_18_] = Class4_Sub20_Sub12_Sub3.anInt3535
					+ (i_19_ << 9) / i_21_;
			Class51.anIntArray1036[i_18_] = Class4_Sub20_Sub12_Sub3.anInt3532
					+ (i_20_ << 9) / i_21_;
		}
		Class4_Sub20_Sub12_Sub3.anInt3531 = 0;
		i = arg0.anIntArray1028.length;
		for (int i_23_ = 0; i_23_ < i; i_23_++) {
			int i_24_ = arg0.anIntArray1028[i_23_];
			int i_25_ = arg0.anIntArray1033[i_23_];
			int i_26_ = arg0.anIntArray1048[i_23_];
			int i_27_ = Class51.anIntArray1029[i_24_];
			int i_28_ = Class51.anIntArray1029[i_25_];
			int i_29_ = Class51.anIntArray1029[i_26_];
			int i_30_ = Class51.anIntArray1036[i_24_];
			int i_31_ = Class51.anIntArray1036[i_25_];
			int i_32_ = Class51.anIntArray1036[i_26_];
			if ((i_27_ - i_28_) * (i_32_ - i_31_) - (i_30_ - i_31_)
					* (i_29_ - i_28_) > 0) {
				Class4_Sub20_Sub12_Sub3.aBoolean3522 = false;
				if (i_27_ < 0 || i_28_ < 0 || i_29_ < 0
						|| i_27_ > Class4_Sub20_Sub12_Sub3.anInt3525
						|| i_28_ > Class4_Sub20_Sub12_Sub3.anInt3525
						|| i_29_ > Class4_Sub20_Sub12_Sub3.anInt3525)
					Class4_Sub20_Sub12_Sub3.aBoolean3522 = true;
				if (aBoolean1392
						&& method1099(anInt1388, anInt1409, i_30_, i_31_,
								i_32_, i_27_, i_28_, i_29_)) {
					anInt1420 = arg5;
					anInt1413 = arg6;
				}
				if (arg0.anIntArray1046 == null
						|| arg0.anIntArray1046[i_23_] == -1) {
					if (arg0.anIntArray1037[i_23_] != 12345678)
						Class4_Sub20_Sub12_Sub3.method549(i_30_, i_31_, i_32_,
								i_27_, i_28_, i_29_,
								arg0.anIntArray1037[i_23_],
								arg0.anIntArray1040[i_23_],
								arg0.aSneakyArray[i_23_]);
				} else if (!aBoolean1400) {
					if (arg0.aBoolean1038)
						Class4_Sub20_Sub12_Sub3.method541(i_30_, i_31_, i_32_,
								i_27_, i_28_, i_29_,
								arg0.anIntArray1037[i_23_],
								arg0.anIntArray1040[i_23_],
								arg0.aSneakyArray[i_23_],
								Class51.anIntArray1044[0],
								Class51.anIntArray1044[1],
								Class51.anIntArray1044[3],
								Class51.anIntArray1049[0],
								Class51.anIntArray1049[1],
								Class51.anIntArray1049[3],
								Class51.anIntArray1035[0],
								Class51.anIntArray1035[1],
								Class51.anIntArray1035[3],
								arg0.anIntArray1046[i_23_]);
					else
						Class4_Sub20_Sub12_Sub3.method541(i_30_, i_31_, i_32_,
								i_27_, i_28_, i_29_,
								arg0.anIntArray1037[i_23_],
								arg0.anIntArray1040[i_23_],
								arg0.aSneakyArray[i_23_],
								Class51.anIntArray1044[i_24_],
								Class51.anIntArray1044[i_25_],
								Class51.anIntArray1044[i_26_],
								Class51.anIntArray1049[i_24_],
								Class51.anIntArray1049[i_25_],
								Class51.anIntArray1049[i_26_],
								Class51.anIntArray1035[i_24_],
								Class51.anIntArray1035[i_25_],
								Class51.anIntArray1035[i_26_],
								arg0.anIntArray1046[i_23_]);
				} else {
					int i_33_ = Class4_Sub20_Sub12_Sub3.anInterface2_3530
							.method8(103, arg0.anIntArray1046[i_23_]);
					Class4_Sub20_Sub12_Sub3.method549(i_30_, i_31_, i_32_,
							i_27_, i_28_, i_29_,
							method1114(i_33_, arg0.anIntArray1037[i_23_]),
							method1114(i_33_, arg0.anIntArray1040[i_23_]),
							method1114(i_33_, arg0.aSneakyArray[i_23_]));
				}
			}
		}
	}

	public void method1117() {
		int i = anIntArray1404[anInt1396];
		Class12[] class12s = aClass12ArrayArray1423[anInt1396];
		anInt1416 = 0;
		for (int i_34_ = 0; i_34_ < i; i_34_++) {
			Class12 class12 = class12s[i_34_];
			if (class12.anInt360 == 1) {
				int i_35_ = class12.anInt340 - anInt1397 + 25;
				if (i_35_ >= 0 && i_35_ <= 50) {
					int i_36_ = class12.anInt353 - anInt1412 + 25;
					if (i_36_ < 0)
						i_36_ = 0;
					int i_37_ = class12.anInt332 - anInt1412 + 25;
					if (i_37_ > 50)
						i_37_ = 50;
					boolean bool = false;
					while (i_36_ <= i_37_) {
						if (aBooleanArrayArray1439[i_35_][i_36_++]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						int i_38_ = anInt1395 - class12.anInt355;
						if (i_38_ > 32)
							class12.anInt351 = 1;
						else {
							if (i_38_ >= -32)
								continue;
							class12.anInt351 = 2;
							i_38_ = -i_38_;
						}
						class12.anInt334 = (class12.anInt347 - anInt1406 << 8)
								/ i_38_;
						class12.anInt343 = (class12.anInt337 - anInt1406 << 8)
								/ i_38_;
						class12.anInt365 = (class12.anInt335 - anInt1429 << 8)
								/ i_38_;
						class12.anInt352 = (class12.anInt333 - anInt1429 << 8)
								/ i_38_;
						aClass12Array1430[anInt1416++] = class12;
					}
				}
			} else if (class12.anInt360 == 2) {
				int i_39_ = class12.anInt353 - anInt1412 + 25;
				if (i_39_ >= 0 && i_39_ <= 50) {
					int i_40_ = class12.anInt340 - anInt1397 + 25;
					if (i_40_ < 0)
						i_40_ = 0;
					int i_41_ = class12.anInt349 - anInt1397 + 25;
					if (i_41_ > 50)
						i_41_ = 50;
					boolean bool = false;
					while (i_40_ <= i_41_) {
						if (aBooleanArrayArray1439[i_40_++][i_39_]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						int i_42_ = anInt1406 - class12.anInt347;
						if (i_42_ > 32)
							class12.anInt351 = 3;
						else {
							if (i_42_ >= -32)
								continue;
							class12.anInt351 = 4;
							i_42_ = -i_42_;
						}
						class12.anInt362 = (class12.anInt355 - anInt1395 << 8)
								/ i_42_;
						class12.anInt339 = (class12.anInt354 - anInt1395 << 8)
								/ i_42_;
						class12.anInt365 = (class12.anInt335 - anInt1429 << 8)
								/ i_42_;
						class12.anInt352 = (class12.anInt333 - anInt1429 << 8)
								/ i_42_;
						aClass12Array1430[anInt1416++] = class12;
					}
				}
			} else if (class12.anInt360 == 4) {
				int i_43_ = class12.anInt335 - anInt1429;
				if (i_43_ > 128) {
					int i_44_ = class12.anInt353 - anInt1412 + 25;
					if (i_44_ < 0)
						i_44_ = 0;
					int i_45_ = class12.anInt332 - anInt1412 + 25;
					if (i_45_ > 50)
						i_45_ = 50;
					if (i_44_ <= i_45_) {
						int i_46_ = class12.anInt340 - anInt1397 + 25;
						if (i_46_ < 0)
							i_46_ = 0;
						int i_47_ = class12.anInt349 - anInt1397 + 25;
						if (i_47_ > 50)
							i_47_ = 50;
						boolean bool = false;
						while_13_: for (int i_48_ = i_46_; i_48_ <= i_47_; i_48_++) {
							for (int i_49_ = i_44_; i_49_ <= i_45_; i_49_++) {
								if (aBooleanArrayArray1439[i_48_][i_49_]) {
									bool = true;
									break while_13_;
								}
							}
						}
						if (bool) {
							class12.anInt351 = 5;
							class12.anInt362 = (class12.anInt355 - anInt1395 << 8)
									/ i_43_;
							class12.anInt339 = (class12.anInt354 - anInt1395 << 8)
									/ i_43_;
							class12.anInt334 = (class12.anInt347 - anInt1406 << 8)
									/ i_43_;
							class12.anInt343 = (class12.anInt337 - anInt1406 << 8)
									/ i_43_;
							aClass12Array1430[anInt1416++] = class12;
						}
					}
				}
			}
		}
	}

	public void method1119(int arg0, int arg1, int arg2, int arg3,
			Class4_Sub20_Sub7 arg4, int arg5, Class4_Sub20_Sub7 arg6,
			Class4_Sub20_Sub7 arg7) {
		Class61 class61 = new Class61();
		class61.aClass4_Sub20_Sub7_1217 = arg4;
		class61.anInt1216 = arg1 * 128 + 64;
		class61.anInt1200 = arg2 * 128 + 64;
		class61.anInt1204 = arg3;
		class61.anInt1219 = arg5;
		class61.aClass4_Sub20_Sub7_1205 = arg6;
		class61.aClass4_Sub20_Sub7_1197 = arg7;
		int i = 0;
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 != null) {
			for (int i_55_ = 0; i_55_ < class4_sub3.anInt1905; i_55_++) {
				if (((class4_sub3.aClass67Array1890[i_55_].anInt1362 & 0x100) == 256)
						&& ((class4_sub3.aClass67Array1890[i_55_].aClass4_Sub20_Sub7_1366) instanceof Class4_Sub20_Sub7_Sub7)) {
					Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = ((Class4_Sub20_Sub7_Sub7) (class4_sub3.aClass67Array1890[i_55_].aClass4_Sub20_Sub7_1366));
					class4_sub20_sub7_sub7.method446();
					if (class4_sub20_sub7_sub7.anInt2938 > i)
						i = class4_sub20_sub7_sub7.anInt2938;
				}
			}
		}
		class61.anInt1214 = i;
		if (aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2] == null)
			aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2] = new Class4_Sub3(
					arg0, arg1, arg2);
		aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2].aClass61_1891 = class61;
	}

	public void method1121(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		if (arg0 < 0)
			arg0 = 0;
		else if (arg0 >= regionSizeX * 128)
			arg0 = regionSizeX * 128 - 1;
		if (arg2 < 0)
			arg2 = 0;
		else if (arg2 >= regionSizeY * 128)
			arg2 = regionSizeY * 128 - 1;
		anInt1414++;
		anInt1399 = Class4_Sub20_Sub12_Sub3.SINE[arg3];
		anInt1426 = Class4_Sub20_Sub12_Sub3.COSINE[arg3];
		anInt1390 = Class4_Sub20_Sub12_Sub3.SINE[arg4];
		anInt1410 = Class4_Sub20_Sub12_Sub3.COSINE[arg4];
		aBooleanArrayArray1439 = aBooleanArrayArrayArrayArray1438[(arg3 - 128) / 32][arg4 / 64];
		anInt1395 = arg0;
		anInt1429 = arg1;
		anInt1406 = arg2;
		anInt1397 = arg0 / 128;
		anInt1412 = arg2 / 128;
		anInt1396 = arg5;
		anInt1421 = anInt1397 - 25;
		if (anInt1421 < 0)
			anInt1421 = 0;
		anInt1405 = anInt1412 - 25;
		if (anInt1405 < 0)
			anInt1405 = 0;
		anInt1425 = anInt1397 + 25;
		if (anInt1425 > regionSizeX)
			anInt1425 = regionSizeX;
		anInt1428 = anInt1412 + 25;
		if (anInt1428 > regionSizeY)
			anInt1428 = regionSizeY;
		method1117();
		anInt1391 = 0;
		for (int i = anInt1403; i < anInt1419; i++) {
			Class4_Sub3[][] class4_sub3s = aClass4_Sub3ArrayArrayArray1427[i];
			for (int i_69_ = anInt1421; i_69_ < anInt1425; i_69_++) {
				for (int i_70_ = anInt1405; i_70_ < anInt1428; i_70_++) {
					Class4_Sub3 class4_sub3 = class4_sub3s[i_69_][i_70_];
					if (class4_sub3 != null) {
						if (class4_sub3.anInt1897 > arg5
								|| (!(aBooleanArrayArray1439[i_69_ - anInt1397
										+ 25][i_70_ - anInt1412 + 25]) && (anIntArrayArrayArray1418[i][i_69_][i_70_] - arg1) < 2000)) {
							class4_sub3.aBoolean1885 = false;
							class4_sub3.aBoolean1881 = false;
							class4_sub3.anInt1909 = 0;
						} else {
							class4_sub3.aBoolean1885 = true;
							class4_sub3.aBoolean1881 = true;
							if (class4_sub3.anInt1905 > 0)
								class4_sub3.aBoolean1877 = true;
							else
								class4_sub3.aBoolean1877 = false;
							anInt1391++;
						}
					}
				}
			}
		}
		for (int i = anInt1403; i < anInt1419; i++) {
			Class4_Sub3[][] class4_sub3s = aClass4_Sub3ArrayArrayArray1427[i];
			for (int i_71_ = -25; i_71_ <= 0; i_71_++) {
				int i_72_ = anInt1397 + i_71_;
				int i_73_ = anInt1397 - i_71_;
				if (i_72_ >= anInt1421 || i_73_ < anInt1425) {
					for (int i_74_ = -25; i_74_ <= 0; i_74_++) {
						int i_75_ = anInt1412 + i_74_;
						int i_76_ = anInt1412 - i_74_;
						if (i_72_ >= anInt1421) {
							if (i_75_ >= anInt1405) {
								Class4_Sub3 class4_sub3 = class4_sub3s[i_72_][i_75_];
								if (class4_sub3 != null
										&& class4_sub3.aBoolean1885)
									method1144(class4_sub3, true);
							}
							if (i_76_ < anInt1428) {
								Class4_Sub3 class4_sub3 = class4_sub3s[i_72_][i_76_];
								if (class4_sub3 != null
										&& class4_sub3.aBoolean1885)
									method1144(class4_sub3, true);
							}
						}
						if (i_73_ < anInt1425) {
							if (i_75_ >= anInt1405) {
								Class4_Sub3 class4_sub3 = class4_sub3s[i_73_][i_75_];
								if (class4_sub3 != null
										&& class4_sub3.aBoolean1885)
									method1144(class4_sub3, true);
							}
							if (i_76_ < anInt1428) {
								Class4_Sub3 class4_sub3 = class4_sub3s[i_73_][i_76_];
								if (class4_sub3 != null
										&& class4_sub3.aBoolean1885)
									method1144(class4_sub3, true);
							}
						}
						if (anInt1391 == 0) {
							aBoolean1392 = false;
							return;
						}
					}
				}
			}
		}
		for (int i = anInt1403; i < anInt1419; i++) {
			Class4_Sub3[][] class4_sub3s = aClass4_Sub3ArrayArrayArray1427[i];
			for (int i_77_ = -25; i_77_ <= 0; i_77_++) {
				int i_78_ = anInt1397 + i_77_;
				int i_79_ = anInt1397 - i_77_;
				if (i_78_ >= anInt1421 || i_79_ < anInt1425) {
					for (int i_80_ = -25; i_80_ <= 0; i_80_++) {
						int i_81_ = anInt1412 + i_80_;
						int i_82_ = anInt1412 - i_80_;
						if (i_78_ >= anInt1421) {
							if (i_81_ >= anInt1405) {
								Class4_Sub3 class4_sub3 = class4_sub3s[i_78_][i_81_];
								if (class4_sub3 != null
										&& class4_sub3.aBoolean1885)
									method1144(class4_sub3, false);
							}
							if (i_82_ < anInt1428) {
								Class4_Sub3 class4_sub3 = class4_sub3s[i_78_][i_82_];
								if (class4_sub3 != null
										&& class4_sub3.aBoolean1885)
									method1144(class4_sub3, false);
							}
						}
						if (i_79_ < anInt1425) {
							if (i_81_ >= anInt1405) {
								Class4_Sub3 class4_sub3 = class4_sub3s[i_79_][i_81_];
								if (class4_sub3 != null
										&& class4_sub3.aBoolean1885)
									method1144(class4_sub3, false);
							}
							if (i_82_ < anInt1428) {
								Class4_Sub3 class4_sub3 = class4_sub3s[i_79_][i_82_];
								if (class4_sub3 != null
										&& class4_sub3.aBoolean1885)
									method1144(class4_sub3, false);
							}
						}
						if (anInt1391 == 0) {
							aBoolean1392 = false;
							return;
						}
					}
				}
			}
		}
		aBoolean1392 = false;
	}

	public void method1122(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 != null)
			class4_sub3.aClass61_1891 = null;
	}

	public void method1123(int arg0, int arg1, int arg2, int arg3,
			Class4_Sub20_Sub7 arg4, int arg5, int arg6, int arg7, int arg8,
			int arg9, int arg10) {
		if (arg4 != null) {
			Class25 class25 = new Class25();
			class25.anInt572 = arg9;
			class25.anInt588 = arg10;
			class25.anInt573 = arg1 * 128 + 64 + arg7;
			class25.anInt569 = arg2 * 128 + 64 + arg8;
			class25.anInt576 = arg3;
			class25.aClass4_Sub20_Sub7_570 = arg4;
			class25.anInt571 = arg5;
			class25.anInt591 = arg6;
			for (int i = arg0; i >= 0; i--) {
				if (aClass4_Sub3ArrayArrayArray1427[i][arg1][arg2] == null)
					aClass4_Sub3ArrayArrayArray1427[i][arg1][arg2] = new Class4_Sub3(
							i, arg1, arg2);
			}
			aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2].aClass25_1879 = class25;
		}
	}

	public boolean method1124(int arg0, int arg1, int arg2, int arg3) {
		if (!method1138(arg0, arg1, arg2))
			return false;
		int i = arg1 << 7;
		int i_83_ = arg2 << 7;
		if (method1135(i + 1,
				anIntArrayArrayArray1418[arg0][arg1][arg2] - arg3, i_83_ + 1)
				&& method1135(
						i + 128 - 1,
						(anIntArrayArrayArray1418[arg0][arg1 + 1][arg2] - arg3),
						i_83_ + 1)
				&& method1135(
						i + 128 - 1,
						(anIntArrayArrayArray1418[arg0][arg1 + 1][arg2 + 1] - arg3),
						i_83_ + 128 - 1)
				&& method1135(
						i + 1,
						(anIntArrayArrayArray1418[arg0][arg1][arg2 + 1] - arg3),
						i_83_ + 128 - 1))
			return true;
		return false;
	}

	public void method1125(int arg0, int arg1, int arg2) {
		for (int i = 0; i < anInt1419; i++) {
			for (int i_84_ = 0; i_84_ < regionSizeX; i_84_++) {
				for (int i_85_ = 0; i_85_ < regionSizeY; i_85_++) {
					Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[i][i_84_][i_85_];
					if (class4_sub3 != null) {
						Class68 class68 = class4_sub3.aClass68_1898;
						if (class68 != null
								&& (class68.aClass4_Sub20_Sub7_1372 instanceof Class4_Sub20_Sub7_Sub2)) {
							Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = ((Class4_Sub20_Sub7_Sub2) class68.aClass4_Sub20_Sub7_1372);
							method1102(class4_sub20_sub7_sub2, i, i_84_, i_85_,
									1, 1);
							if (class68.aClass4_Sub20_Sub7_1375 instanceof Class4_Sub20_Sub7_Sub2) {
								Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2_86_ = ((Class4_Sub20_Sub7_Sub2) class68.aClass4_Sub20_Sub7_1375);
								method1102(class4_sub20_sub7_sub2_86_, i,
										i_84_, i_85_, 1, 1);
								Class4_Sub20_Sub7_Sub2.method415(
										class4_sub20_sub7_sub2,
										class4_sub20_sub7_sub2_86_, 0, 0, 0,
										false);
								class68.aClass4_Sub20_Sub7_1375 = (class4_sub20_sub7_sub2_86_
										.method411(
												class4_sub20_sub7_sub2_86_.aShort3313,
												class4_sub20_sub7_sub2_86_.aShort3310,
												arg0, arg1, arg2));
							}
							class68.aClass4_Sub20_Sub7_1372 = (class4_sub20_sub7_sub2
									.method411(
											class4_sub20_sub7_sub2.aShort3313,
											class4_sub20_sub7_sub2.aShort3310,
											arg0, arg1, arg2));
						}
						for (int i_87_ = 0; i_87_ < class4_sub3.anInt1905; i_87_++) {
							Class67 class67 = class4_sub3.aClass67Array1890[i_87_];
							if (class67 != null
									&& (class67.aClass4_Sub20_Sub7_1366 instanceof Class4_Sub20_Sub7_Sub2)) {
								Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = ((Class4_Sub20_Sub7_Sub2) class67.aClass4_Sub20_Sub7_1366);
								method1102(
										class4_sub20_sub7_sub2,
										i,
										i_84_,
										i_85_,
										(class67.anInt1356 - class67.anInt1359 + 1),
										(class67.anInt1347 - class67.anInt1338 + 1));
								class67.aClass4_Sub20_Sub7_1366 = (class4_sub20_sub7_sub2
										.method411(
												class4_sub20_sub7_sub2.aShort3313,
												class4_sub20_sub7_sub2.aShort3310,
												arg0, arg1, arg2));
							}
						}
						Class74 class74 = class4_sub3.aClass74_1910;
						if (class74 != null
								&& (class74.aClass4_Sub20_Sub7_1512 instanceof Class4_Sub20_Sub7_Sub2)) {
							Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = ((Class4_Sub20_Sub7_Sub2) class74.aClass4_Sub20_Sub7_1512);
							method1110(class4_sub20_sub7_sub2, i, i_84_, i_85_);
							class74.aClass4_Sub20_Sub7_1512 = (class4_sub20_sub7_sub2
									.method411(
											class4_sub20_sub7_sub2.aShort3313,
											class4_sub20_sub7_sub2.aShort3310,
											arg0, arg1, arg2));
						}
					}
				}
			}
		}
	}

	public int method1126(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 == null || class4_sub3.aClass68_1898 == null)
			return 0;
		return class4_sub3.aClass68_1898.anInt1371;
	}

	public void method1127(int arg0, int arg1, int arg2, int arg3) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 != null) {
			Class25 class25 = class4_sub3.aClass25_1879;
			if (class25 != null) {
				int i = arg1 * 128 + 64;
				int i_88_ = arg2 * 128 + 64;
				class25.anInt573 = i + (class25.anInt573 - i) * arg3 / 16;
				class25.anInt569 = i_88_ + (class25.anInt569 - i_88_) * arg3
						/ 16;
			}
		}
	}

	public void method1128(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 != null)
			class4_sub3.aClass68_1898 = null;
	}

	public boolean method1129(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, Class4_Sub20_Sub7 arg6, int arg7, int arg8, int arg9) {
		if (arg6 == null)
			return true;
		int i = arg1 * 128 + 64 * arg4;
		int i_89_ = arg2 * 128 + 64 * arg5;
		return method1145(arg0, arg1, arg2, arg4, arg5, i, i_89_, arg3, arg6,
				arg7, false, arg8, arg9);
	}

	public boolean method1130(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		if (arg1 == arg2 && arg3 == arg4) {
			if (!method1138(arg0, arg1, arg3))
				return false;
			int i = arg1 << 7;
			int i_90_ = arg3 << 7;
			if (method1135(i + 1, anIntArrayArrayArray1418[arg0][arg1][arg3]
					- arg5, i_90_ + 1)
					&& method1135(
							i + 128 - 1,
							(anIntArrayArrayArray1418[arg0][arg1 + 1][arg3] - arg5),
							i_90_ + 1)
					&& method1135(
							i + 128 - 1,
							(anIntArrayArrayArray1418[arg0][arg1 + 1][arg3 + 1])
									- arg5, i_90_ + 128 - 1)
					&& method1135(
							i + 1,
							(anIntArrayArrayArray1418[arg0][arg1][arg3 + 1] - arg5),
							i_90_ + 128 - 1))
				return true;
			return false;
		}
		for (int i = arg1; i <= arg2; i++) {
			for (int i_91_ = arg3; i_91_ <= arg4; i_91_++) {
				if (anIntArrayArrayArray1408[arg0][i][i_91_] == -anInt1414)
					return false;
			}
		}
		int i = (arg1 << 7) + 1;
		int i_92_ = (arg3 << 7) + 2;
		int i_93_ = anIntArrayArrayArray1418[arg0][arg1][arg3] - arg5;
		if (!method1135(i, i_93_, i_92_))
			return false;
		int i_94_ = (arg2 << 7) - 1;
		if (!method1135(i_94_, i_93_, i_92_))
			return false;
		int i_95_ = (arg4 << 7) - 1;
		if (!method1135(i, i_93_, i_95_))
			return false;
		if (!method1135(i_94_, i_93_, i_95_))
			return false;
		return true;
	}

	public int method1131(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 == null || class4_sub3.aClass25_1879 == null)
			return 0;
		return class4_sub3.aClass25_1879.anInt572;
	}

	public boolean method1132(int arg0, int arg1, int arg2, int arg3, int arg4,
			Class4_Sub20_Sub7 arg5, int arg6, int arg7, boolean arg8) {
		if (arg5 == null)
			return true;
		int i = arg1 - arg4;
		int i_96_ = arg2 - arg4;
		int i_97_ = arg1 + arg4;
		int i_98_ = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408)
				i_98_ += 128;
			if (arg6 > 1152 && arg6 < 1920)
				i_97_ += 128;
			if (arg6 > 1664 || arg6 < 384)
				i_96_ -= 128;
			if (arg6 > 128 && arg6 < 896)
				i -= 128;
		}
		i /= 128;
		i_96_ /= 128;
		i_97_ /= 128;
		i_98_ /= 128;
		return method1145(arg0, i, i_96_, i_97_ - i + 1, i_98_ - i_96_ + 1,
				arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	public void method1134(int arg0, int arg1, int arg2, int arg3,
			Class4_Sub20_Sub7 arg4, int arg5, int arg6) {
		if (arg4 != null) {
			Class74 class74 = new Class74();
			class74.aClass4_Sub20_Sub7_1512 = arg4;
			class74.anInt1519 = arg1 * 128 + 64;
			class74.anInt1525 = arg2 * 128 + 64;
			class74.anInt1511 = arg3;
			class74.anInt1509 = arg5;
			class74.anInt1510 = arg6;
			if (aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2] == null)
				aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2] = new Class4_Sub3(
						arg0, arg1, arg2);
			aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2].aClass74_1910 = class74;
		}
	}

	public boolean method1135(int arg0, int arg1, int arg2) {
		for (int i = 0; i < anInt1416; i++) {
			Class12 class12 = aClass12Array1430[i];
			if (class12.anInt351 == 1) {
				int i_99_ = class12.anInt355 - arg0;
				if (i_99_ > 0) {
					int i_100_ = class12.anInt347
							+ (class12.anInt334 * i_99_ >> 8);
					int i_101_ = class12.anInt337
							+ (class12.anInt343 * i_99_ >> 8);
					int i_102_ = class12.anInt335
							+ (class12.anInt365 * i_99_ >> 8);
					int i_103_ = class12.anInt333
							+ (class12.anInt352 * i_99_ >> 8);
					if (arg2 >= i_100_ && arg2 <= i_101_ && arg1 >= i_102_
							&& arg1 <= i_103_)
						return true;
				}
			} else if (class12.anInt351 == 2) {
				int i_104_ = arg0 - class12.anInt355;
				if (i_104_ > 0) {
					int i_105_ = class12.anInt347
							+ (class12.anInt334 * i_104_ >> 8);
					int i_106_ = class12.anInt337
							+ (class12.anInt343 * i_104_ >> 8);
					int i_107_ = class12.anInt335
							+ (class12.anInt365 * i_104_ >> 8);
					int i_108_ = class12.anInt333
							+ (class12.anInt352 * i_104_ >> 8);
					if (arg2 >= i_105_ && arg2 <= i_106_ && arg1 >= i_107_
							&& arg1 <= i_108_)
						return true;
				}
			} else if (class12.anInt351 == 3) {
				int i_109_ = class12.anInt347 - arg2;
				if (i_109_ > 0) {
					int i_110_ = class12.anInt355
							+ (class12.anInt362 * i_109_ >> 8);
					int i_111_ = class12.anInt354
							+ (class12.anInt339 * i_109_ >> 8);
					int i_112_ = class12.anInt335
							+ (class12.anInt365 * i_109_ >> 8);
					int i_113_ = class12.anInt333
							+ (class12.anInt352 * i_109_ >> 8);
					if (arg0 >= i_110_ && arg0 <= i_111_ && arg1 >= i_112_
							&& arg1 <= i_113_)
						return true;
				}
			} else if (class12.anInt351 == 4) {
				int i_114_ = arg2 - class12.anInt347;
				if (i_114_ > 0) {
					int i_115_ = class12.anInt355
							+ (class12.anInt362 * i_114_ >> 8);
					int i_116_ = class12.anInt354
							+ (class12.anInt339 * i_114_ >> 8);
					int i_117_ = class12.anInt335
							+ (class12.anInt365 * i_114_ >> 8);
					int i_118_ = class12.anInt333
							+ (class12.anInt352 * i_114_ >> 8);
					if (arg0 >= i_115_ && arg0 <= i_116_ && arg1 >= i_117_
							&& arg1 <= i_118_)
						return true;
				}
			} else if (class12.anInt351 == 5) {
				int i_119_ = arg1 - class12.anInt335;
				if (i_119_ > 0) {
					int i_120_ = class12.anInt355
							+ (class12.anInt362 * i_119_ >> 8);
					int i_121_ = class12.anInt354
							+ (class12.anInt339 * i_119_ >> 8);
					int i_122_ = class12.anInt347
							+ (class12.anInt334 * i_119_ >> 8);
					int i_123_ = class12.anInt337
							+ (class12.anInt343 * i_119_ >> 8);
					if (arg0 >= i_120_ && arg0 <= i_121_ && arg2 >= i_122_
							&& arg2 <= i_123_)
						return true;
				}
			}
		}
		return false;
	}

	public void method1136() {
		for (int i = 0; i < anInt1419; i++) {
			for (int i_124_ = 0; i_124_ < regionSizeX; i_124_++) {
				for (int i_125_ = 0; i_125_ < regionSizeY; i_125_++)
					aClass4_Sub3ArrayArrayArray1427[i][i_124_][i_125_] = null;
			}
		}
		for (int i = 0; i < anInt1393; i++) {
			for (int i_126_ = 0; i_126_ < anIntArray1404[i]; i_126_++)
				aClass12ArrayArray1423[i][i_126_] = null;
			anIntArray1404[i] = 0;
		}
		for (int i = 0; i < anInt1389; i++)
			aClass67Array1407[i] = null;
		anInt1389 = 0;
		for (int i = 0; i < aClass67Array1424.length; i++)
			aClass67Array1424[i] = null;
	}

	public void method1137(int[] arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg3][arg4][arg5];
		if (class4_sub3 != null) {
			Class5 class5 = class4_sub3.aClass5_1904;
			if (class5 != null) {
				int i = class5.anInt192;
				if (i != 0) {
					for (int i_127_ = 0; i_127_ < 4; i_127_++) {
						arg0[arg1] = i;
						arg0[arg1 + 1] = i;
						arg0[arg1 + 2] = i;
						arg0[arg1 + 3] = i;
						arg1 += arg2;
					}
				}
			} else {
				Class51 class51 = class4_sub3.aClass51_1878;
				if (class51 != null) {
					int i = class51.anInt1030;
					int i_128_ = class51.anInt1045;
					int i_129_ = class51.anInt1043;
					int i_130_ = class51.anInt1034;
					int[] is = anIntArrayArray1432[i];
					int[] is_131_ = anIntArrayArray1431[i_128_];
					int i_132_ = 0;
					if (i_129_ != 0) {
						for (int i_133_ = 0; i_133_ < 4; i_133_++) {
							arg0[arg1] = is[is_131_[i_132_++]] == 0 ? i_129_
									: i_130_;
							arg0[arg1 + 1] = is[is_131_[i_132_++]] == 0 ? i_129_
									: i_130_;
							arg0[arg1 + 2] = is[is_131_[i_132_++]] == 0 ? i_129_
									: i_130_;
							arg0[arg1 + 3] = is[is_131_[i_132_++]] == 0 ? i_129_
									: i_130_;
							arg1 += arg2;
						}
					} else {
						for (int i_134_ = 0; i_134_ < 4; i_134_++) {
							if (is[is_131_[i_132_++]] != 0)
								arg0[arg1] = i_130_;
							if (is[is_131_[i_132_++]] != 0)
								arg0[arg1 + 1] = i_130_;
							if (is[is_131_[i_132_++]] != 0)
								arg0[arg1 + 2] = i_130_;
							if (is[is_131_[i_132_++]] != 0)
								arg0[arg1 + 3] = i_130_;
							arg1 += arg2;
						}
					}
				}
			}
		}
	}

	public boolean method1138(int arg0, int arg1, int arg2) {
		int i = anIntArrayArrayArray1408[arg0][arg1][arg2];
		if (i == -anInt1414)
			return false;
		if (i == anInt1414)
			return true;
		int i_135_ = arg1 << 7;
		int i_136_ = arg2 << 7;
		if (method1135(i_135_ + 1, anIntArrayArrayArray1418[arg0][arg1][arg2],
				i_136_ + 1)
				&& method1135(i_135_ + 128 - 1,
						anIntArrayArrayArray1418[arg0][arg1 + 1][arg2],
						i_136_ + 1)
				&& method1135(i_135_ + 128 - 1,
						anIntArrayArrayArray1418[arg0][arg1 + 1][arg2 + 1],
						i_136_ + 128 - 1)
				&& method1135(i_135_ + 1,
						anIntArrayArrayArray1418[arg0][arg1][arg2 + 1],
						i_136_ + 128 - 1)) {
			anIntArrayArrayArray1408[arg0][arg1][arg2] = anInt1414;
			return true;
		}
		anIntArrayArrayArray1408[arg0][arg1][arg2] = -anInt1414;
		return false;
	}

	public void method1139(int arg0, int arg1, int arg2) {
		aBoolean1392 = true;
		anInt1411 = arg0;
		anInt1388 = arg1;
		anInt1409 = arg2;
		anInt1420 = -1;
		anInt1413 = -1;
	}

	public void method1140() {
		for (int i = 0; i < anInt1389; i++) {
			Class67 class67 = aClass67Array1407[i];
			method1105(class67);
			aClass67Array1407[i] = null;
		}
		anInt1389 = 0;
	}

	public boolean method1141(int arg0, int arg1, int arg2, int arg3) {
		if (!method1138(arg0, arg1, arg2))
			return false;
		int i = arg1 << 7;
		int i_137_ = arg2 << 7;
		int i_138_ = anIntArrayArrayArray1418[arg0][arg1][arg2] - 1;
		int i_139_ = i_138_ - 120;
		int i_140_ = i_138_ - 230;
		int i_141_ = i_138_ - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (i > anInt1395) {
					if (!method1135(i, i_138_, i_137_))
						return false;
					if (!method1135(i, i_138_, i_137_ + 128))
						return false;
				}
				if (arg0 > 0) {
					if (!method1135(i, i_139_, i_137_))
						return false;
					if (!method1135(i, i_139_, i_137_ + 128))
						return false;
				}
				if (!method1135(i, i_140_, i_137_))
					return false;
				if (!method1135(i, i_140_, i_137_ + 128))
					return false;
				return true;
			}
			if (arg3 == 2) {
				if (i_137_ < anInt1406) {
					if (!method1135(i, i_138_, i_137_ + 128))
						return false;
					if (!method1135(i + 128, i_138_, i_137_ + 128))
						return false;
				}
				if (arg0 > 0) {
					if (!method1135(i, i_139_, i_137_ + 128))
						return false;
					if (!method1135(i + 128, i_139_, i_137_ + 128))
						return false;
				}
				if (!method1135(i, i_140_, i_137_ + 128))
					return false;
				if (!method1135(i + 128, i_140_, i_137_ + 128))
					return false;
				return true;
			}
			if (arg3 == 4) {
				if (i < anInt1395) {
					if (!method1135(i + 128, i_138_, i_137_))
						return false;
					if (!method1135(i + 128, i_138_, i_137_ + 128))
						return false;
				}
				if (arg0 > 0) {
					if (!method1135(i + 128, i_139_, i_137_))
						return false;
					if (!method1135(i + 128, i_139_, i_137_ + 128))
						return false;
				}
				if (!method1135(i + 128, i_140_, i_137_))
					return false;
				if (!method1135(i + 128, i_140_, i_137_ + 128))
					return false;
				return true;
			}
			if (arg3 == 8) {
				if (i_137_ > anInt1406) {
					if (!method1135(i, i_138_, i_137_))
						return false;
					if (!method1135(i + 128, i_138_, i_137_))
						return false;
				}
				if (arg0 > 0) {
					if (!method1135(i, i_139_, i_137_))
						return false;
					if (!method1135(i + 128, i_139_, i_137_))
						return false;
				}
				if (!method1135(i, i_140_, i_137_))
					return false;
				if (!method1135(i + 128, i_140_, i_137_))
					return false;
				return true;
			}
		}
		if (!method1135(i + 64, i_141_, i_137_ + 64))
			return false;
		if (arg3 == 16) {
			if (!method1135(i, i_140_, i_137_ + 128))
				return false;
			return true;
		}
		if (arg3 == 32) {
			if (!method1135(i + 128, i_140_, i_137_ + 128))
				return false;
			return true;
		}
		if (arg3 == 64) {
			if (!method1135(i + 128, i_140_, i_137_))
				return false;
			return true;
		}
		if (arg3 == 128) {
			if (!method1135(i, i_140_, i_137_))
				return false;
			return true;
		}
		return true;
	}

	public Class68 method1142(int arg0, int arg1, int arg2) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 == null)
			return null;
		return class4_sub3.aClass68_1898;
	}

	public void method1143(Class5 arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7) {
		int i_142_;
		int i = i_142_ = (arg6 << 7) - anInt1395;
		int i_144_;
		int i_143_ = i_144_ = (arg7 << 7) - anInt1406;
		int i_146_;
		int i_145_ = i_146_ = i + 128;
		int i_148_;
		int i_147_ = i_148_ = i_143_ + 128;
		int i_149_ = anIntArrayArrayArray1418[arg1][arg6][arg7] - anInt1429;
		int i_150_ = anIntArrayArrayArray1418[arg1][arg6 + 1][arg7] - anInt1429;
		int i_151_ = anIntArrayArrayArray1418[arg1][arg6 + 1][arg7 + 1]
				- anInt1429;
		int i_152_ = anIntArrayArrayArray1418[arg1][arg6][arg7 + 1] - anInt1429;
		int i_153_ = i_143_ * arg4 + i * arg5 >> 16;
		i_143_ = i_143_ * arg5 - i * arg4 >> 16;
		i = i_153_;
		i_153_ = i_149_ * arg3 - i_143_ * arg2 >> 16;
		i_143_ = i_149_ * arg2 + i_143_ * arg3 >> 16;
		i_149_ = i_153_;
		if (i_143_ >= 50) {
			i_153_ = i_144_ * arg4 + i_145_ * arg5 >> 16;
			i_144_ = i_144_ * arg5 - i_145_ * arg4 >> 16;
			i_145_ = i_153_;
			i_153_ = i_150_ * arg3 - i_144_ * arg2 >> 16;
			i_144_ = i_150_ * arg2 + i_144_ * arg3 >> 16;
			i_150_ = i_153_;
			if (i_144_ >= 50) {
				i_153_ = i_147_ * arg4 + i_146_ * arg5 >> 16;
				i_147_ = i_147_ * arg5 - i_146_ * arg4 >> 16;
				i_146_ = i_153_;
				i_153_ = i_151_ * arg3 - i_147_ * arg2 >> 16;
				i_147_ = i_151_ * arg2 + i_147_ * arg3 >> 16;
				i_151_ = i_153_;
				if (i_147_ >= 50) {
					i_153_ = i_148_ * arg4 + i_142_ * arg5 >> 16;
					i_148_ = i_148_ * arg5 - i_142_ * arg4 >> 16;
					i_142_ = i_153_;
					i_153_ = i_152_ * arg3 - i_148_ * arg2 >> 16;
					i_148_ = i_152_ * arg2 + i_148_ * arg3 >> 16;
					i_152_ = i_153_;
					if (i_148_ >= 50) {
						int i_154_ = (Class4_Sub20_Sub12_Sub3.anInt3535 + (i << 9)
								/ i_143_);
						int i_155_ = (Class4_Sub20_Sub12_Sub3.anInt3532 + (i_149_ << 9)
								/ i_143_);
						int i_156_ = (Class4_Sub20_Sub12_Sub3.anInt3535 + (i_145_ << 9)
								/ i_144_);
						int i_157_ = (Class4_Sub20_Sub12_Sub3.anInt3532 + (i_150_ << 9)
								/ i_144_);
						int i_158_ = (Class4_Sub20_Sub12_Sub3.anInt3535 + (i_146_ << 9)
								/ i_147_);
						int i_159_ = (Class4_Sub20_Sub12_Sub3.anInt3532 + (i_151_ << 9)
								/ i_147_);
						int i_160_ = (Class4_Sub20_Sub12_Sub3.anInt3535 + (i_142_ << 9)
								/ i_148_);
						int i_161_ = (Class4_Sub20_Sub12_Sub3.anInt3532 + (i_152_ << 9)
								/ i_148_);
						Class4_Sub20_Sub12_Sub3.anInt3531 = 0;
						if (((i_158_ - i_160_) * (i_157_ - i_161_) - (i_159_ - i_161_)
								* (i_156_ - i_160_)) > 0) {
							Class4_Sub20_Sub12_Sub3.aBoolean3522 = false;
							if (i_158_ < 0
									|| i_160_ < 0
									|| i_156_ < 0
									|| i_158_ > Class4_Sub20_Sub12_Sub3.anInt3525
									|| i_160_ > Class4_Sub20_Sub12_Sub3.anInt3525
									|| i_156_ > Class4_Sub20_Sub12_Sub3.anInt3525)
								Class4_Sub20_Sub12_Sub3.aBoolean3522 = true;
							if (aBoolean1392
									&& method1099(anInt1388, anInt1409, i_159_,
											i_161_, i_157_, i_158_, i_160_,
											i_156_)) {
								anInt1420 = arg6;
								anInt1413 = arg7;
							}
							if (arg0.anInt172 == -1) {
								if (arg0.anInt178 != 12345678)
									Class4_Sub20_Sub12_Sub3.method549(i_159_,
											i_161_, i_157_, i_158_, i_160_,
											i_156_, arg0.anInt178,
											arg0.anInt197, arg0.anInt183);
							} else if (!aBoolean1400) {
								if (arg0.aBoolean195)
									Class4_Sub20_Sub12_Sub3.method541(i_159_,
											i_161_, i_157_, i_158_, i_160_,
											i_156_, arg0.anInt178,
											arg0.anInt197, arg0.anInt183, i,
											i_145_, i_142_, i_149_, i_150_,
											i_152_, i_143_, i_144_, i_148_,
											arg0.anInt172);
								else
									Class4_Sub20_Sub12_Sub3.method541(i_159_,
											i_161_, i_157_, i_158_, i_160_,
											i_156_, arg0.anInt178,
											arg0.anInt197, arg0.anInt183,
											i_146_, i_142_, i_145_, i_151_,
											i_152_, i_150_, i_147_, i_148_,
											i_144_, arg0.anInt172);
							} else {
								int i_162_ = Class4_Sub20_Sub12_Sub3.anInterface2_3530
										.method8(79, arg0.anInt172);
								Class4_Sub20_Sub12_Sub3.method549(i_159_,
										i_161_, i_157_, i_158_, i_160_, i_156_,
										method1114(i_162_, arg0.anInt178),
										method1114(i_162_, arg0.anInt197),
										method1114(i_162_, arg0.anInt183));
							}
						}
						if (((i_154_ - i_156_) * (i_161_ - i_157_) - (i_155_ - i_157_)
								* (i_160_ - i_156_)) > 0) {
							Class4_Sub20_Sub12_Sub3.aBoolean3522 = false;
							if (i_154_ < 0
									|| i_156_ < 0
									|| i_160_ < 0
									|| i_154_ > Class4_Sub20_Sub12_Sub3.anInt3525
									|| i_156_ > Class4_Sub20_Sub12_Sub3.anInt3525
									|| i_160_ > Class4_Sub20_Sub12_Sub3.anInt3525)
								Class4_Sub20_Sub12_Sub3.aBoolean3522 = true;
							if (aBoolean1392
									&& method1099(anInt1388, anInt1409, i_155_,
											i_157_, i_161_, i_154_, i_156_,
											i_160_)) {
								anInt1420 = arg6;
								anInt1413 = arg7;
							}
							if (arg0.anInt172 == -1) {
								if (arg0.anInt173 != 12345678)
									Class4_Sub20_Sub12_Sub3.method549(i_155_,
											i_157_, i_161_, i_154_, i_156_,
											i_160_, arg0.anInt173,
											arg0.anInt183, arg0.anInt197);
							} else if (!aBoolean1400)
								Class4_Sub20_Sub12_Sub3.method541(i_155_,
										i_157_, i_161_, i_154_, i_156_, i_160_,
										arg0.anInt173, arg0.anInt183,
										arg0.anInt197, i, i_145_, i_142_,
										i_149_, i_150_, i_152_, i_143_, i_144_,
										i_148_, arg0.anInt172);
							else {
								int i_163_ = Class4_Sub20_Sub12_Sub3.anInterface2_3530
										.method8(91, arg0.anInt172);
								Class4_Sub20_Sub12_Sub3.method549(i_155_,
										i_157_, i_161_, i_154_, i_156_, i_160_,
										method1114(i_163_, arg0.anInt173),
										method1114(i_163_, arg0.anInt183),
										method1114(i_163_, arg0.anInt197));
							}
						}
					}
				}
			}
		}
	}

	public void method1144(Class4_Sub3 arg0, boolean arg1) {
		aClass65_1394.method1068(arg0, (byte) -128);
		for (;;) {
			Class4_Sub3 class4_sub3 = (Class4_Sub3) aClass65_1394
					.method1072(-2);
			if (class4_sub3 == null)
				break;
			if (class4_sub3.aBoolean1881) {
				int i = class4_sub3.anInt1894;
				int i_164_ = class4_sub3.anInt1887;
				int i_165_ = class4_sub3.anInt1901;
				int i_166_ = class4_sub3.anInt1906;
				Class4_Sub3[][] class4_sub3s = aClass4_Sub3ArrayArrayArray1427[i_165_];
				if (class4_sub3.aBoolean1885) {
					if (arg1) {
						if (i_165_ > 0) {
							Class4_Sub3 class4_sub3_167_ = (aClass4_Sub3ArrayArrayArray1427[i_165_ - 1][i][i_164_]);
							if (class4_sub3_167_ != null
									&& class4_sub3_167_.aBoolean1881)
								continue;
						}
						if (i <= anInt1397 && i > anInt1421) {
							Class4_Sub3 class4_sub3_168_ = class4_sub3s[i - 1][i_164_];
							if (class4_sub3_168_ != null
									&& class4_sub3_168_.aBoolean1881
									&& (class4_sub3_168_.aBoolean1885 || (class4_sub3.anInt1889 & 0x1) == 0))
								continue;
						}
						if (i >= anInt1397 && i < anInt1425 - 1) {
							Class4_Sub3 class4_sub3_169_ = class4_sub3s[i + 1][i_164_];
							if (class4_sub3_169_ != null
									&& class4_sub3_169_.aBoolean1881
									&& (class4_sub3_169_.aBoolean1885 || (class4_sub3.anInt1889 & 0x4) == 0))
								continue;
						}
						if (i_164_ <= anInt1412 && i_164_ > anInt1405) {
							Class4_Sub3 class4_sub3_170_ = class4_sub3s[i][i_164_ - 1];
							if (class4_sub3_170_ != null
									&& class4_sub3_170_.aBoolean1881
									&& (class4_sub3_170_.aBoolean1885 || (class4_sub3.anInt1889 & 0x8) == 0))
								continue;
						}
						if (i_164_ >= anInt1412 && i_164_ < anInt1428 - 1) {
							Class4_Sub3 class4_sub3_171_ = class4_sub3s[i][i_164_ + 1];
							if (class4_sub3_171_ != null
									&& class4_sub3_171_.aBoolean1881
									&& (class4_sub3_171_.aBoolean1885 || (class4_sub3.anInt1889 & 0x2) == 0))
								continue;
						}
					} else
						arg1 = true;
					class4_sub3.aBoolean1885 = false;
					if (class4_sub3.aClass4_Sub3_1893 != null) {
						Class4_Sub3 class4_sub3_172_ = class4_sub3.aClass4_Sub3_1893;
						if (class4_sub3_172_.aClass5_1904 != null) {
							if (!method1138(0, i, i_164_))
								method1143(class4_sub3_172_.aClass5_1904, 0,
										anInt1399, anInt1426, anInt1390,
										anInt1410, i, i_164_);
						} else if (class4_sub3_172_.aClass51_1878 != null
								&& !method1138(0, i, i_164_))
							method1116(class4_sub3_172_.aClass51_1878,
									anInt1399, anInt1426, anInt1390, anInt1410,
									i, i_164_);
						Class68 class68 = class4_sub3_172_.aClass68_1898;
						if (class68 != null)
							class68.aClass4_Sub20_Sub7_1372.method373(0,
									anInt1399, anInt1426, anInt1390, anInt1410,
									class68.anInt1370 - anInt1395,
									class68.anInt1373 - anInt1429,
									class68.anInt1380 - anInt1406,
									class68.anInt1371);
						for (int i_173_ = 0; i_173_ < class4_sub3_172_.anInt1905; i_173_++) {
							Class67 class67 = class4_sub3_172_.aClass67Array1890[i_173_];
							if (class67 != null)
								class67.aClass4_Sub20_Sub7_1366.method373(
										class67.anInt1345, anInt1399,
										anInt1426, anInt1390, anInt1410,
										class67.anInt1353 - anInt1395,
										class67.anInt1343 - anInt1429,
										class67.anInt1358 - anInt1406,
										class67.anInt1361);
						}
					}
					boolean bool = false;
					if (class4_sub3.aClass5_1904 != null) {
						if (!method1138(i_166_, i, i_164_)) {
							bool = true;
							if (class4_sub3.aClass5_1904.anInt178 != 12345678
									|| aBoolean1392 && i_165_ <= anInt1411)
								method1143(class4_sub3.aClass5_1904, i_166_,
										anInt1399, anInt1426, anInt1390,
										anInt1410, i, i_164_);
						}
					} else if (class4_sub3.aClass51_1878 != null
							&& !method1138(i_166_, i, i_164_)) {
						bool = true;
						method1116(class4_sub3.aClass51_1878, anInt1399,
								anInt1426, anInt1390, anInt1410, i, i_164_);
					}
					int i_174_ = 0;
					int i_175_ = 0;
					Class68 class68 = class4_sub3.aClass68_1898;
					Class25 class25 = class4_sub3.aClass25_1879;
					if (class68 != null || class25 != null) {
						if (anInt1397 == i)
							i_174_++;
						else if (anInt1397 < i)
							i_174_ += 2;
						if (anInt1412 == i_164_)
							i_174_ += 3;
						else if (anInt1412 > i_164_)
							i_174_ += 6;
						i_175_ = anIntArray1443[i_174_];
						class4_sub3.anInt1908 = anIntArray1433[i_174_];
					}
					if (class68 != null) {
						if ((class68.anInt1387 & anIntArray1447[i_174_]) != 0) {
							if (class68.anInt1387 == 16) {
								class4_sub3.anInt1909 = 3;
								class4_sub3.anInt1892 = anIntArray1446[i_174_];
								class4_sub3.anInt1884 = 3 - class4_sub3.anInt1892;
							} else if (class68.anInt1387 == 32) {
								class4_sub3.anInt1909 = 6;
								class4_sub3.anInt1892 = anIntArray1437[i_174_];
								class4_sub3.anInt1884 = 6 - class4_sub3.anInt1892;
							} else if (class68.anInt1387 == 64) {
								class4_sub3.anInt1909 = 12;
								class4_sub3.anInt1892 = anIntArray1442[i_174_];
								class4_sub3.anInt1884 = 12 - class4_sub3.anInt1892;
							} else {
								class4_sub3.anInt1909 = 9;
								class4_sub3.anInt1892 = anIntArray1436[i_174_];
								class4_sub3.anInt1884 = 9 - class4_sub3.anInt1892;
							}
						} else
							class4_sub3.anInt1909 = 0;
						if ((class68.anInt1387 & i_175_) != 0
								&& !method1141(i_166_, i, i_164_,
										class68.anInt1387))
							class68.aClass4_Sub20_Sub7_1372.method373(0,
									anInt1399, anInt1426, anInt1390, anInt1410,
									class68.anInt1370 - anInt1395,
									class68.anInt1373 - anInt1429,
									class68.anInt1380 - anInt1406,
									class68.anInt1371);
						if ((class68.anInt1381 & i_175_) != 0
								&& !method1141(i_166_, i, i_164_,
										class68.anInt1381))
							class68.aClass4_Sub20_Sub7_1375.method373(0,
									anInt1399, anInt1426, anInt1390, anInt1410,
									class68.anInt1370 - anInt1395,
									class68.anInt1373 - anInt1429,
									class68.anInt1380 - anInt1406,
									class68.anInt1371);
					}
					if (class25 != null
							&& !method1124(i_166_, i, i_164_,
									(class25.aClass4_Sub20_Sub7_570.anInt2938))) {
						if ((class25.anInt571 & i_175_) != 0)
							class25.aClass4_Sub20_Sub7_570.method373(
									class25.anInt591, anInt1399, anInt1426,
									anInt1390, anInt1410, class25.anInt573
											- anInt1395, class25.anInt576
											- anInt1429, class25.anInt569
											- anInt1406, class25.anInt572);
						else if ((class25.anInt571 & 0x300) != 0) {
							int i_176_ = class25.anInt573 - anInt1395;
							int i_177_ = class25.anInt576 - anInt1429;
							int i_178_ = class25.anInt569 - anInt1406;
							int i_179_ = class25.anInt591;
							int i_180_;
							if (i_179_ == 1 || i_179_ == 2)
								i_180_ = -i_176_;
							else
								i_180_ = i_176_;
							int i_181_;
							if (i_179_ == 2 || i_179_ == 3)
								i_181_ = -i_178_;
							else
								i_181_ = i_178_;
							if ((class25.anInt571 & 0x100) != 0
									&& i_181_ < i_180_) {
								int i_182_ = i_176_ + anIntArray1398[i_179_];
								int i_183_ = i_178_ + anIntArray1422[i_179_];
								class25.aClass4_Sub20_Sub7_570.method373(
										i_179_ * 512 + 256, anInt1399,
										anInt1426, anInt1390, anInt1410,
										i_182_, i_177_, i_183_,
										class25.anInt572);
							}
							if ((class25.anInt571 & 0x200) != 0
									&& i_181_ > i_180_) {
								int i_184_ = i_176_ + anIntArray1415[i_179_];
								int i_185_ = i_178_ + anIntArray1401[i_179_];
								class25.aClass4_Sub20_Sub7_570.method373(
										i_179_ * 512 + 1280 & 0x7ff, anInt1399,
										anInt1426, anInt1390, anInt1410,
										i_184_, i_177_, i_185_,
										class25.anInt572);
							}
						}
					}
					if (bool) {
						Class74 class74 = class4_sub3.aClass74_1910;
						if (class74 != null)
							class74.aClass4_Sub20_Sub7_1512.method373(0,
									anInt1399, anInt1426, anInt1390, anInt1410,
									class74.anInt1519 - anInt1395,
									class74.anInt1511 - anInt1429,
									class74.anInt1525 - anInt1406,
									class74.anInt1509);
						Class61 class61 = class4_sub3.aClass61_1891;
						if (class61 != null && class61.anInt1214 == 0) {
							if (class61.aClass4_Sub20_Sub7_1205 != null)
								class61.aClass4_Sub20_Sub7_1205.method373(0,
										anInt1399, anInt1426, anInt1390,
										anInt1410, class61.anInt1216
												- anInt1395, class61.anInt1204
												- anInt1429, class61.anInt1200
												- anInt1406, class61.anInt1219);
							if (class61.aClass4_Sub20_Sub7_1197 != null)
								class61.aClass4_Sub20_Sub7_1197.method373(0,
										anInt1399, anInt1426, anInt1390,
										anInt1410, class61.anInt1216
												- anInt1395, class61.anInt1204
												- anInt1429, class61.anInt1200
												- anInt1406, class61.anInt1219);
							if (class61.aClass4_Sub20_Sub7_1217 != null)
								class61.aClass4_Sub20_Sub7_1217.method373(0,
										anInt1399, anInt1426, anInt1390,
										anInt1410, class61.anInt1216
												- anInt1395, class61.anInt1204
												- anInt1429, class61.anInt1200
												- anInt1406, class61.anInt1219);
						}
					}
					int i_186_ = class4_sub3.anInt1889;
					if (i_186_ != 0) {
						if (i < anInt1397 && (i_186_ & 0x4) != 0) {
							Class4_Sub3 class4_sub3_187_ = class4_sub3s[i + 1][i_164_];
							if (class4_sub3_187_ != null
									&& class4_sub3_187_.aBoolean1881)
								aClass65_1394.method1068(class4_sub3_187_,
										(byte) -122);
						}
						if (i_164_ < anInt1412 && (i_186_ & 0x2) != 0) {
							Class4_Sub3 class4_sub3_188_ = class4_sub3s[i][i_164_ + 1];
							if (class4_sub3_188_ != null
									&& class4_sub3_188_.aBoolean1881)
								aClass65_1394.method1068(class4_sub3_188_,
										(byte) -127);
						}
						if (i > anInt1397 && (i_186_ & 0x1) != 0) {
							Class4_Sub3 class4_sub3_189_ = class4_sub3s[i - 1][i_164_];
							if (class4_sub3_189_ != null
									&& class4_sub3_189_.aBoolean1881)
								aClass65_1394.method1068(class4_sub3_189_,
										(byte) -118);
						}
						if (i_164_ > anInt1412 && (i_186_ & 0x8) != 0) {
							Class4_Sub3 class4_sub3_190_ = class4_sub3s[i][i_164_ - 1];
							if (class4_sub3_190_ != null
									&& class4_sub3_190_.aBoolean1881)
								aClass65_1394.method1068(class4_sub3_190_,
										(byte) -120);
						}
					}
				}
				if (class4_sub3.anInt1909 != 0) {
					boolean bool = true;
					for (int i_191_ = 0; i_191_ < class4_sub3.anInt1905; i_191_++) {
						if ((class4_sub3.aClass67Array1890[i_191_].anInt1351 != anInt1414)
								&& ((class4_sub3.anIntArray1883[i_191_] & class4_sub3.anInt1909) == class4_sub3.anInt1892)) {
							bool = false;
							break;
						}
					}
					if (bool) {
						Class68 class68 = class4_sub3.aClass68_1898;
						if (!method1141(i_166_, i, i_164_, class68.anInt1387))
							class68.aClass4_Sub20_Sub7_1372.method373(0,
									anInt1399, anInt1426, anInt1390, anInt1410,
									class68.anInt1370 - anInt1395,
									class68.anInt1373 - anInt1429,
									class68.anInt1380 - anInt1406,
									class68.anInt1371);
						class4_sub3.anInt1909 = 0;
					}
				}
				if (class4_sub3.aBoolean1877) {
					try {
						int i_192_ = class4_sub3.anInt1905;
						class4_sub3.aBoolean1877 = false;
						int i_193_ = 0;
						while_16_: for (int i_194_ = 0; i_194_ < i_192_; i_194_++) {
							Class67 class67 = class4_sub3.aClass67Array1890[i_194_];
							if (class67.anInt1351 != anInt1414) {
								for (int i_195_ = class67.anInt1359; i_195_ <= class67.anInt1356; i_195_++) {
									for (int i_196_ = class67.anInt1338; i_196_ <= class67.anInt1347; i_196_++) {
										Class4_Sub3 class4_sub3_197_ = class4_sub3s[i_195_][i_196_];
										if (class4_sub3_197_.aBoolean1885) {
											class4_sub3.aBoolean1877 = true;
											continue while_16_;
										}
										if (class4_sub3_197_.anInt1909 != 0) {
											int i_198_ = 0;
											if (i_195_ > class67.anInt1359)
												i_198_++;
											if (i_195_ < class67.anInt1356)
												i_198_ += 4;
											if (i_196_ > class67.anInt1338)
												i_198_ += 8;
											if (i_196_ < class67.anInt1347)
												i_198_ += 2;
											if ((i_198_ & class4_sub3_197_.anInt1909) == class4_sub3.anInt1884) {
												class4_sub3.aBoolean1877 = true;
												continue while_16_;
											}
										}
									}
								}
								aClass67Array1424[i_193_++] = class67;
								int i_199_ = anInt1397 - class67.anInt1359;
								int i_200_ = class67.anInt1356 - anInt1397;
								if (i_200_ > i_199_)
									i_199_ = i_200_;
								int i_201_ = anInt1412 - class67.anInt1338;
								int i_202_ = class67.anInt1347 - anInt1412;
								if (i_202_ > i_201_)
									class67.anInt1342 = i_199_ + i_202_;
								else
									class67.anInt1342 = i_199_ + i_201_;
							}
						}
						while (i_193_ > 0) {
							int i_203_ = -50;
							int i_204_ = -1;
							for (int i_205_ = 0; i_205_ < i_193_; i_205_++) {
								Class67 class67 = aClass67Array1424[i_205_];
								if (class67.anInt1351 != anInt1414) {
									if (class67.anInt1342 > i_203_) {
										i_203_ = class67.anInt1342;
										i_204_ = i_205_;
									} else if (class67.anInt1342 == i_203_) {
										int i_206_ = class67.anInt1353
												- anInt1395;
										int i_207_ = class67.anInt1358
												- anInt1406;
										int i_208_ = ((aClass67Array1424[i_204_].anInt1353) - anInt1395);
										int i_209_ = ((aClass67Array1424[i_204_].anInt1358) - anInt1406);
										if (i_206_ * i_206_ + i_207_ * i_207_ > (i_208_
												* i_208_ + i_209_ * i_209_))
											i_204_ = i_205_;
									}
								}
							}
							if (i_204_ == -1)
								break;
							Class67 class67 = aClass67Array1424[i_204_];
							class67.anInt1351 = anInt1414;
							if (!method1130(i_166_, class67.anInt1359,
									class67.anInt1356, class67.anInt1338,
									class67.anInt1347,
									(class67.aClass4_Sub20_Sub7_1366.anInt2938)))
								class67.aClass4_Sub20_Sub7_1366.method373(
										class67.anInt1345, anInt1399,
										anInt1426, anInt1390, anInt1410,
										class67.anInt1353 - anInt1395,
										class67.anInt1343 - anInt1429,
										class67.anInt1358 - anInt1406,
										class67.anInt1361);
							for (int i_210_ = class67.anInt1359; i_210_ <= class67.anInt1356; i_210_++) {
								for (int i_211_ = class67.anInt1338; i_211_ <= class67.anInt1347; i_211_++) {
									Class4_Sub3 class4_sub3_212_ = class4_sub3s[i_210_][i_211_];
									if (class4_sub3_212_.anInt1909 != 0)
										aClass65_1394.method1068(
												class4_sub3_212_, (byte) -115);
									else if ((i_210_ != i || i_211_ != i_164_)
											&& class4_sub3_212_.aBoolean1881)
										aClass65_1394.method1068(
												class4_sub3_212_, (byte) -121);
								}
							}
						}
						if (class4_sub3.aBoolean1877)
							continue;
					} catch (Exception exception) {
						class4_sub3.aBoolean1877 = false;
					}
				}
				if (class4_sub3.aBoolean1881) {
					if (class4_sub3.anInt1909 == 0) {
						if (i <= anInt1397 && i > anInt1421) {
							Class4_Sub3 class4_sub3_213_ = class4_sub3s[i - 1][i_164_];
							if (class4_sub3_213_ != null
									&& class4_sub3_213_.aBoolean1881)
								continue;
						}
						if (i >= anInt1397 && i < anInt1425 - 1) {
							Class4_Sub3 class4_sub3_214_ = class4_sub3s[i + 1][i_164_];
							if (class4_sub3_214_ != null
									&& class4_sub3_214_.aBoolean1881)
								continue;
						}
						if (i_164_ <= anInt1412 && i_164_ > anInt1405) {
							Class4_Sub3 class4_sub3_215_ = class4_sub3s[i][i_164_ - 1];
							if (class4_sub3_215_ != null
									&& class4_sub3_215_.aBoolean1881)
								continue;
						}
						if (i_164_ >= anInt1412 && i_164_ < anInt1428 - 1) {
							Class4_Sub3 class4_sub3_216_ = class4_sub3s[i][i_164_ + 1];
							if (class4_sub3_216_ != null
									&& class4_sub3_216_.aBoolean1881)
								continue;
						}
						class4_sub3.aBoolean1881 = false;
						anInt1391--;
						Class61 class61 = class4_sub3.aClass61_1891;
						if (class61 != null && class61.anInt1214 != 0) {
							if (class61.aClass4_Sub20_Sub7_1205 != null)
								class61.aClass4_Sub20_Sub7_1205
										.method373(
												0,
												anInt1399,
												anInt1426,
												anInt1390,
												anInt1410,
												class61.anInt1216 - anInt1395,
												(class61.anInt1204 - anInt1429 - class61.anInt1214),
												class61.anInt1200 - anInt1406,
												class61.anInt1219);
							if (class61.aClass4_Sub20_Sub7_1197 != null)
								class61.aClass4_Sub20_Sub7_1197
										.method373(
												0,
												anInt1399,
												anInt1426,
												anInt1390,
												anInt1410,
												class61.anInt1216 - anInt1395,
												(class61.anInt1204 - anInt1429 - class61.anInt1214),
												class61.anInt1200 - anInt1406,
												class61.anInt1219);
							if (class61.aClass4_Sub20_Sub7_1217 != null)
								class61.aClass4_Sub20_Sub7_1217
										.method373(
												0,
												anInt1399,
												anInt1426,
												anInt1390,
												anInt1410,
												class61.anInt1216 - anInt1395,
												(class61.anInt1204 - anInt1429 - class61.anInt1214),
												class61.anInt1200 - anInt1406,
												class61.anInt1219);
						}
						if (class4_sub3.anInt1908 != 0) {
							Class25 class25 = class4_sub3.aClass25_1879;
							if (class25 != null
									&& !method1124(
											i_166_,
											i,
											i_164_,
											(class25.aClass4_Sub20_Sub7_570.anInt2938))) {
								if ((class25.anInt571 & class4_sub3.anInt1908) != 0)
									class25.aClass4_Sub20_Sub7_570.method373(
											class25.anInt591, anInt1399,
											anInt1426, anInt1390, anInt1410,
											class25.anInt573 - anInt1395,
											class25.anInt576 - anInt1429,
											class25.anInt569 - anInt1406,
											class25.anInt572);
								else if ((class25.anInt571 & 0x300) != 0) {
									int i_217_ = class25.anInt573 - anInt1395;
									int i_218_ = class25.anInt576 - anInt1429;
									int i_219_ = class25.anInt569 - anInt1406;
									int i_220_ = class25.anInt591;
									int i_221_;
									if (i_220_ == 1 || i_220_ == 2)
										i_221_ = -i_217_;
									else
										i_221_ = i_217_;
									int i_222_;
									if (i_220_ == 2 || i_220_ == 3)
										i_222_ = -i_219_;
									else
										i_222_ = i_219_;
									if ((class25.anInt571 & 0x100) != 0
											&& i_222_ >= i_221_) {
										int i_223_ = i_217_
												+ anIntArray1398[i_220_];
										int i_224_ = i_219_
												+ anIntArray1422[i_220_];
										class25.aClass4_Sub20_Sub7_570
												.method373(i_220_ * 512 + 256,
														anInt1399, anInt1426,
														anInt1390, anInt1410,
														i_223_, i_218_, i_224_,
														class25.anInt572);
									}
									if ((class25.anInt571 & 0x200) != 0
											&& i_222_ <= i_221_) {
										int i_225_ = i_217_
												+ anIntArray1415[i_220_];
										int i_226_ = i_219_
												+ anIntArray1401[i_220_];
										class25.aClass4_Sub20_Sub7_570
												.method373(
														i_220_ * 512 + 1280 & 0x7ff,
														anInt1399, anInt1426,
														anInt1390, anInt1410,
														i_225_, i_218_, i_226_,
														class25.anInt572);
									}
								}
							}
							Class68 class68 = class4_sub3.aClass68_1898;
							if (class68 != null) {
								if ((class68.anInt1381 & class4_sub3.anInt1908) != 0
										&& !method1141(i_166_, i, i_164_,
												class68.anInt1381))
									class68.aClass4_Sub20_Sub7_1375.method373(
											0, anInt1399, anInt1426, anInt1390,
											anInt1410, class68.anInt1370
													- anInt1395,
											class68.anInt1373 - anInt1429,
											class68.anInt1380 - anInt1406,
											class68.anInt1371);
								if ((class68.anInt1387 & class4_sub3.anInt1908) != 0
										&& !method1141(i_166_, i, i_164_,
												class68.anInt1387))
									class68.aClass4_Sub20_Sub7_1372.method373(
											0, anInt1399, anInt1426, anInt1390,
											anInt1410, class68.anInt1370
													- anInt1395,
											class68.anInt1373 - anInt1429,
											class68.anInt1380 - anInt1406,
											class68.anInt1371);
							}
						}
						if (i_165_ < anInt1419 - 1) {
							Class4_Sub3 class4_sub3_227_ = (aClass4_Sub3ArrayArrayArray1427[i_165_ + 1][i][i_164_]);
							if (class4_sub3_227_ != null
									&& class4_sub3_227_.aBoolean1881)
								aClass65_1394.method1068(class4_sub3_227_,
										(byte) -118);
						}
						if (i < anInt1397) {
							Class4_Sub3 class4_sub3_228_ = class4_sub3s[i + 1][i_164_];
							if (class4_sub3_228_ != null
									&& class4_sub3_228_.aBoolean1881)
								aClass65_1394.method1068(class4_sub3_228_,
										(byte) -121);
						}
						if (i_164_ < anInt1412) {
							Class4_Sub3 class4_sub3_229_ = class4_sub3s[i][i_164_ + 1];
							if (class4_sub3_229_ != null
									&& class4_sub3_229_.aBoolean1881)
								aClass65_1394.method1068(class4_sub3_229_,
										(byte) -125);
						}
						if (i > anInt1397) {
							Class4_Sub3 class4_sub3_230_ = class4_sub3s[i - 1][i_164_];
							if (class4_sub3_230_ != null
									&& class4_sub3_230_.aBoolean1881)
								aClass65_1394.method1068(class4_sub3_230_,
										(byte) -122);
						}
						if (i_164_ > anInt1412) {
							Class4_Sub3 class4_sub3_231_ = class4_sub3s[i][i_164_ - 1];
							if (class4_sub3_231_ != null
									&& class4_sub3_231_.aBoolean1881)
								aClass65_1394.method1068(class4_sub3_231_,
										(byte) -120);
						}
					}
				}
			}
		}
	}

	public boolean method1145(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7, Class4_Sub20_Sub7 arg8, int arg9,
			boolean arg10, int arg11, int arg12) {
		for (int i = arg1; i < arg1 + arg3; i++) {
			for (int i_232_ = arg2; i_232_ < arg2 + arg4; i_232_++) {
				if (i < 0 || i_232_ < 0 || i >= regionSizeX
						|| i_232_ >= regionSizeY)
					return false;
				Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][i][i_232_];
				if (class4_sub3 != null && class4_sub3.anInt1905 >= 5)
					return false;
			}
		}
		Class67 class67 = new Class67();
		class67.anInt1361 = arg11;
		class67.anInt1362 = arg12;
		class67.anInt1350 = arg0;
		class67.anInt1353 = arg5;
		class67.anInt1358 = arg6;
		class67.anInt1343 = arg7;
		class67.aClass4_Sub20_Sub7_1366 = arg8;
		class67.anInt1345 = arg9;
		class67.anInt1359 = arg1;
		class67.anInt1338 = arg2;
		class67.anInt1356 = arg1 + arg3 - 1;
		class67.anInt1347 = arg2 + arg4 - 1;
		for (int i = arg1; i < arg1 + arg3; i++) {
			for (int i_233_ = arg2; i_233_ < arg2 + arg4; i_233_++) {
				int i_234_ = 0;
				if (i > arg1)
					i_234_++;
				if (i < arg1 + arg3 - 1)
					i_234_ += 4;
				if (i_233_ > arg2)
					i_234_ += 8;
				if (i_233_ < arg2 + arg4 - 1)
					i_234_ += 2;
				for (int i_235_ = arg0; i_235_ >= 0; i_235_--) {
					if (aClass4_Sub3ArrayArrayArray1427[i_235_][i][i_233_] == null)
						aClass4_Sub3ArrayArrayArray1427[i_235_][i][i_233_] = new Class4_Sub3(
								i_235_, i, i_233_);
				}
				Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][i][i_233_];
				class4_sub3.aClass67Array1890[class4_sub3.anInt1905] = class67;
				class4_sub3.anIntArray1883[class4_sub3.anInt1905] = i_234_;
				class4_sub3.anInt1889 |= i_234_;
				class4_sub3.anInt1905++;
			}
		}
		if (arg10)
			aClass67Array1407[anInt1389++] = class67;
		return true;
	}

	public int method1146(int arg0, int arg1, int arg2, int arg3) {
		Class4_Sub3 class4_sub3 = aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2];
		if (class4_sub3 == null)
			return -1;
		if (class4_sub3.aClass68_1898 != null
				&& class4_sub3.aClass68_1898.anInt1371 == arg3)
			return class4_sub3.aClass68_1898.anInt1369 & 0xff;
		if (class4_sub3.aClass25_1879 != null
				&& class4_sub3.aClass25_1879.anInt572 == arg3)
			return class4_sub3.aClass25_1879.anInt588 & 0xff;
		if (class4_sub3.aClass74_1910 != null
				&& class4_sub3.aClass74_1910.anInt1509 == arg3)
			return class4_sub3.aClass74_1910.anInt1510 & 0xff;
		for (int i = 0; i < class4_sub3.anInt1905; i++) {
			if (class4_sub3.aClass67Array1890[i].anInt1361 == arg3)
				return class4_sub3.aClass67Array1890[i].anInt1362 & 0xff;
		}
		return -1;
	}

	public void method1147(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7, int arg8, int arg9, int arg10,
			int arg11, int arg12, int arg13, int arg14, int arg15, int arg16,
			int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			Class5 class5 = new Class5(arg10, arg11, arg12, arg13, -1, arg18,
					false);
			for (int i = arg0; i >= 0; i--) {
				if (aClass4_Sub3ArrayArrayArray1427[i][arg1][arg2] == null)
					aClass4_Sub3ArrayArrayArray1427[i][arg1][arg2] = new Class4_Sub3(
							i, arg1, arg2);
			}
			aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2].aClass5_1904 = class5;
		} else if (arg3 == 1) {
			Class5 class5 = new Class5(arg14, arg15, arg16, arg17, arg5, arg19,
					arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int i = arg0; i >= 0; i--) {
				if (aClass4_Sub3ArrayArrayArray1427[i][arg1][arg2] == null)
					aClass4_Sub3ArrayArrayArray1427[i][arg1][arg2] = new Class4_Sub3(
							i, arg1, arg2);
			}
			aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2].aClass5_1904 = class5;
		} else {
			Class51 class51 = new Class51(arg3, arg4, arg5, arg1, arg2, arg6,
					arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15,
					arg16, arg17, arg18, arg19);
			for (int i = arg0; i >= 0; i--) {
				if (aClass4_Sub3ArrayArrayArray1427[i][arg1][arg2] == null)
					aClass4_Sub3ArrayArrayArray1427[i][arg1][arg2] = new Class4_Sub3(
							i, arg1, arg2);
			}
			aClass4_Sub3ArrayArrayArray1427[arg0][arg1][arg2].aClass51_1878 = class51;
		}
	}

	public void method1148(int arg0) {
		anInt1403 = arg0;
		for (int i = 0; i < regionSizeX; i++) {
			for (int i_236_ = 0; i_236_ < regionSizeY; i_236_++) {
				if (aClass4_Sub3ArrayArrayArray1427[arg0][i][i_236_] == null)
					aClass4_Sub3ArrayArrayArray1427[arg0][i][i_236_] = new Class4_Sub3(
							arg0, i, i_236_);
			}
		}
	}
}
