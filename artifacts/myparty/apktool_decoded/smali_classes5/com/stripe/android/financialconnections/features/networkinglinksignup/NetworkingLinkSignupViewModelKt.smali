.class public final Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModelKt;
.super Ljava/lang/Object;
.source "NetworkingLinkSignupViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toContent",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;",
        "Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;",
        "Lcom/stripe/android/financialconnections/model/LinkLoginPane;",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toContent(Lcom/stripe/android/financialconnections/model/LinkLoginPane;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 415
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;

    .line 416
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/LinkLoginPane;->getTitle()Ljava/lang/String;

    move-result-object v2

    .line 417
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/LinkLoginPane;->getBody()Ljava/lang/String;

    move-result-object v3

    .line 418
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 419
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/LinkLoginPane;->getAboveCta()Ljava/lang/String;

    move-result-object v5

    .line 420
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/LinkLoginPane;->getCta()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 415
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V

    return-object v1
.end method

.method public static final toContent(Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 403
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;

    .line 404
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->getTitle()Ljava/lang/String;

    move-result-object v2

    .line 406
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->getBody()Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;->getBullets()Ljava/util/List;

    move-result-object v4

    .line 407
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->getAboveCta()Ljava/lang/String;

    move-result-object v5

    .line 408
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->getCta()Ljava/lang/String;

    move-result-object v6

    .line 409
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->getSkipCta()Ljava/lang/String;

    move-result-object v7

    .line 410
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->getLegalDetailsNotice()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    move-result-object v8

    const/4 v3, 0x0

    .line 403
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V

    return-object v1
.end method
