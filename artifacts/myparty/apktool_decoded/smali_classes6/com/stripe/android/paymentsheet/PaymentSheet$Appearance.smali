.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Appearance"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0002QRBw\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0018B;\u0008\u0016\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0016\u0010\u0019BO\u0008\u0016\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0016\u0010\u001aJ\u000e\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u000201J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0006H\u00c6\u0003J\t\u00105\u001a\u00020\u0008H\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\u000e\u00107\u001a\u00020\u000cH\u00c0\u0003\u00a2\u0006\u0002\u00088J\u000e\u00109\u001a\u00020\u000eH\u00c0\u0003\u00a2\u0006\u0002\u0008:J\u000e\u0010;\u001a\u00020\u0010H\u00c0\u0003\u00a2\u0006\u0002\u0008<J\u000e\u0010=\u001a\u00020\u000eH\u00c0\u0003\u00a2\u0006\u0002\u0008>J\u000e\u0010?\u001a\u00020\u0013H\u00c0\u0003\u00a2\u0006\u0002\u0008@J\u000e\u0010A\u001a\u00020\u0015H\u00c0\u0003\u00a2\u0006\u0002\u0008BJw\u0010C\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001J\u0006\u0010D\u001a\u00020EJ\u0013\u0010F\u001a\u0002012\u0008\u0010G\u001a\u0004\u0018\u00010HH\u00d6\u0003J\t\u0010I\u001a\u00020EH\u00d6\u0001J\t\u0010J\u001a\u00020KH\u00d6\u0001J\u0016\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020ER\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0014\u0010\u000b\u001a\u00020\u000cX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0014\u0010\u0011\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\'R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.\u00a8\u0006S"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
        "Landroid/os/Parcelable;",
        "colorsLight",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;",
        "colorsDark",
        "shapes",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;",
        "typography",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;",
        "primaryButton",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;",
        "embeddedAppearance",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;",
        "formInsetValues",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;",
        "sectionSpacing",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;",
        "textFieldInsets",
        "iconStyle",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;",
        "verticalModeRowPadding",
        "",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;F)V",
        "()V",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)V",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;)V",
        "getColorsLight",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;",
        "getColorsDark",
        "getShapes",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;",
        "getTypography",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;",
        "getPrimaryButton",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;",
        "getEmbeddedAppearance$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;",
        "getFormInsetValues$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;",
        "getSectionSpacing$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;",
        "getTextFieldInsets$paymentsheet_release",
        "getIconStyle$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;",
        "getVerticalModeRowPadding$paymentsheet_release",
        "()F",
        "getColors",
        "isDark",
        "",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component6$paymentsheet_release",
        "component7",
        "component7$paymentsheet_release",
        "component8",
        "component8$paymentsheet_release",
        "component9",
        "component9$paymentsheet_release",
        "component10",
        "component10$paymentsheet_release",
        "component11",
        "component11$paymentsheet_release",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Embedded",
        "Builder",
        "paymentsheet_release"
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

.field private final colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

.field private final embeddedAppearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

.field private final formInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

.field private final iconStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

.field private final primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

.field private final sectionSpacing:Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;

.field private final shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

.field private final textFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

.field private final typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

