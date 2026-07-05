package O;

import A.m;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f590a;

    /* renamed from: b, reason: collision with root package name */
    public final m f591b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        m mVar = new m(9);
        super(inputConnection, false);
        this.f590a = editText;
        this.f591b = mVar;
        if (M.j.f533k != null) {
            M.j jVarA = M.j.a();
            if (jVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            M.f fVar = jVarA.f538e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            N.b bVar = (N.b) fVar.f529c.f570a;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f319d).getInt(iA + bVar.f316a) : 0);
            Bundle bundle2 = editorInfo.extras;
            fVar.f527a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        Editable editableText = this.f590a.getEditableText();
        this.f591b.getClass();
        return m.g(this, editableText, i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        Editable editableText = this.f590a.getEditableText();
        this.f591b.getClass();
        return m.g(this, editableText, i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
