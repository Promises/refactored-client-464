package com.jagex.runescape;

import com.jagex.runescape.audio.Effect;

public class Class48 {
    public static Effect[] aEffectArray974 = new Effect[50];
    public static int anInt975;
    public static int anInt976 = 1;
    public static int anInt978;
    public static int anInt980;
    public static int anInt981 = 0;
    public static int anInt982;
    public static int anInt983;
    public static int anInt984 = 0;
    public static int anInt987;
    public static int anInt989 = 0;
    public static int[] anIntArray979 = new int[2048];

    public static void method983(int arg0, int arg1, int arg2) {
        try {
            anInt978++;
            int[] is = new int[4];
            is[0] = arg2;
            int[] is_0_ = new int[4];
            is_0_[0] = arg1;
            int i = 1;
            if (arg0 != -18088) {
                anInt989 = -21;
            }
            for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -5; i_1_++) {
                if ((Class4_Sub7.anIntArray1947[i_1_] ^ 0xffffffff) != (arg2 ^ 0xffffffff)) {
                    is[i] = Class4_Sub7.anIntArray1947[i_1_];
                    is_0_[i] = Class65.anIntArray1289[i_1_];
                    i++;
                }
            }
            Class65.anIntArray1289 = is_0_;
            Class4_Sub7.anIntArray1947 = is;
            Class4_Sub20_Sub15.method601(Class65.anIntArray1289, arg0 + 18084,
                    -1 + (Player.aClass9Array3579).length,
                    Class4_Sub7.anIntArray1947, 0,
                    (Player.aClass9Array3579));
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, ("mf.C("
                    + arg0 + ',' + arg1 + ',' + arg2 + ')'));
        }
    }

    public static void method984(long arg0, byte arg1) {
        try {
            anInt983++;
            if ((arg0 ^ 0xffffffffffffffffL) != -1L) {
                if ((JagexString.anInt1827 ^ 0xffffffff) <= -101) {
                    Class43.method955(RSFont.aJagexString_138,
                            Class4_Sub3.aJagexString_1895, (byte) 123, 0);
                } else {
                    JagexString jagexString = Class68.method1094(-5, arg0).method839(
                            118);
                    for (int i = 0; (i ^ 0xffffffff) > (JagexString.anInt1827 ^ 0xffffffff); i++) {
                        if (Class9.aLongArray284[i] == arg0) {
                            Class43.method955(
                                    Class4_Sub24
                                            .method639(
                                                    (new JagexString[]{
                                                            jagexString,
                                                            (StringUtilities.aJagexString_3067)}),
                                                    -842),
                                    Class4_Sub3.aJagexString_1895, (byte) 113, 0);
                            return;
                        }
                    }
                    for (int i = 0; GameShell.anInt23 > i; i++) {
                        if (arg0 == Class64.aLongArray1279[i]) {
                            Class43.method955(
                                    Class4_Sub24
                                            .method639(
                                                    (new JagexString[]{
                                                            (Class53.aJagexString_1084),
                                                            jagexString,
                                                            (Class4_Sub20_Sub9.aJagexString_3049)}),
                                                    -842),
                                    Class4_Sub3.aJagexString_1895, (byte) 120, 0);
                            return;
                        }
                    }
                    if (jagexString
                            .method802(
                                    1,
                                    (Class4_Sub15.localPlayer.aJagexString_3593))) {
                        Class43.method955(StringUtilities.aJagexString_2897,
                                Class4_Sub3.aJagexString_1895, (byte) 115, 0);
                    } else {
                        Class9.aLongArray284[JagexString.anInt1827++] = arg0;
                        Class64.anInt1278++;
                        Class4_Sub20_Sub1.anInt2718 = Class4_Sub20_Sub10.anInt3053;
                        Class66.aClass4_Sub11_Sub1_1328.method264(102, -20);
                        Class66.aClass4_Sub11_Sub1_1328.method255(189354448,
                                arg0);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, ("mf.B("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    public static Class4_Sub20_Sub12_Sub1[] method985(int arg0) {
        try {
            anInt975++;
            Class4_Sub20_Sub12_Sub1[] class4_sub20_sub12_sub1s = new Class4_Sub20_Sub12_Sub1[Class49.anInt991];
            if (arg0 != -31783) {
                method984(107L, (byte) 86);
            }
            for (int i = 0; i < Class49.anInt991; i++) {
                Class4_Sub20_Sub12_Sub1 class4_sub20_sub12_sub1 = (class4_sub20_sub12_sub1s[i] = new Class4_Sub20_Sub12_Sub1());
                class4_sub20_sub12_sub1.anInt3509 = Class53.anInt1080;
                class4_sub20_sub12_sub1.anInt3507 = Class32.anInt696;
                class4_sub20_sub12_sub1.anInt3508 = Class35.anIntArray726[i];
                class4_sub20_sub12_sub1.anInt3513 = Class4_Sub20_Sub7_Sub5.anIntArray3395[i];
                class4_sub20_sub12_sub1.anInt3511 = Class30.anIntArray650[i];
                class4_sub20_sub12_sub1.anInt3514 = Class13_Sub2.anIntArray2480[i];
                class4_sub20_sub12_sub1.anIntArray3512 = Class67.anIntArray1367;
                class4_sub20_sub12_sub1.aByteArray3510 = Class4_Sub23.aByteArrayArray2426[i];
            }
            Class43.method953(true);
            return class4_sub20_sub12_sub1s;
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, "mf.E("
                    + arg0 + ')');
        }
    }

    public static void method986(byte arg0) {
        try {
            StringUtilities.aJagexString_985 = null;
            StringUtilities.aJagexString_988 = null;
            if (arg0 > -32) {
                anIntArray979 = null;
            }
            StringUtilities.aJagexString_986 = null;
            aEffectArray974 = null;
            anIntArray979 = null;
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, "mf.A("
                    + arg0 + ')');
        }
    }

    public static int getCameraPlaneCutscene() {
        int floorDrawHeight = Class67.getFloorDrawHeight(Class6.cameraX, Class33.cameraY, Class82.plane);
        if (floorDrawHeight - RSInterface.cameraZ < 800 && (Class46.currentSceneTileFlags[Class82.plane][Class6.cameraX >> 7][Class33.cameraY >> 7] & 4) != 0) {
            return Class82.plane;
        }
        return 3;
    }
}