.field private final verticalModeRowPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1279
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;->getDefaultLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v2

    .line 1280
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;->getDefaultDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v3

    .line 1281
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    move-result-object v4

    .line 1282
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    move-result-object v5

    .line 1283
    new-instance v6, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, p0

    .line 1278
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)V
    .locals 11

    const-string v0, "colorsLight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shapes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typography"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1298
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    move-result-object v7

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 1292
    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 1287
    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;->getDefaultLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object p1

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    .line 1288
    sget-object p2, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;->getDefaultDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object p2

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    .line 1289
    sget-object p3, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    move-result-object p3

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    .line 1290
    sget-object p4, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;

    invoke-virtual {p4}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    move-result-object p4

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 1291
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p7, v0

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_4
    move-object p7, p5

    move-object p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 1286
    :goto_0
    invoke-direct/range {p2 .. p7}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;)V
    .locals 15

    const-string v0, "colorsLight"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shapes"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typography"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedAppearance"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formInsetValues"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1318
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing$Companion;->getDefaultSectionSpacing()Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;

    move-result-object v9

    const/16 v13, 0x700

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v1, p0

    .line 1310
    invoke-direct/range {v1 .. v14}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    .line 1303
    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;->getDefaultLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object p1

    :cond_0
    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_1

    .line 1304
    sget-object p2, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;->getDefaultDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object p2

    :cond_1
    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_2

    .line 1305
    sget-object p3, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    move-result-object p3

    :cond_2
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_3

    .line 1306
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object v0, p4

    :goto_0
    and-int/lit8 v1, p8, 0x10

    if-eqz v1, :cond_4

    .line 1307
    new-instance v2, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    move-object v2, p5

    :goto_1
    and-int/lit8 v1, p8, 0x20

    if-eqz v1, :cond_5

    .line 1308
    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    move-result-object v1

    goto :goto_2

    :cond_5
    move-object v1, p6

    :goto_2
    and-int/lit8 v3, p8, 0x40

    if-eqz v3, :cond_6

    .line 1309
    sget-object v3, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Companion;->getDefaultFormInsetValues$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    move-result-object v3

    move-object/from16 p9, v3

    goto :goto_3

    :cond_6
    move-object/from16 p9, p7

    :goto_3
    move-object p4, p2

    move-object p5, p3

    move-object p6, v0

    move-object/from16 p8, v1

    move-object/from16 p7, v2

    move-object p2, p0

    move-object p3, p1

    .line 1301
    invoke-direct/range {p2 .. p9}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;F)V
    .locals 1

    const-string v0, "colorsLight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shapes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typography"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedAppearance"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formInsetValues"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sectionSpacing"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textFieldInsets"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconStyle"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1221
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1227
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    .line 1232
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    .line 1237
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    .line 1242
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    .line 1247
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    .line 1252
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->embeddedAppearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    .line 1257
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->formInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    .line 1264
    iput-object p8, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->sectionSpacing:Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;

    .line 1269
    iput-object p9, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->textFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    .line 1274
    iput-object p10, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->iconStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    .line 1276
    iput p11, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->verticalModeRowPadding:F

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 1227
    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;->getDefaultLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object p1

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 1232
    sget-object p2, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;->getDefaultDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object p2

    :cond_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    .line 1237
    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    move-result-object v1

    goto :goto_0

    :cond_2
    move-object v1, p3

    :goto_0
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_3

    .line 1242
    sget-object v2, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, p4

    :goto_1
    and-int/lit8 v3, v0, 0x10

    if-eqz v3, :cond_4

    .line 1247
    new-instance v4, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_4
    move-object/from16 v4, p5

    :goto_2
    and-int/lit8 v3, v0, 0x20

    if-eqz v3, :cond_5

    .line 1252
    sget-object v3, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    move-result-object v3

    goto :goto_3

    :cond_5
    move-object/from16 v3, p6

    :goto_3
    and-int/lit8 v5, v0, 0x40

    if-eqz v5, :cond_6

    .line 1257
    sget-object v5, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Companion;->getDefaultFormInsetValues$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    move-result-object v5

    goto :goto_4

    :cond_6
    move-object/from16 v5, p7

    :goto_4
    and-int/lit16 v6, v0, 0x80

    if-eqz v6, :cond_7

    .line 1264
    sget-object v6, Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing$Companion;->getDefaultSectionSpacing()Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;

    move-result-object v6

    goto :goto_5

    :cond_7
    move-object/from16 v6, p8

    :goto_5
    and-int/lit16 v7, v0, 0x100

    if-eqz v7, :cond_8

    .line 1269
    sget-object v7, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Companion;

    invoke-virtual {v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Companion;->getDefaultTextFieldInsets$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    move-result-object v7

    goto :goto_6

    :cond_8
    move-object/from16 v7, p9

    :goto_6
    and-int/lit16 v8, v0, 0x200

    if-eqz v8, :cond_9

    .line 1274
    sget-object v8, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle$Companion;

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    move-result-object v8

    goto :goto_7

    :cond_9
    move-object/from16 v8, p10

    :goto_7
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    .line 1276
    sget-object v0, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getVerticalModeRowPadding()F

    move-result v0

    move/from16 p13, v0

    goto :goto_8

    :cond_a
    move/from16 p13, p11

    :goto_8
    move-object p3, p1

    move-object p4, p2

    move-object/from16 p5, v1

    move-object/from16 p6, v2

    move-object/from16 p8, v3

    move-object/from16 p7, v4

    move-object/from16 p9, v5

    move-object/from16 p10, v6

    move-object/from16 p11, v7

    move-object/from16 p12, v8

    move-object p2, p0

    .line 1221
    invoke-direct/range {p2 .. p13}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;F)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;FILjava/lang/Object;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->embeddedAppearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->formInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->sectionSpacing:Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->textFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->iconStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget p11, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->verticalModeRowPadding:F

    :cond_a
    move-object p12, p10

    move p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->copy(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;F)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object v0
