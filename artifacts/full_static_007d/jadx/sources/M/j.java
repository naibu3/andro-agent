package M;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f532j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f533k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f534a;

    /* renamed from: b, reason: collision with root package name */
    public final n.g f535b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f536c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f537d;

    /* renamed from: e, reason: collision with root package name */
    public final f f538e;

    /* renamed from: f, reason: collision with root package name */
    public final i f539f;

    /* renamed from: g, reason: collision with root package name */
    public final A.m f540g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final d f541i;

    public j(t tVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f534a = reentrantReadWriteLock;
        this.f536c = 3;
        i iVar = tVar.f565a;
        this.f539f = iVar;
        int i2 = tVar.f566b;
        this.h = i2;
        this.f541i = tVar.f567c;
        this.f537d = new Handler(Looper.getMainLooper());
        this.f535b = new n.g();
        this.f540g = new A.m(5);
        f fVar = new f(this);
        this.f538e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f536c = 0;
            } catch (Throwable th) {
                this.f534a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.n(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f532j) {
            try {
                jVar = f533k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f534a.readLock().lock();
        try {
            return this.f536c;
        } finally {
            this.f534a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f534a.writeLock().lock();
        try {
            if (this.f536c == 0) {
                return;
            }
            this.f536c = 0;
            this.f534a.writeLock().unlock();
            f fVar = this.f538e;
            j jVar = fVar.f527a;
            try {
                jVar.f539f.n(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f534a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f534a.writeLock().lock();
        try {
            this.f536c = 2;
            arrayList.addAll(this.f535b);
            this.f535b.clear();
            this.f534a.writeLock().unlock();
            this.f537d.post(new h(arrayList, this.f536c, th));
        } catch (Throwable th2) {
            this.f534a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence e(CharSequence charSequence, int i2, int i3) {
        z[] zVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i2 <= i3)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        B b2 = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i3 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        D0.h hVar = this.f538e.f528b;
        hVar.getClass();
        boolean z2 = charSequence instanceof x;
        if (z2) {
            ((x) charSequence).a();
        }
        if (z2) {
            b2 = new B((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    b2 = new B((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i3 + 1, z.class) <= i3) {
                    b2 = new B();
                    b2.f521a = false;
                    b2.f522b = new SpannableString(charSequence);
                }
            } finally {
                if (z2) {
                    ((x) charSequence).b();
                }
            }
        }
        if (b2 != null && (zVarArr = (z[]) b2.f522b.getSpans(i2, i3, z.class)) != null && zVarArr.length > 0) {
            for (z zVar : zVarArr) {
                int spanStart = b2.f522b.getSpanStart(zVar);
                int spanEnd = b2.f522b.getSpanEnd(zVar);
                if (spanStart != i3) {
                    b2.removeSpan(zVar);
                }
                i2 = Math.min(spanStart, i2);
                i3 = Math.max(spanEnd, i3);
            }
        }
        int i4 = i2;
        int i5 = i3;
        if (i4 != i5 && i4 < charSequence.length()) {
            B b3 = (B) hVar.q(charSequence, i4, i5, Integer.MAX_VALUE, false, new E.c(b2, (A.m) hVar.f258b, 1));
            if (b3 != null) {
                Spannable spannable = b3.f522b;
                if (z2) {
                    ((x) charSequence).b();
                }
                return spannable;
            }
            if (!z2) {
                return charSequence;
            }
        } else if (!z2) {
            return charSequence;
        }
        return charSequence;
    }

    public final void f(g gVar) {
        C0.d.j(gVar, "initCallback cannot be null");
        this.f534a.writeLock().lock();
        try {
            if (this.f536c == 1 || this.f536c == 2) {
                this.f537d.post(new h(Arrays.asList(gVar), this.f536c, null));
            } else {
                this.f535b.add(gVar);
            }
            this.f534a.writeLock().unlock();
        } catch (Throwable th) {
            this.f534a.writeLock().unlock();
            throw th;
        }
    }
}
