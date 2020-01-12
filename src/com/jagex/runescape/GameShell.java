package com.jagex.runescape;

import com.jagex.runescape.util.Signlink;
import tech.henning.client.Configuration;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Method;

public abstract class GameShell extends Canvas implements Runnable,
        FocusListener, WindowListener, MouseListener, MouseMotionListener {
    /**
     *
     */
    private static final long serialVersionUID = -6646571432138758395L;
    public static byte[][] regionsData;
    public static JagexString aJagexString_11 = JagexString.getRs2PreparedString(
            "wishes to trade with you)3");
    public static JagexString aJagexString_15 = JagexString.getRs2PreparedString(
            "headicons_hint");
    public static JagexString aJagexString_2 = JagexString.getRs2PreparedString(
            "Willkommen auf RuneScape");
    public static JagexString aJagexString_20 = (JagexString.getRs2PreparedString(
            "und die Schaltfl-=che (WSpielkonto erstellen(W am"));
    public static JagexString aJagexString_25 = JagexString.getRs2PreparedString("logo");
    public static Class4_Sub20_Sub12_Sub1[] aClass4_Sub20_Sub12_Sub1Array43;
    public static int anInt12 = 0;
    public static int anInt23 = 0;
    public static int anInt6 = 0;
    public static int mouseY;
    public static int mouseX;
    public static AppletListener appletListener;
    public static int eventClickX = 0;
    public static int eventClickY = 0;
    public static long lastClick = 0L;
    public static long clickTime;
    public static int eventMouseButtonPressed;
    public static int mouseButtonPressed = 0;
    public static int idleTime = 0;
    public static GameFrame gameFrame;
    public static int height;
    public static int width;
    public boolean mouseWheelDown;
    public int mouseWheelX;
    public int mouseWheelY;
    public int extraWidth;
    public int extraHeight;


    public static void method15() {
        aJagexString_20 = null;
        aJagexString_15 = null;
        aJagexString_11 = null;
        regionsData = null;
        aClass4_Sub20_Sub12_Sub1Array43 = null;
        aJagexString_25 = null;
        aJagexString_2 = null;

    }

    public static void method380(boolean arg0, Component arg1, GameShell applet) {
        try {
            arg1.addMouseListener(applet);
            arg1.addMouseMotionListener(applet);
            arg1.addFocusListener(applet);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("hd.OB("
                    + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method20(int arg0, JagexString arg1, boolean arg2, int arg3,
                                JagexString arg4, Class19 arg5) {
        try {
            if (arg3 == 21332) {
                int i = arg5.method754(arg1, arg3 + -21331);
                int i_1_ = arg5.method747(false, arg4, i);
                AppletListener.method1151(arg0, -2, arg5, i_1_, i, arg2);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("we.N("
                    + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
                    + arg2 + ',' + arg3 + ','
                    + (arg4 != null ? "{...}" : "null") + ','
                    + (arg5 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void providesignlink(Signlink arg0) {
        try {
            Class77.aClass75_1597 = Class43.aClass75_872 = arg0;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4
                    .method423(runtimeexception, ("we.providesignlink("
                            + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    public boolean aBoolean19 = false;


    public void destroy() {
        try {
            if (this == Class4_Sub22.anApplet_Sub1_2401 && !Class27.aBoolean616) {
                Class50.aLong1027 = Class52.method1002((byte) -42);
                Class25.method799(5000L, 10);
                Class77.aClass75_1597 = null;
                method18(1000);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    "we.destroy(" + ')');
        }
    }

    @Override
    public void focusGained(FocusEvent arg0) {
        try {
            Class32.aBoolean702 = true;
            Class4_Sub20_Sub4.aBoolean2849 = true;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4
                    .method423(runtimeexception, ("we.focusGained("
                            + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    @Override
    public void focusLost(FocusEvent arg0) {
        try {
            Class32.aBoolean702 = false;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4
                    .method423(runtimeexception, ("we.focusLost("
                            + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

//    public AppletContext getAppletContext() {
//        try {
//            if (gameFrame != null)
//                return null;
//            if (Class43.aClass75_872 != null
//                    && Class43.aClass75_872.gameShell != this)
//                return Class43.aClass75_872.gameShell.getAppletContext();
//            return super.getAppletContext();
//        } catch (RuntimeException runtimeexception) {
//            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
//                    ("we.getAppletContext(" + ')'));
//        }
//    }

//    public URL getCodeBase() {
//        try {
//            if (gameFrame != null)
//                return null;
//            if (Class43.aClass75_872 != null
//                    && Class43.aClass75_872.gameShell != this)
//                return Class43.aClass75_872.gameShell.getCodeBase();
//            return super.getCodeBase();
//        } catch (RuntimeException runtimeexception) {
//            throw runtimeexception;
//        }
//    }
//
//    public URL getDocumentBase() {
//        try {
//            if (gameFrame != null)
//                return null;
//            if (Class43.aClass75_872 != null
//                    && this != Class43.aClass75_872.gameShell)
//                return Class43.aClass75_872.gameShell.getDocumentBase();
//            return super.getDocumentBase();
//        } catch (RuntimeException runtimeexception) {
//            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
//                    ("we.getDocumentBase(" + ')'));
//        }
//    }
//
//    public String getParameter(String arg0) {
//        try {
//            if (gameFrame != null)
//                return null;
//            if (Class43.aClass75_872 != null
//                    && Class43.aClass75_872.gameShell != this)
//                return Class43.aClass75_872.gameShell.getParameter(arg0);
//            return super.getParameter(arg0);
//        } catch (RuntimeException runtimeexception) {
//            throw Class4_Sub20_Sub7_Sub4
//                    .method423(runtimeexception, ("we.getParameter("
//                            + (arg0 != null ? "{...}" : "null") + ')'));
//        }
//    }


    public synchronized void method11(int arg0) {
        try {

            Container container = gameFrame;
            if (Class4_Sub20_Sub7_Sub5.runeCanvas != null) {
                Class4_Sub20_Sub7_Sub5.runeCanvas.removeFocusListener(this);
                container.remove(Class4_Sub20_Sub7_Sub5.runeCanvas);
            }
            Class4_Sub20_Sub7_Sub5.runeCanvas = new RSCanvas(this);
            container.add(Class4_Sub20_Sub7_Sub5.runeCanvas);
            Class4_Sub20_Sub7_Sub5.runeCanvas.setSize(width,
                    height);
            Class4_Sub20_Sub7_Sub5.runeCanvas.setVisible(true);
            if (gameFrame == null) {
                Class4_Sub20_Sub7_Sub5.runeCanvas.setLocation(0, 0);
            }

            Class4_Sub20_Sub7_Sub5.runeCanvas.addFocusListener(this);
            Class4_Sub20_Sub7_Sub5.runeCanvas.requestFocus();
            Class4_Sub20_Sub4.aBoolean2849 = true;
            Class73.aBoolean1495 = false;
            Class9.aLong281 = Class52.method1002((byte) -42);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "we.H("
                    + arg0 + ')');
        }
    }

    public void method12(byte arg0) {
        try {
            long l = Class52.method1002((byte) -42);
            if (arg0 < 6) {
                anInt23 = -110;
            }
            long l_0_ = Class32.aLongArray699[Class41.anInt837];
            Class32.aLongArray699[Class41.anInt837] = l;
            if (l_0_ != 0L && l > l_0_) {
                int i = (int) (-l_0_ + l);
                Class73.anInt1497 = ((i >> -131121087) + 32000) / i;
            }
            Class41.anInt837 = 0x1f & 1 + Class41.anInt837;
            if (Class27.anInt625++ > 50) {
                Class4_Sub20_Sub4.aBoolean2849 = true;
                Class27.anInt625 -= 50;
                Class4_Sub20_Sub7_Sub5.runeCanvas.setSize(width,
                        height);
                Class4_Sub20_Sub7_Sub5.runeCanvas.setVisible(true);
                if (gameFrame != null) {
//                    Insets insets = gameFrame.getInsets();
//                    Class4_Sub20_Sub7_Sub5.runeCanvas.setLocation(insets.left,
//                            insets.top);
                } else {
                    Class4_Sub20_Sub7_Sub5.runeCanvas.setLocation(0, 0);
                }
            }
            method13((byte) -103);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "we.O("
                    + arg0 + ')');
        }
    }

    public abstract void method13(byte i);

    public void initializeApplication(int arg0, int width, int height, int revision, String arg4,
                                      boolean arg5, int arg6) {
        try {
            try {
                Class4_Sub20_Sub7_Sub3.revision = revision;
                GameShell.height = height;
                GameShell.width = width;
                Class4_Sub22.anApplet_Sub1_2401 = this;
                gameFrame = new GameFrame(this, width, height);

                Class77.aClass75_1597 = Class43.aClass75_872 = new Signlink(true, null, arg4, arg0);
                Class43.aClass75_872.method1172(this, 1, 66);
            } catch (Exception exception) {
                Class4_Sub20_Sub7_Sub4.method422(exception, -77, null);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("we.I("
                    + arg0 + ',' + width + ',' + height + ',' + revision + ','
                    + (arg4 != null ? "{...}" : "null") + ',' + arg5 + ','
                    + arg6 + ')'));
        }
    }

//    public abstract void method16(int i); // Disabled because i cannot find a reason this is ran at all

    public abstract void method17(int i);

    public synchronized void method18(int arg0) {
        try {
            if (!Class27.aBoolean616) {
                Class27.aBoolean616 = true;
                try {
                    Class4_Sub20_Sub7_Sub5.runeCanvas
                            .removeFocusListener(this);
                } catch (Exception exception) {
                    /* empty */
                }
                try {
                    method21();
                } catch (Exception exception) {
                    /* empty */
                }
                if (gameFrame != null) {
                    try {
                        System.exit(0);
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                }
                if (Class43.aClass75_872 != null) {
                    try {
                        Class43.aClass75_872.method1174(0);
                    } catch (Exception exception) {
                        /* empty */
                    }
                }
//                method16(-107);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "we.C("
                    + arg0 + ')');
        }
    }

    public void method19(byte arg0, String arg1) {
        try {
            if (!aBoolean19) {
                aBoolean19 = true;
                System.out.println("error_game_" + arg1);
//                try {
//                    getAppletContext().showDocument(new URL(getCodeBase(), ("error_game_" + arg1 + ".ws")), "_self");
//                } catch (Exception exception) {
//                    /* empty */
//                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("we.F("
                    + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
        }
    }

    public abstract void method21();

    public void method22(byte arg0) {
        try {
            long l = Class52.method1002((byte) -42);
            if (arg0 < 25) {
                anInt6 = 88;
            }
            long l_2_ = Class43.aLongArray881[Class4_Sub1.anInt1865];
            if (l_2_ != 0L && l_2_ < l) {
                /* empty */
            }
            Class43.aLongArray881[Class4_Sub1.anInt1865] = l;
            Class4_Sub1.anInt1865 = 0x1f & 1 + Class4_Sub1.anInt1865;
            synchronized (this) {
                Region.aBoolean126 = Class32.aBoolean702;
            }
            method25(-19134);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "we.E("
                    + arg0 + ')');
        }
    }

    public void method23(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        try {
            try {
                if (Class4_Sub22.anApplet_Sub1_2401 != null) {
                    Class4_Sub20_Sub10.anInt3066++;
                    if (Class4_Sub20_Sub10.anInt3066 >= 3) {
                        method19((byte) 100, "alreadyloaded");
                    } else {
//                        getAppletContext().showDocument(getDocumentBase(),
//                                "_self");
                    }
                } else {
                    Class4_Sub22.anApplet_Sub1_2401 = this;
                    height = arg1;
                    Class4_Sub20_Sub7_Sub3.revision = arg0;
                    width = arg3;
                    if (Class43.aClass75_872 == null) {
                        Class77.aClass75_1597 = Class43.aClass75_872 = new Signlink(false, this, null, 0);
                    }
                    Class43.aClass75_872.method1172(this, 1, 14);
                }
            } catch (Exception exception) {
                Class4_Sub20_Sub7_Sub4.method422(exception, -53, null);
                method19((byte) 40, "crash");
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    ("we.B(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
                            + ',' + arg4 + ')'));
        }
    }

    public boolean method24(int arg0) {
        try {
            String string = Configuration.SERVER_ADDRESS;
            if (string.equals("jagex.com") || string.endsWith(".jagex.com")) {
                return true;
            }
            if (string.equals("runescape.com") || string.endsWith(".runescape.com")) {
                return true;
            }
            if (string.endsWith("127.0.0.1")) {
                return true;
            }
            for (/**/; (string.length() > 0
                    && string.charAt(-1 + string.length()) >= '0' && string
                    .charAt(string.length() + -1) <= '9'); string = string
                    .substring(0, string.length() + -1)) {
                /* empty */
            }
            if (string.endsWith("192.168.1.")) {
                return true;
            }
            if (arg0 != 0) {
                windowDeiconified(null);
            }
            method19((byte) -87, "invalidhost");
            return false;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "we.L("
                    + arg0 + ')');
        }
    }

    public abstract void method25(int i);

    public synchronized void paint(Graphics arg0) {
        do {
            try {
                if (Class4_Sub22.anApplet_Sub1_2401 == this
                        && !Class27.aBoolean616) {
                    Class4_Sub20_Sub4.aBoolean2849 = true;
                    if (Signlink.jVersion == null
                            || !Signlink.jVersion.startsWith("1.5")
                            || (-Class9.aLong281
                            + Class52.method1002((byte) -42) <= 1000L)) {
                        break;
                    }
                    Rectangle rectangle = arg0.getClipBounds();
                    if (rectangle == null
                            || (((rectangle.width ^ 0xffffffff) <= (width ^ 0xffffffff)) && ((height ^ 0xffffffff) >= (rectangle.height ^ 0xffffffff)))) {
                        Class73.aBoolean1495 = true;
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw Class4_Sub20_Sub7_Sub4
                        .method423(runtimeexception, ("we.paint("
                                + (arg0 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public void run() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addFocusListener(this);
        try {
            try {
                if (Signlink.jVendor != null) {
                    String string = Signlink.jVendor.toLowerCase();
                    if ((string.indexOf("sun") ^ 0xffffffff) == 0
                            && string.indexOf("apple") == -1) {
                        if ((string.indexOf("ibm") ^ 0xffffffff) != 0
                                && (Signlink.jVersion == null || Signlink.jVersion
                                .equals("1.4.2"))) {
                            method19((byte) 89, "wrongjava");
                            return;
                        }
                    } else {
                        String string_3_ = Signlink.jVersion;
                        if (string_3_.equals("1.1")
                                || string_3_.startsWith("1.1.")
                                || string_3_.equals("1.2")
                                || string_3_.startsWith("1.2.")) {
                            method19((byte) 22, "wrongjava");
                            return;
                        }
                        Class4_Sub20.anInt2358 = 5;
                    }
                }
                if (Class43.aClass75_872.gameShell != null) {
                    Method method = Signlink.setFocusCycleRoot;
                    if (method != null) {
                        try {
                            method.invoke(Class43.aClass75_872.gameShell,
                                    new Object[]{Boolean.TRUE});
                        } catch (Throwable throwable) {
                            /* empty */
                        }
                    }
                }
                method11(-3);
                Class62.aClass13_1225 = Class63.method1058(-113,
                        width, Class4_Sub20_Sub7_Sub5.runeCanvas,
                        height);
                method17(0);
                Class4_Sub20_Sub13.aClass14_3126 = Class4_Sub12.method276(-98);
                while (Class50.aLong1027 == 0L
                        || ((Class50.aLong1027 ^ 0xffffffffffffffffL) < (Class52
                        .method1002((byte) -42) ^ 0xffffffffffffffffL))) {
                    Class4_Sub10.anInt2024 = (Class4_Sub20_Sub13.aClass14_3126
                            .method705(true, Class4_Sub20.anInt2358,
                                    Class31.anInt691));
                    for (int i = 0; ((Class4_Sub10.anInt2024 ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
                        method22((byte) 65);
                    }
                    method12((byte) 77);
                    Class4_Sub20_Sub7_Sub4.method424((byte) -48,
                            (Class4_Sub20_Sub7_Sub5.runeCanvas),
                            Class43.aClass75_872);
                }
            } catch (Exception exception) {
                Class4_Sub20_Sub7_Sub4.method422(exception, -52, null);
                method19((byte) -127, "crash");
            }
            method18(1000);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    "we.run(" + ')');
        }
    }

    public void start() {
        try {
            if (Class4_Sub22.anApplet_Sub1_2401 == this && !Class27.aBoolean616) {
                Class50.aLong1027 = 0L;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    "we.start(" + ')');
        }
    }

    public void stop() {
        try {
            if (Class4_Sub22.anApplet_Sub1_2401 == this && !Class27.aBoolean616) {
                Class50.aLong1027 = Class52.method1002((byte) -42) + 4000L;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    "we.stop(" + ')');
        }
    }

    public void update(Graphics graphics) {
        try {
            paint(graphics);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    ("we.update(" + (graphics != null ? "{...}" : "null") + ')'));
        }
    }

    public void windowActivated(WindowEvent arg0) {
    }

    public void windowClosed(WindowEvent arg0) {
    }

    public void windowClosing(WindowEvent arg0) {
        try {
            destroy();
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4
                    .method423(runtimeexception, ("we.windowClosing("
                            + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    public void windowDeactivated(WindowEvent arg0) {

    }

    public void windowDeiconified(WindowEvent arg0) {

    }

    public void windowIconified(WindowEvent arg0) {
    }

    public void windowOpened(WindowEvent arg0) {
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public synchronized void mouseDragged(MouseEvent mouseEvent) {
        try {
            GameShell.idleTime = 0;
            GameShell.mouseX = mouseEvent.getX();
            GameShell.mouseY = mouseEvent.getY();
            if (mouseWheelDown) {
                GameShell.mouseY = mouseWheelX - mouseEvent.getX();
                int k = mouseWheelY - mouseEvent.getY();
                mouseWheelDragged(GameShell.mouseY, -k);
                mouseWheelX = mouseEvent.getX();
                mouseWheelY = mouseEvent.getY();
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4
                    .method423(runtimeexception, ("te.mouseDragged("
                            + (mouseEvent != null ? "{...}" : "null") + ')'));
        }
    }

    void mouseWheelDragged(int param1, int param2) {

    }

    @Override
    public synchronized void mouseEntered(MouseEvent mouseEvent) {
        if (GameShell.appletListener != null) {
            GameShell.idleTime = 0;
            GameShell.mouseX = mouseEvent.getX();
            GameShell.mouseY = mouseEvent.getY();
        }
    }

    @Override
    public synchronized void mouseExited(MouseEvent arg0) {
        if (GameShell.appletListener != null) {
            GameShell.idleTime = 0;
            GameShell.mouseX = -1;
            GameShell.mouseY = -1;
        }
    }

    @Override
    public synchronized void mouseMoved(MouseEvent mouseevent) {
        if (GameShell.appletListener != null) {
            GameShell.idleTime = 0;
            GameShell.mouseX = mouseevent.getX();
            GameShell.mouseY = mouseevent.getY();
        }
    }

    @Override
    public synchronized void mousePressed(MouseEvent mouseEvent) {
        GameShell.idleTime = 0;
        GameShell.eventClickX = mouseEvent.getX();
        GameShell.eventClickY = mouseEvent.getY();
        GameShell.lastClick = System.currentTimeMillis();
        if (mouseEvent.getButton() == MouseEvent.BUTTON2) {
            mouseWheelDown = true;
            mouseWheelX = GameShell.mouseX;
            mouseWheelY = GameShell.mouseY;
            return;
        }
        if (mouseEvent.isMetaDown() || mouseEvent.getButton() == MouseEvent.BUTTON3) {
            GameShell.eventMouseButtonPressed = 2;
            GameShell.mouseButtonPressed = 2;
        } else {
            GameShell.eventMouseButtonPressed = 1;
            GameShell.mouseButtonPressed = 1;
        }
    }

    @Override
    public synchronized void mouseReleased(MouseEvent mouseEvent) {
        GameShell.idleTime = 0;
        GameShell.mouseButtonPressed = 0;
        mouseWheelDown = false;
    }
}
