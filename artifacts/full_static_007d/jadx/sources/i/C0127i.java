package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import f.AbstractC0101a;
import j.q;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import k.AbstractC0191n0;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: i.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127i extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f1556e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1557f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1558a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1559b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1560c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1561d;

    static {
        Class[] clsArr = {Context.class};
        f1556e = clsArr;
        f1557f = clsArr;
    }

    public C0127i(Context context) {
        super(context);
        this.f1560c = context;
        Object[] objArr = {context};
        this.f1558a = objArr;
        this.f1559b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ?? r4;
        int i2;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        C0126h c0126h = new C0126h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType != 3) {
                    z2 = r4;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        z2 = r4;
                        z4 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            c0126h.f1533b = 0;
                            c0126h.f1534c = 0;
                            c0126h.f1535d = 0;
                            c0126h.f1536e = 0;
                            c0126h.f1537f = r4;
                            c0126h.f1538g = r4;
                        } else if (name2.equals("item")) {
                            if (!c0126h.h) {
                                q qVar = c0126h.f1555z;
                                if (qVar == null || !qVar.f1712b.hasSubMenu()) {
                                    c0126h.h = r4;
                                    c0126h.b(c0126h.f1532a.add(c0126h.f1533b, c0126h.f1539i, c0126h.f1540j, c0126h.f1541k));
                                } else {
                                    c0126h.h = r4;
                                    c0126h.b(c0126h.f1532a.addSubMenu(c0126h.f1533b, c0126h.f1539i, c0126h.f1540j, c0126h.f1541k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z2 = r4;
                            z3 = z2;
                        }
                        z2 = r4;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = z2;
                i2 = 2;
                z4 = z4;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    C0127i c0127i = c0126h.f1531E;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = c0127i.f1560c.obtainStyledAttributes(attributeSet, AbstractC0101a.f1276p);
                        c0126h.f1533b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                        c0126h.f1534c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c0126h.f1535d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c0126h.f1536e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c0126h.f1537f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                        c0126h.f1538g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0127i.f1560c;
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0101a.f1277q);
                            c0126h.f1539i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            c0126h.f1540j = (typedArrayObtainStyledAttributes2.getInt(5, c0126h.f1534c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c0126h.f1535d) & 65535);
                            c0126h.f1541k = typedArrayObtainStyledAttributes2.getText(7);
                            c0126h.f1542l = typedArrayObtainStyledAttributes2.getText(8);
                            c0126h.f1543m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            c0126h.f1544n = string == null ? (char) 0 : string.charAt(0);
                            c0126h.f1545o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            c0126h.f1546p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0126h.f1547q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                c0126h.f1548r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0126h.f1548r = c0126h.f1536e;
                            }
                            c0126h.f1549s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            c0126h.f1550t = typedArrayObtainStyledAttributes2.getBoolean(4, c0126h.f1537f);
                            c0126h.f1551u = typedArrayObtainStyledAttributes2.getBoolean(1, c0126h.f1538g);
                            c0126h.f1552v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            c0126h.y = typedArrayObtainStyledAttributes2.getString(12);
                            c0126h.f1553w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            c0126h.f1554x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && c0126h.f1553w == 0 && c0126h.f1554x == null) {
                                c0126h.f1555z = (q) c0126h.a(string3, f1557f, c0127i.f1559b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c0126h.f1555z = null;
                            }
                            c0126h.f1527A = typedArrayObtainStyledAttributes2.getText(17);
                            c0126h.f1528B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                c0126h.f1530D = AbstractC0191n0.b(typedArrayObtainStyledAttributes2.getInt(19, -1), c0126h.f1530D);
                            } else {
                                c0126h.f1530D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = C0.d.t(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                c0126h.f1529C = colorStateList;
                            } else {
                                c0126h.f1529C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            c0126h.h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c0126h.h = true;
                            SubMenu subMenuAddSubMenu = c0126h.f1532a.addSubMenu(c0126h.f1533b, c0126h.f1539i, c0126h.f1540j, c0126h.f1541k);
                            c0126h.b(subMenuAddSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                        } else {
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        i2 = 2;
                        z4 = z4;
                    }
                }
                z2 = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z2;
            i2 = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof j.n)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z2 = false;
        try {
            try {
                layout = this.f1560c.getResources().getLayout(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof j.n) {
                    j.n nVar = (j.n) menu;
                    if (!nVar.f1672p) {
                        nVar.w();
                        z2 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z2) {
                    ((j.n) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((j.n) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
