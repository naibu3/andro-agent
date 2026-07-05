package H;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class F implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public f0 f320a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0027v f322c;

    public F(View view, InterfaceC0027v interfaceC0027v) {
        this.f321b = view;
        this.f322c = interfaceC0027v;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f0 f0VarC = f0.c(windowInsets, view);
        int i2 = Build.VERSION.SDK_INT;
        InterfaceC0027v interfaceC0027v = this.f322c;
        if (i2 < 30) {
            G.a(windowInsets, this.f321b);
            if (f0VarC.equals(this.f320a)) {
                return ((g.r) interfaceC0027v).b(view, f0VarC).b();
            }
        }
        this.f320a = f0VarC;
        f0 f0VarB = ((g.r) interfaceC0027v).b(view, f0VarC);
        if (i2 >= 30) {
            return f0VarB.b();
        }
        E.c(view);
        return f0VarB.b();
    }
}
