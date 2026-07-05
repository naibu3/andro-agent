package com.stripe.android.financialconnections.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: MarkdownParser.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R,\u0010\b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/utils/MarkdownParser;", "", "<init>", "()V", "REGEX_BOLD_ASTERISKS", "", "REGEX_BOLD_UNDERSCORES", "REGEX_LINK", "markDownToHtmlRegex", "", "Lkotlin/Pair;", "Lkotlin/text/Regex;", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "", "toHtml", TypedValues.Custom.S_STRING, "toHtml$financial_connections_release", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MarkdownParser {
    public static final MarkdownParser INSTANCE = new MarkdownParser();
    private static final String REGEX_BOLD_ASTERISKS = "\\*\\*(.*?)\\*\\*";
    private static final String REGEX_BOLD_UNDERSCORES = "__([^_]+)__";
    private static final String REGEX_LINK = "\\[([^]]+)]\\(([^)]+)\\)";
    private static final List<Pair<Regex, Function1<MatchResult, CharSequence>>> markDownToHtmlRegex = kotlin.collections.CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(new Regex(REGEX_BOLD_ASTERISKS), new Function1() { // from class: com.stripe.android.financialconnections.utils.MarkdownParser$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return MarkdownParser.markDownToHtmlRegex$lambda$0((MatchResult) obj);
        }
    }), TuplesKt.to(new Regex(REGEX_BOLD_UNDERSCORES), new Function1() { // from class: com.stripe.android.financialconnections.utils.MarkdownParser$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return MarkdownParser.markDownToHtmlRegex$lambda$1((MatchResult) obj);
        }
    }), TuplesKt.to(new Regex(REGEX_LINK), new Function1() { // from class: com.stripe.android.financialconnections.utils.MarkdownParser$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return MarkdownParser.markDownToHtmlRegex$lambda$2((MatchResult) obj);
        }
    })});
    public static final int $stable = 8;

    private MarkdownParser() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markDownToHtmlRegex$lambda$0(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "<b>" + ((Object) it.getGroupValues().get(1)) + "</b>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence markDownToHtmlRegex$lambda$1(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "<b>" + ((Object) it.getGroupValues().get(1)) + "</b>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence markDownToHtmlRegex$lambda$2(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "<a href=\"" + ((Object) it.getGroupValues().get(2)) + "\">" + ((Object) it.getGroupValues().get(1)) + "</a>";
    }

    public final String toHtml$financial_connections_release(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Iterator<T> it = markDownToHtmlRegex.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            string = ((Regex) pair.component1()).replace(string, (Function1<? super MatchResult, ? extends CharSequence>) pair.component2());
        }
        return string;
    }
}
