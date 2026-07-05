package U;

import a.AbstractActivityC0046m;
import android.os.Bundle;
import androidx.fragment.app.i;
import androidx.lifecycle.EnumC0066m;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0061h;
import androidx.lifecycle.InterfaceC0072t;
import androidx.lifecycle.J;
import androidx.lifecycle.N;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.r;
import j0.AbstractC0150d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f663a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f664b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f663a = i2;
        this.f664b = obj;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [U.g, androidx.lifecycle.t, java.lang.Object] */
    @Override // androidx.lifecycle.r
    public final void f(InterfaceC0072t interfaceC0072t, EnumC0066m enumC0066m) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f663a) {
            case 0:
                if (enumC0066m != EnumC0066m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0072t.getLifecycle().b(this);
                ?? r6 = this.f664b;
                Bundle bundleA = r6.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        AbstractC0150d.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                AbstractC0150d.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                                if (!(r6 instanceof T)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                S viewModelStore = ((T) r6).getViewModelStore();
                                e savedStateRegistry = r6.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f1183a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    AbstractC0150d.e(str2, "key");
                                    N n2 = (N) linkedHashMap.get(str2);
                                    AbstractC0150d.b(n2);
                                    H.a(n2, savedStateRegistry, r6.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException("Failed to instantiate " + str, e2);
                            }
                        } catch (NoSuchMethodException e3) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                        }
                    } catch (ClassNotFoundException e4) {
                        throw new RuntimeException(A.e.d("Class ", str, " wasn't found"), e4);
                    }
                }
                return;
            case 1:
                i iVar = (i) this.f664b;
                AbstractActivityC0046m.access$ensureViewModelStore(iVar);
                iVar.getLifecycle().b(this);
                return;
            case 2:
                new HashMap();
                InterfaceC0061h[] interfaceC0061hArr = (InterfaceC0061h[]) this.f664b;
                if (interfaceC0061hArr.length > 0) {
                    InterfaceC0061h interfaceC0061h = interfaceC0061hArr[0];
                    throw null;
                }
                if (interfaceC0061hArr.length <= 0) {
                    return;
                }
                InterfaceC0061h interfaceC0061h2 = interfaceC0061hArr[0];
                throw null;
            default:
                if (enumC0066m != EnumC0066m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0066m).toString());
                }
                interfaceC0072t.getLifecycle().b(this);
                ((J) this.f664b).b();
                return;
        }
    }
}
