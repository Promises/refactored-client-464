package com.jagex.runescape;

import java.math.BigInteger;

public class Class12 {
    public static BigInteger rsaModulus = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    public static Class4_Sub20_Sub12_Sub1[] aClass4_Sub20_Sub12_Sub1Array359;
    public static Class66 aClass66_367 = new Class66(64);
    public static int anInt338;
    public static int anInt341 = 0;
    public static int anInt344;
    public static int anInt345;
    public static int anInt348;
    public static int anInt356;
    public static int anInt358;
    public static int[] anIntArray342 = new int[50];
    public static int[] anIntArray357 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2,
            2, 2, 2, 2, 2, 2, 2, 2, 3};
    public static Object anObject366 = new Object();

    public static void method675(int arg0) {
        anInt338++;
        if (Class4_Sub20_Sub11.incomingPacket == 39) {
            int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method223(0);
            int i_0_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method240(arg0
                    ^ ~0x7f97);
            int i_1_ = (((i_0_ & 0x74) >> 1302313444) + Class4_Sub20_Sub7_Sub4.anInt3367);
            int i_2_ = Class64.anInt1273 - -(i_0_ & 0x7);
            if (i_1_ >= 0 && i_2_ >= 0 && (i_1_ ^ 0xffffffff) > -105
                    && (i_2_ ^ 0xffffffff) > -105) {
                Class65 class65 = (Class40.aClass65ArrayArrayArray787[Class82.plane][i_1_][i_2_]);
                if (class65 != null) {
                    for (Class4_Sub20_Sub7_Sub4 class4_sub20_sub7_sub4 = ((Class4_Sub20_Sub7_Sub4) class65
                            .method1071(-127)); class4_sub20_sub7_sub4 != null; class4_sub20_sub7_sub4 = ((Class4_Sub20_Sub7_Sub4) class65
                            .method1075(18485))) {
                        if ((class4_sub20_sub7_sub4.anInt3379 ^ 0xffffffff) == (i & 0x7fff ^ 0xffffffff)) {
                            class4_sub20_sub7_sub4.clear();
                            break;
                        }
                    }
                    if (class65.method1071(-127) == null)
                        Class40.aClass65ArrayArrayArray787[Class82.plane][i_1_][i_2_] = null;
                    Class62.method1049(i_2_, i_1_, arg0 ^ ~0x28);
                }
            }
        } else if (Class4_Sub20_Sub11.incomingPacket == 186) {
            int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get();
            int i_3_ = (0x7 & i) + Class64.anInt1273;
            int i_4_ = (((0x7a & i) >> -1853807996) + Class4_Sub20_Sub7_Sub4.anInt3367);
            int i_5_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                    .method209((byte) -101);
            int i_6_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get();
            int i_7_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                    .method209((byte) -100);
            if ((i_4_ ^ 0xffffffff) <= -1 && i_3_ >= 0
                    && (i_4_ ^ 0xffffffff) > -105 && (i_3_ ^ 0xffffffff) > -105) {
                i_4_ = i_4_ * 128 + 64;
                i_3_ = i_3_ * 128 - -64;
                Class4_Sub20_Sub7_Sub3 class4_sub20_sub7_sub3 = (new Class4_Sub20_Sub7_Sub3(
                        i_5_, Class82.plane, i_4_, i_3_,
                        Class67.getFloorDrawHeight(i_4_, i_3_, Class82.plane)
                                + -i_6_, i_7_, Region.anInt134));
                Class4_Sub20_Sub13.aClass65_3106.method1068(
                        class4_sub20_sub7_sub3, (byte) -115);
            }
        } else {
            if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -240) {
                int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method209((byte) -105);
                int i_8_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method223(0);
                int i_9_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method229(-123);
                int i_10_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method242(0);
                int i_11_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method239((byte) 69);
                int i_12_ = Class64.anInt1273 + (0x7 & i_11_);
                int i_13_ = ((0x7 & i_11_ >> -1707650300) + Class4_Sub20_Sub7_Sub4.anInt3367);
                int i_14_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method261(arg0 ^ 0x39);
                int i_15_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method223(0);
                int i_16_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method239((byte) 66);
                int i_17_ = i_16_ >> 897576994;
                int i_18_ = 0x3 & i_16_;
                int i_19_ = anIntArray357[i_17_];
                int i_20_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method245(12605);
                int i_21_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method213((byte) -93);
                Player player;
                if (i != Region.anInt127)
                    player = (Class4_Sub20_Sub7_Sub4.aPlayerArray3358[i]);
                else
                    player = Class4_Sub15.localPlayer;
                if (player != null) {
                    Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(true,
                            i_21_);
                    int i_22_ = (Class4_Sub23.intGroundArray[Class82.plane][i_13_][i_12_]);
                    int i_23_ = (Class4_Sub23.intGroundArray[Class82.plane][1 + i_13_][i_12_]);
                    int i_24_ = (Class4_Sub23.intGroundArray[Class82.plane][i_13_
                            - -1][i_12_ - -1]);
                    int i_25_ = (Class4_Sub23.intGroundArray[Class82.plane][i_13_][1 + i_12_]);
                    Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = class4_sub20_sub1
                            .method326(i_23_, i_17_, i_18_, i_24_, i_25_,
                                    false, i_22_);
                    if (class4_sub20_sub7_sub7 != null) {
                        Class27.method847(-1, 0, i_13_, 0, i_19_, -1, i_8_ + 1,
                                i_12_, 1 + i_15_, Class82.plane);
                        player.anInt3601 = Region.anInt134
                                + i_15_;
                        int i_26_ = class4_sub20_sub1.anInt2725;
                        player.anInt3608 = i_8_
                                - -Region.anInt134;
                        player.aClass4_Sub20_Sub7_Sub7_3596 = class4_sub20_sub7_sub7;
                        if (i_10_ > i_20_) {
                            int i_27_ = i_10_;
                            i_10_ = i_20_;
                            i_20_ = i_27_;
                        }
                        int i_28_ = class4_sub20_sub1.anInt2744;
                        if ((i_9_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff)) {
                            int i_29_ = i_14_;
                            i_14_ = i_9_;
                            i_9_ = i_29_;
                        }
                        if ((i_18_ ^ 0xffffffff) == -2 || i_18_ == 3) {
                            i_28_ = class4_sub20_sub1.anInt2725;
                            i_26_ = class4_sub20_sub1.anInt2744;
                        }
                        player.anInt3598 = 64 * i_28_
                                + 128 * i_12_;
                        player.anInt3602 = 64 * i_26_
                                + i_13_ * 128;
                        player.anInt3583 = Class67
                                .getFloorDrawHeight(
                                        (player.anInt3602),
                                        (player.anInt3598),
                                        Class82.plane);
                        player.anInt3591 = i_9_ + i_12_;
                        player.anInt3612 = i_20_ + i_13_;
                        player.anInt3611 = i_10_ + i_13_;
                        player.anInt3605 = i_14_ + i_12_;
                    }
                }
            }
            if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -219) {
                int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get();
                int i_30_ = (((i & 0x7f) >> 1717267588) + Class4_Sub20_Sub7_Sub4.anInt3367);
                int i_31_ = (i & 0x7) + Class64.anInt1273;
                int i_32_ = (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method229(arg0 ^ ~0x30) + i_30_);
                int i_33_ = i_31_
                        + Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method229(14);
                int i_34_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method238((byte) -56);
                int i_35_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method209((byte) -107);
                int i_36_ = 4 * Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get();
                int i_37_ = 4 * Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get();
                int i_38_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method209((byte) -100);
                int i_39_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                        .method209((byte) -105);
                int i_40_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get();
                int i_41_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get();
                if ((i_30_ ^ 0xffffffff) <= -1 && (i_31_ ^ 0xffffffff) <= -1
                        && i_30_ < 104 && (i_31_ ^ 0xffffffff) > -105
                        && (i_32_ ^ 0xffffffff) <= -1 && i_33_ >= 0
                        && (i_32_ ^ 0xffffffff) > -105 && i_33_ < 104
                        && (i_35_ ^ 0xffffffff) != -65536) {
                    i_31_ = i_31_ * 128 - -64;
                    i_32_ = 64 + 128 * i_32_;
                    i_33_ = i_33_ * 128 - -64;
                    i_30_ = 128 * i_30_ + 64;
                    Class4_Sub20_Sub7_Sub5 class4_sub20_sub7_sub5 = (new Class4_Sub20_Sub7_Sub5(
                            i_35_, Class82.plane, i_30_, i_31_, -i_36_
                            + Class67.getFloorDrawHeight(i_30_, i_31_, Class82.plane
                    ), Region.anInt134
                            + i_38_, Region.anInt134 + i_39_, i_40_,
                            i_41_, i_34_, i_37_));
                    class4_sub20_sub7_sub5.method425(
                            i_32_,
                            -i_37_
                                    + Class67.getFloorDrawHeight(i_32_, i_33_, Class82.plane
                            ), i_38_
                                    - -Region.anInt134, i_33_, 121);
                    Class4_Sub20_Sub11.aClass65_3075.method1068(
                            class4_sub20_sub7_sub5, (byte) -117);
                }
            } else {
                if (arg0 != -105)
                    anInt341 = -53;
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -209) {
                    int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get();
                    int i_42_ = ((i >> -63049820 & 0x7) + Class4_Sub20_Sub7_Sub4.anInt3367);
                    int i_43_ = Class64.anInt1273 + (i & 0x7);
                    int i_44_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method209((byte) -107);
                    int i_45_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method209((byte) -119);
                    int i_46_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method209((byte) -101);
                    if (i_42_ >= 0 && (i_43_ ^ 0xffffffff) <= -1
                            && (i_42_ ^ 0xffffffff) > -105
                            && (i_43_ ^ 0xffffffff) > -105) {
                        Class65 class65 = (Class40.aClass65ArrayArrayArray787[Class82.plane][i_42_][i_43_]);
                        if (class65 != null) {
                            for (Class4_Sub20_Sub7_Sub4 class4_sub20_sub7_sub4 = ((Class4_Sub20_Sub7_Sub4) class65
                                    .method1071(-126)); class4_sub20_sub7_sub4 != null; class4_sub20_sub7_sub4 = ((Class4_Sub20_Sub7_Sub4) class65
                                    .method1075(18485))) {
                                if (((i_44_ & 0x7fff ^ 0xffffffff) == (class4_sub20_sub7_sub4.anInt3379 ^ 0xffffffff))
                                        && ((i_45_ ^ 0xffffffff) == (class4_sub20_sub7_sub4.anInt3378 ^ 0xffffffff))) {
                                    class4_sub20_sub7_sub4.anInt3378 = i_46_;
                                    break;
                                }
                            }
                            Class62.method1049(i_43_, i_42_, 64);
                        }
                    }
                } else {
                    if (Class4_Sub20_Sub11.incomingPacket == 61) {
                        int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get();
                        int i_47_ = (((0x74 & i) >> 1020323844) + Class4_Sub20_Sub7_Sub4.anInt3367);
                        int i_48_ = Class64.anInt1273 + (i & 0x7);
                        int i_49_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method209((byte) -121);
                        int i_50_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .get();
                        int i_51_ = (0xf0 & i_50_) >> -1244425436;
                        int i_52_ = 0x7 & i_50_;
                        int i_53_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .get();
                        if (i_47_ >= 0 && i_48_ >= 0
                                && (i_47_ ^ 0xffffffff) > -105
                                && (i_48_ ^ 0xffffffff) > -105) {
                            int i_54_ = i_51_ - -1;
                            if ((-i_54_ + i_47_ <= (Class4_Sub15.localPlayer.anIntArray3248[0]))
                                    && (((Class4_Sub15.localPlayer.anIntArray3248[0]) ^ 0xffffffff) >= (i_47_
                                    - -i_54_ ^ 0xffffffff))
                                    && (((Class4_Sub15.localPlayer.anIntArray3247[0]) ^ 0xffffffff) <= (-i_54_
                                    + i_48_ ^ 0xffffffff))
                                    && (((Class4_Sub15.localPlayer.anIntArray3247[0]) ^ 0xffffffff) >= (i_48_
                                    - -i_54_ ^ 0xffffffff))
                                    && (Class71.anInt1480 ^ 0xffffffff) != -1
                                    && i_52_ > 0
                                    && (Class5.anInt175 ^ 0xffffffff) > -51) {
                                Class4_Sub6.anIntArray1915[Class5.anInt175] = i_49_;
                                anIntArray342[Class5.anInt175] = i_52_;
                                Class25.anIntArray593[Class5.anInt175] = i_53_;
                                Class48.aClass36Array974[Class5.anInt175] = null;
                                Class1.anIntArray78[Class5.anInt175] = ((i_48_ << -486184920)
                                        + (i_47_ << 1508236464) + i_51_);
                                Class5.anInt175++;
                            }
                        }
                    }
                    if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -27) {
                        int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method240(32767);
                        int i_55_ = (0x7 & i) + Class64.anInt1273;
                        int i_56_ = (Class4_Sub20_Sub7_Sub4.anInt3367 - -((i & 0x72) >> -384487932));
                        int i_57_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method223(arg0 ^ ~0x68);
                        int i_58_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method223(arg0 + 105);
                        int i_59_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method235((byte) 109);
                        if (i_56_ >= 0 && i_55_ >= 0
                                && (i_56_ ^ 0xffffffff) > -105 && i_55_ < 104
                                && i_59_ != Region.anInt127) {
                            Class4_Sub20_Sub7_Sub4 class4_sub20_sub7_sub4 = new Class4_Sub20_Sub7_Sub4();
                            class4_sub20_sub7_sub4.anInt3379 = i_58_;
                            class4_sub20_sub7_sub4.anInt3378 = i_57_;
                            if ((Class40.aClass65ArrayArrayArray787[Class82.plane][i_56_][i_55_]) == null)
                                Class40.aClass65ArrayArrayArray787[Class82.plane][i_56_][i_55_] = new Class65();
                            Class40.aClass65ArrayArrayArray787[Class82.plane][i_56_][i_55_]
                                    .method1068(class4_sub20_sub7_sub4,
                                            (byte) -123);
                            Class62.method1049(i_55_, i_56_, arg0 + 169);
                        }
                    } else if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -17) {
                        int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method239((byte) 59);
                        int i_60_ = 0x3 & i;
                        int i_61_ = i >> -987156830;
                        int i_62_ = anIntArray357[i_61_];
                        int i_63_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method239((byte) 126);
                        int i_64_ = ((0x7 & i_63_ >> 1320670308) + Class4_Sub20_Sub7_Sub4.anInt3367);
                        int i_65_ = Class64.anInt1273 - -(0x7 & i_63_);
                        if (i_64_ >= 0 && (i_65_ ^ 0xffffffff) <= -1
                                && (i_64_ ^ 0xffffffff) > -105
                                && (i_65_ ^ 0xffffffff) > -105)
                            Class27.method847(-1, i_60_, i_64_, i_61_, i_62_,
                                    -1, 0, i_65_, -1, Class82.plane);
                    } else if (Class4_Sub20_Sub11.incomingPacket == 17) {
                        int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method239((byte) 45);
                        int i_66_ = (Class4_Sub20_Sub7_Sub4.anInt3367 - -((i & 0x70) >> 1288274628));
                        int i_67_ = Class64.anInt1273 - -(0x7 & i);
                        int i_68_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method213((byte) -108);
                        int i_69_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method239((byte) 44);
                        int i_70_ = 0x3 & i_69_;
                        int i_71_ = i_69_ >> 2032990946;
                        int i_72_ = anIntArray357[i_71_];
                        if (i_66_ >= 0 && i_67_ >= 0
                                && (i_66_ ^ 0xffffffff) > -105
                                && (i_67_ ^ 0xffffffff) > -105)
                            Class27.method847(-1, i_70_, i_66_, i_71_, i_72_,
                                    i_68_, 0, i_67_, -1, Class82.plane);
                    } else if (Class4_Sub20_Sub11.incomingPacket == 140) {
                        int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method235((byte) -64);
                        int i_73_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .get();
                        int i_74_ = (Class4_Sub20_Sub7_Sub4.anInt3367 + ((0x72 & i_73_) >> -1595528924));
                        int i_75_ = Class64.anInt1273 - -(0x7 & i_73_);
                        int i_76_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .get();
                        int i_77_ = i_76_ & 0x3;
                        int i_78_ = i_76_ >> -2048147678;
                        int i_79_ = anIntArray357[i_78_];
                        if (i_74_ >= 0 && (i_75_ ^ 0xffffffff) <= -1
                                && i_74_ < 103 && i_75_ < 103) {
                            int i_80_ = (Class4_Sub23.intGroundArray[Class82.plane][i_74_
                                    - -1][1 + i_75_]);
                            int i_81_ = (Class4_Sub23.intGroundArray[Class82.plane][i_74_][1 + i_75_]);
                            int i_82_ = (Class4_Sub23.intGroundArray[Class82.plane][1 + i_74_][i_75_]);
                            int i_83_ = (Class4_Sub23.intGroundArray[Class82.plane][i_74_][i_75_]);
                            if (i_79_ == 0) {
                                Class68 class68 = (Class4_Sub20_Sub7_Sub6.aClass69_3439
                                        .method1142(Class82.plane, i_74_,
                                                i_75_));
                                if (class68 != null) {
                                    int i_84_ = ((class68.anInt1371 & 0x1fffe56f) >> 622153774);
                                    if (i_78_ == 2) {
                                        class68.aClass4_Sub20_Sub7_1372 = (new Class4_Sub20_Sub7_Sub6(
                                                i_84_,
                                                2,
                                                i_77_ + 4,
                                                i_83_,
                                                i_82_,
                                                i_80_,
                                                i_81_,
                                                i,
                                                false,
                                                (class68.aClass4_Sub20_Sub7_1372)));
                                        class68.aClass4_Sub20_Sub7_1375 = (new Class4_Sub20_Sub7_Sub6(
                                                i_84_,
                                                2,
                                                0x3 & i_77_ + 1,
                                                i_83_,
                                                i_82_,
                                                i_80_,
                                                i_81_,
                                                i,
                                                false,
                                                (class68.aClass4_Sub20_Sub7_1375)));
                                    } else
                                        class68.aClass4_Sub20_Sub7_1372 = (new Class4_Sub20_Sub7_Sub6(
                                                i_84_,
                                                i_78_,
                                                i_77_,
                                                i_83_,
                                                i_82_,
                                                i_80_,
                                                i_81_,
                                                i,
                                                false,
                                                (class68.aClass4_Sub20_Sub7_1372)));
                                }
                            }
                            if (i_79_ == 1) {
                                Class25 class25 = (Class4_Sub20_Sub7_Sub6.aClass69_3439
                                        .method1111(Class82.plane, i_74_,
                                                i_75_));
                                if (class25 != null)
                                    class25.aClass4_Sub20_Sub7_570 = (new Class4_Sub20_Sub7_Sub6(
                                            (class25.anInt572 >> 981010414 & 0x7fff),
                                            4, 0, i_83_, i_82_, i_80_, i_81_,
                                            i, false,
                                            class25.aClass4_Sub20_Sub7_570));
                            }
                            if ((i_79_ ^ 0xffffffff) == -3) {
                                if ((i_78_ ^ 0xffffffff) == -12)
                                    i_78_ = 10;
                                Class67 class67 = (Class4_Sub20_Sub7_Sub6.aClass69_3439
                                        .method1115(Class82.plane, i_74_,
                                                i_75_));
                                if (class67 != null)
                                    class67.aClass4_Sub20_Sub7_1366 = (new Class4_Sub20_Sub7_Sub6(
                                            (class67.anInt1361 >> 2043403054 & 0x7fff),
                                            i_78_, i_77_, i_83_, i_82_, i_80_,
                                            i_81_, i, false,
                                            class67.aClass4_Sub20_Sub7_1366));
                            }
                            if (i_79_ == 3) {
                                Class74 class74 = (Class4_Sub20_Sub7_Sub6.aClass69_3439
                                        .method1108(Class82.plane, i_74_,
                                                i_75_));
                                if (class74 != null)
                                    class74.aClass4_Sub20_Sub7_1512 = (new Class4_Sub20_Sub7_Sub6(
                                            (class74.anInt1509 >> 1618089070 & 0x7fff),
                                            22, i_77_, i_83_, i_82_, i_80_,
                                            i_81_, i, false,
                                            class74.aClass4_Sub20_Sub7_1512));
                            }
                        }
                    } else if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -113) {
                        int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method209((byte) -117);
                        int i_85_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method213((byte) -124);
                        int i_86_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method240(32767);
                        int i_87_ = (((0x71 & i_86_) >> -543299452) + Class4_Sub20_Sub7_Sub4.anInt3367);
                        int i_88_ = Class64.anInt1273 - -(i_86_ & 0x7);
                        if (i_87_ >= 0 && (i_88_ ^ 0xffffffff) <= -1
                                && i_87_ < 104 && i_88_ < 104) {
                            Class4_Sub20_Sub7_Sub4 class4_sub20_sub7_sub4 = new Class4_Sub20_Sub7_Sub4();
                            class4_sub20_sub7_sub4.anInt3378 = i_85_;
                            class4_sub20_sub7_sub4.anInt3379 = i;
                            if ((Class40.aClass65ArrayArrayArray787[Class82.plane][i_87_][i_88_]) == null)
                                Class40.aClass65ArrayArrayArray787[Class82.plane][i_87_][i_88_] = new Class65();
                            Class40.aClass65ArrayArrayArray787[Class82.plane][i_87_][i_88_]
                                    .method1068(class4_sub20_sub7_sub4,
                                            (byte) -116);
                            Class62.method1049(i_88_, i_87_, arg0 + 169);
                        }
                    }
                }
            }
        }
    }

    public static void method676(int arg0, int arg1, int arg2, int arg3,
                                 int arg4) {
        try {
            if (arg2 != 0)
                anObject366 = null;
            for (int i = arg1; arg1 + arg3 >= i; i++) {
                for (int i_89_ = arg4; i_89_ <= arg4 - -arg0; i_89_++) {
                    if ((i_89_ ^ 0xffffffff) <= -1 && i_89_ < 104
                            && (i ^ 0xffffffff) <= -1
                            && (i ^ 0xffffffff) > -105) {
                        Class4_Sub14.aByteArrayArrayArray2275[0][i_89_][i] = (byte) 127;
                        if ((i_89_ ^ 0xffffffff) == (arg4 ^ 0xffffffff)
                                && (i_89_ ^ 0xffffffff) < -1)
                            Class4_Sub23.intGroundArray[0][i_89_][i] = (Class4_Sub23.intGroundArray[0][i_89_ - 1][i]);
                        if (arg0 + arg4 == i_89_ && (i_89_ ^ 0xffffffff) > -104)
                            Class4_Sub23.intGroundArray[0][i_89_][i] = (Class4_Sub23.intGroundArray[0][1 + i_89_][i]);
                        if ((i ^ 0xffffffff) == (arg1 ^ 0xffffffff) && i > 0)
                            Class4_Sub23.intGroundArray[0][i_89_][i] = (Class4_Sub23.intGroundArray[0][i_89_][i - 1]);
                        if (i == arg3 + arg1 && (i ^ 0xffffffff) > -104)
                            Class4_Sub23.intGroundArray[0][i_89_][i] = (Class4_Sub23.intGroundArray[0][i_89_][i
                                    - -1]);
                    }
                }
            }
            anInt345++;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    ("cd.C(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
                            + ',' + arg4 + ')'));
        }
    }

    public static int method677(int arg0, int arg1) {
        try {
            anInt358++;
            arg1 = --arg1 | arg1 >>> 1522459361;
            arg1 |= arg1 >>> -191419742;
            arg1 |= arg1 >>> -923167228;
            arg1 |= arg1 >>> -473856792;
            if (arg0 != -473856792)
                rsaModulus = null;
            arg1 |= arg1 >>> -940770512;
            return 1 + arg1;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("cd.A("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    public static void method678(boolean arg0) {
        try {
            if (arg0 != true)
                method677(-102, -78);
            aClass4_Sub20_Sub12_Sub1Array359 = null;
            anIntArray342 = null;
            anObject366 = null;
            StringUtilities.aJagexString_346 = null;
            StringUtilities.aJagexString_363 = null;
            aClass66_367 = null;
            StringUtilities.aJagexString_361 = null;
            rsaModulus = null;
            anIntArray357 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "cd.B("
                    + arg0 + ')');
        }
    }

    public int anInt332;
    public int anInt333;
    public int anInt334;
    public int anInt335;
    public int anInt337;
    public int anInt339;
    public int anInt340;
    public int anInt343;
    public int anInt347;
    public int anInt349;
    public int anInt351;
    public int anInt352;
    public int anInt353;

    public int anInt354;

    public int anInt355;

    public int anInt360;

    public int anInt362;

    public int anInt365;
}
