package Z;

import htb.d3vnu11.securenotes.MainActivity;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f723a;

    public /* synthetic */ p(MainActivity mainActivity) {
        this.f723a = mainActivity;
    }

    public void a(String str) {
        this.f723a.runOnUiThread(new E.a(this, str, 7, false));
    }

    @Override // Z.h
    public void h(boolean z2) {
        MainActivity mainActivity = this.f723a;
        mainActivity.showLoadingState(false);
        if (z2) {
            mainActivity.loginButton.setText("Logout (" + ((String) mainActivity.accountManager.f705c.f271b) + ")");
            mainActivity.loginButton.setOnClickListener(new q(0, this));
        } else {
            mainActivity.updateLoginButton();
        }
        mainActivity.loadNotes();
    }
}
