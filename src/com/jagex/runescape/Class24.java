package com.jagex.runescape;

public class Class24 {
    public static Class19_Sub1 aClass19_Sub1_562;
    public static Class27[] aClass27Array550 = new Class27[16];
    public static Class4_Sub20_Sub12_Sub1 aClass4_Sub20_Sub12_Sub1_549;
    public static int anInt547;
    public static int anInt548;
    public static int anInt552;
    public static int anInt554;
    public static int anInt555;
    public static int anInt556;
    public static int anInt559;
    public static int anInt561;
    public static int[] anIntArray557 = new int[1000];
    public static int[] anIntArray568 = new int[100];
    public static int currentCameraPositionV;
    public static int currentCameraPositionH;


    public static void method787(boolean arg0) {
        try {
            if (!Class4_Sub20_Sub16.aBoolean3169) {
                Class4_Sub20_Sub8.aJagexStringArray2957[0] = Class82.aJagexString_1713;
                Class82.anIntArray1712[0] = 1007;
                Class4_Sub20_Sub8.anInt2980 = 1;
                Class18.aJagexStringArray462[0] = Class4_Sub3.aJagexString_1895;
            }
            if ((Class4_Sub6.anInt1932 ^ 0xffffffff) != 0) {
                Player.method390(Class4_Sub6.anInt1932,
                        -20339);
            }
            for (int i = 0; (SceneGraph.anInt2493 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
                if (Class4_Sub20_Sub11.aBooleanArray3083[i]) {
                    Class16.aBooleanArray452[i] = true;
                }
                Class4_Sub20_Sub7_Sub3.aBooleanArray3342[i] = Class4_Sub20_Sub11.aBooleanArray3083[i];
                Class4_Sub20_Sub11.aBooleanArray3083[i] = false;
            }
            if (arg0 != false) {
                aClass4_Sub20_Sub12_Sub1_549 = null;
            }
            Class4_Sub20_Sub5.anInt2879 = Region.pulseCycle;
            Class4_Sub12.anInt2128 = -1;
            Class42.aClass4_Sub13_855 = null;
            anInt548++;
            Class40.anInt780 = -1;
            if (Class4_Sub6.anInt1932 != -1) {
                SceneGraph.anInt2493 = 0;
                Region.method53(503, 0, 765, -1, 0, 0, 0,
                        Class4_Sub6.anInt1932, (byte) 92);
            }
            Class4_Sub20_Sub12.method499();
            Class59.method1037((byte) -43);
            if (Class4_Sub20_Sub16.aBoolean3169) {
                Class14.method702(105);
            } else if ((Class4_Sub12.anInt2128 ^ 0xffffffff) != 0) {
                Class13.method688(Class40.anInt780, -14, Class4_Sub12.anInt2128);
            }
            if ((Class52.anInt1052 ^ 0xffffffff) == -4) {
                for (int i = 0; i < SceneGraph.anInt2493; i++) {
                    if (!Class4_Sub20_Sub7_Sub3.aBooleanArray3342[i]) {
                        if (Class16.aBooleanArray452[i]) {
                            Class4_Sub20_Sub12.method498(anIntArray568[i],
                                    Class42.anIntArray852[i],
                                    Class77.anIntArray1585[i],
                                    Actor.anIntArray3268[i],
                                    16711680, 128);
                        }
                    } else {
                        Class4_Sub20_Sub12.method498(anIntArray568[i],
                                Class42.anIntArray852[i],
                                Class77.anIntArray1585[i],
                                (Actor.anIntArray3268[i]),
                                16711935, 128);
                    }
                }
            }
            Class19_Sub1.method764(Class82.plane,
                    Class4_Sub20_Sub6.anInt2906,
                    Class4_Sub15.localPlayer.worldY,
                    Class4_Sub15.localPlayer.worldX,
                    (byte) -44);
            Class4_Sub20_Sub6.anInt2906 = 0;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "h.B("
                    + arg0 + ')');
        }
    }

