.class public final Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;
.super Ljava/lang/Object;
.source "UpdatePaymentMethodUI.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUpdatePaymentMethodUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatePaymentMethodUI.kt\ncom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,399:1\n77#2:400\n86#3:401\n83#3,6:402\n89#3:436\n93#3:447\n86#3:453\n83#3,6:454\n89#3:488\n93#3:493\n79#4,6:408\n86#4,4:423\n90#4,2:433\n94#4:446\n79#4,6:460\n86#4,4:475\n90#4,2:485\n94#4:492\n368#5,9:414\n377#5:435\n378#5,2:444\n368#5,9:466\n377#5:487\n378#5,2:490\n4034#6,6:427\n4034#6,6:479\n1225#7,6:437\n1225#7,6:495\n1225#7,6:501\n1225#7,6:507\n1225#7,6:513\n1225#7,6:519\n1225#7,6:525\n1225#7,6:531\n1225#7,6:537\n1225#7,6:543\n1225#7,6:549\n1225#7,6:555\n149#8:443\n149#8:448\n149#8:449\n149#8:450\n149#8:451\n149#8:452\n149#8:489\n149#8:494\n81#9:561\n81#9:562\n81#9:563\n*S KotlinDebug\n*F\n+ 1 UpdatePaymentMethodUI.kt\ncom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt\n*L\n47#1:400\n53#1:401\n53#1:402,6\n53#1:436\n53#1:447\n233#1:453\n233#1:454,6\n233#1:488\n233#1:493\n53#1:408,6\n53#1:423,4\n53#1:433,2\n53#1:446\n233#1:460,6\n233#1:475,4\n233#1:485,2\n233#1:492\n53#1:414,9\n53#1:435\n53#1:444,2\n233#1:466,9\n233#1:487\n233#1:490,2\n53#1:427,6\n233#1:479,6\n105#1:437,6\n285#1:495,6\n294#1:501,6\n295#1:507,6\n302#1:513,6\n307#1:519,6\n310#1:525,6\n337#1:531,6\n338#1:537,6\n339#1:543,6\n341#1:549,6\n344#1:555,6\n117#1:443\n141#1:448\n159#1:449\n171#1:450\n177#1:451\n179#1:452\n246#1:489\n264#1:494\n49#1:561\n276#1:562\n295#1:563\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003\u00a2\u0006\u0002\u0010\u000c\u001a1\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0011H\u0003\u00a2\u0006\u0002\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010\u0014\u001a5\u0010\u0015\u001a\u00020\u00012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0003\u00a2\u0006\u0002\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u00012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0003\u00a2\u0006\u0002\u0010\u001f\u001a9\u0010\u0015\u001a\u00020\u00012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0003\u00a2\u0006\u0002\u0010\"\u001a\'\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u0003\u00a2\u0006\u0002\u0010&\u001a\u0015\u0010\'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010\u0014\u001a\u0015\u0010(\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010\u0014\u001a\r\u0010)\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010*\u001a\u0016\u0010+\u001a\u0004\u0018\u00010,*\u00020-2\u0006\u0010.\u001a\u00020\tH\u0002\"\u000e\u0010/\u001a\u00020\u0017X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0017X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0010\u00101\u001a\u00020\u00178\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u0010\u00102\u001a\u00020\u00178\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\u0017X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u0017X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0017X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0017X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0017X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0010\u00108\u001a\u00020\u00178\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u0010\u00109\u001a\u00020\u00178\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\u00a8\u0006:\u00b2\u0006\n\u0010;\u001a\u00020<X\u008a\u0084\u0002\u00b2\u0006\n\u0010;\u001a\u00020<X\u008a\u0084\u0002\u00b2\u0006\n\u0010=\u001a\u00020>X\u008a\u0084\u0002"
    }
    d2 = {
        "UpdatePaymentMethodUI",
        "",
        "interactor",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
        "DetailsCannotBeChangedText",
        "shouldShowCardBrandDropdown",
        "",
        "context",
        "Landroid/content/Context;",
        "(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ZLandroid/content/Context;Landroidx/compose/runtime/Composer;I)V",
        "SetAsDefaultPaymentMethodCheckbox",
        "isChecked",
        "isEnabled",
        "onCheckChanged",
        "Lkotlin/Function1;",
        "(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "UpdatePaymentMethodButtons",
        "(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/runtime/Composer;I)V",
        "BankAccountUI",
        "name",
        "",
        "email",
        "bankName",
        "last4",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "SepaDebitUI",
        "sepaDebit",
        "Lcom/stripe/android/model/PaymentMethod$SepaDebit;",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Landroidx/compose/runtime/Composer;I)V",
        "bankAccountFieldLabel",
        "bankAccountFieldText",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
        "BankAccountTextField",
        "value",
        "label",
        "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "UpdatePaymentMethodUi",
        "DeletePaymentMethodUi",
        "PreviewUpdatePaymentMethodUI",
        "(Landroidx/compose/runtime/Composer;I)V",
        "getDetailsCannotBeChangedText",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "canUpdateCardBrand",
        "UPDATE_PM_EXPIRY_FIELD_TEST_TAG",
        "UPDATE_PM_CVC_FIELD_TEST_TAG",
        "UPDATE_PM_REMOVE_BUTTON_TEST_TAG",
        "UPDATE_PM_SAVE_BUTTON_TEST_TAG",
        "UPDATE_PM_ERROR_MESSAGE_TEST_TAG",
        "UPDATE_PM_US_BANK_ACCOUNT_TEST_TAG",
        "UPDATE_PM_SEPA_DEBIT_TEST_TAG",
        "UPDATE_PM_CARD_TEST_TAG",
        "UPDATE_PM_DETAILS_SUBTITLE_TEST_TAG",
        "UPDATE_PM_SCREEN_TEST_TAG",
        "UPDATE_PM_SET_AS_DEFAULT_CHECKBOX_TEST_TAG",
        "paymentsheet_release",
        "state",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;",
        "status",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final UPDATE_PM_CARD_TEST_TAG:Ljava/lang/String; = "update_payment_method_card_ui"

.field public static final UPDATE_PM_CVC_FIELD_TEST_TAG:Ljava/lang/String; = "update_payment_method_cvc"

.field public static final UPDATE_PM_DETAILS_SUBTITLE_TEST_TAG:Ljava/lang/String; = "update_payment_method_subtitle"

.field public static final UPDATE_PM_ERROR_MESSAGE_TEST_TAG:Ljava/lang/String; = "update_payment_method_error_message"

.field public static final UPDATE_PM_EXPIRY_FIELD_TEST_TAG:Ljava/lang/String; = "update_payment_method_expiry_date"

.field public static final UPDATE_PM_REMOVE_BUTTON_TEST_TAG:Ljava/lang/String; = "update_payment_method_remove_button"

