package com.stripe.android.stripe3ds2.init;

import com.stripe.android.stripe3ds2.init.SecurityCheck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecurityChecker.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0019\b\u0000\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "securityChecks", "", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "<init>", "(Ljava/util/List;)V", "getWarnings", "Lcom/stripe/android/stripe3ds2/init/Warning;", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultSecurityChecker implements SecurityChecker {
    private static final Companion Companion = new Companion(null);
    private static final List<SecurityCheck> DEFAULT_CHECKS = CollectionsKt.listOf((Object[]) new SecurityCheck[]{new SecurityCheck.RootedCheck(), new SecurityCheck.Tampered(), new SecurityCheck.Emulator(), new SecurityCheck.DebuggerAttached(false, 1, null), new SecurityCheck.UnsupportedOS()});
    private final List<SecurityCheck> securityChecks;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSecurityChecker() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSecurityChecker(List<? extends SecurityCheck> securityChecks) {
        Intrinsics.checkNotNullParameter(securityChecks, "securityChecks");
        this.securityChecks = securityChecks;
    }

    public /* synthetic */ DefaultSecurityChecker(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DEFAULT_CHECKS : list);
    }

    @Override // com.stripe.android.stripe3ds2.init.SecurityChecker
    public List<Warning> getWarnings() {
        List<SecurityCheck> list = this.securityChecks;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SecurityCheck) obj).getIsDebuggerConnected()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((SecurityCheck) it.next()).getWarning());
        }
        return arrayList3;
    }

    /* compiled from: SecurityChecker.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker$Companion;", "", "<init>", "()V", "DEFAULT_CHECKS", "", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "getDEFAULT_CHECKS", "()Ljava/util/List;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<SecurityCheck> getDEFAULT_CHECKS() {
            return DefaultSecurityChecker.DEFAULT_CHECKS;
        }
    }
}
