.class final synthetic Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$4;
.super Lkotlin/jvm/internal/PropertyReference1Impl;
.source "PartnerAuthViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->handleErrors()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$4;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$4;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$4;

    return-void
.end method

.method constructor <init>()V
    .locals 4

    const-class v0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    const-string v1, "getAuthenticationStatus()Lcom/stripe/android/financialconnections/presentation/Async;"

    const/4 v2, 0x0

    const-string v3, "authenticationStatus"

    invoke-direct {p0, v0, v3, v1, v2}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 217
    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->getAuthenticationStatus()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    return-object p1
.end method
