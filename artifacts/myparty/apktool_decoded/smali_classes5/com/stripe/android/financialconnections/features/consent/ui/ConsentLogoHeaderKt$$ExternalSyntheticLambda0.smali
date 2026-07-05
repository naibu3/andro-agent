.class public final synthetic Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/Modifier;

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:Z

.field public final synthetic f$3:I

.field public final synthetic f$4:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;ZII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$$ExternalSyntheticLambda0;->f$1:Ljava/util/List;

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$$ExternalSyntheticLambda0;->f$2:Z

    iput p4, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$$ExternalSyntheticLambda0;->f$3:I

    iput p5, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$$ExternalSyntheticLambda0;->f$4:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$$ExternalSyntheticLambda0;->f$1:Ljava/util/List;

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$$ExternalSyntheticLambda0;->f$2:Z

    iget v3, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$$ExternalSyntheticLambda0;->f$3:I

    iget v4, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$$ExternalSyntheticLambda0;->f$4:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt;->$r8$lambda$JQv4Dy-VOkTI7NY7pqRB2RHVp_0(Landroidx/compose/ui/Modifier;Ljava/util/List;ZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
