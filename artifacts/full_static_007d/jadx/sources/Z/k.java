package Z;

import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import htb.d3vnu11.securenotes.LoginActivity;
import k.C0213z;

/* loaded from: classes.dex */
public final class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f713b;

    public /* synthetic */ k(LoginActivity loginActivity, int i2) {
        this.f712a = i2;
        this.f713b = loginActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f712a) {
            case 0:
                LoginActivity loginActivity = this.f713b;
                if (LoginActivity.e(loginActivity)) {
                    String strTrim = loginActivity.f1493a.getText().toString().trim();
                    String strTrim2 = loginActivity.f1494b.getText().toString().trim();
                    boolean z2 = false;
                    if (strTrim.isEmpty() || strTrim2.isEmpty()) {
                        Toast.makeText(loginActivity, "Please enter email and password", 0).show();
                        break;
                    } else {
                        loginActivity.h.setVisibility(0);
                        loginActivity.f1497e.setEnabled(false);
                        loginActivity.f1498f.setEnabled(false);
                        loginActivity.f1499g.setEnabled(false);
                        i iVar = loginActivity.f1500i;
                        l lVar = new l(loginActivity, 0);
                        String str = iVar.f708f;
                        if (str != null && !str.isEmpty()) {
                            z2 = true;
                        }
                        Handler handler = iVar.f709g;
                        if (!z2) {
                            handler.post(new d(lVar, 0));
                            break;
                        } else {
                            try {
                                J0.c cVar = new J0.c();
                                cVar.h(strTrim, "email");
                                cVar.h(strTrim2, "password");
                                C0213z c0213zB = C0213z.b(i.h, cVar.toString());
                                u0.s sVar = new u0.s();
                                sVar.d(iVar.f708f + "/auth/login");
                                sVar.c("POST", c0213zB);
                                B0.h hVarA = sVar.a();
                                u0.q qVar = iVar.f704b;
                                qVar.getClass();
                                new y0.h(qVar, hVarA).e(new D0.h(iVar, lVar, strTrim, 4, false));
                                break;
                            } catch (J0.b unused) {
                                handler.post(new d(lVar, 1));
                                return;
                            }
                        }
                    }
                }
                break;
            case 1:
                LoginActivity loginActivity2 = this.f713b;
                if (LoginActivity.e(loginActivity2)) {
                    String strTrim3 = loginActivity2.f1493a.getText().toString().trim();
                    String strTrim4 = loginActivity2.f1494b.getText().toString().trim();
                    boolean z3 = false;
                    if (strTrim3.isEmpty() || strTrim4.isEmpty()) {
                        Toast.makeText(loginActivity2, "Please enter email and password", 0).show();
                        break;
                    } else {
                        loginActivity2.h.setVisibility(0);
                        loginActivity2.f1497e.setEnabled(false);
                        loginActivity2.f1498f.setEnabled(false);
                        loginActivity2.f1499g.setEnabled(false);
                        i iVar2 = loginActivity2.f1500i;
                        l lVar2 = new l(loginActivity2, 1);
                        String str2 = iVar2.f708f;
                        if (str2 != null && !str2.isEmpty()) {
                            z3 = true;
                        }
                        Handler handler2 = iVar2.f709g;
                        if (!z3) {
                            handler2.post(new e(lVar2, 0));
                            break;
                        } else {
                            try {
                                J0.c cVar2 = new J0.c();
                                cVar2.h(strTrim3, "email");
                                cVar2.h(strTrim4, "password");
                                C0213z c0213zB2 = C0213z.b(i.h, cVar2.toString());
                                u0.s sVar2 = new u0.s();
                                sVar2.d(iVar2.f708f + "/auth/register");
                                sVar2.c("POST", c0213zB2);
                                B0.h hVarA2 = sVar2.a();
                                u0.q qVar2 = iVar2.f704b;
                                qVar2.getClass();
                                new y0.h(qVar2, hVarA2).e(new D0.h(iVar2, lVar2, strTrim3, 5, false));
                                break;
                            } catch (J0.b unused2) {
                                handler2.post(new e(lVar2, 1));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                LoginActivity loginActivity3 = this.f713b;
                loginActivity3.f1501j = !loginActivity3.f1501j;
                loginActivity3.f();
                break;
        }
    }
}