    public static void method788(int arg0, int arg1, int arg2, int arg3,
                                 int arg4) {
        if (Class28.anInt640 == 1) {
            Class8.aImageRGBArray253[Class11.anInt331 / 100]
                    .drawImage(-8 + Class57.anInt1155, -8 + Class2.anInt96);
        }
        anInt552++;
        if ((Class28.anInt640 ^ 0xffffffff) == -3) {
            Class8.aImageRGBArray253[Class11.anInt331 / 100 + 4]
                    .drawImage(Class57.anInt1155 + -8, -8 + Class2.anInt96);
        }
        if (arg2 == 20) {
            Class13.method684((byte) -126);
            if (Class4_Sub20_Sub9.aBoolean3048) {
                int i = -5 + (arg1 - -512);
                int i_0_ = 20 + arg3;
                int i_1_ = 16776960;
                Class4_Sub15.aClass4_Sub20_Sub12_Sub4_Sub1_2289.method557(
                        (Class4_Sub24.method639(
                                new JagexString[]{
                                        Class82.aJagexString_1717,
                                        Class74.method1168(arg2 ^ ~0x3a,
                                                Class73.anInt1497)}, -842)),
                        i, i_0_, 16776960, -1);
                i_0_ += 15;
                Runtime runtime = Runtime.getRuntime();
                int i_2_ = (int) ((runtime.totalMemory() + -runtime
                        .freeMemory()) / 1024L);
                if ((i_2_ ^ 0xffffffff) < -32769 && Class59.aBoolean1189) {
                    i_1_ = 16711680;
                }
                if (i_2_ > 65536 && !Class59.aBoolean1189) {
                    i_1_ = 16711680;
                }
                Class4_Sub15.aClass4_Sub20_Sub12_Sub4_Sub1_2289.method557(
                        Class4_Sub24.method639(
                                (new JagexString[]{StringUtilities.aJagexString_918,
                                        Class74.method1168(-123, i_2_),
                                        StringUtilities.aJagexString_472}), -842), i,
                        i_0_, i_1_, -1);
                i_0_ += 15;
            }
        }
    }

    public static void method789() {
        int k = Class4_Sub15.localPlayer.worldY + Class4_Sub20_Sub7_Sub3.anInt3354;
        int j = Class4_Sub15.localPlayer.worldX + Class4_Sub23.anInt2412;
        if (currentCameraPositionH - j < -500 || currentCameraPositionH - j > 500 || currentCameraPositionV - k < -500 || currentCameraPositionV - k > 500) {
            currentCameraPositionH = j;
            currentCameraPositionV = k;
        }

        if (currentCameraPositionH != j) {
            currentCameraPositionH += (j - currentCameraPositionH) / 16;
        }
        if (currentCameraPositionV != k) {
            currentCameraPositionV += (k - currentCameraPositionV) / 16;
        }
        if (Game.keyStatus[98]) { // UpArrow
            Class4_Sub20_Sub13.cameraVelocityVertical += (12 - Class4_Sub20_Sub13.cameraVelocityVertical) / 2;
        } else if (Game.keyStatus[99]) { // Down Arrow

            Class4_Sub20_Sub13.cameraVelocityVertical += (-Class4_Sub20_Sub13.cameraVelocityVertical + -12) / 2;
        } else {
            Class4_Sub20_Sub13.cameraVelocityVertical /= 2;
        }
        if (!Game.keyStatus[96]) {
            if (!Game.keyStatus[97]) {
                Class78.cameraVelocityHorizontal /= 2;
            } else {// Right Arrow
                Class78.cameraVelocityHorizontal += (-Class78.cameraVelocityHorizontal + 24) / 2;
            }
        } else { // LeftArrow
            Class78.cameraVelocityHorizontal += (-24 + -Class78.cameraVelocityHorizontal) / 2;
        }

        Class49.cameraHorizontalPosition = Class49.cameraHorizontalPosition + Class78.cameraVelocityHorizontal / 2 & 0x7ff;
        Class1.cameraVerticalPosition += Class4_Sub20_Sub13.cameraVelocityVertical / 2;


        if (Class1.cameraVerticalPosition < 128) {
            Class1.cameraVerticalPosition = 128;
        }
        if (Class1.cameraVerticalPosition > 383) {
            Class1.cameraVerticalPosition = 383;
        }
        int i_5_ = currentCameraPositionV >> 7;
        int i_6_ = currentCameraPositionH >> 7;
        int i_7_ = Class67.getFloorDrawHeight(currentCameraPositionH, currentCameraPositionV, Class82.plane);
        int i_4_ = 0;
        if (i_6_ > 3 && i_5_ > 3 && i_6_ < 100 && i_5_ < 100) {
            for (int x = i_6_ - 4; x <= 4 + i_6_; x++) {
                for (int y = i_5_ - 4; y <= i_5_ + 4; y++) {
                    int plane = Class82.plane;
                    if (plane < 3 && ((Class46.currentSceneTileFlags[1][x][y] & 2) == 2)) {
                        plane++;
                    }
                    int i_11_ = i_7_ + -(Class4_Sub23.intGroundArray[plane][x][y]);
                    if ((~i_4_) > (~i_11_)) {
                        i_4_ = i_11_;
                    }
                }
            }
        }
        int i_12_ = i_4_ * 192;
        if (i_12_ > 98048) {
            i_12_ = 98048;
        }
        if (i_12_ < 32768) {
            i_12_ = 32768;
        }
        if (i_12_ > Class74.secondaryCameraVertical) {
            Class74.secondaryCameraVertical += (-Class74.secondaryCameraVertical + i_12_) / 24;
        } else if (i_12_ > Class74.secondaryCameraVertical) {
            Class74.secondaryCameraVertical += (i_12_ - Class74.secondaryCameraVertical) / 80;
        }
    }

