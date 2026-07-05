package j;

import H.O;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class n implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f1658a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f1659b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1660c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1661d;

    /* renamed from: e, reason: collision with root package name */
    public l f1662e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1663f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1664g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1665i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1666j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1667k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f1669m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f1670n;

    /* renamed from: o, reason: collision with root package name */
    public View f1671o;

    /* renamed from: v, reason: collision with root package name */
    public p f1678v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1680x;

    /* renamed from: l, reason: collision with root package name */
    public int f1668l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1672p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1673q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1674r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1675s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f1676t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f1677u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f1679w = false;

    public n(Context context) {
        boolean zF;
        boolean z2 = false;
        this.f1658a = context;
        Resources resources = context.getResources();
        this.f1659b = resources;
        this.f1663f = new ArrayList();
        this.f1664g = new ArrayList();
        this.h = true;
        this.f1665i = new ArrayList();
        this.f1666j = new ArrayList();
        this.f1667k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i2 = O.f332a;
            if (Build.VERSION.SDK_INT >= 28) {
                zF = B.a.f(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zF = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zF) {
                z2 = true;
            }
        }
        this.f1661d = z2;
    }

    public final p a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (y[i6] << 16) | (65535 & i4);
        p pVar = new p(this, i2, i3, i4, i7, charSequence, this.f1668l);
        ArrayList arrayList = this.f1663f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((p) arrayList.get(size)).f1690d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, pVar);
        p(true);
        return pVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f1658a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            p pVarA = a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            pVarA.setIcon(resolveInfo.loadIcon(packageManager));
            pVarA.f1693g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = pVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(z zVar, Context context) {
        this.f1677u.add(new WeakReference(zVar));
        zVar.f(context, this);
        this.f1667k = true;
    }

    public final void c(boolean z2) {
        if (this.f1675s) {
            return;
        }
        this.f1675s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1677u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zVar.a(this, z2);
            }
        }
        this.f1675s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        p pVar = this.f1678v;
        if (pVar != null) {
            d(pVar);
        }
        this.f1663f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f1670n = null;
        this.f1669m = null;
        this.f1671o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(p pVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1677u;
        boolean zD = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f1678v == pVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD = zVar.d(pVar);
                    if (zD) {
                        break;
                    }
                }
            }
            v();
            if (zD) {
                this.f1678v = null;
            }
        }
        return zD;
    }

    public boolean e(n nVar, MenuItem menuItem) {
        l lVar = this.f1662e;
        return lVar != null && lVar.m(nVar, menuItem);
    }

    public boolean f(p pVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1677u;
        boolean zK = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zK = zVar.k(pVar);
                if (zK) {
                    break;
                }
            }
        }
        v();
        if (zK) {
            this.f1678v = pVar;
        }
        return zK;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f1663f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3);
            if (pVar.f1687a == i2) {
                return pVar;
            }
            if (pVar.hasSubMenu() && (menuItemFindItem = pVar.f1700o.findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final p g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f1676t;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (p) arrayList.get(0);
        }
        boolean zN = n();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3);
            char c2 = zN ? pVar.f1695j : pVar.h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zN && c2 == '\b' && i2 == 67))) {
                return pVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f1663f.get(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList2 = this.f1663f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                p pVar = (p) arrayList2.get(i3);
                if (pVar.hasSubMenu()) {
                    pVar.f1700o.h(arrayList, i2, keyEvent);
                }
                char c2 = zN ? pVar.f1695j : pVar.h;
                if ((modifiers & 69647) == ((zN ? pVar.f1696k : pVar.f1694i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (zN && c2 == '\b') {
                            if (i2 == 67) {
                            }
                        }
                    }
                    if (pVar.isEnabled()) {
                        arrayList.add(pVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f1680x) {
            return true;
        }
        ArrayList arrayList = this.f1663f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((p) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f1667k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f1677u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zG = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG |= zVar.g();
                }
            }
            ArrayList arrayList = this.f1665i;
            ArrayList arrayList2 = this.f1666j;
            if (zG) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i2 = 0; i2 < size; i2++) {
                    p pVar = (p) arrayListL.get(i2);
                    if (pVar.f()) {
                        arrayList.add(pVar);
                    } else {
                        arrayList2.add(pVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f1667k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z2 = this.h;
        ArrayList arrayList = this.f1664g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f1663f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            p pVar = (p) arrayList2.get(i2);
            if (pVar.isVisible()) {
                arrayList.add(pVar);
            }
        }
        this.h = false;
        this.f1667k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f1679w;
    }

    public boolean n() {
        return this.f1660c;
    }

    public boolean o() {
        return this.f1661d;
    }

    public final void p(boolean z2) {
        if (this.f1672p) {
            this.f1673q = true;
            if (z2) {
                this.f1674r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.f1667k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1677u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zVar.c();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return q(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        p pVarG = g(i2, keyEvent);
        boolean zQ = pVarG != null ? q(pVarG, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, z zVar, int i2) {
        boolean zExpandActionView;
        p pVar = (p) menuItem;
        if (pVar == null || !pVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = pVar.f1701p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(pVar)) {
            n nVar = pVar.f1699n;
            if (!nVar.e(nVar, pVar)) {
                Intent intent = pVar.f1693g;
                if (intent != null) {
                    try {
                        nVar.f1658a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                } else {
                    q qVar = pVar.f1684A;
                    zExpandActionView = qVar != null && qVar.f1712b.onPerformDefaultAction();
                }
            }
        }
        q qVar2 = pVar.f1684A;
        boolean z2 = qVar2 != null && qVar2.f1712b.hasSubMenu();
        if (pVar.e()) {
            zExpandActionView |= pVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (pVar.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                c(false);
            }
            if (!pVar.hasSubMenu()) {
                SubMenuC0138F subMenuC0138F = new SubMenuC0138F(this.f1658a, this, pVar);
                pVar.f1700o = subMenuC0138F;
                subMenuC0138F.setHeaderTitle(pVar.f1691e);
            }
            SubMenuC0138F subMenuC0138F2 = pVar.f1700o;
            if (z2) {
                u uVar = qVar2.f1713c;
                qVar2.f1712b.onPrepareSubMenu(subMenuC0138F2);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f1677u;
            if (!copyOnWriteArrayList.isEmpty()) {
                zJ = zVar != null ? zVar.j(subMenuC0138F2) : false;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    z zVar2 = (z) weakReference.get();
                    if (zVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zJ) {
                        zJ = zVar2.j(subMenuC0138F2);
                    }
                }
            }
            zExpandActionView |= zJ;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i2 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(z zVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1677u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar2 = (z) weakReference.get();
            if (zVar2 == null || zVar2 == zVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f1663f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((p) arrayList.get(i4)).f1688b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((p) arrayList.get(i4)).f1688b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f1663f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f1663f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((p) arrayList.get(i3)).f1687a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f1663f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f1663f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0138F) item.getSubMenu()).s(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f1663f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3);
            if (pVar.f1688b == i2) {
                pVar.f1709x = (pVar.f1709x & (-5)) | (z3 ? 4 : 0);
                pVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f1679w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f1663f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3);
            if (pVar.f1688b == i2) {
                pVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f1663f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3);
            if (pVar.f1688b == i2) {
                int i4 = pVar.f1709x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                pVar.f1709x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f1660c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f1663f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f1663f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0138F) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        if (view != null) {
            this.f1671o = view;
            this.f1669m = null;
            this.f1670n = null;
        } else {
            if (i2 > 0) {
                this.f1669m = this.f1659b.getText(i2);
            } else if (charSequence != null) {
                this.f1669m = charSequence;
            }
            if (i3 > 0) {
                this.f1670n = this.f1658a.getDrawable(i3);
            } else if (drawable != null) {
                this.f1670n = drawable;
            }
            this.f1671o = null;
        }
        p(false);
    }

    public final void v() {
        this.f1672p = false;
        if (this.f1673q) {
            this.f1673q = false;
            p(this.f1674r);
        }
    }

    public final void w() {
        if (this.f1672p) {
            return;
        }
        this.f1672p = true;
        this.f1673q = false;
        this.f1674r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f1659b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f1659b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        p pVarA = a(i2, i3, i4, charSequence);
        SubMenuC0138F subMenuC0138F = new SubMenuC0138F(this.f1658a, this, pVarA);
        pVarA.f1700o = subMenuC0138F;
        subMenuC0138F.setHeaderTitle(pVarA.f1691e);
        return subMenuC0138F;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f1659b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f1659b.getString(i5));
    }

    public n k() {
        return this;
    }
}
