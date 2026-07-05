package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class n implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f1065b;

    public /* synthetic */ n(u uVar, int i2) {
        this.f1064a = i2;
        this.f1065b = uVar;
    }

    @Override // c.b
    public final void a(Object obj) {
        switch (this.f1064a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                u uVar = this.f1065b;
                s sVar = (s) uVar.y.pollFirst();
                if (sVar == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = sVar.f1074a;
                    uVar.f1085c.a();
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    break;
                }
            case 1:
                u uVar2 = this.f1065b;
                s sVar2 = (s) uVar2.y.pollFirst();
                if (sVar2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = sVar2.f1074a;
                    uVar2.f1085c.a();
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    break;
                }
            default:
                u uVar3 = this.f1065b;
                s sVar3 = (s) uVar3.y.pollFirst();
                if (sVar3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = sVar3.f1074a;
                    uVar3.f1085c.a();
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    break;
                }
        }
    }
}
