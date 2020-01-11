package com.jagex.runescape.util;

import com.jagex.runescape.Class22;
import com.jagex.runescape.Class39;
import tech.henning.client.Configuration;

import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;

public class Signlink implements Runnable {
    public static Method aMethod1537;
    public static Method setFocusCycleRoot;
    public static int anInt1539 = 3;
    public static String jVendor;
    public static String aString1534;
    public static String jVersion;
    public boolean aBoolean1543;
    public Class22 aClass22_1530;
    public Class22 aClass22_1535;
    public Class39 aClass39_1527;
    public Class39 aClass39_1528 = null;
    public Class39[] aClass39Array1541;
    public File aFile1526 = null;
    public File aFile1531 = null;
    public Applet applet;
    public EventQueue eventQueue;
    public int anInt1542;
    public Thread aThread1532;

    public Signlink(boolean active, Applet applet, String arg3, int arg4) {
        aClass39_1527 = null;
        aClass22_1530 = null;
        aClass22_1535 = null;
        anInt1542 = 0;
        aBoolean1543 = false;
        this.applet = null;
        try {
            jVersion = "1.1";
            this.applet = applet;
            jVendor = "Unknown";
            try {
                jVendor = System.getProperty("java.vendor");
                jVersion = System.getProperty("java.version");
            } catch (Exception exception) {
                /* empty */
            }
            try {
                aString1534 = System.getProperty("user.home");
                if (aString1534 != null)
                    aString1534 += "/";
            } catch (Exception exception) {
                /* empty */
            }
            if (aString1534 == null)
                aString1534 = "~/";
            try {
                eventQueue = Toolkit.getDefaultToolkit()
                        .getSystemEventQueue();
            } catch (Throwable throwable) {
                /* empty */
            }
            try {
                if (applet == null)
                    aMethod1537 = (Class.forName("java.awt.Component")
                            .getDeclaredMethod("setFocusTraversalKeysEnabled",
                                    new Class[]{Boolean.TYPE}));
                else
                    aMethod1537 = (applet.getClass().getMethod(
                            "setFocusTraversalKeysEnabled",
                            new Class[]{Boolean.TYPE}));
            } catch (Exception exception) {
                /* empty */
            }
            try {
                if (applet == null)
                    setFocusCycleRoot = (Class.forName("java.awt.Container")
                            .getDeclaredMethod("setFocusCycleRoot",
                                    new Class[]{Boolean.TYPE}));
                else
                    setFocusCycleRoot = applet.getClass()
                            .getMethod("setFocusCycleRoot",
                                    (new Class[]{Boolean.TYPE}));
            } catch (Exception exception) {
                /* empty */
            }
            if (active)
                findCacheDirectory(arg3, arg4);
            aBoolean1543 = false;
            aThread1532 = new Thread(this);
            aThread1532.setPriority(10);
            aThread1532.setDaemon(true);
            aThread1532.start();
        } catch (RuntimeException runtimeexception) {
            throw runtimeexception;
        }
    }

    public Class22 method1170(Class<?>[] arg0, byte arg1, String arg2, Class<?> arg3) {
        try {
            if (arg1 <= 120)
                aMethod1537 = null;
            return method1175(new Object[]{arg3, arg2, arg0}, 8, 0, 0, 0);
        } catch (RuntimeException runtimeexception) {
            throw runtimeexception;
        }
    }

    public Class22 method1171(byte arg0, Class<?> arg1, String arg2) {
        try {
            if (arg0 != -104)
                return null;
            return method1175(new Object[]{arg1, arg2}, 9, 0, 0, 0);
        } catch (RuntimeException runtimeexception) {
            throw runtimeexception;
        }
    }

    public Class22 method1172(Runnable arg0, int arg1, int arg2) {
        try {
            if (arg2 < 6)
                return null;
            return method1175(arg0, 2, 0, arg1, 0);
        } catch (RuntimeException runtimeexception) {
            throw runtimeexception;
        }
    }

