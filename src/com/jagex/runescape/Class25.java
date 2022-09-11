package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class25 {
    public static boolean cutsceneActive = false;
    public static Buffer[] aClass4_Sub11Array575 = new Buffer[2048];
    public static Class66 aClass66_592 = new Class66(50);
    public static long aLong584;
    public static int anInt574;
    public static int anInt577;
    public static int anInt579;
    public static int anInt580;
    public static int anInt583 = 0;
    public static int anInt585;
    public static int anInt589;
    public static int[] anIntArray587 = {1, 0, -1, 0};
    public static int[] anIntArray593 = new int[50];


    public static void method796(byte arg0) {
        try {
            if (arg0 != 103) {
                method797(-35);
            }
            anInt579++;
            for (Class4_Sub20_Sub7_Sub3 class4_sub20_sub7_sub3 = ((Class4_Sub20_Sub7_Sub3) Class4_Sub20_Sub13.aClass65_3106
                    .method1071(-126)); class4_sub20_sub7_sub3 != null; class4_sub20_sub7_sub3 = ((Class4_Sub20_Sub7_Sub3) Class4_Sub20_Sub13.aClass65_3106
                    .method1075(arg0 ^ 0x4852))) {
                if (((Class82.plane ^ 0xffffffff) != (class4_sub20_sub7_sub3.anInt3345 ^ 0xffffffff))
                        || class4_sub20_sub7_sub3.aBoolean3338) {
                    class4_sub20_sub7_sub3.clear();
                } else if (class4_sub20_sub7_sub3.anInt3341 <= Region.pulseCycle) {
                    class4_sub20_sub7_sub3.method419((byte) 125,
                            Class4_Sub20_Sub6.anInt2906);
                    if (class4_sub20_sub7_sub3.aBoolean3338) {
                        class4_sub20_sub7_sub3.clear();
                    } else {
                        Class4_Sub20_Sub7_Sub6.aClass69_3439.method1132(
                                class4_sub20_sub7_sub3.anInt3345,
                                class4_sub20_sub7_sub3.anInt3344,
                                class4_sub20_sub7_sub3.anInt3348,
                                class4_sub20_sub7_sub3.anInt3349, 60,
                                class4_sub20_sub7_sub3, 0, -1, false);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, "ha.D("
                    + arg0 + ')');
        }
    }

    public static void method797(int arg0) {
        try {
            aClass66_592 = null;
            if (arg0 == -30004) {
                anIntArray593 = null;
                StringUtilities.aJagexString_581 = null;
                StringUtilities.aJagexString_586 = null;
                StringUtilities.aJagexString_595 = null;
                StringUtilities.aJagexString_594 = null;
                StringUtilities.aJagexString_596 = null;
                aClass4_Sub11Array575 = null;
                anIntArray587 = null;
            }
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, "ha.E("
                    + arg0 + ')');
        }
    }

    public static boolean method798(int arg0, int arg1, int arg2, int arg3) {
        try {
            anInt589++;
            int i = Class4_Sub20_Sub7_Sub6.aClass69_3439.method1146(
                    Class82.plane, arg2, arg1, arg0);
            int i_0_ = 0x7fff & arg0 >> -11557778;
            if ((i ^ 0xffffffff) == 0) {
                return false;
            }
            int i_1_ = i & 0x1f;
            int i_2_ = (0xd6 & i) >> -1761014874;
            if (i_1_ == 10 || (i_1_ ^ 0xffffffff) == -12
                    || (i_1_ ^ 0xffffffff) == -23) {
                Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(true,
                        i_0_);
                int i_3_ = class4_sub20_sub1.anInt2758;
                int i_4_;
                int i_5_;
                if ((i_2_ ^ 0xffffffff) != -1 && i_2_ != 2) {
                    i_5_ = class4_sub20_sub1.anInt2725;
                    i_4_ = class4_sub20_sub1.anInt2744;
                } else {
                    i_4_ = class4_sub20_sub1.anInt2725;
                    i_5_ = class4_sub20_sub1.anInt2744;
                }
                if (i_2_ != 0) {
                    i_3_ = (0xf & i_3_ << i_2_) - -(i_3_ >> 4 - i_2_);
                }
                Class4_Sub20
                        .method319(
                                i_5_,
                                (Class4_Sub15.localPlayer.anIntArray3247[0]),
                                arg1,
                                arg2,
                                i_4_,
                                0,
                                true,
                                2,
                                0,
                                arg3,
                                i_3_,
                                (Class4_Sub15.localPlayer.anIntArray3248[0]));
            } else {
                Class4_Sub20
                        .method319(
                                0,
                                (Class4_Sub15.localPlayer.anIntArray3247[0]),
                                arg1,
                                arg2,
                                0,
                                i_1_ - -1,
                                true,
                                2,
                                i_2_,
                                0,
                                0,
                                (Class4_Sub15.localPlayer.anIntArray3248[0]));
            }
            Class28.anInt640 = 2;
            Class11.anInt331 = arg3;
            Class2.anInt96 = JagexException.anInt1729;
            Class57.anInt1155 = Class37.anInt758;
            return true;
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, ("ha.C("
                    + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
        }
    }

    public static void method799(long arg0, int arg1) {
        try {
            anInt574++;
            if (arg0 > 0L) {
                if ((arg0 % arg1 ^ 0xffffffffffffffffL) == -1L) {
                    Class4_Sub6.method186(arg0 - 1L, arg1 + 125);
                    Class4_Sub6.method186(1L, arg1 ^ 0x8d);
                } else {
                    Class4_Sub6.method186(arg0, arg1 ^ 0x8d);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, ("ha.B("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    public static void method800(int arg0) {
        try {
            Class31.aClass53_690.anInt1089 = 0;
            Region.aBoolean126 = true;
            Class4_Sub20_Sub10.aLong3063 = 0L;
            anInt585++;
            Buffer.anInt2058 = 0;
            Class4_Sub2_Sub1.anInt2587 = 0;
            Class53.anInt1072 = 0;
            Class13_Sub2.anInt2463 = 0;
            Class62.anInt1228 = 0;
            Class4_Sub2_Sub1.anInt2601 = 0;
            Class16.anInt454 = 0;
            Buffer.anInt2088 = 0;
            Class4_Sub20_Sub15.anInt3154 = 0;
            Class4_Sub20_Sub13.anInt3123 = 0;
            Class4_Sub20_Sub15.anInt3159 = 0;
            Class47.anInt964 = 0;
            Class10.anInt286 = 0;
            Class61.anInt1199 = 0;
            Region.anInt118 = 0;
            Class19.anInt520 = 0;
            Class66.anInt1327 = 0;
            Class59.anInt1190 = 0;
            Class47.anInt971 = 0;
            Class4_Sub24.anInt2441 = 0;
            Class4_Sub21.anInt2365 = 0;
            Class4_Sub20_Sub1.anInt2748 = 0;
            Class48.anInt978 = 0;
            Class46.anInt935 = 0;
            Class80.anInt1649 = 0;
            RSCanvas.anInt48 = 0;
            Class13.anInt382 = 0;
            Class43.anInt870 = 0;
            Class10.anInt296 = 0;
            Class1.anInt77 = 0;
            Class34.anInt1737 = 0;
            Class27.anInt605 = 0;
            RS2Font.anInt2772 = 0;
            Class4_Sub20_Sub17.anInt3204 = 0;
            Buffer.anInt2063 = 0;
            Class64.anInt1278 = 0;
            Class6.anInt204 = 0;
            Class19_Sub1.anInt2532 = 0;
            Class65.anInt1298 = 0;
            Class4_Sub20_Sub7_Sub3.anInt3346 = 0;
            Class76.anInt1570 = 0;
            Class2.anInt91 = 0;
            Class4_Sub20_Sub13.anInt3113 = 0;
            Class4_Sub2_Sub4.anInt2656 = 0;
            Class4_Sub20_Sub6.anInt2924 = 0;
            Class4_Sub20_Sub1.anInt2751 = 0;
            Class82.anInt1716 = 0;
            RSInterface.anInt2157 = 0;
            RSFont.anInt141 = 0;
            Class4_Sub20_Sub7.anInt2949 = 0;
            ItemDefinition.anInt3016 = 0;
            Class10.anInt292 = 0;
            Class35.anInt745 = 0;
            Class4_Sub2_Sub1.anInt2582 = 0;
            Class4_Sub2_Sub4.anInt2642 = 0;
            Player.anInt3613 = 0;
            Class34.anInt1736 = 0;
            Class33.anInt720 = 0;
            Game.anInt1835 = 0;
            Class16.anInt438 = 0;
            ItemDefinition.anInt2956 = 0;
            Class14.anInt404 = 0;
            Class4_Sub11_Sub1.anInt2681 = 0;
            Player.anInt3599 = 0;
            Class13_Sub2.anInt2454 = 0;
            Buffer.anInt2091 = 0;
            SceneGraph.anInt2498 = 0;
            Class67.anInt1348 = 0;
            Class4_Sub20_Sub17.anInt3209 = 0;
            Class14.anInt394 = 0;
            Buffer.anInt2060 = 0;
            Class4_Sub20_Sub7_Sub4.anInt3363 = 0;
            Class4_Sub10.anInt2038 = 0;
            Class19.anInt485 = 0;
            Class66.anInt1317 = 0;
            Buffer.anInt2084 = 0;
            Class49.anInt992 = 0;
            Class4_Sub2_Sub1.anInt2570 = 0;
            Class4_Sub20_Sub9.anInt3035 = 0;
            Class19.anInt499 = 0;
            Class4_Sub23.anInt2413 = 0;
            Class13_Sub2.anInt2465 = 0;
            RSCanvas.anInt50 = 0;
            Game.anInt1843 = 0;
            Class19_Sub1.anInt2531 = 0;
            Class42.anInt847 = 0;
            Class49.anInt997 = 0;
            Class38.anInt771 = 0;
            anInt574 = 0;
            Class13_Sub2.anInt2456 = 0;
            RSCanvas.anInt46 = 0;
            Class19.anInt505 = 0;
            Class4_Sub14.anInt2283 = 0;
            Class4_Sub20_Sub15.anInt3158 = 0;
            ItemDefinition.anInt2992 = 0;
            Class35.anInt752 = 0;
            Class4_Sub20_Sub7_Sub4.anInt3360 = 0;
            Class4_Sub2_Sub4.anInt2647 = 0;
            Class28.anInt636 = 0;
            JagexException.anInt1735 = 0;
            Class18.anInt467 = 0;
            Buffer.anInt2064 = 0;
            RSFont.anInt143 = 0;
            Class4_Sub20_Sub9.anInt3033 = 0;
            Region.anInt107 = 0;
            RSInterface.anInt2131 = 0;
            Buffer.anInt2087 = 0;
            ItemDefinition.anInt2978 = 0;
            Class57.anInt1146 = 0;
            Class4_Sub20_Sub7.anInt2945 = 0;
            Class4_Sub17.anInt2331 = 0;
            Class5.anInt182 = 0;
            Class4_Sub20_Sub14.anInt3134 = 0;
            Region.anInt97 = 0;
            RSInterface.anInt2211 = 0;
            RSCanvas.anInt49 = 0;
            Class4_Sub20_Sub1.anInt2715 = 0;
            Game.anInt1831 = 0;
            Class4_Sub2_Sub1.anInt2615 = 0;
            Buffer.anInt2111 = 0;
            Class27.anInt628 = 0;
            Class7.anInt220 = 0;
            Class4_Sub11_Sub1.anInt2668 = 0;
            Class4_Sub16.anInt2304 = 0;
            Class4_Sub20_Sub6.anInt2927 = 0;
            Class4_Sub15.anInt2303 = 0;
            Class2.anInt89 = 0;
            ItemDefinition.anInt3004 = 0;
            Class4_Sub20_Sub7_Sub5.anInt3399 = 0;
            Buffer.anInt2080 = 0;
            Class73.anInt1508 = 0;
            Class34.anInt1756 = 0;
            Class49.anInt998 = 0;
            Class52.anInt1064 = 0;
            Class62.anInt1224 = 0;
            Class4_Sub2_Sub4.anInt2657 = 0;
            RS2Font.anInt2781 = 0;
            Class27.anInt626 = 0;
            Class30.anInt655 = 0;
            Class64.anInt1267 = 0;
            Class4_Sub22.anInt2391 = 0;
            Class4_Sub20_Sub7.anInt2944 = 0;
            Class4_Sub20_Sub3.anInt2818 = 0;
            Class38.anInt768 = 0;
            Class43.anInt903 = 0;
            Class40.anInt785 = 0;
            Class4_Sub2_Sub1.anInt2557 = 0;
            Class4_Sub11_Sub1.anInt2674 = 0;
            Class4_Sub2_Sub1.anInt2551 = 0;
            Class11.anInt325 = 0;
            Region.anInt133 = 0;
            Class18.anInt479 = 0;
            Class6.anInt216 = 0;
            Class4_Sub20_Sub4.anInt2850 = 0;
            Class42.anInt851 = 0;
            Class81.anInt1673 = 0;
            Region.anInt98 = 0;
            ItemDefinition.anInt3018 = 0;
            Class52.anInt1056 = 0;
            Class4_Sub2_Sub1.anInt2614 = 0;
            Class27.anInt600 = 0;
            Buffer.anInt2076 = 0;
            Buffer.anInt2053 = 0;
            Class19.anInt519 = 0;
            Region.anInt108 = 0;
            Class7.anInt233 = 0;
            Class64.anInt1271 = 0;
            SceneGraph.anInt2487 = 0;
            Class65.anInt1303 = 0;
            Buffer.anInt2083 = 0;
            Class82.anInt1720 = 0;
            Buffer.anInt2104 = 0;
            Class30.anInt657 = 0;
            Class4_Sub2_Sub4.anInt2651 = 0;
            Class64.anInt1254 = 0;
            Class8.anInt248 = 0;
            Class38.anInt774 = 0;
            Class31.anInt666 = 0;
            Class33.anInt704 = 0;
            Class13.anInt388 = 0;
            RS2Font.anInt2760 = 0;
            Class67.anInt1364 = 0;
            Class34.anInt1742 = 0;
            Class19_Sub1.anInt2522 = 0;
            Class41.anInt803 = 0;
            Class64.anInt1263 = 0;
            Class74.anInt1522 = 0;
            Class47.anInt969 = 0;
            Region.anInt116 = 0;
            Class65.anInt1299 = 0;
            Class13_Sub2.anInt2461 = 0;
            Class72.anInt1484 = 0;
            Region.anInt106 = 0;
            Class4_Sub2_Sub1.anInt2560 = 0;
            Buffer.anInt2068 = 0;
            Class64.anInt1255 = 0;
            Class43.anInt863 = 0;
            Region.anInt100 = 0;
            Class78.anInt1601 = 0;
            Class35.anInt738 = 0;
            Region.anInt99 = 0;
            Buffer.anInt2106 = 0;
            RSInterface.anInt2209 = 0;
            Class19.anInt509 = 0;
            Class4_Sub20_Sub7_Sub6.anInt3444 = 0;
            RSCanvas.anInt52 = 0;
            Class4_Sub20_Sub14.anInt3144 = 0;
            Class4_Sub2_Sub4.anInt2645 = 0;
            Class65.anInt1310 = 0;
            Class9.anInt268 = 0;
            Class33.anInt712 = 0;
            Class4_Sub20_Sub6.anInt2928 = 0;
            Class8.anInt239 = 0;
            Class27.anInt614 = 0;
            Class43.anInt858 = 0;
            Class19.anInt522 = 0;
            Class35.anInt746 = 0;
            Buffer.anInt2099 = 0;
            Class24.anInt552 = 0;
            Class4_Sub20_Sub17.anInt3212 = 0;
            Class4_Sub2_Sub4.anInt2649 = 0;

            Class43.anInt883 = 0;
            Class54.anInt1108 = 0;
            Class4_Sub20.anInt2354 = 0;
            Class76.anInt1545 = 0;
            Class77.anInt1594 = 0;
            Class4_Sub1.anInt1864 = 0;
            Class61.anInt1215 = 0;
            ItemDefinition.anInt2952 = 0;
            Class4_Sub2_Sub1.anInt2562 = 0;
            RSInterface.anInt2219 = 0;
            Class78.anInt1602 = 0;
            Class4_Sub20_Sub15.anInt3155 = 0;
            Class4_Sub20_Sub7.anInt2933 = 0;
            Class19.anInt513 = 0;
            Class71.anInt1467 = 0;
            anInt585 = 0;
            Class40.anInt786 = 0;
            Class13_Sub2.anInt2459 = 0;
            Class65.anInt1295 = 0;
            Class4_Sub16.anInt2313 = 0;
            Class8.anInt246 = 0;
            Class4_Sub2_Sub1.anInt2554 = 0;
            Class13_Sub2.anInt2472 = 0;
            Class76.anInt1574 = 0;
            Class4_Sub20_Sub7_Sub4.anInt3364 = 0;
            Class19_Sub1.anInt2524 = 0;
            Class18.anInt466 = 0;
            Class30.anInt663 = 0;
            Class4_Sub20_Sub9.anInt3034 = 0;

            Class4_Sub20_Sub16.anInt3160 = 0;
            Class4_Sub20_Sub14.anInt3143 = 0;
            Class34.anInt1749 = 0;
            RS2Font.anInt2780 = 0;
            Class16.anInt430 = 0;
            Class4_Sub20_Sub14.anInt3141 = 0;
            Npc.anInt3616 = 0;
            Class57.anInt1153 = 0;
            Class4_Sub11_Sub1.anInt2690 = 0;
            Class4_Sub7.anInt1945 = 0;
            Class65.anInt1302 = 0;

            Class76.anInt1559 = 0;
            anInt579 = 0;
            Class4_Sub20_Sub17.anInt3203 = 0;
            Class4_Sub20_Sub5.anInt2867 = 0;
            Game.anInt1832 = 0;

            Class4_Sub12.anInt2121 = 0;
            Region.anInt105 = 0;
            Class4_Sub17.anInt2326 = 0;
            Game.anInt1839 = 0;
            Class68.anInt1376 = 0;
            Class4_Sub20_Sub13.anInt3119 = 0;
            Class46.anInt929 = 0;
            Class4_Sub20_Sub6.anInt2907 = 0;
            ItemDefinition.anInt2959 = 0;
            Class13_Sub2.anInt2466 = 0;
            Game.anInt1842 = 0;
            Class4_Sub20_Sub7_Sub3.anInt3339 = 0;
            Class16.anInt441 = 0;
            Class73.anInt1496 = 0;
            JagexException.anInt1727 = 0;
            Class74.anInt1515 = 0;
            Class16.anInt431 = 0;
            Buffer.anInt2054 = 0;
            Class4_Sub2_Sub1.anInt2550 = 0;
            Class4_Sub20_Sub4.anInt2847 = 0;
            Class34.anInt1741 = 0;

            Class19.anInt515 = 0;
            Class4_Sub20_Sub13.anInt3110 = 0;
            Class4_Sub20_Sub11.anInt3077 = 0;
            Class64.anInt1272 = 0;
            Class67.anInt1344 = 0;
            Class7.anInt224 = 0;
            Class4_Sub20_Sub7.anInt2943 = 0;
            Buffer.anInt2077 = 0;
            Region.anInt124 = 0;
            Class1.anInt76 = 0;
            Class18.anInt481 = 0;
            Class4_Sub6.anInt1923 = 0;
            Class13.anInt387 = 0;
            Class4_Sub20_Sub10.anInt3068 = 0;
            Class50.anInt1020 = 0;
            Class18.anInt465 = 0;
            Class31.anInt668 = 0;
            Class24.anInt555 = 0;
            Class54.anInt1091 = 0;
            Class38.anInt773 = 0;
            Class4_Sub20_Sub16.anInt3161 = 0;
            Class10.anInt293 = 0;
            Class35.anInt723 = 0;
            Buffer.anInt2075 = 0;
            Class4_Sub20_Sub15.anInt3153 = 0;
            Class18.anInt480 = 0;
            Class19.anInt511 = 0;
            Class65.anInt1311 = 0;
            Buffer.anInt2097 = 0;
            Buffer.anInt2069 = 0;
            Player.anInt3580 = 0;
            Class4_Sub20_Sub13.anInt3129 = 0;
            Class71.anInt1481 = 0;
            Class73.anInt1505 = 0;
            Class48.anInt983 = 0;
            Class4_Sub10.anInt2025 = 0;
            Class48.anInt987 = 0;
            Class46.anInt927 = 0;
            Game.anInt1837 = 0;
            Region.anInt119 = 0;
            Class16.anInt447 = 0;
            Class13.anInt369 = 0;
            Class24.anInt548 = 0;
            Class10.anInt291 = 0;
            Buffer.anInt2113 = 0;
            RS2Font.anInt2774 = 0;
            Class4_Sub2_Sub1.anInt2549 = 0;
            Class19.anInt498 = 0;
            Class4_Sub20_Sub17.anInt3215 = 0;
            Game.anInt1840 = 0;
            Class19.anInt486 = 0;
            RSInterface.anInt2217 = 0;
            Class1.anInt68 = 0;
            Class76.anInt1555 = 0;
            Class76.anInt1556 = 0;
            Class4_Sub17.anInt2330 = 0;
            Class53.anInt1082 = 0;
            Class4_Sub2_Sub1.anInt2580 = 0;
            Class4_Sub11_Sub1.anInt2670 = 0;
            Class68.anInt1382 = 0;
            Class4_Sub11_Sub1.anInt2684 = 0;
            Class76.anInt1569 = 0;
            Class31.anInt664 = 0;
            Class4_Sub7.anInt1963 = 0;
            Class4_Sub20_Sub9.anInt3037 = 0;
            Class4_Sub2_Sub1.anInt2564 = 0;

            Class4_Sub20_Sub6.anInt2917 = 0;
            Class12.anInt338 = 0;
            ItemDefinition.anInt2962 = 0;
            Class63.anInt1248 = 0;
            Class46.anInt931 = 0;
            Class66.anInt1323 = 0;

            Class77.anInt1584 = 0;
            Class4_Sub2_Sub1.anInt2605 = 0;
            Class4_Sub8.anInt1978 = 0;
            JagexException.anInt1731 = 0;
            Class4_Sub2_Sub1.anInt2558 = 0;
            Buffer.anInt2109 = 0;
            Class4_Sub1.anInt1855 = 0;
            Region.anInt104 = 0;
            Class50.anInt1008 = 0;
            Class19.anInt494 = 0;
            Class4_Sub21.anInt2382 = 0;
            Buffer.anInt2067 = 0;
            ItemDefinition.anInt3001 = 0;
            Class4_Sub2_Sub1.anInt2559 = 0;
            Class4_Sub24.anInt2439 = 0;
            Class4_Sub20_Sub1.anInt2742 = 0;
            Class72.anInt1492 = 0;
            Class4_Sub14.anInt2277 = 0;
            Class4_Sub20_Sub11.anInt3079 = 0;
            Class18.anInt468 = 0;
            Class82.anInt1723 = 0;
            Class4_Sub20.anInt2350 = 0;
            Buffer.anInt2082 = 0;
            Class4_Sub20_Sub7_Sub3.anInt3340 = 0;
            Buffer.anInt2090 = 0;
            Region.anInt117 = 0;
            Class4_Sub11_Sub1.anInt2680 = 0;
            Class64.anInt1256 = 0;
            Class4_Sub2_Sub1.anInt2569 = 0;
            Class71.anInt1473 = 0;
            Class34.anInt1746 = 0;
            Class4_Sub20_Sub16.anInt3175 = 0;
            Class4_Sub20_Sub7_Sub5.anInt3392 = 0;
            Class35.anInt734 = 0;
            Class43.anInt891 = 0;
            RSInterface.anInt2260 = 0;
            Class81.anInt1693 = 0;
            Class47.anInt959 = 0;
            Class34.anInt1755 = 0;
            Class4_Sub3.anInt1876 = 0;
            AppletListener.anInt1452 = 0;
            Class63.anInt1244 = 0;
            Class57.anInt1133 = 0;
            Class72.anInt1486 = 0;
            Class65.anInt1287 = 0;
            Class37.anInt763 = 0;
            ItemDefinition.anInt2955 = 0;

            Class4_Sub23.anInt2425 = 0;
            Class4_Sub15.anInt2296 = 0;
            Class4_Sub20_Sub4.anInt2844 = 0;
            Class4_Sub2_Sub1.anInt2596 = 0;
            Class4_Sub12.anInt2118 = 0;
            Buffer.anInt2108 = 0;
            Class81.anInt1678 = 0;
            Class4_Sub20_Sub7_Sub4.anInt3380 = 0;
            Class71.anInt1468 = 0;
            Buffer.anInt2071 = 0;
            RSFont.anInt157 = 0;
            Class35.anInt754 = 0;
            Class65.anInt1300 = 0;
            ItemDefinition.anInt2960 = 0;
            Class4_Sub10.anInt2023 = 0;
            Game.anInt1841 = 0;
            Player.anInt3582 = 0;
            Class4_Sub2_Sub1.anInt2575 = 0;
            Class11.anInt314 = 0;
            Class4_Sub20_Sub16.anInt3167 = 0;
            Class24.anInt559 = 0;
            Class4_Sub22.anInt2405 = 0;
            Class27.anInt631 = 0;
            Buffer.anInt2095 = 0;
            Class47.anInt958 = 0;

            Class28.anInt637 = 0;
            Class61.anInt1207 = 0;
            Class19_Sub1.anInt2512 = 0;
            Class4_Sub20_Sub7_Sub5.anInt3393 = 0;
            Class14.anInt395 = 0;
            Class4_Sub10.anInt2020 = 0;
            Class4_Sub20_Sub13.anInt3107 = 0;
            Class81.anInt1665 = 0;
            Class43.anInt862 = 0;
            Class4_Sub2_Sub1.anInt2565 = 0;
            Class43.anInt890 = 0;
            Class82.anInt1718 = 0;
            Class4_Sub20_Sub17.anInt3213 = 0;
            Class11.anInt327 = 0;
            Class19_Sub1.anInt2521 = 0;
            Class66.anInt1329 = 0;
            Class4_Sub20_Sub3.anInt2810 = 0;
            Class31.anInt673 = 0;

            Class19.anInt501 = 0;
            Class4_Sub2_Sub1.anInt2577 = 0;
            Class19_Sub1.anInt2526 = 0;
            Class27.anInt606 = 0;
            Class13_Sub2.anInt2464 = 0;
            Class4_Sub20_Sub7_Sub3.anInt3356 = 0;
            Class53.anInt1067 = 0;
            Class34.anInt1745 = 0;
            Npc.anInt3619 = 0;
            Class9.anInt273 = 0;
            Class4_Sub20_Sub9.anInt3032 = 0;
            Class73.anInt1500 = 0;
            Class4_Sub20_Sub1.anInt2753 = 0;

            Class19.anInt516 = 0;
            Class19.anInt490 = 0;
            Class4_Sub11_Sub1.anInt2666 = 0;
            Class4_Sub20_Sub7_Sub5.anInt3401 = 0;
            Class33.anInt707 = 0;
            Class13.anInt374 = 0;
            Class73.anInt1506 = 0;
            Class4_Sub2_Sub4.anInt2652 = 0;
            Class43.anInt886 = 0;
            Class19.anInt500 = 0;
            Class76.anInt1549 = 0;
            Class71.anInt1469 = 0;
            Npc.anInt3614 = 0;
            Player.anInt3607 = 0;
            Class76.anInt1551 = 0;
            Class4_Sub20_Sub15.anInt3152 = 0;
            Class4_Sub20_Sub7_Sub5.anInt3407 = 0;
            Buffer.anInt2114 = 0;
            Class4_Sub15.anInt2297 = 0;
            Region.anInt111 = 0;
            Class4_Sub20_Sub16.anInt3176 = 0;
            Class67.anInt1339 = 0;
            Class4_Sub20_Sub9.anInt3030 = 0;
            Class38.anInt775 = 0;
            Class2.anInt94 = 0;
            Class81.anInt1661 = 0;
            Class4_Sub20_Sub7_Sub6.anInt3442 = 0;
            Class4_Sub20_Sub9.anInt3022 = 0;
            Class19_Sub1.anInt2530 = 0;
            Class68.anInt1378 = 0;
            Class4_Sub20_Sub9.anInt3026 = 0;
            Class47.anInt953 = 0;
            Class43.anInt876 = 0;
            Class80.anInt1643 = 0;
            RSInterface.anInt2243 = 0;
            Class4_Sub20_Sub3.anInt2815 = 0;
            Class19.anInt489 = 0;
            Class31.anInt670 = 0;
            RSCanvas.anInt51 = 0;
            Class4_Sub2_Sub1.anInt2556 = 0;
            RSFont.anInt156 = 0;
            Class49.anInt993 = 0;
            Class4_Sub6.anInt1924 = 0;
            Class4_Sub20_Sub13.anInt3121 = 0;
            Class43.anInt875 = 0;
            Class43.anInt865 = 0;
            Region.anInt102 = 0;
            Class7.anInt236 = 0;
            Class24.anInt556 = 0;
            Class61.anInt1209 = 0;
            Class66.anInt1315 = 0;
            RSInterface.anInt2239 = 0;
            Class4_Sub20_Sub11.anInt3084 = 0;
            AppletListener.anInt1453 = 0;
            Class12.anInt358 = 0;
            Class4_Sub11_Sub1.anInt2687 = 0;
            Class4_Sub20_Sub3.anInt2842 = 0;
            Class4_Sub20_Sub17.anInt3193 = 0;
            Class43.anInt892 = 0;
            RSInterface.anInt2207 = 0;
            Class4_Sub20_Sub1.anInt2735 = 0;

            Class77.anInt1596 = 0;
            Class4_Sub1.anInt1867 = 0;
            Class27.anInt620 = 0;
            Class4_Sub20_Sub13.anInt3115 = 0;
            Class4_Sub2_Sub1.anInt2609 = 0;
            Class57.anInt1134 = 0;
            Class6.anInt208 = 0;

            Class19_Sub1.anInt2507 = 0;
            Class33.anInt705 = 0;
            Class13_Sub2.anInt2471 = 0;

            Class77.anInt1593 = 0;
            RSInterface.anInt2184 = 0;


            Class4_Sub2_Sub1.anInt2563 = 0;
            Class4_Sub20_Sub7_Sub5.anInt3398 = 0;
            if (arg0 <= -45) {
                Class4_Sub20_Sub14.anInt3149 = 0;
                Class4_Sub20_Sub6.anInt2918 = 0;
                Class4_Sub2_Sub1.anInt2578 = 0;
                ItemDefinition.anInt2968 = 0;
                Game.anInt1845 = 0;
                Class12.anInt344 = 0;

                AppletListener.anInt1455 = 0;
                Class4_Sub6.anInt1936 = 0;
                Buffer.anInt2092 = 0;
                Class4_Sub2_Sub1.anInt2602 = 0;
                Class24.anInt547 = 0;
                Class4_Sub10.anInt2032 = 0;
                Buffer.anInt2086 = 0;
                Class58.anInt1158 = 0;
                Class57.anInt1145 = 0;
                Class71.anInt1478 = 0;
                Buffer.anInt2112 = 0;
                Class62.anInt1237 = 0;
                Buffer.anInt2070 = 0;
                Class13_Sub2.anInt2462 = 0;
                Class66.anInt1314 = 0;
                Class4_Sub20_Sub14.anInt3150 = 0;
                Class4_Sub2_Sub1.anInt2592 = 0;
                Class54.anInt1099 = 0;
                Class4_Sub8.anInt1967 = 0;
                Class19.anInt507 = 0;
                Class4_Sub2_Sub1.anInt2591 = 0;
                Buffer.anInt2078 = 0;
                Class13.anInt379 = 0;
                Class4_Sub2_Sub4.anInt2646 = 0;
                Class27.anInt598 = 0;
                Class4_Sub20_Sub11.anInt3073 = 0;
                Class53.anInt1070 = 0;
                Class40.anInt782 = 0;
                AppletListener.anInt1466 = 0;
                Class54.anInt1098 = 0;
                Class4_Sub20_Sub7_Sub5.anInt3394 = 0;
                Class65.anInt1296 = 0;
                Class9.anInt276 = 0;
                Class35.anInt737 = 0;
                Class16.anInt440 = 0;

                Class58.anInt1156 = 0;

                Class19.anInt503 = 0;
                Class19.anInt491 = 0;
                Class48.anInt982 = 0;
                Buffer.anInt2057 = 0;
                Class4_Sub20.anInt2360 = 0;
                Class4_Sub20.anInt2351 = 0;

                Class82.anInt1722 = 0;
                Class63.anInt1247 = 0;
                Class72.anInt1488 = 0;
                Class4_Sub24.anInt2440 = 0;
                Buffer.anInt2100 = 0;
                Class27.anInt621 = 0;
                Class43.anInt878 = 0;
                Class63.anInt1249 = 0;
                Class59.anInt1178 = 0;
                Class4_Sub20.anInt2361 = 0;
                RSInterface.anInt2254 = 0;
                Class9.anInt270 = 0;
                Class33.anInt706 = 0;
                Class4_Sub20_Sub17.anInt3187 = 0;

                RS2Font.anInt2788 = 0;
                Class4_Sub20_Sub7_Sub4.anInt3365 = 0;
                Class4_Sub11_Sub1.anInt2686 = 0;
                Class12.anInt356 = 0;
                Class5.anInt191 = 0;
                Buffer.anInt2107 = 0;
                Class41.anInt817 = 0;
                Buffer.anInt2061 = 0;
                Class67.anInt1346 = 0;
                Class27.anInt617 = 0;
                Class4_Sub20_Sub7_Sub4.anInt3372 = 0;
                Class4_Sub20_Sub17.anInt3192 = 0;
                Class16.anInt442 = 0;
                Class43.anInt873 = 0;
                Class19_Sub1.anInt2523 = 0;
                Class4_Sub2_Sub1.anInt2597 = 0;
                Class4_Sub20_Sub13.anInt3128 = 0;
                Class53.anInt1085 = 0;
                Class4_Sub2_Sub4.anInt2655 = 0;
                Buffer.anInt2093 = 0;
                Class4_Sub15.anInt2293 = 0;
                Class1.anInt75 = 0;
                Class52.anInt1050 = 0;
                Class4_Sub3.anInt1880 = 0;
                Class4_Sub11_Sub1.anInt2667 = 0;
                Class8.anInt241 = 0;
                Class40.anInt784 = 0;
                Class4_Sub20_Sub7_Sub6.anInt3435 = 0;
                Game.anInt1834 = 0;
                Class46.anInt933 = 0;

                Class12.anInt345 = 0;
                Class19_Sub1.anInt2537 = 0;
                Class34.anInt1739 = 0;
                Class52.anInt1062 = 0;
                Class14.anInt391 = 0;
                Class4_Sub6.anInt1919 = 0;
                Class35.anInt729 = 0;
                Class13.anInt377 = 0;
                Class76.anInt1577 = 0;
                Class35.anInt742 = 0;
                Class4_Sub20_Sub7_Sub3.anInt3333 = 0;

                Class34.anInt1757 = 0;
                Class4_Sub2_Sub1.anInt2555 = 0;
                Class13_Sub2.anInt2457 = 0;
                Class4_Sub22.anInt2406 = 0;
                Class4_Sub20_Sub1.anInt2749 = 0;
                Class16.anInt433 = 0;
                Class4_Sub23.anInt2414 = 0;
                Buffer.anInt2059 = 0;
                Class67.anInt1349 = 0;
                Region.anInt115 = 0;
                Class64.anInt1265 = 0;
                Class4_Sub20.anInt2349 = 0;
                Class4_Sub2_Sub1.anInt2584 = 0;
                Class49.anInt1000 = 0;
                Class63.anInt1251 = 0;
                Class4_Sub20_Sub3.anInt2805 = 0;
                Class43.anInt880 = 0;
                Class50.anInt1022 = 0;
                Class4_Sub20_Sub3.anInt2802 = 0;
                ItemDefinition.anInt2953 = 0;
                AppletListener.anInt1462 = 0;
                Class41.anInt808 = 0;
                RS2Font.anInt2761 = 0;
                Class49.anInt996 = 0;
                SceneGraph.anInt2484 = 0;
                Class4_Sub24.anInt2445 = 0;
                Class4_Sub11_Sub1.anInt2689 = 0;
                Class57.anInt1122 = 0;
                Class4_Sub20_Sub17.anInt3207 = 0;
                Class5.anInt186 = 0;
                Class4_Sub2_Sub1.anInt2572 = 0;
                Class13_Sub2.anInt2455 = 0;
                Class35.anInt736 = 0;
                Class27.anInt609 = 0;
                Class32.anInt694 = 0;
                Class76.anInt1572 = 0;
                Class4_Sub22.anInt2385 = 0;
                Class4_Sub11_Sub1.anInt2672 = 0;
                Class4_Sub20_Sub15.anInt3156 = 0;
                Class4_Sub12.anInt2126 = 0;
                Buffer.anInt2079 = 0;
                Class35.anInt747 = 0;
                Class9.anInt283 = 0;
                Class6.anInt212 = 0;
                Region.anInt112 = 0;
                Class16.anInt435 = 0;
                Class5.anInt171 = 0;
                RS2Font.anInt2773 = 0;
                Class4_Sub23.anInt2418 = 0;
                Class4_Sub23.anInt2422 = 0;
                Player.anInt3588 = 0;
                Class4_Sub20_Sub6.anInt2915 = 0;
                Class68.anInt1379 = 0;
                RSInterface.anInt2191 = 0;
                Class30.anInt656 = 0;
                Class4_Sub2_Sub1.anInt2606 = 0;
                Class4_Sub2_Sub4.anInt2643 = 0;
                Class4_Sub20_Sub7_Sub5.anInt3382 = 0;
                Class62.anInt1234 = 0;
                Class24.anInt561 = 0;
                Class4_Sub20_Sub14.anInt3142 = 0;
                Npc.anInt3615 = 0;
                Class61.anInt1213 = 0;
                Class48.anInt975 = 0;
                Class4_Sub2_Sub1.anInt2598 = 0;
                Class16.anInt444 = 0;
                Class30.anInt658 = 0;
                RS2Font.anInt2789 = 0;
                Class4_Sub20.anInt2348 = 0;
                Class13_Sub2.anInt2467 = 0;
                Class78.anInt1600 = 0;
                Buffer.anInt2102 = 0;
                Class1.anInt63 = 0;
                ItemDefinition.anInt2969 = 0;
                Class35.anInt731 = 0;
                Class4_Sub20_Sub3.anInt2819 = 0;
                Class57.anInt1150 = 0;
                Class46.anInt932 = 0;
                Class50.anInt1009 = 0;
                Class43.anInt859 = 0;
                Class4_Sub20_Sub7_Sub5.anInt3412 = 0;
                Class4_Sub20_Sub7_Sub5.anInt3421 = 0;
                Class40.anInt790 = 0;
                Class53.anInt1073 = 0;
                Class4_Sub20_Sub7.anInt2939 = 0;
                Class19.anInt497 = 0;
                Class50.anInt1025 = 0;
                Buffer.anInt2062 = 0;
                Class4_Sub21.anInt2381 = 0;
                Class65.anInt1301 = 0;
                Class13_Sub2.anInt2458 = 0;
                AppletListener.anInt1449 = 0;
                Class47.anInt955 = 0;
                Class6.anInt218 = 0;
                Class4_Sub20_Sub17.anInt3198 = 0;
                Class11.anInt330 = 0;
                Class4_Sub6.anInt1935 = 0;
                ItemDefinition.anInt2994 = 0;
                Class19_Sub1.anInt2534 = 0;
                Game.anInt1836 = 0;
                Class19_Sub1.anInt2506 = 0;
                Class4_Sub15.anInt2300 = 0;
                RS2Font.anInt2783 = 0;
                Class33.anInt710 = 0;
                Class8.anInt249 = 0;
                Class4_Sub20_Sub4.anInt2843 = 0;
                Class4_Sub20_Sub3.anInt2811 = 0;
                Class66.anInt1318 = 0;
                Class4_Sub14.anInt2279 = 0;
                Buffer.anInt2098 = 0;
                Class41.anInt828 = 0;
                Class4_Sub12.anInt2119 = 0;
                Class58.anInt1169 = 0;
                Class4_Sub20_Sub1.anInt2755 = 0;
                Class1.anInt73 = 0;
                Class58.anInt1170 = 0;
                Class4_Sub2_Sub1.anInt2568 = 0;
                Class4_Sub20_Sub4.anInt2845 = 0;
                Class68.anInt1385 = 0;
                Class4_Sub20_Sub1.anInt2752 = 0;
                Class81.anInt1688 = 0;
                Class62.anInt1235 = 0;
                Buffer.anInt2103 = 0;
                Class4_Sub1.anInt1857 = 0;
                Region.anInt123 = 0;
                Class4_Sub20_Sub1.anInt2701 = 0;
                Class24.anInt554 = 0;
                Class19_Sub1.anInt2516 = 0;
                Class42.anInt845 = 0;
                anInt580 = 0;
                Buffer.anInt2081 = 0;
                Class19.anInt506 = 0;
                Class4_Sub2_Sub4.anInt2658 = 0;
                anInt589 = 0;
                Class2.anInt87 = 0;
                Class72.anInt1482 = 0;
                Class14.anInt401 = 0;
                Class4_Sub22.anInt2398 = 0;
                Buffer.anInt2094 = 0;
                Class4_Sub3.anInt1875 = 0;
                Class4_Sub3.anInt1900 = 0;
                Class57.anInt1136 = 0;
                Class4_Sub16.anInt2308 = 0;
                Buffer.anInt2105 = 0;
                Class64.anInt1264 = 0;
                Class66.anInt1316 = 0;
                Class47.anInt951 = 0;
                Class4_Sub22.anInt2392 = 0;
                Class35.anInt743 = 0;
                Class10.anInt298 = 0;
                Class43.anInt879 = 0;
                Class19.anInt508 = 0;
                Class76.anInt1546 = 0;
                Class4_Sub2_Sub1.anInt2612 = 0;
                Class42.anInt848 = 0;
                Class65.anInt1288 = 0;
                Class49.anInt1002 = 0;
                Class77.anInt1595 = 0;
                Region.anInt110 = 0;
                Class4_Sub21.anInt2369 = 0;
                Class4_Sub20_Sub1.anInt2739 = 0;
                Class2.anInt86 = 0;
                Class13.anInt372 = 0;
                Class4_Sub22.anInt2402 = 0;
                Class4_Sub20_Sub7.anInt2942 = 0;
                Class19_Sub1.anInt2510 = 0;
                Class4_Sub20_Sub7.anInt2940 = 0;
                Class16.anInt427 = 0;
                Class4_Sub20_Sub3.anInt2808 = 0;
                SceneGraph.anInt2486 = 0;
                Class14.anInt389 = 0;
                Class9.anInt266 = 0;
                Class50.anInt1007 = 0;
                Class4_Sub20_Sub6.anInt2908 = 0;
                Class4_Sub20_Sub3.anInt2823 = 0;
                Class4_Sub20_Sub1.anInt2714 = 0;
                Buffer.anInt2056 = 0;
                Class6.anInt213 = 0;
                Class66.anInt1322 = 0;
                Class4_Sub6.anInt1931 = 0;
                Class4_Sub20_Sub4.anInt2856 = 0;
                Class4_Sub20_Sub5.anInt2869 = 0;
                Class34.anInt1740 = 0;
                Class72.anInt1483 = 0;
                Buffer.anInt2072 = 0;
                Class4_Sub11_Sub1.anInt2675 = 0;
                Class4_Sub20_Sub13.anInt3118 = 0;
                Buffer.anInt2055 = 0;
                Class81.anInt1671 = 0;
                Class31.anInt672 = 0;
                Class6.anInt200 = 0;
                Buffer.anInt2074 = 0;
                Class5.anInt189 = 0;
                Class4_Sub20_Sub16.anInt3170 = 0;
                Buffer.anInt2065 = 0;
                Class37.anInt759 = 0;
                Class35.anInt727 = 0;
                Class4_Sub24.anInt2437 = 0;
                Class4_Sub2_Sub1.anInt2566 = 0;
                RS2Font.anInt2775 = 0;
                ItemDefinition.anInt3019 = 0;
                Class13.anInt380 = 0;
                SceneGraph.anInt2503 = 0;
                Buffer.anInt2052 = 0;
                Class4_Sub20_Sub17.anInt3185 = 0;
                Class59.aBoolean1188 = true;
                Class59.anInt1184 = 0;
                Class82.method1213((byte) -117);
                Class66.aClass4_Sub11_Sub1_1328.currentPosition = 0;
                Class57.anInt1130 = 0;
                ItemDefinition.anInt2980 = 0;
                Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.currentPosition = 0;
                RSCanvas.anInt56 = -1;
                Class57.anInt1141 = 0;
                Class43.anInt874 = -1;
                Class41.anInt822 = -1;
                AppletListener.anInt1448 = 0;
                Class4_Sub20_Sub16.aBoolean3169 = false;
                Class78.anInt1599 = 0;
                Class4_Sub20_Sub11.incomingPacket = -1;
                Class13_Sub2.method692(0);
                for (int i = 0; i < 100; i++) {
                    Class4_Sub2_Sub1.aJagexStringArray2574[i] = null;
                }
                Class4_Sub20_Sub5.anInt2889 = -20
                        + (int) (Math.random() * 30.0);
                Class5.anInt175 = 0;
                Class80.anInt1646 = 0;
                Class49.cameraHorizontalPosition = 0x7ff & -10 + (int) (Math.random() * 20.0);
                Class4_Sub23.aBoolean2421 = false;
                Class31.anInt680 = -60 + (int) (120.0 * Math.random());
                Class4_Sub23.anInt2412 = (int) (100.0 * Math.random()) - 50;
                Class4_Sub20_Sub7_Sub3.anInt3354 = (int) (110.0 * Math.random())
                        + -55;
                Class18.anInt477 = -1;
                Class4_Sub20_Sub1.anInt2734 = 0;
                Class4_Sub16.cameraRandomisationA = -40 + (int) (80.0 * Math.random());
                Class4_Sub20_Sub9.minimapState = 0;
                Class4_Sub20_Sub7_Sub6.anInt3431 = 0;
                GameShell.anInt12 = 0;
                Class67.anInt1352 = 0;
                Class1.anInt74 = 0;
                for (int i = 0; (i ^ 0xffffffff) > -2049; i++) {
                    Class4_Sub20_Sub7_Sub4.aPlayerArray3358[i] = null;
                    aClass4_Sub11Array575[i] = null;
                }
                for (int i = 0; (i ^ 0xffffffff) > -32769; i++) {
                    Class57.npcs[i] = null;
                }
                Class4_Sub15.localPlayer = Class4_Sub20_Sub7_Sub4.aPlayerArray3358[2047] = new Player();
                Class4_Sub20_Sub11.aClass65_3075.method1070((byte) 112);
                Class4_Sub20_Sub13.aClass65_3106.method1070((byte) -19);
                for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
                    for (int i_6_ = 0; i_6_ < 104; i_6_++) {
                        for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -105; i_7_++) {
                            Class40.aClass65ArrayArrayArray787[i][i_6_][i_7_] = null;
                        }
                    }
                }
                Npc.aClass65_3618 = new Class65();
                GameShell.anInt23 = 0;
                Class11.anInt326 = 0;
                for (int i = 0; (i ^ 0xffffffff) > (Class82.anInt1715 ^ 0xffffffff); i++) {
                    Class4_Sub20_Sub15 class4_sub20_sub15 = Class4_Sub10
                            .method203(98, i);
                    if (class4_sub20_sub15 != null
                            && class4_sub20_sub15.anInt3151 == 0) {
                        Class19.anIntArray514[i] = 0;
                        Class31.anIntArray687[i] = 0;
                    }
                }
                for (int i = 0; ((RSFont.anIntArray160.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
                    RSFont.anIntArray160[i] = -1;
                }
                if (Class4_Sub6.anInt1932 != -1) {
                    Class52.method1003(-119, Class4_Sub6.anInt1932);
                }
                for (Class4_Sub16 class4_sub16 = ((Class4_Sub16) Class31.aClass16_677
                        .method724((byte) 118)); class4_sub16 != null; class4_sub16 = (Class4_Sub16) Class31.aClass16_677
                        .method723((byte) -25)) {
                    Class4_Sub20_Sub7_Sub3.method418(-80, true, class4_sub16);
                }
                Class4_Sub6.anInt1932 = -1;
                Class31.aClass16_677 = new Class16(8);
                Class4_Sub20_Sub16.aBoolean3169 = false;
                RSInterface.aClass4_Sub13_2141 = null;
                ItemDefinition.anInt2980 = 0;
                Class4_Sub24.aClass35_2438.method901(new int[5], null, -1,
                        (byte) -79, false);
                for (int i = 0; (i ^ 0xffffffff) > -9; i++) {
                    Class4_Sub22.aJagexStringArray2387[i] = null;
                    Class4_Sub20_Sub7.aBooleanArray2946[i] = false;
                }
                Class13_Sub2.method695((byte) -85);
                Class34.aBoolean1770 = true;
                for (int i = 0; (i ^ 0xffffffff) > -101; i++) {
                    Class4_Sub20_Sub11.aBooleanArray3083[i] = true;
                }
                Class50.aJagexString_1019 = null;
                Class4_Sub10.anInt2021 = 0;
                Class13_Sub2.aClass4_Sub8Array2482 = null;
            }
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, "ha.A("
                    + arg0 + ')');
        }
    }

    public Class4_Sub20_Sub7 aClass4_Sub20_Sub7_570;
    public int anInt569;

    public int anInt571;

    public int anInt572 = 0;

    public int anInt573;

    public int anInt576;

    public int anInt588 = 0;

    public int anInt591;
}
