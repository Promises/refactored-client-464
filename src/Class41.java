/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class41 {
	public static JagexString aJagexString_797;
	public static JagexString aJagexString_804 = JagexString.getRs2PreparedString("null"
	);
	public static JagexString aJagexString_818;
	public static JagexString aJagexString_834;
	public static JagexString aJagexString_835;
	public static JagexString aJagexString_836;
	public static JagexString aJagexString_838;
	public static JagexString aJagexString_839;
	public static StreamBuffer aClass4_Sub11_796;
	public static int anInt803;
	public static int anInt808;
	public static int anInt817;
	public static int anInt822 = 0;
	public static int anInt828;
	public static int anInt837;
	static {
		aJagexString_818 = JagexString.getRs2PreparedString(
				"This computers address has been blocked");
		aJagexString_797 = aJagexString_818;
		aClass4_Sub11_796 = new StreamBuffer(new byte[5000]);
		aJagexString_834 = JagexString.getRs2PreparedString("cyan:");
		aJagexString_836 = aJagexString_834;
		aJagexString_839 = aJagexString_834;
		aJagexString_838 = JagexString.getRs2PreparedString(" <col=ffffff>");
		aJagexString_835 = JagexString.getRs2PreparedString(
				"oder benutzen Sie eine andere Welt)3");
	}

	public static void loadGameRegions(byte arg0) {
		try {
			boolean bool = true;
			Class81.method1212(false, false);
			anInt808++;
			Class4_Sub23.anInt2415 = 0;
			for (int i = 0; ((i ^ 0xffffffff) > (RSApplet.regionsData.length ^ 0xffffffff)); i++) {
				if (Class4_Sub15.anIntArray2290[i] != -1
						&& RSApplet.regionsData[i] == null) {
					RSApplet.regionsData[i] = (Class4_Sub20_Sub6.aClass19_Sub1_2911
							.method746(Class4_Sub15.anIntArray2290[i],
									(byte) 112, 0));
					if (RSApplet.regionsData[i] == null) {
						bool = false;
						Class4_Sub23.anInt2415++;
					}
				}
				if (Class61.anIntArray1222[i] != -1
						&& Class4_Sub20_Sub5.aByteArrayArray2887[i] == null) {
					// Class4_Sub20_Sub5.aByteArrayArray2887[i] =
					// FileOperations.readFile("maps/" +
					// Class61.anIntArray1222[i] + ".dat");
					Class4_Sub20_Sub5.aByteArrayArray2887[i] = (Class4_Sub20_Sub6.aClass19_Sub1_2911
							.method758(
									Class4_Sub20_Sub7_Sub4.anIntArrayArray3375[i],
									Class61.anIntArray1222[i], false, 0));
					if (Class4_Sub20_Sub5.aByteArrayArray2887[i] == null) {
						Class4_Sub23.anInt2415++;
						bool = false;
					}
				}
			}
			if (!bool)
				Class4_Sub20.anInt2353 = 1;
			else {
				Class77.anInt1591 = 0;
				bool = true;
				for (int i = 0; i < RSApplet.regionsData.length; i++) {
					byte[] is = Class4_Sub20_Sub5.aByteArrayArray2887[i];
					if (is != null) {
						System.out
								.println("Region Id: " + Class47.regionIds[i]);
						int yAbs = (64 * (0xff & Class47.regionIds[i]) + -Class4_Sub20_Sub8.anInt2987);
						int xAbs = ((Class47.regionIds[i] >> -446537272) * 64 + -Class6.anInt217);
						if (Class4_Sub22.aBoolean2400) {
							yAbs = 10;
							xAbs = 10;
						}
						bool &= Class67.method1089(yAbs, xAbs, (byte) -97, is);
					}
				}
				if (!bool)
					Class4_Sub20.anInt2353 = 2;
				else {
					if (Class4_Sub20.anInt2353 != 0)
						Class19.method735(
								true,
								(Class4_Sub24.method639((new JagexString[] {
										Class7.aJagexString_228,
										Class4_Sub14.aJagexString_2285}), -842)),
								(byte) -126);
					method938((byte) 0);
					Class62.method1050(true);
					method938((byte) 0);
					Class4_Sub20_Sub7_Sub6.aClass69_3439.method1136();
					method938((byte) 0);
					System.gc();
					for (int i = 0; (i ^ 0xffffffff) > -5; i++)
						Class57.regions[i].method68(true);
					for (int i = 0; i < 4; i++) {
						for (int i_2_ = 0; i_2_ < 104; i_2_++) {
							for (int i_3_ = 0; i_3_ < 104; i_3_++)
								Class46.landscapeData[i][i_2_][i_3_] = (byte) 0;
						}
					}
					method938((byte) 0);
					Class73.method1165((byte) -123);
					int i_4_ = RSApplet.regionsData.length;
					Class49.method992((byte) 107);
					Class81.method1212(true, false);
					if (!Class4_Sub22.aBoolean2400) {
						for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
							int xAbs = (-Class6.anInt217 + (Class47.regionIds[i_5_] >> -1839099960) * 64);
							int yAbs = ((0xff & Class47.regionIds[i_5_]) * 64 + -Class4_Sub20_Sub8.anInt2987);
							byte[] is = RSApplet.regionsData[i_5_];
							if (is != null) {
								method938((byte) 0);
								Class58.method1030(xAbs, yAbs, Class57.regions,
										8 * (Class4_Sub17.anInt2324 + -6), is,
										8 * (-6 + Class53.anInt1079), 100);
							}
						}
						for (int i_8_ = 0; i_8_ < i_4_; i_8_++) {
							int i_9_ = (64 * (Class47.regionIds[i_8_] >> 960249192) - Class6.anInt217);
							int i_10_ = (-Class4_Sub20_Sub8.anInt2987 + ((0xff & Class47.regionIds[i_8_]) * 64));
							byte[] is = RSApplet.regionsData[i_8_];
							if (is == null
									&& (Class4_Sub17.anInt2324 ^ 0xffffffff) > -801) {
								method938((byte) 0);
								Class12.method676(64, i_10_, 0, 64, i_9_);
							}
						}
						Class81.method1212(true, false);
						for (int i_11_ = 0; i_4_ > i_11_; i_11_++) {
							byte[] is = Class4_Sub20_Sub5.aByteArrayArray2887[i_11_];
							if (is != null) {
								System.out.println("Loading region: "
										+ Class47.regionIds[i_11_]);
								int i_12_ = (-Class6.anInt217 + 64 * (Class47.regionIds[i_11_] >> 815146440));
								int i_13_ = (64 * (0xff & Class47.regionIds[i_11_]) + -Class4_Sub20_Sub8.anInt2987);
								method938((byte) 0);
								Class4_Sub20_Sub8.method471(is, (byte) -30,
										Class4_Sub20_Sub7_Sub6.aClass69_3439,
										Class57.regions, i_13_, i_12_);
							}
						}
					}
					if (Class4_Sub22.aBoolean2400) {
						for (int i_14_ = 0; i_14_ < 4; i_14_++) {
							method938((byte) 0);
							for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -14; i_15_++) {
								for (int i_16_ = 0; i_16_ < 13; i_16_++) {
									boolean bool_17_ = false;
									int i_18_ = (Class80.anIntArrayArrayArray1650[i_14_][i_15_][i_16_]);
									if ((i_18_ ^ 0xffffffff) != 0) {
										int i_19_ = (0x3ffc & i_18_) >> 333304419;
										int i_20_ = (i_18_ & 0x7) >> 855571137;
										int i_21_ = ((i_18_ & 0x35381c9) >> 1935667512);
										int i_22_ = i_18_ >> 1079138478 & 0x3ff;
										int i_23_ = (i_19_ / 8 + (i_22_ / 8 << 1466911880));
										for (int i_24_ = 0; ((Class47.regionIds.length ^ 0xffffffff) < (i_24_ ^ 0xffffffff)); i_24_++) {
											if ((Class47.regionIds[i_24_] == i_23_)
													&& ((RSApplet.regionsData[i_24_]) != null)) {
												SceneGraph
														.createCollisionMaps(
																8 * (i_22_ & 0x7),
																i_21_,
																Class57.regions,
																(RSApplet.regionsData[i_24_]),
																i_20_,
																8 * i_15_,
																(i_19_ & 0x7) * 8,
																true,
																i_16_ * 8,
																i_14_);
												bool_17_ = true;
												break;
											}
										}
									}
									if (!bool_17_)
										Class52.method1000(i_14_, (byte) 6,
												8 * i_16_, i_15_ * 8);
								}
							}
						}
						for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -14; i_25_++) {
							for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > -14; i_26_++) {
								int i_27_ = (Class80.anIntArrayArrayArray1650[0][i_25_][i_26_]);
								if ((i_27_ ^ 0xffffffff) == 0)
									Class12.method676(8, 8 * i_26_, 0, 8,
											8 * i_25_);
							}
						}
						Class81.method1212(true, false);
						for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > -5; i_28_++) {
							method938((byte) 0);
							for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > -14; i_29_++) {
								for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -14; i_30_++) {
									int i_31_ = (Class80.anIntArrayArrayArray1650[i_28_][i_29_][i_30_]);
									if ((i_31_ ^ 0xffffffff) != 0) {
										int i_32_ = (i_31_ & 0x6) >> 105594849;
										int i_33_ = 0x3 & i_31_ >> 203101016;
										int i_34_ = 0x3ff & i_31_ >> -1086288018;
										int i_35_ = i_31_ >> 157063683 & 0x7ff;
										int i_36_ = ((i_34_ / 8 << -833089016) + i_35_ / 8);
										for (int i_37_ = 0; (i_37_ < Class47.regionIds.length); i_37_++) {
											if (((Class47.regionIds[i_37_] ^ 0xffffffff) == (i_36_ ^ 0xffffffff))
													&& (Class4_Sub20_Sub5.aByteArrayArray2887[i_37_]) != null) {
												Class31.method880(
														i_32_,
														8 * i_29_,
														8 * (i_35_ & 0x7),
														(Class4_Sub20_Sub5.aByteArrayArray2887[i_37_]),
														i_33_,
														i_30_ * 8,
														i_28_,
														(i_34_ & 0x7) * 8,
														Class57.regions,
														(Class4_Sub20_Sub7_Sub6.aClass69_3439),
														537);
												break;
											}
										}
									}
								}
							}
						}
					}
					Class81.method1212(true, false);
					Class62.method1050(true);
					method938((byte) 0);
					Class4_Sub20_Sub14.method600(Class57.regions,
							(Class4_Sub20_Sub7_Sub6.aClass69_3439), (byte) -45);
					Class81.method1212(true, false);
					int i_38_ = Class4_Sub6.anInt1918;
					if (Class82.anInt1711 < i_38_)
						i_38_ = Class82.anInt1711;
					if (Class82.anInt1711 + -1 > i_38_)
						i_38_ = -1 + Class82.anInt1711;
					if (Class59.aBoolean1189)
						Class4_Sub20_Sub7_Sub6.aClass69_3439
								.method1148(Class4_Sub6.anInt1918);
					else
						Class4_Sub20_Sub7_Sub6.aClass69_3439.method1148(0);
					for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > -105; i_39_++) {
						for (int i_40_ = 0; i_40_ < 104; i_40_++)
							Class62.method1049(i_40_, i_39_, 64);
					}
					method938((byte) 0);
					Class6.method646(-21691);
					Class10.aClass66_299.method1084(0);
					if (JagexString.aFrame1786 != null) {
						Class66.aClass4_Sub11_Sub1_1328.method264(174, 120);
						Class66.aClass4_Sub11_Sub1_1328.method236(181,
								1057001181);
						Class4_Sub20_Sub13.anInt3119++;
					}
					if (!Class4_Sub22.aBoolean2400) {
						int i_41_ = (Class53.anInt1079 - 6) / 8;
						int i_42_ = (Class53.anInt1079 - -6) / 8;
						int i_43_ = (-6 + Class4_Sub17.anInt2324) / 8;
						int i_44_ = (6 + Class4_Sub17.anInt2324) / 8;
						for (int i_45_ = i_41_ + -1; (i_45_ ^ 0xffffffff) >= (1 + i_42_ ^ 0xffffffff); i_45_++) {
							for (int i_46_ = -1 + i_43_; ((i_46_ ^ 0xffffffff) >= (1 + i_44_ ^ 0xffffffff)); i_46_++) {
								if ((i_45_ ^ 0xffffffff) > (i_41_ ^ 0xffffffff)
										|| (i_45_ ^ 0xffffffff) < (i_42_ ^ 0xffffffff)
										|| (i_46_ ^ 0xffffffff) > (i_43_ ^ 0xffffffff)
										|| (i_46_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff)) {
									Class4_Sub20_Sub6.aClass19_Sub1_2911
											.method745(
													19268,
													(Class4_Sub24
															.method639(
																	(new JagexString[] {
																			(Class4_Sub20_Sub7_Sub1.aJagexString_3294),
																			Class74.method1168(
																					-90,
																					i_45_),
																			Class2.aJagexString_85,
																			Class74.method1168(
																					-19,
																					i_46_) }),
																	-842)));
									Class4_Sub20_Sub6.aClass19_Sub1_2911
											.method745(
													19268,
													(Class4_Sub24
															.method639(
																	(new JagexString[] {
																			Class13.aJagexString_368,
																			Class74.method1168(
																					-7,
																					i_45_),
																			Class2.aJagexString_85,
																			Class74.method1168(
																					-85,
																					i_46_) }),
																	-842)));
								}
							}
						}
					}
					Region.method50(30, 1);
					method938((byte) 0);
					Class13.method681(4);
					Class66.aClass4_Sub11_Sub1_1328.method264(203, 109);
					Region.method51(-1);
				}
			}
			/*
			 * int length = Applet_Sub1.regionsData.length; for (int regionIndex
			 * = 0; length > regionIndex; regionIndex++) { byte[] is =
			 * Class4_Sub20_Sub5.aByteArrayArray2887[regionIndex]; if
			 * (Class57.regions[regionIndex] != null && is != null &&
			 * Class57.regions[regionIndex].clippingData != null) { int id =
			 * Class47.regionIds[regionIndex];
			 * System.out.println("Dumping region: "+id); Region region =
			 * Class57.regions[regionIndex];
			 * //System.out.println("sizeX: "+region.clippingData.length); int
			 * size = 0; for (int x = 0; x < region.clippingData.length; x++) {
			 * for (int y = 0; y < region.clippingData.length; y++) { if
			 * (region.clippingData[x][y] != 16777215 &&
			 * region.clippingData[x][y] != 16777216 &&
			 * region.clippingData[x][y] != 0) { size++;
			 * System.out.println("Value: "+region.clippingData[x][y]); } }
			 * //System.out.println("Size : "+size); }
			 * //System.out.println("Size : "+size); } }
			 */
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "lb.C("
					+ arg0 + ')');
		}
	}

	public static void method938(byte arg0) {
		anInt803++;
		if (arg0 != 0)
			aJagexString_804 = null;
		if (Class4_Sub20_Sub6.aClass43_2932 != null)
			Class4_Sub20_Sub6.aClass43_2932.method954((byte) 105);
		if (JagexException.aClass43_1728 != null)
			JagexException.aClass43_1728.method954((byte) 72);
	}

	public static void method939(byte arg0) {
		try {
			aJagexString_839 = null;
			aJagexString_836 = null;
			if (arg0 >= -103)
				method940(null, -81);
			aJagexString_834 = null;
			aJagexString_835 = null;
			aJagexString_838 = null;
			aJagexString_797 = null;
			aClass4_Sub11_796 = null;
			aJagexString_818 = null;
			aJagexString_804 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "lb.E("
					+ arg0 + ')');
		}
	}

	public static void method940(RSApplet arg0, int arg1) {
		try {
			if (arg1 >= 112) {
				anInt817++;
				if (Class49.aBoolean990)
					Class43.method966(14, arg0);
				else {
					if ((Class62.anInt1227 ^ 0xffffffff) == -2
							&& Class37.anInt758 >= 715
							&& ((JagexException.anInt1729 ^ 0xffffffff) <= -454)) {
						Class34.aBoolean1765 = !Class34.aBoolean1765;
						if (Class34.aBoolean1765)
							Class4_Sub20_Sub16.method606(25651);
						else
							RSApplet.method20(255, Class9.aJagexString_269, false,
									21332, Class34.aJagexString_1767,
									Class54.aClass19_Sub1_1107);
					}
					if (Class54.anInt1109 != 5) {
						Client.anInt1833++;
						if ((Class54.anInt1109 ^ 0xffffffff) == -11) {
							if ((Class25.anInt583 ^ 0xffffffff) != -3
									&& ((Class19_Sub1.anInt2536 ^ 0xffffffff) == -1)) {
								if (Class62.anInt1227 == 1) {
									int i = 463;
									int i_47_ = 5;
									int i_48_ = 100;
									int i_49_ = 35;
									if (((Class37.anInt758 ^ 0xffffffff) <= (i_47_ ^ 0xffffffff))
											&& Class37.anInt758 <= i_48_
													+ i_47_
											&& ((i ^ 0xffffffff) >= (JagexException.anInt1729 ^ 0xffffffff))
											&& i_49_ + i >= (JagexException.anInt1729)) {
										Class81.method1206(32768);
										return;
									}
								}
								if (StreamBuffer.aClass64_2096 != null)
									Class81.method1206(32768);
							}
							int i = Class37.anInt758;
							int i_50_ = Class62.anInt1227;
							int i_51_ = JagexException.anInt1729;
							if (Class4_Sub20_Sub14.anInt3140 == 0) {
								int i_52_ = 302;
								int i_53_ = 291;
								if (i_50_ == 1
										&& (i ^ 0xffffffff) <= (i_52_ + -75 ^ 0xffffffff)
										&& (i ^ 0xffffffff) >= (75 + i_52_ ^ 0xffffffff)
										&& ((-20 + i_53_ ^ 0xffffffff) >= (i_51_ ^ 0xffffffff))
										&& ((i_51_ ^ 0xffffffff) >= (i_53_ + 20 ^ 0xffffffff))) {
									Class4_Sub20_Sub7_Sub1_Sub1.anInt3581 = 0;
									Class4_Sub20_Sub14.anInt3140 = 3;
								}
								i_52_ = 462;
								if ((i_50_ ^ 0xffffffff) == -2
										&& i >= i_52_ + -75
										&& i <= 75 + i_52_
										&& i_51_ >= i_53_ + -20
										&& ((i_51_ ^ 0xffffffff) >= (20 + i_53_ ^ 0xffffffff))) {
									Class4_Sub20_Sub7_Sub1_Sub1.anInt3581 = 0;
									Class34.aJagexString_1766 = Class11.aJagexString_323;
									Class34.aJagexString_1769 = Class81.aJagexString_1651;
									Class4_Sub20_Sub14.anInt3140 = 2;
									Class34.aJagexString_1771 = Class81.aJagexString_1707;
								}
							} else if ((Class4_Sub20_Sub14.anInt3140 ^ 0xffffffff) != -3) {
								if (Class4_Sub20_Sub14.anInt3140 == 3) {
									int i_54_ = 382;
									int i_55_ = 321;
									if (i_50_ == 1
											&& (i ^ 0xffffffff) <= (-75 + i_54_ ^ 0xffffffff)
											&& i <= 75 + i_54_
											&& ((i_51_ ^ 0xffffffff) <= (i_55_ - 20 ^ 0xffffffff))
											&& ((i_51_ ^ 0xffffffff) >= (i_55_
													- -20 ^ 0xffffffff)))
										Class4_Sub20_Sub14.anInt3140 = 0;
								}
							} else {
								int i_56_ = 231;
								i_56_ += 30;
								int i_57_ = 302;
								if (i_50_ == 1
										&& (i_51_ ^ 0xffffffff) <= (i_56_ + -15 ^ 0xffffffff)
										&& i_51_ < i_56_)
									Class4_Sub20_Sub7_Sub1_Sub1.anInt3581 = 0;
								i_56_ += 15;
								int i_58_ = 321;
								if ((i_50_ ^ 0xffffffff) == -2
										&& (i_51_ ^ 0xffffffff) <= (i_56_ - 15 ^ 0xffffffff)
										&& (i_56_ ^ 0xffffffff) < (i_51_ ^ 0xffffffff))
									Class4_Sub20_Sub7_Sub1_Sub1.anInt3581 = 1;
								i_56_ += 15;
								if ((i_50_ ^ 0xffffffff) == -2
										&& (i ^ 0xffffffff) <= (-75 + i_57_ ^ 0xffffffff)
										&& ((75 + i_57_ ^ 0xffffffff) <= (i ^ 0xffffffff))
										&& -20 + i_58_ <= i_51_
										&& i_58_ - -20 >= i_51_) {
									Class34.aJagexString_1768 = Class34.aJagexString_1768
											.method816(122).method839(85);
									if ((Class34.aJagexString_1768.method825(-111) ^ 0xffffffff) == -1)
										Class4_Sub20_Sub9.method477(
												Class6.aJagexString_210, 17,
												Class81.aJagexString_1704,
												Class81.aJagexString_1652);
									else if ((Class34.aJagexString_1764
											.method825(-99) ^ 0xffffffff) == -1)
										Class4_Sub20_Sub9.method477(
												Class64.aJagexString_1281, 102,
												Class81.aJagexString_1683,
												Class81.aJagexString_1685);
									else {
										Class4_Sub20_Sub9.method477(
												Class10.aJagexString_311, 12,
												Class81.aJagexString_1700,
												Class81.aJagexString_1691);
										Region.method50(20, 1);
									}
								} else {
									i_57_ = 462;
									if ((i_50_ ^ 0xffffffff) == -2
											&& (i ^ 0xffffffff) <= (i_57_ - 75 ^ 0xffffffff)
											&& i_57_ - -75 >= i
											&& ((i_58_ + -20 ^ 0xffffffff) >= (i_51_ ^ 0xffffffff))
											&& i_58_ + 20 >= i_51_) {
										Class4_Sub20_Sub14.anInt3140 = 0;
										Class34.aJagexString_1764 = Class34.aJagexString_1767;
										Class34.aJagexString_1768 = Class34.aJagexString_1767;
									}
									while (RSCanvas.method34(127)) {
										boolean bool = false;
										for (int i_59_ = 0; ((i_59_ ^ 0xffffffff) > (Class4_Sub20_Sub3.aJagexString_2840
												.method825(-101) ^ 0xffffffff)); i_59_++) {
											if ((Class48.anInt980 ^ 0xffffffff) == ((Class4_Sub20_Sub3.aJagexString_2840
													.method834(21340, i_59_)) ^ 0xffffffff)) {
												bool = true;
												break;
											}
										}
										if (((Class4_Sub20_Sub7_Sub1_Sub1.anInt3581) ^ 0xffffffff) == -1) {
											if ((Class4_Sub15.anInt2298 ^ 0xffffffff) == -86
													&& Class34.aJagexString_1768
															.method825(-110) > 0)
												Class34.aJagexString_1768 = (Class34.aJagexString_1768
														.method829(
																(byte) -119,
																0,
																(-1 + (Class34.aJagexString_1768
																		.method825(-125)))));
											if ((Class4_Sub15.anInt2298 ^ 0xffffffff) == -85
													|| (Class4_Sub15.anInt2298 ^ 0xffffffff) == -81)
												Class4_Sub20_Sub7_Sub1_Sub1.anInt3581 = 1;
											if (bool
													&& (Class34.aJagexString_1768
															.method825(-111) ^ 0xffffffff) > -13)
												Class34.aJagexString_1768 = (Class34.aJagexString_1768
														.method838(
																15871,
																Class48.anInt980));
										} else if (((Class4_Sub20_Sub7_Sub1_Sub1.anInt3581) ^ 0xffffffff) == -2) {
											if ((Class4_Sub15.anInt2298 ^ 0xffffffff) == -86
													&& Class34.aJagexString_1764
															.method825(-99) > 0)
												Class34.aJagexString_1764 = (Class34.aJagexString_1764
														.method829(
																(byte) 70,
																0,
																(-1 + (Class34.aJagexString_1764
																		.method825(-125)))));
											if ((Class4_Sub15.anInt2298 ^ 0xffffffff) == -85
													|| (Class4_Sub15.anInt2298 ^ 0xffffffff) == -81)
												Class4_Sub20_Sub7_Sub1_Sub1.anInt3581 = 0;
											if ((Class12.anInt341 ^ 0xffffffff) == -3
													&& (Class4_Sub15.anInt2298 == 84)) {
												Class34.aJagexString_1768 = Class34.aJagexString_1768
														.method816(-93)
														.method839(111);
												if ((Class34.aJagexString_1768
														.method825(-102) ^ 0xffffffff) == -1)
													Class4_Sub20_Sub9
															.method477(
																	Class6.aJagexString_210,
																	121,
																	Class81.aJagexString_1704,
																	(Class81.aJagexString_1652));
												else {
													if ((Class34.aJagexString_1764
															.method825(-102) ^ 0xffffffff) == -1)
														Class4_Sub20_Sub9
																.method477(
																		(Class64.aJagexString_1281),
																		31,
																		(Class81.aJagexString_1683),
																		(Class81.aJagexString_1685));
													else {
														Class4_Sub20_Sub9
																.method477(
																		(Class10.aJagexString_311),
																		117,
																		(Class81.aJagexString_1700),
																		(Class81.aJagexString_1691));
														Region.method50(20, 1);
														break;
													}
													break;
												}
												break;
											}
											if (bool
													&& Class34.aJagexString_1764
															.method825(-110) < 20)
												Class34.aJagexString_1764 = (Class34.aJagexString_1764
														.method838(
																15871,
																Class48.anInt980));
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("lb.A("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static int method941(int arg0) {
		try {
			anInt828++;
			if (arg0 != 8)
				aJagexString_834 = null;
			return RSApplet.idleTime++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "lb.B("
					+ arg0 + ')');
		}
	}

	public boolean[] aBooleanArray812;
	public boolean[] aBooleanArray813;
	public byte aByte795;
	public byte[] aByteArray793;
	public byte[] aByteArray794;
	public byte[] aByteArray800 = new byte[256];
	public byte[] aByteArray829;
	public byte[] aByteArray830;
	public byte[] aByteArray831;
	public byte[][] aByteArrayArray811;
	public int anInt799;
	public int anInt801;
	public int anInt802;
	public int anInt805;
	public int anInt809;
	public int anInt810;
	public int anInt814;
	public int anInt819;
	public int anInt820;
	public int anInt821;
	public int anInt824;
	public int anInt825;
	public int anInt826;
	public int anInt827;
	public int anInt832;
	public int[] anIntArray806;

	public int[] anIntArray807;

	public int[] anIntArray816;

	public int[] anIntArray833;

	public int[][] anIntArrayArray798;

	public int[][] anIntArrayArray815;

	public int[][] anIntArrayArray823;

	public Class41() {
		aByteArray793 = new byte[4096];
		anIntArray807 = new int[257];
		anIntArrayArray798 = new int[6][258];
		anIntArray806 = new int[256];
		aBooleanArray812 = new boolean[256];
		anIntArrayArray823 = new int[6][258];
		anIntArrayArray815 = new int[6][258];
		aByteArray830 = new byte[18002];
		anInt825 = 0;
		aByteArrayArray811 = new byte[6][258];
		aByteArray829 = new byte[18002];
		anInt832 = 0;
		aBooleanArray813 = new boolean[16];
		anIntArray833 = new int[6];
		anIntArray816 = new int[16];
	}
}