    public Class22 method1173(int arg0, URL arg1) {
        try {
            if (arg0 >= -127)
                method1174(113);
            return method1175(arg1, 4, 0, 0, 0);
        } catch (RuntimeException runtimeexception) {
            throw runtimeexception;
        }
    }

    public void method1174(int arg0) {
        if (arg0 != 0)
            anInt1539 = -99;
        synchronized (this) {
            aBoolean1543 = true;
            this.notifyAll();
        }
        try {
            aThread1532.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        if (aClass39_1528 != null) {
            try {
                aClass39_1528.method927(0);
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }
        if (aClass39_1527 != null) {
            try {
                aClass39_1527.method927(0);
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }
        if (aClass39Array1541 != null) {
            for (int i = 0; aClass39Array1541.length > i; i++) {
                if (aClass39Array1541[i] != null) {
                    try {
                        aClass39Array1541[i].method927(0);
                    } catch (java.io.IOException ioexception) {
                        /* empty */
                    }
                }
            }
        }
    }

    public Class22 method1175(Object arg0, int arg1, int arg2, int arg3,
                              int arg4) {
        try {
            Class22 class22 = new Class22();
            class22.anInt541 = arg3;
            class22.anObject542 = arg0;
            class22.anInt540 = arg1;
            synchronized (this) {
                if (aClass22_1530 == null)
                    aClass22_1530 = aClass22_1535 = class22;
                else {
                    aClass22_1530.aClass22_544 = class22;
                    aClass22_1530 = class22;
                }
                this.notify();
            }
            if (arg4 != 0)
                return null;
            return class22;
        } catch (RuntimeException runtimeexception) {
            throw runtimeexception;
        }
    }

    public Class22 method1176(byte arg0, String arg1, int arg2) {
        try {
            if (arg0 <= 83)
                method1170(null, (byte) 46, null, null);
            return method1175(arg1, 1, 0, arg2, 0);
        } catch (RuntimeException runtimeexception) {
            throw runtimeexception;
        }
    }

    /**
     * Keep this string - Barry
     *
     * @return
     */
    public static final String getUserCache() {
        File file = null;
        String home = System.getProperty("user.home");
        String separator = System.getProperty("file.separator");
        String cacheName = Configuration.CACHE_NAME;
        StringBuilder sb = new StringBuilder(home + separator + cacheName + separator);
        String cacheDir = sb.toString();
        file = new File(cacheDir);
        if (file.exists() || file.mkdir()) {
            return cacheDir;
        }
        return null;
    }

    public void findCacheDirectory(String arg1, int arg3) {
        String cacheLoc = getUserCache();
        boolean bool = false;
        for (int i = 0; i < 2; i++) {
                try {
                    if (cacheLoc.length() > 0 && !new File(cacheLoc).exists())
                        continue;
                    File file = new File(cacheLoc);
                    if (i == 1 && !file.exists()) {
                        boolean bool_3_ = file.mkdir();
                        if (!bool_3_)
                            continue;
                    }
                    if (!bool) {
                        try {
                            File file_4_ = new File(file, "uid.dat");
                            if (i == 1 && (!file_4_.exists() || (file_4_
                                    .length() ^ 0xffffffffffffffffL) > -5L)) {
                                Random random = new Random();
                                int i_5_;
                                for (i_5_ = -1; i_5_ == -1; i_5_ = random
                                        .nextInt()) {
                                    /* empty */
                                }
                                DataOutputStream dataoutputstream = (new DataOutputStream(
                                        new FileOutputStream(file_4_)));
                                dataoutputstream.writeInt(i_5_);
                                dataoutputstream.close();
                            }
                            if (file_4_.exists()) {
                                bool = true;
                                DataInputStream datainputstream = (new DataInputStream(
                                        new FileInputStream(file_4_)));
                                anInt1542 = datainputstream.readInt() + 1;
                                datainputstream.close();
                            }
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }
                    if (aFile1531 == null) {
                        try {
                            file = new File(file, arg1);
                            if (i == 1 && !file.exists()) {
                                boolean bool_6_ = file.mkdir();
                                if (!bool_6_)
                                    continue;
                            }
                            File file_7_ = new File(file,
                                    "main_file_cache.dat2");
                            if ((i ^ 0xffffffff) == -1 && !file_7_.exists())
                                continue;
                            aClass39_1528 = new Class39(file_7_, "rw",
                                    52428800L);
                            aClass39Array1541 = new Class39[arg3];
                            for (int i_8_ = 0; arg3 > i_8_; i_8_++)
                                aClass39Array1541[i_8_] = (new Class39(
                                        new File(
                                                file,
                                                ("main_file_cache.idx" + i_8_)),
                                        "rw", 1048576L));
                            aClass39_1527 = (new Class39(new File(file,
                                    "main_file_cache.idx255"), "rw",
                                    1048576L));
                            aFile1526 = aFile1531 = file;
                        } catch (Exception exception) {
                            try {
                                aClass39_1528.method927(0);
                                for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (arg3 ^ 0xffffffff)); i_9_++)
                                    aClass39Array1541[i_9_].method927(0);
                                aClass39_1527.method927(0);
                            } catch (Exception exception_10_) {
                                /* empty */
                            }
                            aClass39Array1541 = null;
                            aClass39_1528 = aClass39_1527 = null;
                            aFile1526 = aFile1531 = null;
                        }
                    }
                } catch (Exception exception) {
                    /* empty */
                }
                if (bool && aFile1531 != null)
                    return;
        }
        if (aFile1531 == null)
            throw new RuntimeException();
    }

    public Class22 method1179(int arg0, int arg1) {
        try {
            return method1175(null, 3, 0, arg0, 0);
        } catch (RuntimeException runtimeexception) {
            throw runtimeexception;
        }
    }

    @Override
    public void run() {
        try {
            for (; ; ) {
                Class22 class22;
                synchronized (this) {
                    for (; ; ) {
                        if (aBoolean1543)
                            return;
                        if (aClass22_1535 != null) {
                            class22 = aClass22_1535;
                            aClass22_1535 = aClass22_1535.aClass22_544;
                            if (aClass22_1535 == null)
                                aClass22_1530 = null;
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException interruptedexception) {
                            /* empty */
                        }
                    }
                }
                try {
                    int i = class22.anInt540;
                    if ((i ^ 0xffffffff) == -2)
                        class22.anObject543 = new Socket(
                                InetAddress
                                        .getByName((String) (class22.anObject542)),
                                class22.anInt541);
                    else if ((i ^ 0xffffffff) != -3) {
                        if ((i ^ 0xffffffff) == -5)
                            class22.anObject543 = new DataInputStream(
                                    ((URL) class22.anObject542).openStream());
                        else if (i == 8) {
                            Object[] objects = (Object[]) class22.anObject542;
                            class22.anObject543 = (((Class<?>) objects[0])
                                    .getDeclaredMethod((String) objects[1],
                                            (Class[]) objects[2]));
                        } else {
                            if (i != 9)
                                throw new Exception();
                            Object[] objects = (Object[]) class22.anObject542;
                            class22.anObject543 = ((Class<?>) objects[0])
                                    .getDeclaredField((String) objects[1]);
                        }
                    } else {
                        Thread thread = new Thread(
                                (Runnable) class22.anObject542);
                        thread.setDaemon(true);
                        thread.start();
                        thread.setPriority(class22.anInt541);
                        class22.anObject543 = thread;
                    }
                    class22.anInt545 = 1;
                } catch (ThreadDeath threaddeath) {
                    throw threaddeath;
                } catch (Throwable throwable) {
                    class22.anInt545 = 2;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw runtimeexception;
        }
    }
}
