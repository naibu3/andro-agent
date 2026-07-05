package com.qonversion.android.sdk.internal.dto.automations;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Screen.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "", "id", "", ScreenActivity.INTENT_HTML_PAGE, "lang", "background", "obj", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackground", "()Ljava/lang/String;", "getHtmlPage", "getId", "getLang", "getObj", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class Screen {
    private final String background;
    private final String htmlPage;
    private final String id;
    private final String lang;
    private final String obj;

    public static /* synthetic */ Screen copy$default(Screen screen, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = screen.id;
        }
        if ((i & 2) != 0) {
            str2 = screen.htmlPage;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = screen.lang;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = screen.background;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = screen.obj;
        }
        return screen.copy(str, str6, str7, str8, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHtmlPage() {
        return this.htmlPage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackground() {
        return this.background;
    }

    /* renamed from: component5, reason: from getter */
    public final String getObj() {
        return this.obj;
    }

    public final Screen copy(@Json(name = "id") String id, @Json(name = "body") String htmlPage, @Json(name = "lang") String lang, @Json(name = "background") String background, @Json(name = "object") String obj) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(htmlPage, "htmlPage");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(obj, "obj");
        return new Screen(id, htmlPage, lang, background, obj);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Screen)) {
            return false;
        }
        Screen screen = (Screen) other;
        return Intrinsics.areEqual(this.id, screen.id) && Intrinsics.areEqual(this.htmlPage, screen.htmlPage) && Intrinsics.areEqual(this.lang, screen.lang) && Intrinsics.areEqual(this.background, screen.background) && Intrinsics.areEqual(this.obj, screen.obj);
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.htmlPage.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.background.hashCode()) * 31) + this.obj.hashCode();
    }

    public String toString() {
        return "Screen(id=" + this.id + ", htmlPage=" + this.htmlPage + ", lang=" + this.lang + ", background=" + this.background + ", obj=" + this.obj + ")";
    }

    public Screen(@Json(name = "id") String id, @Json(name = "body") String htmlPage, @Json(name = "lang") String lang, @Json(name = "background") String background, @Json(name = "object") String obj) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(htmlPage, "htmlPage");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.id = id;
        this.htmlPage = htmlPage;
        this.lang = lang;
        this.background = background;
        this.obj = obj;
    }

    public final String getId() {
        return this.id;
    }

    public final String getHtmlPage() {
        return this.htmlPage;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getBackground() {
        return this.background;
    }

    public final String getObj() {
        return this.obj;
    }
}
