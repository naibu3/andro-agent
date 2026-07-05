package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u000b*\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"DEBUG_CLASS", "", "hasFlag", "", "bits", "", "flag", "asExecutor", "Ljava/util/concurrent/Executor;", "Landroid/view/Choreographer;", "update", "", "Landroid/view/inputmethod/EditorInfo;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "updateWithEmojiCompat", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        int i = 6;
        if (ImeAction.m5767equalsimpl0(imeAction, ImeAction.INSTANCE.m5780getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (ImeAction.m5767equalsimpl0(imeAction, ImeAction.INSTANCE.m5784getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m5767equalsimpl0(imeAction, ImeAction.INSTANCE.m5782getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m5767equalsimpl0(imeAction, ImeAction.INSTANCE.m5783getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m5767equalsimpl0(imeAction, ImeAction.INSTANCE.m5785getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m5767equalsimpl0(imeAction, ImeAction.INSTANCE.m5786getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m5767equalsimpl0(imeAction, ImeAction.INSTANCE.m5787getSendeUduSuo())) {
            i = 4;
        } else if (!ImeAction.m5767equalsimpl0(imeAction, ImeAction.INSTANCE.m5781getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int keyboardType = imeOptions.getKeyboardType();
        if (KeyboardType.m5820equalsimpl0(keyboardType, KeyboardType.INSTANCE.m5841getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m5820equalsimpl0(keyboardType, KeyboardType.INSTANCE.m5834getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m5820equalsimpl0(keyboardType, KeyboardType.INSTANCE.m5837getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m5820equalsimpl0(keyboardType, KeyboardType.INSTANCE.m5840getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m5820equalsimpl0(keyboardType, KeyboardType.INSTANCE.m5843getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m5820equalsimpl0(keyboardType, KeyboardType.INSTANCE.m5836getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m5820equalsimpl0(keyboardType, KeyboardType.INSTANCE.m5839getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m5820equalsimpl0(keyboardType, KeyboardType.INSTANCE.m5838getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m5820equalsimpl0(keyboardType, KeyboardType.INSTANCE.m5835getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m5767equalsimpl0(imeOptions.getImeAction(), ImeAction.INSTANCE.m5780getDefaulteUduSuo())) {
                editorInfo.imeOptions |= BasicMeasure.EXACTLY;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            if (KeyboardCapitalization.m5803equalsimpl0(capitalization, KeyboardCapitalization.INSTANCE.m5812getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m5803equalsimpl0(capitalization, KeyboardCapitalization.INSTANCE.m5816getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m5803equalsimpl0(capitalization, KeyboardCapitalization.INSTANCE.m5814getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m5602getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m5597getEndimpl(textFieldValue.getSelection());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    public static final Executor asExecutor(final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$2(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$2(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
