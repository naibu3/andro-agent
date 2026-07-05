package com.stripe.android.financialconnections.features.notice;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.ConnectedAccessNotice;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.DataAccessNoticeBody;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.LegalDetailsBody;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.model.ServerLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: NoticeSheetPreviewParameterProvider.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "legal", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;", "dataAccess", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;", "dataAccessWithConnectedAccounts", "legalDetails", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "dataAccessNotice", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "bullets", "", "Lcom/stripe/android/financialconnections/model/Bullet;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NoticeSheetPreviewParameterProvider implements PreviewParameterProvider<NoticeSheetState.NoticeSheetContent> {
    public static final int $stable = 8;
    private final Sequence<NoticeSheetState.NoticeSheetContent> values = SequencesKt.sequenceOf(legal(), dataAccess(), dataAccessWithConnectedAccounts());

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<NoticeSheetState.NoticeSheetContent> getValues() {
        return this.values;
    }

    private final NoticeSheetState.NoticeSheetContent.Legal legal() {
        return new NoticeSheetState.NoticeSheetContent.Legal(legalDetails());
    }

    private final NoticeSheetState.NoticeSheetContent.DataAccess dataAccess() {
        return new NoticeSheetState.NoticeSheetContent.DataAccess(DataAccessNotice.copy$default(dataAccessNotice(), null, null, null, null, null, null, null, 111, null));
    }

    private final NoticeSheetState.NoticeSheetContent.DataAccess dataAccessWithConnectedAccounts() {
        return new NoticeSheetState.NoticeSheetContent.DataAccess(dataAccessNotice());
    }

    private final LegalDetailsNotice legalDetails() {
        return new LegalDetailsNotice(new Image("https://www.cdn.stripe.com/12321312321.png"), "Terms and privacy policy", "Stripe only uses your data and credentials as described in the Terms, such as to improve its services, manage loss, and mitigate fraud.", new LegalDetailsBody(CollectionsKt.listOf((Object[]) new ServerLink[]{new ServerLink("Terms", (String) null, 2, (DefaultConstructorMarker) null), new ServerLink("Privacy Policy", (String) null, 2, (DefaultConstructorMarker) null)})), "OK", "Learn more");
    }

    private final DataAccessNotice dataAccessNotice() {
        return new DataAccessNotice(new Image("https://www.cdn.stripe.com/12321312321.png"), "Goldilocks uses Stripe to link your accounts", "Goldilocks will use your account and routing number, balances and transactions:", new DataAccessNoticeBody(bullets()), new ConnectedAccessNotice("Connected account placeholder", new DataAccessNoticeBody(bullets())), "Learn more about data access", "OK");
    }

    private final List<Bullet> bullets() {
        return CollectionsKt.listOf((Object[]) new Bullet[]{new Bullet(null, new Image("https://www.cdn.stripe.com/12321312321.png"), "Account details"), new Bullet(null, new Image("https://www.cdn.stripe.com/12321312321.png"), "Balances"), new Bullet(null, new Image("https://www.cdn.stripe.com/12321312321.png"), "Transactions")});
    }
}
