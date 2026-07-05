package Z;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import htb.d3vnu11.securenotes.EditNoteActivity;
import htb.d3vnu11.securenotes.LoginActivity;
import htb.d3vnu11.securenotes.MainActivity;
import org.conscrypt.ct.CTConstants;

/* loaded from: classes.dex */
public final class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f720b;

    public /* synthetic */ n(MainActivity mainActivity, int i2) {
        this.f719a = i2;
        this.f720b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f719a) {
            case 0:
                MainActivity mainActivity = this.f720b;
                if (!mainActivity.accountManager.b() && mainActivity.noteManager.d().size() >= 3) {
                    Toast.makeText(mainActivity, "Please log in to create more notes", 1).show();
                    break;
                } else {
                    mainActivity.startActivityForResult(new Intent(mainActivity, (Class<?>) EditNoteActivity.class), 2);
                    break;
                }
            case 1:
                this.f720b.showServerConfigDialog();
                break;
            case 2:
                MainActivity mainActivity2 = this.f720b;
                mainActivity2.accountManager.c();
                mainActivity2.updateLoginButton();
                mainActivity2.loadNotes();
                break;
            case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
                MainActivity mainActivity3 = this.f720b;
                mainActivity3.showLoadingState(true);
                mainActivity3.accountManager.f(new A.f(12, this));
                break;
            default:
                MainActivity mainActivity4 = this.f720b;
                mainActivity4.startActivityForResult(new Intent(mainActivity4, (Class<?>) LoginActivity.class), 1);
                break;
        }
    }
}
