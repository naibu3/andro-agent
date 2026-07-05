.class public final synthetic Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:I

.field public final synthetic f$1:Z

.field public final synthetic f$2:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(IZLjava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$$ExternalSyntheticLambda1;->f$0:I

    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$$ExternalSyntheticLambda1;->f$1:Z

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$$ExternalSyntheticLambda1;->f$2:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget v0, p0, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$$ExternalSyntheticLambda1;->f$0:I

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$$ExternalSyntheticLambda1;->f$1:Z

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$$ExternalSyntheticLambda1;->f$2:Ljava/lang/String;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, v2, p1}, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt;->$r8$lambda$prPeiw9LVJHCRFHdM9WI5i0hemg(IZLjava/lang/String;Landroid/content/Context;)Landroid/webkit/WebView;

    move-result-object p1

    return-object p1
.end method
