.class public final Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;
.super Ljava/lang/Object;
.source "NetworkingLinkSignupPreviewParameterProvider.kt"

# interfaces
.implements Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider<",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\t\u001a\u00020\u0002H\u0002J\u0008\u0010\n\u001a\u00020\u0002H\u0002J\u0008\u0010\u000b\u001a\u00020\u0002H\u0002J\u0008\u0010\u000c\u001a\u00020\u0002H\u0002J\u0008\u0010\r\u001a\u00020\u000eH\u0002J\u0008\u0010\u000f\u001a\u00020\u000eH\u0002R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;",
        "<init>",
        "()V",
        "values",
        "Lkotlin/sequences/Sequence;",
        "getValues",
        "()Lkotlin/sequences/Sequence;",
        "default",
        "emailEntered",
        "invalidEmail",
        "instantDebits",
        "networkingLinkSignupPane",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;",
        "linkLoginPane",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final values:Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 17
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;->default()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 18
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;->emailEntered()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 19
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;->invalidEmail()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 20
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;->instantDebits()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object v2

    aput-object v2, v0, v1

    .line 16
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-void
.end method

.method private final default()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 13

    .line 24
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 25
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    .line 27
    sget-object v2, Lcom/stripe/android/uicore/elements/EmailConfig;->Companion:Lcom/stripe/android/uicore/elements/EmailConfig$Companion;

    const/4 v3, 0x2

    const/4 v4, 0x0

    const-string v5, ""

    const/4 v6, 0x0

    invoke-static {v2, v5, v6, v3, v4}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;->createController$default(Lcom/stripe/android/uicore/elements/EmailConfig$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v3

    .line 30
    sget-object v4, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    const/16 v10, 0x1c

    const/4 v11, 0x0

    const-string v5, ""

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v6

    .line 35
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;->networkingLinkSignupPane()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;

    move-result-object v8

    .line 36
    const-string v9, "fcsess_1234"

    .line 25
    const-string v2, "Test"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;-><init>(Ljava/lang/String;Lcom/stripe/android/uicore/elements/SimpleTextFieldController;ZLjava/lang/String;Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;Ljava/lang/String;)V

    .line 24
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    .line 41
    sget-object v1, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    .line 42
    sget-object v2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    .line 23
    new-instance v3, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    .line 24
    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 42
    move-object v7, v2

    check-cast v7, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 41
    move-object v8, v1

    check-cast v8, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v11, 0x60

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 23
    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private final emailEntered()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 13

    .line 46
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 47
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    .line 49
    sget-object v2, Lcom/stripe/android/uicore/elements/EmailConfig;->Companion:Lcom/stripe/android/uicore/elements/EmailConfig$Companion;

    const/4 v3, 0x2

    const/4 v4, 0x0

    const-string v5, "valid@email.com"

    const/4 v6, 0x0

    invoke-static {v2, v5, v6, v3, v4}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;->createController$default(Lcom/stripe/android/uicore/elements/EmailConfig$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v3

    .line 52
    sget-object v4, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    const/16 v10, 0x1c

    const/4 v11, 0x0

    const-string v5, ""

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v6

    .line 57
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;->networkingLinkSignupPane()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;

    move-result-object v8

    .line 58
    const-string v9, "fcsess_1234"

    .line 47
    const-string v2, "Test"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;-><init>(Ljava/lang/String;Lcom/stripe/android/uicore/elements/SimpleTextFieldController;ZLjava/lang/String;Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;Ljava/lang/String;)V

    .line 46
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    .line 63
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 64
    new-instance v2, Lcom/stripe/android/model/ConsumerSessionLookup;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/model/ConsumerSessionLookup;-><init>(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 63
    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    .line 70
    sget-object v2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    .line 45
    new-instance v3, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    .line 46
    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 70
    move-object v7, v2

    check-cast v7, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 63
    move-object v8, v1

    check-cast v8, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v11, 0x60

    const/4 v12, 0x0

    .line 45
    const-string v5, "test@test.com"

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private final instantDebits()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 13

    .line 102
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 103
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    .line 105
    sget-object v2, Lcom/stripe/android/uicore/elements/EmailConfig;->Companion:Lcom/stripe/android/uicore/elements/EmailConfig$Companion;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v5, v3, v4, v5}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;->createController$default(Lcom/stripe/android/uicore/elements/EmailConfig$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v3

    .line 108
    sget-object v4, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    const/16 v10, 0x1c

    const/4 v11, 0x0

    const-string v5, ""

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v6

    .line 113
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;->linkLoginPane()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;

    move-result-object v8

    .line 114
    const-string v9, "fcsess_1234"

    .line 103
    const-string v2, "Test"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x1

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;-><init>(Ljava/lang/String;Lcom/stripe/android/uicore/elements/SimpleTextFieldController;ZLjava/lang/String;Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;Ljava/lang/String;)V

    .line 102
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    .line 119
    sget-object v1, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    .line 120
    sget-object v2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    .line 101
    new-instance v3, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    .line 102
    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 120
    move-object v7, v2

    check-cast v7, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 119
    move-object v8, v1

    check-cast v8, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    .line 101
    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private final invalidEmail()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 13

    .line 74
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 75
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    .line 77
    sget-object v2, Lcom/stripe/android/uicore/elements/EmailConfig;->Companion:Lcom/stripe/android/uicore/elements/EmailConfig$Companion;

    const/4 v3, 0x2

    const/4 v4, 0x0

    const-string v5, "invalid_email.com"

    const/4 v6, 0x0

    invoke-static {v2, v5, v6, v3, v4}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;->createController$default(Lcom/stripe/android/uicore/elements/EmailConfig$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v3

    .line 80
    sget-object v4, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    const/16 v10, 0x1c

    const/4 v11, 0x0

    const-string v5, ""

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v6

    .line 85
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;->networkingLinkSignupPane()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;

    move-result-object v8

    .line 86
    const-string v9, "fcsess_1234"

    .line 75
    const-string v2, "Test"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;-><init>(Ljava/lang/String;Lcom/stripe/android/uicore/elements/SimpleTextFieldController;ZLjava/lang/String;Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;Ljava/lang/String;)V

    .line 74
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    .line 91
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 92
    new-instance v2, Lcom/stripe/android/model/ConsumerSessionLookup;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/model/ConsumerSessionLookup;-><init>(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 91
    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    .line 98
    sget-object v2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    .line 73
    new-instance v3, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    .line 74
    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 98
    move-object v7, v2

    check-cast v7, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 91
    move-object v8, v1

    check-cast v8, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v11, 0x60

    const/4 v12, 0x0

    .line 73
    const-string v5, "test@test.com"

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private final linkLoginPane()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;
    .locals 5

    .line 141
    new-instance v0, Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    .line 144
    const-string v1, "By using Link, you authorize debits under these Terms."

    .line 145
    const-string v2, "Continue with Link"

    .line 141
    const-string v3, "Sign up or log in"

    const-string v4, "Connect your account to RandomBusiness using Link."

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/financialconnections/model/LinkLoginPane;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModelKt;->toContent(Lcom/stripe/android/financialconnections/model/LinkLoginPane;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;

    move-result-object v0

    return-object v0
.end method

.method private final networkingLinkSignupPane()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;
    .locals 10

    .line 126
    new-instance v2, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    const/4 v0, 0x2

    .line 128
    new-array v0, v0, [Lcom/stripe/android/financialconnections/model/Bullet;

    new-instance v3, Lcom/stripe/android/financialconnections/model/Bullet;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "Connect your account faster everywhere Link is accepted."

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    aput-object v3, v0, v1

    .line 131
    new-instance v4, Lcom/stripe/android/financialconnections/model/Bullet;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v6, 0x0

    const-string v7, "Link encrypts your data and never shares your login details."

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x1

    aput-object v4, v0, v1

    .line 127
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 126
    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;-><init>(Ljava/util/List;)V

    .line 124
    new-instance v0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    const/16 v7, 0x20

    const/4 v8, 0x0

    const-string v1, "Save account with Link"

    const-string v3, "By saving your account to Link, you agree to Link\u2019s Terms and Privacy Policy"

    const-string v4, "Save with Link"

    const-string v5, "Not now"

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 139
    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModelKt;->toContent(Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getValues()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method
