package Z;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import htb.d3vnu11.securenotes.EditNoteActivity;
import java.util.UUID;
import k.C0213z;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditNoteActivity f711b;

    public /* synthetic */ j(EditNoteActivity editNoteActivity, int i2) {
        this.f710a = i2;
        this.f711b = editNoteActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        switch (this.f710a) {
            case 0:
                EditNoteActivity editNoteActivity = this.f711b;
                String strTrim = editNoteActivity.f1485a.getText().toString().trim();
                String strTrim2 = editNoteActivity.f1486b.getText().toString().trim();
                CheckBox checkBox = editNoteActivity.f1492i;
                boolean zIsChecked = checkBox != null ? checkBox.isChecked() : false;
                if (!strTrim.isEmpty()) {
                    if (editNoteActivity.h) {
                        editNoteActivity.f1489e.getClass();
                        string = UUID.randomUUID().toString();
                    } else {
                        string = editNoteActivity.f1491g;
                    }
                    r rVar = new r(string, strTrim, strTrim2, zIsChecked);
                    if (zIsChecked && !editNoteActivity.f1490f.b()) {
                        Toast.makeText(editNoteActivity, "Please register or login to save notes to the cloud", 1).show();
                        if (!editNoteActivity.f1489e.f(rVar)) {
                            Toast.makeText(editNoteActivity, "Error saving note", 0).show();
                            break;
                        } else {
                            Toast.makeText(editNoteActivity, "Note saved locally instead", 0).show();
                            editNoteActivity.setResult(-1);
                            editNoteActivity.finish();
                            break;
                        }
                    } else if (!zIsChecked || !editNoteActivity.f1490f.b()) {
                        if (!editNoteActivity.f1489e.f(rVar)) {
                            Toast.makeText(editNoteActivity, "Error saving note", 0).show();
                            break;
                        } else {
                            Toast.makeText(editNoteActivity, "Note saved locally", 0).show();
                            editNoteActivity.setResult(-1);
                            editNoteActivity.finish();
                            break;
                        }
                    } else {
                        E.c cVar = editNoteActivity.f1490f.f705c;
                        if (cVar != null) {
                            Log.d("EditNoteActivity", "Attempting to save with token: ".concat((String) cVar.f272c));
                        } else {
                            Log.d("EditNoteActivity", "Current user is null!");
                        }
                        u uVar = editNoteActivity.f1489e;
                        E.c cVar2 = new E.c(editNoteActivity, rVar, 4, false);
                        if (!uVar.e()) {
                            cVar2.e("Server not configured");
                            break;
                        } else {
                            i iVar = uVar.f734c;
                            if (!iVar.b()) {
                                cVar2.e("User not logged in");
                                break;
                            } else {
                                E.c cVar3 = iVar.f705c;
                                String str = uVar.f735d + "/notes";
                                try {
                                    J0.c cVar4 = new J0.c();
                                    cVar4.h(string, "id");
                                    cVar4.h(strTrim, "title");
                                    cVar4.h(strTrim2, "content");
                                    C0213z c0213zB = C0213z.b(u.f731e, cVar4.toString());
                                    u0.s sVar = new u0.s();
                                    sVar.d(str);
                                    sVar.b("Authorization", "Bearer ".concat((String) cVar3.f272c));
                                    sVar.c("POST", c0213zB);
                                    B0.h hVarA = sVar.a();
                                    u0.q qVar = uVar.f733b;
                                    qVar.getClass();
                                    new y0.h(qVar, hVarA).e(new A.f(17, cVar2));
                                    break;
                                } catch (J0.b unused) {
                                    cVar2.e("Error preparing request");
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    Toast.makeText(editNoteActivity, "Title cannot be empty", 0).show();
                    break;
                }
                break;
            default:
                this.f711b.finish();
                break;
        }
    }
}
