package E;

import H.E;
import H.N;
import H.S;
import M.B;
import M.y;
import M.z;
import Z.r;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import g.C;
import g.s;
import htb.d3vnu11.securenotes.EditNoteActivity;
import i.AbstractC0120b;
import i.InterfaceC0119a;
import java.io.IOException;
import java.util.Locale;
import java.util.WeakHashMap;
import org.conscrypt.ct.CTConstants;
import org.xmlpull.v1.XmlPullParserException;
import u0.u;
import v.C0252b;

/* loaded from: classes.dex */
public final class c implements M.p, u0.d, InterfaceC0119a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270a;

    /* renamed from: b, reason: collision with root package name */
    public Object f271b;

    /* renamed from: c, reason: collision with root package name */
    public Object f272c;

    @Override // i.InterfaceC0119a
    public boolean a(AbstractC0120b abstractC0120b, MenuItem menuItem) {
        return ((InterfaceC0119a) this.f271b).a(abstractC0120b, menuItem);
    }

    @Override // i.InterfaceC0119a
    public boolean b(AbstractC0120b abstractC0120b, j.n nVar) {
        ViewGroup viewGroup = ((C) this.f272c).f1305A;
        WeakHashMap weakHashMap = N.f327a;
        E.c(viewGroup);
        return ((InterfaceC0119a) this.f271b).b(abstractC0120b, nVar);
    }

    @Override // i.InterfaceC0119a
    public boolean c(AbstractC0120b abstractC0120b, j.n nVar) {
        return ((InterfaceC0119a) this.f271b).c(abstractC0120b, nVar);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [g.k, java.lang.Object] */
    @Override // i.InterfaceC0119a
    public void d(AbstractC0120b abstractC0120b) {
        ((InterfaceC0119a) this.f271b).d(abstractC0120b);
        C c2 = (C) this.f272c;
        if (c2.f1350w != null) {
            c2.f1339l.getDecorView().removeCallbacks(c2.f1351x);
        }
        if (c2.f1349v != null) {
            S s2 = c2.y;
            if (s2 != null) {
                s2.b();
            }
            S sA = N.a(c2.f1349v);
            sA.a(0.0f);
            c2.y = sA;
            sA.d(new s(2, this));
        }
        c2.f1341n.onSupportActionModeFinished(c2.f1348u);
        c2.f1348u = null;
        ViewGroup viewGroup = c2.f1305A;
        WeakHashMap weakHashMap = N.f327a;
        E.c(viewGroup);
        c2.J();
    }

    public void e(String str) {
        ((EditNoteActivity) this.f272c).runOnUiThread(new M.l(this, str, (r) this.f271b, 1));
    }

    public void f(j jVar) {
        int i2 = jVar.f291b;
        o oVar = (o) this.f272c;
        A.f fVar = (A.f) this.f271b;
        if (i2 == 0) {
            oVar.execute(new a(fVar, jVar.f290a, 0));
        } else {
            oVar.execute(new b(fVar, i2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x022b, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        v.i iVarC;
        char c2;
        v.n nVar = new v.n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlResourceParser.getAttributeName(i2);
            String attributeValue = xmlResourceParser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    iVarC = null;
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (XmlPullParserException e3) {
                    e3.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c3 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c3 = 6;
                                        break;
                                    } else {
                                        c3 = 65535;
                                        break;
                                    }
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c3 = 7;
                                        break;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c3 = 1;
                                        break;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c3 = 4;
                                        break;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c3 = 5;
                                        break;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c3 = 2;
                                        break;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c3 = 0;
                                        break;
                                    }
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    iVarC = v.n.c(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    iVarC = v.n.c(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    iVarC = v.n.c(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVarC.f2697d.f2727a = true;
                                    break;
                                case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
                                    iVarC = v.n.c(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVarC.f2697d.h0 = 1;
                                    break;
                                case 4:
                                    if (iVarC == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVarC.f2695b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (iVarC == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVarC.f2698e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (iVarC == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVarC.f2697d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (iVarC == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVarC.f2696c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case CTConstants.TIMESTAMP_LENGTH /* 8 */:
                                case '\t':
                                    if (iVarC == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0252b.a(context, xmlResourceParser, iVarC.f2699f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c2 = 3;
                                        break;
                                    } else {
                                        c2 = 65535;
                                        break;
                                    }
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                ((SparseArray) this.f272c).put(identifier, nVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                nVar.f2795c.put(Integer.valueOf(iVarC.f2694a), iVarC);
                                iVarC = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f272c).put(identifier, nVar);
                return;
            }
        }
    }

    @Override // M.p
    public Object i() {
        return (B) this.f271b;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // u0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(u uVar) {
        boolean z2;
        J0.c cVar;
        final Z.h hVar;
        Z.i iVar = (Z.i) this.f272c;
        final boolean z3 = false;
        iVar.f706d.set(false);
        if (uVar.h()) {
            try {
                cVar = new J0.c(uVar.f2572g.j());
            } catch (J0.b e2) {
                e = e2;
                z2 = false;
            }
            if (cVar.f474a.containsKey("success") && cVar.d()) {
                z2 = true;
                iVar.f707e.set(true);
                try {
                    Log.d("AccountManager", "Token verified successfully");
                } catch (J0.b e3) {
                    e = e3;
                    iVar.f707e.set(false);
                    Log.e("AccountManager", "Token verification failed: JSON parsing error", e);
                    z3 = z2;
                    hVar = (Z.h) this.f271b;
                    if (hVar == null) {
                    }
                }
                z3 = z2;
            } else {
                iVar.f707e.set(false);
                Log.d("AccountManager", "Token verification failed: Server returned unsuccessful");
                iVar.c();
            }
        } else {
            iVar.f707e.set(false);
            Log.d("AccountManager", "Token verification failed: " + uVar.f2569d);
            iVar.c();
        }
        hVar = (Z.h) this.f271b;
        if (hVar == null) {
            iVar.f709g.post(new Runnable() { // from class: Z.g
                @Override // java.lang.Runnable
                public final void run() {
                    hVar.h(z3);
                }
            });
        }
    }

    public String toString() {
        switch (this.f270a) {
            case 7:
                String str = "[ ";
                if (((q.g) this.f271b) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((q.g) this.f271b).h[i2] + " ";
                    }
                }
                return str + "] " + ((q.g) this.f271b);
            default:
                return super.toString();
        }
    }

    @Override // M.p
    public boolean u(CharSequence charSequence, int i2, int i3, y yVar) {
        if ((yVar.f581c & 4) > 0) {
            return true;
        }
        if (((B) this.f271b) == null) {
            this.f271b = new B(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((A.m) this.f272c).getClass();
        ((B) this.f271b).setSpan(new z(yVar), i2, i3, 33);
        return true;
    }

    @Override // u0.d
    public void w(IOException iOException) {
        Z.i iVar = (Z.i) this.f272c;
        iVar.f706d.set(false);
        iVar.f707e.set(false);
        Log.e("AccountManager", "Token verification failed due to network error: " + iOException.getMessage());
        Z.h hVar = (Z.h) this.f271b;
        if (hVar != null) {
            iVar.f709g.post(new Z.a(hVar, 2));
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, int i2) {
        this.f270a = i2;
        this.f271b = obj;
        this.f272c = obj2;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i2, boolean z2) {
        this.f270a = i2;
        this.f272c = obj;
        this.f271b = obj2;
    }

    public c(q.e eVar) {
        this.f270a = 7;
        this.f272c = eVar;
    }

    public c(EditText editText) {
        this.f270a = 2;
        this.f271b = editText;
        O.i iVar = new O.i(editText);
        this.f272c = iVar;
        editText.addTextChangedListener(iVar);
        if (O.a.f588b == null) {
            synchronized (O.a.f587a) {
                try {
                    if (O.a.f588b == null) {
                        O.a aVar = new O.a();
                        try {
                            O.a.f589c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, O.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        O.a.f588b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(O.a.f588b);
    }
}