    public static void method790(int arg0, int arg1, Class4_Sub20_Sub17 arg2,
                                 int arg3, int arg4) {
        try {
            anInt547++;
            if (Class5.anInt175 < 50
                    && Class71.anInt1480 != 0
                    && (arg2.anIntArray3199 != null && ((arg2.anIntArray3199.length ^ 0xffffffff) < (arg1 ^ 0xffffffff)))) {
                int i = arg2.anIntArray3199[arg1];
                if ((i ^ 0xffffffff) != -1) {
                    int i_13_ = i >> -1213642872;
                    Class4_Sub6.anIntArray1915[Class5.anInt175] = i_13_;
                    int i_14_ = 0x7 & i >> -2147268220;
                    int i_15_ = i & 0xf;
                    Class12.anIntArray342[Class5.anInt175] = i_14_;
                    Class25.anIntArray593[Class5.anInt175] = 0;
                    Class48.aEffectArray974[Class5.anInt175] = null;
                    if (arg4 != 24) {
                        method794(-54, null, 78);
                    }
                    int i_16_ = (arg0 - 64) / 128;
                    int i_17_ = (arg3 - 64) / 128;
                    Class1.anIntArray78[Class5.anInt175] = (i_16_ << -1621970960)
                            + ((i_17_ << -1058012856) + i_15_);
                    Class5.anInt175++;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("h.F("
                    + arg0 + ',' + arg1 + ','
                    + (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
                    + arg4 + ')'));
        }
    }

    public static void method791(int arg0, int arg1, int arg2, boolean arg3) {
        try {
            if (arg1 == 18834) {
                anInt555++;
                if ((arg0 ^ 0xffffffff) > -8001 || (arg0 ^ 0xffffffff) < -48001) {
                    throw new IllegalArgumentException();
                }
                Actor.aBoolean3218 = arg3;
                Class4_Sub12.anInt2125 = arg2;
                Class67.anInt1354 = arg0;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("h.D("
                    + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
        }
    }

    public static void method792(byte arg0) {
        try {
            Class7.aFontMetrics230 = null;
            Class66.anImage1326 = null;
            anInt556++;
            if (arg0 == -6) {
                Class4_Sub20_Sub11.aFont3087 = null;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "h.G("
                    + arg0 + ')');
        }
    }

    public static void method793(int arg0) {
        try {
            StringUtilities.aJagexString_551 = null;
            StringUtilities.aJagexString_565 = null;
            StringUtilities.aJagexString_558 = null;
            aClass19_Sub1_562 = null;
            aClass27Array550 = null;
            StringUtilities.aJagexString_563 = null;
            anIntArray568 = null;
            StringUtilities.aJagexString_564 = null;
            aClass4_Sub20_Sub12_Sub1_549 = null;
            anIntArray557 = null;
            StringUtilities.aJagexString_560 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "h.I("
                    + arg0 + ')');
        }
    }

    public static void method794(int arg0, Actor arg1, int arg2) {
        Class63.method1053(arg1.worldX, false, arg0, arg1.worldY);
        anInt561++;
        if (arg2 >= -125) {
            method790(89, -73, null, -120, -58);
        }
    }

    public static Class4_Sub16 method795(byte arg0, int arg1, int arg2, int arg3) {
        try {
            anInt559++;
            Class4_Sub16 class4_sub16 = new Class4_Sub16();
            class4_sub16.anInt2311 = arg1;
            class4_sub16.anInt2306 = arg2;
            Class31.aClass16_677.method720(class4_sub16, arg3, false);
            Class66.method1080(arg1, 0);
            Class62.method1048(false, arg1);
            RSInterface class4_sub13 = RSInterface.forId(arg3);
            if (class4_sub13 != null) {
                Class67.method1088(class4_sub13);
            }
            if (RSInterface.aClass4_Sub13_2141 != null) {
                Class67.method1088(RSInterface.aClass4_Sub13_2141);
                RSInterface.aClass4_Sub13_2141 = null;
            }
            Class4_Sub20_Sub8.anInt2980 = 0;
            Class4_Sub20_Sub16.aBoolean3169 = false;
            Class4_Sub20_Sub17.method621(Class4_Sub1.anInt1860, 16052,
                    Class63.anInt1243, Class4_Sub20_Sub17.anInt3195,
                    Class45.anInt926);
            if ((Class4_Sub6.anInt1932 ^ 0xffffffff) != 0) {
                Class58.method1032(0, 1, Class4_Sub6.anInt1932);
            }
            return class4_sub16;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("h.E("
                    + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
        }
    }
}