.end method

.method public final component10$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->iconStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    return-object v0
.end method

.method public final component11$paymentsheet_release()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->verticalModeRowPadding:F

    return v0
.end method

.method public final component2()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    return-object v0
.end method

.method public final component6$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->embeddedAppearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    return-object v0
.end method

.method public final component7$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->formInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    return-object v0
.end method

.method public final component8$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->sectionSpacing:Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;

    return-object v0
.end method

.method public final component9$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->textFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;F)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;
    .locals 13

    const-string v0, "colorsLight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shapes"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typography"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedAppearance"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formInsetValues"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sectionSpacing"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textFieldInsets"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconStyle"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-object v2, p1

    move-object v3, p2

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;F)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->embeddedAppearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->embeddedAppearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->formInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->formInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->sectionSpacing:Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->sectionSpacing:Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->textFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->textFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->iconStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->iconStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->verticalModeRowPadding:F

    iget p1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->verticalModeRowPadding:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getColors(Z)Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 0

    if-eqz p1, :cond_0

    .line 1322
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object p1
.end method

.method public final getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 1

    .line 1232
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object v0
.end method

.method public final getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;
    .locals 1

    .line 1227
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object v0
.end method

.method public final getEmbeddedAppearance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;
    .locals 1

    .line 1252
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->embeddedAppearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    return-object v0
.end method

.method public final getFormInsetValues$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;
    .locals 1

    .line 1257
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->formInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    return-object v0
.end method

.method public final getIconStyle$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;
    .locals 1

    .line 1274
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->iconStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    return-object v0
.end method

.method public final getPrimaryButton()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;
    .locals 1

    .line 1247
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    return-object v0
.end method

.method public final getSectionSpacing$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;
    .locals 1

    .line 1264
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->sectionSpacing:Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;

    return-object v0
.end method

.method public final getShapes()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;
    .locals 1

    .line 1237
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    return-object v0
.end method

.method public final getTextFieldInsets$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;
    .locals 1

    .line 1269
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->textFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    return-object v0
.end method

.method public final getTypography()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;
    .locals 1

    .line 1242
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    return-object v0
.end method

.method public final getVerticalModeRowPadding$paymentsheet_release()F
    .locals 1

    .line 1276
    iget v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->verticalModeRowPadding:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->embeddedAppearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->formInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->sectionSpacing:Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->textFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->iconStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->verticalModeRowPadding:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->embeddedAppearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->formInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    iget-object v7, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->sectionSpacing:Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;

    iget-object v8, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->textFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    iget-object v9, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->iconStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    iget v10, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->verticalModeRowPadding:F

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Appearance(colorsLight="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v11, ", colorsDark="

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shapes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", typography="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", primaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", embeddedAppearance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", formInsetValues="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sectionSpacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", textFieldInsets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", verticalModeRowPadding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->embeddedAppearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->formInsetValues:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->sectionSpacing:Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->textFieldInsets:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->iconStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->verticalModeRowPadding:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method
