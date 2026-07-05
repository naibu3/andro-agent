package expo.modules.kotlin.edgeToEdge;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import expo.modules.core.BasePackage;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: EdgeToEdgePackage.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/edgeToEdge/EdgeToEdgePackage;", "Lexpo/modules/core/BasePackage;", "<init>", "()V", "createReactActivityLifecycleListeners", "", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "activityContext", "Landroid/content/Context;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EdgeToEdgePackage extends BasePackage {
    @Override // expo.modules.core.BasePackage, expo.modules.core.interfaces.Package
    public List<ReactActivityLifecycleListener> createReactActivityLifecycleListeners(Context activityContext) {
        return CollectionsKt.listOf(new ReactActivityLifecycleListener() { // from class: expo.modules.kotlin.edgeToEdge.EdgeToEdgePackage.createReactActivityLifecycleListeners.1
            @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
            public void onCreate(Activity activity, Bundle savedInstanceState) {
                Object objM9118constructorimpl;
                Object objM9118constructorimpl2;
                Pair[] pairArr = new Pair[0];
                Object obj = null;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Class<?> cls = Class.forName("com.facebook.react.views.view.WindowUtilKt");
                    Class[] clsArr = (Class[]) new ArrayList(0).toArray(new Class[0]);
                    Object[] array = new ArrayList(0).toArray(new Object[0]);
                    Method declaredMethod = cls.getDeclaredMethod("isEdgeToEdgeFeatureFlagOn", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(null, Arrays.copyOf(array, array.length));
                    if (!(objInvoke instanceof Boolean)) {
                        objInvoke = null;
                    }
                    objM9118constructorimpl = Result.m9118constructorimpl((Boolean) objInvoke);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    Log.e("EdgeToEdgePackage", "Failed to invoke 'isEdgeToEdgeFeatureFlagOn' on com.facebook.react.views.view.WindowUtilKt", thM9121exceptionOrNullimpl);
                }
                if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                    objM9118constructorimpl = null;
                }
                Boolean bool = (Boolean) objM9118constructorimpl;
                if (bool != null ? bool.booleanValue() : true) {
                    Pair[] pairArr2 = new Pair[1];
                    pairArr2[0] = new Pair(Window.class, activity != null ? activity.getWindow() : null);
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        Class<?> cls2 = Class.forName("com.facebook.react.views.view.WindowUtilKt");
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add((Class) pairArr2[0].getFirst());
                        Class[] clsArr2 = (Class[]) arrayList.toArray(new Class[0]);
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(pairArr2[0].getSecond());
                        Object[] array2 = arrayList2.toArray(new Object[0]);
                        Method declaredMethod2 = cls2.getDeclaredMethod("enableEdgeToEdge", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        declaredMethod2.setAccessible(true);
                        Object objInvoke2 = declaredMethod2.invoke(null, Arrays.copyOf(array2, array2.length));
                        if (objInvoke2 instanceof Unit) {
                            obj = objInvoke2;
                        }
                        objM9118constructorimpl2 = Result.m9118constructorimpl((Unit) obj);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
                    if (thM9121exceptionOrNullimpl2 != null) {
                        Log.e("EdgeToEdgePackage", "Failed to invoke 'enableEdgeToEdge' on com.facebook.react.views.view.WindowUtilKt", thM9121exceptionOrNullimpl2);
                    }
                    Result.m9124isFailureimpl(objM9118constructorimpl2);
                    if (activity != null) {
                        EdgeToEdgePackageKt.enforceNavigationBarContrastFromTheme(activity);
                    }
                }
            }
        });
    }
}