.field public static final UPDATE_PM_SAVE_BUTTON_TEST_TAG:Ljava/lang/String; = "update_payment_method_save_button"

.field public static final UPDATE_PM_SCREEN_TEST_TAG:Ljava/lang/String; = "update_payment_method_screen"

.field public static final UPDATE_PM_SEPA_DEBIT_TEST_TAG:Ljava/lang/String; = "update_payment_method_sepa_debit_ui"

.field public static final UPDATE_PM_SET_AS_DEFAULT_CHECKBOX_TEST_TAG:Ljava/lang/String; = "update_payment_method_set_as_default_checkbox"

.field public static final UPDATE_PM_US_BANK_ACCOUNT_TEST_TAG:Ljava/lang/String; = "update_payment_method_bank_account_ui"


# direct methods
.method public static synthetic $r8$lambda$0xcm7wH7VAXS_kQXQUwJQFPAarE(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUI$lambda$4$lambda$2$lambda$1(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$5tjByWGEd0P3BvsD0jUFMnSd1xc(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountTextField$lambda$14(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$7plPXNbXYCdGbTVB49m_lwFreA4(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ZLandroid/content/Context;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DetailsCannotBeChangedText$lambda$7(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ZLandroid/content/Context;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$GXDllLGLfbV6GvHYlntZhcAlxjI(Landroidx/compose/runtime/MutableState;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DeletePaymentMethodUi$lambda$27$lambda$26(Landroidx/compose/runtime/MutableState;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$GslkdkWSDsJGyjv1L_DP2Mx65gU(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountUI$lambda$13(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$P9BexwnNkWHxB5zJvLg3eHgwBBA(ZZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->SetAsDefaultPaymentMethodCheckbox$lambda$8(ZZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$QYyOUh134RC9Car4FxYo8tEvmkg(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DeletePaymentMethodUi$lambda$29$lambda$28(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$So8KMvqr2CBAb1n3bNpAbcXHdVo(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$SepaDebit;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->SepaDebitUI$lambda$11(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$SepaDebit;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$TWblQX4yiCwWNWksf05VU3dLH6g(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUi$lambda$18(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$TYPZ25XGmUDeZQQNix2nGHUz9jw()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->PreviewUpdatePaymentMethodUI$lambda$37$lambda$36()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$VD8Oo0GHFe59_yoa7OY8wtDWU2M()Landroidx/compose/runtime/MutableState;
    .locals 1

    invoke-static {}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DeletePaymentMethodUi$lambda$20$lambda$19()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$Xsl0ydpXGgDA2thAWCYi2wbXX_I(Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->PreviewUpdatePaymentMethodUI$lambda$35$lambda$34(Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$YShHT58i31w0PU_ovlHJOyJQNAY(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUi$lambda$17$lambda$16(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$d7YC5sOYpmmMqRACQw8F-wxLS5g(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodButtons$lambda$9(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$e8wZnp6cdmsVwkGp8Zy6jlmiLWA(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUI$lambda$5(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$e9kHf0sCH5PKQew8NtLILvD8DjI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountUI$lambda$10(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$qQCJbKV7gM7FlNPc7Y6f0CdL14s(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->PreviewUpdatePaymentMethodUI$lambda$38(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$qklZXVEXx5RwqNJbTRyjEtyChIU(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DeletePaymentMethodUi$lambda$22$lambda$21(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$uke6C3mpJ9vDZtoM9GnarEJ895Y(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DeletePaymentMethodUi$lambda$30(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$xAXIKgD5goaaAabYpnpCzD9nElU(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DeletePaymentMethodUi$lambda$25$lambda$24(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final BankAccountTextField(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const v0, 0x3c02b075

    move-object/from16 v3, p3

    .line 261
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v14

    and-int/lit8 v3, p5, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_5

    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v3, v7

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v6, p2

    :goto_6
    and-int/lit16 v7, v3, 0x93

    const/16 v8, 0x92

    if-ne v7, v8, :cond_a

    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_7

    .line 272
    :cond_9
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v6

    goto :goto_9

    :cond_a
    :goto_7
    if-eqz v5, :cond_b

    .line 260
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v5, Landroidx/compose/ui/Modifier;

    goto :goto_8

    :cond_b
    move-object v5, v6

    :goto_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v6

    if-eqz v6, :cond_c

    const/4 v6, -0x1

    const-string v7, "com.stripe.android.paymentsheet.ui.BankAccountTextField (UpdatePaymentMethodUI.kt:260)"

    .line 261
    invoke-static {v0, v3, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 263
    :cond_c
    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v6, Landroidx/compose/material/MaterialTheme;->$stable:I

    or-int/lit8 v6, v6, 0x30

    const/4 v7, 0x0

    invoke-static {v0, v7, v14, v6}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStroke(Landroidx/compose/material/MaterialTheme;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;

    move-result-object v11

    int-to-float v0, v7

    .line 494
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v12

    .line 266
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$BankAccountTextField$1;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$BankAccountTextField$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0x36

    const v7, -0x2eaf5428

    const/4 v8, 0x1

    invoke-static {v7, v8, v0, v14, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lkotlin/jvm/functions/Function2;

    shr-int/lit8 v0, v3, 0x6

    and-int/lit8 v0, v0, 0xe

    const/high16 v3, 0x1b0000

    or-int v15, v0, v3

    const/16 v16, 0xe

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    .line 262
    invoke-static/range {v5 .. v16}, Landroidx/compose/material/CardKt;->Card-F-jzlyU(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_d
    move-object v3, v5

    .line 272
    :goto_9
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda14;

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda14;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_e
    return-void
.end method

.method private static final BankAccountTextField$lambda$14(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountTextField(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final BankAccountUI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const v0, 0x65b8bd1b

    .line 193
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v6

    and-int/lit8 p4, p5, 0x6

    const/4 v1, 0x4

    if-nez p4, :cond_1

    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    move p4, v1

    goto :goto_0

    :cond_0
    const/4 p4, 0x2

    :goto_0
    or-int/2addr p4, p5

    goto :goto_1

    :cond_1
    move p4, p5

    :goto_1
    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_3

    invoke-interface {v6, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr p4, v2

    :cond_3
    and-int/lit16 v2, p5, 0x180

    if-nez v2, :cond_5

    invoke-interface {v6, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr p4, v2

    :cond_5
    and-int/lit16 v2, p5, 0xc00

    if-nez v2, :cond_7

    invoke-interface {v6, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr p4, v2

    :cond_7
    and-int/lit16 v2, p4, 0x493

    const/16 v3, 0x492

    if-ne v2, v3, :cond_9

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_5

    .line 205
    :cond_8
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v2, p1

    move-object p1, p0

    goto :goto_6

    .line 193
    :cond_9
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.ui.BankAccountUI (UpdatePaymentMethodUI.kt:192)"

    invoke-static {v0, p4, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 198
    :cond_a
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bank_account_info:I

    .line 200
    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    .line 197
    invoke-static {v0, v2, v3, v1, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    const/4 v1, 0x0

    .line 201
    invoke-static {v0, v6, v1}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    .line 202
    sget v0, Lcom/stripe/android/R$string;->stripe_title_bank_account:I

    invoke-static {v0, v6, v1}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    .line 203
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const-string v1, "update_payment_method_bank_account_ui"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    and-int/lit8 v0, p4, 0xe

    or-int/lit16 v0, v0, 0x6000

    and-int/lit8 p4, p4, 0x70

    or-int v7, v0, p4

    move-object v1, p0

    move-object v2, p1

    .line 194
    invoke-static/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountUI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object p1, v1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 205
    :cond_b
    :goto_6
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda15;

    move-object p4, p3

    move-object p3, p2

    move-object p2, v2

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda15;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v0, p0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_c
    return-void
.end method

.method private static final BankAccountUI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p4

    move/from16 v8, p6

    const v1, 0x7aed2768

    move-object/from16 v2, p5

    .line 232
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v3

    and-int/lit8 v2, v8, 0x6

    if-nez v2, :cond_1

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v8

    goto :goto_1

    :cond_1
    move v2, v8

    :goto_1
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_3

    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v8, 0x180

    move-object/from16 v10, p2

    if-nez v4, :cond_5

    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v2, v4

    :cond_5
    and-int/lit16 v4, v8, 0xc00

    move-object/from16 v9, p3

    if-nez v4, :cond_7

    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v2, v4

    :cond_7
    and-int/lit16 v4, v8, 0x6000

    if-nez v4, :cond_9

    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x4000

    goto :goto_5

    :cond_8
    const/16 v4, 0x2000

    :goto_5
    or-int/2addr v2, v4

    :cond_9
    move v11, v2

    and-int/lit16 v2, v11, 0x2493

    const/16 v4, 0x2492

    if-ne v2, v4, :cond_b

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_6

    .line 254
    :cond_a
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_8

    .line 232
    :cond_b
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.paymentsheet.ui.BankAccountUI (UpdatePaymentMethodUI.kt:231)"

    invoke-static {v1, v11, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_c
    const v1, -0x1cd0f17e

    .line 233
    const-string v2, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    .line 453
    invoke-static {v3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 454
    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v1

    .line 455
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v2

    const/4 v12, 0x0

    .line 458
    invoke-static {v1, v2, v3, v12}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v1

    const v2, -0x4ee9b9da

    .line 459
    const-string v4, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 460
    invoke-static {v3, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 461
    invoke-static {v3, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v2

    .line 462
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v4

    .line 463
    invoke-static {v3, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 465
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    const v14, -0x2942ffcf

    .line 464
    const-string v15, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 466
    invoke-static {v3, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 467
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v14

    instance-of v14, v14, Landroidx/compose/runtime/Applier;

    if-nez v14, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 468
    :cond_d
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 469
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v14

    if-eqz v14, :cond_e

    .line 470
    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_7

    .line 472
    :cond_e
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 474
    :goto_7
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v13

    .line 475
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v13, v1, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 476
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v13, v4, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 478
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 480
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v4

    if-nez v4, :cond_f

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v4, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    .line 481
    :cond_f
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 482
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v13, v2, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 485
    :cond_10
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v13, v5, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v1, -0x16ef5699

    .line 487
    const-string v2, "C88@4444L9:Column.kt#2w3rfo"

    .line 488
    invoke-static {v3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    check-cast v1, Landroidx/compose/foundation/layout/ColumnScope;

    const v1, -0x7c1afd3b

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-eqz v0, :cond_11

    .line 239
    sget v1, Lcom/stripe/android/core/R$string;->stripe_address_label_full_name:I

    invoke-static {v1, v3, v12}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    and-int/lit8 v4, v11, 0xe

    const/4 v5, 0x4

    const/4 v2, 0x0

    .line 237
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountTextField(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :cond_11
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v0, -0x7c1ae0d0

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-eqz v6, :cond_12

    .line 245
    sget v0, Lcom/stripe/android/uicore/R$string;->stripe_email:I

    invoke-static {v0, v3, v12}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    .line 246
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v2, 0x8

    int-to-float v2, v2

    .line 489
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v12, 0x0

    .line 246
    invoke-static {v0, v12, v2, v4, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    shr-int/lit8 v0, v11, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v4, v0, 0x180

    const/4 v5, 0x0

    move-object v0, v6

    .line 243
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountTextField(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :cond_12
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    shr-int/lit8 v0, v11, 0x9

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v1, v11, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int v13, v0, v1

    const/4 v14, 0x4

    const/4 v11, 0x0

    move-object v12, v3

    .line 249
    invoke-static/range {v9 .. v14}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountTextField(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 488
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 490
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 466
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 460
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 453
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 493
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 254
    :cond_13
    :goto_8
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v9

    if-eqz v9, :cond_14

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda16;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object v5, v7

    move v6, v8

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda16;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;I)V

    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_14
    return-void
.end method

.method private static final BankAccountUI$lambda$10(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountUI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final BankAccountUI$lambda$13(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountUI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final DeletePaymentMethodUi(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    const v0, -0x14433acf

    .line 293
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    and-int/lit8 p1, p2, 0x6

    const/4 v10, 0x4

    const/4 v1, 0x2

    if-nez p1, :cond_2

    and-int/lit8 p1, p2, 0x8

    if-nez p1, :cond_0

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_1

    move p1, v10

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    or-int/2addr p1, p2

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    and-int/lit8 v2, p1, 0x3

    if-ne v2, v1, :cond_4

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    .line 314
    :cond_3
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_7

    .line 293
    :cond_4
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.DeletePaymentMethodUi (UpdatePaymentMethodUI.kt:292)"

    invoke-static {v0, p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5
    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const v2, 0x1e894b31

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 501
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 502
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_6

    .line 503
    new-instance v2, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda18;

    invoke-direct {v2}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda18;-><init>()V

    .line 504
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 294
    :cond_6
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v6, 0xc00

    const/4 v7, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroidx/compose/runtime/MutableState;

    .line 295
    invoke-interface {p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    const v2, 0x1e8954a5

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 507
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 508
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_7

    .line 509
    new-instance v2, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda19;

    invoke-direct {v2}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda19;-><init>()V

    .line 510
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 295
    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v12, 0x1

    invoke-static {v1, v2, v5, v0, v12}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v1

    .line 298
    sget v2, Lcom/stripe/android/R$string;->stripe_remove:I

    invoke-static {v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    .line 299
    sget-object v3, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v4, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v3, v5, v4}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/material/Colors;->getError-0d7_KjU()J

    move-result-wide v3

    .line 300
    invoke-static {v1}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DeletePaymentMethodUi$lambda$23(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    move-result-object v6

    sget-object v7, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;->Idle:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    if-ne v6, v7, :cond_8

    move-object v6, v1

    move-object v1, v2

    move-wide v2, v3

    move v4, v12

    goto :goto_4

    :cond_8
    move-object v6, v1

    move-object v1, v2

    move-wide v2, v3

    move v4, v0

    .line 301
    :goto_4
    invoke-static {v6}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DeletePaymentMethodUi$lambda$23(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    move-result-object v6

    sget-object v7, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;->Removing:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    move-object v8, v5

    if-ne v6, v7, :cond_9

    move v5, v12

    goto :goto_5

    :cond_9
    move v5, v0

    :goto_5
    const v6, 0x1e897cb8

    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    .line 513
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_a

    .line 514
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_b

    .line 302
    :cond_a
    new-instance v7, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda1;

    invoke-direct {v7, v11}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda1;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 516
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 302
    :cond_b
    move-object v6, v7

    check-cast v6, Lkotlin/jvm/functions/Function0;

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 303
    const-string v7, "update_payment_method_remove_button"

    const/high16 v9, 0x30000

    .line 297
    invoke-static/range {v1 .. v9}, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt;->RemoveButton-8V94_ZQ(Lcom/stripe/android/core/strings/ResolvableString;JZZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v8

    .line 306
    invoke-interface {v11}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_12

    .line 307
    invoke-interface {p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v1

    const v2, 0x1e899b33

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v3, p1, 0xe

    if-eq v3, v10, :cond_d

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_c

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_6

    :cond_c
    move v12, v0

    :cond_d
    :goto_6
    or-int p1, v2, v12

    .line 519
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez p1, :cond_e

    .line 520
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p1

    if-ne v2, p1, :cond_f

    .line 307
    :cond_e
    new-instance v2, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda2;

    invoke-direct {v2, v11, p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda2;-><init>(Landroidx/compose/runtime/MutableState;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;)V

    .line 522
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 307
    :cond_f
    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const p1, 0x1e89b0ed

    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    .line 525
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez p1, :cond_10

    .line 526
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p1

    if-ne v3, p1, :cond_11

    .line 310
    :cond_10
    new-instance v3, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda3;

    invoke-direct {v3, v11}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda3;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 528
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 310
    :cond_11
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 307
    invoke-static {v1, v2, v3, v5, v0}, Lcom/stripe/android/paymentsheet/ui/RemovePaymentMethodDialogUIKt;->RemovePaymentMethodDialogUI(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    :cond_12
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_13

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 314
    :cond_13
    :goto_7
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p1

    if-eqz p1, :cond_14

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda4;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;I)V

    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_14
    return-void
.end method

.method private static final DeletePaymentMethodUi$lambda$20$lambda$19()Landroidx/compose/runtime/MutableState;
    .locals 3

    const/4 v0, 0x0

    .line 294
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    return-object v0
.end method

.method private static final DeletePaymentMethodUi$lambda$22$lambda$21(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->getStatus()Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    move-result-object p0

    return-object p0
.end method

.method private static final DeletePaymentMethodUi$lambda$23(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;"
        }
    .end annotation

    .line 563
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    return-object p0
.end method

.method private static final DeletePaymentMethodUi$lambda$25$lambda$24(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x1

    .line 302
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final DeletePaymentMethodUi$lambda$27$lambda$26(Landroidx/compose/runtime/MutableState;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x0

    .line 308
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 309
    sget-object p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$RemovePaymentMethod;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$RemovePaymentMethod;

    check-cast p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;

    invoke-interface {p1, p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->handleViewAction(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;)V

    .line 310
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final DeletePaymentMethodUi$lambda$29$lambda$28(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x0

    .line 311
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 312
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final DeletePaymentMethodUi$lambda$30(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DeletePaymentMethodUi(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final DetailsCannotBeChangedText(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ZLandroid/content/Context;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const v4, 0x6b887c55    # 3.300021E26f

    move-object/from16 v5, p3

    .line 131
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    and-int/lit8 v6, v3, 0x6

    if-nez v6, :cond_2

    and-int/lit8 v6, v3, 0x8

    if-nez v6, :cond_0

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_0

    :cond_0
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    :goto_0
    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_1

    :cond_1
    const/4 v6, 0x2

    :goto_1
    or-int/2addr v6, v3

    goto :goto_2

    :cond_2
    move v6, v3

    :goto_2
    and-int/lit8 v7, v3, 0x30

    if-nez v7, :cond_4

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_4
    and-int/lit16 v7, v3, 0x180

    if-nez v7, :cond_6

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_6
    and-int/lit16 v7, v6, 0x93

    const/16 v8, 0x92

    if-ne v7, v8, :cond_8

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_5

    .line 145
    :cond_7
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v26, v5

    goto/16 :goto_8

    .line 131
    :cond_8
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_9

    const/4 v7, -0x1

    const-string v8, "com.stripe.android.paymentsheet.ui.DetailsCannotBeChangedText (UpdatePaymentMethodUI.kt:130)"

    invoke-static {v4, v6, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 132
    :cond_9
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v4

    if-eqz v1, :cond_a

    .line 133
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getHasValidBrandChoices()Z

    move-result v6

    if-eqz v6, :cond_a

    const/4 v6, 0x1

    goto :goto_6

    :cond_a
    const/4 v6, 0x0

    .line 132
    :goto_6
    invoke-static {v4, v6}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->getDetailsCannotBeChangedText(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Z)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v4

    if-eqz v4, :cond_b

    .line 136
    invoke-interface {v4, v2}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 137
    sget-object v6, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v7, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v6, v5, v7}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/material/Typography;->getSubtitle2()Landroidx/compose/ui/text/TextStyle;

    move-result-object v25

    .line 138
    sget-object v6, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v7, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-static {v6, v5, v7}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v7

    .line 139
    sget-object v6, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v12

    .line 140
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v13, v6

    check-cast v13, Landroidx/compose/ui/Modifier;

    const/16 v6, 0x8

    int-to-float v6, v6

    .line 448
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v15

    const/16 v18, 0xd

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 141
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 142
    const-string v9, "update_payment_method_subtitle"

    invoke-static {v6, v9}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v28, 0x0

    const v29, 0xffd8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const v27, 0x30030

    move-object/from16 v26, v5

    move-object v5, v4

    .line 135
    invoke-static/range {v5 .. v29}, Landroidx/compose/material/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    goto :goto_7

    :cond_b
    move-object/from16 v26, v5

    .line 134
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 145
    :cond_c
    :goto_8
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v4

    if-eqz v4, :cond_d

    new-instance v5, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda10;

    invoke-direct {v5, v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda10;-><init>(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ZLandroid/content/Context;I)V

    invoke-interface {v4, v5}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_d
    return-void
.end method

.method private static final DetailsCannotBeChangedText$lambda$7(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ZLandroid/content/Context;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DetailsCannotBeChangedText(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ZLandroid/content/Context;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final PreviewUpdatePaymentMethodUI(Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move/from16 v0, p1

    const v1, 0x42671c70

    move-object/from16 v2, p0

    .line 318
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v2

    if-nez v0, :cond_1

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 348
    :cond_0
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_1

    .line 318
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.paymentsheet.ui.PreviewUpdatePaymentMethodUI (UpdatePaymentMethodUI.kt:317)"

    invoke-static {v1, v0, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 319
    :cond_2
    sget-object v5, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->Companion:Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod$Companion;

    .line 320
    const-string v1, "4242"

    invoke-static {v1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v6

    .line 321
    new-instance v7, Lcom/stripe/android/model/PaymentMethod;

    .line 325
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v11, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    .line 326
    sget-object v12, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 327
    new-instance v15, Lcom/stripe/android/model/PaymentMethod$Card;

    sget-object v14, Lcom/stripe/android/model/CardBrand;->Visa:Lcom/stripe/android/model/CardBrand;

    const/16 v26, 0xffe

    const/16 v27, 0x0

    move-object v13, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v13 .. v27}, Lcom/stripe/android/model/PaymentMethod$Card;-><init>(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$Card$Checks;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;Lcom/stripe/android/model/wallets/Wallet;Lcom/stripe/android/model/PaymentMethod$Card$Networks;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v29, 0x1fff60

    const/16 v30, 0x0

    .line 321
    const-string v8, "002"

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v7 .. v30}, Lcom/stripe/android/model/PaymentMethod;-><init>(Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;Lcom/stripe/android/model/PaymentMethod$USBankAccount;Lcom/stripe/android/model/LinkPaymentDetails;ZLcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 319
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod$Companion;->create$default(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod$Companion;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/model/PaymentMethod;ZZILjava/lang/Object;)Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v15

    .line 336
    sget-object v17, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;->Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    .line 340
    sget-object v1, Lcom/stripe/android/DefaultCardBrandFilter;->INSTANCE:Lcom/stripe/android/DefaultCardBrandFilter;

    move-object/from16 v16, v1

    check-cast v16, Lcom/stripe/android/CardBrandFilter;

    const v1, 0x14437e4a

    .line 342
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 531
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 532
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    if-ne v1, v3, :cond_3

    .line 337
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1;

    invoke-direct {v1, v4}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 534
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 337
    :cond_3
    move-object/from16 v21, v1

    check-cast v21, Lkotlin/jvm/functions/Function2;

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v1, 0x144384f7

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 537
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 538
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_4

    .line 338
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1;

    invoke-direct {v1, v4}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function3;

    .line 540
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 338
    :cond_4
    move-object/from16 v22, v1

    check-cast v22, Lkotlin/jvm/functions/Function3;

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v1, 0x1443917f

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 543
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 544
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_5

    .line 339
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1;

    invoke-direct {v1, v4}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 546
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 339
    :cond_5
    move-object/from16 v23, v1

    check-cast v23, Lkotlin/jvm/functions/Function2;

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v1, 0x1443a084

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 549
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 550
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_6

    .line 551
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda0;-><init>()V

    .line 552
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 341
    :cond_6
    move-object/from16 v24, v1

    check-cast v24, Lkotlin/jvm/functions/Function1;

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v1, 0x1443b0a4

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 555
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 556
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_7

    .line 557
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda11;

    invoke-direct {v1}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda11;-><init>()V

    .line 558
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 344
    :cond_7
    move-object/from16 v25, v1

    check-cast v25, Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 331
    new-instance v12, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v26, 0x0

    const/16 v27, 0x2000

    const/16 v28, 0x0

    invoke-direct/range {v12 .. v28}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;-><init>(ZZLcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v12, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    .line 346
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    const/16 v3, 0x30

    .line 330
    invoke-static {v12, v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUI(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 348
    :cond_8
    :goto_1
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v2, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda12;

    invoke-direct {v2, v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda12;-><init>(I)V

    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_9
    return-void
.end method

.method private static final PreviewUpdatePaymentMethodUI$lambda$35$lambda$34(Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final PreviewUpdatePaymentMethodUI$lambda$37$lambda$36()Lkotlin/Unit;
    .locals 1

    .line 344
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final PreviewUpdatePaymentMethodUI$lambda$38(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->PreviewUpdatePaymentMethodUI(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final SepaDebitUI(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const v0, 0x78bdf430

    .line 212
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v6

    and-int/lit8 p3, p4, 0x6

    const/4 v1, 0x4

    if-nez p3, :cond_1

    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, p4

    goto :goto_1

    :cond_1
    move p3, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {v6, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr p3, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_6

    and-int/lit16 v2, p4, 0x200

    if-nez v2, :cond_4

    invoke-interface {v6, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_3

    :cond_4
    invoke-interface {v6, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    :goto_3
    if-eqz v2, :cond_5

    const/16 v2, 0x100

    goto :goto_4

    :cond_5
    const/16 v2, 0x80

    :goto_4
    or-int/2addr p3, v2

    :cond_6
    and-int/lit16 v2, p3, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_8

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_5

    .line 223
    :cond_7
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v1, p0

    move-object v2, p1

    goto :goto_6

    .line 212
    :cond_8
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.ui.SepaDebitUI (UpdatePaymentMethodUI.kt:211)"

    invoke-static {v0, p3, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 217
    :cond_9
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bank_account_last_4:I

    .line 218
    iget-object v2, p2, Lcom/stripe/android/model/PaymentMethod$SepaDebit;->last4:Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    .line 216
    invoke-static {v0, v2, v3, v1, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    const/4 v1, 0x0

    .line 219
    invoke-static {v0, v6, v1}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    .line 220
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_iban:I

    invoke-static {v0, v6, v1}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    .line 221
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const-string v1, "update_payment_method_sepa_debit_ui"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    and-int/lit8 v0, p3, 0xe

    or-int/lit16 v0, v0, 0x6000

    and-int/lit8 p3, p3, 0x70

    or-int v7, v0, p3

    move-object v1, p0

    move-object v2, p1

    .line 213
    invoke-static/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountUI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 223
    :cond_a
    :goto_6
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_b

    new-instance p1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda9;

    invoke-direct {p1, v1, v2, p2, p4}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda9;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$SepaDebit;I)V

    invoke-interface {p0, p1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_b
    return-void
.end method

.method private static final SepaDebitUI$lambda$11(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$SepaDebit;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->SepaDebitUI(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final SetAsDefaultPaymentMethodCheckbox(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v2, p0

    move/from16 v4, p1

    move-object/from16 v5, p2

    move/from16 v9, p4

    const v0, 0x27c83478

    move-object/from16 v1, p3

    .line 152
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v6

    and-int/lit8 v1, v9, 0x6

    if-nez v1, :cond_1

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_3

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v9, 0x180

    if-nez v3, :cond_5

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    and-int/lit16 v3, v1, 0x93

    const/16 v7, 0x92

    if-ne v3, v7, :cond_7

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    .line 162
    :cond_6
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_5

    .line 152
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, -0x1

    const-string v7, "com.stripe.android.paymentsheet.ui.SetAsDefaultPaymentMethodCheckbox (UpdatePaymentMethodUI.kt:151)"

    invoke-static {v0, v1, v3, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 157
    :cond_8
    sget v0, Lcom/stripe/android/ui/core/R$string;->stripe_set_as_default_payment_method:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v0, v6, v3}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    .line 158
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v10, v0

    check-cast v10, Landroidx/compose/ui/Modifier;

    const/16 v0, 0xc

    int-to-float v0, v0

    .line 449
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v12

    const/16 v15, 0xd

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 159
    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 160
    const-string v7, "update_payment_method_set_as_default_checkbox"

    invoke-static {v0, v7}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    shl-int/lit8 v7, v1, 0x6

    and-int/lit16 v7, v7, 0x380

    or-int/lit8 v7, v7, 0x6

    shl-int/lit8 v1, v1, 0x9

    const v8, 0xe000

    and-int/2addr v8, v1

    or-int/2addr v7, v8

    const/high16 v8, 0x70000

    and-int/2addr v1, v8

    or-int/2addr v7, v1

    const/4 v8, 0x2

    const/4 v1, 0x0

    .line 153
    invoke-static/range {v0 .. v8}, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt;->CheckboxElementUI(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 162
    :cond_9
    :goto_5
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda17;

    invoke-direct {v1, v2, v4, v5, v9}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda17;-><init>(ZZLkotlin/jvm/functions/Function1;I)V

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_a
    return-void
.end method

.method private static final SetAsDefaultPaymentMethodCheckbox$lambda$8(ZZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->SetAsDefaultPaymentMethodCheckbox(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final UpdatePaymentMethodButtons(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/runtime/Composer;I)V
    .locals 5

    const v0, 0x4b7c4860    # 1.65336E7f

    .line 167
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_2

    and-int/lit8 v1, p2, 0x8

    if-nez v1, :cond_0

    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    or-int/2addr v1, p2

    goto :goto_2

    :cond_2
    move v1, p2

    :goto_2
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_4

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    .line 185
    :cond_3
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_5

    .line 167
    :cond_4
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.ui.UpdatePaymentMethodButtons (UpdatePaymentMethodUI.kt:166)"

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 168
    :cond_5
    invoke-interface {p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getShouldShowSaveButton()Z

    move-result v0

    const v2, -0x684be9b5

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/16 v2, 0x20

    if-eqz v0, :cond_6

    .line 171
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    int-to-float v4, v2

    .line 450
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 171
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->requiredHeight-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v3, p1, v4}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    and-int/lit8 v3, v1, 0xe

    .line 172
    invoke-static {p0, p1, v3}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUi(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/runtime/Composer;I)V

    :cond_6
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 175
    invoke-interface {p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getCanRemove()Z

    move-result v3

    if-eqz v3, :cond_8

    if-eqz v0, :cond_7

    const/16 v0, 0x10

    int-to-float v0, v0

    .line 451
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    goto :goto_4

    :cond_7
    int-to-float v0, v2

    .line 452
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 182
    :goto_4
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/SizeKt;->requiredHeight-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, p1, v2}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    and-int/lit8 v0, v1, 0xe

    .line 183
    invoke-static {p0, p1, v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DeletePaymentMethodUi(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/runtime/Composer;I)V

    :cond_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 185
    :cond_9
    :goto_5
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda13;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda13;-><init>(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;I)V

    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_a
    return-void
.end method

.method private static final UpdatePaymentMethodButtons$lambda$9(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodButtons(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final UpdatePaymentMethodUI(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "interactor"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "modifier"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0xde5e750

    move-object/from16 v4, p2

    .line 46
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_2

    and-int/lit8 v4, v2, 0x8

    if-nez v4, :cond_0

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v4, v2

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_4

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_4
    move v11, v4

    and-int/lit8 v4, v11, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_6

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_4

    .line 124
    :cond_5
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_11

    .line 46
    :cond_6
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_7

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUI (UpdatePaymentMethodUI.kt:45)"

    invoke-static {v3, v11, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 47
    :cond_7
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    check-cast v3, Landroidx/compose/runtime/CompositionLocal;

    const v4, 0x789c5f52

    const-string v5, "CC:CompositionLocal.kt#9igjgp"

    .line 400
    invoke-static {v8, v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 47
    check-cast v3, Landroid/content/Context;

    .line 48
    sget-object v4, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    invoke-static {v4}, Lcom/stripe/android/uicore/StripeThemeKt;->getOuterFormInsets(Lcom/stripe/android/uicore/StripeTheme;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v4

    .line 49
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-static {v5, v6, v8, v12, v13}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v14

    .line 50
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->isModifiablePaymentMethod()Z

    move-result v5

    if-eqz v5, :cond_8

    .line 51
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->canChangeCbc()Z

    move-result v5

    if-eqz v5, :cond_8

    move v15, v13

    goto :goto_5

    :cond_8
    move v15, v12

    .line 55
    :goto_5
    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/PaddingKt;->padding(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 56
    const-string v5, "update_payment_method_screen"

    invoke-static {v4, v5}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v5, -0x1cd0f17e

    .line 53
    const-string v7, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    .line 401
    invoke-static {v8, v5, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 402
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v5

    .line 403
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v7

    .line 406
    invoke-static {v5, v7, v8, v12}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v5

    const v7, -0x4ee9b9da

    .line 407
    const-string v9, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 408
    invoke-static {v8, v7, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 409
    invoke-static {v8, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v7

    .line 410
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v9

    .line 411
    invoke-static {v8, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 413
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    const v13, -0x2942ffcf

    .line 412
    const-string v10, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 414
    invoke-static {v8, v13, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 415
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v10

    instance-of v10, v10, Landroidx/compose/runtime/Applier;

    if-nez v10, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 416
    :cond_9
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 417
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v10

    if-eqz v10, :cond_a

    .line 418
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_6

    .line 420
    :cond_a
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 422
    :goto_6
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .line 423
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v6, v5, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 424
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v6, v9, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 426
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    .line 428
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v9

    if-nez v9, :cond_b

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    .line 429
    :cond_b
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 430
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 433
    :cond_c
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v6, v4, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v4, -0x16ef5699

    .line 435
    const-string v5, "C88@4444L9:Column.kt#2w3rfo"

    .line 436
    invoke-static {v8, v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v4, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    check-cast v4, Landroidx/compose/foundation/layout/ColumnScope;

    .line 58
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/SavedPaymentMethod;

    move-result-object v4

    .line 59
    instance-of v5, v4, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;

    if-eqz v5, :cond_d

    const v4, -0x44042791

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 61
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getEditCardDetailsInteractor()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    move-result-object v4

    .line 60
    invoke-static {v4, v8, v12}, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt;->CardDetailsEditUI(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;Landroidx/compose/runtime/Composer;I)V

    .line 59
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_c

    .line 64
    :cond_d
    instance-of v5, v4, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;

    if-eqz v5, :cond_10

    const v5, -0x4400e7e5

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 65
    check-cast v4, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;->getPaymentDetails()Lcom/stripe/android/model/LinkPaymentDetails;

    move-result-object v5

    .line 66
    instance-of v6, v5, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    if-eqz v6, :cond_e

    const v5, -0x43ff4d82

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 70
    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;->getPaymentDetails()Lcom/stripe/android/model/LinkPaymentDetails;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    invoke-virtual {v5}, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;->getBankName()Ljava/lang/String;

    move-result-object v6

    .line 71
    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;->getPaymentDetails()Lcom/stripe/android/model/LinkPaymentDetails;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    invoke-virtual {v4}, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;->getLast4()Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0x36

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 67
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountUI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 66
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_7

    .line 74
    :cond_e
    instance-of v4, v5, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    if-eqz v4, :cond_f

    const v4, -0x43f996d1

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 76
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getEditCardDetailsInteractor()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    move-result-object v4

    .line 75
    invoke-static {v4, v8, v12}, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt;->CardDetailsEditUI(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;Landroidx/compose/runtime/Composer;I)V

    .line 74
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 64
    :goto_7
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_c

    :cond_f
    const v0, 0x482102e7

    .line 65
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 81
    :cond_10
    instance-of v5, v4, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$SepaDebit;

    if-eqz v5, :cond_13

    const v5, 0x48215ed7

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 82
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v5

    iget-object v5, v5, Lcom/stripe/android/model/PaymentMethod;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    if-eqz v5, :cond_11

    iget-object v5, v5, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->name:Ljava/lang/String;

    goto :goto_8

    :cond_11
    const/4 v5, 0x0

    .line 83
    :goto_8
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v6

    iget-object v6, v6, Lcom/stripe/android/model/PaymentMethod;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    if-eqz v6, :cond_12

    iget-object v6, v6, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->email:Ljava/lang/String;

    goto :goto_9

    :cond_12
    const/4 v6, 0x0

    .line 84
    :goto_9
    check-cast v4, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$SepaDebit;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$SepaDebit;->getSepaDebit()Lcom/stripe/android/model/PaymentMethod$SepaDebit;

    move-result-object v4

    sget v7, Lcom/stripe/android/model/PaymentMethod$SepaDebit;->$stable:I

    shl-int/lit8 v7, v7, 0x6

    .line 81
    invoke-static {v5, v6, v4, v8, v7}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->SepaDebitUI(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_c

    .line 86
    :cond_13
    instance-of v5, v4, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$USBankAccount;

    if-eqz v5, :cond_16

    const v5, 0x48218965

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 87
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v5

    iget-object v5, v5, Lcom/stripe/android/model/PaymentMethod;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    if-eqz v5, :cond_14

    iget-object v5, v5, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->name:Ljava/lang/String;

    goto :goto_a

    :cond_14
    const/4 v5, 0x0

    .line 88
    :goto_a
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v6

    iget-object v6, v6, Lcom/stripe/android/model/PaymentMethod;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    if-eqz v6, :cond_15

    iget-object v6, v6, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->email:Ljava/lang/String;

    goto :goto_b

    :cond_15
    const/4 v6, 0x0

    .line 89
    :goto_b
    check-cast v4, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$USBankAccount;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$USBankAccount;->getUsBankAccount()Lcom/stripe/android/model/PaymentMethod$USBankAccount;

    move-result-object v7

    iget-object v7, v7, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->bankName:Ljava/lang/String;

    .line 90
    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$USBankAccount;->getUsBankAccount()Lcom/stripe/android/model/PaymentMethod$USBankAccount;

    move-result-object v4

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->last4:Ljava/lang/String;

    const/4 v9, 0x0

    move-object/from16 v20, v7

    move-object v7, v4

    move-object v4, v5

    move-object v5, v6

    move-object/from16 v6, v20

    .line 86
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->BankAccountUI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_c

    .line 92
    :cond_16
    sget-object v5, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Unexpected;->INSTANCE:Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Unexpected;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_22

    const v4, -0x43ea53d9

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 95
    :goto_c
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->isExpiredCard()Z

    move-result v4

    if-nez v4, :cond_18

    .line 96
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->isModifiablePaymentMethod()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getCanUpdateFullPaymentMethodDetails()Z

    move-result v4

    if-nez v4, :cond_18

    :cond_17
    const/4 v4, 0x1

    goto :goto_d

    :cond_18
    move v4, v12

    :goto_d
    const v5, 0x4821d641

    .line 95
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-eqz v4, :cond_19

    and-int/lit8 v4, v11, 0xe

    .line 98
    invoke-static {v0, v15, v3, v8, v4}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->DetailsCannotBeChangedText(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ZLandroid/content/Context;Landroidx/compose/runtime/Composer;I)V

    :cond_19
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v4, 0x4821e9f0    # 165799.75f

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 101
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getShouldShowSetAsDefaultCheckbox()Z

    move-result v4

    if-eqz v4, :cond_1e

    .line 103
    invoke-static {v14}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUI$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->getSetAsDefaultCheckboxChecked()Z

    move-result v4

    .line 104
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getSetAsDefaultCheckboxEnabled()Z

    move-result v5

    const v6, 0x48220954

    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit8 v6, v11, 0xe

    const/4 v7, 0x4

    if-eq v6, v7, :cond_1b

    and-int/lit8 v6, v11, 0x8

    if-eqz v6, :cond_1a

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1a

    goto :goto_e

    :cond_1a
    move v13, v12

    goto :goto_f

    :cond_1b
    :goto_e
    const/4 v13, 0x1

    .line 437
    :goto_f
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v13, :cond_1c

    .line 438
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_1d

    .line 105
    :cond_1c
    new-instance v6, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda7;

    invoke-direct {v6, v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda7;-><init>(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;)V

    .line 440
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 105
    :cond_1d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 102
    invoke-static {v4, v5, v6, v8, v12}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->SetAsDefaultPaymentMethodCheckbox(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :cond_1e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 113
    invoke-static {v14}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUI$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->getError()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v4

    const v5, 0x48222aaa

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-nez v4, :cond_1f

    goto :goto_10

    .line 115
    :cond_1f
    invoke-interface {v4, v3}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 116
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v13, v4

    check-cast v13, Landroidx/compose/ui/Modifier;

    const/16 v4, 0xc

    int-to-float v4, v4

    .line 443
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v15

    const/16 v18, 0xd

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 117
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 118
    const-string v5, "update_payment_method_error_message"

    invoke-static {v4, v5}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v5, 0x30

    .line 114
    invoke-static {v3, v4, v8, v5, v12}, Lcom/stripe/android/paymentsheet/ui/ErrorMessageKt;->ErrorMessage(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 113
    :goto_10
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    and-int/lit8 v3, v11, 0xe

    .line 122
    invoke-static {v0, v8, v3}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodButtons(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/runtime/Composer;I)V

    .line 436
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 444
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 414
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 408
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 401
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 447
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 124
    :cond_20
    :goto_11
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v3

    if-eqz v3, :cond_21

    new-instance v4, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda8;

    invoke-direct {v4, v0, v1, v2}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda8;-><init>(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/ui/Modifier;I)V

    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_21
    return-void

    :cond_22
    const v0, 0x4820db9c

    .line 58
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final UpdatePaymentMethodUI$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;"
        }
    .end annotation

    .line 561
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    return-object p0
.end method

.method private static final UpdatePaymentMethodUI$lambda$4$lambda$2$lambda$1(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Z)Lkotlin/Unit;
    .locals 1

    .line 107
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SetAsDefaultCheckboxChanged;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SetAsDefaultCheckboxChanged;-><init>(Z)V

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;

    .line 106
    invoke-interface {p0, v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->handleViewAction(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;)V

    .line 109
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final UpdatePaymentMethodUI$lambda$5(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUI(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final UpdatePaymentMethodUi(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const v0, 0x63295853

    .line 275
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v7

    and-int/lit8 p1, p2, 0x6

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-nez p1, :cond_2

    and-int/lit8 p1, p2, 0x8

    if-nez p1, :cond_0

    invoke-interface {v7, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {v7, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    or-int/2addr p1, p2

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    and-int/lit8 v3, p1, 0x3

    if-ne v3, v2, :cond_4

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    .line 290
    :cond_3
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_5

    .line 275
    :cond_4
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUi (UpdatePaymentMethodUI.kt:274)"

    invoke-static {v0, p1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 276
    :cond_5
    invoke-interface {p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v7, v3, v4}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 278
    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUi$lambda$15(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->getStatus()Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    move-result-object v2

    sget-object v5, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;->Updating:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    if-ne v2, v5, :cond_6

    move v5, v4

    goto :goto_4

    :cond_6
    move v5, v3

    .line 279
    :goto_4
    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUi$lambda$15(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->isSaveButtonEnabled()Z

    .line 282
    sget v2, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_save:I

    invoke-static {v2, v7, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    .line 284
    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUi$lambda$15(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->isSaveButtonEnabled()Z

    move-result v0

    .line 286
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v6, Landroidx/compose/ui/Modifier;

    .line 287
    const-string v8, "update_payment_method_save_button"

    invoke-static {v6, v8}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 288
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "isLoading="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Lcom/stripe/android/paymentsheet/utils/TestMetadataKt;->testMetadata(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v8, -0x2fbbb5cb

    .line 284
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit8 v8, p1, 0xe

    if-eq v8, v1, :cond_7

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_8

    invoke-interface {v7, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    :cond_7
    move v3, v4

    .line 495
    :cond_8
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p1

    if-nez v3, :cond_9

    .line 496
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_a

    .line 285
    :cond_9
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda5;

    invoke-direct {p1, p0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda5;-><init>(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;)V

    .line 498
    invoke-interface {v7, p1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 285
    :cond_a
    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v8, 0x0

    const/16 v9, 0x20

    move-object v4, v6

    const/4 v6, 0x0

    move-object v1, v2

    move v2, v0

    .line 281
    invoke-static/range {v1 .. v9}, Lcom/stripe/android/common/ui/PrimaryButtonKt;->PrimaryButton(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 290
    :cond_b
    :goto_5
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda6;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda6;-><init>(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;I)V

    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_c
    return-void
.end method

.method private static final UpdatePaymentMethodUi$lambda$15(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;"
        }
    .end annotation

    .line 562
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    return-object p0
.end method

.method private static final UpdatePaymentMethodUi$lambda$17$lambda$16(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;)Lkotlin/Unit;
    .locals 1

    .line 285
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SaveButtonPressed;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SaveButtonPressed;

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;

    invoke-interface {p0, v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->handleViewAction(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final UpdatePaymentMethodUi$lambda$18(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->UpdatePaymentMethodUi(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final getDetailsCannotBeChangedText(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Z)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 3

    .line 354
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/SavedPaymentMethod;

    move-result-object v0

    .line 355
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    .line 357
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_only_card_brand_can_be_changed:I

    goto :goto_0

    .line 359
    :cond_0
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_card_details_cannot_be_changed:I

    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_2

    .line 361
    :cond_1
    instance-of p1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;

    if-eqz p1, :cond_4

    .line 362
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/SavedPaymentMethod;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;->getPaymentDetails()Lcom/stripe/android/model/LinkPaymentDetails;

    move-result-object p0

    .line 363
    instance-of p1, p0, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    if-eqz p1, :cond_2

    .line 364
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bank_account_details_cannot_be_changed:I

    goto :goto_1

    .line 366
    :cond_2
    instance-of p0, p0, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    if-eqz p0, :cond_3

    .line 367
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_card_details_cannot_be_changed:I

    .line 362
    :goto_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_2

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 371
    :cond_4
    instance-of p0, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$USBankAccount;

    if-eqz p0, :cond_5

    .line 372
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_bank_account_details_cannot_be_changed:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_2

    .line 373
    :cond_5
    instance-of p0, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$SepaDebit;

    if-eqz p0, :cond_6

    .line 374
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_sepa_debit_details_cannot_be_changed:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_2

    .line 375
    :cond_6
    sget-object p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Unexpected;->INSTANCE:Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Unexpected;

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    move-object p0, v2

    :goto_2
    if-eqz p0, :cond_7

    .line 354
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    .line 377
    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    :cond_7
    return-object v2

    .line 354
    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
