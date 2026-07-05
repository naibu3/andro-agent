.class public final synthetic Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/core/strings/ResolvableString;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:J

.field public final synthetic f$3:Z

.field public final synthetic f$4:Z

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;JZZI)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;->f$0:Lcom/stripe/android/core/strings/ResolvableString;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;->f$1:Ljava/lang/String;

    iput-wide p3, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;->f$2:J

    iput-boolean p5, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;->f$3:Z

    iput-boolean p6, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;->f$4:Z

    iput p7, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;->f$5:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;->f$0:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;->f$1:Ljava/lang/String;

    iget-wide v2, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;->f$2:J

    iget-boolean v4, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;->f$3:Z

    iget-boolean v5, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;->f$4:Z

    iget v6, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$$ExternalSyntheticLambda9;->f$5:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->$r8$lambda$IeeTGv8CWPW8w8YL5IfcdU4Rc6o(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;JZZILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
